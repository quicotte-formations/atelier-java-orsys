package orsys.atelier.collections;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<String> couleurs1 = new ArrayList<String>();
		ArrayList<String> couleurs2 = new ArrayList<String>();
		
		couleurs1.add("rouge");
		couleurs1.add("vert");
		couleurs1.add("bleu");
		couleurs2.add("rouge");
		couleurs2.add("jaune");
		
		couleurs1.addAll(couleurs2);
		
		System.out.println( couleurs1 );
	}
}
