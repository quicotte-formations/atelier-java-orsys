package orsys.atelier.fonctions;

import java.math.BigInteger;
import java.util.ArrayList;

public class Exercices {

	
	public static BigInteger factorielleUnlimited(int n) {
		
		BigInteger resultat = new BigInteger("1");
		for(int i=n ; i>1 ; i--) {
			BigInteger iVersionBigInteger = BigInteger.valueOf(i);
			resultat = resultat.multiply( iVersionBigInteger );
		}
		
		return resultat;
	}

	public static String majuscules(String... mesStrings) {

		String resultat = "";

		for (String stringAct : mesStrings) {
			resultat += stringAct + ", ";// res = res + stringAct + ", "
		}

		return resultat;
	}

	public static int carre(int n) {

		return puissance(n, 2);
	}

	public static int puissance(int n, int p) {

		int res = n;
		for (int i = 0; i < p; i++) {
			res *= n;
		}

		return n;
	}

	public static int factorielle(int n) {

		int res = n;
		for (n = n - 1; n > 1; n--) {
			res *= n;// res = res *n: n++, n--
		}

		return res;
	}
	
	public static void main(String[] args) {
		System.out.println( factorielleUnlimited(30000) );
	}
}
