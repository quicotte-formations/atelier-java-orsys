package orsys.atelier.oo.exceptions;

public class Ex3 {

	public static void main(String[] args) {

		ServiceEx3 s = new ServiceEx3();
		// Retrait
		try {
			s.retrait(1, 100);
			s.transferer(1, 2, 10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println( e.getMessage() );
		}

	}

}
