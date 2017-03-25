package main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {
	static Statement st;
 
	public void destroy() {

	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try{
			ResultSet rs  = st.executeQuery("SELECT *FROM BANK_ADMIN WHERE USER_NAME='"+username+"' AND PASSWORD = '"+password+"'");
			if(rs.next()){
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
		
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingsystem","root","");
			st = con.createStatement();
		}
		catch(Exception e){
			System.out.println("SQLException"+e.getMessage());
		}
	
	}

}

