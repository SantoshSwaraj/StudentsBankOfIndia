package main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Statement st;
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingsystem","root","");
			st = con.createStatement();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		try{
			ResultSet rs  = st.executeQuery("SELECT *FROM BANK_ADMIN WHERE USER_NAME='"+username+"' AND PASSWORD = '"+password+"'");
			if(rs.next()){
				Cookie uid = new Cookie("uid", username);
				Cookie pwd = new Cookie("pwd", password);
				
				uid.setMaxAge(60*60*24*30);
				pwd.setMaxAge(60*60*24*30);
				
				response.addCookie(uid);
				response.addCookie(pwd);
				
				HttpSession session = request.getSession();
				session.setAttribute("username",username);

				RequestDispatcher  rd = request.getRequestDispatcher("mainMenuDisplay.jsp");
				rd.forward(request,response);
			}
			else{
				response.setContentType("text/html");
				out.println("<h3>Invalid username or Password.</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.include(request,response);
			}
		}
		catch(Exception e){
			System.out.println("SQLException "+e.getMessage());
		}		
	}
}
