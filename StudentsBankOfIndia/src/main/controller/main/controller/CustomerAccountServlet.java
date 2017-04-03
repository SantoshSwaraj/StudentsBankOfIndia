package main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerAccountServlet
 */
public class CustomerAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Statement st;
	static Connection con;
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/bankingsystem","root","");
			con.setAutoCommit(false);
			st = con.createStatement();
			
		} catch (Exception e) {
			System.out.println("Connection to DB failed..");
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 
		 String Cname = request.getParameter("CName");
		 String CDob = request.getParameter("CDob");
		 String CAddrL1 = request.getParameter("CAddrL1");
		 String CAddrL2 = request.getParameter("CAddrL2");
		 String CState = request.getParameter("CState");
		 String CEmail = request.getParameter("CEmail");
		 String CAccNo = request.getParameter("accountNo");
		 String CAccType = request.getParameter("CAccType");
		 
		 String sql1 = "INSERT INTO CUSTOMER_ACCOUNT (CNAME,DOB,ADDR_L1, ADDR_L2,STATE, REG_EMAIL,ACCOUNT_NO,ACC_TYPE)"
		 					+ "VALUES('"+Cname+"','"+CDob+"','"+CAddrL1+"','"+CAddrL2+"','"+CState+"','"+CEmail+"','"+CAccNo+"','"+CAccType+"')";
		 
		 String sql2 = "INSERT INTO ACC_NETBAL(ACCOUNT_NO)VALUES('"+CAccNo+"')";
		 // Adding qureies to batch
		 try{
			 st.addBatch(sql1);
			 st.addBatch(sql2);
			 
			 st.executeBatch();
			 con.commit();
			 out.println("---Processing Completed Successfully.");
		 }
		 catch(Exception bpe){
			 try{
					con.rollback();
					out.println("Batch Proceesing Cancelled.");
					out.println("BatchProcessingExceptionMsg: "+bpe.getMessage());
				}
				catch(Exception rbe){
					out.println("Exception in RollBack():"+rbe.getMessage());
				}
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 
		 RequestDispatcher rd = request.getRequestDispatcher("mainMenuDisplay.jsp");
		 rd.include(request, response);
		 
	}

}
