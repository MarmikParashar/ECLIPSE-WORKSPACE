package in.cdac.garbagecollector;

public class GCTest1 {

	public static void main(String[] args) {

		String str = new String("CDAC");
		GCTest gc = new GCTest();
		gc.finalize();
		gc.finalize();
		// str = null ;
		gc = null ;
		System.gc();
		System.out.println("End of Main Method");
		
	}
	
	public void finalize() {
		System.out.println("finalize() method is executed");
		System.out.println(10/0);
		System.out.println("End of finalize() method");
	}

}
