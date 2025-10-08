package orsys.atelier.entreesortie;

import java.io.File;

public class Ex1 {

	public static void main(String[] args) {
		File dossier = new File(".");
		File[] fichiers = dossier.listFiles();
		
		for(File f : fichiers) {
			if(f.isFile() && f.getName().contains(".png")){
				System.out.println(f.getName());
			}
		}
	}
}
