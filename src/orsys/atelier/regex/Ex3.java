package orsys.atelier.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("([0-9]+) ([a-z,A-Z]+) ([a-z,A-Z,\\-, ]+), ([0-9]{5}) ([a-z,A-Z]+)");
		Matcher matcher = pattern.matcher("70 Boulevard Gambetta, 75020 Paris");
		matcher.find();
		System.out.println( String.format("Adresse : %s %s %s,%s %s", 
				matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5)) );
	}
}
