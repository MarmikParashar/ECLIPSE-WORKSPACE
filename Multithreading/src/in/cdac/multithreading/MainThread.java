package in.cdac.multithreading;

public class MainThread {

	public static void main(String[] args) {
		Thread obj = Thread.currentThread();
		System.out.println("Current Thread : " + obj);
		System.out.println("Name of the Current thread : " + obj.getName() );
		
		obj.setName("New Thread");
		System.out.println("Name of Current Thread after changing the name : " + obj);
		System.out.println("Name of Current Thread after changing the name : " + obj.getName());
	}
	
	

}
