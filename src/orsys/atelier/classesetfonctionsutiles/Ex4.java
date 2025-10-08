package orsys.atelier.classesetfonctionsutiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {

	public static void main(String[] args) {
		String txt="0,90,180,270,360";
		
		String[] angles = txt.split(",");
		for(String angle : angles) {
			System.out.println( Math.cos(Double.parseDouble(angle)) );
		}
	}
}
