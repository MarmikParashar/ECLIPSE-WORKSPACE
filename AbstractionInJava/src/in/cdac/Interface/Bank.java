package in.cdac.Interface;

public interface Bank {
	public void rateOfInterest();
	public class SBI implements Bank {

		@Override
		public void rateOfInterest() {
			System.out.println("Home Loan Interest in Current Year 2024 is : " + 10.5 + " %" + " per Year");
			
		}
		
	}
}
