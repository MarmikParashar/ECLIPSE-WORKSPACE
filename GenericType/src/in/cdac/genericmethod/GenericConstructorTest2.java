package in.cdac.genericmethod;

class A {
	int x ;
	A(int x ){
		this.x = x ;
		
	}
}

class B extends A {
	String str;
	B(String str){
		super(20) ;				// Calling Super Class A Constructor
		this.str = str ;
	}
}

class C extends B {
	double d ;
	C(double d ){
		super("Markile"); 		// Calling Super Class B constructor 
		this.d = d ;
	}
}

class D {
	D(){
		
	}
}

class TestClass2 {
	A a ;

	<T extends A >TestClass2(A a) {
		this.a = a ;
	}
}
public class GenericConstructorTest2 {

	public static void main(String[] args) {
		A a = new A(25);
		TestClass2 tc = new TestClass2(a);
		
		B b = new B("Markile");
		TestClass2 tc1 = new TestClass2(b);
		
		C c = new C(10.75);
		TestClass2 tc2 = new TestClass2(c);
		
		D d = new D();
	//	TestClass2 tc3 = new TestClass2(d);		// Invalid because D is not the Child Class of A
		
		
		

	}

}
