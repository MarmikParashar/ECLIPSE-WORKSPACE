package in.cdac.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSet {

	public static void main(String[] args) {
		try{
			Class c =Class.forName("java.lang.Object");
			
			System.out.println("Class Name : " + c.getName());
			System.out.println("\nList of constructors :");
			Constructor constructor[] = c.getConstructors();
			for(int i=0; i<constructor.length; i++)
			{
				System.out.println(constructor[i]);
			}
			
			System.out.println("\nList of fields :");
			Field fields[] = c.getFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}
			
			System.out.println("List of Methods");
			Method methods[] = c.getMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception Caught");
		}

	}

}
