package in.cdac;

public class Sum {
	public static void add(int a , float b) {
		System.out.println(a+ b);
	}
	
	public static void add(float a , int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a , int b , int c) {
		System.out.println(a+ b + c);
	}
	
	public static void main(String[] args) {
		
		add(1, 15.7f);
		add(5.2f,3);
		add(42,10,5);
		

	}

}
