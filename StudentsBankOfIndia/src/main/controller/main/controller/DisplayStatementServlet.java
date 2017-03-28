package main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayStatementServlet extends HttpServlet {
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
		 PrintWriter out = response.getWriter();
		 String accountNo = request.getParameter("accountNo");
		 String dateFrom = request.getParameter("dateFrom");
		 String dateTo = request.getParameter("dateTo");
		 
		 String sql = "SELECT *FROM ACCOUNT_TRANSACTION WHERE ACCOUNT_NO = '"+accountNo+"' "
		 		+ "AND TRANS_DATE BETWEEN '"+dateFrom+"' AND '"+dateTo+"'";
		 
		 try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getRow()+"\t"+rs.getString(1)+"\t"+rs.getString(2)
				+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
				out.print(rs.getRow()+" "+ rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
				+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
	}

}
