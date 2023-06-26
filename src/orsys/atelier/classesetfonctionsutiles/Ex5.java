package orsys.atelier.classesetfonctionsutiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {

	public static void main(String[] args) {
		String txtNumbers="1-2-3-4-5";
		String[] numbers = txtNumbers.split("-");
		for (String number : numbers) {
			int n = Integer.parseInt(number);
			double cosinus = Math.cos( n );
			System.out.println( String.format("%.2f", cosinus) );
		}
	}
}
