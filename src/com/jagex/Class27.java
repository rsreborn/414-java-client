package com.jagex;/* com.jagex.Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

public class Class27 {
	public static int anInt631;
	public static int anInt632;
	public static int anInt633;
	public static int anInt634;
	public static int anInt635 = 0;
	public static int anInt636;
	public static int anInt637;
	public static int anInt638;
	public static RSSocket aClass24_639;
	public static RSString aClass59_640 = Class55.method898("headicons_prayer",
			-10983);
	public static RSString aClass59_641;
	public static volatile boolean aBoolean642 = true;
	public static RSString aClass59_643;
	public static int anInt644;
	public static int anInt645;
	public static RSString aClass59_646 = Class55.method898(
			"Side panel redrawn", -10983);
	public static int anInt647;
	public static RSString aClass59_648;
	public static int anInt649;
	public static int anInt650;
	public static int anInt651;
	public static RSString aClass59_652;
	public static int anInt653;
	public static byte[][][] aByteArrayArrayArray654;
	public static byte[] aByteArray655;
	public static RSString aClass59_656;
	public Class12_Sub12 aClass12_Sub12_657 = new Class12_Sub12();
	public static RSString aClass59_658;
	public static RSString aClass59_659;
	public static RSString aClass59_660;
	public int anInt661;
	public Class38 aClass38_662 = new Class38();
	public int anInt663;
	public Class48 aClass48_664;

	public void method669(int arg0, long arg1) {
		do {
			try {
				anInt637++;
				Class12_Sub12 class12_sub12 = (Class12_Sub12) aClass48_664
						.method795(arg1, -128);
				if (class12_sub12 != null) {
					class12_sub12.method143((byte) 39);
					class12_sub12.method268(true);
					anInt663++;
				}
				if (arg0 <= -2)
					break;
				aClass48_664 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "i.G(" + arg0 + ','
						+ arg1 + ')');
			}
			break;
		} while (false);
	}

	public static boolean method670(Class12_Sub12_Sub3 arg0, int arg1) {
		try {
			anInt649++;
			if (arg0.anIntArray2152 == null)
				return false;
			int i = -126 % ((-16 - arg1) / 62);
			for (int i_0_ = 0; i_0_ < arg0.anIntArray2152.length; i_0_++) {
				int i_1_ = Class4.method71(arg0, 117, i_0_);
				int i_2_ = arg0.anIntArray2118[i_0_];
				if (arg0.anIntArray2152[i_0_] != 2) {
					if (arg0.anIntArray2152[i_0_] == 3) {
						if ((i_2_ ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
							return false;
					} else if (arg0.anIntArray2152[i_0_] == 4) {
						if ((i_1_ ^ 0xffffffff) == (i_2_ ^ 0xffffffff))
							return false;
					} else if ((i_2_ ^ 0xffffffff) != (i_1_ ^ 0xffffffff))
						return false;
				} else if ((i_1_ ^ 0xffffffff) <= (i_2_ ^ 0xffffffff))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("i.I("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method671(boolean arg0, int arg1) {
		try {
			int i = 56 / ((59 - arg1) / 46);
			anInt638++;
			int i_3_ = 0;
			for (/**/; i_3_ < Class62_Sub2.anInt1916; i_3_++) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[Class1.anIntArray76[i_3_]]);
				int i_4_ = 536870912 - -(Class1.anIntArray76[i_3_] << -2041743442);
				if (class12_sub12_sub11_sub2_sub1 != null
						&& class12_sub12_sub11_sub2_sub1.method452(-251272184)
						&& arg0 == (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.aBoolean2079)
						&& class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923
								.method285(-1)) {
					int i_5_ = class12_sub12_sub11_sub2_sub1.anInt2691 >> 911676263;
					int i_6_ = (class12_sub12_sub11_sub2_sub1.anInt2683 >> -885372441);
					if (i_5_ >= 0 && i_5_ < 104 && (i_6_ ^ 0xffffffff) <= -1
							&& (i_6_ ^ 0xffffffff) > -105) {
						if (class12_sub12_sub11_sub2_sub1.anInt2727 == 1
								&& (0x7f & class12_sub12_sub11_sub2_sub1.anInt2691 ^ 0xffffffff) == -65
								&& (class12_sub12_sub11_sub2_sub1.anInt2683 & 0x7f ^ 0xffffffff) == -65) {
							if (RSString.anInt1479 == Class30.anIntArrayArray722[i_5_][i_6_])
								continue;
							Class30.anIntArrayArray722[i_5_][i_6_] = RSString.anInt1479;
						}
						if (!class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.aBoolean2074)
							i_4_ += -2147483648;
						Class12_Sub12_Sub8.aClass52_2295
								.method833(
										RSString.anInt1504,
										class12_sub12_sub11_sub2_sub1.anInt2691,
										class12_sub12_sub11_sub2_sub1.anInt2683,
										(Class26.method658(
												(((class12_sub12_sub11_sub2_sub1.anInt2727 - 1) * 64) + class12_sub12_sub11_sub2_sub1.anInt2691),
												-6,
												RSString.anInt1504,
												(class12_sub12_sub11_sub2_sub1.anInt2683 - -((class12_sub12_sub11_sub2_sub1.anInt2727 - 1) * 64)))),
										((-1 + class12_sub12_sub11_sub2_sub1.anInt2727) * 64)
												- -60,
										class12_sub12_sub11_sub2_sub1,
										class12_sub12_sub11_sub2_sub1.anInt2680,
										i_4_,
										class12_sub12_sub11_sub2_sub1.aBoolean2723);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "i.J(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method672(Class12_Sub12_Sub2 arg0, int arg1, int arg2,
			int arg3, byte arg4) {
		try {
			anInt650++;
			if (Class13.anInt338 < 400) {
				if (arg0.anIntArray2063 != null)
					arg0 = arg0.method287((byte) 2);
				if (arg0 != null && arg0.aBoolean2074) {
					RSString class59 = arg0.aClass59_2091;
					if ((arg0.anInt2088 ^ 0xffffffff) != -1)
						class59 = (Statics
								.method251(
										(byte) -92,
										(new RSString[] {
												class59,
												(Class26.method656(
														0,
														arg0.anInt2088,
														(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2955))),
												Class43.aClass59_1013,
												Class15.aClass59_396,
												Class19.method599(
														arg0.anInt2088, 10),
												Class32.aClass59_794 })));
					if (arg4 != -44)
						aClass59_646 = null;
					if ((Class12_Sub12_Sub11_Sub5.anInt2848 ^ 0xffffffff) == -2) {
						Class64.method977(arg3, arg2, 1, arg1, Statics
								.method251((byte) -126, (new RSString[] {
										RSString.aClass59_1525,
										Class14.aClass59_371,
										Statics.aClass59_565,
										(Class12_Sub12_Sub15.aClass59_2514),
										class59 })), -51);
						Class10.anInt228++;
					} else if (Class12.anInt315 == 1) {
						if ((0x2 & Class55.anInt1289) == 2) {
							Class64.method977(
									arg3,
									arg2,
									50,
									arg1,
									(Statics
											.method251(
													(byte) -96,
													(new RSString[] {
															(Class12_Sub12_Sub9.aClass59_2354),
															(Class12_Sub12_Sub15.aClass59_2514),
															class59 }))), -80);
							Class39.anInt940++;
						}
					} else {
						RSString[] class59s = arg0.aClass59Array2072;
						if (Class12_Sub1.aBoolean1615)
							class59s = method674(105, class59s);
						Class13.anInt344++;
						if (class59s != null) {
							for (int i = 4; i >= 0; i--) {
								if (class59s[i] != null
										&& !class59s[i].method920(
												(Statics.aClass59_550),
												(byte) -110)) {
									Class12_Sub12_Sub12.anInt2412++;
									int i_7_ = 0;
									if ((i ^ 0xffffffff) == -1)
										i_7_ = 45;
									if ((i ^ 0xffffffff) == -2)
										i_7_ = 9;
									if ((i ^ 0xffffffff) == -3)
										i_7_ = 41;
									if (i == 3)
										i_7_ = 39;
									if ((i ^ 0xffffffff) == -5)
										i_7_ = 33;
									Class64.method977(
											arg3,
											arg2,
											i_7_,
											arg1,
											(Statics
													.method251(
															(byte) -90,
															(new RSString[] {
																	class59s[i],
																	(RSApplet.aClass59_22),
																	class59 }))),
											-120);
								}
							}
						}
						if (class59s != null) {
							for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
								if (class59s[i] != null
										&& class59s[i].method920(
												(Statics.aClass59_550),
												(byte) 116)) {
									Class63.anInt1436++;
									int i_8_ = 0;
									int i_9_ = 0;
									if ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2955) < arg0.anInt2088)
										i_8_ = 2000;
									if (i == 0)
										i_9_ = i_8_ + 45;
									if ((i ^ 0xffffffff) == -2)
										i_9_ = 9 + i_8_;
									if ((i ^ 0xffffffff) == -3)
										i_9_ = 41 - -i_8_;
									if ((i ^ 0xffffffff) == -4)
										i_9_ = i_8_ + 39;
									if (i == 4)
										i_9_ = i_8_ + 33;
									Class64.method977(
											arg3,
											arg2,
											i_9_,
											arg1,
											(Statics
													.method251(
															(byte) -50,
															(new RSString[] {
																	class59s[i],
																	(RSApplet.aClass59_22),
																	class59 }))),
											-121);
								}
							}
						}
						Class64.method977(arg3, arg2, 1003, arg1,
								(Statics.method251((byte) -65,
										(new RSString[] { Class32.aClass59_801,
												RSApplet.aClass59_22,
												class59 }))), -59);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("i.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ',' + arg4 + ')'));
		}
	}

	public Class12_Sub12 method673(int arg0, long arg1) {
		try {
			Class12_Sub12 class12_sub12 = (Class12_Sub12) aClass48_664
					.method795(arg1, -119);
			anInt644++;
			if (class12_sub12 != null)
				aClass38_662.method742(3, class12_sub12);
			if (arg0 <= 103)
				return null;
			return class12_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "i.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static RSString[] method674(int arg0, RSString[] arg1) {
		try {
			anInt634++;
			RSString[] class59s = new RSString[5];
			int i = -59 / ((7 - arg0) / 62);
			for (int i_10_ = 0; i_10_ < 5; i_10_++) {
				class59s[i_10_] = Statics.method251((byte) -70,
						(new RSString[] { Class19.method599(i_10_, 10),
								Class48.aClass59_1132 }));
				if (arg1 != null && arg1[i_10_] != null)
					class59s[i_10_] = Statics.method251((byte) -46,
							(new RSString[] { class59s[i_10_], arg1[i_10_] }));
			}
			return class59s;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("i.L(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method675(boolean arg0) {
		anInt647++;
		for (;;) {
			Class12_Sub12 class12_sub12 = aClass38_662.method743(-95);
			if (class12_sub12 == null)
				break;
			class12_sub12.method143((byte) 39);
			class12_sub12.method268(true);
		}
		anInt663 = anInt661;
		if (arg0 != true)
			method679(-26, (byte) 60, null, -89);
	}

	public static Class12_Sub12_Sub10 method676(byte arg0, int arg1) {
		try {
			if (arg0 > -62)
				method677((byte) 16);
			anInt651++;
			Class12_Sub12_Sub10 class12_sub12_sub10 = ((Class12_Sub12_Sub10) Class12_Sub12_Sub16.aClass27_2553
					.method673(124, (long) arg1));
			if (class12_sub12_sub10 != null)
				return class12_sub12_sub10;
			byte[] is = Class12_Sub12.aClass26_1852.method631(14, true, arg1);
			class12_sub12_sub10 = new Class12_Sub12_Sub10();
			if (is != null)
				class12_sub12_sub10.method430(new Buffer(is), false);
			Class12_Sub12_Sub16.aClass27_2553.method678((byte) 123,
					class12_sub12_sub10, (long) arg1);
			return class12_sub12_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "i.F(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method677(byte arg0) {
		if (arg0 <= -43) {
			anInt633++;
			if (Class21.aBoolean483
					&& (RSString.anInt1504 ^ 0xffffffff) != (Class39.anInt932 ^ 0xffffffff))
				Class49.method802(
						RSString.anInt1504,
						0,
						Class29.anInt715,
						(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
						Class51.anInt1178,
						(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
			else if ((RSString.anInt1504 ^ 0xffffffff) != (Class12_Sub1.anInt1607 ^ 0xffffffff)) {
				Class12_Sub1.anInt1607 = RSString.anInt1504;
				Class12_Sub12_Sub1.method281(RSString.anInt1504, 1);
			}
		}
	}

	public void method678(byte arg0, Class12_Sub12 arg1, long arg2) {
		try {
			if ((anInt663 ^ 0xffffffff) != -1)
				anInt663--;
			else {
				Class12_Sub12 class12_sub12 = aClass38_662.method743(-114);
				class12_sub12.method143((byte) 39);
				class12_sub12.method268(true);
				if (class12_sub12 == aClass12_Sub12_657) {
					class12_sub12 = aClass38_662.method743(-85);
					class12_sub12.method143((byte) 39);
					class12_sub12.method268(true);
				}
			}
			aClass48_664.method797((byte) -110, arg1, arg2);
			anInt632++;
			if (arg0 == 123)
				aClass38_662.method742(3, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("i.K(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public static void method679(int arg0, byte arg1,
			Class12_Sub12_Sub7_Sub1 arg2, int arg3) {
		try {
			anInt653++;
			if (arg2 != null && arg1 < -14) {
				int i = Class35.anInt842 + Class48.anInt1127 & 0x7ff;
				int i_11_ = arg0 * arg0 - -(arg3 * arg3);
				if ((i_11_ ^ 0xffffffff) >= -6401) {
					int i_12_ = Class12_Sub12_Sub11_Sub4.anIntArray2831[i];
					i_12_ = i_12_ * 256 / (Class15.anInt384 + 256);
					int i_13_ = Class12_Sub12_Sub11_Sub4.anIntArray2833[i];
					i_13_ = i_13_ * 256 / (256 + Class15.anInt384);
					int i_14_ = arg3 * i_13_ + -(arg0 * i_12_) >> -2121508688;
					int i_15_ = arg0 * i_13_ + arg3 * i_12_ >> -1605946256;
					if (i_11_ > 2500)
						arg2.method353(Class61.aClass12_Sub12_Sub7_Sub2_1365,
								4 + (-(arg2.anInt2575 / 2) + i_15_ + 94),
								(-4 + -(arg2.anInt2577 / 2) + (83 + -i_14_)));
					else
						arg2.method352(98 - (-i_15_ + arg2.anInt2575 / 2), -4
								+ -i_14_ + (83 + -(arg2.anInt2577 / 2)));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("i.D(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ')'));
		}
	}

	public static void method680(int arg0) {
		try {
			aClass59_646 = null;
			aByteArrayArrayArray654 = null;
			aClass59_640 = null;
			aClass59_659 = null;
			aClass59_658 = null;
			aByteArray655 = null;
			aClass59_643 = null;
			if (arg0 == 256) {
				aClass59_652 = null;
				aClass24_639 = null;
				aClass59_641 = null;
				aClass59_660 = null;
				aClass59_656 = null;
				aClass59_648 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "i.B(" + arg0 + ')');
		}
	}

	public Class27(int arg0) {
		try {
			anInt663 = arg0;
			anInt661 = arg0;
			int i;
			for (i = 1; i + i < arg0; i += i) {
				/* empty */
			}
			aClass48_664 = new Class48(i);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "i.<init>(" + arg0 + ')');
		}
	}

	static {
		aClass59_643 = Class55.method898(
				"This computers address has been blocked", -10983);
		aClass59_659 = Class55.method898("Checking for updates )2 ", -10983);
		aClass59_656 = aClass59_643;
		aClass59_658 = Class55.method898("backhmid1", -10983);
		aClass59_652 = Class55.method898("Loaded config", -10983);
		aClass59_641 = aClass59_659;
		aClass59_648 = aClass59_652;
		aClass59_660 = Class55.method898("backleft1", -10983);
	}
}
