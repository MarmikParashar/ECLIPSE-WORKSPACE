package in.cdac.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		// E -> Day of Week
		// M -> Month
		// h -> Hour
		// m -> Minute
		// s -> Second
		// a -> AM/PM
		// H -> hour(0-23)
		// z -> Time Zone

		SimpleDateFormat dateFormate = new SimpleDateFormat("E , y-M-d 'at' h:m:s a ");
		System.out.println("Format 1 : " + dateFormate.format(now));
		
		dateFormate = new SimpleDateFormat("EEE , YYYY.MM.d 'at' hh:mm:ss a zzz ");
		System.out.println("Format 2 : " + dateFormate.format(now));
		
//		dateFormate = new SimpleDateFormat("EEE , YYYY.MM.d 'at' hh:mm:ss a zzz ");
//		System.out.println("Format 3 : " + dateFormate.format(now));
		
		
	}

}
