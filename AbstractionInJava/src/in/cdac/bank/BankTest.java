package in.cdac.bank;

import in.cdac.Interface.Bank;
import in.cdac.Interface.Bank.SBI;

class HDFC implements Bank {

	@Override
	public void rateOfInterest() {
		System.out.println("Home Loan Interest in Current Year 2024 is "
				+ ": " + 11.5 + " %" + " per Year");
		
	}
	
}
public class BankTest {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.rateOfInterest();
		
		HDFC hdfc = new HDFC();
		hdfc.rateOfInterest();

	}

}
