package in.cdac.functionalinterface;

import java.util.Scanner;

interface Using_Lambda{
	
	int operation(int a , int b) ; // abstract method
}

interface displayMessage{
	void sayMessage(String msg) ;
}

public class LambdaExpression2 {
	public int operate(int a , int b , Using_Lambda UI) {
		return UI.operation(a, b);
		
	}
	
	public String sayMessage(int i) {
		return "The result is : " + i;
	}
	
	public static void main(String[] args) {
		LambdaExpression2 le2 = new LambdaExpression2();
		Scanner sc = new Scanner(System.in);
		
		displayMessage dismsg = msg -> System.out.println("Hello " + msg);;
		Using_Lambda add = (int a , int b ) -> a + b ;		// we created a variable for the interface body
		System.out.println("Enter first no. : ");
		int x = sc.nextInt();
		System.out.println("Enter second no. : ");
		int y = sc.nextInt();
		System.out.println(x+ " + " + y + " = " + le2.operate(x, y, add));
		System.out.println(le2.sayMessage(le2.operate(x , y , add )));
		
		
		Using_Lambda subtract = ( a , b ) -> a - b ;		// we created a variable for the interface body
		System.out.println("Enter first no. : ");
		int x1 = sc.nextInt();
		System.out.println("Enter second no. : ");
		int y1 = sc.nextInt();
		System.out.println(x1+ " - " + y1 + " = " + le2.operate(x1, y1, subtract));
		
		
		Using_Lambda multiply = ( a , b ) -> {return a * b ;} ;		// we created a variable for the interface body
		System.out.println("Enter first no. : ");
		int x2 = sc.nextInt();
		System.out.println("Enter second no. : ");
		int y2 = sc.nextInt();
		System.out.println(x2+ " * " + y2 + " = " + le2.operate(x2, y2, multiply));
		
		
	}

}
