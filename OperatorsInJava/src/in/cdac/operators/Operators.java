package in.cdac.operators;

import java.math.BigDecimal;

public class Operators {

	public static void main(String[] args) {
		// byte ,short ,int ,char
		// byte + byte => int + int => int
		
		byte b1 = 5 , b2 = 10 , b3 ;
		// b3 = b1 + b2; // RHS is int while LHS is of byte type
		b3 = (byte)(b1 + b2);
		
		// int / double => double / double; 1/2 => 0; 1.0/2 => 0.5;
		
		// char + float => int + float => float + float => float
		
		System.out.println(2.2 + 4.4);
		System.out.println(2.2 + 4.2 - 0.5);
		BigDecimal bg1 = new BigDecimal("2.2");
		BigDecimal bg2 = new BigDecimal("4.4");
		System.out.println(bg1.add((bg2)));
		
		
		
		
	}

}
