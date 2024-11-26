package in.cdac.garbagecollector;

import java.util.Date;

public class RunTimeExample {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total memory of the heap :" + rt.totalMemory());
		System.out.println("Total free memory in heap :" + rt.freeMemory());
		
		for (int i = 0; i < 10000; i++) {
			Date d = new Date();
			d = null ;
		}
		System.out.println("Total memory of the heap :" + rt.totalMemory());
		rt.gc();
		System.out.println("Total free memory in heap :" + rt.freeMemory());
		System.out.println("Total memory of the heap :" + rt.totalMemory());
	}

}
