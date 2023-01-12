package question1;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

  

	public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + this.balance);
    }
}



