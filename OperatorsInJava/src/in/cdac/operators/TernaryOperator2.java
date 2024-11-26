package in.cdac.operators;

import java.util.Scanner;

public class TernaryOperator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// prompt the user to enter the value
		System.out.print("Enter the year :");
		int year = sc.nextInt(); // convert the input into the integer type
		int check4 =  (year % 4  == 0) ? 1 : 0 ;
		int check100 = (year % 100 == 0) ? -1 : 0 ;
		
		int check400 = (year % 400 == 0 ) ? 1 : 0 ;
		
		int total = check4 + check100 + check400 ;
		
		String str1 = "Leap Year " ;
		String str2 = "Not a Leap Year" ;
		
		String leapYear = (total == 1) ? str1 : str2;
		System.out.println(leapYear);
		
		int result = (10 > 20) ? 30 : ((40 > 50 ) ? 60 : 70) ;
		System.out.println(result);
		
		int i = 1;
		i+= ++i + i++ + ++i + i++ ;
		System.out.println("Result of i :" +i);
		

	}

}
