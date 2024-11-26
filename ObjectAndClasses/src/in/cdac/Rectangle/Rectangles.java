package in.cdac.Rectangle;

import java.util.Scanner;

public class Rectangles {
	// instance variables
	int length , breadth ;
	
	// Creating a constructor
	public Rectangles() {
		
		System.out.println("Rectangle Class Constructor ");
		
	}
	
	// instance methods 
	void Scan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length Of Rectangle : ");
		length = sc.nextInt();
		System.out.print("Enter the Breadth of Rectangle : ");
		breadth = sc.nextInt();
		
	}
	
	void CalculateArea() {
		int area = length * breadth ;
		System.out.println("Area of Rectangle : " + area +" Square Units");
		
	}
}
