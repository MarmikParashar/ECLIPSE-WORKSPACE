package in.cdac.exceptionHandling;

import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception{
	
	InvalidAgeException(String str) {
		super(str);		// call super class exception
	}
	
}
public class InvalidAgeTest {
	private static int age ;
	
	static void ageValidator() throws InvalidAgeException {
		// create an instance of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		age = sc.nextInt();
		if(age < 18) {
			throw new InvalidAgeException("Invalid Age , You Are Not Eligible To Vote " );
		}
		else {
			System.out.println("You are Welcome to Vote");
		}
		
	}
	public static void main(String[] args) {
		try {
			
			ageValidator();
			
		} catch (Exception ex) 
		{
			System.out.println("\nException Caught" +ex );		
		}
		System.out.println("End Of Main Method");
		
	}

}
