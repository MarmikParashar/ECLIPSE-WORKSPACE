package in.cdac.Arrays;

import java.awt.dnd.DragSourceDragEvent;
import java.util.Iterator;
import java.util.Scanner;

public class RaggedArrray {

	public static void main(String[] args) {
		
		
		int raggedArray[][] = new int[3][];
		raggedArray[0] = new int[2];	// Row 1 has 2 Column
		raggedArray[1] = new int[3];	// Row 2 has 3 Column
		raggedArray[2] = new int[1];	// Row 3 has 1 Column
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < raggedArray.length; i++ )
		{
			for(int j = 0; j < raggedArray[i].length; j++) 
			{
				System.out.print("Ente elements in array at positon [" +i+"][" +j+ "]::" );
				raggedArray[i][j]= sc.nextInt();			
			}
			
		}
		
		// print ragged array
		System.out.println("Elements in Ragged Array : ");
		for(int i = 0 ; i < raggedArray.length ; i ++) {
			for(int j = 0 ; j < raggedArray[i].length ; j++) {
				System.out.print(raggedArray[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}
