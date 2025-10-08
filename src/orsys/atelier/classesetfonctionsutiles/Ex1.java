package orsys.atelier.classesetfonctionsutiles;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		
		List<String> prenoms = Arrays.asList("tom","lulu","goupil");
		
		prenoms.forEach( prenom -> System.out.println( prenom.toUpperCase() ) );
	}
}
