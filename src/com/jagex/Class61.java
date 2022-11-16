package com.jagex;/* com.jagex.Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61 {
	public static RSString aClass59_1362;
	public static int anInt1363 = 0;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_1364;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_1365;
	public static int anInt1366;
	public static RSString aClass59_1367;
	public static RSString aClass59_1368;

	public static void method951(int arg0) {
		aClass59_1368 = null;
		aClass12_Sub12_Sub7_Sub2_1365 = null;
		aClass59_1362 = null;
		aClass12_Sub12_Sub7_Sub2_1364 = null;
		aClass59_1367 = null;
		if (arg0 <= 5)
			aClass59_1368 = null;
	}

	public static void method952(boolean arg0) {
		anInt1366++;
		for (int i = -1; Class9.anInt203 > i; i++) {
			int i_0_;
			if ((i ^ 0xffffffff) != 0)
				i_0_ = Class36.anIntArray888[i];
			else
				i_0_ = 2047;
			Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_0_];
			if (class12_sub12_sub11_sub2_sub2 != null)
				Class33.method712(class12_sub12_sub11_sub2_sub2, 1, 0);
		}
		if (arg0 != false)
			method951(37);
	}

	static {
		aClass59_1362 = Class55.method898("Could not complete login)3", -10983);
		aClass59_1367 = Class55.method898("p11_full", -10983);
		aClass59_1368 = aClass59_1362;
	}
}
