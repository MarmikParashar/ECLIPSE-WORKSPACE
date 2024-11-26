package in.cdac.Arrays;

public class TwoDArrayExamples {

	public static void main(String[] args) {
		// create 2D array
		int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
		// print the 2D Array
		System.out.println("Printing 2D Array Data : ");
		for(int i =0 ; i < 3 ; i++) { 	// Outer for loop for rows
			for(int j =0 ; j < 3 ; j++) {// Inner For loop for column
				System.out.print(x[i][j] + "\t");
			}
			System.out.println(); 		// For moving the cursor to the next line
		}
		
		// Calculating the sum of all the elements in rows and column
		
		int sum = 0 ;
	
		for(int y =0 ; y < 3 ; y++) { 	// Outer for loop for rows
			
			for(int z =0 ; z < 3 ; z++) {// Inner For loop for column
				
				sum = sum + x[y][z];			
				
			}
			
		}
		
		System.out.println("Total sum of all elements of Array : " + sum );
		
		// Sum of Row Elements
		
		
		for(int a =0 ; a < x[0].length ; a++) 
		{ 	// Outer for loop for rows
			int total = 0 ;
			for(int c = 0 ; c < x.length ; c++) {// Inner For loop for column
				total += x[a][c];				
			}
			System.out.println("Sum of Elements in Column " + a + " :" + total);
		}
		
	}

}


