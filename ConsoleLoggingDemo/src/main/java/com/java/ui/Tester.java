package java.com.java.ui;

import java.com.ava.service.UserAuthentication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Tester {
	private static final Log LOGGER = LogFactory.getLog(Tester.class);
	public static void main(String[] args) {
		try {
			UserAuthentication authentication = new UserAuthentication();
			authentication.loginUser("Jon", "Asdf@123");
			LOGGER .info("User has logged in successfully");
		} catch(Exception exception) {
			LOGGER .info(exception.getMessage());
		}
	}
}
