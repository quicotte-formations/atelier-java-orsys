package orsys.atelier.oo.interfaces;

public class Requin implements Nageant{

	@Override
	public void nager() {
		System.out.println("Requin nage");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
