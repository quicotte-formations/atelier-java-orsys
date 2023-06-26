package orsys.atelier.oo.interfaces;

public class Autruche implements Marchant, Volant, Nageant{

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void nager() {
		System.out.println("Autruche nage");
	}

	@Override
	public void voler() {
		System.out.println("Autruche vole");
	}

	@Override
	public void marcher() {
		System.out.println("Autruche marche");
	}
}
