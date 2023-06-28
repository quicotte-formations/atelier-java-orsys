package orsys.atelier.oo.hifi;

public class LecteurDisque extends AppareilHiFi {

	protected String titreInsere;
	protected boolean playing = false;

	public void insererTitre(String titre) {
		titreInsere = titre;
	}

	public void play() {
		if (this.allume) {
			playing = true;
		}
	}

	public void stop() {
		if (this.allume) {
			playing = false;
		}
	}
}
