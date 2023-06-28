package orsys.atelier.oo.hifi;

public class Tele extends AppareilHiFi{

	protected int chaineActuelle=1;

	public void changerChaine(int chaine) {
		if( this.allume ) {
			chaineActuelle=chaine;
		}
	}
	
	@Override
	public String toString() {
		return "Tele [chaineActuelle=" + chaineActuelle + ", allume=" + allume + "]";
	}

	
	
	
}
