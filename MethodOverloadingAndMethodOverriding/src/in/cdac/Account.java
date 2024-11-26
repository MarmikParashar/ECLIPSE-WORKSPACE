package in.cdac;


public class Account {
	private int accountNum ;
	private double accBal = 0.0;
	
	// Constructor overloading
	public Account(int accountNum) {
		this.accountNum = accountNum ;
		
	}
	
	public Account(int accountNum , double accBal) {
		this.accountNum = accountNum ;
		this.accBal = accBal;
	}
	
	// Getter and Setter method to access private properties outside the class
	public int getAccountNum() {
		return accountNum;
	}
	
	public double getBalance() {
		return accBal;
	}
	
	public void credit(double amount) {
		accBal += amount ;
		
	}
	
	public void debit(double amount) {
		if(accBal >= amount) {
			accBal -= amount ;
		}
		else {
			System.out.println("Insufficient Fund To Debit");
			System.out.println();
		}
	}
	public void transferTo(double amount , Account another) {
		if(accBal >= amount) {
			accBal -= amount ;
			another.accBal += amount ;
			System.out.println("balance : ["+amount+"] transfered to ["+another+"]");
			System.out.println();
		}
		else {
			System.out.println("Insufficient Fund To Debit");
			System.out.println();
		}
	}
	
	// method overriding
	public String toString() {
		return "Account Number :" + accountNum + "\n" + "Bank Balance : " + accBal ;
	}
	
	
}
