package in.cdac.exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			// Case where finally block dosen't execute
			
			System.out.println("AAA");
			System.out.println(10/0);	// Exception Occurred
			System.out.println("BBB");
		} catch (ArithmeticException e) {
			System.out.println("CCC");
		}
		finally {
			System.out.println(20/0);
			System.out.println("DDD");
			
		}
		System.out.println("EEE");

	}

}