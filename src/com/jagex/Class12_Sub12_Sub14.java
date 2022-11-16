package com.jagex;/* com.jagex.Class12_Sub12_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class12_Sub12_Sub14 extends Class12_Sub12 {
	public static int anInt2447;
	public int anInt2448;
	public int anInt2449;
	public static Class12_Sub5_Sub1 aClass12_Sub5_Sub1_2450;
	public static int anInt2451;
	public int anInt2452;
	public static int anInt2453;
	public static int anInt2454;
	public int anInt2455 = 0;
	public static int anInt2456;
	public static int anInt2457;
	public int anInt2458;
	public int anInt2459;
	public int[] anIntArray2460;
	public static int anInt2461;
	public static RSString aClass59_2462;
	public int[] anIntArray2463;
	public static int anInt2464 = 0;
	public static RSString aClass59_2465;
	public int anInt2466;
	public int anInt2467;

	public Class12_Sub12_Sub11_Sub4 method536(byte arg0, int arg1) {
		try {
			anInt2461++;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class12_Sub12_Sub11_Sub2_Sub1.aClass27_2912
					.method673(106, (long) anInt2452));
			if (arg0 <= 118)
				aClass59_2462 = null;
			if (class12_sub12_sub11_sub4 == null) {
				class12_sub12_sub11_sub4 = Class12_Sub12_Sub11_Sub4.method496(
						Class35.aClass26_846, anInt2459, 0);
				if (class12_sub12_sub11_sub4 == null)
					return null;
				for (int i = 0; i < 6; i++) {
					if (anIntArray2460[0] != 0)
						class12_sub12_sub11_sub4.method489(anIntArray2460[i],
								anIntArray2463[i]);
				}
				class12_sub12_sub11_sub4.method471();
				class12_sub12_sub11_sub4.method485(anInt2467 + 64,
						anInt2455 + 850, -30, -50, -30, true);
				Class12_Sub12_Sub11_Sub2_Sub1.aClass27_2912.method678(
						(byte) 123, class12_sub12_sub11_sub4, (long) anInt2452);
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_0_;
			if ((anInt2449 ^ 0xffffffff) != 0 && (arg1 ^ 0xffffffff) != 0)
				class12_sub12_sub11_sub4_0_ = (Class5.method74(9, anInt2449)
						.method314(class12_sub12_sub11_sub4, (byte) 51, arg1));
			else
				class12_sub12_sub11_sub4_0_ = class12_sub12_sub11_sub4
						.method475(true);
			if ((anInt2448 ^ 0xffffffff) != -129
					|| (anInt2458 ^ 0xffffffff) != -129)
				class12_sub12_sub11_sub4_0_.method477(anInt2448, anInt2458,
						anInt2448);
			if (anInt2466 != 0) {
				if (anInt2466 == 90)
					class12_sub12_sub11_sub4_0_.method473();
				if ((anInt2466 ^ 0xffffffff) == -181) {
					class12_sub12_sub11_sub4_0_.method473();
					class12_sub12_sub11_sub4_0_.method473();
				}
				if ((anInt2466 ^ 0xffffffff) == -271) {
					class12_sub12_sub11_sub4_0_.method473();
					class12_sub12_sub11_sub4_0_.method473();
					class12_sub12_sub11_sub4_0_.method473();
				}
			}
			return class12_sub12_sub11_sub4_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qd.F(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method537(int arg0, boolean arg1) {
		try {
			if ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691 >> 1088658343) == Class23.anInt499
					&& ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683 >> 1440313671) ^ 0xffffffff) == (Class29.anInt711 ^ 0xffffffff))
				Class23.anInt499 = 0;
			if (arg0 == 6) {
				anInt2456++;
				int i = Class9.anInt203;
				if (arg1)
					i = 1;
				int i_1_ = 0;
				for (/**/; i > i_1_; i_1_++) {
					Player class12_sub12_sub11_sub2_sub2;
					int i_2_;
					if (arg1) {
						i_2_ = 33538048;
						class12_sub12_sub11_sub2_sub2 = Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713;
					} else {
						class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[Class36.anIntArray888[i_1_]]);
						i_2_ = Class36.anIntArray888[i_1_] << 2146889134;
					}
					if (class12_sub12_sub11_sub2_sub2 != null
							&& class12_sub12_sub11_sub2_sub2
									.method452(-251272184)) {
						class12_sub12_sub11_sub2_sub2.aBoolean2960 = false;
						int i_3_ = (class12_sub12_sub11_sub2_sub2.anInt2691 >> -1113687097);
						int i_4_ = (class12_sub12_sub11_sub2_sub2.anInt2683 >> 1964976903);
						if (((Class21.aBoolean483 && (Class9.anInt203 ^ 0xffffffff) < -51) || (Class9.anInt203 ^ 0xffffffff) < -201)
								&& !arg1
								&& (class12_sub12_sub11_sub2_sub2.anInt2681 == class12_sub12_sub11_sub2_sub2.anInt2718))
							class12_sub12_sub11_sub2_sub2.aBoolean2960 = true;
						if (i_3_ >= 0 && (i_3_ ^ 0xffffffff) > -105
								&& i_4_ >= 0 && i_4_ < 104) {
							if ((class12_sub12_sub11_sub2_sub2.aClass12_Sub12_Sub11_Sub4_2963) == null
									|| ((class12_sub12_sub11_sub2_sub2.anInt2946 ^ 0xffffffff) < (Class64_Sub2.anInt1968 ^ 0xffffffff))
									|| (Class64_Sub2.anInt1968 >= (class12_sub12_sub11_sub2_sub2.anInt2959))) {
								if (((class12_sub12_sub11_sub2_sub2.anInt2691 & 0x7f) ^ 0xffffffff) == -65
										&& (0x7f & (class12_sub12_sub11_sub2_sub2.anInt2683)) == 64) {
									if (RSString.anInt1479 == (Class30.anIntArrayArray722[i_3_][i_4_]))
										continue;
									Class30.anIntArrayArray722[i_3_][i_4_] = RSString.anInt1479;
								}
								class12_sub12_sub11_sub2_sub2.anInt2943 = (Class26
										.method658(
												(class12_sub12_sub11_sub2_sub2.anInt2691),
												-6,
												RSString.anInt1504,
												(class12_sub12_sub11_sub2_sub2.anInt2683)));
								Class12_Sub12_Sub8.aClass52_2295
										.method833(
												RSString.anInt1504,
												class12_sub12_sub11_sub2_sub2.anInt2691,
												class12_sub12_sub11_sub2_sub2.anInt2683,
												class12_sub12_sub11_sub2_sub2.anInt2943,
												60,
												class12_sub12_sub11_sub2_sub2,
												class12_sub12_sub11_sub2_sub2.anInt2680,
												i_2_,
												(class12_sub12_sub11_sub2_sub2.aBoolean2723));
							} else {
								class12_sub12_sub11_sub2_sub2.aBoolean2960 = false;
								class12_sub12_sub11_sub2_sub2.anInt2943 = (Class26
										.method658(
												(class12_sub12_sub11_sub2_sub2.anInt2691),
												-6,
												RSString.anInt1504,
												(class12_sub12_sub11_sub2_sub2.anInt2683)));
								Class12_Sub12_Sub8.aClass52_2295
										.method845(
												RSString.anInt1504,
												class12_sub12_sub11_sub2_sub2.anInt2691,
												class12_sub12_sub11_sub2_sub2.anInt2683,
												class12_sub12_sub11_sub2_sub2.anInt2943,
												60,
												class12_sub12_sub11_sub2_sub2,
												class12_sub12_sub11_sub2_sub2.anInt2680,
												i_2_,
												class12_sub12_sub11_sub2_sub2.anInt2958,
												class12_sub12_sub11_sub2_sub2.anInt2942,
												class12_sub12_sub11_sub2_sub2.anInt2950,
												class12_sub12_sub11_sub2_sub2.anInt2940);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qd.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method538(Buffer arg0, int arg1) {
		try {
			for (;;) {
				int i = arg0.readUByte();
				if ((i ^ 0xffffffff) == -1)
					break;
				method541(arg0, -51, i);
			}
			int i = -11 % ((arg1 - -22) / 55);
			anInt2457++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qd.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static RSString method539(int arg0, byte[] arg1, int arg2, int arg3) {
		try {
			if (arg0 != 0)
				aClass59_2465 = null;
			RSString class59 = new RSString();
			anInt2454++;
			class59.anInt1480 = arg2;
			class59.chars = new byte[arg2];
			Class22.method611(arg1, arg3, class59.chars, 0, arg2);
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("qd.E(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public static void method540(int arg0) {
		try {
			aClass59_2462 = null;
			if (arg0 != -1113687097)
				aClass12_Sub5_Sub1_2450 = null;
			aClass12_Sub5_Sub1_2450 = null;
			aClass59_2465 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qd.A(" + arg0 + ')');
		}
	}

	public void method541(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == -51) {
				if (arg2 == 1)
					anInt2459 = arg0.readShort(-1);
				else if (arg2 == 2)
					anInt2449 = arg0.readShort(-1);
				else if (arg2 == 4)
					anInt2448 = arg0.readShort(-1);
				else if (arg2 == 5)
					anInt2458 = arg0.readShort(-1);
				else if ((arg2 ^ 0xffffffff) == -7)
					anInt2466 = arg0.readShort(-1);
				else if ((arg2 ^ 0xffffffff) == -8)
					anInt2467 = arg0.readUByte();
				else if ((arg2 ^ 0xffffffff) == -9)
					anInt2455 = arg0.readUByte();
				else if ((arg2 ^ 0xffffffff) > -41
						|| (arg2 ^ 0xffffffff) <= -51) {
					if (arg2 >= 50 && arg2 < 60)
						anIntArray2463[-50 + arg2] = arg0.readShort(Class21
								.method609(arg1, 50));
				} else
					anIntArray2460[arg2 - 40] = arg0.readShort(-1);
				anInt2453++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("qd.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public Class12_Sub12_Sub14() {
		anInt2448 = 128;
		anInt2458 = 128;
		anInt2449 = -1;
		anIntArray2460 = new int[6];
		anInt2466 = 0;
		anIntArray2463 = new int[6];
		anInt2467 = 0;
	}

	static {
		aClass59_2462 = Class55.method898(":tradereq:", -10983);
		aClass59_2465 = Class55.method898("k", -10983);
	}
}
