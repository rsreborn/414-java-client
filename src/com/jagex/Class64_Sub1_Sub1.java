package com.jagex;/* com.jagex.Class64_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;

public class Class64_Sub1_Sub1 extends Class64_Sub1 implements Receiver {
	public static Receiver aReceiver2566 = null;
	public static Sequencer aSequencer2567 = null;

	public void method975(int arg0, byte[] arg1, int arg2, boolean arg3) {
		if (aSequencer2567 != null) {
			try {
				Sequence sequence = MidiSystem
						.getSequence(new ByteArrayInputStream(arg1));
				aSequencer2567.setSequence(sequence);
				if (arg2 != 0)
					aReceiver2566 = null;
				aSequencer2567.setLoopCount(!arg3 ? 0 : -1);
				method983(0, (byte) 106, arg0, -1L);
				aSequencer2567.start();
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public void method981(boolean arg0) {
		if (aSequencer2567 != null) {
			aSequencer2567.stop();
			method986(-1L, 127);
			if (arg0 != true)
				aSequencer2567 = null;
		}
	}

	public synchronized void send(MidiMessage arg0, long arg1) {
		byte[] is = arg0.getMessage();
		if (is.length < 3 || !method985(is[0], is[1], is[2], arg1))
			aReceiver2566.send(arg0, arg1);
	}

	public Class64_Sub1_Sub1() {
		try {
			aReceiver2566 = MidiSystem.getReceiver();
			aSequencer2567 = MidiSystem.getSequencer(false);
			aSequencer2567.getTransmitter().setReceiver(this);
			aSequencer2567.open();
			method986(-1L, 127);
		} catch (Exception exception) {
			Class56.method904((byte) 127);
		}
	}

	public void method976(int arg0) {
		if (arg0 == 699) {
			if (null != aSequencer2567) {
				aSequencer2567.close();
				aSequencer2567 = null;
			}
			if (null != aReceiver2566) {
				aReceiver2566.close();
				aReceiver2566 = null;
			}
		}
	}

	public void close() {
		/* empty */
	}

	public void method979(int arg0, byte arg1) {
		if (aSequencer2567 != null) {
			method988(arg0, -1L, (byte) 20);
			if (arg1 != 50)
				aReceiver2566 = null;
		}
	}

	public synchronized void method978(int arg0, int arg1, byte arg2) {
		if (null != aSequencer2567) {
			int i = -18 % ((arg2 - -20) / 50);
			method983(arg1, (byte) 97, arg0, -1L);
		}
	}

	public void method984(int arg0, int arg1, int arg2, long arg3) {
		try {
			ShortMessage shortmessage = new ShortMessage();
			shortmessage.setMessage(arg0, arg1, arg2);
			aReceiver2566.send(shortmessage, arg3);
		} catch (InvalidMidiDataException invalidmididataexception) {
			/* empty */
		}
	}

	public void method980(int arg0) {
		if (arg0 > -90)
			method981(false);
	}
}
