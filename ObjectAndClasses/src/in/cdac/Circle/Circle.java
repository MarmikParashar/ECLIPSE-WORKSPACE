package in.cdac.Circle;

import java.util.Scanner;

public class Circle {
	// Declare instance variables
	double radius;
	final double PI = 3.14; // Final variable cannot be changed anywhere in the program
	// Declare an instance method with a parameter r of type int
	// This is local variable
	// A variable declared inside the body of method is called local variable
	public void RadiusOfCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius of Circle : ");
		radius = sc.nextDouble();
		
	}
	
	// Declare method to calculate the area of circle
	public void CalculateArea() {
		double area = PI * radius * radius ;
		System.out.println("Area of Circle : " + area);
	}
	
	// Declare method to calculate the circumference of circle
	public void CalculateCircumference() {
		double circumference = 2 * PI * radius ;
		System.out.println("Circumference of Circle : " + circumference);
	}
}
