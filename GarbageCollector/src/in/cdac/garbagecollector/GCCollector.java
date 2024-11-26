package in.cdac.garbagecollector;

import java.util.Iterator;

public class GCCollector {
	public  static void createObjects(int count) {
		for (int i = 0; i < count ; i++) {
			new Object();
		}
	}
	public static void main(String[] args) {
		long m1 , m2 , m3 ;
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		
		for (int i = 0; i < 3 ; i++) {
			// free the memory
			m1 = rt.freeMemory();
			createObjects(1000);
			m2 = rt.freeMemory();
			
			// invoking the garbage collection
			System.gc();
			m3 = rt.freeMemory();
			System.out.println("m1 = " + m1 );
			System.out.println("m2 = " + m2 );
			System.out.println("m3 = " + m3 );
			System.out.println("-------------");
		}
	}

}
