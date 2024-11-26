package in.cdac.reflection;

import java.lang.reflect.*;

class Test{
	private String name;
	
	public Test() {
		name = "private data";
	}
	
	public void method1() {
		System.out.println("Welcome: " + name);
	}
	
	protected void method2(int x) {
		System.out.println("Value = " + x);
	}
	private void method3() {
		System.out.println("Private Method3");
		
	}
	
}

public class ReflectionTest2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	
				Test t = new Test();
				Class obj = t.getClass();
				System.out.println("Class Name: " + obj.getName());
				
				Constructor constructor[] = obj.getConstructors();
				System.out.println("Constructor Name : " + obj.getName());
				
				System.out.println("List of Methods");
				Method methods[] = obj.getMethods();
				for (int i = 0; i < methods.length; i++) {
					System.out.println(methods[i].getName());
				}
				
				Field field = obj.getDeclaredField("name") ;
				field.setAccessible(true); 			// now you can access the private name 
				
				// the class
				field.set(t,"Rohan");
				
				Method methodCall1 = obj.getDeclaredMethod("method1") ;
				methodCall1.invoke(t) ;
				
				// Invoking the private method
				Method methodCall3 = obj.getDeclaredMethod("method3") ;
				methodCall3.setAccessible(true);
				methodCall3.invoke(t) ;
				
				// Access protected method outside class
				Method methodCall2 = obj.getDeclaredMethod("method2" , int.class) ; 
				methodCall2.invoke(t , 100 ) ;
				
				
				

		}

}
		

