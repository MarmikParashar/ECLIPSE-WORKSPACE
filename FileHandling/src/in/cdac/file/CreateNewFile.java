package in.cdac.file;

import java.io.*;

public class CreateNewFile {

	public static void main(String[] args) {
		File file = new File("D:\\Java Files Handling\\example1.txt");
		try {
			if (file.createNewFile()) {
				System.out.println(file.getName() + " Created Successfully");
			}
			else {
				System.out.println("File already Exists");
			}
			
		} 
		catch (IOException ex) 
		{
			System.out.println("An Error Occured : \n" );
			ex.printStackTrace() ;
		}
		
	}

}
