package com.jagex;/* com.jagex.Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Cache;

public class Class38 {
	public static RSString aClass59_908;
	public static RSString aClass59_909 = Class55
			.method898("Username: ", -10983);
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array911;
	public static boolean aBoolean912;
	public Class12_Sub12 aClass12_Sub12_913 = new Class12_Sub12();
	public static int anInt915;
	public static int anInt916;
	public static int anInt917;
	public static int anInt918;
	public static int anInt919;
	public static RSString aClass59_920;
	public static int[] anIntArray921;
	public static RSString aClass59_922;
	public static RSString aClass59_923;
	public static int anInt924;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_925;
	public static RSString aClass59_926;
	public static int anInt927;

	public static int method736(int arg0, int arg1, int arg2) {
		try {
			anInt927++;
			if (arg0 > arg1) {
				int i = arg1;
				arg1 = arg0;
				arg0 = i;
			}
			if (arg2 != 18963)
				method741((byte) 114);
			int i;
			for (/**/; arg0 != 0; arg0 = i) {
				i = arg1 % arg0;
				arg1 = arg0;
			}
			return arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("mc.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method737(Class12_Sub12 arg0, int arg1) {
		try {
			if (arg0.aClass12_Sub12_1850 != null)
				arg0.method268(true);
			arg0.aClass12_Sub12_1848 = aClass12_Sub12_913.aClass12_Sub12_1848;
			arg0.aClass12_Sub12_1850 = aClass12_Sub12_913;
			arg0.aClass12_Sub12_1850.aClass12_Sub12_1848 = arg0;
			if (arg1 == 4) {
				arg0.aClass12_Sub12_1848.aClass12_Sub12_1850 = arg0;
				anInt916++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "mc.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public Class12_Sub12 method738(int arg0) {
		try {
			if (arg0 != 0)
				return null;
			anInt918++;
			Class12_Sub12 class12_sub12 = aClass12_Sub12_913.aClass12_Sub12_1848;
			if (aClass12_Sub12_913 == class12_sub12)
				return null;
			return class12_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "mc.A(" + arg0 + ')');
		}
	}

	public static void method739(int arg0) {
		try {
			aClass59_926 = null;
			aClass12_Sub12_Sub7_Sub2_925 = null;
			if (arg0 != 10227)
				method741((byte) 44);
			Cache.spritesArchive = null;
			anIntArray921 = null;
			aClass59_908 = null;
			aClass59_920 = null;
			aClass59_923 = null;
			aClass12_Sub12_Sub7_Sub1Array911 = null;
			aClass59_922 = null;
			aClass59_909 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "mc.F(" + arg0 + ')');
		}
	}

	public static void method741(byte arg0) {
		try {
			RSString.aClass27_1502.method675(true);
			anInt924++;
			Class17.aClass27_424.method675(true);
			Class44.aClass27_1046.method675(true);
			Player.aClass27_2961.method675(true);
			int i = 17 % ((65 - arg0) / 36);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "mc.H(" + arg0 + ')');
		}
	}

	public void method742(int arg0, Class12_Sub12 arg1) {
		try {
			anInt917++;
			if (arg1.aClass12_Sub12_1850 != null)
				arg1.method268(true);
			arg1.aClass12_Sub12_1850 = aClass12_Sub12_913.aClass12_Sub12_1850;
			if (arg0 != 3)
				method742(15, null);
			arg1.aClass12_Sub12_1848 = aClass12_Sub12_913;
			arg1.aClass12_Sub12_1850.aClass12_Sub12_1848 = arg1;
			arg1.aClass12_Sub12_1848.aClass12_Sub12_1850 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("mc.E(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class12_Sub12 method743(int arg0) {
		try {
			if (arg0 >= -63)
				method742(59, null);
			anInt915++;
			Class12_Sub12 class12_sub12 = aClass12_Sub12_913.aClass12_Sub12_1848;
			if (aClass12_Sub12_913 == class12_sub12)
				return null;
			class12_sub12.method268(true);
			return class12_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "mc.C(" + arg0 + ')');
		}
	}

	public static int method744(int arg0, int arg1, int arg2) {
		try {
			if (arg1 != -15225)
				aClass59_909 = null;
			int i = -128
					+ (Class12_Sub12.method271(arg2 - -45365, 4, arg0 + 91923,
							-20648)
							- -(-128
									+ Class12_Sub12.method271(10294 + arg2, 2,
											37821 + arg0, -20648) >> -1837669375) - -(Class12_Sub12
							.method271(arg2, 1, arg0, arg1 ^ 0x6bdf) + -128 >> -1550136478));
			i = (int) ((double) i * 0.3) + 35;
			if ((i ^ 0xffffffff) <= -11) {
				if (i > 60)
					i = 60;
			} else
				i = 10;
			anInt919++;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("mc.G(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public Class38() {
		try {
			aClass12_Sub12_913.aClass12_Sub12_1850 = aClass12_Sub12_913;
			aClass12_Sub12_913.aClass12_Sub12_1848 = aClass12_Sub12_913;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "mc.<init>(" + ')');
		}
	}

	static {
		aClass59_908 = Class55.method898("@gr2@", -10983);
		aClass59_920 = Class55.method898("Friends", -10983);
		aBoolean912 = false;
		aClass59_926 = Class55.method898("scape main", -10983);
		aClass59_922 = aClass59_920;
		aClass59_923 = aClass59_909;
	}
}
