package orsys.atelier.oo.exceptions;

public class Service {

	public void retrait(int idCpte, int montant) throws MontantInvalideException {
		if(montant<0) {
			throw new MontantInvalideException("Le montant d'un retrait ne peut être < 0");
		}
	}
	
	public void transferer(int idCpteSrc, int idCpteDest, int montant) throws MontantInvalideException, MontantTropEleveException {
		if(montant<0) {
			throw new MontantInvalideException("Le montant d'un transfert ne peut être < 0");
		}
		if(montant>1000) {
			throw new MontantTropEleveException("Le montant d'un transfert ne peut être > 1000");
		}
	}
}
