package orsys.atelier.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) throws ParseException {

		// Avec Date et SimpleDateFormat
		SimpleDateFormat formatFr = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatFr.parse("31/12/2030");
		SimpleDateFormat formatEn = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(formatEn.format(date));

		// Avec LocalDate et DateTimeFormatter
		DateTimeFormatter dateTimeFormatterFr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateTimeFormatterUs = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.parse("31/12/2030", dateTimeFormatterFr);
		System.out.println(localDate.format(dateTimeFormatterUs));
	}
}
