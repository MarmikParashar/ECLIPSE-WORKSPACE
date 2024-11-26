package in.cdac.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateNewFile2 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("D:\\Java Files Handling\\pg.txt");
		Path p = Files.createFile(path);
		System.out.println("File Created Successfully" + path);
	}

}