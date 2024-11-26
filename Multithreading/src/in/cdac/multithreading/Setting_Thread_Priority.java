package in.cdac.multithreading;

public class Setting_Thread_Priority implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
	}
	
	public static void main(String[] args) {
		Setting_Thread_Priority st = new Setting_Thread_Priority();
		Thread t1 = new Thread(st , "FIrst Thread") ;
		Thread t2 = new Thread(st , "Second Thread") ;
		Thread t3 = new Thread(st , "Third Thread") ;
		
		t1.setPriority(3);
		t2.setPriority(2);
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
