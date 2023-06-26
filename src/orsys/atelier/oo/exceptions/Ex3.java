package orsys.atelier.oo.exceptions;

public class Ex3 {

	public static void main(String[] args) {

		Service s = new Service();
		try {
			s.retrait(1, 100);
			s.transferer(1, 2, 10000);
		}catch(MontantInvalideException | MontantTropEleveException e) {
			System.out.println(e.getMessage());
		}
	}

	
}
