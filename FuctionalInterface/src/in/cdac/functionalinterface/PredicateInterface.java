package in.cdac.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		
		// Define a Predicate to check if a number is even
		Predicate<Integer> isEven=num->num%2==0;
		// Test the Predicate
		boolean res = isEven.test(11);
		System.out.println("Is 11 even?\n" +res);

	}

}
