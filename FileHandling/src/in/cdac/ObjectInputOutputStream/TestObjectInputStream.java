package in.cdac.ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Create an file output stream for file object
		FileOutputStream fos = new FileOutputStream("D:\\\\Java Files Handling\\\\cdac.txt");
		 
		// Create object for ObjectOutputStream Class
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeUTF("John");
		oos.writeInt(150);
		oos.writeDouble(16.79);
		oos.writeObject(new java.util.Date());
		
		FileInputStream fis = new FileInputStream("D:\\Java Files Handling\\cdac.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		String name = ois.readUTF();
		int empId = ois.readInt();
		double dvalue = ois.readDouble();
		Date date = (Date)ois.readObject();
		
		System.out.println("Name : "+ name );
		System.out.println("Employee Id : " + empId);
		System.out.println("Value : " + dvalue);
		System.out.println("Date : " + date);

	}

}
