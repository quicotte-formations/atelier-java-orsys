package orsys.atelier.oo.hifi;

public class GraveurBlueRay extends LecteurDisque {

	protected boolean recording = false;

	public void record() {
		if (allume && this.titreInsere=="disque vierge") {
			recording = true;
		}
	}

	@Override
	public String toString() {
		return "GraveurBlueRay [recording=" + recording + ", titreInsere=" + titreInsere + ", playing=" + playing
				+ ", allume=" + allume + "]";
	}

}
