package in.cdac.pg;

public class Circle {
	final float PI = 3.14f ;
	
	// Constructor
	public Circle(float radius) {
		float area = PI * radius * radius ;
		System.out.println("Area of Circle = " + area);
	}
}
