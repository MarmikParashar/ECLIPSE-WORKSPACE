package in.cdac.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class CheckLeapYear {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		if (today.isLeapYear()) {
			System.out.println("This Year is a Leap Year");
		}
		else {
			System.out.println("This Year is not a Leap Year");
		}
		
		LocalTime time = LocalTime.now();
		System.out.println("Loca Time :" + time);
		
		LocalTime newTime = time.plusHours(2);
		System.out.println("Time After 2 Hours : " + newTime);
		
		

	}

}
