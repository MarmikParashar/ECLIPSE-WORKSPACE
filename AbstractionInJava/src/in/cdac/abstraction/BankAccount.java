package in.cdac.abstraction;

public abstract class BankAccount {
	
	//declare two private variables for accountNumber , bankBalance 
	// implement getter and setter for accessing the private variables
	// two abstract methods deposit() , withdraw()
	// declare constructors to initialize the objects
	
	private String accountNumber ;
	private double bankBalance ;
	
	public String getAccountNumber() {
		return accountNumber ;
	}
		
	public double getBalance() {
		return bankBalance ;
		
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber ;
	}
	
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance ;
	}
	
	public abstract void deposit();
	
	public abstract void withdraw();
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber ;
		
	}
	public BankAccount(String accountNumber , double bankBalance) {
		this.accountNumber = accountNumber;
		this.bankBalance = bankBalance ;
	}
	
		
}

