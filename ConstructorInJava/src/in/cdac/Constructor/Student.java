package in.cdac.Constructor;

class Employee{
	//instance variables
		String name ;
		String SchoolName ;
		int std ;
		String city;

		public Employee(String stdname , String SchoolName , int std , String city ) {
			// Here the parameters are same as that of variables declared inside the class
			System.out.println("Constructor Called");
						
			// this keyword refers to the current object
			// Compiler cannot identify the global and local 
			//variable uniquely  if they are of same name without using this keyword
			name = stdname ;
			this.SchoolName = SchoolName ;	
			this.std = std ;
			this.city = city ;
					
			}
		
		public Employee(Student st) {
			name = st.name ;
			this.SchoolName = st.SchoolName ;	
			this.std = st.std ;
			this.city = st.city ;
				
			}
	
	// instance method
	public void empDetails() {
		System.out.println(name + " " + SchoolName +" " + std +" " + city);
	}
}	

public class Student {

	//instance variables
	String name ;
	String SchoolName ;
	int std ;
	String city;
	
	// Parameterized Constructor
	public Student(String stdname , String SchoolName , int std , String city ) {
	// Here the parameters are same as that of variables declared inside the class
	System.out.println("Constructor Called");
				
	// this keyword refers to the current object
	// Compiler cannot identify the global and local 
	//variable uniquely  if they are of same name without using this keyword
	name = stdname ;
	this.SchoolName = SchoolName ;	
	this.std = std ;
	this.city = city ;
			
	}
	
	public Student(Student s) {
		
	}
	
	// instance method
	public void StudentDetails() {
		System.out.println(name + " " + SchoolName +" " + std +" " + city);
	}
	
	
	public static void main(String[] args) {
		
		Student std = new Student("Markile", "KV ", 5, "New Delhi");
		std.StudentDetails();
		Employee emp = new Employee(std);
		emp.empDetails();
	}

}

