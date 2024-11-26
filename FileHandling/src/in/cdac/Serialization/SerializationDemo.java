package in.cdac.Serialization;

import java.io.*;

class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;		// Serial Id
	
	int rollno;
	String name;
	String address;
	private transient int studentAge = 25 ;		// Transient variable will not serialize it will remain in main file
	
	Student(int rollno , String name , String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
	}
	void display() {
		System.out.println("Rollno : " + rollno + "\nName : " + name + "\nAddress : " + address + "\nStudent Age : " + studentAge) ;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		Student student = new Student(101, "Markile", "Delhi");
		FileOutputStream fos = new FileOutputStream("D:\\Java Files Handling\\Student.txt"); 	// OutputStream is used for writing info into the file
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// Do the Serialization
		oos.writeObject(student);
		System.out.println("Object is Written into the Student.txt File : \n");
		
		// Close the connection
		oos.close();
		fos.close();
		
		
	}

}
