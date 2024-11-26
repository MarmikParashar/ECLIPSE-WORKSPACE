package in.cdac.dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		int year , month , day ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Birth Year : ");
		year = sc.nextInt();
		
		System.out.print("Enter the Birth Month : ");
		month = sc.nextInt();
		
		System.out.print("Enter the Birth Day : ");
		day = sc.nextInt();
		
		LocalDate bdate = LocalDate.of(year, month, day);
		
		// Find the current date
		LocalDate now = LocalDate.now();
		
		// Difference between current date and DOB
		Period diff = Period.between(bdate , now);
		System.out.printf("I am %d years , %d Months and %d Days Old " , diff.getYears() , diff.getMonths() , diff.getDays());
		sc.close();
		
	}

}
