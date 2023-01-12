package question7;

public class Test {
	 public static void main(String[] args) {
	        User user1 = new User(1,"satish","satish@gmail.com",1000);
	        Wallet.processPaymentByUser(user1, 50);

	        KYCUser user2 = new KYCUser(2,"ganesh","gannesh@gmail.com",1000,10);
	        Wallet.processPaymentByUser(user2, 75);
	    }
}
