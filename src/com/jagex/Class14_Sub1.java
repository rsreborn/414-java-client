package com.jagex;/* com.jagex.Class14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import sun.audio.AudioPlayer;

public class Class14_Sub1 extends Class14 {
	public InputStream_Sub1 anInputStream_Sub1_1855;

	public Class14_Sub1() {
		super(8000);
		try {
			anInputStream_Sub1_1855 = new InputStream_Sub1();
			AudioPlayer.player.start(anInputStream_Sub1_1855);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public void method573() {
		try {
			AudioPlayer.player.stop(anInputStream_Sub1_1855);
			synchronized (anInputStream_Sub1_1855) {
				anInputStream_Sub1_1855.aBoolean66 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
