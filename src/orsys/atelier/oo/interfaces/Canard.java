package orsys.atelier.oo.interfaces;

public class Canard implements Marchant, Volant, Nageant{

	@Override
	public void nager() {
		System.out.println("Canard nage");
	}

	@Override
	public void voler() {
		System.out.println("Canard vole");
	}

	@Override
	public void marcher() {
		System.out.println("Canard marche");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
