package com.jagex;/* com.jagex.Class12_Sub12_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.util.Statics;

import java.awt.Graphics;

public class Class12_Sub12_Sub12 extends Class12_Sub12 {
	public static int anInt2400;
	public static int anInt2401;
	public static RSString aClass59_2402;
	public static int anInt2403;
	public static int anInt2404 = 0;
	public static RSString aClass59_2405;
	public static int anInt2406;
	public static int anInt2407;
	public static Class34[] aClass34Array2408;
	public static int anInt2409;
	public static int anInt2410;
	public static RSString aClass59_2411;
	public static int anInt2412;
	public byte[] aByteArray2413;
	public static int[] anIntArray2414;
	public static RSString aClass59_2415;
	public static int anInt2416;
	public static int anInt2417;
	public static Class62 aClass62_2418;
	public static int anInt2419;

	public static void method516(int arg0, byte arg1,
			Class12_Sub12_Sub11_Sub2_Sub2 arg2, int arg3, int arg4) {
		try {
			anInt2406++;
			if (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713 != arg2
					&& Class13.anInt338 < 400) {
				RSString class59;
				if ((arg2.anInt2947 ^ 0xffffffff) == -1)
					class59 = (Statics
							.method251(
									(byte) -103,
									(new RSString[] {
											arg2.aClass59_2951,
											(Class26.method656(
													0,
													arg2.anInt2955,
													(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2955))),
											Class43.aClass59_1013,
											Class15.aClass59_396,
											Class19.method599(arg2.anInt2955,
													10), Class32.aClass59_794 })));
				else
					class59 = (Statics.method251((byte) -106,
							(new RSString[] { arg2.aClass59_2951,
									Class43.aClass59_1013, Class5.aClass59_161,
									Class19.method599(arg2.anInt2947, 10),
									Class32.aClass59_794 })));
				if (Class12_Sub12_Sub11_Sub5.anInt2848 == 1) {
					Class64.method977(arg3, arg0, 31, arg4, (Statics
							.method251((byte) -124, (new RSString[] {
									RSString.aClass59_1525,
									Class14.aClass59_371, Statics.aClass59_565,
									RuntimeException_Sub1.aClass59_1452,
									class59 }))), -56);
					Class12_Sub12_Sub15.anInt2469++;
				} else if (Class12.anInt315 != 1) {
					for (int i = 4; i >= 0; i--) {
						if (RSApplet.aClass59Array8[i] != null) {
							int i_0_ = 0;
							if (RSApplet.aClass59Array8[i].method920(
									Statics.aClass59_550, (byte) 3)) {
								if (((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2955) ^ 0xffffffff) > (arg2.anInt2955 ^ 0xffffffff))
									i_0_ = 2000;
								if (((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2962) ^ 0xffffffff) != -1
										&& arg2.anInt2962 != 0) {
									if ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2962) == arg2.anInt2962)
										i_0_ = 2000;
									else
										i_0_ = 0;
								}
							} else if (RuntimeException_Sub1.aBooleanArray1470[i])
								i_0_ = 2000;
							Class9.anInt215++;
							int i_1_ = 0;
							if ((i ^ 0xffffffff) == -1)
								i_1_ = 52 - -i_0_;
							if (i == 1)
								i_1_ = 47 + i_0_;
							if ((i ^ 0xffffffff) == -3)
								i_1_ = i_0_ + 19;
							if ((i ^ 0xffffffff) == -4)
								i_1_ = i_0_ + 5;
							if (i == 4)
								i_1_ = i_0_ + 25;
							Class64.method977(
									arg3,
									arg0,
									i_1_,
									arg4,
									(Statics
											.method251(
													(byte) -48,
													(new RSString[] {
															(RSApplet.aClass59Array8[i]),
															Class40.aClass59_946,
															class59 }))), -87);
						}
					}
				} else if ((0x8 & Class55.anInt1289 ^ 0xffffffff) == -9) {
					Class64.method977(arg3, arg0, 54, arg4, (Statics
							.method251((byte) -86, (new RSString[] {
									Class12_Sub12_Sub9.aClass59_2354,
									RuntimeException_Sub1.aClass59_1452,
									class59 }))), -50);
					RSApplet.anInt40++;
				}
				if (arg1 < -16) {
					for (int i = 0; Class13.anInt338 > i; i++) {
						if ((Class19.anIntArray454[i] ^ 0xffffffff) == -14) {
							Class12_Sub1.aClass59Array1621[i] = Statics
									.method251((byte) -126, (new RSString[] {
											(Class14.aClass59_372),
											(Class40.aClass59_946), class59 }));
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("p.B(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ',' + arg4 + ')'));
		}
	}

	public static void method517(byte arg0, Class26 arg1, Class26 arg2) {
		do {
			try {
				RuntimeException_Sub1.aClass26_1463 = arg1;
				Class1.aClass26_71 = arg2;
				anInt2401++;
				Class31.anInt766 = RuntimeException_Sub1.aClass26_1463
						.method645(3, false);
				if (arg0 == -59)
					break;
				anInt2404 = 83;
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, ("p.C(" + arg0 + ','
						+ (arg1 != null ? "{...}" : "null") + ','
						+ (arg2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method518(int arg0) {
		try {
			anInt2403++;
			try {
				if (arg0 != 4)
					method518(83);
				Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
						.getGraphics();
				Class12_Sub12_Sub11_Sub6.aClass62_2894.method957(-5917, 4, 4,
						graphics);
			} catch (Exception exception) {
				Class12_Sub12_Sub5.aCanvas2243.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "p.F(" + arg0 + ')');
		}
	}

	public static int method519(int arg0, int arg1) {
		try {
			return arg0 & arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "p.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Class12_Sub12_Sub12(byte[] arg0) {
		try {
			aByteArray2413 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "p.<init>("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public static boolean method520(int arg0, int arg1) {
		try {
			anInt2409++;
			if (arg1 != 8159)
				aClass59_2415 = null;
			if ((arg0 ^ 0xffffffff) > -33)
				return false;
			if ((arg0 ^ 0xffffffff) == -128)
				return false;
			if (arg0 >= 129 && (arg0 ^ 0xffffffff) >= -160)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "p.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method521(boolean arg0) {
		try {
			aClass59_2405 = null;
			aClass59_2415 = null;
			aClass62_2418 = null;
			anIntArray2414 = null;
			if (arg0 != true)
				method521(true);
			aClass59_2402 = null;
			aClass59_2411 = null;
			aClass34Array2408 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "p.D(" + arg0 + ')');
		}
	}

	static {
		aClass59_2402 = Class55.method898("Prepared visibility map", -10983);
		aClass59_2405 = aClass59_2402;
		aClass34Array2408 = new Class34[50];
		anInt2407 = -1;
		anInt2417 = 0;
		aClass59_2411 = Class55.method898("Click to continue", -10983);
		anIntArray2414 = new int[2000];
		anInt2416 = -1;
		aClass59_2415 = aClass59_2411;
	}
}
