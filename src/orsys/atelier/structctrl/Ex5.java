package orsys.atelier.structctrl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		int secret = 78;
		int prop = 0;
		int lastMin = 0;
		int lastMax = 101;
		int nbEssais = 0;
		
		while(prop!=secret) {
			nbEssais++;
			prop = lastMin + ((lastMax - lastMin)/2);
			
			if(secret>prop) {
				System.out.println(prop + " plus grand");
				lastMin = prop;
			}else if(secret<prop) {
				System.out.println(prop + " plus petit");
				lastMax = prop;
			}
		}
		
		System.out.println( "Nombre secret : " + secret + " trouve en " + nbEssais + " essais." );
		
	}
}
