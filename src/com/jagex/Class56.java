package com.jagex;/* com.jagex.Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56 {
	public static RSString aClass59_1314;
	public static int anInt1315;
	public static int anInt1316 = -1;
	public static int anInt1317;
	public static RSString aClass59_1318 = Class55.method898(
			"RuneScape has been updated(Q", -10983);
	public static RSString aClass59_1319 = Class55.method898("overlay_multiway",
			-10983);
	public static int anInt1320;
	public static Object anObject1321;
	public static int anInt1322;
	public static long aLong1323;
	public static Class8 aClass8_1324;

	public static void method901(byte arg0) {
		aClass8_1324 = null;
		aClass59_1319 = null;
		aClass59_1318 = null;
		aClass59_1314 = null;
		anObject1321 = null;
		if (arg0 != 64)
			method902(60, -48, 11, 81, -57, null, 74, 91, 21);
	}

	public static void method902(int arg0, int arg1, int arg2, int arg3,
			int arg4, Class12_Sub12_Sub3 arg5, int arg6, int arg7, int arg8) {
		anInt1322++;
		if (Class17.aBoolean422)
			Class64_Sub1.anInt1942 = 32;
		else
			Class64_Sub1.anInt1942 = 0;
		int i = 97 % ((71 - arg2) / 42);
		Class17.aBoolean422 = false;
		if ((arg6 ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
				&& (16 + arg4 ^ 0xffffffff) < (arg6 ^ 0xffffffff)
				&& (arg7 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
				&& (arg0 ^ 0xffffffff) > (16 + arg7 ^ 0xffffffff)) {
			if ((arg3 ^ 0xffffffff) == -3 || arg3 == 3)
				Class8.aBoolean182 = true;
			if ((arg3 ^ 0xffffffff) == -2)
				Class49.aBoolean1146 = true;
			arg5.anInt2143 -= 4 * Class7.anInt1538;
		} else if (arg6 < arg4 || arg6 >= arg4 + 16 || arg0 < arg7 + arg1 - 16
				|| arg0 >= arg1 + arg7) {
			if (arg6 >= arg4 + -Class64_Sub1.anInt1942
					&& Class64_Sub1.anInt1942 + (16 + arg4) > arg6
					&& (arg0 ^ 0xffffffff) <= (16 + arg7 ^ 0xffffffff)
					&& (arg1 + arg7 - 16 ^ 0xffffffff) < (arg0 ^ 0xffffffff)
					&& (Class7.anInt1538 ^ 0xffffffff) < -1) {
				Class17.aBoolean422 = true;
				if ((arg3 ^ 0xffffffff) == -2)
					Class49.aBoolean1146 = true;
				int i_0_ = (arg1 - 32) * arg1 / arg8;
				if ((i_0_ ^ 0xffffffff) > -9)
					i_0_ = 8;
				if ((arg3 ^ 0xffffffff) == -3 || arg3 == 3)
					Class8.aBoolean182 = true;
				int i_1_ = arg0 - arg7 - (16 - -(i_0_ / 2));
				int i_2_ = arg1 - (32 - -i_0_);
				arg5.anInt2143 = i_1_ * (-arg1 + arg8) / i_2_;
			}
		} else {
			if ((arg3 ^ 0xffffffff) == -2)
				Class49.aBoolean1146 = true;
			arg5.anInt2143 += Class7.anInt1538 * 4;
			if (arg3 == 2 || arg3 == 3)
				Class8.aBoolean182 = true;
		}
	}

	public static void method903(int arg0, int arg1,
			Class12_Sub12_Sub7_Sub1 arg2, int arg3) {
		try {
			anInt1315++;
			int i = arg3 * arg3 + arg1 * arg1;
			if (arg0 != -12199)
				aClass59_1314 = null;
			if ((i ^ 0xffffffff) < -4226 && (i ^ 0xffffffff) > -90001) {
				int i_3_ = Class35.anInt842 + Class48.anInt1127 & 0x7ff;
				int i_4_ = Class12_Sub12_Sub11_Sub4.anIntArray2833[i_3_];
				int i_5_ = Class12_Sub12_Sub11_Sub4.anIntArray2831[i_3_];
				i_4_ = 256 * i_4_ / (Class15.anInt384 + 256);
				i_5_ = 256 * i_5_ / (256 + Class15.anInt384);
				int i_6_ = arg3 * i_4_ - arg1 * i_5_ >> 667747664;
				int i_7_ = i_4_ * arg1 + i_5_ * arg3 >> 21918832;
				double d = Math.atan2((double) i_7_, (double) i_6_);
				int i_8_ = (int) (63.0 * Math.sin(d));
				int i_9_ = (int) (Math.cos(d) * 57.0);
				Class12.aClass12_Sub12_Sub7_Sub1_314.method358(94 - -i_8_ + -6,
						-20 + (-i_9_ + 83), 20, 20, 15, 15, d, 256);
			} else
				Class27.method679(arg1, (byte) -107, arg2, arg3);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("sc.C(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ')'));
		}
	}

	public static void method904(byte arg0) {
		try {
			anInt1317++;
			if (Class5.aClass64_158 != null) {
				Class8.method96(false);
				if (Class49.anInt1142 > 0) {
					Class5.aClass64_158.method979(256, (byte) 50);
					Class49.anInt1142 = 0;
				}
				Class5.aClass64_158.method976(699);
				if (arg0 > 114)
					Class5.aClass64_158 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "sc.B(" + arg0 + ')');
		}
	}

	static {
		aClass59_1314 = aClass59_1318;
		anObject1321 = new Object();
		aLong1323 = 0L;
		aClass8_1324 = new Class8();
	}
}
