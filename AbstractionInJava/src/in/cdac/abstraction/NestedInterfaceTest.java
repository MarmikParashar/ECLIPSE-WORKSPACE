package in.cdac.abstraction;

import in.cdac.abstraction.OuterInterface.InnerInterface;

interface OuterInterface {
	void method1();		// Abstract interface of outer interface class
	interface InnerInterface {
		void method2(); 	// Abstract interface of inner interface class 

	}
}

class MyClass1 implements OuterInterface {

	@Override
	public void method1() {
		System.out.println("Method1 implementation of Outer Interface");
		
	}
	
}

class MyClass2 implements InnerInterface {

	@Override
	public void method2() {
		System.out.println("Method2 implementation of Inner Interface");
	}
	
}

public class NestedInterfaceTest{

	public static void main(String[] args) {
		
		MyClass1 mc1 = new MyClass1();
		mc1.method1();
	}

}
