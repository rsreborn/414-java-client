package com.jagex;/* com.jagex.Class12_Sub12_Sub11_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub12_Sub11_Sub3 extends Class12_Sub12_Sub11 {
	public static RSString aClass59_2735;
	public int anInt2736;
	public double aDouble2737;
	public int anInt2738;
	public static int anInt2739 = 0;
	public static int anInt2740;
	public static int anInt2741;
	public int anInt2742;
	public double aDouble2743;
	public static RSString aClass59_2744;
	public int anInt2745;
	public double aDouble2746;
	public int anInt2747;
	public double aDouble2748;
	public static RSString aClass59_2749;
	public int anInt2750;
	public static int anInt2751;
	public double aDouble2752;
	public static int anInt2753 = 0;
	public int anInt2754 = 0;
	public int anInt2755;
	public double aDouble2756;
	public boolean aBoolean2757 = false;
	public static int anInt2758;
	public static int anInt2759;
	public int anInt2760;
	public Class12_Sub12_Sub4 aClass12_Sub12_Sub4_2761;
	public static int anInt2762;
	public int anInt2763;
	public int anInt2764;
	public int anInt2765;
	public static Class33 aClass33_2766;
	public int anInt2767;
	public double aDouble2768;
	public static Class26 aClass26_2769;
	public double aDouble2770;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_2771;
	public static int anInt2772;
	public int anInt2773;
	public static long aLong2774;
	public int anInt2775;
	public static int anInt2776;
	public static RSString aClass59_2777;

	public static boolean method464(int arg0) {
		try {
			if (arg0 != 17754)
				return false;
			anInt2772++;
			if (Class5.aClass64_158 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jb.C(" + arg0 + ')');
		}
	}

	public static int method465(int arg0, int arg1, int arg2) {
		try {
			anInt2758++;
			long l = (long) ((arg1 << -1560999504) - -arg2);
			if (arg0 != -10601)
				method468(null, null, null, 33);
			if (Class13.aClass12_Sub12_Sub8_354 == null
					|| ((l ^ 0xffffffffffffffffL) != (Class13.aClass12_Sub12_Sub8_354.aLong319 ^ 0xffffffffffffffffL)))
				return 0;
			return 1 - -(Class12_Sub12_Sub10.aClass12_Sub11_2377.position * 99 / (-Class13.aClass12_Sub12_Sub8_354.aByte2287 + (Class12_Sub12_Sub10.aClass12_Sub11_2377.payload).length));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("jb.F(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method466(byte arg0) {
		try {
			anInt2759++;
			if (arg0 > 106) {
				Class12_Sub12_Sub11_Sub5.aClass62_2878.method960(-1);
				Class12_Sub12_Sub11.aClass12_Sub12_Sub7_Sub2_2387.method370(0,
						0);
				Class44.anIntArray1040 = Class12_Sub12_Sub7_Sub3
						.method376(Class44.anIntArray1040);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jb.G(" + arg0 + ')');
		}
	}

	public void method467(int arg0, int arg1) {
		aDouble2770 += (double) arg1 * aDouble2756;
		aDouble2737 += (aDouble2743 * (double) arg1 + (double) arg1
				* ((double) arg1 * (aDouble2748 * 0.5)));
		aDouble2768 += aDouble2746 * (double) arg1;
		aDouble2743 += (double) arg1 * aDouble2748;
		if (arg0 >= -15)
			method469((byte) -65);
		anInt2751++;
		aBoolean2757 = true;
		anInt2736 = 1024 + (int) (325.949 * Math
				.atan2(aDouble2746, aDouble2756)) & 0x7ff;
		anInt2775 = 0x7ff & (int) (325.949 * Math.atan2(aDouble2743,
				aDouble2752));
		if (aClass12_Sub12_Sub4_2761 != null) {
			anInt2754 += arg1;
			while ((anInt2754 ^ 0xffffffff) < (aClass12_Sub12_Sub4_2761.anIntArray2215[anInt2745] ^ 0xffffffff)) {
				anInt2754 -= aClass12_Sub12_Sub4_2761.anIntArray2215[anInt2745];
				anInt2745++;
				if (anInt2745 >= aClass12_Sub12_Sub4_2761.anIntArray2207.length)
					anInt2745 = 0;
			}
		}
	}

	public static void method468(RSString arg0, RSString arg1, RSString arg2,
                                 int arg3) {
		try {
			Class11.aClass59_279 = arg2;
			if (arg3 != -4774)
				method466((byte) -67);
			anInt2741++;
			Class11.aClass59_312 = arg1;
			Class11.aClass59_289 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("jb.B("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public static void method469(byte arg0) {
		try {
			aClass59_2744 = null;
			aClass59_2735 = null;
			aClass12_Sub12_Sub7_Sub2_2771 = null;
			aClass26_2769 = null;
			aClass59_2777 = null;
			int i = 77 % ((arg0 - 14) / 32);
			aClass33_2766 = null;
			aClass59_2749 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jb.D(" + arg0 + ')');
		}
	}

	public void method470(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (!aBoolean2757) {
				double d = (double) (arg3 - anInt2750);
				double d_0_ = (double) (-anInt2767 + arg2);
				double d_1_ = Math.sqrt(d_0_ * d_0_ + d * d);
				aDouble2770 = (double) anInt2767 + (double) anInt2747 * d_0_
						/ d_1_;
				aDouble2768 = (double) anInt2750 + (double) anInt2747 * d
						/ d_1_;
				aDouble2737 = (double) anInt2738;
			}
			if (arg0 != 0)
				anInt2753 = -82;
			anInt2776++;
			double d = (double) (anInt2755 + 1 + -arg4);
			aDouble2746 = ((double) arg3 - aDouble2768) / d;
			aDouble2756 = (-aDouble2770 + (double) arg2) / d;
			aDouble2752 = Math.sqrt(aDouble2756 * aDouble2756 + aDouble2746
					* aDouble2746);
			if (!aBoolean2757)
				aDouble2743 = -aDouble2752
						* Math.tan(0.02454369 * (double) anInt2760);
			aDouble2748 = 2.0
					* (-(d * aDouble2743) + ((double) arg1 - aDouble2737))
					/ (d * d);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("jb.E(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub3(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10) {
		anInt2745 = 0;
		try {
			anInt2738 = arg4;
			anInt2760 = arg7;
			anInt2755 = arg6;
			anInt2742 = arg0;
			anInt2773 = arg9;
			anInt2764 = arg10;
			anInt2750 = arg2;
			aBoolean2757 = false;
			anInt2767 = arg3;
			anInt2747 = arg8;
			anInt2763 = arg1;
			anInt2765 = arg5;
			int i = Class30.method695(anInt2742, -128).anInt2449;
			if (i != -1)
				aClass12_Sub12_Sub4_2761 = Class5.method74(9, i);
			else
				aClass12_Sub12_Sub4_2761 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("jb.<init>(" + arg0
					+ ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9
					+ ',' + arg10 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method436(int arg0) {
		try {
			Class12_Sub12_Sub14 class12_sub12_sub14 = Class30.method695(
					anInt2742, -125);
			anInt2762++;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = class12_sub12_sub14
					.method536((byte) 127, anInt2745);
			if (class12_sub12_sub11_sub4 == null)
				return null;
			class12_sub12_sub11_sub4.method501(anInt2775);
			if (arg0 < 60)
				anInt2764 = -60;
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jb.P(" + arg0 + ')');
		}
	}

	static {
		aClass59_2744 = Class55.method898(":chalreq:", -10983);
		aClass59_2735 = Class55.method898("backhmid2", -10983);
		aClass59_2749 = Class55.method898("::hiddenbuttontest", -10983);
		aClass59_2777 = Class55.method898("null", -10983);
	}
}
