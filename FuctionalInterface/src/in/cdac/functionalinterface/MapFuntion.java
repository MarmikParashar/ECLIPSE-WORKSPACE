package in.cdac.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class MapFuntion {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,6,9,12,15);
		list.stream().map(number->number*3).forEach(System.out :: println);
		System.out.println();
		list.stream().map(number->number*3).forEach( x-> System.out.print(x+" "));
		
	}

}
