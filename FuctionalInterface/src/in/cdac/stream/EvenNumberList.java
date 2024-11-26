package in.cdac.stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumberList {

	public static void main(String[] args) {
		 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evenNumber = numbers.stream().filter(num -> num %2 ==0).toList();

		System.out.println("Even Number : " + evenNumber);
	}

}
