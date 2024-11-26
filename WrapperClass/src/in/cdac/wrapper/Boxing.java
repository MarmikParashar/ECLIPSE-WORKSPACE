package in.cdac.wrapper;

public class Boxing {

	public static void main(String[] args) {
		// primitive int
		int primitiveInt = 10;
		Integer boxedInt = Integer.valueOf(primitiveInt);
		System.out.println(boxedInt);
		if(boxedInt instanceof Integer) {
			System.out.println("Value is of type Integer");
		}
		else {
			System.out.println("Value is of int type");
		}
		System.out.println(boxedInt.getClass().getName());
	}

}
