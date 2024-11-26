package in.cdac.filereader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\Java Files Handling\\delhi.txt" ;
		FileReader fr = new FileReader(filePath) ;
		
		// Create an instance for the buffer reader class 
		BufferedReader br = new BufferedReader(fr);
		String linebyline ;
		while((linebyline = br.readLine()) != null ) {
			System.out.println(linebyline);
		}
		
		// Shortcut method to use BufferedReader Class
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String lineOfText ;
		while((lineOfText = reader.readLine()) != null ) {
			System.out.println(lineOfText);
		}
		// read file contents using java.nio.* package
		System.out.println("\nRead File contents using list interface : \n");
		Path filePath3 = Paths.get("D:\\Java Files Handling\\delhi.txt");
		try {
			List<String> lines = Files.readAllLines(filePath3);
			for (String str : lines) {
				System.out.println(str);
			}
		} catch (IOException  e) {
			// TODO: handle exception
		}
	}
}

	

