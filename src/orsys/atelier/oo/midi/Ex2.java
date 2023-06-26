package orsys.atelier.oo.midi;

import javax.sound.midi.MidiUnavailableException;

public class Ex2 {

	public static void main(String[] args) throws MidiUnavailableException, InterruptedException {
		Synthe synth = new Synthe();
		synth.clicBoutonOnOff();
		synth.joueNote("DO");
		synth.joueNote("RE");
		synth.joueNote("MI");
		synth.joueNote("FA");
		synth.joueNote("SOL");
	}
}
