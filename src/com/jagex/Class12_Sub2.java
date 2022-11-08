package com.jagex;/* com.jagex.Class12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Cache;
import com.jagex.util.Statics;

public class Class12_Sub2 extends Class12 {
	public int anInt1629;
	public static RSString aClass59_1630;
	public static int anInt1631;
	public static RSString aClass59_1632;
	public int anInt1633 = -1;
	public static RSString aClass59_1634 = Class55.method898(
			"Please wait )2 attempting to reestablish", -10983);
	public int anInt1635;
	public static RSString aClass59_1636;
	public static int anInt1637;
	public int anInt1638;
	public static RSString aClass59_1639 = aClass59_1634;
	public int anInt1640 = 0;
	public static boolean aBoolean1641;
	public static int anInt1642;
	public static int[] anIntArray1643;
	public int anInt1644;
	public static int anInt1645;
	public static int[] anIntArray1646;
	public static int anInt1647;
	public static int anInt1648;
	public static int anInt1649;
	public int anInt1650;
	public int anInt1651;
	public int anInt1652;
	public int anInt1653;
	public static int anInt1654;
	public static Class12_Sub12_Sub11_Sub4[] aClass12_Sub12_Sub11_Sub4Array1656;
	public int anInt1657;
	public int anInt1658;
	public static RSString aClass59_1659;
	public static int anInt1660;
	public static int anInt1661;

	public static void method149(int arg0) {
		try {
			anIntArray1643 = null;
			aClass59_1659 = null;
			aClass59_1639 = null;
			aClass59_1636 = null;
			aClass59_1632 = null;
			aClass59_1630 = null;
			aClass59_1634 = null;
			anIntArray1646 = null;
			Cache.texturesArchive = null;
			if (arg0 != -14531)
				method154(10);
			aClass12_Sub12_Sub11_Sub4Array1656 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "e.E(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub2 method150(int arg0) {
		try {
			anInt1631++;
			Class12_Sub12_Sub7_Sub2 class12_sub12_sub7_sub2 = new Class12_Sub12_Sub7_Sub2();
			class12_sub12_sub7_sub2.anInt2585 = Class1.anInt81;
			class12_sub12_sub7_sub2.anInt2582 = anInt1654;
			class12_sub12_sub7_sub2.anInt2586 = Class57.anIntArray1337[arg0];
			class12_sub12_sub7_sub2.anInt2584 = Class32.anIntArray778[0];
			class12_sub12_sub7_sub2.anInt2589 = Class55.anIntArray1313[0];
			class12_sub12_sub7_sub2.anInt2583 = Class44.anIntArray1027[0];
			class12_sub12_sub7_sub2.anIntArray2587 = Class15.anIntArray385;
			class12_sub12_sub7_sub2.aByteArray2588 = Class28.aByteArrayArray669[0];
			Class1.method46((byte) 48);
			return class12_sub12_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "e.B(" + arg0 + ')');
		}
	}

	public static void method151(int arg0, int arg1, int arg2) {
		try {
			long l = (long) (arg0 + (arg1 << 1959624208));
			if (arg2 != 1)
				Cache.texturesArchive = null;
			anInt1645++;
			Class12_Sub12_Sub8 class12_sub12_sub8 = ((Class12_Sub12_Sub8) RSCanvas.aClass48_45
					.method795(l, -128));
			if (class12_sub12_sub8 != null)
				Class12_Sub12_Sub11_Sub5.aClass38_2857.method737(
						class12_sub12_sub8, arg2 + 3);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("e.G(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method152(int arg0, int arg1, int arg2, boolean arg3,
			int arg4) {
		for (int i = arg1; (arg1 - -arg0 ^ 0xffffffff) <= (i ^ 0xffffffff); i++) {
			for (int i_0_ = arg2; arg4 + arg2 >= i_0_; i_0_++) {
				if (i_0_ >= 0 && i_0_ < 104 && (i ^ 0xffffffff) <= -1
						&& i < 104) {
					RSCanvas.aByteArrayArrayArray43[0][i_0_][i] = (byte) 127;
					if ((i_0_ ^ 0xffffffff) == (arg2 ^ 0xffffffff)
							&& (i_0_ ^ 0xffffffff) < -1)
						Statics.anIntArrayArrayArray569[0][i_0_][i] = Statics.anIntArrayArrayArray569[0][i_0_ - 1][i];
					if (arg4 + arg2 == i_0_ && i_0_ < 103)
						Statics.anIntArrayArrayArray569[0][i_0_][i] = Statics.anIntArrayArrayArray569[0][i_0_
								- -1][i];
					if (arg1 == i && (i ^ 0xffffffff) < -1)
						Statics.anIntArrayArrayArray569[0][i_0_][i] = Statics.anIntArrayArrayArray569[0][i_0_][i - 1];
					if (i == arg0 + arg1 && (i ^ 0xffffffff) > -104)
						Statics.anIntArrayArrayArray569[0][i_0_][i] = Statics.anIntArrayArrayArray569[0][i_0_][1 + i];
				}
			}
		}
		anInt1661++;
		if (arg3 != false)
			anInt1647 = 64;
	}

	public static void method153(int arg0) {
		try {
			anInt1649++;
			if (Class5.aClass64_158 != null) {
				if (Class33.anInt825 < arg0) {
					if (Class49.anInt1142 > 0) {
						Class49.anInt1142--;
						if (Class49.anInt1142 == 0) {
							if (Class27.aByteArray655 == null)
								Class5.aClass64_158.method979(256, (byte) 50);
							else {
								Class5.aClass64_158.method979(
										Class12_Sub12_Sub13.anInt2421,
										(byte) 50);
								Class33.anInt825 = Class12_Sub12_Sub13.anInt2421;
								Class5.aClass64_158.method975(
										Class12_Sub12_Sub13.anInt2421,
										Class27.aByteArray655, 0,
										Class33.aBoolean822);
								Class27.aByteArray655 = null;
							}
							Class15.anInt395 = 0;
						}
					}
				} else if ((Class49.anInt1142 ^ 0xffffffff) < -1) {
					Class15.anInt395 += Class12_Sub12_Sub11_Sub2_Sub2.anInt2976;
					Class5.aClass64_158.method978(Class33.anInt825,
							Class15.anInt395, (byte) -94);
					Class49.anInt1142--;
					if ((Class49.anInt1142 ^ 0xffffffff) == -1) {
						Class5.aClass64_158.method981(true);
						Class49.anInt1142 = 20;
						Class33.anInt825 = -1;
					}
				}
				Class5.aClass64_158.method980(arg0 + -122);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "e.F(" + arg0 + ')');
		}
	}

	public static void method154(int arg0) {
		try {
			anInt1648++;
			if ((Class12_Sub12_Sub12.anInt2417 ^ 0xffffffff) == -1) {
				Class12_Sub1.aClass59Array1621[0] = RSCanvas.aClass59_54;
				Class19.anIntArray454[0] = 1002;
				Class13.anInt338 = 1;
				if (Class31.anInt756 != -1) {
					Class56.anInt1316 = -1;
					Class12_Sub12_Sub11_Sub2.anInt2707 = -1;
					Class12_Sub12_Sub11_Sub2.method450(0, 0, Class18.anInt432,
							0, 0, 765, -1, Class31.anInt756, true, 503,
							(Class12_Sub12_Sub3.anInt2176));
					Class63.anInt1418 = Class12_Sub12_Sub11_Sub2.anInt2707;
					Class7.anInt1535 = Class56.anInt1316;
				} else {
					Class11.method133(-64);
					Class56.anInt1316 = -1;
					boolean bool = false;
					Class12_Sub12_Sub11_Sub2.anInt2707 = -1;
					if ((Class18.anInt432 ^ 0xffffffff) < -5
							&& (Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) < -5
							&& (Class18.anInt432 ^ 0xffffffff) > -517
							&& Class12_Sub12_Sub3.anInt2176 < 338) {
						if ((Class13.anInt343 ^ 0xffffffff) != 0)
							Class12_Sub12_Sub11_Sub2.method450(4, 0,
									Class18.anInt432, 0, 4, 516, -1,
									Class13.anInt343, true, 338,
									Class12_Sub12_Sub3.anInt2176);
						else
							Class12_Sub12_Sub3.method301(false);
					}
					Class7.anInt1535 = Class56.anInt1316;
					Class56.anInt1316 = -1;
					Class63.anInt1418 = Class12_Sub12_Sub11_Sub2.anInt2707;
					Class12_Sub12_Sub11_Sub2.anInt2707 = -1;
					if ((Class18.anInt432 ^ 0xffffffff) < -554
							&& (Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) < -206
							&& Class18.anInt432 < 743
							&& ((Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) > -467)) {
						if ((Class35.anInt860 ^ 0xffffffff) == 0) {
							if ((Class62_Sub2.anIntArray1907[Class15.anInt400] ^ 0xffffffff) != 0)
								Class12_Sub12_Sub11_Sub2
										.method450(
												205,
												0,
												Class18.anInt432,
												1,
												553,
												743,
												-1,
												(Class62_Sub2.anIntArray1907[Class15.anInt400]),
												true, 466,
												Class12_Sub12_Sub3.anInt2176);
						} else
							Class12_Sub12_Sub11_Sub2.method450(205, 0,
									Class18.anInt432, 1, 553, 743, -1,
									Class35.anInt860, true, 466,
									Class12_Sub12_Sub3.anInt2176);
					}
					if ((Class62_Sub2.anInt1936 ^ 0xffffffff) != (Class56.anInt1316 ^ 0xffffffff)) {
						Class49.aBoolean1146 = true;
						Class62_Sub2.anInt1936 = Class56.anInt1316;
					}
					Class56.anInt1316 = -1;
					if ((Class12_Sub12_Sub11_Sub2.anInt2707 ^ 0xffffffff) != (Class57.anInt1335 ^ 0xffffffff)) {
						Class49.aBoolean1146 = true;
						Class57.anInt1335 = Class12_Sub12_Sub11_Sub2.anInt2707;
					}
					Class12_Sub12_Sub11_Sub2.anInt2707 = -1;
					if (Class18.anInt432 > 17
							&& (Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) < -358
							&& Class18.anInt432 < 496
							&& ((Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) > -454)) {
						if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == 0) {
							if (Class58.anInt1342 == -1) {
								if (Class12_Sub12_Sub3.anInt2176 < 434
										&& Class18.anInt432 < 426)
									Class63.method970(
											(-357 + (Class12_Sub12_Sub3.anInt2176)),
											-109, -17 + Class18.anInt432);
							} else
								Class12_Sub12_Sub11_Sub2.method450(357, 0,
										Class18.anInt432, 3, 17, 496, -1,
										Class58.anInt1342, true, 453,
										Class12_Sub12_Sub3.anInt2176);
						} else
							Class12_Sub12_Sub11_Sub2.method450(357, 0,
									Class18.anInt432, 2, 17, 496, -1,
									Class12_Sub12_Sub12.anInt2407, true, 453,
									Class12_Sub12_Sub3.anInt2176);
					}
					if (arg0 > 42) {
						if (((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) != 0 || Class58.anInt1342 != -1)
								&& (Class12_Sub12_Sub12.anInt2416 != Class56.anInt1316)) {
							Class12_Sub12_Sub12.anInt2416 = Class56.anInt1316;
							Class8.aBoolean182 = true;
						}
						if ((Class12_Sub12_Sub12.anInt2407 != -1 || Class58.anInt1342 != -1)
								&& (Class12_Sub1.anInt1626 != Class12_Sub12_Sub11_Sub2.anInt2707)) {
							Class12_Sub1.anInt1626 = Class12_Sub12_Sub11_Sub2.anInt2707;
							Class8.aBoolean182 = true;
						}
						while (!bool) {
							bool = true;
							for (int i = 0; i < -1 + Class13.anInt338; i++) {
								if (((Class19.anIntArray454[i] ^ 0xffffffff) > -1001)
										&& Class19.anIntArray454[1 + i] > 1000) {
									bool = false;
									RSString class59 = Class12_Sub1.aClass59Array1621[i];
									Class12_Sub1.aClass59Array1621[i] = (Class12_Sub1.aClass59Array1621[i + 1]);
									Class12_Sub1.aClass59Array1621[i + 1] = class59;
									int i_1_ = Class19.anIntArray454[i];
									Class19.anIntArray454[i] = Class19.anIntArray454[1 + i];
									Class19.anIntArray454[1 + i] = i_1_;
									i_1_ = Class12_Sub12_Sub5.anIntArray2238[i];
									Class12_Sub12_Sub5.anIntArray2238[i] = (Class12_Sub12_Sub5.anIntArray2238[i
											- -1]);
									Class12_Sub12_Sub5.anIntArray2238[1 + i] = i_1_;
									i_1_ = anIntArray1646[i];
									anIntArray1646[i] = anIntArray1646[i - -1];
									anIntArray1646[1 + i] = i_1_;
									i_1_ = Class12_Sub12_Sub4.anIntArray2209[i];
									Class12_Sub12_Sub4.anIntArray2209[i] = (Class12_Sub12_Sub4.anIntArray2209[i
											- -1]);
									Class12_Sub12_Sub4.anIntArray2209[1 + i] = i_1_;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "e.C(" + arg0 + ')');
		}
	}

	public static void method155(int arg0, int arg1) {
		try {
			if (arg1 <= 6)
				aBoolean1641 = false;
			Class30.anInt745 = arg0;
			anInt1637++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "e.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		aClass59_1636 = Class55.method898("(Z", -10983);
		aClass59_1630 = Class55.method898("compass", -10983);
		anIntArray1646 = new int[500];
		aBoolean1641 = false;
		aClass12_Sub12_Sub11_Sub4Array1656 = new Class12_Sub12_Sub11_Sub4[4];
		anInt1660 = 0;
		aClass59_1659 = Class55.method898(
				"To create a new account you need to", -10983);
		aClass59_1632 = aClass59_1659;
	}
}
