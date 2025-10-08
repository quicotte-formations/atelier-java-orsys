package orsys.atelier.oo.midi;

import java.util.HashMap;

import javax.sound.midi.MidiUnavailableException;

public class Clavier {

	private Synthe synthe;
	private String noteAppuyee=null;

	public Clavier(Synthe synthe) {
		this.synthe = synthe;
	}
	
	public int traduitNote(String note) {
		HashMap<String, Integer> notesNombres = new HashMap();
		notesNombres.put("DO", 60);
		notesNombres.put("DO#", 61);
		notesNombres.put("RE", 62);
		notesNombres.put("RE#", 63);
		notesNombres.put("MI", 64);
		notesNombres.put("FA", 65);
		notesNombres.put("FA#", 66);
		notesNombres.put("SOL", 67);
		notesNombres.put("SOL#", 68);
		notesNombres.put("LA", 69);
		notesNombres.put("LA#", 70);
		notesNombres.put("SI", 71);
		
		return notesNombres.get(note);
	}
}
