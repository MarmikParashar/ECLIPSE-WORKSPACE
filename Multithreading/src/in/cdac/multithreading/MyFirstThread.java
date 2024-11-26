package in.cdac.multithreading;

import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside the Run Method ");
		
		// Calling the Go method in the Run Method
		go();
	}
	
	public void go() {
		System.out.println("Inside Go Method .....");
		
		// Calling the more() method inside the GO method
		more();
	}
	
	public void more() {
		
		System.out.println("Inside the more method ......");
	}
	
}
public class MyFirstThread {

	public static void main(String[] args) {
		
		Task task = new Task() ;
		Thread thread = new Thread(task) ;	// New Thread Created
		thread.start();
		
		try {
			
			TimeUnit.SECONDS.sleep(3); 		// 3000 ms -> 3 Sec
			
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Inside the Main Method");

	}

}
