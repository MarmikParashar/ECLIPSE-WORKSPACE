package in.cdac.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int age = 18;
		double weight = 75.69;
		//System.out.println("Your Weight is " + weight + "Kg" );
		int height = 192;
		boolean isMarried = false ;
		char gender = 'M';
		System.out.println(!isMarried && (gender == 'M'));
		System.out.println((height >= 185) && (weight >= 85));
		System.out.println((height >= 185) || (weight >= 85));
		
		// floating point numbers are not precise
		
		double d1 = 2.2 + 4.4 ;
		double d2 = 6.6 ; 
		System.out.println(d1 == d2);
		// do not use == operator to compare two floating point variables
		
		
		
		
	}

}
