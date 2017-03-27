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

/**
 * Servlet implementation class AccountDepositWithdrawServlet
 */
public class AccountDepositWithdrawServlet extends HttpServlet {
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
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String accountNo = request.getParameter("accountNo");
		String amount = request.getParameter("amount");
		String date = request.getParameter("date");
		String description = request.getParameter("description");
		String deposit = request.getParameter("deposit");
		String withdraw = request.getParameter("withdraw");
		
		System.out.println("Account No :"+accountNo);
		System.out.println("Amount     :"+amount);
		System.out.println("Date       :"+date);
		System.out.println("Description:"+description);
		System.out.println("Deposit    :"+deposit);
		System.out.println("Withdraw   :"+withdraw);
		
		int currAmt = Integer.parseInt(amount);
		
		
		ResultSet rs = null;
		String StrprevAmt = null;
		int prevAmt = 0;
		
		try {
			rs = st.executeQuery("SELECT * FROM ACC_NETBAL WHERE ACCOUNT_NO = '"+accountNo+"'");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next()){
				System.out.println(rs.getRow()+"\t"+rs.getString(1)+"\t"+rs.getString(2));
				StrprevAmt =  rs.getString("ACC_BAL");
				prevAmt = Integer.parseInt(StrprevAmt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int n = 0;
		int m = 0;
		if(deposit!=null){
			currAmt = prevAmt + currAmt;
			try {
				n = st.executeUpdate("UPDATE ACC_NETBAL SET ACC_BAL = "+currAmt+" WHERE ACCOUNT_NO = '"+accountNo+"'");
				
				m = st.executeUpdate("INSERT INTO ACCOUNT_TRANSACTION(ACCOUNT_NO,CREDIT,TRANS_DATE,DESCRIPTION)"
						+ " VALUES('"+accountNo+"','"+amount+"','"+date+"','"+description+"')");

			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else if(withdraw!=null){
			currAmt = prevAmt - currAmt;
			try{
				 n = st.executeUpdate("UPDATE ACC_NETBAL SET ACC_BAL = "+currAmt+" WHERE ACCOUNT_NO = '"+accountNo+"'");
				 
				 m = st.executeUpdate("INSERT INTO ACCOUNT_TRANSACTION(ACCOUNT_NO,DEBIT,TRANS_DATE,DESCRIPTION)"
						+ " VALUES('"+accountNo+"','"+amount+"','"+date+"','"+description+"')");
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		if(n>0 && m>0)
			out.println("<h3>Transaction Updated Successfully.</h3>");
		else
		out.println("<h3>Transaction Rollbacked Successfully.</h3>");
		RequestDispatcher rd = request.getRequestDispatcher("mainMenuDisplay.jsp");
		rd.include(request, response);
	
	}
}
