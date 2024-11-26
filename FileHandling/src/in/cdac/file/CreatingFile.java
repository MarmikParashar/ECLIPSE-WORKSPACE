package in.cdac.file;
import java.io.*;
import java.util.Scanner;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\Java Files Handling\\cdac.txt";		// Storing the file path in the variable
		File file = new File(filePath);
		boolean result;
		try {
			result = file.createNewFile();
			if (result) {
				System.out.println(file.getName() + " File create Successfully at : " + file.getCanonicalPath());
			}
			else {
				System.out.println("File Creation Failed at location " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			System.out.println("Error Occurred : /n");
			e.printStackTrace();
			
			
		}
		// Creating a new File using FileOutputStream class
		try {
			String filePath2 = "D:\\Java FIles Handling\\delhi.txt";
			FileOutputStream fos = new FileOutputStream(filePath2, true); 	// true means append mode
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Data for File : ");
			String str = sc.nextLine();
			// Convert the string data into bytes using getBytes method
			byte[] b = str.getBytes();
			fos.write(b); 	// Writing String Data into the delhi.txt file
			fos.close();
			System.out.println("Data Written into the file Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
					
					
					
		
	}

}
