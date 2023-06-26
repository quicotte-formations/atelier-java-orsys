package orsys.atelier.oo.horlogeaaiguilles;

public class TestAiguille {

	public static void main(String[] args) {
		Aiguille a;
		
		a = new Aiguille(10, 5);
		a.avancer();
		System.out.println(a);
		
		a = new Aiguille(10, 10);
		a.avancer();
		System.out.println(a);
	}
}
