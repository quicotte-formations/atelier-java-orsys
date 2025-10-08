package orsys.atelier.entreesortie;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
        System.out.print("ligne 1 >");
        String ligne1 = scan.nextLine();
        System.out.print("ligne 2 >");
        String ligne2 = scan.nextLine();
        System.out.print("ligne 3 >");
        String ligne3 = scan.nextLine();
        scan.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("resultat.txt"));
        writer.write(ligne1+"\n");
        writer.write(ligne2+"\n");
        writer.write(ligne3);
        writer.close();
	}
}
