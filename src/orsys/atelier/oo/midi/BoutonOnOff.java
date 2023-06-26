package orsys.atelier.oo.midi;

public class BoutonOnOff {

	private boolean started = false;
	
	public void appuyer() {
		
		started = ! started;
	}

	public boolean isStarted() {
		return started;
	}
}
