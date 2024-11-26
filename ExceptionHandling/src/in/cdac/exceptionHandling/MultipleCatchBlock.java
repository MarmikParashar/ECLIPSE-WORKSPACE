package in.cdac.exceptionHandling;

public class MultipleCatchBlock {
	
		public static void main(String[] args) {
			System.out.println("111");
			try {
				System.out.println("ABC");
				int z = 1 / 0;

			} catch (ArithmeticException ex) {
				System.out.println("xyz");
				try {
					System.out.println("poll");
					int a = 10 / 0;
					System.out.println(a);
				} catch (NullPointerException ew) {
					System.out.println("qwert");
				}
			}
		System.out.println("main method closed");
		}
	}