package orsys.atelier.oo.interfaces;

public class Elephant implements Nageant, Marchant{

	@Override
	public void nager() {
		System.out.println("Elephant nage");
	}
	
	@Override
	public void marcher() {
		System.out.println("Elephant marche");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
