package in.cdac.person;

public class Person {
	private String name , address ;
	
	// construct an object with given name and address
	Person(String name , String address){
		this.name = name ;
		this.address = address;	
	}
	
	// getters and setters to access private fields outside the class
	
	public String getName() {
		return name ;
	}
	
	public String getAddress() {
		return address ;
	}
	
	public void setAddress(String address) {
		this.address = address ;
	}
	
	@Override
	public String toString() {
		return "Name :" + name + "\nAddress : " + address ;
	}
	
}

