package in.cdac.genericmethod;
class MyClass {
	// generic method
	public <T> void display(T[] array) {
		for(T x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
public class GenericMethodTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		Integer[] arr1 = {10,20,30,40,50};
		myClass.display(arr1);
		
		String[] arr2 = {"Azathoth","Nodens","Cuthuga","Cuthulu","Hastur"} ;
		myClass.display(arr2);
	}

}
