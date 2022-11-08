package com.jagex;/* com.jagex.Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

import java.awt.Graphics;

public class Class20 {
	public static RSString aClass59_460 = Class55.method898(
			"Your account is already logged in)3", -10983);
	public static RSString aClass59_461;
	public static int anInt462;
	public static Class27 aClass27_463;
	public static int anInt464;
	public static int anInt465;
	public static int anInt466;
	public static int anInt467;
	public static RSString aClass59_468;
	public static RSString aClass59_469;
	public static RSString aClass59_470 = aClass59_460;
	public static Class62 aClass62_471;
	public static RSString aClass59_472;
	public static RSString aClass59_473;
	public static Class26 aClass26_474;
	public static int anInt475;
	public static long[] aLongArray476;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_477;
	public static int anInt478;
	public static int[] anIntArray479;
	public static RSString aClass59_480;

	public static int method602(int arg0, byte arg1, int arg2, int arg3) {
		try {
			anInt467++;
			if (((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg2][arg0][arg3]) & 0x8 ^ 0xffffffff) != -1)
				return 0;
			if (arg2 > 0
					&& (0x2 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][arg0][arg3]) ^ 0xffffffff) != -1)
				return arg2 - 1;
			if (arg1 != 47)
				method602(34, (byte) -15, -17, 48);
			return arg2;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("g.E(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method603(int arg0) {
		try {
			anInt466++;
			try {
				if (arg0 != -18443)
					method605((byte) 121);
				Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
						.getGraphics();
				Class12_Sub12_Sub11_Sub5.aClass62_2878.method957(-5917, 205,
						553, graphics);
			} catch (Exception exception) {
				Class12_Sub12_Sub5.aCanvas2243.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "g.C(" + arg0 + ')');
		}
	}

	public static void method604(byte arg0, Class12_Sub12_Sub3 arg1) {
		anInt462++;
		int i = arg1.anInt2180;
		if (arg0 <= -40) {
			if ((i ^ 0xffffffff) <= -2 && i <= 100 || i >= 701
					&& (i ^ 0xffffffff) >= -801) {
				if (i == 1 && (RSCanvas.anInt59 ^ 0xffffffff) == -1) {
					arg1.anInt2145 = 0;
					arg1.aClass59_2130 = RSSocket.aClass59_526;
				} else if ((i ^ 0xffffffff) == -2 && RSCanvas.anInt59 == 1) {
					arg1.aClass59_2130 = Class12_Sub12_Sub11.aClass59_2391;
					arg1.anInt2145 = 0;
				} else if (i == 2 && (RSCanvas.anInt59 ^ 0xffffffff) != -3) {
					arg1.aClass59_2130 = Class12_Sub12_Sub16.aClass59_2552;
					arg1.anInt2145 = 0;
				} else {
					int i_0_ = Class7.anInt1540;
					if (i > 700)
						i -= 601;
					else
						i--;
					if (RSCanvas.anInt59 != 2)
						i_0_ = 0;
					if (i >= i_0_) {
						arg1.aClass59_2130 = Class11.aClass59_310;
						arg1.anInt2145 = 0;
					} else {
						arg1.aClass59_2130 = Class12_Sub12_Sub11_Sub6.aClass59Array2910[i];
						arg1.anInt2145 = 1;
					}
				}
			} else if (i >= 101 && i <= 200 || i >= 801
					&& (i ^ 0xffffffff) >= -901) {
				if (i > 800)
					i -= 701;
				else
					i -= 101;
				int i_1_ = Class7.anInt1540;
				if (RSCanvas.anInt59 != 2)
					i_1_ = 0;
				if ((i ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
					arg1.aClass59_2130 = Class11.aClass59_310;
					arg1.anInt2145 = 0;
				} else {
					if (Class12_Sub12_Sub4.anIntArray2227[i] != 0) {
						if (Class12_Sub12_Sub4.anIntArray2227[i] >= 5000) {
							if (Class12_Sub12_Sub4.anIntArray2227[i] != RSCanvas.anInt65)
								arg1.aClass59_2130 = (Statics
										.method251(
												(byte) -81,
												(new RSString[] {
														Class47.aClass59_1112,
														Class30.aClass59_733,
														(Class19.method599(
																-5000
																		+ (Class12_Sub12_Sub4.anIntArray2227[i]),
																10)) })));
							else
								arg1.aClass59_2130 = (Statics
										.method251(
												(byte) -79,
												new RSString[] {
														Class12.aClass59_331,
														Class30.aClass59_733,
														(Class19.method599(
																((Class12_Sub12_Sub4.anIntArray2227[i]) - 5000),
																10)) }));
						} else if (RSCanvas.anInt65 != Class12_Sub12_Sub4.anIntArray2227[i])
							arg1.aClass59_2130 = (Statics
									.method251(
											(byte) -38,
											(new RSString[] {
													Class47.aClass59_1112,
													RSApplet.aClass59_3,
													Class19.method599(
															(Class12_Sub12_Sub4.anIntArray2227[i]),
															10) })));
						else
							arg1.aClass59_2130 = (Statics
									.method251(
											(byte) -48,
											(new RSString[] {
													Class12.aClass59_331,
													RSApplet.aClass59_3,
													Class19.method599(
															(Class12_Sub12_Sub4.anIntArray2227[i]),
															10) })));
					} else
						arg1.aClass59_2130 = Statics.method251(
								(byte) -105, (new RSString[] {
										Class44.aClass59_1035,
										(Class64_Sub2.aClass59_1978) }));
					arg1.anInt2145 = 1;
				}
			} else if ((i ^ 0xffffffff) == -204) {
				int i_2_ = Class7.anInt1540;
				if (RSCanvas.anInt59 != 2)
					i_2_ = 0;
				arg1.anInt2138 = 15 * i_2_ + 20;
				if ((arg1.anInt2138 ^ 0xffffffff) >= (arg1.anInt2111 ^ 0xffffffff))
					arg1.anInt2138 = arg1.anInt2111 - -1;
			} else if ((i ^ 0xffffffff) <= -402 && i <= 500) {
				i -= 401;
				if (i == 0 && (RSCanvas.anInt59 ^ 0xffffffff) == -1) {
					arg1.anInt2145 = 0;
					arg1.aClass59_2130 = Statics.aClass59_574;
				} else if ((i ^ 0xffffffff) == -2 && RSCanvas.anInt59 == 0) {
					arg1.anInt2145 = 0;
					arg1.aClass59_2130 = Class12_Sub12_Sub16.aClass59_2552;
				} else {
					int i_3_ = Class49.anInt1147;
					if (RSCanvas.anInt59 == 0)
						i_3_ = 0;
					if ((i_3_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
						arg1.aClass59_2130 = Class11.aClass59_310;
						arg1.anInt2145 = 0;
					} else {
						arg1.aClass59_2130 = Class12_Sub12_Sub13.method524(-3,
								Class35.aLongArray859[i]).toString(-14767);
						arg1.anInt2145 = 1;
					}
				}
			} else if (i == 503) {
				arg1.anInt2138 = Class49.anInt1147 * 15 + 20;
				if ((arg1.anInt2111 ^ 0xffffffff) <= (arg1.anInt2138 ^ 0xffffffff))
					arg1.anInt2138 = arg1.anInt2111 - -1;
			} else if ((i ^ 0xffffffff) == -328) {
				arg1.anInt2147 = 150;
				arg1.anInt2123 = 0x7ff & (int) (256.0 * Math
						.sin((double) Class64_Sub2.anInt1968 / 40.0));
				arg1.anInt2114 = 5;
				arg1.anInt2112 = 0;
			} else if (i == 324) {
				if (Class8.anInt184 == -1) {
					Class64_Sub1.anInt1948 = arg1.anInt2124;
					Class8.anInt184 = arg1.anInt2109;
				}
				if (Class49.aClass42_1140.aBoolean1003)
					arg1.anInt2109 = Class8.anInt184;
				else
					arg1.anInt2109 = Class64_Sub1.anInt1948;
			} else if (i == 325) {
				if ((Class8.anInt184 ^ 0xffffffff) == 0) {
					Class64_Sub1.anInt1948 = arg1.anInt2124;
					Class8.anInt184 = arg1.anInt2109;
				}
				if (!Class49.aClass42_1140.aBoolean1003)
					arg1.anInt2109 = Class8.anInt184;
				else
					arg1.anInt2109 = Class64_Sub1.anInt1948;
			} else if (i == 600) {
				arg1.aClass59_2130 = Class11.aClass59_278;
				if ((Class64_Sub2.anInt1968 % 20 ^ 0xffffffff) > -11)
					arg1.aClass59_2130 = arg1.aClass59_2130.method938(38, 124);
				else
					arg1.aClass59_2130 = arg1.aClass59_2130.method938(38, 32);
			} else if (i == 620) {
				if ((Class12_Sub12_Sub6.anInt2267 ^ 0xffffffff) > -2)
					arg1.aClass59_2130 = Class11.aClass59_310;
				else if (Game.aBoolean1565) {
					arg1.anInt2186 = 16711680;
					arg1.aClass59_2130 = Class12_Sub12_Sub16.aClass59_2535;
				} else {
					arg1.anInt2186 = 16777215;
					arg1.aClass59_2130 = Class30.aClass59_727;
				}
			}
		}
	}

	public static void method605(byte arg0) {
		try {
			aClass59_480 = null;
			aClass12_Sub12_Sub7_Sub2_477 = null;
			aClass59_460 = null;
			aClass26_474 = null;
			aClass59_473 = null;
			int i = 40 % ((arg0 - -10) / 61);
			aClass62_471 = null;
			aClass59_472 = null;
			aClass27_463 = null;
			aClass59_468 = null;
			aClass59_461 = null;
			aClass59_469 = null;
			aLongArray476 = null;
			anIntArray479 = null;
			aClass59_470 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "g.D(" + arg0 + ')');
		}
	}

	public static void method606(int arg0) {
		try {
			if (arg0 < -79) {
				anInt465++;
				Class13.aClass27_335.method675(true);
				Statics.aClass27_1785.method675(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "g.A(" + arg0 + ')');
		}
	}

	static {
		aClass59_468 = Class55.method898(" )2>", -10983);
		aClass59_473 = Class55.method898("Loading config )2 ", -10983);
		aClass59_469 = Class55.method898("Login server offline)3", -10983);
		aClass59_461 = aClass59_473;
		aClass59_472 = aClass59_469;
		aClass27_463 = new Class27(50);
		aLongArray476 = new long[32];
		anIntArray479 = new int[1000];
		anInt475 = 0;
		anInt478 = 0;
		aClass59_480 = Class55.method898("@or1@", -10983);
	}
}
