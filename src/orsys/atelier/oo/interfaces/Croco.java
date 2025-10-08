package orsys.atelier.oo.interfaces;

public class Croco implements Marchant, Nageant{

	@Override
	public void nager() {
		System.out.println("Croco nage");
	}

	@Override
	public void marcher() {
		System.out.println("Croco marche");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
