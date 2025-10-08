package orsys.atelier.oo.exceptions;

public class ServiceEx3 {

	public void retrait(int idCpte, int montant) throws Exception {
		if(montant<0) {
			throw new Exception("Le montant d'un retrait ne peut être < 0");
		}
	}
	
	public void transferer(int idCpteSrc, int idCpteDest, int montant) throws Exception {
		if(montant<0) {
			throw new Exception("Le montant d'un transfert ne peut être < 0");
		}
		if(montant>1000) {
			throw new Exception("Le montant d'un transfert ne peut être > 1000");
		}
	}
}
