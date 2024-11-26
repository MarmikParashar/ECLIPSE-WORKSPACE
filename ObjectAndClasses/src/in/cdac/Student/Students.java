package in.cdac.Student;

public class Students {
	// fields / structure / instance variables
	public int Student_ID;
	public String Student_Name;
	// method to do particular task
	public void StudentDeatils() {
	System.out.println("Student Class Method");
	}
	
	public static void main(String[] args) {
		
		// create an object/ instrument 
		Students stdObj = new Students();
		stdObj.Student_ID = 101 ;
		stdObj.Student_Name = "Markile Dawn" ;
		stdObj.StudentDeatils();
		System.out.println("Student Id :" + stdObj.Student_ID);
		System.out.println("Student Name : " + stdObj.Student_Name);
		
		/*
		 after the creation of an object , JVM produces a unique
		 reference number (address) for that object. This unique reference 
		 number is called hash code number.
		 */
		
		System.out.println("Hash Code Number : " + stdObj.hashCode());
		Students std1 = new Students();
		System.out.println("Hash Code Number : " + std1.hashCode());
		
	}

}
