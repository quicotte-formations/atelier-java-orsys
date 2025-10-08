package orsys.atelier.collections;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add( Integer.parseInt("10") );
		liste.add( Integer.parseInt("20") );
		liste.add( Integer.parseInt("30") );
		
		System.out.println( liste );
	}
}
