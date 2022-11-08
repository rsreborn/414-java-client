package com.jagex;/* com.jagex.Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;

public class Class40 {
	public static RSString aClass59_944;
	public static int anInt945;
	public static RSString aClass59_946 = Class55.method898(" @whi@", -10983);
	public static int anInt947;
	public static int anInt948;
	public static int anInt949;
	public static int anInt950;
	public static int[] anIntArray951;
	public static int anInt952;
	public static int anInt953;
	public static int anInt954;
	public static RSString aClass59_955;
	public static int anInt956;
	public static byte[][] aByteArrayArray957;

	public static void method748(Archive arg0, byte arg1, int arg2) {
		try {
			anInt952++;
			if (arg1 != 0)
				method752(26, -59, null, null, -64, -118, -26);
			if (Class12_Sub12_Sub9.aClass12_Sub11_2339 != null) {
				Class12_Sub12_Sub9.aClass12_Sub11_2339.position = 5 + arg2 * 4;
				int i = Class12_Sub12_Sub9.aClass12_Sub11_2339
						.method207(-708753192);
				arg0.method663(arg1 + 255, i);
			} else {
				Class12_Sub12_Sub11_Sub6.method512(2119418128, true, null, 0,
						(byte) 0, 255, 255);
				Class5.aClass26_Sub1Array154[arg2] = arg0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nb.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static void method749(int arg0) {
		try {
			aClass59_955 = null;
			if (arg0 <= 23)
				method754(false, -101);
			aClass59_944 = null;
			aByteArrayArray957 = null;
			aClass59_946 = null;
			anIntArray951 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nb.A(" + arg0 + ')');
		}
	}

	public static void method750(boolean arg0, int arg1, int arg2, byte[] arg3,
			int arg4) {
		try {
			anInt947++;
			if (arg4 == 15204 && Class5.aClass64_158 != null) {
				if (Class33.anInt825 >= 0) {
					Class12_Sub12_Sub11_Sub2_Sub2.anInt2976 = arg1;
					if (Class33.anInt825 != 0) {
						int i = RuntimeException_Sub1.method1003(
								Class33.anInt825, 0);
						i -= Class15.anInt395;
						Class49.anInt1142 = (3600 + i) / arg1;
						if ((Class49.anInt1142 ^ 0xffffffff) > -2)
							Class49.anInt1142 = 1;
					} else
						Class49.anInt1142 = 1;
					Class27.aByteArray655 = arg3;
					Class12_Sub12_Sub13.anInt2421 = arg2;
					Class33.aBoolean822 = arg0;
				} else if ((Class49.anInt1142 ^ 0xffffffff) == -1)
					Class7.method83((byte) -80, arg2, arg3, arg0);
				else {
					Class12_Sub12_Sub13.anInt2421 = arg2;
					Class33.aBoolean822 = arg0;
					Class27.aByteArray655 = arg3;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nb.C(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ')'));
		}
	}

	public static void method751(byte arg0) {
		try {
			if (arg0 > 75) {
				Class12_Sub12_Sub5.aClass27_2236.method675(true);
				anInt950++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nb.D(" + arg0 + ')');
		}
	}

	public static void method752(int arg0, int arg1, Class10[] arg2,
			byte[] arg3, int arg4, int arg5, int arg6) {
		try {
			int i = 0;
			if (arg0 == -65) {
				for (/**/; (i ^ 0xffffffff) > -5; i++) {
					for (int i_0_ = 0; i_0_ < 64; i_0_++) {
						for (int i_1_ = 0; i_1_ < 64; i_1_++) {
							if (i_0_ + arg6 > 0
									&& (arg6 + i_0_ ^ 0xffffffff) > -104
									&& (arg4 - -i_1_ ^ 0xffffffff) < -1
									&& (arg4 - -i_1_ ^ 0xffffffff) > -104)
								arg2[i].anIntArrayArray222[arg6 + i_0_][arg4
										+ i_1_] = (Class12_Sub12_Sub12
										.method519(
												(arg2[i].anIntArrayArray222[arg6
														+ i_0_][arg4 + i_1_]),
												-16777217));
						}
					}
				}
				Buffer class12_sub11 = new Buffer(arg3);
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -5; i_2_++) {
					for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -65; i_3_++) {
						for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -65; i_4_++)
							Class51.method812(arg1, i_4_ + arg4, 0, i_2_, arg5,
									125, arg6 + i_3_, class12_sub11);
					}
				}
				anInt956++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nb.G(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ')'));
		}
	}

	public static void method753(long arg0, int arg1) {
		try {
			if (arg1 == -19259) {
				anInt948++;
				if (arg0 != 0L) {
					for (int i = 0; (Class7.anInt1540 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						if (Class47.aLongArray1099[i] == arg0) {
							Class49.aBoolean1146 = true;
							Class7.anInt1540--;
							Class42.anInt979++;
							for (int i_5_ = i; ((i_5_ ^ 0xffffffff) > (Class7.anInt1540 ^ 0xffffffff)); i_5_++) {
								Class12_Sub12_Sub11_Sub6.aClass59Array2910[i_5_] = (Class12_Sub12_Sub11_Sub6.aClass59Array2910[i_5_
										- -1]);
								Class12_Sub12_Sub4.anIntArray2227[i_5_] = (Class12_Sub12_Sub4.anIntArray2227[1 + i_5_]);
								Class47.aLongArray1099[i_5_] = Class47.aLongArray1099[i_5_ + 1];
							}
							Game.outBuffer
									.writePacket(164);
							Game.outBuffer.writeLongBE(
                                    arg0);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nb.F(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method754(boolean arg0, int arg1) {
		try {
			anInt945++;
			if (Class48.aClass24_1124 != null) {
				if (arg1 != 4)
					method750(true, -118, -127, null, -127);
				try {
					Buffer class12_sub11 = new Buffer(4);
					class12_sub11.writeByte(!arg0 ? 3 : 2);
					class12_sub11.method254(0, (byte) -119);
					Class48.aClass24_1124.method622(
							class12_sub11.payload, 4, 0, true);
				} catch (java.io.IOException ioexception) {
					try {
						Class48.aClass24_1124.method619(-2);
					} catch (Exception exception) {
						/* empty */
					}
					Class12_Sub12_Sub8.anInt2294++;
					Class48.aClass24_1124 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nb.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		aClass59_944 = Class55.method898("Connection timed out)3", -10983);
		anInt953 = 0;
		aClass59_955 = aClass59_944;
	}
}
