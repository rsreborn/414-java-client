package com.jagex;/* com.jagex.Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Cache;

public class Class17 {
	public static RSString aClass59_411 = Class55
			.method898("backright1", -10983);
	public static int anInt412;
	public static int anInt413;
	public static RSString aClass59_414;
	public static int anInt415;
	public static int anInt416;
	public static RSString aClass59_418 = Class55
			.method898("Add ignore", -10983);
	public static int anInt420;
	public static int anInt421;
	public static boolean aBoolean422;
	public static byte[][][] aByteArrayArrayArray423;
	public static Class27 aClass27_424;
	public static long aLong425;

	public static void method593(int arg0) {
		try {
			Cache.configArchive = null;
			aClass59_414 = null;
			if (arg0 != 0)
				aClass27_424 = null;
			aClass59_411 = null;
			Game.rsaModulus = null;
			aClass59_418 = null;
			aClass27_424 = null;
			aByteArrayArrayArray423 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "fb.A(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub1 method594(RSString arg0, int arg1,
                                                    Class26 arg2, RSString arg3) {
		try {
			if (arg1 != 0)
				method595(95);
			anInt420++;
			int i = arg2.hashFileName(arg3, -22814);
			int i_0_ = arg2.method655(i, (byte) 57, arg0);
			return Class28.method683(i_0_, arg2, i, (byte) -113);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("fb.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method595(int arg0) {
		try {
			if (arg0 != -24160)
				aClass59_414 = null;
			anInt415++;
			for (;;) {
				Class12_Sub9 class12_sub9;
				synchronized (Class10.aClass8_240) {
					class12_sub9 = (Class12_Sub9) Class12_Sub12_Sub11_Sub2_Sub1.aClass8_2934
							.method102(5416);
				}
				if (class12_sub9 == null)
					break;
				class12_sub9.aClass26_Sub1_1753
						.method661(class12_sub9.aByteArray1757, false, -3,
								(int) class12_sub9.aLong319,
								class12_sub9.aClass36_1746);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "fb.B(" + arg0 + ')');
		}
	}

	static {
		aClass59_414 = aClass59_418;
		aBoolean422 = false;
		anInt421 = 0;
		aClass27_424 = new Class27(500);
	}
}
