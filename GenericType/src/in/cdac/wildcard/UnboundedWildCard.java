package in.cdac.wildcard;

import java.util.ArrayList;
import java.util.List;

// Unbounded Wild Card represents any type is it declared by using single question mark ( ? )
// Example :
// List<?> list = new ArrayList<>();


public class UnboundedWildCard {
	public static void printList(List<?> List) {
		for (Object item : List) {
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Markile");
		stringList.add("Azazel");
		stringList.add("Raphael");
	//	stringList.add(10);		// not valid
		printList(stringList);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
	//	intList.add("Kate") ; // Not Valid 
		printList(intList);


	}

}
