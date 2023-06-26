package orsys.atelier.vars;

public class Ex1 {

	public static void main(String[] args) {
		String verre1 = "liquide vert";
		String verre2 = "liquide rouge";
		String verre3 = verre1;
		verre1 = verre2;
		verre2 = verre3;
		
		System.out.println( verre1 + " " + verre2 );
	}
}
