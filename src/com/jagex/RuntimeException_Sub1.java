package com.jagex;/* com.jagex.RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

import java.awt.Graphics;

public class RuntimeException_Sub1 extends RuntimeException {
	public static RSString aClass59_1452 = Class55.method898(" )2> @whi@",
			-10983);
	public Throwable aThrowable1453;
	public static int anInt1454;
	public static int anInt1455;
	public static int anInt1456;
	public static int anInt1457;
	public String aString1458;
	public static int anInt1459;
	public static Class8 aClass8_1460 = new Class8();
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_1461;
	public static RSString aClass59_1462 = Class55.method898(
			"Login attempts exceeded)3", -10983);
	public static Class26 aClass26_1463;
	public static int anInt1464;
	public static int[] anIntArray1465;
	public static int anInt1466;
	public static RSString aClass59_1467 = Class55.method898(" @lre@", -10983);
	public static RSString aClass59_1468;
	public static RSString aClass59_1469 = aClass59_1462;
	public static boolean[] aBooleanArray1470;
	public static int anInt1471;
	public static int anInt1472 = 0;
	public static int anInt1473;

	public static Class12_Sub12_Sub7_Sub4 method1000(byte arg0, int arg1,
			int arg2, Class26 arg3) {
		try {
			if (arg0 < 52)
				method1003(-29, 115);
			anInt1456++;
			if (!Class5.method77(arg2, 29066, arg3, arg1))
				return null;
			return Class10.method126(false);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("la.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1001(int arg0) {
		try {
			aClass59_1452 = null;
			anIntArray1465 = null;
			aClass59_1462 = null;
			aClass59_1468 = null;
			aClass59_1469 = null;
			aClass59_1467 = null;
			aBooleanArray1470 = null;
			if (arg0 == 16) {
				aClass26_1463 = null;
				aClass8_1460 = null;
				aClass12_Sub12_Sub7_Sub2_1461 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method1002(byte arg0, Class12_Sub12_Sub7_Sub4 arg1,
			Class12_Sub12_Sub7_Sub4 arg2) {
		do {
			try {
				Class26.aClass62_612.method960(-1);
				if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -1
						|| Class9_Sub2.anInt1588 == 5) {
					int i = 20;
					int i_0_ = -i + 82;
					arg2.method396(Class18.aClass59_431, 180, -i + 74, 16777215);
					Class12_Sub12_Sub7.method339(28, i_0_, 304, 34, 9179409);
					Class12_Sub12_Sub7.method339(29, i_0_ - -1, 302, 32, 0);
					Class12_Sub12_Sub7.method347(30, 2 + i_0_,
							3 * Class64_Sub1.anInt1951, 30, 9179409);
					Class12_Sub12_Sub7.method347(
							3 * Class64_Sub1.anInt1951 + 30, 2 + i_0_,
							-(3 * Class64_Sub1.anInt1951) + 300, 30, 0);
					arg2.method396(Class11.aClass59_285, 180, 105 + -i,
							16777215);
				}
				anInt1454++;
				if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -21) {
					int i = 40;
					Class12_Sub12_Sub10.aClass12_Sub12_Sub7_Sub2_2372
							.method370(0, 0);
					arg2.method395(Class11.aClass59_312, 180, i, 16776960, true);
					i += 15;
					arg2.method395(Class11.aClass59_279, 180, i, 16776960, true);
					i += 15;
					arg2.method395(Class11.aClass59_289, 180, i, 16776960, true);
					i += 15;
					i += 10;
					arg2.method406((Statics.method251((byte) -75,
							new RSString[] { Class38.aClass59_923,
									Class11.aClass59_260 })), 90, i, 16777215,
							true);
					i += 15;
					arg2.method406(
							(Statics
									.method251(
											(byte) -94,
											(new RSString[] {
													(Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2936),
													Class11.aClass59_301
															.method944(-121) }))),
							92, i, 16777215, true);
					i += 15;
				}
				if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -11) {
					Class12_Sub12_Sub10.aClass12_Sub12_Sub7_Sub2_2372
							.method370(0, 0);
					if ((Class12_Sub12_Sub6.anInt2250 ^ 0xffffffff) != -1) {
						if ((Class12_Sub12_Sub6.anInt2250 ^ 0xffffffff) == -3) {
							int i = 40;
							arg2.method395(Class11.aClass59_312, 180, i,
									16776960, true);
							int i_1_ = 100;
							int i_2_ = 150;
							i += 15;
							arg2.method395(Class11.aClass59_279, 180, i,
									16776960, true);
							i += 15;
							arg2.method395(Class11.aClass59_289, 180, i,
									16776960, true);
							i += 15;
							i += 10;
							arg2.method406(
									(Statics
											.method251(
													(byte) -116,
													(new RSString[] {
															Class38.aClass59_923,
															Class11.aClass59_260,
															(!((Class62_Sub2.anInt1917 ^ 0xffffffff) == -1 & (Class64_Sub2.anInt1968 % 40) < 20) ? Class11.aClass59_273
																	: (Class12_Sub12_Sub11.aClass59_2395)) }))),
									90, i, 16777215, true);
							i += 15;
							arg2.method406(
									(Statics
											.method251(
													(byte) -123,
													(new RSString[] {
															(Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2936),
															Class11.aClass59_301
																	.method944(-126),
															((((Class62_Sub2.anInt1917 ^ 0xffffffff) == -2) & Class64_Sub2.anInt1968 % 40 < 20) ? Class12_Sub12_Sub11.aClass59_2395
																	: Class11.aClass59_273) }))),
									92, i, 16777215, true);
							i += 15;
							Class20.aClass12_Sub12_Sub7_Sub2_477.method370(
									i_1_ - 73, i_2_ + -20);
							arg2.method395(Class12_Sub12_Sub2.aClass59_2087,
									i_1_, 5 + i_2_, 16777215, true);
							i_1_ = 260;
							Class20.aClass12_Sub12_Sub7_Sub2_477.method370(
									i_1_ - 73, i_2_ - 20);
							arg2.method395(RSCanvas.aClass59_54, i_1_,
									5 + i_2_, 16777215, true);
						} else if (Class12_Sub12_Sub6.anInt2250 == 3) {
							int i = 65;
							arg2.method395(RSCanvas.aClass59_56, 180, 40,
									16776960, true);
							arg2.method395(Class12_Sub2.aClass59_1632, 180, i,
									16777215, true);
							i += 15;
							int i_3_ = 180;
							int i_4_ = 150;
							arg2.method395(Class62_Sub2.aClass59_1934, 180, i,
									16777215, true);
							i += 15;
							arg2.method395(Class12_Sub4.aClass59_1669, 180, i,
									16777215, true);
							i += 15;
							arg2.method395(
									(Class12_Sub12_Sub11_Sub1.aClass59_2656),
									180, i, 16777215, true);
							Class20.aClass12_Sub12_Sub7_Sub2_477.method370(
									i_3_ - 73, -20 + i_4_);
							arg2.method395(RSCanvas.aClass59_54, i_3_,
									5 + i_4_, 16777215, true);
							i += 15;
						}
					} else {
						int i = 120;
						int i_5_ = 100;
						int i_6_ = 80;
						arg2.method395(Class19.aClass59_450, 180, i_6_,
								16776960, true);
						Class20.aClass12_Sub12_Sub7_Sub2_477.method370(
								i_5_ - 73, i - 20);
						i_6_ += 30;
						arg2.method395(RSSocket.aClass59_537, i_5_, 5 + i,
								16777215, true);
						i_5_ = 260;
						Class20.aClass12_Sub12_Sub7_Sub2_477.method370(-73
								+ i_5_, i - 20);
						arg2.method395(Class62.aClass59_1380, i_5_, 5 + i,
								16777215, true);
					}
				}
				Class1.method42(-1);
				try {
					Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
							.getGraphics();
					Class26.aClass62_612.method957(-5917, 171, 202, graphics);
					Class5.aClass62_148.method957(-5917, 0, 0, graphics);
					Class31.aClass62_771.method957(-5917, 0, 637, graphics);
					if (Class27.aBoolean642) {
						Class27.aBoolean642 = false;
						Class35.aClass62_863.method957(-5917, 0, 128, graphics);
						Class9.aClass62_214
								.method957(-5917, 371, 202, graphics);
						Class42.aClass62_984.method957(-5917, 265, 0, graphics);
						Class20.aClass62_471.method957(-5917, 265, 562,
								graphics);
						Class12_Sub12_Sub4.aClass62_2203.method957(-5917, 171,
								128, graphics);
						Class42.aClass62_986.method957(-5917, 171, 562,
								graphics);
					}
					if (arg0 < -3)
						break;
					aClass8_1460 = null;
				} catch (Exception exception) {
					Class12_Sub12_Sub5.aCanvas2243.repaint();
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, ("la.C(" + arg0 + ','
						+ (arg1 != null ? "{...}" : "null") + ','
						+ (arg2 != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	public static int method1003(int arg0, int arg1) {
		try {
			if (arg1 != 0)
				return -127;
			anInt1457++;
			return (int) ((Math.log(0.00390625 * (double) arg0) * 868.5889638065036) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "la.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static int method1004(int arg0, int arg1, byte arg2, int arg3) {
		try {
			if (arg3 > 179)
				arg0 /= 2;
			if (arg2 <= 103)
				return 99;
			anInt1464++;
			if (arg3 > 192)
				arg0 /= 2;
			if ((arg3 ^ 0xffffffff) < -218)
				arg0 /= 2;
			if (arg3 > 243)
				arg0 /= 2;
			int i = (arg3 / 2 + ((arg1 / 4 << 1612767050) + (arg0 / 32 << -406803353)));
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("la.A(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method1005(int arg0, int arg1, Class10 arg2, int arg3,
			int arg4, int arg5, Class52 arg6, int arg7, int arg8) {
		try {
			anInt1455++;
			if (!Class21.aBoolean483
					|| ((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[0][arg0][arg8]) & 0x2 ^ 0xffffffff) != -1
					|| ((0x10 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg5][arg0][arg8])) == 0 && (Class20
							.method602(arg0, (byte) 47, arg5, arg8) ^ 0xffffffff) == (Class39.anInt932 ^ 0xffffffff))) {
				if ((Archive.anInt1882 ^ 0xffffffff) < (arg5 ^ 0xffffffff))
					Archive.anInt1882 = arg5;
				if (arg1 == 16057) {
					int i = Statics.anIntArrayArrayArray569[arg5][arg0][arg8];
					int i_7_ = (Statics.anIntArrayArrayArray569[arg5][arg0 - -1][arg8]);
					int i_8_ = (Statics.anIntArrayArrayArray569[arg5][arg0 - -1][1 + arg8]);
					int i_9_ = (Statics.anIntArrayArrayArray569[arg5][arg0][arg8 + 1]);
					Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
							.method39(arg1 + -16051, arg4);
					int i_10_ = (arg3 << 1069843142) - -arg7;
					if (class12_sub12_sub9.anInt2344 == 1)
						i_10_ += 256;
					int i_11_ = i_9_ + (i_7_ + (i + i_8_)) >> 1339799490;
					int i_12_ = ((arg4 << 1096772494) + arg0 - (-(arg8 << -2136051833) + -1073741824));
					if ((class12_sub12_sub9.anInt2320 ^ 0xffffffff) == -1)
						i_12_ += -2147483648;
					if (arg7 == 22) {
						if (!Class21.aBoolean483
								|| class12_sub12_sub9.anInt2320 != 0
								|| class12_sub12_sub9.aBoolean2336) {
							Class12_Sub12_Sub11 class12_sub12_sub11;
							if (((class12_sub12_sub9.anInt2330 ^ 0xffffffff) != 0)
									|| class12_sub12_sub9.anIntArray2310 != null)
								class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
										arg4, 22, arg3, i, i_7_, i_8_, i_9_,
										class12_sub12_sub9.anInt2330, true));
							else
								class12_sub12_sub11 = class12_sub12_sub9
										.method424(-73, i, i_9_, arg3, 22,
												i_7_, i_8_);
							arg6.method852(arg5, arg0, arg8, i_11_,
									class12_sub12_sub11, i_12_, i_10_);
							if (class12_sub12_sub9.aBoolean2317
									&& class12_sub12_sub9.anInt2320 == 1
									&& arg2 != null)
								arg2.method128(arg0, -128, arg8);
						}
					} else if (arg7 == 10 || (arg7 ^ 0xffffffff) == -12) {
						Class12_Sub12_Sub11 class12_sub12_sub11;
						if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
								&& class12_sub12_sub9.anIntArray2310 == null)
							class12_sub12_sub11 = class12_sub12_sub9.method424(
									-73, i, i_9_, arg3, 10, i_7_, i_8_);
						else
							class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
									arg4, 10, arg3, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
						if (class12_sub12_sub11 != null) {
							int i_13_;
							int i_14_;
							if ((arg3 ^ 0xffffffff) == -2 || arg3 == 3) {
								i_14_ = class12_sub12_sub9.anInt2318;
								i_13_ = class12_sub12_sub9.anInt2334;
							} else {
								i_13_ = class12_sub12_sub9.anInt2318;
								i_14_ = class12_sub12_sub9.anInt2334;
							}
							int i_15_ = 0;
							if ((arg7 ^ 0xffffffff) == -12)
								i_15_ += 256;
							if (arg6.method837(arg5, arg0, arg8, i_11_, i_13_,
									i_14_, class12_sub12_sub11, i_15_, i_12_,
									i_10_)
									&& class12_sub12_sub9.aBoolean2337) {
								Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4;
								if (!(class12_sub12_sub11 instanceof Class12_Sub12_Sub11_Sub4))
									class12_sub12_sub11_sub4 = class12_sub12_sub9
											.method424(-73, i, i_9_, arg3, 10,
													i_7_, i_8_);
								else
									class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class12_sub12_sub11);
								if (class12_sub12_sub11_sub4 != null) {
									for (int i_16_ = 0; i_16_ <= i_13_; i_16_++) {
										for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff)); i_17_++) {
											int i_18_ = (class12_sub12_sub11_sub4
													.method497() / 4);
											if ((i_18_ ^ 0xffffffff) < -31)
												i_18_ = 30;
											if (((RSCanvas.aByteArrayArrayArray43[arg5][arg0
													+ i_16_][arg8 - -i_17_]) ^ 0xffffffff) > (i_18_ ^ 0xffffffff))
												RSCanvas.aByteArrayArrayArray43[arg5][i_16_
														+ arg0][i_17_ + arg8] = (byte) i_18_;
										}
									}
								}
							}
						}
						if (class12_sub12_sub9.aBoolean2317 && arg2 != null)
							arg2.method116(-2, arg8,
									class12_sub12_sub9.aBoolean2321, arg3,
									arg0, class12_sub12_sub9.anInt2318,
									class12_sub12_sub9.anInt2334);
					} else if ((arg7 ^ 0xffffffff) <= -13) {
						Class12_Sub12_Sub11 class12_sub12_sub11;
						if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
								&& class12_sub12_sub9.anIntArray2310 == null)
							class12_sub12_sub11 = class12_sub12_sub9.method424(
									-73, i, i_9_, arg3, arg7, i_7_, i_8_);
						else
							class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
									arg4, arg7, arg3, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
						arg6.method837(arg5, arg0, arg8, i_11_, 1, 1,
								class12_sub12_sub11, 0, i_12_, i_10_);
						if (arg7 >= 12 && (arg7 ^ 0xffffffff) >= -18
								&& (arg7 ^ 0xffffffff) != -14
								&& (arg5 ^ 0xffffffff) < -1)
							Class30.anIntArrayArrayArray732[arg5][arg0][arg8] = (Class12_Sub12_Sub9
									.method421(
											(Class30.anIntArrayArrayArray732[arg5][arg0][arg8]),
											2340));
						if (class12_sub12_sub9.aBoolean2317 && arg2 != null)
							arg2.method116(arg1 ^ ~0x3eb8, arg8,
									class12_sub12_sub9.aBoolean2321, arg3,
									arg0, class12_sub12_sub9.anInt2318,
									class12_sub12_sub9.anInt2334);
					} else if ((arg7 ^ 0xffffffff) == -1) {
						Class12_Sub12_Sub11 class12_sub12_sub11;
						if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
								&& class12_sub12_sub9.anIntArray2310 == null)
							class12_sub12_sub11 = class12_sub12_sub9
									.method424(arg1 + -16130, i, i_9_, arg3, 0,
											i_7_, i_8_);
						else
							class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
									arg4, 0, arg3, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
						arg6.method846(arg5, arg0, arg8, i_11_,
								class12_sub12_sub11, null,
								Class32.anIntArray789[arg3], 0, i_12_, i_10_);
						if ((arg3 ^ 0xffffffff) == -1) {
							if (class12_sub12_sub9.aBoolean2337) {
								RSCanvas.aByteArrayArrayArray43[arg5][arg0][arg8] = (byte) 50;
								RSCanvas.aByteArrayArrayArray43[arg5][arg0][1 + arg8] = (byte) 50;
							}
							if (class12_sub12_sub9.aBoolean2352)
								Class30.anIntArrayArrayArray732[arg5][arg0][arg8] = (Class12_Sub12_Sub9
										.method421(
												(Class30.anIntArrayArrayArray732[arg5][arg0][arg8]),
												585));
						} else if (arg3 != 1) {
							if ((arg3 ^ 0xffffffff) != -3) {
								if ((arg3 ^ 0xffffffff) == -4) {
									if (class12_sub12_sub9.aBoolean2337) {
										RSCanvas.aByteArrayArrayArray43[arg5][arg0][arg8] = (byte) 50;
										RSCanvas.aByteArrayArrayArray43[arg5][arg0 + 1][arg8] = (byte) 50;
									}
									if (class12_sub12_sub9.aBoolean2352)
										Class30.anIntArrayArrayArray732[arg5][arg0][arg8] = (Class12_Sub12_Sub9
												.method421(
														(Class30.anIntArrayArrayArray732[arg5][arg0][arg8]),
														1170));
								}
							} else {
								if (class12_sub12_sub9.aBoolean2337) {
									RSCanvas.aByteArrayArrayArray43[arg5][1 + arg0][arg8] = (byte) 50;
									RSCanvas.aByteArrayArrayArray43[arg5][1 + arg0][arg8
											- -1] = (byte) 50;
								}
								if (class12_sub12_sub9.aBoolean2352)
									Class30.anIntArrayArrayArray732[arg5][arg0 + 1][arg8] = (Class12_Sub12_Sub9
											.method421(
													(Class30.anIntArrayArrayArray732[arg5][arg0 + 1][arg8]),
													585));
							}
						} else {
							if (class12_sub12_sub9.aBoolean2337) {
								RSCanvas.aByteArrayArrayArray43[arg5][arg0][1 + arg8] = (byte) 50;
								RSCanvas.aByteArrayArrayArray43[arg5][1 + arg0][arg8
										- -1] = (byte) 50;
							}
							if (class12_sub12_sub9.aBoolean2352)
								Class30.anIntArrayArrayArray732[arg5][arg0][arg8
										- -1] = (Class12_Sub12_Sub9
										.method421(
												(Class30.anIntArrayArrayArray732[arg5][arg0][arg8
														- -1]), 1170));
						}
						if (class12_sub12_sub9.aBoolean2317 && arg2 != null)
							arg2.method129(arg7, arg0, arg8,
									class12_sub12_sub9.aBoolean2321, arg3,
									(byte) -97);
						if (class12_sub12_sub9.anInt2346 != 16)
							arg6.method861(arg5, arg0, arg8,
									class12_sub12_sub9.anInt2346);
					} else if (arg7 == 1) {
						Class12_Sub12_Sub11 class12_sub12_sub11;
						if (class12_sub12_sub9.anInt2330 != -1
								|| class12_sub12_sub9.anIntArray2310 != null)
							class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
									arg4, 1, arg3, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
						else
							class12_sub12_sub11 = class12_sub12_sub9
									.method424(arg1 + -16130, i, i_9_, arg3, 1,
											i_7_, i_8_);
						arg6.method846(arg5, arg0, arg8, i_11_,
								class12_sub12_sub11, null,
								Class43.anIntArray1017[arg3], 0, i_12_, i_10_);
						if (class12_sub12_sub9.aBoolean2337) {
							if (arg3 == 0)
								RSCanvas.aByteArrayArrayArray43[arg5][arg0][1 + arg8] = (byte) 50;
							else if ((arg3 ^ 0xffffffff) == -2)
								RSCanvas.aByteArrayArrayArray43[arg5][arg0 + 1][1 + arg8] = (byte) 50;
							else if (arg3 == 2)
								RSCanvas.aByteArrayArrayArray43[arg5][arg0 + 1][arg8] = (byte) 50;
							else if (arg3 == 3)
								RSCanvas.aByteArrayArrayArray43[arg5][arg0][arg8] = (byte) 50;
						}
						if (class12_sub12_sub9.aBoolean2317 && arg2 != null)
							arg2.method129(arg7, arg0, arg8,
									class12_sub12_sub9.aBoolean2321, arg3,
									(byte) 31);
					} else if (arg7 == 2) {
						int i_19_ = 0x3 & arg3 + 1;
						Class12_Sub12_Sub11 class12_sub12_sub11;
						Class12_Sub12_Sub11 class12_sub12_sub11_20_;
						if (class12_sub12_sub9.anInt2330 == -1
								&& class12_sub12_sub9.anIntArray2310 == null) {
							class12_sub12_sub11 = class12_sub12_sub9.method424(
									arg1 ^ ~0x3ef1, i, i_9_, 4 + arg3, 2, i_7_,
									i_8_);
							class12_sub12_sub11_20_ = class12_sub12_sub9
									.method424(-73, i, i_9_, i_19_, 2, i_7_,
											i_8_);
						} else {
							class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
									arg4, 2, arg3 + 4, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
							class12_sub12_sub11_20_ = (new Class12_Sub12_Sub11_Sub6(
									arg4, 2, i_19_, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
						}
						arg6.method846(arg5, arg0, arg8, i_11_,
								class12_sub12_sub11, class12_sub12_sub11_20_,
								Class32.anIntArray789[arg3],
								Class32.anIntArray789[i_19_], i_12_, i_10_);
						if (class12_sub12_sub9.aBoolean2352) {
							if (arg3 == 0) {
								Class30.anIntArrayArrayArray732[arg5][arg0][arg8] = (Class12_Sub12_Sub9
										.method421(
												(Class30.anIntArrayArrayArray732[arg5][arg0][arg8]),
												585));
								Class30.anIntArrayArrayArray732[arg5][arg0][arg8
										- -1] = (Class12_Sub12_Sub9
										.method421(
												(Class30.anIntArrayArrayArray732[arg5][arg0][arg8
														- -1]), 1170));
							} else if ((arg3 ^ 0xffffffff) != -2) {
								if (arg3 == 2) {
									Class30.anIntArrayArrayArray732[arg5][arg0
											- -1][arg8] = (Class12_Sub12_Sub9
											.method421(
													(Class30.anIntArrayArrayArray732[arg5][arg0
															- -1][arg8]), 585));
									Class30.anIntArrayArrayArray732[arg5][arg0][arg8] = (Class12_Sub12_Sub9
											.method421(
													(Class30.anIntArrayArrayArray732[arg5][arg0][arg8]),
													1170));
								} else if ((arg3 ^ 0xffffffff) == -4) {
									Class30.anIntArrayArrayArray732[arg5][arg0][arg8] = (Class12_Sub12_Sub9
											.method421(
													(Class30.anIntArrayArrayArray732[arg5][arg0][arg8]),
													1170));
									Class30.anIntArrayArrayArray732[arg5][arg0][arg8] = (Class12_Sub12_Sub9
											.method421(
													(Class30.anIntArrayArrayArray732[arg5][arg0][arg8]),
													585));
								}
							} else {
								Class30.anIntArrayArrayArray732[arg5][arg0][arg8 + 1] = (Class12_Sub12_Sub9
										.method421(
												(Class30.anIntArrayArrayArray732[arg5][arg0][arg8 + 1]),
												1170));
								Class30.anIntArrayArrayArray732[arg5][arg0 - -1][arg8] = (Class12_Sub12_Sub9
										.method421(
												(Class30.anIntArrayArrayArray732[arg5][arg0
														- -1][arg8]), 585));
							}
						}
						if (class12_sub12_sub9.aBoolean2317 && arg2 != null)
							arg2.method129(arg7, arg0, arg8,
									class12_sub12_sub9.aBoolean2321, arg3,
									(byte) 118);
						if (class12_sub12_sub9.anInt2346 != 16)
							arg6.method861(arg5, arg0, arg8,
									class12_sub12_sub9.anInt2346);
					} else if ((arg7 ^ 0xffffffff) == -4) {
						Class12_Sub12_Sub11 class12_sub12_sub11;
						if (class12_sub12_sub9.anInt2330 != -1
								|| class12_sub12_sub9.anIntArray2310 != null)
							class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
									arg4, 3, arg3, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
						else
							class12_sub12_sub11 = class12_sub12_sub9.method424(
									-73, i, i_9_, arg3, 3, i_7_, i_8_);
						arg6.method846(arg5, arg0, arg8, i_11_,
								class12_sub12_sub11, null,
								Class43.anIntArray1017[arg3], 0, i_12_, i_10_);
						if (class12_sub12_sub9.aBoolean2337) {
							if ((arg3 ^ 0xffffffff) != -1) {
								if (arg3 == 1)
									RSCanvas.aByteArrayArrayArray43[arg5][1 + arg0][arg8
											- -1] = (byte) 50;
								else if ((arg3 ^ 0xffffffff) == -3)
									RSCanvas.aByteArrayArrayArray43[arg5][1 + arg0][arg8] = (byte) 50;
								else if (arg3 == 3)
									RSCanvas.aByteArrayArrayArray43[arg5][arg0][arg8] = (byte) 50;
							} else
								RSCanvas.aByteArrayArrayArray43[arg5][arg0][1 + arg8] = (byte) 50;
						}
						if (class12_sub12_sub9.aBoolean2317 && arg2 != null)
							arg2.method129(arg7, arg0, arg8,
									class12_sub12_sub9.aBoolean2321, arg3,
									(byte) 125);
					} else if ((arg7 ^ 0xffffffff) == -10) {
						Class12_Sub12_Sub11 class12_sub12_sub11;
						if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) != 0
								|| class12_sub12_sub9.anIntArray2310 != null)
							class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
									arg4, arg7, arg3, i, i_7_, i_8_, i_9_,
									class12_sub12_sub9.anInt2330, true));
						else
							class12_sub12_sub11 = class12_sub12_sub9.method424(
									-73, i, i_9_, arg3, arg7, i_7_, i_8_);
						arg6.method837(arg5, arg0, arg8, i_11_, 1, 1,
								class12_sub12_sub11, 0, i_12_, i_10_);
						if (class12_sub12_sub9.aBoolean2317 && arg2 != null)
							arg2.method116(-2, arg8,
									class12_sub12_sub9.aBoolean2321, arg3,
									arg0, class12_sub12_sub9.anInt2318,
									class12_sub12_sub9.anInt2334);
					} else {
						if (class12_sub12_sub9.aBoolean2322) {
							if ((arg3 ^ 0xffffffff) == -2) {
								int i_21_ = i_9_;
								i_9_ = i_8_;
								i_8_ = i_7_;
								i_7_ = i;
								i = i_21_;
							} else if ((arg3 ^ 0xffffffff) == -3) {
								int i_22_ = i_9_;
								i_9_ = i_7_;
								i_7_ = i_22_;
								i_22_ = i_8_;
								i_8_ = i;
								i = i_22_;
							} else if ((arg3 ^ 0xffffffff) == -4) {
								int i_23_ = i_9_;
								i_9_ = i;
								i = i_7_;
								i_7_ = i_8_;
								i_8_ = i_23_;
							}
						}
						if (arg7 == 4) {
							Class12_Sub12_Sub11 class12_sub12_sub11;
							if (class12_sub12_sub9.anInt2330 == -1
									&& class12_sub12_sub9.anIntArray2310 == null)
								class12_sub12_sub11 = class12_sub12_sub9
										.method424(-73, i, i_9_, 0, 4, i_7_,
												i_8_);
							else
								class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
										arg4, 4, 0, i, i_7_, i_8_, i_9_,
										class12_sub12_sub9.anInt2330, true));
							arg6.method862(arg5, arg0, arg8, i_11_,
									class12_sub12_sub11,
									Class32.anIntArray789[arg3], arg3 * 512, 0,
									0, i_12_, i_10_);
						} else if (arg7 == 5) {
							int i_24_ = 16;
							int i_25_ = arg6.method842(arg5, arg0, arg8);
							if (i_25_ > 0)
								i_24_ = (RSCanvas.method39(arg1 ^ 0x3ebf,
										i_25_ >> -1387635154 & 0x7fff).anInt2346);
							Class12_Sub12_Sub11 class12_sub12_sub11;
							if (class12_sub12_sub9.anInt2330 == -1
									&& class12_sub12_sub9.anIntArray2310 == null)
								class12_sub12_sub11 = class12_sub12_sub9
										.method424(-73, i, i_9_, 0, 4, i_7_,
												i_8_);
							else
								class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
										arg4, 4, 0, i, i_7_, i_8_, i_9_,
										class12_sub12_sub9.anInt2330, true));
							arg6.method862(arg5, arg0, arg8, i_11_,
									class12_sub12_sub11,
									Class32.anIntArray789[arg3], 512 * arg3,
									(i_24_ * Class63.anIntArray1406[arg3]),
									Class15.anIntArray402[arg3] * i_24_, i_12_,
									i_10_);
						} else if ((arg7 ^ 0xffffffff) == -7) {
							Class12_Sub12_Sub11 class12_sub12_sub11;
							if (class12_sub12_sub9.anInt2330 == -1
									&& class12_sub12_sub9.anIntArray2310 == null)
								class12_sub12_sub11 = class12_sub12_sub9
										.method424(-73, i, i_9_, 0, 4, i_7_,
												i_8_);
							else
								class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
										arg4, 4, 0, i, i_7_, i_8_, i_9_,
										class12_sub12_sub9.anInt2330, true));
							arg6.method862(arg5, arg0, arg8, i_11_,
									class12_sub12_sub11, 256, arg3, 0, 0,
									i_12_, i_10_);
						} else if ((arg7 ^ 0xffffffff) == -8) {
							Class12_Sub12_Sub11 class12_sub12_sub11;
							if (((class12_sub12_sub9.anInt2330 ^ 0xffffffff) != 0)
									|| class12_sub12_sub9.anIntArray2310 != null)
								class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
										arg4, 4, 0, i, i_7_, i_8_, i_9_,
										class12_sub12_sub9.anInt2330, true));
							else
								class12_sub12_sub11 = class12_sub12_sub9
										.method424(-73, i, i_9_, 0, 4, i_7_,
												i_8_);
							arg6.method862(arg5, arg0, arg8, i_11_,
									class12_sub12_sub11, 512, arg3, 0, 0,
									i_12_, i_10_);
						} else if (arg7 == 8) {
							Class12_Sub12_Sub11 class12_sub12_sub11;
							if (((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0)
									&& class12_sub12_sub9.anIntArray2310 == null)
								class12_sub12_sub11 = class12_sub12_sub9
										.method424(-73, i, i_9_, 0, 4, i_7_,
												i_8_);
							else
								class12_sub12_sub11 = (new Class12_Sub12_Sub11_Sub6(
										arg4, 4, 0, i, i_7_, i_8_, i_9_,
										class12_sub12_sub9.anInt2330, true));
							arg6.method862(arg5, arg0, arg8, i_11_,
									class12_sub12_sub11, 768, arg3, 0, 0,
									i_12_, i_10_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("la.D(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ',' + arg4 + ',' + arg5 + ','
					+ (arg6 != null ? "{...}" : "null") + ',' + arg7 + ','
					+ arg8 + ')'));
		}
	}

	public RuntimeException_Sub1(Throwable arg0, String arg1) {
		try {
			aString1458 = arg1;
			aThrowable1453 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method1006(byte arg0) {
		try {
			anInt1459++;
			if (Class62.aBoolean1387) {
				Class12_Sub12_Sub4.aClass12_Sub12_Sub7_Sub2_2216 = null;
				Class38.aClass12_Sub12_Sub7_Sub2_925 = null;
				Class12_Sub12_Sub9.aClass12_Sub12_Sub7_Sub2_2361 = null;
				Class1.aClass12_Sub12_Sub7_Sub2_80 = null;
				Class15.aClass62_386 = null;
				Class12_Sub12_Sub15.aClass62_2491 = null;
				Class12_Sub12_Sub11_Sub6.aClass62_2894 = null;
				Class12_Sub12_Sub16.aClass12_Sub12_Sub7_Sub2Array2545 = null;
				Class31.aClass62_761 = null;
				Class61.aClass12_Sub12_Sub7_Sub2_1365 = null;
				Class9_Sub2.aClass12_Sub12_Sub7_Sub2_1590 = null;
				Class12_Sub12_Sub11_Sub5.aClass62_2878 = null;
				Class12_Sub12_Sub12.aClass62_2418 = null;
				Class31.aClass62_765 = null;
				Class21.aClass62_488 = null;
				Class12_Sub6.aClass62_1694 = null;
				Class33.aClass12_Sub12_Sub7_Sub2_820 = null;
				Class44.aClass12_Sub12_Sub7_Sub2_1041 = null;
				Class12_Sub12_Sub11_Sub3.aClass12_Sub12_Sub7_Sub2_2771 = null;
				Class28.aClass12_Sub12_Sub7_Sub2_680 = null;
				Class44.anIntArray1040 = null;
				Class12_Sub4.aClass12_Sub12_Sub7_Sub2_1666 = null;
				Class7.aClass62_1528 = null;
				Class4.aClass12_Sub12_Sub7_Sub2_124 = null;
				Class62.aBoolean1387 = false;
				Archive.aClass62_1879 = null;
				Game.anIntArray1555 = null;
				aClass12_Sub12_Sub7_Sub2_1461 = null;
				Class49.anIntArray1144 = null;
				Class57.aClass12_Sub12_Sub7_Sub2_1330 = null;
				Class44.aClass62_1042 = null;
				Statics.anIntArray2026 = null;
				Class12_Sub12_Sub11.aClass12_Sub12_Sub7_Sub2_2387 = null;
				Class64.aClass62_1443 = null;
				Class35.aClass62_864 = null;
				Class61.aClass12_Sub12_Sub7_Sub2_1364 = null;
				Class38.anIntArray921 = null;
				Class42.anIntArray985 = null;
				if (arg0 <= 0) {
					Class62.aClass62_1377 = null;
					Class14.aClass62_365 = null;
					RSSocket.anIntArray524 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "la.G(" + arg0 + ')');
		}
	}

	static {
		anInt1471 = 0;
		anInt1473 = 0;
		aClass59_1468 = Class55.method898("(U5", -10983);
		aBooleanArray1470 = new boolean[5];
	}
}
