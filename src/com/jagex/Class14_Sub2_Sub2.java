package com.jagex;/* com.jagex.Class14_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class14_Sub2_Sub2 extends Class14_Sub2 {
	public AudioFormat anAudioFormat2562;
	public SourceDataLine aSourceDataLine2563;
	public byte[] aByteArray2564 = new byte[512];
	public static Class aClass2565;

	public void method576(int arg0) throws LineUnavailableException {
		try {
			DataLine.Info info = (new DataLine.Info(
					(aClass2565 == null ? (aClass2565 = method586("javax.sound.sampled.SourceDataLine"))
							: aClass2565), anAudioFormat2562, arg0 * 2));
			aSourceDataLine2563 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine2563.open();
			aSourceDataLine2563.start();
		} catch (LineUnavailableException lineunavailableexception) {
			aSourceDataLine2563 = null;
			throw lineunavailableexception;
		}
	}

	public int method583() {
		int i;
		try {
			i = aSourceDataLine2563.available() >> 1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	public Class14_Sub2_Sub2() throws Exception {
		super(22050);
		anAudioFormat2562 = new AudioFormat(22050.0F, 16, 1, true, false);
	}

	public void method577() {
		if (null != aSourceDataLine2563) {
			aSourceDataLine2563.close();
			aSourceDataLine2563 = null;
		}
	}

	public void method579() {
		for (int i = 0; i < 256; i++) {
			int i_0_ = anIntArray1862[i];
			if ((i_0_ + 8388608 & ~0xffffff) != 0)
				i_0_ = 0x7fffff ^ i_0_ >> 31;
			aByteArray2564[i * 2] = (byte) (i_0_ >> 8);
			aByteArray2564[i * 2 + 1] = (byte) (i_0_ >> 16);
		}
		aSourceDataLine2563.write(aByteArray2564, 0, 512);
	}

	public static Class method586(String arg0) {
		Class var_class;
		try {
			var_class = Class.forName(arg0);
		} catch (ClassNotFoundException classnotfoundexception) {
			return null;
		}
		return var_class;
	}
}
