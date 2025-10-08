package orsys.atelier.structctrl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		String reponse;
		Scanner scan = new Scanner(System.in);
		do {
			int nbreOrdi = (int) ( Math.random() * 100 );
			int choix;
			int essais = 0;		
			
			do {
				System.out.print("Votre proposition : ");
				choix = scan.nextInt();
				if( choix<nbreOrdi ) {
					System.out.println("Le nombre recherche est >");
				}else if ( choix>nbreOrdi ) {
					System.out.println("Le nombre recherche est <");
				}
				essais++;
			}while( choix!=nbreOrdi );
			
			System.out.println("Partie gagnée en " + essais + " essais" );
			
			System.out.println("Recommencer o/n : ");
			reponse = scan.next();
			
			
		} while( reponse.equals("o") );
		
		scan.close();
	}
}
