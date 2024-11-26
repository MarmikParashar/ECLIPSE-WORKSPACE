package in.cdac.collectionframework;

import java.util.ArrayList ;
import java.util.List ;

public class ListExample {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		// adding element
		al.add("pen");
		al.add("pencil");
		al.add("book");
		al.add("paper");
		al.add("paper");
		//al.add(101) ; // not allowed
		
		System.out.println(al);
		
		List<String> al1 = new ArrayList<String>();
		al1.add("notebook") ;
		al1.add("laptop" ) ;
		
		System.out.println("First Element : " + al.get(0));
		System.out.println("Index value of pen :" + al.indexOf("pen"));
		
		List al2 = new ArrayList();
		al2.add(101);
		al2.add("abc");
		System.out.println(al2);
		
		
		
		
	}

}
