package in.cdac.garbagecollector;

public class GCTest {

	public static void main(String[] args) {
		
		String str = new String("CDAC");
		GCTest gc = new GCTest();
		str = null ;
		System.gc();
		System.out.println("End of Main Method");
		
	}
	
	public void finalize() {
		System.out.println("finalize() method is executed");
	}

}
