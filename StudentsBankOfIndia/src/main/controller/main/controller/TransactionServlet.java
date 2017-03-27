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

public class TransactionServlet extends HttpServlet {
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
		
		String accountNoFrom = request.getParameter("accountNoFrom");
		String accountNoTo = request.getParameter("accountNoTo");
		String amount = request.getParameter("amount");
		String date = request.getParameter("date");
		String description = request.getParameter("description");
		String debit = request.getParameter("debit");
		String credit = request.getParameter("credit");
		
		System.out.println("accountNoFrom:"+accountNoFrom);
		System.out.println("accountNoTo:"+accountNoTo);
		System.out.println("amount:"+amount);
		System.out.println("date:"+date);
		System.out.println("description:"+description);
		System.out.println("debit:"+debit);
		System.out.println("credit:"+credit);
		
		String accFromAmt = null;
		String accToAmt = null;
		
		ResultSet rs = null;
		try {
			rs = st.executeQuery("SELECT * FROM ACC_NETBAL WHERE ACCOUNT_NO = '"+accountNoFrom+"'");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next()){
				System.out.println(rs.getRow()+"\t"+rs.getString(1)+"\t"+rs.getString(2));
				accFromAmt = rs.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			rs = st.executeQuery("SELECT * FROM ACC_NETBAL WHERE ACCOUNT_NO = '"+accountNoTo+"'");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while(rs.next()){
				System.out.println(rs.getRow()+"\t"+rs.getString(1)+"\t"+rs.getString(2));
				accToAmt = rs.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int accFromAmtInt = Integer.parseInt(accFromAmt);
		int accToAmtInt = Integer.parseInt(accToAmt); 
		int amountInt = Integer.parseInt(amount);
		
		int n = 0;
		int m = 0;
		int p = 0;
		int l = 0;
		
		if(debit!=null){
			accFromAmtInt = accFromAmtInt - amountInt;
			accToAmtInt = accToAmtInt + amountInt;

			try {
				n = st.executeUpdate("UPDATE ACC_NETBAL SET ACC_BAL = "+accFromAmtInt+" WHERE ACCOUNT_NO = '"+accountNoFrom+"'");
				m = st.executeUpdate("UPDATE ACC_NETBAL SET ACC_BAL = "+accToAmtInt+" WHERE ACCOUNT_NO = '"+accountNoTo+"'");
				
				p =	st.executeUpdate("INSERT INTO ACCOUNT_TRANSACTION(ACCOUNT_NO,DEBIT,TRANS_DATE,DESCRIPTION)"
						+ " VALUES("+accountNoFrom+",'"+amount+"','"+date+"','"+description+"')");
				
				l = p =	st.executeUpdate("INSERT INTO ACCOUNT_TRANSACTION(ACCOUNT_NO,CREDIT,TRANS_DATE,DESCRIPTION)"
						+ " VALUES("+accountNoTo+",'"+amount+"','"+date+"','"+description+"')");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
		else if(credit!=null){
			accFromAmtInt = accFromAmtInt + amountInt;
			accToAmtInt = accToAmtInt - amountInt;
			
			try {
				n = st.executeUpdate("UPDATE ACC_NETBAL SET ACC_BAL = "+accFromAmtInt+" WHERE ACCOUNT_NO = '"+accountNoFrom+"'");
				m = st.executeUpdate("UPDATE ACC_NETBAL SET ACC_BAL = "+accToAmtInt+" WHERE ACCOUNT_NO = '"+accountNoTo+"'");
				
				p =	st.executeUpdate("INSERT INTO ACCOUNT_TRANSACTION(ACCOUNT_NO,CREDIT,TRANS_DATE,DESCRIPTION)"
						+ " VALUES("+accountNoFrom+",'"+amount+"','"+date+"','"+description+"')");
				
				l = p =	st.executeUpdate("INSERT INTO ACCOUNT_TRANSACTION(ACCOUNT_NO,DEBIT,TRANS_DATE,DESCRIPTION)"
						+ " VALUES("+accountNoTo+",'"+amount+"','"+date+"','"+description+"')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		if(n>0 && m>0 && p>0)
			out.println("<h3>Transaction Updated Successfully.</h3>");
		else
		out.println("<h3>Transaction Rollbacked Successfully.</h3>");
		RequestDispatcher rd = request.getRequestDispatcher("mainMenuDisplay.jsp");
		rd.include(request, response);
	
	}

}
