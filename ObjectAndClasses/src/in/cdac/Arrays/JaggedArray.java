package in.cdac.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] jaggedArray = new int[3][];
		jaggedArray[0] = new int[] {1,2,3,4};
		jaggedArray[1] = new int[] {5,6};
		jaggedArray[2] = new int[] {7,8,9};
		
		// for each loop
		
		for(int[] x : jaggedArray) {
			
			System.out.println(Arrays.toString(x));
		}
		
		// single dimension array
		
		int[] marks = {10,20,30,40,50};
		System.out.println(Arrays.toString(marks));
		
		//User friendly JaggedArray Creation
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the size of row : ");
//		int row = input.nextInt();
//		
//		int[][] Array = new int[row][];
//		
//		for(int i =0 ; i < row ; i++) {
//			System.out.print("Enter the size of Column at [" +i+ "] position :" );
//			int col = input.nextInt();
//			Array[row] = new int[col];  
//		}
//		
//		for(int i = 0; i < Array.length; i++ )
//		{
//			for(int j = 0; j < Array[i].length; j++) 
//			{
//				System.out.print("Ente elements in array at positon [" +i+"][" +j+ "]::" );
//				Array[i][j]= input.nextInt();			
//			}
//			
//		}
		
		
	}

}

