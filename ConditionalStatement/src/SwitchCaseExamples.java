import java.util.Scanner;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no. :");
		int num1 = sc.nextInt();
		System.out.print("Enter second no. :");
		int num2 = sc.nextInt();
		System.out.print("Enter the Operator to be performed(+,-,*,/) :");
		char operator = sc.next().charAt(num2);
		int result ;
		
		switch(operator) {
		
		case '+' :
			result = num1 + num2 ;
			System.out.println(num1 + "+" + num2 + "=" +result);
			break ;
			
		case '-' :
			result = num1 - num2 ;
			System.out.println(num1 + "-" + num2 + "=" +result);
			break ;
			
		case '*' :
			result = num1 * num2 ;
			System.out.println(num1 + "*" + num2 + "=" +result);
			break ;
			
		case '/' :
			result = num1 / num2 ;
			System.out.println(num1 + "/" + num2 + "=" +result);
			break ;
			
			default :
				System.out.println("Invalid Operator");
		}
		
	}

}
