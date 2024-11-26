package in.cdac.pg;

import java.util.Scanner;

public class Rectangle {
	float l , b , area , per ;
	// create object for the scanner class
	Scanner sc = new Scanner(System.in);
	// instance method
	public void Area() {
		System.out.print("Enter the length : ");
		l = sc.nextFloat();
		System.out.print("Enter the breadth : ");
		b = sc.nextFloat();
		
		area = l * b ;
		System.out.println("Area of Rectangle :" + area);
		
	}
}
