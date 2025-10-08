package orsys.atelier.oo.streams;

public class Film {

	private String titre;
	private String genre;
	private String realisateur;
	private int anneeSortie;
	
	
	public Film(String titre, String genre, String realisateur, int anneeSortie) {
		this.titre = titre;
		this.genre = genre;
		this.realisateur = realisateur;
		this.anneeSortie = anneeSortie;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public int getAnneeSortie() {
		return anneeSortie;
	}
	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}
	@Override
	public String toString() {
		return "Film [titre=" + titre + ", genre=" + genre + ", realisateur=" + realisateur + ", anneeSortie="
				+ anneeSortie + "]";
	}
	
}
