package in.cdac.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("myFile");
		f.createNewFile();
		System.out.println("File created Successfully");
	}

}
