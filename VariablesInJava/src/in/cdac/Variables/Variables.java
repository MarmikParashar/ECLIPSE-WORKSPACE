package in.cdac.Variables;

public class Variables {

	public static void main(String[] args) {
	
		//System.out.println("My First Java Program");
		String name = "AXALOTL";
		// above string is equivalent to
		char stdName[] = {'A','x','a','l','o','t','l'};
		String studentName = new String(stdName);
		System.out.println("Student Name : " + studentName);
		char gender = 'm';
		boolean isMarried = false;
		byte noChildren = 0;
		short yearOfBirth = 2010;
		int salary = 69000;
		long assetValue = 4589756L;
		float weight = 62.75f;
		System.out.println("Gender :" + gender);
		System.out.println("Marital Status :" +isMarried);
		System.out.println("No. of Children :" +noChildren);
		System.out.println("DOB :" +yearOfBirth);
		System.out.println("Salary :" +salary);
		System.out.println("Assets :" +assetValue);
		System.out.println("Weight :" +weight);
		
		// From jdk version 10 a new way to declare a variable by using var keyword
		var n = "Rohan"; // you must initialize the variable otherwise it will throw an error
		var age = 22; 
		
		long longValue = 123456789L;
		char firstLetter = 'a';
		char secondLetter = 98;
		System.out.println("Name :" +n);
		System.out.println("Age : " +age);
		System.out.println(longValue);
		System.out.println("First Letter :" +firstLetter);
		System.out.println("Second Letter :" +secondLetter);
		secondLetter += 2;
		System.out.println("Second Letter :" +secondLetter);
		
		// Tab char
		char tabChar = '\t';
		char nextLineCharacter = '\n';
		char backSlashCharacter = '\\';
		System.out.println(backSlashCharacter);
		
		String str1 = "Hello\n";
		String str2 = "a double quote \"hello\"";
		
		System.out.println(str1);
		System.out.println(str2);
		
		// Usage of _ numeric literal
		
		double d = 1234.654;
		double d1 = 1_23_45.6_8_9;
		System.out.println(d1);
		System.out.println(d);
		
	    //double d2 = _1_23_45.6_8_9; // invalid
		
		// Using the underscore sign at the start and end of an integer or double value will throw an error
		
		
		
		
		


		
	}

}
