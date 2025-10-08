package orsys.atelier.oo.hifi;

public class Main {

	static public void f2() throws Exception {
		throw new Exception("Erreur blabla");
	}

	static public void f1() throws Exception {
		f2();
	}

	public static void main(String[] args) {

		try {
			f1();
		}catch(Exception e) {
			System.out.println("Il s'est produit une erreur : " + e.getMessage() );
			return;
		}
		
		System.out.println("FIN");
	}
}
