package com.jagex;/* com.jagex.Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.util.Statics;

public class Class58 {
	public static RSString aClass59_1341;
	public static int anInt1342;
	public static int anInt1343;
	public static Class27 aClass27_1344;
	public static int anInt1345;
	public static int[] anIntArray1346 = new int[50];
	public static int anInt1347;
	public static int anInt1348;
	public static RSString aClass59_1349;
	public static int[][] xteaKeys;
	public static RSString aClass59_1351 = Class55.method898("@gr3@", -10983);
	public static RSString aClass59_1352 = Class55.method898(
			"Your account has been disabled)3", -10983);
	public static RSString aClass59_1353 = Class55.method898(" has logged in)3",
			-10983);
	public static int anInt1354;
	public static int anInt1355;
	public static int anInt1356;
	public static volatile boolean aBoolean1357;
	public static RSString aClass59_1358;
	public static RSString aClass59_1359;
	public static int anInt1360;
	public static int anInt1361;

	public static void method907(int arg0, Class12_Sub12_Sub11_Sub2 arg1) {
		anInt1354++;
		if ((arg1.anInt2669 ^ 0xffffffff) != -1) {
			if (arg1.anInt2694 != -1 && arg1.anInt2694 < 32768) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[arg1.anInt2694]);
				if (class12_sub12_sub11_sub2_sub1 != null) {
					int i = (arg1.anInt2691 - class12_sub12_sub11_sub2_sub1.anInt2691);
					int i_0_ = (-class12_sub12_sub11_sub2_sub1.anInt2683 + arg1.anInt2683);
					if (i != 0 || (i_0_ ^ 0xffffffff) != -1)
						arg1.anInt2666 = 0x7ff & (int) (325.949 * Math.atan2(
								(double) i, (double) i_0_));
				}
			}
			if ((arg1.anInt2694 ^ 0xffffffff) <= -32769) {
				int i = arg1.anInt2694 + -32768;
				if ((i ^ 0xffffffff) == (Class12_Sub9.anInt1751 ^ 0xffffffff))
					i = 2047;
				Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i];
				if (class12_sub12_sub11_sub2_sub2 != null) {
					int i_1_ = (arg1.anInt2691 - class12_sub12_sub11_sub2_sub2.anInt2691);
					int i_2_ = (arg1.anInt2683 - class12_sub12_sub11_sub2_sub2.anInt2683);
					if (i_1_ != 0 || i_2_ != 0)
						arg1.anInt2666 = ((int) (325.949 * Math.atan2(
								(double) i_1_, (double) i_2_)) & 0x7ff);
				}
			}
			if ((arg1.anInt2690 != 0 || arg1.anInt2672 != 0)
					&& ((arg1.anInt2665 ^ 0xffffffff) == -1 || (arg1.anInt2670 ^ 0xffffffff) < -1)) {
				int i = (arg1.anInt2691 - 64 * (-Class64.anInt1451 + (-Class64.anInt1451 + arg1.anInt2690)));
				int i_3_ = arg1.anInt2683
						- (-Class8.anInt174 + arg1.anInt2672 + -Class8.anInt174)
						* 64;
				if ((i ^ 0xffffffff) != -1 || (i_3_ ^ 0xffffffff) != -1)
					arg1.anInt2666 = (int) (325.949 * Math.atan2((double) i,
							(double) i_3_)) & 0x7ff;
				arg1.anInt2672 = 0;
				arg1.anInt2690 = 0;
			}
			int i = -arg1.anInt2680 + arg1.anInt2666 & 0x7ff;
			if (arg0 <= 16)
				method910((byte) -77);
			if (i != 0) {
				if ((i ^ 0xffffffff) > (arg1.anInt2669 ^ 0xffffffff)
						|| (-arg1.anInt2669 + 2048 ^ 0xffffffff) > (i ^ 0xffffffff))
					arg1.anInt2680 = arg1.anInt2666;
				else if ((i ^ 0xffffffff) < -1025)
					arg1.anInt2680 -= arg1.anInt2669;
				else
					arg1.anInt2680 += arg1.anInt2669;
				arg1.anInt2680 &= 0x7ff;
				if (arg1.anInt2681 == arg1.anInt2718
						&& arg1.anInt2680 != arg1.anInt2666) {
					if (arg1.anInt2679 == -1)
						arg1.anInt2718 = arg1.anInt2710;
					else
						arg1.anInt2718 = arg1.anInt2679;
				}
			}
		}
	}

	public static void method908(byte arg0) {
		Statics.aClass8_2017 = new Class8();
		anInt1355++;
		if (arg0 != -29)
			aClass59_1349 = null;
	}

	public static void method909(Class26 arg0, int arg1, Class26 arg2,
			boolean arg3) {
		try {
			Class35.aClass26_848 = arg0;
			anInt1361++;
			if (arg1 != -20188)
				method911(52, -10, -86, null);
			Class12_Sub12_Sub10.aClass26_2370 = arg2;
			Class57.aBoolean1338 = arg3;
			Class12_Sub6.anInt1684 = Class12_Sub12_Sub10.aClass26_2370
					.method645(10, false);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("uc.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public static void method910(byte arg0) {
		try {
			aClass59_1349 = null;
			aClass59_1351 = null;
			if (arg0 <= 119)
				aClass59_1341 = null;
			aClass59_1359 = null;
			aClass59_1358 = null;
			aClass59_1341 = null;
			aClass59_1353 = null;
			aClass59_1352 = null;
			anIntArray1346 = null;
			xteaKeys = null;
			aClass27_1344 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "uc.A(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub2[] method911(int arg0, int arg1,
			int arg2, Class26 arg3) {
		try {
			anInt1345++;
			if (!Class5.method77(arg2, 29066, arg3, arg0))
				return null;
			int i = 18 / ((arg1 - -66) / 44);
			return Class12_Sub12_Sub11_Sub5.method503(10);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("uc.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt1348 = (int) (Math.random() * 33.0) + -16;
		anInt1342 = -1;
		aBoolean1357 = true;
		aClass59_1341 = aClass59_1353;
		aClass59_1358 = aClass59_1352;
		aClass59_1359 = (Class55.method898(
				"Press (Wrecover a locked account(W on front page)3", -10983));
		aClass59_1349 = aClass59_1359;
		anInt1343 = -1;
	}
}
