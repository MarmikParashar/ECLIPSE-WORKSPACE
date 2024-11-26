package in.cdac.exceptionHandling;


		// Cases of unchecked R.E Exceptions

public class ExceptionsInJava {
//	static int i = 10/0;		// R.E ExceptionInInitializerError
	
	static {
		String s = "ajskdfks" ;
		s = null ;
//		System.out.println(s.length());		//R.E NullPointerException
	}
	
//	public static void methodOne() {
//		methodTwo();
//	}									// R.E StackOverFlowError
//	
//	public static void methodTwo() {
//		methodOne();
//	}
	 
	public static void main(String[] args) {
//		methodOne();
		int[] x =new int[10];
		System.out.println(x[0]);
//		System.out.println(x[100]);		// R.E ArrayIndexOutOfBoundException or AIOOBE
//		System.out.println(x[-100]);	// R.E ArrayIndexOutOfBoundException or AIOOBE
		
//		Object o = new Object();
//		String str = (String)o;			// R.E ClassCastException
		
		// IllegalArgumentException
		Thread t = new Thread();		
		t.setPriority(10); 				// Valid Argument Priority from 1 - 10
//		t.setPriority(0);
//		t.setPriority(100);				// IllegalArgumentException
		
		try {
			// Statement
		} 
		
		catch (ArithmeticException | NullPointerException ex) {
			ex.printStackTrace();
		//	System.out.println(ex.getMessage());
		}
//		catch (ClassCastException | NullPointerException ex) {	
//			ex.printStackTrace();
//		}

		int i = Integer.parseInt("15");
		System.out.println(i); 			// Valid 
//		int j = Integer.parseInt("abcc") ;		// Invalid NumberFormatException
//		System.out.println(j);
		
	}

}
