package in.cdac.abstraction;

import java.util.Scanner;

abstract class Shape{
	abstract void Area();
	
}

class Rectangle extends Shape{

	@Override
	void Area() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		double ln = sc.nextDouble();
		System.out.print("Enter the Breadth : ");
		double br = sc.nextDouble();
		System.out.println("\nArea of Rectangle = " + (ln * br));
		
	}
	
}
class Triangle extends Shape {

	@Override
	void Area() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		double ln = sc.nextDouble();
		System.out.print("Enter the Breadth : ");
		double br = sc.nextDouble();
		System.out.println("\nArea of Rectangle = " + ((0.5)*ln * br));
		
	}
	
}
class Circle extends Shape{

	@Override
	void Area() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of Circle : ");
		double r = sc.nextDouble();
		System.out.println("\nArea of Circle : " + (3.14*r*r));
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		Shape rt = new Rectangle();
		rt.Area();
		Shape tri = new Triangle();
		tri.Area();
		Shape cr = new Circle();
		cr.Area();

	}

}
