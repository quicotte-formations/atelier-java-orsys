package orsys.atelier.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		boolean boucle = true;
		List<Chaussure> chaussures = new ArrayList<Chaussure>();
		Scanner sc = new Scanner(System.in);
		String choix = "";

		while (boucle) {
			System.out.println("Veuillez sélectionner une option :");
			System.out.println("a : ajouter une nouvelle chaussure ");
			System.out.println("b : lister les modèles existants");
			System.out.println("c : rechercher les modèles d'une marque(triés)");
			System.out.println("d : sauver ");
			System.out.println("e : charger");
			System.out.println("f : quitter");

			// sc.useDelimiter("\n");
			choix = sc.next();

			if (choix.equals("a")) {
				System.out.println("Veuillez saisire le modele :");
				// modelScanner.useDelimiter("\n");
				String modeleString = sc.next();

				System.out.println("Veuillez saisire la marque :");

				String marqueString = sc.next();

				System.out.println("Veuillez saisire le prix :");
				// prixScanner.useDelimiter("\n");
				String prixString = sc.next();

				int prix = Integer.parseInt(prixString);

				Chaussure shoeChaussure = new Chaussure(modeleString, marqueString, prix);
				chaussures.add(shoeChaussure);

			} else if (choix.equals("b")) {
				List<String> modeleStrings = chaussures.stream().map(chaussure -> chaussure.getModele())
						.collect(Collectors.toList());
				System.out.println(modeleStrings);

			} else if (choix.equals("c")) {
				System.out.println("Veuillez saisire la marque :");
				String marqueString2 = sc.next();
				List<String> modeleStrings2 = chaussures.stream()
						.filter(chaussure -> chaussure.getMarque().equals(marqueString2))
						.map(chaussure -> chaussure.getModele()).collect(Collectors.toList());
				System.out.println(modeleStrings2);
			} else if (choix.equals("d")) {
				ObjectOutputStream stream = new ObjectOutputStream(
						new FileOutputStream(new File("C:\\Users\\mathi\\Pictures\\Screenshot\\chaussure.bin")));
				stream.writeObject(chaussures);
				stream.flush();
				stream.close();
			}

			else if (choix.equals("e")) {
				ObjectInputStream stream = new ObjectInputStream(
						new FileInputStream(new File("C:\\Users\\mathi\\Pictures\\Screenshot\\chaussure.bin")));
				chaussures = (List<Chaussure>) stream.readObject();
			}

			else if (choix.equals("f")) {
				break;
			}

		}
		sc.close();
		System.out.println("programme terminé");

	}
}
