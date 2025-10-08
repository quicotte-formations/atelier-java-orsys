package orsys.atelier.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex4 {
	public static void main(String[] args) {
		HashSet<String> couleurs1 = new HashSet<String>();
		HashSet<String> couleurs2 = new HashSet<String>();
		
		couleurs1.add("rouge");
		couleurs1.add("vert");
		couleurs1.add("bleu");
		couleurs2.add("rouge");
		couleurs2.add("jaune");
		
		couleurs1.addAll(couleurs2);
		
		System.out.println( couleurs1 );
	}
}
