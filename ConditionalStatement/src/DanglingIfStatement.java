
public class DanglingIfStatement {

	public static void main(String[] args) {
		
		// Dangling Else Problem
		
		int i = 10 , j = 0 ;
		if (i == 0)
			if (j == 0)
				System.out.println("i and j both equal to zero");
			
		else 
			System.out.println("Whose else is this"); // if we do not use any curly braces then the compiler becomes confuse as to where the else Block belongs to
	
		// Corrected code
		int a = 10 , b = 0 ;
		if (a == 0) {
			if (b == 0) {
				System.out.println("i and j both equal to zero");
			}
		}
			
		else {
			System.out.println("Whose else is this");
		}
	}
	
}
