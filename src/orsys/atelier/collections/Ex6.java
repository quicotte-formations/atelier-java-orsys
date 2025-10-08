package orsys.atelier.collections;

import java.util.HashMap;

public class Ex6 {

	public static void main(String[] args) {
		HashMap<String, String> paysCap = new HashMap<String, String>();
		paysCap.put("france", "paris");
		paysCap.put("espagne", "madrid");
		paysCap.put("italie", "rome");
		
		System.out.println( paysCap.keySet() );
	}
}
