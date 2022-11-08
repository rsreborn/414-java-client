package com.jagex;/* com.jagex.Class12_Sub12_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class12_Sub12_Sub13 extends Class12_Sub12 {
	public int anInt2420;
	public static int anInt2421;
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array2422;
	public static int anInt2423;
	public int anInt2424;
	public int anInt2425;
	public static RSString aClass59_2426 = Class55.method898("@whi@", -10983);
	public static int anInt2427;
	public static int anInt2428;
	public static int anInt2429;
	public static int anInt2430;
	public static int anInt2431 = 0;
	public static int anInt2432;
	public static int anInt2433;
	public static int anInt2434;
	public static RSString aClass59_2435;
	public static int anInt2436;
	public static int anInt2437;
	public static int anInt2438 = 3353893;
	public static int anInt2439;
	public static int anInt2440;
	public static int anInt2441;
	public static int anInt2442;
	public int anInt2443;
	public int anInt2444 = 0;
	public static int anInt2445;
	public static int anInt2446;

	public void method522(Buffer arg0, boolean arg1, int arg2) {
		try {
			for (;;) {
				int i = arg0.readSignedByte(true);
				if ((i ^ 0xffffffff) == -1)
					break;
				method529(arg2, i, arg0, -15913);
			}
			if (arg1 == false)
				anInt2436++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("q.H("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static int method523(int arg0, int arg1, byte[] arg2, byte arg3) {
		try {
			anInt2427++;
			int i = 106 % ((-10 - arg3) / 47);
			int i_0_ = -1;
			for (int i_1_ = arg0; arg1 > i_1_; i_1_++)
				i_0_ = i_0_ >>> 991885544
						^ (RSApplet.anIntArray27[(i_0_ ^ arg2[i_1_]) & 0xff]);
			i_0_ ^= 0xffffffff;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("q.J(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ')'));
		}
	}

	public static RSString method524(int arg0, long arg1) {
		try {
			anInt2446++;
			if ((arg1 ^ 0xffffffffffffffffL) >= -1L
					|| (arg1 ^ 0xffffffffffffffffL) <= -6582952005840035282L)
				return null;
			if (arg1 % 37L == 0L)
				return null;
			int i = 0;
			long l = arg1;
			while ((l ^ 0xffffffffffffffffL) != -1L) {
				l /= 37L;
				i++;
			}
			byte[] is = new byte[i];
			while ((arg1 ^ 0xffffffffffffffffL) != -1L) {
				long l_2_ = arg1;
				arg1 /= 37L;
				is[--i] = (Class12_Sub12_Sub11_Sub5.aByteArray2880[(int) (-(37L * arg1) + l_2_)]);
			}
			RSString class59 = new RSString();
			class59.chars = is;
			class59.anInt1480 = is.length;
			if (arg0 != -3)
				aClass12_Sub12_Sub7_Sub1Array2422 = null;
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "q.K(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method525(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
		try {
			anInt2428++;
			if (arg7 != 17)
				anInt2438 = 85;
			Class12_Sub2 class12_sub2 = null;
			for (Class12_Sub2 class12_sub2_3_ = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
					.method91((byte) 86); class12_sub2_3_ != null; class12_sub2_3_ = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
					.method100(arg7 ^ ~0x74b2)) {
				if (class12_sub2_3_.anInt1629 == arg5
						&& (arg1 ^ 0xffffffff) == (class12_sub2_3_.anInt1638 ^ 0xffffffff)
						&& ((class12_sub2_3_.anInt1644 ^ 0xffffffff) == (arg9 ^ 0xffffffff))
						&& class12_sub2_3_.anInt1635 == arg0) {
					class12_sub2 = class12_sub2_3_;
					break;
				}
			}
			if (class12_sub2 == null) {
				class12_sub2 = new Class12_Sub2();
				class12_sub2.anInt1635 = arg0;
				class12_sub2.anInt1644 = arg9;
				class12_sub2.anInt1629 = arg5;
				class12_sub2.anInt1638 = arg1;
				Class12_Sub1.method147(-26017, class12_sub2);
				RuntimeException_Sub1.aClass8_1460.method98(class12_sub2,
						(byte) 79);
			}
			class12_sub2.anInt1650 = arg3;
			class12_sub2.anInt1658 = arg8;
			class12_sub2.anInt1657 = arg6;
			class12_sub2.anInt1633 = arg2;
			class12_sub2.anInt1640 = arg4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("q.A(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')'));
		}
	}

	public void method526(int arg0, int arg1) {
		try {
			anInt2432++;
			double d = (double) ((0xff8ab1 & arg1) >> -1932646064) / 256.0;
			double d_4_ = (double) ((0xff80 & arg1) >> -554571608) / 256.0;
			double d_5_ = d;
			double d_6_ = 0.0;
			double d_7_ = d;
			if (d_4_ < d_7_)
				d_7_ = d_4_;
			double d_8_ = (double) (0xff & arg1) / 256.0;
			if (d_4_ > d_5_)
				d_5_ = d_4_;
			if (d_8_ < d_7_)
				d_7_ = d_8_;
			if (d_8_ > d_5_)
				d_5_ = d_8_;
			double d_9_ = 0.0;
			double d_10_ = (d_7_ + d_5_) / 2.0;
			if (arg0 > -58)
				method528((byte) 41);
			anInt2420 = (int) (256.0 * d_10_);
			if (d_7_ != d_5_) {
				if (d_5_ == d)
					d_6_ = (-d_8_ + d_4_) / (d_5_ - d_7_);
				else if (d_4_ != d_5_) {
					if (d_8_ == d_5_)
						d_6_ = 4.0 + (-d_4_ + d) / (-d_7_ + d_5_);
				} else
					d_6_ = 2.0 + (-d + d_8_) / (-d_7_ + d_5_);
				if (d_10_ < 0.5)
					d_9_ = (-d_7_ + d_5_) / (d_7_ + d_5_);
				if (d_10_ >= 0.5)
					d_9_ = (d_5_ - d_7_) / (-d_7_ + (-d_5_ + 2.0));
			}
			if (anInt2420 >= 0) {
				if (anInt2420 > 255)
					anInt2420 = 255;
			} else
				anInt2420 = 0;
			anInt2424 = (int) (256.0 * d_9_);
			if (d_10_ > 0.5)
				anInt2443 = (int) (512.0 * ((1.0 - d_10_) * d_9_));
			else
				anInt2443 = (int) (512.0 * (d_9_ * d_10_));
			if ((anInt2424 ^ 0xffffffff) > -1)
				anInt2424 = 0;
			else if (anInt2424 > 255)
				anInt2424 = 255;
			if ((anInt2443 ^ 0xffffffff) > -2)
				anInt2443 = 1;
			d_6_ /= 6.0;
			anInt2425 = (int) (d_6_ * (double) anInt2443);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "q.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method527(int arg0) {
		try {
			aClass59_2426 = null;
			if (arg0 >= -7)
				anInt2437 = 94;
			aClass59_2435 = null;
			aClass12_Sub12_Sub7_Sub1Array2422 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "q.I(" + arg0 + ')');
		}
	}

	public static Class9 method528(byte arg0) {
		try {
			if (arg0 != 78)
				aClass59_2426 = null;
			anInt2423++;
			try {
				return (Class9) Class.forName("com.jagex.Class9_Sub1").newInstance();
			} catch (Throwable throwable) {
				return new Class9_Sub2();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "q.B(" + arg0 + ')');
		}
	}

	public void method529(int arg0, int arg1, Buffer arg2, int arg3) {
		if (arg3 != -15913)
			method531(-30, -117, true);
		anInt2429++;
		if ((arg1 ^ 0xffffffff) == -2)
			anInt2444 = arg2.method233(arg3 ^ ~0xff3e28);
	}

	public static Class12_Sub12_Sub7_Sub4 method530(RSString arg0, RSString arg1,
													Class26 arg2, int arg3) {
		try {
			anInt2439++;
			int i = arg2.method649(arg1, -22814);
			int i_11_ = arg2.method655(i, (byte) 57, arg0);
			if (arg3 != -1)
				method527(-11);
			return RuntimeException_Sub1.method1000((byte) 115, i, i_11_, arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("q.M("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public static void method531(int arg0, int arg1, boolean arg2) {
		try {
			Class8 class8 = (Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][arg0][arg1]);
			anInt2433++;
			if (arg2 == false) {
				if (class8 == null)
					Class12_Sub12_Sub8.aClass52_2295.method868(
							RSString.anInt1504, arg0, arg1);
				else {
					Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1 = null;
					int i = -99999999;
					for (Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1_12_ = ((Class12_Sub12_Sub11_Sub1) class8
							.method91((byte) 86)); class12_sub12_sub11_sub1_12_ != null; class12_sub12_sub11_sub1_12_ = ((Class12_Sub12_Sub11_Sub1) class8
							.method100(-29860))) {
						Class12_Sub12_Sub15 class12_sub12_sub15 = (Class12_Sub12_Sub11_Sub5
								.method502((byte) 121,
										class12_sub12_sub11_sub1_12_.anInt2643));
						int i_13_ = class12_sub12_sub15.anInt2496;
						if (class12_sub12_sub15.aBoolean2473)
							i_13_ *= 1 + class12_sub12_sub11_sub1_12_.anInt2638;
						if ((i ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
							class12_sub12_sub11_sub1 = class12_sub12_sub11_sub1_12_;
							i = i_13_;
						}
					}
					class8.method97(class12_sub12_sub11_sub1, 1);
					Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1_14_ = ((Class12_Sub12_Sub11_Sub1) class8
							.method91((byte) 86));
					Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1_15_ = null;
					Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1_16_ = null;
					for (/**/; class12_sub12_sub11_sub1_14_ != null; class12_sub12_sub11_sub1_14_ = ((Class12_Sub12_Sub11_Sub1) class8
							.method100(-29860))) {
						if (((class12_sub12_sub11_sub1_14_.anInt2643 ^ 0xffffffff) != (class12_sub12_sub11_sub1.anInt2643 ^ 0xffffffff))
								&& class12_sub12_sub11_sub1_15_ == null)
							class12_sub12_sub11_sub1_15_ = class12_sub12_sub11_sub1_14_;
						if ((class12_sub12_sub11_sub1.anInt2643 != class12_sub12_sub11_sub1_14_.anInt2643)
								&& (class12_sub12_sub11_sub1_14_.anInt2643 != class12_sub12_sub11_sub1_15_.anInt2643)
								&& class12_sub12_sub11_sub1_16_ == null)
							class12_sub12_sub11_sub1_16_ = class12_sub12_sub11_sub1_14_;
					}
					int i_17_ = (arg1 << -113695545) + (arg0 + 1610612736);
					Class12_Sub12_Sub8.aClass52_2295.method840(
							RSString.anInt1504, arg0, arg1, Class26.method658(
									128 * arg0 - -64, -6, RSString.anInt1504,
									arg1 * 128 + 64), class12_sub12_sub11_sub1,
							i_17_, class12_sub12_sub11_sub1_15_,
							class12_sub12_sub11_sub1_16_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("q.E(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method532(byte arg0) {
		try {
			if (arg0 < 19)
				method528((byte) -26);
			anInt2430++;
			method526(-125, anInt2444);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "q.N(" + arg0 + ')');
		}
	}

	public static void method533(int arg0, long arg1) {
		try {
			anInt2445++;
			if ((arg1 ^ 0xffffffffffffffffL) != -1L) {
				if (((Class7.anInt1540 ^ 0xffffffff) <= -101 && Class12_Sub12_Sub11.anInt2396 != 1)
						|| (Class7.anInt1540 ^ 0xffffffff) <= -201)
					Class12_Sub7.method190(Class11.aClass59_310,
							Class55.aClass59_1306, 0, false);
				else {
					RSString class59 = method524(-3, arg1).toString(-14767);
					for (int i = 0; Class7.anInt1540 > i; i++) {
						if (Class47.aLongArray1099[i] == arg1) {
							Class12_Sub7.method190(Class11.aClass59_310,
									(Statics.method251((byte) -59,
											(new RSString[] { class59,
													(Class4.aClass59_142) }))),
									0, false);
							return;
						}
					}
					if (arg0 >= -112)
						anInt2438 = 90;
					for (int i = 0; (Class49.anInt1147 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						if (arg1 == Class35.aLongArray859[i]) {
							Class12_Sub7
									.method190(
											Class11.aClass59_310,
											(Statics
													.method251(
															(byte) -74,
															(new RSString[] {
																	(Class12_Sub12_Sub3.aClass59_2127),
																	class59,
																	(Class64_Sub2.aClass59_1981) }))),
											0, false);
							return;
						}
					}
					if (!class59
							.method934(
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass59_2951),
									17706)) {
						Class12_Sub12_Sub11_Sub6.aClass59Array2910[Class7.anInt1540] = class59;
						Class64.anInt1446++;
						Class47.aLongArray1099[Class7.anInt1540] = arg1;
						Class12_Sub12_Sub4.anIntArray2227[Class7.anInt1540] = 0;
						Class7.anInt1540++;
						Class49.aBoolean1146 = true;
						Game.outBuffer.writePacket(85);
						Game.outBuffer.writeLongBE(arg1);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "q.G(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static int method534(int arg0) {
		try {
			anInt2440++;
			int i = -75 / ((43 - arg0) / 44);
			return 5;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "q.D(" + arg0 + ')');
		}
	}

	public static void method535(int arg0, int arg1, int arg2, Class10 arg3,
			int arg4, int arg5, int arg6, int arg7, Class52 arg8, int arg9) {
		try {
			anInt2442++;
			int i = Statics.anIntArrayArrayArray569[arg2][1 + arg5][arg0];
			int i_18_ = Statics.anIntArrayArrayArray569[arg2][arg5][arg0];
			int i_19_ = Statics.anIntArrayArrayArray569[arg2][1 + arg5][arg0
					- -1];
			int i_20_ = Statics.anIntArrayArrayArray569[arg2][arg5][arg0 - -1];
			int i_21_ = i + i_18_ - (-i_19_ - i_20_) >> -521861470;
			int i_22_ = (arg6 << 1940500966) + arg9;
			Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas.method39(6,
					arg4);
			int i_23_ = (1073741824 + arg5 - (-(arg0 << 1663628743) + -(arg4 << -1442811762)));
			if (arg7 == class12_sub12_sub9.anInt2344)
				i_22_ += 256;
			if ((class12_sub12_sub9.anInt2320 ^ 0xffffffff) == -1)
				i_23_ += -2147483648;
			if (arg9 == 22) {
				Class12_Sub12_Sub11 class12_sub12_sub11;
				if (class12_sub12_sub9.anInt2330 != -1
						|| class12_sub12_sub9.anIntArray2310 != null)
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4,
							22, arg6, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				else
					class12_sub12_sub11 = class12_sub12_sub9.method424(arg7
							+ -74, i_18_, i_20_, arg6, 22, i, i_19_);
				arg8.method852(arg1, arg5, arg0, i_21_, class12_sub12_sub11,
						i_23_, i_22_);
				if (class12_sub12_sub9.aBoolean2317
						&& class12_sub12_sub9.anInt2320 == 1)
					arg3.method128(arg5, -128, arg0);
			} else if ((arg9 ^ 0xffffffff) == -11 || (arg9 ^ 0xffffffff) == -12) {
				Class12_Sub12_Sub11 class12_sub12_sub11;
				if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
						&& class12_sub12_sub9.anIntArray2310 == null)
					class12_sub12_sub11 = class12_sub12_sub9.method424(arg7
							+ -74, i_18_, i_20_, arg6, 10, i, i_19_);
				else
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4,
							10, arg6, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				if (class12_sub12_sub11 != null) {
					int i_24_ = 0;
					if ((arg9 ^ 0xffffffff) == -12)
						i_24_ += 256;
					int i_25_;
					int i_26_;
					if ((arg6 ^ 0xffffffff) == -2 || (arg6 ^ 0xffffffff) == -4) {
						i_25_ = class12_sub12_sub9.anInt2334;
						i_26_ = class12_sub12_sub9.anInt2318;
					} else {
						i_25_ = class12_sub12_sub9.anInt2318;
						i_26_ = class12_sub12_sub9.anInt2334;
					}
					arg8.method837(arg1, arg5, arg0, i_21_, i_25_, i_26_,
							class12_sub12_sub11, i_24_, i_23_, i_22_);
				}
				if (class12_sub12_sub9.aBoolean2317)
					arg3.method116(-2, arg0, class12_sub12_sub9.aBoolean2321,
							arg6, arg5, class12_sub12_sub9.anInt2318,
							class12_sub12_sub9.anInt2334);
			} else if ((arg9 ^ 0xffffffff) <= -13) {
				Class12_Sub12_Sub11 class12_sub12_sub11;
				if (class12_sub12_sub9.anInt2330 != -1
						|| class12_sub12_sub9.anIntArray2310 != null)
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4,
							arg9, arg6, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				else
					class12_sub12_sub11 = class12_sub12_sub9.method424(-73,
							i_18_, i_20_, arg6, arg9, i, i_19_);
				arg8.method837(arg1, arg5, arg0, i_21_, 1, 1,
						class12_sub12_sub11, 0, i_23_, i_22_);
				if (class12_sub12_sub9.aBoolean2317)
					arg3.method116(arg7 + -3, arg0,
							class12_sub12_sub9.aBoolean2321, arg6, arg5,
							class12_sub12_sub9.anInt2318,
							class12_sub12_sub9.anInt2334);
			} else if (arg9 == 0) {
				Class12_Sub12_Sub11 class12_sub12_sub11;
				if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) != 0
						|| class12_sub12_sub9.anIntArray2310 != null)
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4, 0,
							arg6, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				else
					class12_sub12_sub11 = class12_sub12_sub9.method424(arg7
							^ ~0x49, i_18_, i_20_, arg6, 0, i, i_19_);
				arg8.method846(arg1, arg5, arg0, i_21_, class12_sub12_sub11,
						null, Class32.anIntArray789[arg6], 0, i_23_, i_22_);
				if (class12_sub12_sub9.aBoolean2317)
					arg3.method129(arg9, arg5, arg0,
							class12_sub12_sub9.aBoolean2321, arg6, (byte) 120);
			} else if ((arg9 ^ 0xffffffff) == -2) {
				Class12_Sub12_Sub11 class12_sub12_sub11;
				if (class12_sub12_sub9.anInt2330 != -1
						|| class12_sub12_sub9.anIntArray2310 != null)
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4, 1,
							arg6, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				else
					class12_sub12_sub11 = class12_sub12_sub9.method424(-73,
							i_18_, i_20_, arg6, 1, i, i_19_);
				arg8.method846(arg1, arg5, arg0, i_21_, class12_sub12_sub11,
						null, Class43.anIntArray1017[arg6], 0, i_23_, i_22_);
				if (class12_sub12_sub9.aBoolean2317)
					arg3.method129(arg9, arg5, arg0,
							class12_sub12_sub9.aBoolean2321, arg6, (byte) -113);
			} else if (arg9 == 2) {
				int i_27_ = 0x3 & 1 + arg6;
				Class12_Sub12_Sub11 class12_sub12_sub11;
				Class12_Sub12_Sub11 class12_sub12_sub11_28_;
				if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) != 0
						|| class12_sub12_sub9.anIntArray2310 != null) {
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4, 2,
							arg6 + 4, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
					class12_sub12_sub11_28_ = new Class12_Sub12_Sub11_Sub6(
							arg4, 2, i_27_, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				} else {
					class12_sub12_sub11 = class12_sub12_sub9.method424(-73,
							i_18_, i_20_, 4 - -arg6, 2, i, i_19_);
					class12_sub12_sub11_28_ = class12_sub12_sub9.method424(-73,
							i_18_, i_20_, i_27_, 2, i, i_19_);
				}
				arg8.method846(arg1, arg5, arg0, i_21_, class12_sub12_sub11,
						class12_sub12_sub11_28_, Class32.anIntArray789[arg6],
						Class32.anIntArray789[i_27_], i_23_, i_22_);
				if (class12_sub12_sub9.aBoolean2317)
					arg3.method129(arg9, arg5, arg0,
							class12_sub12_sub9.aBoolean2321, arg6, (byte) 17);
			} else if (arg9 == 3) {
				Class12_Sub12_Sub11 class12_sub12_sub11;
				if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
						&& class12_sub12_sub9.anIntArray2310 == null)
					class12_sub12_sub11 = class12_sub12_sub9.method424(-73,
							i_18_, i_20_, arg6, 3, i, i_19_);
				else
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4, 3,
							arg6, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				arg8.method846(arg1, arg5, arg0, i_21_, class12_sub12_sub11,
						null, Class43.anIntArray1017[arg6], 0, i_23_, i_22_);
				if (class12_sub12_sub9.aBoolean2317)
					arg3.method129(arg9, arg5, arg0,
							class12_sub12_sub9.aBoolean2321, arg6, (byte) -50);
			} else if (arg9 == 9) {
				Class12_Sub12_Sub11 class12_sub12_sub11;
				if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) != 0
						|| class12_sub12_sub9.anIntArray2310 != null)
					class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(arg4,
							arg9, arg6, i_18_, i, i_19_, i_20_,
							(class12_sub12_sub9.anInt2330), true);
				else
					class12_sub12_sub11 = class12_sub12_sub9.method424(arg7
							^ ~0x49, i_18_, i_20_, arg6, arg9, i, i_19_);
				arg8.method837(arg1, arg5, arg0, i_21_, 1, 1,
						class12_sub12_sub11, 0, i_23_, i_22_);
				if (class12_sub12_sub9.aBoolean2317)
					arg3.method116(-2, arg0, class12_sub12_sub9.aBoolean2321,
							arg6, arg5, class12_sub12_sub9.anInt2318,
							class12_sub12_sub9.anInt2334);
			} else {
				if (class12_sub12_sub9.aBoolean2322) {
					if ((arg6 ^ 0xffffffff) == -2) {
						int i_29_ = i_20_;
						i_20_ = i_19_;
						i_19_ = i;
						i = i_18_;
						i_18_ = i_29_;
					} else if ((arg6 ^ 0xffffffff) == -3) {
						int i_30_ = i_20_;
						i_20_ = i;
						i = i_30_;
						i_30_ = i_19_;
						i_19_ = i_18_;
						i_18_ = i_30_;
					} else if (arg6 == 3) {
						int i_31_ = i_20_;
						i_20_ = i_18_;
						i_18_ = i;
						i = i_19_;
						i_19_ = i_31_;
					}
				}
				if (arg9 == 4) {
					Class12_Sub12_Sub11 class12_sub12_sub11;
					if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) != 0
							|| class12_sub12_sub9.anIntArray2310 != null)
						class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(
								arg4, 4, 0, i_18_, i, i_19_, i_20_,
								(class12_sub12_sub9.anInt2330), true);
					else
						class12_sub12_sub11 = class12_sub12_sub9.method424(-73,
								i_18_, i_20_, 0, 4, i, i_19_);
					arg8.method862(arg1, arg5, arg0, i_21_,
							class12_sub12_sub11, Class32.anIntArray789[arg6],
							arg6 * 512, 0, 0, i_23_, i_22_);
				} else if (arg9 == 5) {
					int i_32_ = arg8.method842(arg1, arg5, arg0);
					int i_33_ = 16;
					if ((i_32_ ^ 0xffffffff) < -1)
						i_33_ = (RSCanvas.method39(6,
								0x7fff & i_32_ >> 890960110).anInt2346);
					Class12_Sub12_Sub11 class12_sub12_sub11;
					if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
							&& class12_sub12_sub9.anIntArray2310 == null)
						class12_sub12_sub11 = class12_sub12_sub9.method424(arg7
								^ ~0x49, i_18_, i_20_, 0, 4, i, i_19_);
					else
						class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(
								arg4, 4, 0, i_18_, i, i_19_, i_20_,
								(class12_sub12_sub9.anInt2330), true);
					arg8.method862(arg1, arg5, arg0, i_21_,
							class12_sub12_sub11, Class32.anIntArray789[arg6],
							arg6 * 512, Class63.anIntArray1406[arg6] * i_33_,
							i_33_ * Class15.anIntArray402[arg6], i_23_, i_22_);
				} else if (arg9 == 6) {
					Class12_Sub12_Sub11 class12_sub12_sub11;
					if (class12_sub12_sub9.anInt2330 == -1
							&& class12_sub12_sub9.anIntArray2310 == null)
						class12_sub12_sub11 = class12_sub12_sub9.method424(-73,
								i_18_, i_20_, 0, 4, i, i_19_);
					else
						class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(
								arg4, 4, 0, i_18_, i, i_19_, i_20_,
								(class12_sub12_sub9.anInt2330), true);
					arg8.method862(arg1, arg5, arg0, i_21_,
							class12_sub12_sub11, 256, arg6, 0, 0, i_23_, i_22_);
				} else if ((arg9 ^ 0xffffffff) == -8) {
					Class12_Sub12_Sub11 class12_sub12_sub11;
					if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
							&& class12_sub12_sub9.anIntArray2310 == null)
						class12_sub12_sub11 = class12_sub12_sub9.method424(arg7
								+ -74, i_18_, i_20_, 0, 4, i, i_19_);
					else
						class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(
								arg4, 4, 0, i_18_, i, i_19_, i_20_,
								(class12_sub12_sub9.anInt2330), true);
					arg8.method862(arg1, arg5, arg0, i_21_,
							class12_sub12_sub11, 512, arg6, 0, 0, i_23_, i_22_);
				} else if ((arg9 ^ 0xffffffff) == -9) {
					Class12_Sub12_Sub11 class12_sub12_sub11;
					if ((class12_sub12_sub9.anInt2330 ^ 0xffffffff) == 0
							&& class12_sub12_sub9.anIntArray2310 == null)
						class12_sub12_sub11 = class12_sub12_sub9.method424(arg7
								^ ~0x49, i_18_, i_20_, 0, 4, i, i_19_);
					else
						class12_sub12_sub11 = new Class12_Sub12_Sub11_Sub6(
								arg4, 4, 0, i_18_, i, i_19_, i_20_,
								(class12_sub12_sub9.anInt2330), true);
					arg8.method862(arg1, arg5, arg0, i_21_,
							class12_sub12_sub11, 768, arg6, 0, 0, i_23_, i_22_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("q.L(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ',' + arg7 + ','
					+ (arg8 != null ? "{...}" : "null") + ',' + arg9 + ')'));
		}
	}

	static {
		anInt2437 = 0;
		anInt2441 = 128;
		aClass59_2435 = Class55.method898("headicons_hint", -10983);
	}
}
