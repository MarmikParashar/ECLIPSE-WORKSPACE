package in.cdac.Constructor;

class School {
	String stName ;
	int stRoll ;
	int stId ; 
	
	// constructor 
		
	School(String stName , int stRoll , int stId){
		
		this.stName = stName;
		this.stRoll = stRoll ;
		this.stId = stId; 
	}

	public void display() {
		System.out.println("Name : " + stName);
		System.out.println("Roll no.  : " + stRoll);
		System.out.println("ID : " + stId);
		
	}
}
public class SuperFunction extends School {
	// default constructor
	SuperFunction() {
		super("Ravi ", 10 , 123);		// It will call the super class constructor with passing three arguments valules
	}
	
	public static void main(String[] args) {
		SuperFunction sf = new SuperFunction(); // Calling the default constructor of Super Function 
		//and it is calling parameterized constructor
		// of school class constructor
		sf.display();
	}

}
