package in.cdac.Enum;

public class EnumExamples {
	enum months {
		JAN, Feb, Mar, Dec;

		private months() {
			
			System.out.println("Constructor of enum");
		}
		public static void main(String[] args) {
			System.out.println("Main method of enum");
		}
		
		
	}

	public static void main(String[] args) {
		months mon = months.JAN;
		System.out.println(mon);

		switch (mon) {
		case JAN:
			System.out.println("It is January");
			break;
		case Feb:
			System.out.println("It is Febuary");
			break;
		case Mar:
			System.out.println("It is March");
			break;
		case Dec:
			System.out.println("It is December");
			break;
		default:
			System.out.println("Wrong Option");
			break;
		}
		
		months[] arr = months.values();
		for(months m : arr ) {
			System.out.println(m + ": " + m.ordinal());
		}
	}
}
