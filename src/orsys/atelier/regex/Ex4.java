package orsys.atelier.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("([a-z,A-Z]+) ([a-z,A-Z]+), ([0-9]+)");
		Matcher matcher = pattern.matcher("Thomas Digna, 46");
		matcher.find();
		System.out.println(String.format("Prenom=%s Nom=%s Age=%s", matcher.group(1), matcher.group(2), matcher.group(3)));
	}
}
