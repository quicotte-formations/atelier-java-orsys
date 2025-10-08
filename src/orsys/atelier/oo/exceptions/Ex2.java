package orsys.atelier.oo.exceptions;

public class Ex2 {

	public static void main(String[] args) {

		Service s = new Service();
		try {
			s.retrait(1, 100);
			s.transferer(1, 2, 10000);
		}catch(MontantInvalideException e) {
			System.out.println("Montant invalide");
		}catch(MontantTropEleveException e) {
			System.out.println("Montant trop élevé");
		}
	}

	
}
