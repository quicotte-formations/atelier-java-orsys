package orsys.atelier.oo.horloge;

public class Horloge {

	private int h = 0, m = 0, s = 0;

	public Horloge(int h, int m, int s) {
		this.setH(h);
		this.setM(m);
		this.setS(s);
	}

	/**
	 * Cette fonction avance d'une seconde et gère
	 * les restet.
	 */
	public void avancerUneSec() {
		// ETAPE 1:blabla
		
		// ETAPE 2 : blabla
		
		this.s++;
		if( s>59 ) {
			s=0;
			m++;
			if( m>59 ) {
				m=0;
				h++;
				if(h>23) {
					h=0;
				}
			}
		}
	}
	
	public int getH() {
		return h;
	}

	public void setH(int h) {
		if (h < 0 || h > 23) {
			h = 0;
		}
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		if (this.m < 0 || this.m > 59) {
			this.m = 0;
		} else {
			this.m = m;
		}

	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		if (this.s < 0 || this.s > 59) {
			this.s = 0;
		} else {
			this.s = s;
		}
	}

	@Override
	public String toString() {
		return String.format("%d:%d:%d", this.h, this.m, this.s);
	}

}
