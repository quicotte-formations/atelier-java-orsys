package orsys.atelier.oo.horlogeaaiguilles;

public class HorlogeAAiguilles {

	private Aiguille aiguilleH;
	private Aiguille aiguilleM;
	private Aiguille aiguilleS;
	
	public HorlogeAAiguilles(int h, int m, int s) {
		
		this.aiguilleH = new Aiguille(11, h);
		this.aiguilleM = new Aiguille(59, m);
		this.aiguilleS = new Aiguille(59, s);
	}

	@Override
	public String toString() {
		return String.format("%s:%s:%s", aiguilleH, aiguilleM, aiguilleS);
	}

	public void avancerUneSec() {
		if( aiguilleS.avancer() ) {
			if( aiguilleM.avancer() ) {
				aiguilleH.avancer();
			}
		}
	}
}
