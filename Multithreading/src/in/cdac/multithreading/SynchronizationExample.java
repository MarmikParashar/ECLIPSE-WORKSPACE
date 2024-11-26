package in.cdac.multithreading;

public class SynchronizationExample implements Runnable{

	int tickets = 3;
	static int i = 1 , j = 2 , k = 3 ;
	public synchronized void bookTickets(String name , int wantedTickets) {
		
		if (wantedTickets <= tickets) {
			System.out.println(wantedTickets + " Booked To : " + name);
			tickets -= wantedTickets;
		}
		else {
			System.out.println("Sorry!! "+ name + " Tickets are no longer available !");
		}
		
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("Markile")) {
			bookTickets(name, i);
		}
		else if (name.equals("Noir")) {
			bookTickets(name, j);
		}
		else{
			bookTickets(name, k);
		}
		
	}

	public static void main(String[] args) {
		SynchronizationExample ws = new SynchronizationExample();
		Thread t1 = new Thread(ws);
		Thread t2 = new Thread(ws);
		Thread t3 = new Thread(ws);
		
		t1.setName("Markile"); 		// First Passenger Name
		t2.setName("Noir"); 		// Second Passenger Name
		t3.setName("Blanc"); 		// Third Passenger Name
		
		t1.start();
		t2.start();
		t3.start();
		


	}

}
