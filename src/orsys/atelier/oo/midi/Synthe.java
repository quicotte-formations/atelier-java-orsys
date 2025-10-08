package orsys.atelier.oo.midi;

import java.util.HashMap;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Synthe {

	private Clavier clavier=new Clavier(this);
	private BoutonOnOff boutonOnOff=new BoutonOnOff();
	private BoutonVolume boutonVolume=new BoutonVolume();
	
	public Clavier getClavier() {
		return clavier;
	}

	public void clicBoutonOnOff() {
		boutonOnOff.appuyer();
	}
	
	public void clicVolumePlus() {
		this.boutonVolume.monter();
	}
	
	public void clicVolumeMoins() {
		this.boutonVolume.baisser();
	}
	
	public void joueNote(String note) throws MidiUnavailableException, InterruptedException {
		
		Synthesizer synth = MidiSystem.getSynthesizer();
		synth.open();
		MidiChannel[] channels = synth.getChannels();
		channels[0].noteOn( this.clavier.traduitNote(note), this.boutonVolume.getVolume());
		Thread.sleep(500);
		channels[0].allNotesOff();
		synth.close();
	}

}
