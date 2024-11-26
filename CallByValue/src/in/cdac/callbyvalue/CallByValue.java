package in.cdac.callbyvalue;

import java.security.KeyStore.CallbackHandlerProtection;
import java.util.Scanner;

public class CallByValue {
	// create a swap function with two parameters
	public void Swap(int x , int y) {
		
		// Swapping using Third Variable 
		int temp;
		temp = x;
		x = y ;
		y = temp ;
		
		System.out.println("Value of Integer One and Integer Two After Swapping :" +x 
				+" and " + y);
	}
	public static void main(String[] args) {
		
		CallByValue cbv = new CallByValue( );
		int a , b ;
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Enter First Integer : ");
		a = sr.nextInt();
		
		System.out.print("Enter Second Interger : ");
		b = sr.nextInt();
		
		System.out.println();
		
		System.out.println("Value of Integer One and Integer Two Before Swapping :" +a 
				+" and " + b);
		
		System.out.println();
		
		cbv.Swap(a,b);

	}

}
