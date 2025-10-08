package orsys.atelier.oo.midi;

public class BoutonVolume {

	private final int VOL_MIN = 0;
	private final int VOL_MAX = 1000;
	
	private int volume = 500;

	public int getVolume() {
		return this.volume;
	}
	
	public void monter() {
		this.volume += 100;
		if( this.volume>VOL_MAX ) {
			this.volume = VOL_MAX;
		}
	}
	
	public void baisser() {
		this.volume -= 100;
		if( this.volume>VOL_MIN ) {
			this.volume = VOL_MIN;
		}
	}
}
