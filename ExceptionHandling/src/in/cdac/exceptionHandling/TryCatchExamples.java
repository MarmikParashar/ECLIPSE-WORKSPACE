package in.cdac.exceptionHandling;

public class TryCatchExamples {
	
	int x =0, y=0;
	void divide() {
		System.out.println("Division Method");
		
		try {
			System.out.println("Try Block Starts....");
			int z =x/y;
			System.out.println("Result = " + z);
		}
		
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
			System.out.println("Catch block ends");
		}
		
		finally {
			System.out.println("Finally block statement");
		}
	}

	public static void main(String[] args) {
		
		TryCatchExamples tc = new TryCatchExamples();
		tc.divide();

	}

}
