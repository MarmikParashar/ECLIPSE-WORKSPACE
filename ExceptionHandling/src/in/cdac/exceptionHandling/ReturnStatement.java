package in.cdac.exceptionHandling;

public class ReturnStatement {
//	int method() {	
	static int method1() {
		try {
			System.out.println("Try Block Statement");
			//return 50 ;
		
		} catch (Exception e) {
			System.out.println("Catch Block Statement");
		}
		return 20 ;
}
	public static void main(String[] args) {
		
//		ReturnStatement m1 = new ReturnStatement();
//		System.out.println(m1.method1());		
		System.out.println(method1());
		
	}
	
}
