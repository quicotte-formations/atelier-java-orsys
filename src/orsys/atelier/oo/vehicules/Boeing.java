package orsys.atelier.oo.vehicules;

public class Boeing extends Avion{

	@Override
	public void avancer() {
		super.avancer();
		y+=5;
	}
}
