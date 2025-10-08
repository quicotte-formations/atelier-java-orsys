package orsys.atelier.classesetfonctionsutiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		String pays = "eSpagne,ITalie,cHine";
		
		String[] tabPays = pays.split(",");
		for(String p : tabPays) {
			System.out.println( p.toLowerCase() );
		}
	}
}
