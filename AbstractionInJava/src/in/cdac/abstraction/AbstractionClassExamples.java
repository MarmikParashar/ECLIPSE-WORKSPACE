package in.cdac.abstraction;

abstract class MyClass {
	abstract void msg();
	
}
public class AbstractionClassExamples extends MyClass {

	public static void main(String[] args) {
		

	}

	@Override
	void msg() {
		System.out.println("Msg from child class");
		
		
	}

}
