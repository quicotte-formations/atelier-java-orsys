package orsys.atelier.oo.streams;

import java.util.ArrayList;
import java.util.List;

public class Ex1_4 {
	public static boolean estPremier(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		List<Integer> nombres = new ArrayList<Integer>();
		for (int i = 1; i < 200000; i++) {
			nombres.add(i);
		}

		List<Integer> premiers = nombres.stream().filter(nombre -> estPremier(nombre)).toList();
		System.out.println(premiers);
	}
}
