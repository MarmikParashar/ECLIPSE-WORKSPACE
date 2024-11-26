package in.cdac.wrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerTest {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		System.out.println("Enter an integer value : ");
		String str = br.readLine();
		// Convert  String into Integer type
		int i = Integer.parseInt(str);
		System.out.println("Value of i :" + i);
		
		// Convert Integer value to binary
		
		str = Integer.toBinaryString(i);
		System.out.println(str);
		
		// Decoding hexadecimal to integer
		
		String hex = "0x123" ;
		int intvalue = Integer.decode(hex);
		System.out.println("String to Hex : " + hex);
		
	}

}
