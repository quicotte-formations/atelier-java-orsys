package orsys.atelier.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex4 {
	
	public static void main(String[] args) throws ParseException {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("27/02/2020", fmt);
		LocalDate datePlus10Jours = date.plusDays(10);
		
		System.out.println( datePlus10Jours.format(fmt) );
		
		
	}
}
