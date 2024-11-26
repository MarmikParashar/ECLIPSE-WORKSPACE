package in.cdac.wrapper;

public class MathTest {

	public static void main(String[] args) {
		int radius = 2;
		double areaOfCircle = Math.PI * radius * radius ;
		System.out.println("Area of Circle : " + areaOfCircle);
		
		int x = 20 , y = -10 ;
		System.out.println("Math.abs(x) : " + Math.abs(x));
		System.out.println("Math.abs(y) : " + Math.abs(y));
		System.out.println("Math.abs(10/0) : " + Math.abs(10.0/0));
		
		System.out.println("Math.max(x,y) : " + Math.max(x, y));
		System.out.println("Math.min(x,y) : " + Math.min(x, y));
		
		System.out.println("Math.pow(10,2)" + Math.pow(10, 2));
		
		double a = Math.random();
		System.out.println("Random No. : " +a);
		
		System.out.println("Math.addExact(x,y) : " + Math.addExact(x, y));
		System.out.println("Math.subtractExact(x,y) : " + Math.subtractExact(x, y));
		
		System.out.println("For square root : " + Math.sqrt(25));
		System.out.println("For Cube root : " + Math.cbrt(64));
		
		System.out.println("For Rounding off no. : " + Math.round(12.768));
		
	//	Integer obj = new Integer(20); // No longer valid since version 9 it has become a deprecated method
		
		
	}
	

}
