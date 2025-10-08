package orsys.atelier.oo.vehicules;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
		vehicules.add( new Twingo() );
		vehicules.add( new Ferrari() );
		vehicules.add( new Boeing() );
		vehicules.add( new Mirage() );
		
		vehicules.forEach( vehic -> {
			
			System.out.println("AVANT : " + vehic);
			vehic.avancer();
			System.out.println("APRES : " + vehic);
		});
	}
}
