package orsys.atelier.oo.exceptions;

public class Service {

	public void retrait(int idCpte, int montant) throws MontantInvalideException {
		if(montant<0) {
			throw new MontantInvalideException();
		}
	}
	
	public void transferer(int idCpteSrc, int idCpteDest, int montant) throws MontantInvalideException, MontantTropEleveException {
		if(montant<0) {
			throw new MontantInvalideException();
		}
		if(montant>1000) {
			throw new MontantTropEleveException();
		}
	}
}
