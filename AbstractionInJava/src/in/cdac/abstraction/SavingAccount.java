package in.cdac.abstraction;

import java.util.Scanner;

public class SavingAccount extends BankAccount{

	public SavingAccount(String accountNumber) {
		super(accountNumber);
		
	}
	public SavingAccount(String accountNumber, double bankBalance) {
		super(accountNumber , bankBalance);
		
	}

	@Override
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount to deposit : " );
		double dep = sc.nextDouble();
		setBankBalance(dep + getBalance());
		System.out.println("Total Balance : " + getBalance() );
		
	}

	@Override
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount for withdrawl : ");
		double widraw = sc.nextDouble();
		if (widraw > getBalance()) {
			System.out.println("Withdrawal Failed ! Balace Insufficient !!");
		}
		else {
			setBankBalance(getBalance() - widraw);
			System.out.println("Remaining Balance :" + getBalance());
		}
		
		
	}
	
}
