package in.cdac.genericmethod;
interface A1<T>{
	public void method1(T t) ; 	// t is the name of variable
} 

public class GenericInterfaceTest<T> implements A1<T>{
	
	@Override
	public void method1(T t) {
		System.out.println("Value = " + t);
		
	}
	public static void main(String[] args) {
		
		GenericInterfaceTest<Integer> gi = new GenericInterfaceTest<Integer>();
		gi.method1(99);
		
		GenericInterfaceTest<String> gi2 = new GenericInterfaceTest<String>();
		gi2.method1("Nihility");
		
	}

	

}
