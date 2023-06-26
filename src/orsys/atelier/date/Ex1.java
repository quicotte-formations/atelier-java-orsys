package orsys.atelier.date;

import java.time.LocalDate;

public class Ex1 {
	
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println( date.getDayOfWeek() );
	}
}
