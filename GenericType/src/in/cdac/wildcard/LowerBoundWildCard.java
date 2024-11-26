package in.cdac.wildcard;

import java.util.ArrayList;
import java.util.List;

//Upper Bound wild card restricts the unknown type means it should be specific type or super type
//Example :
//List<? super Integer > list = new ArrayList<>();

public class LowerBoundWildCard {
	public static void printList(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
	}
	public static void main(String[] args) {
		List<Number> numlist = new ArrayList<>();
		printList(numlist);
		System.out.println("Elements in List : \n" + numlist);
		
	}

}
