package com.jagex;/* com.jagex.Class12_Sub12_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class12_Sub12_Sub10 extends Class12_Sub12 {
	public static int anInt2365;
	public static int anInt2366;
	public static volatile int anInt2367;
	public static RSString aClass59_2368 = Class55.method898("Remove", -10983);
	public static int anInt2369;
	public static Class26 aClass26_2370;
	public static RSString aClass59_2371;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_2372;
	public int anInt2373;
	public static int anInt2374;
	public static int anInt2375;
	public static int anInt2376;
	public static Buffer aClass12_Sub11_2377;
	public static int anInt2378;
	public static int anInt2379;
	public int anInt2380;
	public static int anInt2381;
	public int anInt2382;

	public static void method428(byte arg0) {
		try {
			anInt2381++;
			if (arg0 >= 32) {
				synchronized (Class35.aClass49_837) {
					Class57.anInt1340 = Class13.anInt351;
					if ((Class30.anInt719 ^ 0xffffffff) <= -1) {
						while ((Class30.anInt719 ^ 0xffffffff) != (Statics.anInt552 ^ 0xffffffff)) {
							int i = (Class12_Sub12_Sub4.anIntArray2222[Statics.anInt552]);
							Statics.anInt552 = 1 + Statics.anInt552 & 0x7f;
							if (i >= 0)
								Class12_Sub1.aBooleanArray1627[i] = true;
							else
								Class12_Sub1.aBooleanArray1627[i ^ 0xffffffff] = false;
						}
					} else {
						for (int i = 0; i < 112; i++)
							Class12_Sub1.aBooleanArray1627[i] = false;
						Class30.anInt719 = Statics.anInt552;
					}
					Class13.anInt351 = Class62_Sub2.anInt1928;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "na.C(" + arg0 + ')');
		}
	}

	public void method429(Buffer arg0, int arg1, byte arg2) {
		if (arg2 != 56)
			anInt2380 = 122;
		anInt2379++;
		if (arg1 == 1) {
			anInt2373 = arg0.readShortBE();
			anInt2382 = arg0.readUByte();
			anInt2380 = arg0.readUByte();
		}
	}

	public void method430(Buffer arg0, boolean arg1) {
		try {
			for (;;) {
				int i = arg0.readUByte();
				if (i == 0)
					break;
				method429(arg0, i, (byte) 56);
			}
			if (arg1 == false)
				anInt2376++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "na.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static void method431(byte arg0) {
		aClass12_Sub12_Sub7_Sub2_2372 = null;
		aClass59_2371 = null;
		aClass59_2368 = null;
		aClass26_2370 = null;
		aClass12_Sub11_2377 = null;
		if (arg0 > -26)
			method428((byte) 103);
	}

	public static void method432(byte arg0, Class15 arg1) {
		try {
			anInt2378++;
			if (arg0 != -41)
				anInt2369 = 72;
			Class23.aClass15_510 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("na.D(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method433(byte arg0) {
		try {
			anInt2366++;
			if (arg0 > 125) {
				for (int i = -1; (i ^ 0xffffffff) > (Class9.anInt203 ^ 0xffffffff); i++) {
					int i_0_;
					if (i == -1)
						i_0_ = 2047;
					else
						i_0_ = Class36.anIntArray888[i];
					Player class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_0_]);
					if (class12_sub12_sub11_sub2_sub2 != null
							&& class12_sub12_sub11_sub2_sub2.anInt2701 > 0) {
						class12_sub12_sub11_sub2_sub2.anInt2701--;
						if (class12_sub12_sub11_sub2_sub2.anInt2701 == 0)
							class12_sub12_sub11_sub2_sub2.aClass59_2678 = null;
					}
				}
				for (int i = 0; (Class62_Sub2.anInt1916 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
					int i_1_ = Class1.anIntArray76[i];
					Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_1_];
					if (class12_sub12_sub11_sub2_sub1 != null
							&& class12_sub12_sub11_sub2_sub1.anInt2701 > 0) {
						class12_sub12_sub11_sub2_sub1.anInt2701--;
						if ((class12_sub12_sub11_sub2_sub1.anInt2701 ^ 0xffffffff) == -1)
							class12_sub12_sub11_sub2_sub1.aClass59_2678 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "na.A(" + arg0 + ')');
		}
	}

	static {
		anInt2365 = 0;
		anInt2369 = 0;
		anInt2367 = -1;
		anInt2375 = 0;
		aClass59_2371 = aClass59_2368;
	}
}
