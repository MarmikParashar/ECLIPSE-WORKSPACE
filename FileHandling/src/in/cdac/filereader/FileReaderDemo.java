package in.cdac.filereader;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\Java Files Handling\\delhi.txt");
		int i = fr.read();		// This method is used when file only contains a small amount of data to read
		while(i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}

}
