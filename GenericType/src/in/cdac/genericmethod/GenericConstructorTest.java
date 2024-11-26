package in.cdac.genericmethod;

class TestClass{
	String obj ;
	// Constructor
	<T extends Object>TestClass(String obj ) {
		this.obj = obj ;
		System.out.println("Name : " +obj);
		
	}
	
	void displayClassName () {
		System.out.println("Name of Class : " + obj.getClass().getName());
	}
}
public class GenericConstructorTest {

	public static void main(String[] args) {
		
		TestClass tc = new TestClass("Markile");
		tc.displayClassName();
	}

}
