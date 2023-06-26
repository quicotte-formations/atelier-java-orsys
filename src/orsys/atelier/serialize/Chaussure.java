package orsys.atelier.serialize;

import java.io.Serializable;

public class Chaussure implements Serializable {

	private static final long serialVersionUID = 1341600619108451264L;
	private String modele;
	private String marque;
	private int prix;

	public Chaussure(String modele, String marque, int prix) {
		this.modele = modele;
		this.marque = marque;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Chaussure [modeleString=" + modele + ", marqueString=" + marque + ", prix=" + prix + "]";
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}