package com.jagex;/* com.jagex.Class12_Sub12_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;
import com.jagex.io.RSSocket;

public class Class12_Sub12_Sub6 extends Class12_Sub12 {
	public static int anInt2249;
	public static int anInt2250;
	public int anInt2251 = -1;
	public static int anInt2252;
	public static int anInt2253;
	public static int anInt2254;
	public static RSString aClass59_2255;
	public static int anInt2256;
	public static RSString aClass59_2257 = Class55.method898("(U1", -10983);
	public static int anInt2258;
	public static RSString aClass59_2259 = Class55.method898("@cr2@", -10983);
	public static int anInt2260;
	public int[] anIntArray2261 = new int[6];
	public static RSString aClass59_2262;
	public static RSString aClass59_2263 = Class55.method898("yellow:", -10983);
	public static RSString aClass59_2264;
	public static int anInt2265;
	public static int anInt2266;
	public static int anInt2267;
	public static int anInt2268;
	public static int anInt2269;
	public int[] anIntArray2270 = new int[6];
	public boolean aBoolean2271 = false;
	public static int anInt2272;
	public static int anInt2273;
	public int[] anIntArray2274 = { -1, -1, -1, -1, -1 };
	public int[] anIntArray2275;

	public static void method326(int arg0) {
		try {
			anInt2272++;
			if (arg0 != -11301)
				aClass59_2257 = null;
			for (Class12_Sub2 class12_sub2 = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
					.method91((byte) 86); class12_sub2 != null; class12_sub2 = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
					.method100(arg0 + -18559)) {
				if (class12_sub2.anInt1633 == -1) {
					class12_sub2.anInt1640 = 0;
					Class12_Sub1.method147(-26017, class12_sub2);
				} else
					class12_sub2.method143((byte) 39);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "j.K(" + arg0 + ')');
		}
	}

	public boolean method327(int arg0) {
		try {
			boolean bool = true;
			anInt2249++;
			for (int i = arg0; i < 5; i++) {
				if ((anIntArray2274[i] ^ 0xffffffff) != 0
						&& !Class1.aClass26_71.method646(anIntArray2274[i], -1,
								0))
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "j.B(" + arg0 + ')');
		}
	}

	public static void method328(boolean arg0) {
		try {
			aClass59_2263 = null;
			aClass59_2259 = null;
			aClass59_2264 = null;
			aClass59_2255 = null;
			aClass59_2257 = null;
			if (arg0 != true)
				method334(null, -109);
			aClass59_2262 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "j.H(" + arg0 + ')');
		}
	}

	public static RSString method329(RSString[] arg0, int arg1, int arg2, int arg3) {
		try {
			anInt2273++;
			int i = 0;
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (arg3 ^ 0xffffffff); i_0_++) {
				if (arg0[i_0_ + arg1] == null)
					arg0[arg1 - -i_0_] = Class29.aClass59_686;
				i += arg0[arg1 + i_0_].anInt1480;
			}
			if (arg2 <= 75)
				return null;
			int i_1_ = 0;
			byte[] is = new byte[i];
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (arg3 ^ 0xffffffff); i_2_++) {
				RSString class59 = arg0[arg1 + i_2_];
				Class22.method611(class59.chars, 0, is, i_1_,
						class59.anInt1480);
				i_1_ += class59.anInt1480;
			}
			RSString class59 = new RSString();
			class59.anInt1480 = i;
			class59.chars = is;
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("j.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public void method330(int arg0, Buffer arg1, int arg2) {
		try {
			if (arg0 >= -30)
				method328(true);
			anInt2258++;
			if (arg2 == 1)
				anInt2251 = arg1.readSignedByte(true);
			else if ((arg2 ^ 0xffffffff) != -3) {
				if ((arg2 ^ 0xffffffff) == -4)
					aBoolean2271 = true;
				else if ((arg2 ^ 0xffffffff) > -41
						|| (arg2 ^ 0xffffffff) <= -51) {
					if ((arg2 ^ 0xffffffff) > -51 || arg2 >= 60) {
						if ((arg2 ^ 0xffffffff) <= -61
								&& (arg2 ^ 0xffffffff) > -71)
							anIntArray2274[-60 + arg2] = arg1.readShort(-1);
					} else
						anIntArray2270[-50 + arg2] = arg1.readShort(-1);
				} else
					anIntArray2261[-40 + arg2] = arg1.readShort(-1);
			} else {
				int i = arg1.readSignedByte(true);
				anIntArray2275 = new int[i];
				for (int i_3_ = 0; i > i_3_; i_3_++)
					anIntArray2275[i_3_] = arg1.readShort(-1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("j.L(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public void method331(int arg0, Buffer arg1) {
		try {
			if (arg0 == -61) {
				anInt2268++;
				for (;;) {
					int i = arg1.readSignedByte(true);
					if (i == 0)
						break;
					method330(-84, arg1, i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("j.M(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method332(int arg0) {
		try {
			anInt2269++;
			Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = new Class12_Sub12_Sub11_Sub4[5];
			int i = 0;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -6; i_4_++) {
				if (anIntArray2274[i_4_] != -1)
					class12_sub12_sub11_sub4s[i++] = Class12_Sub12_Sub11_Sub4
							.method496((Class1.aClass26_71),
									(anIntArray2274[i_4_]), 0);
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = new Class12_Sub12_Sub11_Sub4(
					class12_sub12_sub11_sub4s, i);
			if (arg0 != 4922)
				return null;
			for (int i_5_ = 0; i_5_ < 6; i_5_++) {
				if (anIntArray2261[i_5_] == 0)
					break;
				class12_sub12_sub11_sub4.method489(anIntArray2261[i_5_],
						anIntArray2270[i_5_]);
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "j.E(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method333(byte arg0) {
		try {
			anInt2256++;
			int i = -82 / ((5 - arg0) / 54);
			if (anIntArray2275 == null)
				return null;
			Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = new Class12_Sub12_Sub11_Sub4[anIntArray2275.length];
			for (int i_6_ = 0; (anIntArray2275.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
				class12_sub12_sub11_sub4s[i_6_] = Class12_Sub12_Sub11_Sub4
						.method496(Class1.aClass26_71, anIntArray2275[i_6_], 0);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4;
			if (class12_sub12_sub11_sub4s.length == 1)
				class12_sub12_sub11_sub4 = class12_sub12_sub11_sub4s[0];
			else
				class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
						class12_sub12_sub11_sub4s,
						class12_sub12_sub11_sub4s.length));
			for (int i_7_ = 0; i_7_ < 6; i_7_++) {
				if (anIntArray2261[i_7_] == 0)
					break;
				class12_sub12_sub11_sub4.method489(anIntArray2261[i_7_],
						anIntArray2270[i_7_]);
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "j.J(" + arg0 + ')');
		}
	}

	public static void method334(Class26 arg0, int arg1) {
		try {
			if (arg1 != -60)
				aClass59_2262 = null;
			anInt2254++;
			Class48.aClass26_1134 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("j.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static Archive method335(boolean arg0, boolean arg1, int arg2,
									boolean arg3, int arg4) {
		try {
			anInt2265++;
			if (arg4 != -28677)
				method338(57);
			Class36 class36 = null;
			if (Class36.aClass51_879 != null)
				class36 = new Class36(arg2, Class36.aClass51_879,
						Class19.aClass51Array452[arg2], 1000000);
			return new Archive(class36, Class64_Sub2.aClass36_1977, arg2,
					arg0, arg3, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("j.G(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')'));
		}
	}

	public boolean method336(byte arg0) {
		try {
			anInt2253++;
			if (anIntArray2275 == null)
				return true;
			boolean bool = true;
			if (arg0 >= -60)
				anIntArray2261 = null;
			for (int i = 0; (i ^ 0xffffffff) > (anIntArray2275.length ^ 0xffffffff); i++) {
				if (!Class1.aClass26_71.method646(anIntArray2275[i], -1, 0))
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "j.F(" + arg0 + ')');
		}
	}

	public static void method337(long arg0, int arg1) {
		do {
			try {
				try {
					Thread.sleep(arg0);
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				anInt2260++;
				if (arg1 == -22614)
					break;
				anInt2267 = -26;
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "j.I(" + arg0 + ','
						+ arg1 + ')');
			}
			break;
		} while (false);
	}

	public static void method338(int arg0) {
		try {
			anInt2266++;
			if (Class44.aBoolean1047) {
				Class42.aClass62_986 = null;
				Class12_Sub6.anIntArray1702 = null;
				Class12_Sub12_Sub4.aClass12_Sub12_Sub7_Sub1_2210 = null;
				if (arg0 <= -118) {
					Class15.anIntArray397 = null;
					Class20.aClass12_Sub12_Sub7_Sub2_477 = null;
					Class39.anIntArray929 = null;
					Class42.aClass62_984 = null;
					Class31.aClass62_771 = null;
					Class12_Sub12_Sub10.aClass12_Sub12_Sub7_Sub2_2372 = null;
					Class29.anIntArray714 = null;
					Class12_Sub12_Sub4.aClass62_2203 = null;
					Game.aClass12_Sub12_Sub7_Sub1_1553 = null;
					Class35.aClass62_863 = null;
					Class12_Sub12_Sub11_Sub6.anIntArray2886 = null;
					Class12_Sub12_Sub11_Sub2_Sub1.anIntArray2929 = null;
					Class5.aClass62_148 = null;
					Class9.aClass62_214 = null;
					Class12_Sub12_Sub8.anIntArray2298 = null;
					Class26.aClass62_612 = null;
					RSApplet.anIntArray36 = null;
					RSSocket.aClass12_Sub12_Sub7_Sub2Array523 = null;
					Class20.aClass62_471 = null;
					Class11.method139(10, (byte) 109);
					Class40.method754(true, 4);
					Class44.aBoolean1047 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "j.C(" + arg0 + ')');
		}
	}

	static {
		aClass59_2255 = aClass59_2263;
		anInt2267 = 0;
		anInt2250 = 0;
		aClass59_2264 = Class55.method898("purple:", -10983);
		aClass59_2262 = aClass59_2264;
	}
}
