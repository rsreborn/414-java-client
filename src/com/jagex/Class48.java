package com.jagex;/* com.jagex.Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.RSSocket;

public class Class48 {
	public static int anInt1114;
	public static int anInt1115;
	public static int anInt1116;
	public static int anInt1117;
	public static RSString[] aClass59Array1118;
	public static int anInt1119;
	public static int anInt1120;
	public static RSString aClass59_1121 = Class55.method898(
			"Too many connections from your address)3", -10983);
	public static int anInt1122;
	public long aLong1123;
	public static RSSocket aClass24_1124;
	public static int[] anIntArray1125;
	public static RSString aClass59_1126;
	public static int anInt1127;
	public int anInt1128;
	public static Class27 aClass27_1129;
	public Class12 aClass12_1130;
	public Class12[] aClass12Array1131;
	public static RSString aClass59_1132;
	public static int anInt1133;
	public static Class26 aClass26_1134;
	public static int anInt1135;
	public static int anInt1136;
	public static int anInt1137;
	public Class12 aClass12_1138;
	public int anInt1139 = 0;

	public static boolean method791(boolean arg0) {
		try {
			anInt1119++;
			synchronized (Class35.aClass49_837) {
				if (Class13.anInt351 == Class57.anInt1340)
					return false;
				Class23.anInt502 = Class19.anIntArray447[Class57.anInt1340];
				Class12_Sub12.anInt1847 = Class49.anIntArray1168[Class57.anInt1340];
				if (arg0 != true)
					return true;
				Class57.anInt1340 = 0x7f & 1 + Class57.anInt1340;
				return true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qa.H(" + arg0 + ')');
		}
	}

	public static void method792(boolean arg0) {
		try {
			Class47.anInt1103 = -1;
			Class29.anInt705 = -1;
			anInt1136++;
			Class13.anInt338 = 0;
			Class57.anInt1334 = -1;
			Class5.anInt159 = 0;
			Game.outBuffer.position = 0;
			Class51.aBoolean1202 = arg0;
			Game.inBuffer.position = 0;
			Class12_Sub12_Sub4.anInt2230 = 0;
			Class28.anInt678 = -1;
			Class12_Sub1.anInt1617 = 0;
			Class23.anInt499 = 0;
			Class1.anInt77 = 0;
			Class29.method686((byte) 67, 30);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qa.D(" + arg0 + ')');
		}
	}

	public Class12 method793(int arg0) {
		try {
			if (arg0 != -16430)
				aClass59_1121 = null;
			anInt1137++;
			if (aClass12_1130 == null)
				return null;
			for (Class12 class12 = aClass12Array1131[(int) (aLong1123 & (long) (-1 + anInt1128))]; aClass12_1130 != class12; aClass12_1130 = aClass12_1130.aClass12_321) {
				if (aClass12_1130.aLong319 == aLong1123) {
					Class12 class12_0_ = aClass12_1130;
					aClass12_1130 = aClass12_1130.aClass12_321;
					return class12_0_;
				}
			}
			aClass12_1130 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qa.I(" + arg0 + ')');
		}
	}

	public Class12 method794(boolean arg0) {
		try {
			if (arg0 != true)
				aClass59_1132 = null;
			anInt1122++;
			if (anInt1139 > 0
					&& aClass12Array1131[anInt1139 - 1] != aClass12_1138) {
				Class12 class12 = aClass12_1138;
				aClass12_1138 = class12.aClass12_321;
				return class12;
			}
			while ((anInt1128 ^ 0xffffffff) < (anInt1139 ^ 0xffffffff)) {
				Class12 class12 = aClass12Array1131[anInt1139++].aClass12_321;
				if (class12 != aClass12Array1131[-1 + anInt1139]) {
					aClass12_1138 = class12.aClass12_321;
					return class12;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qa.A(" + arg0 + ')');
		}
	}

	public Class12 method795(long arg0, int arg1) {
		try {
			anInt1115++;
			int i = -87 % ((-66 - arg1) / 51);
			aLong1123 = arg0;
			Class12 class12 = aClass12Array1131[(int) ((long) (anInt1128 + -1) & arg0)];
			for (aClass12_1130 = class12.aClass12_321; class12 != aClass12_1130; aClass12_1130 = aClass12_1130.aClass12_321) {
				if (aClass12_1130.aLong319 == arg0) {
					Class12 class12_1_ = aClass12_1130;
					aClass12_1130 = aClass12_1130.aClass12_321;
					return class12_1_;
				}
			}
			aClass12_1130 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qa.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Class12 method796(byte arg0) {
		try {
			anInt1135++;
			int i = -29 / ((-65 - arg0) / 37);
			anInt1139 = 0;
			return method794(true);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qa.F(" + arg0 + ')');
		}
	}

	public void method797(byte arg0, Class12 arg1, long arg2) {
		try {
			if (arg1.aClass12_317 != null)
				arg1.method143((byte) 39);
			Class12 class12 = aClass12Array1131[(int) (arg2 & (long) (anInt1128 - 1))];
			anInt1114++;
			if (arg0 > -10)
				method792(false);
			arg1.aClass12_317 = class12.aClass12_317;
			arg1.aLong319 = arg2;
			arg1.aClass12_321 = class12;
			arg1.aClass12_317.aClass12_321 = arg1;
			arg1.aClass12_321.aClass12_317 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("qa.C(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public Class48(int arg0) {
		try {
			aClass12Array1131 = new Class12[arg0];
			anInt1128 = arg0;
			for (int i = 0; arg0 > i; i++) {
				Class12 class12 = aClass12Array1131[i] = new Class12();
				class12.aClass12_321 = class12;
				class12.aClass12_317 = class12;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35
					.method724(runtimeexception, "qa.<init>(" + arg0 + ')');
		}
	}

	public static void method798(byte arg0) {
		try {
			aClass59_1126 = null;
			aClass24_1124 = null;
			aClass27_1129 = null;
			anIntArray1125 = null;
			aClass59Array1118 = null;
			if (arg0 >= -2)
				method791(true);
			aClass26_1134 = null;
			aClass59_1132 = null;
			aClass59_1121 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qa.G(" + arg0 + ')');
		}
	}

	public static void method799(int arg0, boolean arg1) {
		anInt1117++;
		Class12_Sub12_Sub11_Sub3.anInt2753++;
		if (Class12_Sub12_Sub11_Sub3.anInt2753 >= 50 || arg1) {
			Class12_Sub12_Sub11_Sub3.anInt2753 = 0;
			if (!Class38.aBoolean912
					&& Game.gameServerSocket != null) {
				Class47.anInt1100++;
				Game.outBuffer.writePacket(139);
				try {
					Game.gameServerSocket.method622(
							Game.outBuffer.payload,
							Game.outBuffer.position, 0, true);
					Game.outBuffer.position = 0;
				} catch (java.io.IOException ioexception) {
					Class38.aBoolean912 = true;
				}
			}
			if (arg0 >= -37)
				aClass27_1129 = null;
		}
	}

	static {
		aClass59Array1118 = new RSString[100];
		aClass59_1126 = aClass59_1121;
		aClass59_1132 = Class55.method898(": ", -10983);
		anInt1127 = 0;
		aClass27_1129 = new Class27(64);
	}
}
