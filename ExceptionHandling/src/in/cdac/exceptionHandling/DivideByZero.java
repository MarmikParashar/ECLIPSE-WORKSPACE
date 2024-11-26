package in.cdac.exceptionHandling;

public class DivideByZero {

	public static void main(String[] args) {
		 try {
			 float c = 10.0f/0.0f ;
			 System.out.println(c);
			 
		 }
		 catch(ArithmeticException ex) {
			 System.out.println(ex.getMessage());
		 }

	}

}
