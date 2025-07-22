package JavaoopsPackage;

public class Account {

	    private String accountNumber;
	    private double balance;

	    public Account() {
	        this.accountNumber = "";
	        this.balance = 0.0;
	    }

	   
	    public Account(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println(amount + " deposited successfully.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	   
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Invalid withdraw amount or insufficient balance.");
	        }
	    }

	    
	    public double checkBalance() {
	        return balance;
	    }

	    
	    public String getAccountNumber() {
	        return accountNumber;
	    }
    public static void main(String[] args) {
        Account acc1 = new Account(); 
        Account acc2 = new Account("ABC12345", 5000); 
        acc2.deposit(2000);
        acc2.withdraw(1000);
        System.out.println("Current balance: " + acc2.checkBalance());
    }
}
