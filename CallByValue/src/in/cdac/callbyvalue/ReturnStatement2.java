package in.cdac.callbyvalue;


public class ReturnStatement2 {
	ReturnStatement2(){
		System.out.println("Default Constructor");
		
	}
	int m1() {
		System.out.println(" m1 method of class ");
		return 10;
	}
	float m2() {
		System.out.println(" m1 method of class ");
		return 10.0f;
	
	}
	
	static char m3() {
		System.out.println("m3 method of class");
		return 'a';
		
	}
	public static void main(String[] args) {
		
		ReturnStatement2 rs = new ReturnStatement2();
		int result = rs.m1();
		System.out.println("Result =" +result);
		
		float result2 = rs.m1();
		System.out.println("Result =" +result2);
		
		char ch = ReturnStatement2.m3(); // Calling static method by class name
		System.out.println("Resutl = "+ ch);
		
	}
	
}
