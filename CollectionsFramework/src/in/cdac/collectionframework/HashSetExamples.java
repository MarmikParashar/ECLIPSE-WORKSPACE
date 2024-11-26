package in.cdac.collectionframework;

import java.util.HashSet;

public class HashSetExamples {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(123);
		hs.add(103);
		hs.add(999);
		hs.add(89);
				
		System.out.println(hs);
		
		// remove 999
		hs.remove(999);
		System.out.println(hs);

		// remove all
		hs.removeAll(hs);
		System.out.println(hs);

	}

}
