package orsys.atelier.vars;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Entrez un entier : " );
		String input = scanner.next();
		int resultat = Integer.valueOf(input) * 2;
		
		System.out.println( resultat );
		
		scanner.close();
	}
}
