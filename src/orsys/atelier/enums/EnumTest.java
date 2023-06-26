package orsys.atelier.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EnumTest {

	public Feu etatSuivant(Feu feu) {

		switch(feu) {
		case VERT:
			return Feu.ORANGE;
		case ORANGE:
			return Feu.ROUGE;
		case ROUGE:
			return Feu.VERT;
		default:
			return null;
		}
	}
	
	@Test
	public void ex1() {
		assertEquals(Feu.ORANGE,etatSuivant(Feu.VERT));
		assertEquals(Feu.ROUGE,etatSuivant(Feu.ORANGE));
		assertEquals(Feu.VERT,etatSuivant(Feu.ROUGE));
		
		
	}
	
	@Test
	public void ex2() {
		Feu[] etats = Feu.values();
		String toto = "";
		for (Feu resu2 : etats){
			toto = toto + resu2.toString() + ",";
		}
		System.out.println(toto);
	}
}
