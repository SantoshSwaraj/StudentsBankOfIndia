package main.webServices;

import javax.xml.ws.Endpoint;

public class Publisher {
	public static void main(String[] args) {
		SBI_CreditCardAuthorizationServiceImpl obj = new SBI_CreditCardAuthorizationServiceImpl();
		Endpoint.publish("http://localhost:8081/service/SBICC_AuthService", obj);
		System.out.println("Web Service is Ready");
	}
}
