package orsys.atelier.oo.midi;

import java.util.HashMap;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Ex1 {
	
	public static void main(String[] args) throws MidiUnavailableException, InterruptedException {

		Synthesizer synth = MidiSystem.getSynthesizer();
		synth.open();
		MidiChannel[] channels = synth.getChannels();

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
		
		String melodie = "DO RE MI DO DO RE MI DO MI FA SOL MI MI FA SOL MI";
		String[] notes = melodie.split(" ");
		for (String note : notes) {

			int numNote = notesNombres.get(note);
			
			channels[0].noteOn(numNote, 600);
			Thread.sleep(500);
			channels[0].allNotesOff();
		}
	}

}
