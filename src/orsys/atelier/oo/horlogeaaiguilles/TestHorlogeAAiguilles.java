package orsys.atelier.oo.horlogeaaiguilles;

import java.util.ArrayList;

import orsys.atelier.oo.horloge.Horloge;

public class TestHorlogeAAiguilles {

	public static void main(String[] args) {
		
		ArrayList<HorlogeAAiguilles> horlogesAAiguilles = new ArrayList<HorlogeAAiguilles>();
		
		horlogesAAiguilles.add( new HorlogeAAiguilles(10, 30, 30) );
		horlogesAAiguilles.add( new HorlogeAAiguilles(10, 30, 59) );
		horlogesAAiguilles.add( new HorlogeAAiguilles(10, 59, 59) );
		horlogesAAiguilles.add( new HorlogeAAiguilles(23, 59, 59) );
		
		horlogesAAiguilles.forEach( horlogeAAiguille -> {
			System.out.println("AVANT: " + horlogeAAiguille);
			horlogeAAiguille.avancerUneSec();
			System.out.println("APRES: " + horlogeAAiguille);
		});
	}
}
