package in.cdac.InnerClass;

public class OuterClass {
	
	class InnerClass{
		public void innerMethod() {
			System.out.println("Inner method of Inner Class");
		}
	} // Inner Class ends here
	
	
	public void OuterMethod() {
		
		System.out.println("Outer Method of Outer Class");
		InnerClass ic = new InnerClass();
		ic.innerMethod();
	}
	
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		oc.OuterMethod();
	}

}