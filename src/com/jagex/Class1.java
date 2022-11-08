package com.jagex;/* com.jagex.Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;
import com.jagex.io.RSSocket;

public class Class1 {
	public static int anInt70;
	public static Class26 aClass26_71;
	public static Class19 aClass19_72;
	public static int[] anIntArray73;
	public static int[] anIntArray74 = new int[5];
	public static RSString aClass59_75;
	public static int[] anIntArray76;
	public static int anInt77 = 0;
	public static RSString aClass59_78;
	public static int anInt79;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_80;
	public static int anInt81;
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array82;
	public static int anInt83;
	public int[] anIntArray84;
	public static int anInt85;
	public static int anInt86;
	public static int anInt88;
	public static int anInt89;

	public static void method42(int arg0) {
		try {
			if (Class12_Sub9.anInt1756 <= 0) {
				if ((Archive.anInt1881 ^ 0xffffffff) >= -1) {
					for (int i = 0; i < 256; i++)
						Class39.anIntArray929[i] = Class12_Sub12_Sub8.anIntArray2298[i];
				} else {
					for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
						if ((Archive.anInt1881 ^ 0xffffffff) < -769)
							Class39.anIntArray929[i] = (Class12_Sub12_Sub11_Sub2_Sub1
									.method458(
											21428,
											Class12_Sub12_Sub8.anIntArray2298[i],
											1024 - Archive.anInt1881,
											Class15.anIntArray397[i]));
						else if ((Archive.anInt1881 ^ 0xffffffff) >= -257)
							Class39.anIntArray929[i] = (Class12_Sub12_Sub11_Sub2_Sub1
									.method458(
											21428,
											Class15.anIntArray397[i],
											-Archive.anInt1881 + 256,
											Class12_Sub12_Sub8.anIntArray2298[i]));
						else
							Class39.anIntArray929[i] = Class15.anIntArray397[i];
					}
				}
			} else {
				for (int i = 0; i < 256; i++) {
					if ((Class12_Sub9.anInt1756 ^ 0xffffffff) < -769)
						Class39.anIntArray929[i] = (Class12_Sub12_Sub11_Sub2_Sub1
								.method458(
										21428,
										Class12_Sub12_Sub8.anIntArray2298[i],
										1024 + -Class12_Sub9.anInt1756,
										Class12_Sub12_Sub11_Sub6.anIntArray2886[i]));
					else if ((Class12_Sub9.anInt1756 ^ 0xffffffff) >= -257)
						Class39.anIntArray929[i] = (Class12_Sub12_Sub11_Sub2_Sub1
								.method458(
										21428,
										Class12_Sub12_Sub11_Sub6.anIntArray2886[i],
										256 - Class12_Sub9.anInt1756,
										Class12_Sub12_Sub8.anIntArray2298[i]));
					else
						Class39.anIntArray929[i] = Class12_Sub12_Sub11_Sub6.anIntArray2886[i];
				}
			}
			int i = 256;
			anInt89++;
			int i_0_ = 0;
			if (arg0 != -1)
				anInt81 = 105;
			for (/**/; (i_0_ ^ 0xffffffff) > -33921; i_0_++)
				Class5.aClass62_148.anIntArray1379[i_0_] = (Class12_Sub12_Sub4.aClass12_Sub12_Sub7_Sub1_2210.anIntArray2578[i_0_]);
			int i_1_ = 1152;
			int i_2_ = 0;
			for (int i_3_ = 1; i_3_ < i + -1; i_3_++) {
				int i_4_ = (-i_3_ + i) * Class26.anIntArray624[i_3_] / i;
				int i_5_ = i_4_ + 22;
				if ((i_5_ ^ 0xffffffff) > -1)
					i_5_ = 0;
				i_2_ += i_5_;
				for (int i_6_ = i_5_; (i_6_ ^ 0xffffffff) > -129; i_6_++) {
					int i_7_ = Class12_Sub6.anIntArray1702[i_2_++];
					if ((i_7_ ^ 0xffffffff) != -1) {
						int i_8_ = i_7_;
						int i_9_ = -i_7_ + 256;
						int i_10_ = Class5.aClass62_148.anIntArray1379[i_1_];
						i_7_ = Class39.anIntArray929[i_7_];
						Class5.aClass62_148.anIntArray1379[i_1_++] = (((Class12_Sub12_Sub12
								.method519(
										((Class12_Sub12_Sub12.method519(65280,
												i_7_) * i_8_) + (Class12_Sub12_Sub12
												.method519(i_10_, 65280) * i_9_)),
										16711680)) + (Class12_Sub12_Sub12
								.method519(
										-16711936,
										(Class12_Sub12_Sub12.method519(
												16711935, i_7_) * i_8_ + (i_9_ * Class12_Sub12_Sub12
												.method519(16711935, i_10_)))))) >> -943065656);
					} else
						i_1_++;
				}
				i_1_ += i_5_;
			}
			i_2_ = 0;
			i_1_ = 1176;
			for (int i_11_ = 0; i_11_ < 33920; i_11_++)
				Class31.aClass62_771.anIntArray1379[i_11_] = (Game.aClass12_Sub12_Sub7_Sub1_1553.anIntArray2578[i_11_]);
			for (int i_12_ = 1; i_12_ < -1 + i; i_12_++) {
				int i_13_ = Class26.anIntArray624[i_12_] * (i - i_12_) / i;
				int i_14_ = -i_13_ + 103;
				i_1_ += i_13_;
				for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
					int i_16_ = Class12_Sub6.anIntArray1702[i_2_++];
					if ((i_16_ ^ 0xffffffff) == -1)
						i_1_++;
					else {
						int i_17_ = -i_16_ + 256;
						int i_18_ = i_16_;
						i_16_ = Class39.anIntArray929[i_16_];
						int i_19_ = Class31.aClass62_771.anIntArray1379[i_1_];
						Class31.aClass62_771.anIntArray1379[i_1_++] = (((Class12_Sub12_Sub12
								.method519(
										-16711936,
										(i_18_
												* Class12_Sub12_Sub12
														.method519(i_16_,
																16711935) - -(Class12_Sub12_Sub12
												.method519(i_19_, 16711935) * i_17_)))) + (Class12_Sub12_Sub12
								.method519(
										16711680,
										((Class12_Sub12_Sub12.method519(65280,
												i_16_) * i_18_) + i_17_
												* Class12_Sub12_Sub12
														.method519(i_19_, 65280))))) >> -1372581240);
					}
				}
				i_2_ += -i_14_ + 128;
				i_1_ += 128 + (-i_14_ + -i_13_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "a.B(" + arg0 + ')');
		}
	}

	public int method43(int arg0, int arg1) {
		try {
			int i = anIntArray84.length - 2;
			anInt88++;
			if (arg1 != -1)
				anIntArray74 = null;
			int i_20_ = arg0 << -210244831 & i;
			for (;;) {
				int i_21_ = anIntArray84[i_20_];
				if (i_21_ == arg0)
					return anIntArray84[1 + i_20_];
				if ((i_21_ ^ 0xffffffff) == 0)
					return -1;
				i_20_ = i & i_20_ - -2;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "a.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method44(byte arg0) {
		try {
			aClass19_72 = null;
			anIntArray74 = null;
			int i = -42 % ((-41 - arg0) / 51);
			Game.signlink = null;
			anIntArray73 = null;
			aClass12_Sub12_Sub7_Sub2_80 = null;
			aClass26_71 = null;
			aClass12_Sub12_Sub7_Sub1Array82 = null;
			anIntArray76 = null;
			aClass59_75 = null;
			aClass59_78 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "a.D(" + arg0 + ')');
		}
	}

	public Class1(int[] arg0) {
		try {
			int i;
			for (i = 1; i <= arg0.length - -(arg0.length >> -33648639); i <<= 1) {
				/* empty */
			}
			anIntArray84 = new int[i + i];
			for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i + i ^ 0xffffffff); i_22_++)
				anIntArray84[i_22_] = -1;
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (arg0.length ^ 0xffffffff); i_23_++) {
				int i_24_;
				for (i_24_ = i + -1 & arg0[i_23_]; (anIntArray84[1 + i_24_
						+ i_24_] ^ 0xffffffff) != 0; i_24_ = 1 + i_24_ & -1 + i) {
					/* empty */
				}
				anIntArray84[i_24_ + i_24_] = arg0[i_23_];
				anIntArray84[i_24_ + i_24_ + 1] = i_23_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "a.<init>("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method45(boolean arg0, byte arg1, RSSocket arg2) {
		try {
			if (Class48.aClass24_1124 != null) {
				try {
					Class48.aClass24_1124.method619(-2);
				} catch (Exception exception) {
					/* empty */
				}
				Class48.aClass24_1124 = null;
			}
			anInt86++;
			Class48.aClass24_1124 = arg2;
			Class40.method754(arg0, 4);
			Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position = 0;
			int i = 38 / ((58 - arg1) / 35);
			Class13.aClass12_Sub12_Sub8_354 = null;
			Class12_Sub12_Sub3.anInt2113 = 0;
			Class12_Sub12_Sub10.aClass12_Sub11_2377 = null;
			for (;;) {
				Class12_Sub12_Sub8 class12_sub12_sub8 = (Class12_Sub12_Sub8) Class12_Sub12_Sub8.aClass48_2288
						.method796((byte) -120);
				if (class12_sub12_sub8 == null)
					break;
				Class12_Sub1.aClass48_1612.method797((byte) -43,
						class12_sub12_sub8, (class12_sub12_sub8.aLong319));
				Class12_Sub12_Sub14.anInt2464++;
				Class61.anInt1363--;
			}
			for (;;) {
				Class12_Sub12_Sub8 class12_sub12_sub8 = ((Class12_Sub12_Sub8) Archive.aClass48_1887
						.method796((byte) -124));
				if (class12_sub12_sub8 == null)
					break;
				Class12_Sub12_Sub11_Sub5.aClass38_2857.method737(
						class12_sub12_sub8, 4);
				RSCanvas.aClass48_45.method797((byte) -84,
						class12_sub12_sub8, class12_sub12_sub8.aLong319);
				Game.anInt1562++;
				Class27.anInt635--;
			}
			if ((Class15.aByte398 ^ 0xffffffff) != -1) {
				try {
					Buffer class12_sub11 = new Buffer(4);
					class12_sub11.writeByte(4);
					class12_sub11.writeByte(Class15.aByte398);
					class12_sub11.method247((byte) 91, 0);
					Class48.aClass24_1124.method622(
							class12_sub11.payload, 4, 0, true);
				} catch (java.io.IOException ioexception) {
					try {
						Class48.aClass24_1124.method619(-2);
					} catch (Exception exception) {
						/* empty */
					}
					Class48.aClass24_1124 = null;
					Class12_Sub12_Sub8.anInt2294++;
				}
			}
			Class15.anInt391 = 0;
			Class17.aLong425 = System.currentTimeMillis();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("a.C(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method46(byte arg0) {
		try {
			if (arg0 <= 19)
				method44((byte) -25);
			Class15.anIntArray385 = null;
			Class57.anIntArray1337 = null;
			anInt83++;
			Class55.anIntArray1313 = null;
			Class28.aByteArrayArray669 = null;
			Class32.anIntArray778 = null;
			Class44.anIntArray1027 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "a.A(" + arg0 + ')');
		}
	}

	static {
		anIntArray73 = (new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84,
				-1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1,
				0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1,
				-1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24,
				-1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39,
				54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37,
				64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230,
				226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9,
				10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1 });
		anIntArray76 = new int[16384];
		anInt85 = 0;
		aClass59_75 = Class55.method898(
				"You have only just left another world)3", -10983);
		aClass59_78 = aClass59_75;
	}
}
