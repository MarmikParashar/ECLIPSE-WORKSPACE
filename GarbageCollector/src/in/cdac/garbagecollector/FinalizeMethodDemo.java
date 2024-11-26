package in.cdac.garbagecollector;

public class FinalizeMethodDemo {
	static FinalizeMethodDemo fm1 ;
	public static void main(String[] args) throws Exception{
		FinalizeMethodDemo fmd = new FinalizeMethodDemo();
		System.out.println(fmd.hashCode());
		fmd = null ;
		System.gc();
		Thread.sleep(5000);
		System.out.println(fm1.hashCode());
		fm1 = null ;
		System.gc();
		Thread.sleep(5000);
		System.out.println("End of finalize() method");

	}
	public void finalize() {
		System.out.println("finalize() method is executed");
		
	}

}
