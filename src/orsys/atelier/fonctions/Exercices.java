package orsys.atelier.fonctions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercices {
	
	public static BigInteger factorielleUnlimited(int n) {
		
		BigInteger resultat = new BigInteger("1");
		for(int i=n ; i>1 ; i--) {
			BigInteger iVersionBigInteger = BigInteger.valueOf(i);
			resultat = resultat.multiply( iVersionBigInteger );
		}
		
		return resultat;
	}

	public static String majusculesAvecJoin(String... strings) {

		return String.join(", ", strings).toUpperCase();
	}
	
	public static void metEnMaj(String[] strings) {
		for(int i=0;i<strings.length;i++) {
			strings[i] = strings[i].toUpperCase();
		}
	}
	
	public static String majuscules(String... strings) {

		String resultat = "";

		for (String stringAct : strings) {
			resultat += stringAct + ", ";
		}

		return resultat;
	}

	public static int carre(int n) {

		return puissance(n, 2);
	}

	public static int puissance(int n, int p) {

		int res = 1;
		for (int i = 0; i < p; i++) {
			res *= n;
		}

		return res;
	}

	public static int factorielle(int n) {

		int res = n;
		for (n = n - 1; n > 1; n--) {
			res *= n;// res = res *n: n++, n--
		}

		return res;
	}
	
	public static void main(String[] args) {
		
		List<Integer> entiers =  Arrays.asList(1,3,5,7);
		entiers.forEach( entierActuel -> System.out.println( carre(entierActuel) ) );
	}
}
