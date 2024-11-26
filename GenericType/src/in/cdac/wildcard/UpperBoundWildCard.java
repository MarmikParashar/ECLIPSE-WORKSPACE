package in.cdac.wildcard;

import java.util.ArrayList;
import java.util.List;

// Upper Bound wild card restricts the unknown type means it should be specific type or subtype
// Example :
// List<? extends Number > list = new ArrayList<>();

public class UpperBoundWildCard {
	public static double sumOfList(List<? extends Number> list) {
		double sum = 0.0;
		for (Number num : list) {
			sum += num.doubleValue();
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		List<Integer> intlist = new ArrayList<>();
		intlist.add(12);
		intlist.add(13);
		intlist.add(9);
		intlist.add(25);
		intlist.add(10);
		
		System.out.println("Sum of Integer List : " + sumOfList(intlist) );
		
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(12.78);
		doubleList.add(13.26);
		doubleList.add(9.99);
		doubleList.add(25.74);
		doubleList.add(10.17);
		doubleList.add(-2.25);
		
		System.out.println("Sum of Double List : " + sumOfList(doubleList) );
		
		
		

	}

}
