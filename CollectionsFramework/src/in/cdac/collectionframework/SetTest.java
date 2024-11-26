package in.cdac.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		
		// Check if set is empty or not
		
		boolean check = s.isEmpty();
		System.out.println(check);		// result will be true as set is empty
		System.out.println("Size of the Set : " + s.size());
		
		s.add("Apples");
		s.add("Oranges");
		s.add("Mango");
		s.add("Grapes");
		s.add("Guava");
		s.add(null);		// no errors are shown as it only throws errors at run time 
		s.add(null);		// duplicate elements are not allowed
		
		System.out.println(s);
	
		
	}

}
