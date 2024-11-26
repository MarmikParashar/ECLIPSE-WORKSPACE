package in.cdac.Serialization;

import java.io.*;
public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\Java Files Handling\\Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stdobj = (Student) ois.readObject();		// Casting is required
		stdobj.display();
		ois.close();
		
		
		

	}

}
