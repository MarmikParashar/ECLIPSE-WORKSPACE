package in.cdac.dateandtime;

import java.util.*;
import java.util.GregorianCalendar;

public class CalanderTest {
	
	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance(); // Gregorian Calander
		System.out.println("Calander :" + cal + "\n");
		
		System.out.println("Time Zone :" + cal.getTimeZone());
		
		Date date = cal.getTime();
		System.out.println("Current date and time : " + date);
	}
}
