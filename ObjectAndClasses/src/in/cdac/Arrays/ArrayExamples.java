package in.cdac.Arrays;

import java.util.Scanner;

public class ArrayExamples {
	public void sum(int[] arr) {
		int total = 0 ; // local variable 
		for(int x : arr) {
			total = total + x ;
			
		}
		System.out.println("Total = " + total);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		int arrLen = arr.length ;
		System.out.println("Lenght of the Arryay : " + arrLen);
		
		// print array elements using for loop
		
		for(int x = 0 ; x < arr.length ; x++) {
			System.out.print(arr[x] + " " );
		}
		
		// for each loop 
		System.out.println();
		System.out.println("For Each Loop");
		for(int x : arr) {
			System.out.print(x + "  ");
		}
		
		System.out.println( );
		int[] marks = {54,12,78,96,32};
		ArrayExamples ar = new ArrayExamples();
		ar.sum(marks);
		
		ar.sum(new int[] {10,15,20,25,30}); // anonymous array
		
		System.out.println();
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sr.nextInt();
		int[] age = new int[size] ;
		
		// store the elements into the array age
		
		for(int z=0 ; z < age.length ; z++) {
			System.out.print("enter element " +(z+1) +" :");
			age[z]=sr.nextInt();
				
		}
		System.out.println();
		// print the elements of an array
		for(int k = 0 ; k < age.length ; k++) {
			System.out.print(age[k] + " ");
		}
		
		
		}

}
