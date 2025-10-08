package orsys.atelier.classesetfonctionsutiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {

	public static void main(String[] args) {
		String motsStr = "libellule,lullaby,escargot";
		
		String[] mots = motsStr.split(",");
		for(String mot : mots) {
			if( !mot.contains("le") && !mot.contains("la") ){
				System.out.println( mot );
			}
		}
	}
}
