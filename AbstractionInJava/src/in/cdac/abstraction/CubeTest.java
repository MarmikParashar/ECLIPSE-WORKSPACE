package in.cdac.abstraction;

class Cube {
	// interface declared inside the class 
	
	protected interface Number {		// Don't take interface as private
		public void calculateCube(int n ) ;
	}
}

class A1 implements Cube.Number { 		// becomes invisible for other class if interface is private

	@Override
	public void calculateCube(int n) {
		int res = n * n * n ;
		System.out.println("Cube of " + n +" is :" + res);
		
	}
	
}
public class CubeTest {

	public static void main(String[] args) {
		A1 a = new A1();
		a.calculateCube(5);
		
	}

}
