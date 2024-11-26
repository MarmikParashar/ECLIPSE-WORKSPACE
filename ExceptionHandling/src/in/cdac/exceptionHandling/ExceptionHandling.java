package in.cdac.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ABC");
		System.out.println("ABC");
	//	System.out.println(1/0); 	// throw run time error
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("Enter any two numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {

			int num3 = num1/num2 ;
			System.out.println("Result :" + num3);
		}
		
		catch(ArithmeticException ex) {
			System.out.println("Second No. Cannot be Zero");
		}

		catch(NullPointerException ex) {
			System.out.println("String is Empty");
		}

		catch(Exception ex) {
			System.out.println("Ecception Occured");
		}
		System.out.println("End of Main Method");	
		
	
	}

}
