package orsys.atelier.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(^[a-z,A-Z]{2,})-?([a-z,A-Z]*$)");
		Matcher matcher = pattern.matcher("Jean-Paul");
		boolean ok = matcher.matches();
		
		System.out.println( ok );
	}
}
