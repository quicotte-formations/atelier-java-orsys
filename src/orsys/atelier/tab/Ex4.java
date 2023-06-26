package orsys.atelier.tab;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		int[] nombres1= {10,20,30};
		int[] nombres2= {40,50};
		int[] nombres= new int[ nombres1.length + nombres2.length ];
		nombres[0] = nombres1[0];
		nombres[1] = nombres1[1];
		nombres[2] = nombres1[2];
		nombres[3] = nombres2[0];
		nombres[4] = nombres2[1];
		
		System.out.println( Arrays.toString(nombres) );
	}
}
