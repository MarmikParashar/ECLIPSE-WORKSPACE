package in.cdac.Constructor;

class Customer{
	
	private Customer() {
		System.out.println("Private Constructor of Customer Class :");
	}
}

public class PrivateConstructor {
	
	String name ;
	int age ;
	
	// private constructor declaration 
//	static  PrivateConstructor(String n , int age) { 
//		Constructor Cannot be declared as static
	
//	}
	private PrivateConstructor(String n , int age) {
		
		name = n;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name :" + name + " Age : " + age);
	}
	
	public static void main(String[] args) {
		PrivateConstructor pc = new PrivateConstructor("Rahul", 22);
		pc.display();
//		Customer c = new Customer(); // Private Constructors are not visible
		
		

	}

}
