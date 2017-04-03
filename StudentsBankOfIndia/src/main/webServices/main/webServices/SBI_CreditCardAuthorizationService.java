package main.webServices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SBI_CreditCardAuthorizationService {
	@WebMethod
	public boolean CreditCardAuthorization(String name,String accountNo, String cardNumber, String CVV2, int amount);
}
