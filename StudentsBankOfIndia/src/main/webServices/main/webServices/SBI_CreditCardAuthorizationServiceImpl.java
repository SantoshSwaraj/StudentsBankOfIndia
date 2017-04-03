package main.webServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebService;

@WebService(endpointInterface="main.webServices.SBI_CreditCardAuthorizationService")
public class SBI_CreditCardAuthorizationServiceImpl implements SBI_CreditCardAuthorizationService {
	Statement st;
	@Override
	public boolean CreditCardAuthorization(String name, String accountNo, String cardNumber, String CVV2, int amount) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingsystem","root","");
			st = con.createStatement();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		String sql = "SELECT ACC_BAL FROM ACC_NETBAL WHERE  ACCOUNT_NO = '"+accountNo+"'";
		String acc_bal = null;
		int acc_balInt = 0;
		try {
			ResultSet rs = st.executeQuery(sql);
		
			if(rs.next()){
				acc_bal = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acc_balInt = Integer.parseInt(acc_bal);
		if(amount<acc_balInt){
			try{
				int n = st.executeUpdate("INSERT INTO AUTHORIZED_CREDITCARD(CNAME,ACCOUNT_NO,CC_NUMBER,CVV,AMOUNT)"
									+ "VALUES('"+name+"','"+accountNo+"','"+cardNumber+"','"+CVV2+"',"+amount+")");
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}

}
