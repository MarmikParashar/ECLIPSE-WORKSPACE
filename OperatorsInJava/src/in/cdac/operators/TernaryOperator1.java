package in.cdac.operators;

import java.lang. *; //default package in java
import java.util.Scanner ; // package for using scanner for taking the output from user
public class TernaryOperator1 {

	public static void main(String[] args) {
		int x = 10 ;
		int y = 30 ;
		int z = (x > y) ? x : y ; 
		System.out.println("The greatest no. is : " + z);
		
		// prompt the user to take input at run time 
		// create a scanner class to accept the input from the user
		Scanner input  = new Scanner(System.in) ;
		System.out.print("Enter your age : ");
		int age = input.nextInt(); // The next function takes integer data type value 
									//instead of string and store it into age variable

		String str1 = "You are eligible to vote " ;
		String str2 = "You are not eligible to vote" ;
		String str3 = (age >= 18) ? str1 : str2 ;
		System.out.println("Your Voting status :" + str3);
		
		
		
		
		
		
		

}

}
