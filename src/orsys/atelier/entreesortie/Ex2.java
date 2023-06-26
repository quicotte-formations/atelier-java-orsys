package orsys.atelier.entreesortie;

import java.io.File;

public class Ex2 {

	public static boolean rechercher(File dossier, String nomFichier) {
		
		File[] fichiers = dossier.listFiles();
		boolean trouve = false;
		
		for(File f : fichiers) {
			if(f.isFile() && f.getName().equals(nomFichier)) {
				System.out.println( f.getAbsolutePath() );
				return true;
			}
			if(f.isDirectory() ){
				if( rechercher(f,  nomFichier)==true ) {
					trouve = true;
				}
			}
		}
		
		return trouve;
	}
	
	public static void main(String[] args) {
		String cible = "Ex2.java";
		File dossier = new File(".");
		
		System.out.println( rechercher(dossier, cible) );
	}
}
