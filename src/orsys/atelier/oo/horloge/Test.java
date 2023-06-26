package orsys.atelier.oo.horloge;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Horloge> horloges = new ArrayList<Horloge>();
		
		horloges.add( new Horloge(10, 30, 30) );
		horloges.add( new Horloge(10, 30, 59) );
		horloges.add( new Horloge(10, 59, 59) );
		horloges.add( new Horloge(23, 59, 59) );
		
		horloges.forEach( horloge -> {
			System.out.println("AVANT: " + horloge);
			horloge.avancerUneSec();
			System.out.println("APRES: " + horloge);
		});
	}
}
