package orsys.atelier.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[\\w\\.-]+@[\\w\\.-]+.[a-z,A-Z]+$");
		Matcher matcher = pattern.matcher("quicotte@gmail.com");
		boolean ok = matcher.matches();
		
		System.out.println( ok );
	}
}
