import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Marks :");
		int marks = sc.nextInt();
		if (marks >= 85) {
			
			System.out.println("Grade A+");
		}
		
		else if (marks >= 70) {
			
			System.out.println("Grade A");
			
		}
		
		else if (marks >= 60) {
			
			System.out.println("Grade B");
			
		}
		
		else if (marks >=50) {
			
			System.out.println("Grade C");
			
		}
		
		else if (marks >= 40) {
			
			System.out.println("Grade D");
			
		}
		
		else {
			
			System.out.println("Try Next Time ");
		}
	}
	
	

}