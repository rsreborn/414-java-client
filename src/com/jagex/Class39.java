package com.jagex;/* com.jagex.Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class39 {
	public static int anInt928;
	public static int[] anIntArray929;
	public static RSString aClass59_930;
	public static int anInt931;
	public static int anInt932;
	public static RSString aClass59_933;
	public static RSString aClass59_934 = Class55.method898(
			"Please wait 1 minute and try again)3", -10983);
	public static RSString aClass59_935 = aClass59_934;
	public static int anInt936 = 0;
	public static int anInt937;
	public static Class27 aClass27_938;
	public static RSString aClass59_939;
	public static int anInt940;
	public static RSString aClass59_941;
	public static RSString aClass59_942;
	public static long[] aLongArray943;

	public static Class12_Sub12_Sub16 method745(int arg0, boolean arg1) {
		try {
			anInt928++;
			Class12_Sub12_Sub16 class12_sub12_sub16 = ((Class12_Sub12_Sub16) Class48.aClass27_1129
					.method673(107, (long) arg0));
			if (class12_sub12_sub16 != null)
				return class12_sub12_sub16;
			if (arg1 != false)
				return null;
			byte[] is = Class18.aClass26_438.method631(16, true, arg0);
			class12_sub12_sub16 = new Class12_Sub12_Sub16();
			if (is != null)
				class12_sub12_sub16.method558(new Buffer(is),
						(byte) -119);
			Class48.aClass27_1129.method678((byte) 123, class12_sub12_sub16,
					(long) arg0);
			return class12_sub12_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "md.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method746(boolean arg0) {
		try {
			anInt937++;
			if (arg0 != true)
				method746(true);
			RSString.aClass27_1522.method675(true);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "md.B(" + arg0 + ')');
		}
	}

	public static void method747(int arg0) {
		try {
			aClass59_939 = null;
			aClass59_935 = null;
			if (arg0 != -15356)
				method747(58);
			aClass59_930 = null;
			aClass59_942 = null;
			anIntArray929 = null;
			aClass59_933 = null;
			aLongArray943 = null;
			aClass59_941 = null;
			aClass27_938 = null;
			aClass59_934 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "md.C(" + arg0 + ')');
		}
	}

	static {
		anInt931 = 1;
		aClass59_930 = Class55.method898("Malformed login packet)3", -10983);
		aClass59_933 = aClass59_934;
		aClass59_939 = aClass59_930;
		anInt932 = 0;
		aClass59_941 = aClass59_934;
		aClass27_938 = new Class27(50);
		aLongArray943 = new long[32];
		aClass59_942 = Class55.method898("backbase1", -10983);
	}
}
