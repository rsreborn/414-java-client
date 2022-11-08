package com.jagex;/* com.jagex.Class12_Sub12_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class12_Sub12_Sub11 extends Class12_Sub12 {
	public static int anInt2383;
	public static Class26 aClass26_2384;
	public static Class12_Sub12_Sub7_Sub1 aClass12_Sub12_Sub7_Sub1_2385;
	public static int anInt2386 = 0;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_2387;
	public static int anInt2388;
	public static RSString aClass59_2389;
	public static RSString aClass59_2390 = Class55.method898(
			"Connecting to friendserver", -10983);
	public static RSString aClass59_2391;
	public static int anInt2392;
	public static RSString aClass59_2393;
	public int anInt2394 = 1000;
	public static RSString aClass59_2395;
	public static int anInt2396 = 0;
	public static int anInt2397;
	public static int anInt2398;
	public static RSString aClass59_2399;

	public static void method434(int arg0) {
		try {
			anInt2383++;
			int i = 0;
			if (arg0 != -2382)
				aClass12_Sub12_Sub7_Sub1_2385 = null;
			for (/**/; (Class62_Sub2.anInt1916 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				int i_0_ = Class1.anIntArray76[i];
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_0_];
				if (class12_sub12_sub11_sub2_sub1 != null)
					Class33.method712(
							class12_sub12_sub11_sub2_sub1,
							(class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2097),
							0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "oa.EB(" + arg0 + ')');
		}
	}

	public static void method435(boolean arg0) {
		try {
			aClass59_2399 = null;
			aClass59_2393 = null;
			aClass59_2395 = null;
			aClass26_2384 = null;
			aClass59_2390 = null;
			aClass12_Sub12_Sub7_Sub1_2385 = null;
			if (arg0 != false)
				method438(28);
			aClass59_2389 = null;
			aClass59_2391 = null;
			aClass12_Sub12_Sub7_Sub2_2387 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "oa.FB(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method436(int arg0) {
		try {
			anInt2388++;
			if (arg0 <= 60)
				aClass12_Sub12_Sub7_Sub2_2387 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "oa.P(" + arg0 + ')');
		}
	}

	public void method437(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, int arg8) {
		anInt2398++;
		Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = method436(108);
		if (class12_sub12_sub11_sub4 != null) {
			anInt2394 = class12_sub12_sub11_sub4.anInt2394;
			class12_sub12_sub11_sub4.method437(arg0, arg1, arg2, arg3, arg4,
					arg5, arg6, arg7, arg8);
		}
	}

	public static void method438(int arg0) {
		try {
			anInt2392++;
			if (arg0 != 0)
				method438(5);
			Class12.aClass27_327.method675(true);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "oa.DB(" + arg0 + ')');
		}
	}

	static {
		aClass59_2395 = Class55.method898("@yel@*V", -10983);
		aClass59_2399 = Class55.method898(" x ", -10983);
		aClass59_2393 = Class55.method898("wave2:", -10983);
		aClass59_2389 = aClass59_2393;
		aClass59_2391 = aClass59_2390;
	}
}
