package orsys.atelier.async;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Ex1 {

	public static boolean estPremier(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int menu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("***************************");
		System.out.println("1. Afficher nbres 1 à 100**");
		System.out.println("2. Afficher nbres 100 à 200");
		System.out.println("3. Quitter");
		System.out.println("***************************");
		int choix = scanner.nextInt();
		switch (choix) {
		case 1: {
			for (int i = 1; i < 101; i++) {
				System.out.println(i);
			}
			break;
		}
		case 2: {
			for (int i = 100; i < 201; i++) {
				System.out.println(i);
			}
			break;
		}
		case 3: {
			break;
		}
		default:
			System.out.println("!!! CHOIX INVALIDE !!!");
			break;
		}
		return choix;
	}

	public static void main(String[] args) {

		// THREAD //
		CompletableFuture cf = CompletableFuture.runAsync( ()->{
			
			List<Integer> premiers = new ArrayList<Integer>();
			for(int i=0;i<1000000;i++) {
				if( estPremier(i) ) {
					premiers.add(i);
				}
			}
			
			System.out.println(premiers);
		}
		);
		
		// MENU
		int leChoix = -1;
		do {

			leChoix = menu();

		} while (leChoix != 3);
		
		// Attend fin du thread cf (si pas déjà fini)
		cf.join();
	}
}
