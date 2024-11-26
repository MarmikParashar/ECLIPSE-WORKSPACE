package in.cdac.abstraction;

public class AccountTEST {

	public static void main(String[] args) {
		
		BankAccount sa = new SavingAccount("1236547893" , 15000.89);
		BankAccount ca = new CurrentAccount("1234567142" , 75000.90);
		
		System.out.println("Account Number : "+sa.getAccountNumber());
		System.out.println("Account Balance : " + sa.getBalance());
		
//		System.out.println("Account Number : "+ca.getAccountNumber());
//		System.out.println("Account Balance : " + ca.getBalance());
		
		sa.deposit();
	//	sa.withdraw();
		
		
	}
}
