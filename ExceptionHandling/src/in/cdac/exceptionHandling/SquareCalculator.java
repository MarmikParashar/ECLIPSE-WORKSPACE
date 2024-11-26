package in.cdac.exceptionHandling;

import java.util.*;

import org.w3c.dom.css.ElementCSSInlineStyle;

class MyException extends Exception{
	public MyException(String str) {
		super(str);		// Call super class constructor
	}
}
public class SquareCalculator {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number less than 100 : ");
			int num = sc.nextInt();
			if (num >= 100 ) {
				throw new MyException("Please Enter no. Less Than 100 ") ;
			}
			else {
				System.out.println("Square of " + num + " = " + (num*num));
			}
		} 
		catch (MyException me) {
			System.out.println("Custom Exception " + me);
		}
		catch(Exception ex) {
			System.out.println("Custom Exception " + ex);
		}
		finally {
			sc.close();
		}
	}

}
