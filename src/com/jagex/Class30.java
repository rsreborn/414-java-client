package com.jagex;/* com.jagex.Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;

public class Class30 {
	public static RSString aClass59_718;
	public static int anInt719;
	public static RSString aClass59_720;
	public static int anInt721;
	public static int[][] anIntArrayArray722;
	public static RSString aClass59_723 = Class55.method898(
			"Invalid username or password)3", -10983);
	public static int anInt724;
	public static RSString aClass59_725;
	public static RSString aClass59_726;
	public static RSString aClass59_727;
	public static int anInt728;
	public static RSString aClass59_729;
	public static RSString aClass59_730;
	public static RSString aClass59_731;
	public static int[][][] anIntArrayArrayArray732;
	public static RSString aClass59_733;
	public static int anInt734;
	public static RSString aClass59_735;
	public static int anInt736;
	public static int anInt737;
	public static int anInt738;
	public static RSString aClass59_739;
	public static int anInt740;
	public static int anInt741;
	public static RSString aClass59_742;
	public static RSString aClass59_743;
	public static int anInt744;
	public static volatile int anInt745;
	public static int[] anIntArray746;
	public static int anInt747;
	public static int anInt748;
	public static boolean[] aBooleanArray749;
	public static int anInt750;
	public static int anInt751;

	public static void method691(int arg0) {
		anIntArrayArray722 = null;
		aClass59_729 = null;
		aClass59_727 = null;
		aClass59_723 = null;
		anIntArrayArrayArray732 = null;
		aClass59_739 = null;
		aClass59_733 = null;
		aClass59_743 = null;
		aClass59_725 = null;
		aClass59_726 = null;
		aClass59_735 = null;
		aBooleanArray749 = null;
		anIntArray746 = null;
		aClass59_718 = null;
		aClass59_742 = null;
		aClass59_731 = null;
		aClass59_720 = null;
		aClass59_730 = null;
		if (arg0 != -22505)
			aClass59_727 = null;
	}

	public static void method692(byte arg0, int arg1) {
		try {
			if (arg0 > -56)
				aClass59_731 = null;
			anInt748++;
			if (Class15.method589(arg1, 14585)) {
				Class12_Sub12_Sub3[] class12_sub12_sub3s = (Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg1]);
				for (int i = 0; i < class12_sub12_sub3s.length; i++) {
					Class12_Sub12_Sub3 class12_sub12_sub3 = class12_sub12_sub3s[i];
					if (class12_sub12_sub3 != null) {
						class12_sub12_sub3.anInt2110 = 0;
						class12_sub12_sub3.anInt2132 = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ka.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method693(Class26 arg0, Class26 arg1, int arg2) {
		try {
			anInt734++;
			Archive.aClass26_1877 = arg1;
			if (arg2 == 100)
				Class9.aClass26_210 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ka.F("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public static void method694(int arg0, int arg1, int arg2, byte arg3,
			int arg4, int arg5) {
		try {
			anInt724++;
			Class15.aClass12_Sub12_Sub7_Sub2Array387[0].method370(arg5, arg0);
			Class15.aClass12_Sub12_Sub7_Sub2Array387[1].method370(arg5, -16
					+ arg0 + arg2);
			Class12_Sub12_Sub7.method347(arg5, 16 + arg0, 16, arg2 - 32,
					Class33.anInt828);
			int i = (-32 + arg2) * arg2 / arg1;
			if ((i ^ 0xffffffff) > -9)
				i = 8;
			int i_0_ = (arg2 + -32 + -i) * arg4 / (-arg2 + arg1);
			Class12_Sub12_Sub7.method347(arg5, 16 + arg0 - -i_0_, 16, i,
					RSString.anInt1515);
			Class12_Sub12_Sub7.method351(arg5, i_0_ + 16 + arg0, i,
					Class62_Sub2.anInt1925);
			Class12_Sub12_Sub7.method351(1 + arg5, i_0_ + (16 + arg0), i,
					Class62_Sub2.anInt1925);
			Class12_Sub12_Sub7.method343(arg5, arg0 - -16 + i_0_, 16,
					Class62_Sub2.anInt1925);
			Class12_Sub12_Sub7.method343(arg5, 17 + arg0 + i_0_, 16,
					Class62_Sub2.anInt1925);
			if (arg3 < 15)
				anInt744 = 50;
			Class12_Sub12_Sub7.method351(15 + arg5, i_0_ + 16 + arg0, i,
					Class12_Sub12_Sub13.anInt2438);
			Class12_Sub12_Sub7.method351(arg5 - -14, 17 + arg0 - -i_0_, i - 1,
					Class12_Sub12_Sub13.anInt2438);
			Class12_Sub12_Sub7.method343(arg5, i + arg0 - (-15 + -i_0_), 16,
					Class12_Sub12_Sub13.anInt2438);
			Class12_Sub12_Sub7.method343(arg5 - -1, i + i_0_ + arg0 + 14, 15,
					Class12_Sub12_Sub13.anInt2438);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception,
					("ka.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ',' + arg5 + ')'));
		}
	}

	public static Class12_Sub12_Sub14 method695(int arg0, int arg1) {
		try {
			if (arg1 > -109)
				aClass59_739 = null;
			anInt737++;
			Class12_Sub12_Sub14 class12_sub12_sub14 = ((Class12_Sub12_Sub14) Class18.aClass27_426
					.method673(121, (long) arg0));
			if (class12_sub12_sub14 != null)
				return class12_sub12_sub14;
			byte[] is = Class63.aClass26_1427.method631(13, true, arg0);
			class12_sub12_sub14 = new Class12_Sub12_Sub14();
			class12_sub12_sub14.anInt2452 = arg0;
			if (is != null)
				class12_sub12_sub14.method538(new Buffer(is), -88);
			Class18.aClass27_426.method678((byte) 123, class12_sub12_sub14,
					(long) arg0);
			return class12_sub12_sub14;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ka.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method696(byte arg0) {
		Class35.aClass9_866.method106(false);
		for (int i = 0; i < 32; i++)
			Class20.aLongArray476[i] = 0L;
		anInt738++;
		for (int i = 0; i < 32; i++)
			Class39.aLongArray943[i] = 0L;
		Class12_Sub12_Sub8.anInt2292 = 0;
		if (arg0 != -91)
			anInt736 = 4;
	}

	static {
		anInt721 = 1;
		anInt728 = 0;
		aClass59_731 = Class55.method898("cyan:", -10983);
		aClass59_725 = Class55.method898("wishes to duel with you)3", -10983);
		anIntArrayArray722 = new int[104][104];
		aClass59_720 = aClass59_731;
		aClass59_730 = Class55
				.method898("Unexpected server response: ", -10983);
		anInt719 = 0;
		aClass59_735 = aClass59_723;
		aClass59_718 = aClass59_730;
		anInt744 = 255;
		aClass59_743 = (Class55.method898(
				"Moderator option: Mute player for 48 hours: <OFF>", -10983));
		aClass59_726 = aClass59_725;
		anInt745 = 0;
		aClass59_742 = Class55.method898("Classic", -10983);
		aClass59_733 = aClass59_742;
		aClass59_727 = aClass59_743;
		anIntArray746 = new int[100];
		anInt747 = 0;
		aClass59_729 = Class55.method898("From", -10983);
		aClass59_739 = aClass59_729;
		anInt750 = 0;
		anInt736 = 0;
	}
}
