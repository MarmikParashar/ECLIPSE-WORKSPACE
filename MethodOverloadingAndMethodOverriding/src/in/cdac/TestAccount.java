package in.cdac;

public class TestAccount {

	public static void main(String[] args) {
		Account rohanAccount = new Account(123456);
		System.out.println(rohanAccount);
		
		Account johnAccount = new Account(10025,15987.39);
		System.out.println(johnAccount);
		
		rohanAccount.credit(12000.64);
		System.out.println(rohanAccount.getBalance());
		
		johnAccount.transferTo(5000, rohanAccount);
		System.out.println(johnAccount.getBalance());
		
		System.out.println(johnAccount.getAccountNum());
		

	}

}
