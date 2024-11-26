package in.cdac.operators;

public class UniaryOperator {

	public static void main(String[] args) {
		int x = 10 , y;
		System.out.println("Value of x :" +x);
		y=++x;
		System.out.println("Value of x :" +x);
		System.out.println("Value of y :" +y);
		
		
		y = x++;
		System.out.println("Value of x :" +x);
		System.out.println("Value of y :" +y);
		
		
		y= ++x + x++ + x ; 
		System.out.println("Value of y :"+y);
	}

}
