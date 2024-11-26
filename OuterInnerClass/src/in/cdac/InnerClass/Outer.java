package in.cdac.InnerClass;

public class Outer {
	String name = "Markile" ;
	class A {
		private String name = "Asura"; 
		class B {
			String name = "Tenma";
			
			public void display() {
				
				System.out.println("Welcome!!");
				System.out.println(Outer.this.name);
				System.out.println(A.this.name);
				System.out.println(name);
			}
		}
	}
	public static void main(String[] args) {
		Outer ot = new Outer();
		Outer.A Aobj = ot.new A();
		Outer.A.B Bobj = Aobj.new B();
		Bobj.display();
		
	}

}
