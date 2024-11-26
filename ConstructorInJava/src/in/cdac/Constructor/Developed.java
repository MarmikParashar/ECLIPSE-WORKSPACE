package in.cdac.Constructor;

public class Developed {
	
	// Default Constructor
	Developed() {
		System.out.println("Java Developed by James Gosling !!");
	}
	
	// Create a ONE Parameterized Constructor
	
	Developed(int year){
		this("James Gosling ", 1995);		// It must be the first line of code otherwise an error will occur
		System.out.println("James Gosling is known as the father of JAVA");
	}
	
	// Create a TWO Parameterized Constructor
	
	Developed(String name , int year){
		this(); // it will call default constructor
		System.out.println("at Sun Micorsoft and realsed in 1995");
	}
	
	// instance method Constructor 
	
	void display() {
		System.out.println("The java Compiler is written in C and C++ Language ");
	}
	

	public static void main(String[] args) {
		
		// Create an object for Developed Class
		// Developed dev1 = new Developed();
		
		// Calling Default Constructor
		Developed dev2 = new Developed(1995); // It will call one parameterized Constructor
//		Developed dev3 = new Developed("James Gosling" , 1995); // Calling Two Parameterized Constructor	

		
	}

}
