package com.jagex;/* com.jagex.Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class64 {
	public static Class12_Sub12_Sub7_Sub4[] aClass12_Sub12_Sub7_Sub4Array1438;
	public static int anInt1439;
	public static int anInt1440;
	public static RSString aClass59_1441 = Class55.method898("Loaded wordpack",
			-10983);
	public static RSString aClass59_1442 = aClass59_1441;
	public static Class62 aClass62_1443;
	public static Class27 aClass27_1444;
	public static int anInt1445;
	public static int anInt1446;
	public static RSString aClass59_1447 = Class55.method898("Mem:", -10983);
	public static Class14 aClass14_1448;
	public static Class27 aClass27_1449;
	public static Class26 aClass26_1450;
	public static int anInt1451;

	public static void method973(byte arg0) {
		aClass59_1442 = null;
		aClass59_1447 = null;
		aClass59_1441 = null;
		aClass14_1448 = null;
		aClass27_1449 = null;
		aClass26_1450 = null;
		aClass27_1444 = null;
		aClass62_1443 = null;
		aClass12_Sub12_Sub7_Sub4Array1438 = null;
		if (arg0 <= 107)
			aClass27_1449 = null;
	}

	public static int method974(boolean arg0, boolean arg1, boolean arg2) {
		try {
			if (arg1 != true)
				return 114;
			int i = 0;
			if (arg2)
				i += Class61.anInt1363 + Class12_Sub12_Sub14.anInt2464;
			anInt1445++;
			if (arg0)
				i += Game.anInt1562 + Class27.anInt635;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wd.L(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public abstract void method975(int i, byte[] is, int i_0_, boolean bool);

	public abstract void method976(int i);

	public static void method977(int arg0, int arg1, int arg2, int arg3,
                                 RSString arg4, int arg5) {
		do {
			try {
				if (arg5 > -38)
					method982(64);
				anInt1440++;
				if (Class13.anInt338 >= 500)
					break;
				Class12_Sub1.aClass59Array1621[Class13.anInt338] = arg4;
				Class19.anIntArray454[Class13.anInt338] = arg2;
				Class12_Sub12_Sub4.anIntArray2209[Class13.anInt338] = arg3;
				Class12_Sub12_Sub5.anIntArray2238[Class13.anInt338] = arg1;
				Class12_Sub2.anIntArray1646[Class13.anInt338] = arg0;
				Class13.anInt338++;
			} catch (RuntimeException runtimeexception) {
				throw Class35
						.method724(runtimeexception, ("wd.O(" + arg0 + ','
								+ arg1 + ',' + arg2 + ',' + arg3 + ','
								+ (arg4 != null ? "{...}" : "null") + ','
								+ arg5 + ')'));
			}
			break;
		} while (false);
	}

	public abstract void method978(int i, int i_1_, byte i_2_);

	public abstract void method979(int i, byte i_3_);

	public abstract void method980(int i);

	public abstract void method981(boolean bool);

	public static void method982(int arg0) {
		try {
			Class48.aClass27_1129.method675(true);
			int i = -5 % ((arg0 - 56) / 38);
			anInt1439++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wd.S(" + arg0 + ')');
		}
	}

	static {
		aClass27_1444 = new Class27(64);
		aClass27_1449 = new Class27(100);
	}
}
