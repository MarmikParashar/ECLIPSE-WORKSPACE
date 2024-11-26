package in.cdac.InnerClass;

class A{		// Outer Class or Enclosing Class
	int a = 20 ;
	static int b = 34 ;
	private int c = 65;
	static class B {		// Static Inner Class 
		void display() {		
		//	System.out.println(a);  // Compile time error
			System.out.println(b);  	// No problem accessing b as it is a static integer
		//	System.out.println(c);
		}
	}
}

public class TestOuterInnerClass {
		
	public static void main(String[] args) {
		A.B bobj = new A.B();
	//	B.obj = new B();	// Not allowed
		bobj.display();

	}

}
