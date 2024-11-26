package in.cdac.String;

public class StringBuliderExamples {

	public static void main(String[] args) {
		String s ;
		StringBuilder sb = new StringBuilder("Hello") ;
		StringBuilder sb2 = sb.append("Java") ;
		System.out.println("New String = " + sb2);
		
		int x = 8 ;
		s = sb.append(" ").append(x).append("!").toString();
		System.out.println(s);
		
		StringBuilder str = new StringBuilder("ABC") ;
		str.append("D") ;
		System.out.println("After Adding D : " + str.toString());
		
		str.append("EFG" , 0 , 1 ) ;
		System.out.println("After adding EFG : " + str);
		
		System.out.println(str.reverse());
		
		System.out.println("To measure capacity : " + str.capacity());
	}

}
