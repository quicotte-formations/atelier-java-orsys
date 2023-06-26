package orsys.atelier.classesetfonctionsutiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {

	public static void main(String[] args) {
		String texteEntre = "tom,lulu,goupil";
		String[] prenoms = texteEntre.split(",");
		
		for(String prenom : prenoms) {
			
			System.out.println( prenom );
		}
	}
}
