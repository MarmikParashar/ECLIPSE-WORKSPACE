package in.cdac.String;

public class StringInJava {

	public static void main(String[] args) {
		String s = "Hello" ;
		// Calling the concat() method to add a string at the end
		s.concat("World ! ") ;
		System.out.println(s); 	// It will print only Hello because String is an immutable object it cannot be changed 
		
		String s1 = "Hello" ;
		String s2 = "Hello" ;
		String s5 = "hello" ;
		
		// Creating two string objects with values 
		String s3 = new String("Good Bye");
		String s4 = new String("Hello");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s5));		// False
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));		// False 
		
		System.out.println(s3.equals(args)); 	// False 
		
		if (s2.equals(s4)) {
			System.out.println("String equal");
		}
		else {
			System.out.println("String not equal");
		}
		
		System.out.println(s1.equalsIgnoreCase(s5));
		
		String s6 = "Cricket" ;
		String s7 = "cricket" ;
		String s8 = s7 ;
		
		System.out.println(s6 == s7);		// false
		System.out.println(s8 == s7);		// true
		
		String s9 = "mumbai";
		String s10 = "mumbai";
		String s11 = "delhi";
		
		System.out.println(s9.compareTo(s10));
		System.out.println(s10.compareTo(s11));
		System.out.println(s11.compareTo(s10));


	}

}
