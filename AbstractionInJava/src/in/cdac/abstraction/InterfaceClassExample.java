package in.cdac.abstraction;

interface A {
	void msg();
}

interface B  extends A{
	void msg();
	void display();
}

public class InterfaceClassExample implements A , B{


	@Override
	public void msg() {
		System.out.println("Get Method");
	}
	public void show () {
		System.out.println("Show Method");
	}
	
	public static void main(String[] args) {
		InterfaceClassExample ie = new InterfaceClassExample();
		ie.msg();
		ie.show();
		
		A a = new InterfaceClassExample(); 		// Valid
		a.msg();		// Allowed 
	//	a.show();		// Not Allowed because show method is not available in an Interface 
	}
	@Override
	public void display() {
		
		
	}
	
	
}
