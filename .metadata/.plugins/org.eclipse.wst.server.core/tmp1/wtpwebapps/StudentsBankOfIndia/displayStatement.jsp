<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="java.sql.*" %>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bankingsystem","root","");
		Statement stmt = conn.createStatement();
		String accountNo = request.getParameter("accountNo");
		String dateFrom = request.getParameter("dateFrom");
		String dateTo = request.getParameter("dateTo");
		
		String sql = "SELECT *FROM ACCOUNT_TRANSACTION WHERE ACCOUNT_NO = '"+accountNo+"' "
		 		+ "AND TRANS_DATE BETWEEN '"+dateFrom+"' AND '"+dateTo+"'";
		ResultSet rs = stmt.executeQuery(sql);
		response.setContentType("text/html");
	%>
		<table class="table table-striped table-condensed">
            <thead>
                <tr>
                   <th>SNo</th>
                   <th>Transaction_Id</th>
                   <th>Account_No</th>
                   <th>Debit</th>
                   <th>Credit</th>
                   <th>Transaction_Date</th>
                   <th>Description</th>   
                   <th>Status</th>                                       
                  </tr>
              </thead>   
                 <tbody>
                     
		<%
		try{
			while(rs.next()){%>
					<tr>
                       	<td><%=rs.getRow()%></td>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        <td><%=rs.getString(6)%></td>
                        <td><span class="label label-success">Active</span></td>                                       
                     </tr>                              
                  </tbody>
             </table>                                         
			
			<% 
				
			}
			
		}
		catch(Exception e){
			System.out.println("SQLException: "+e.getMessage());
		}
	%>


</body>
</html>