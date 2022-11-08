package com.jagex;/* com.jagex.Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;

public class Class5 {
	public static Class62 aClass62_148;
	public static int[] anIntArray149;
	public static int anInt150;
	public static long[] aLongArray151 = new long[100];
	public static int anInt152;
	public static int anInt153;
	public static Archive[] aClass26_Sub1Array154;
	public static RSString aClass59_155;
	public static RSString aClass59_156;
	public static RSString aClass59_157 = Class55.method898("skill)2", -10983);
	public static Class64 aClass64_158;
	public static int anInt159;
	public static RSString aClass59_160;
	public static RSString aClass59_161;
	public static int anInt162;

	public static Class12_Sub12_Sub4 method74(int arg0, int arg1) {
		try {
			anInt153++;
			Class12_Sub12_Sub4 class12_sub12_sub4 = ((Class12_Sub12_Sub4) Class12_Sub12_Sub8.aClass27_2302
					.method673(107, (long) arg1));
			if (class12_sub12_sub4 != null)
				return class12_sub12_sub4;
			byte[] is = Class12_Sub12_Sub11.aClass26_2384.method631(12, true,
					arg1);
			if (arg0 != 9)
				method74(-52, 95);
			class12_sub12_sub4 = new Class12_Sub12_Sub4();
			if (is != null)
				class12_sub12_sub4.method311(new Buffer(is), 115);
			class12_sub12_sub4.method313(arg0 + 96);
			Class12_Sub12_Sub8.aClass27_2302.method678((byte) 123,
					class12_sub12_sub4, (long) arg1);
			return class12_sub12_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ad.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static boolean method75(int arg0, byte arg1, int arg2) {
		try {
			if (arg1 > 0)
				aClass59_160 = null;
			anInt152++;
			if ((arg2 ^ 0xffffffff) == -1
					&& (arg0 ^ 0xffffffff) == (Class63.anInt1418 ^ 0xffffffff))
				return true;
			if (arg2 == 1 && arg0 == Class57.anInt1335)
				return true;
			if ((arg2 == 2 || arg2 == 3)
					&& (Class12_Sub1.anInt1626 ^ 0xffffffff) == (arg0 ^ 0xffffffff))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ad.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method76(int arg0) {
		aLongArray151 = null;
		aClass64_158 = null;
		aClass59_160 = null;
		aClass26_Sub1Array154 = null;
		aClass59_156 = null;
		aClass59_157 = null;
		aClass59_155 = null;
		aClass59_161 = null;
		aClass62_148 = null;
		anIntArray149 = null;
		if (arg0 != 1)
			method76(54);
	}

	public static boolean method77(int arg0, int arg1, Class26 arg2, int arg3) {
		try {
			anInt150++;
			if (arg1 != 29066)
				aLongArray151 = null;
			byte[] is = arg2.method631(arg3, true, arg0);
			if (is == null)
				return false;
			Class35.method723(arg1 + -4559, is);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ad.C(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ')'));
		}
	}

	static {
		aClass59_155 = Class55.method898("cross", -10983);
		anInt159 = 0;
		aClass26_Sub1Array154 = new Archive[256];
		anIntArray149 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
		aClass59_161 = aClass59_157;
		aClass59_160 = Class55.method898("This world is full)3", -10983);
		aClass59_156 = aClass59_160;
	}
}
