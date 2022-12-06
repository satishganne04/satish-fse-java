package LoggingDemo;

public class Test {
	public static void main(String[] args) {
		try {
			UserAuthentication authentication = new UserAuthentication();
			authentication.loginUser(null, "12345");
			System.out.println("User has logged in successfully");
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}