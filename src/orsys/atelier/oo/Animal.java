package orsys.atelier.oo;

public class Animal {

	private String nom;
	private String genre;
	private int nbPattes;
	
	public Animal(String nom, String genre, int nbPattes) {
		this.nom = nom;
		this.genre = genre;
		this.setNbPattes(nbPattes);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNbPattes() {
		return nbPattes;
	}
	public void setNbPattes(int nbPattes) {
		if(nbPattes<1000) {
			this.nbPattes = nbPattes;
		}
	}
	
	
}
