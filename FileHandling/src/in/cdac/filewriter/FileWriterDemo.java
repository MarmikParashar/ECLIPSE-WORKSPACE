package in.cdac.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\Java Files Handling\\delhi.txt" ;
		FileWriter fw = new FileWriter(filePath);
		fw.write("\nOrborous");
		fw.write("\nYggdrasil");
		fw.write("\nFafnir");
		fw.write("\n");
		fw.write(100);  // It will write d
		fw.flush();
		fw.close();
	}

}
