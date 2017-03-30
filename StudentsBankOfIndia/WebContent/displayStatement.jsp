<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

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
	String displayStmt = request.getParameter("displayStmt");
	
	System.out.println("AccountNo:"+accountNo);
	System.out.println("DateFrom:"+dateFrom);
	System.out.println("DateTo:"+dateTo);
	System.out.println("DisplayStmt:"+displayStmt);
	
	String sql = "SELECT *FROM ACCOUNT_TRANSACTION WHERE ACCOUNT_NO = '"+accountNo+"' "
	 		+ "AND TRANS_DATE BETWEEN '"+dateFrom+"' AND '"+dateTo+"'";
	
	ResultSet rs = stmt.executeQuery(sql);
	/*while(rs.next()){
		System.out.println(rs.getRow()+" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)
		+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
	}*/
	response.setContentType("text/html");

%>
	<div clas="container-fluid">
		<div class="row">
      		<div class="span5">
                 <table class="table table-striped table-condensed">
                  <thead>
                    <tr>
                    <th>SNo</th>
                    <th>TRANS_ID</th>
                    <th>ACCOUNT_NO</th>
                    <th>DEBIT</th>
                    <th>CREDIT</th>
                    <th>TRANS_DATE</th>
                    <th>DESCRIPTION</th>   
                    <th>STATUS</th>                                       
                    </tr>
                  </thead>   
                  <tbody>
                  <%!
                  	int count = 1;
                  %>
                  
                  <%	
                  		 
                  		while(rs.next()){	
				   %>
					<tr>
                       	<td><%=count%></td>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        <td><%=rs.getString(6)%></td>
                        <td><span class="label label-success">Active</span></td>                                       
                     </tr>
                     <% count++; }%>                              
                  </tbody>
             </table>                                         
     	 </div>
      </div>   
      <div class="row">
      <div class="col-md-4">
      	<a href="mainMenuDisplay.jsp"><button id="mainMenu" name="mainMenu" class="btn btn-primary">Main Menu</button></a>
       </div>
      </div>                                                                  
</div>
</body>
</html>