package in.cdac.Constructor;

public class DefaultConstructor {

	// instance variable 
	String name;
	int age;
	String address;
	
	public DefaultConstructor() {
		// Super function is added automatically
		
		super();		// It is optional 
		name = "John Carter";
		age = 32;
		address = "Delhi";
		System.out.println(name + " " + name + " " + address);
	}
	
	public static void main(String[] args) {
		new DefaultConstructor();
		
	}

}
