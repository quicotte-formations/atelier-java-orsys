package orsys.atelier.exercices_supplementaires;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Memory {

	public static void main(String[] args) {
		ArrayList<Integer> cartes = new ArrayList<Integer>();
		ArrayList<Integer> paquetCartesOrdreOriginal = new ArrayList<Integer>();
		ArrayList<Integer> cartesOrdreOriginal = new ArrayList<Integer>();
		ArrayList<Integer> cartesDuJoueur = new ArrayList<Integer>();
		ArrayList<String> cartesAaffiche = new ArrayList<String>();
		boolean hasWon;
		boolean isGameover;
		int tentatives = 0;
		Scanner scan = new Scanner(System.in);

		// Création et mélange cartes -> cartes
		cartes.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10));
		paquetCartesOrdreOriginal.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10));
		cartesOrdreOriginal.addAll(cartes);
		Collections.shuffle(cartes, new Random());
		isGameover = false;
		// Boucle de jeu
		do {

			// Joue un tour de jeu si il reste des cartes
			if (cartes.size() > 0) {

				// Demande indice 2 cartes
				System.out.println(
						"\n################################ SAISIE DU JOUEUR ################################\n");
				System.out.println("Choisissez une première carte (Chiffre entre 0 et " + (cartes.size() - 1) + ") :");
				int indexCarteChoisieA = scan.nextInt();
				System.out.println("Choisissez une deuxième carte (Chiffre entre 0 et " + (cartes.size() - 1) + ") :");
				int indexCarteChoisieB = scan.nextInt();

				// Ligne horiz
				addMsgDelimiter();

				// Récup carte à partir indice
				int carteChoisieA = cartes.get(indexCarteChoisieA);
				int carteChoisieB = cartes.get(indexCarteChoisieB);

				// Affiche cartes retournées
				displayCards(cartes, cartesAaffiche, indexCarteChoisieA, indexCarteChoisieB, carteChoisieA,
						carteChoisieB);

				addMsgDelimiter();

				// Si cartes identiques on les enlève dce la liste cartes masquées et + ds liste
				// cartes trouvées
				if (carteChoisieA == carteChoisieB) {
					hasWon = true;
					cartesDuJoueur.addAll(Arrays.asList(carteChoisieA, carteChoisieB));
					printMessageWonGame(carteChoisieA, carteChoisieB);

					cartes.removeAll(Arrays.asList(carteChoisieA, carteChoisieB));
					cartesOrdreOriginal.removeAll(Arrays.asList(carteChoisieA, carteChoisieB));
				} else {
					hasWon = false;
					printMessageLostGame(carteChoisieA, carteChoisieB);
				}
				System.out.println(
						"\n################################ CARTES DU JOUEUR ################################\n");
				System.out.println("Vos cartes = " + cartesDuJoueur);

				addMsgDelimiter();

				printLogs(indexCarteChoisieA, indexCarteChoisieB, carteChoisieA, carteChoisieB,
						paquetCartesOrdreOriginal, cartes, cartesAaffiche, cartesOrdreOriginal, hasWon, cartesDuJoueur);
			} else {
				// Plus de cartes : passe booleen isGameover à true
				isGameover = true;
				manageGameOver(isGameover, tentatives);
			}
			tentatives += 1;
		} while (!isGameover);
	}

	/**
	 * Fonction qui affiche les cartes
	 */
	public static void displayCards(ArrayList<Integer> cartes, ArrayList<String> cartesAafficher,
			int indexCarteChoisieA, int indexCarteChoisieB, int carteChoisieA, int carteChoisieB) {
		for (int i = 0; i < cartes.size(); i++) {
			if (i == indexCarteChoisieA) {
				cartesAafficher.add(Integer.toString(carteChoisieA));
			} else if (i == indexCarteChoisieB) {
				cartesAafficher.add(Integer.toString(carteChoisieB));
			} else {
				cartesAafficher.add("*");
			}
		}
		System.out.println(String.join(" ", cartesAafficher));
		// on vide le tableau à la fin de chaque tour
		// il sera re-rempli au début de chaque tour par la boucle ci-dessus
		// cela simule le retournement des cartes
		cartesAafficher.removeAll(cartesAafficher);
	}

	/**
	 * Fonction qui affiche des message en cas de victoire
	 */
	public static void printMessageWonGame(int carteChoisieA, int carteChoisieB) {
		System.out.println("\n################################ MESSAGE DE VICTOIRE ################################\n");
		System.out.println(
				"Vous avez retourner les 2 cartes similaires suivantes : " + carteChoisieA + " et " + carteChoisieB);
		System.out.println("Bravo, vous remportez la paires de " + carteChoisieA);
		addMsgDelimiter();
	}

	/**
	 * Fonction qui affiche des message en cas de défaite
	 */
	public static void printMessageLostGame(int carteChoisieA, int carteChoisieB) {
		System.out.println("\n################################ MESSAGE DE DEFAITE ################################\n");
		System.out.println(
				"Vous avez retourner les 2 cartes différentes suivantes : " + carteChoisieA + " et " + carteChoisieB);
		System.out.println("Réessayez encore");
		addMsgDelimiter();
	}

	/**
	 * Fonction qui affiche des infos sur le jeu pour le développeur
	 */
	public static void printLogs(int indexCarteChoisieA, int indexCarteChoisieB, int carteChoisieA, int carteChoisieB,
			ArrayList<Integer> paquetCartesOrdreOriginal, ArrayList<Integer> cartes, ArrayList<String> cartesAaffiche,
			ArrayList<Integer> cartesOrdreInitial, boolean hasWon, ArrayList<Integer> cartesDuJoueur) {
		System.out.println("\n################################ LOGS POUR DEV ################################\n");
		System.out.println((hasWon) ? "Le joueur a gagné" : "Le joueur a perdu");
//        String message = (hasWon ? "Player has won" : "Player has lost");
//        System.out.println(message);

		System.out.println("Index cartes choisies = " + indexCarteChoisieA + " et " + indexCarteChoisieB);
		System.out.println("Cartes choisies = " + carteChoisieA + " et " + carteChoisieB);
		System.out.println("Cartes du joueur = " + cartesDuJoueur + "\n");
		displayCards(cartes, cartesAaffiche, indexCarteChoisieA, indexCarteChoisieB, carteChoisieA, carteChoisieB);
		System.out.println("\ncartes du jeu restantes = " + cartes);
		System.out.println("cartes dans l'ordre initial = " + cartesOrdreInitial + "\n");
		System.out.println("Paquet de cartes dans l'ordre et le nombre initial = " + paquetCartesOrdreOriginal);
		addMsgDelimiter();
	}

	/**
	 * Fonction qui affiche un message de fin de partie
	 */
	public static void manageGameOver(boolean isGameover, int tentatives) {
		System.out.println(
				"\n################################ MESSAGE DE FIN DE PARTIE ################################\n");
		System.out.println("Bravo ! Vous avez retrouvez toutes les paires de cartes en " + tentatives + " tentatives");
	}

	/**
     * Fonction qui place une ligne pour délimiter les blocks de messages de la console
     * Améliore la lisibilité des messages de la console
    */
    public static void addMsgDelimiter() {
        System.out.println("=====================================================================");
    }
}
