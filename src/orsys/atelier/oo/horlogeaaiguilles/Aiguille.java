package orsys.atelier.oo.horlogeaaiguilles;

/**
 * Une aiguille d'horloge, traditionnelle.
 * @author quico
 *
 */
public class Aiguille {

	private int max;
	private int pos;
	
	public Aiguille(int max, int pos) {
		this.max = max;
		this.pos = pos;
		if(pos>max) {
			this.pos=0;
		}
	}
	
	/**
	 * Increment l'aiguille d'une unité et reset à 0 si > max.
	 * @return true si a été reset.
	 */
	public boolean avancer() {
		pos++;
		if( pos>max ) {
			pos=0;
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return Integer.toString(pos);
	}
	
	
}
