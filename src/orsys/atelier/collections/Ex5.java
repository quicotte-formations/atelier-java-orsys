package orsys.atelier.collections;

import java.util.HashSet;

public class Ex5 {

	public static void main(String[] args) {
		
		HashSet<Integer> entiers1 = new HashSet<Integer>();
		HashSet<Integer> entiers2 = new HashSet<Integer>();
		entiers1.add(1);
		entiers1.add(2);
		entiers1.add(3);
		entiers1.add(4);
		entiers1.add(5);
		entiers2.add(2);
		entiers2.add(3);
		entiers2.add(4);
		entiers1.removeAll(entiers2);
		
		System.out.println(entiers1);
	}
}
