package orsys.atelier.classesetfonctionsutiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		List<String> prenoms = Arrays.asList("tom","lulu","goupil");
		
		for(String prenom : prenoms) {
			
			System.out.println( prenom.toUpperCase() );
		}
	}
}
