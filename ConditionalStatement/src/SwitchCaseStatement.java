
public class SwitchCaseStatement {

	public static void main(String[] args) {
	
		// without case we cannot enter any statement in switch case
		
		int x = 10 ;
	final	int y = 20 ; // if we want to declare a variable in switch case then the variable must be final
		
		// byte, short , int , char , String , enum
		
		switch(x)
		{//System.out.println("Hello Switch Case");
		
		case 10:
			System.out.println("Case 10");
			break; // if break statement is not used all the cases will execute and the condition of switch case fall through will occur
		
		case y :
			System.out.println("Case 20");
			break;
		
		}

	}

}
