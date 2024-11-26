package in.cdac.genericmethod;

class GenericClass<T> {
	T name;
	GenericClass(T name) {
		this.name = name ;
		
	}
	public T method1() {
		return name ;
	}
}

class MyClass2<T1,T2> {
	T1 obj1 ;
	T2 obj2;
	// Constructor
	MyClass2(T1 obj1 , T2 obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	T1 getMehod1() {
		return obj1;
		
	}
	T2 getMethod2(){
		return obj2;
	}
}
public class GenericClassTest {

	public static void main(String[] args) {
		
		GenericClass<String> gc = new GenericClass<>("Markile");
		System.out.println(gc.method1());
		
		MyClass2<String , Integer> mc2 = new MyClass2("Fallen", 25) ;
		System.out.println(mc2.getMehod1() +" , " + mc2.getMethod2());
		
		
	}

}
