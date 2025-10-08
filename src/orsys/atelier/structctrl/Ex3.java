package orsys.atelier.structctrl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		
		int nombre = 2;
		int resultat = 2;
		int puissance = 16;
		
		for(int i=1;i<puissance;i++) {
			resultat = resultat * nombre;
		}
		
		System.out.println(resultat);
	}
}
