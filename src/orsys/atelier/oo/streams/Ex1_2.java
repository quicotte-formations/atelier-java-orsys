package orsys.atelier.oo.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ex1_2 {

	public static void main(String[] args) {
		ArrayList<Integer> entiers = new ArrayList<Integer>();
		for(int i=1;i<=1000;i++) {
			entiers.add(i);
		}
		
		entiers = (ArrayList<Integer>) entiers.stream()
				.filter(entier -> entier%3==0)
				.collect(Collectors.toList());
		System.out.println(entiers);
	}
}
