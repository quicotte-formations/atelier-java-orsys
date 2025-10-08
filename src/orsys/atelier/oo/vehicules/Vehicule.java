package orsys.atelier.oo.vehicules;

public abstract class Vehicule {

	protected int x;
	protected int y;

	public abstract void avancer();

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		Vehicule vehic2 = (Vehicule) obj;
		
		return this.x==vehic2.x && this.y == vehic2.y;
	}
}
