package orsys.atelier.oo.interfaces;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList animaux = new ArrayList();
		
		animaux.add(new Autruche());
		animaux.add(new Canard());
		animaux.add(new Croco());
		animaux.add(new Elephant());
		animaux.add(new Requin());
		
		animaux.forEach( animal -> {
			
			System.out.println( animal );
			
			if(animal instanceof Nageant) {
				Nageant nageant = (Nageant) animal;
				nageant.nager();
			}
			if(animal instanceof Marchant) {
				Marchant marchant = (Marchant) animal;
				marchant.marcher();
			}
			if(animal instanceof Volant) {
				Volant volant = (Volant) animal;
				volant.voler();
			}
		});
	}
}
