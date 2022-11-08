package com.jagex;/* com.jagex.Class12_Sub12_Sub11_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.sign.SignlinkNode;
import com.jagex.util.Statics;

public class Class12_Sub12_Sub11_Sub2_Sub1 extends Class12_Sub12_Sub11_Sub2 {
	public static Class27 aClass27_2912;
	public static int anInt2913;
	public static int anInt2914;
	public static RSString aClass59_2915 = Class55.method898("slide:", -10983);
	public static int anInt2916;
	public static int anInt2917;
	public static int anInt2918;
	public static int anInt2919;
	public static int anInt2920;
	public static int anInt2921;
	public static int anInt2922;
	public Class12_Sub12_Sub2 aClass12_Sub12_Sub2_2923;
	public static int anInt2924;
	public static RSString aClass59_2925 = aClass59_2915;
	public static RSString aClass59_2926;
	public static int anInt2927;
	public static RSString aClass59_2928;
	public static int[] anIntArray2929;
	public static int anInt2930;
	public static int anInt2931;
	public static RSString aClass59_2932;
	public static RSString aClass59_2933;
	public static Class8 aClass8_2934;
	public static RSString aClass59_2935;
	public static RSString aClass59_2936;
	public static Class26 aClass26_2937;
	public static RSString aClass59_2938;
	public static RSString aClass59_2939;

	public static boolean method454(int arg0, boolean arg1) {
		try {
			anInt2930++;
			if (arg0 >= 97 && (arg0 ^ 0xffffffff) >= -123)
				return true;
			if (arg0 >= 65 && arg0 <= 90)
				return true;
			if ((arg0 ^ 0xffffffff) <= -49 && arg0 <= 57)
				return true;
			if (arg1 != true)
				method460(84);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ib.M(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method455(byte arg0) {
		try {
			anInt2917++;
			Class52.aBoolean1212 = false;
			int i = -13 / ((-44 - arg0) / 48);
			Class21.aBoolean483 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ib.Q(" + arg0 + ')');
		}
	}

	public static void method456(byte arg0) {
		Class11.anInt287 = 0;
		anInt2921++;
		Class47.anInt1094 = 0;
		Class12_Sub12_Sub11_Sub6.method515(false);
		Class44.method782(-13354);
		Statics.method626(arg0 ^ ~0x32c3);
		for (int i = 0; (Class11.anInt287 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			int i_0_ = Statics.anIntArray1833[i];
			if (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_0_].anInt2663 != Class64_Sub2.anInt1968) {
				Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_0_].aClass12_Sub12_Sub2_2923 = null;
				Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_0_] = null;
			}
		}
		if ((Class5.anInt159 ^ 0xffffffff) != (Game.inBuffer.position ^ 0xffffffff))
			throw new RuntimeException("gnp1 pos:"
					+ (Game.inBuffer.position) + " psize:"
					+ Class5.anInt159);
		for (int i = 0; Class62_Sub2.anInt1916 > i; i++) {
			if ((Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[Class1.anIntArray76[i]]) == null)
				throw new RuntimeException("gnp2 pos:" + i + " size:"
						+ Class62_Sub2.anInt1916);
		}
		if (arg0 != 75)
			aClass59_2936 = null;
	}

	public boolean method452(int arg0) {
		try {
			anInt2919++;
			if (arg0 != -251272184)
				return false;
			if (aClass12_Sub12_Sub2_2923 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ib.E(" + arg0 + ')');
		}
	}

	public static void method457(byte arg0) {
		try {
			aClass59_2928 = null;
			aClass59_2936 = null;
			aClass59_2933 = null;
			anIntArray2929 = null;
			if (arg0 > 14) {
				aClass26_2937 = null;
				aClass59_2938 = null;
				aClass59_2932 = null;
				aClass59_2915 = null;
				aClass8_2934 = null;
				aClass27_2912 = null;
				aClass59_2939 = null;
				aClass59_2925 = null;
				aClass59_2926 = null;
				aClass59_2935 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ib.O(" + arg0 + ')');
		}
	}

	public static int method458(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt2922++;
			if (arg0 != 21428)
				aClass59_2926 = null;
			int i = -arg2 + 256;
			return (((arg2 * (arg3 & 0xff00ff) + (arg1 & 0xff00ff) * i & ~0xff00ff) - -(0xff0000 & (arg1 & 0xff00)
					* i + arg2 * (arg3 & 0xff00))) >> -1135955448);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ib.K(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method436(int arg0) {
		try {
			anInt2924++;
			if (aClass12_Sub12_Sub2_2923 == null)
				return null;
			Class12_Sub12_Sub4 class12_sub12_sub4 = (anInt2734 != -1
					&& anInt2719 == 0 ? Class5.method74(9, anInt2734) : null);
			Class12_Sub12_Sub4 class12_sub12_sub4_1_ = ((anInt2718 != -1 && ((anInt2681 ^ 0xffffffff) != (anInt2718 ^ 0xffffffff) || class12_sub12_sub4 == null)) ? Class5
					.method74(9, anInt2718) : null);
			if (arg0 < 60)
				return null;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = aClass12_Sub12_Sub2_2923
					.method283(class12_sub12_sub4_1_, anInt2674,
							class12_sub12_sub4, -9500, anInt2726);
			if (class12_sub12_sub11_sub4 == null)
				return null;
			class12_sub12_sub11_sub4.method499();
			anInt2725 = class12_sub12_sub11_sub4.anInt2394;
			if ((anInt2692 ^ 0xffffffff) != 0 && anInt2673 != -1) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_2_ = Class30
						.method695(anInt2692, -117).method536((byte) 119,
								anInt2673);
				if (class12_sub12_sub11_sub4_2_ != null) {
					Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = {
							class12_sub12_sub11_sub4,
							class12_sub12_sub11_sub4_2_ };
					class12_sub12_sub11_sub4_2_.method476(0, -anInt2713, 0);
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							class12_sub12_sub11_sub4s, 2, true));
				}
			}
			if ((aClass12_Sub12_Sub2_2923.anInt2097 ^ 0xffffffff) == -2)
				class12_sub12_sub11_sub4.aBoolean2799 = true;
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ib.P(" + arg0 + ')');
		}
	}

	public static void method459(int arg0, int arg1, Buffer arg2,
			Signlink arg3) {
		try {
			int i = 66 % ((arg0 - -52) / 61);
			anInt2918++;
			if (!Class12_Sub12_Sub5.aBoolean2248) {
				Class12_Sub6 class12_sub6 = new Class12_Sub6();
				class12_sub6.anInt1686 = arg2.readSignedByte(true);
				class12_sub6.anInt1690 = arg2.method207(-708753192);
				class12_sub6.anIntArray1689 = new int[class12_sub6.anInt1686];
				class12_sub6.anIntArray1696 = new int[class12_sub6.anInt1686];
				class12_sub6.aSignlinkNodeArray1703 = new SignlinkNode[class12_sub6.anInt1686];
				class12_sub6.aByteArrayArrayArray1693 = new byte[class12_sub6.anInt1686][][];
				class12_sub6.aSignlinkNodeArray1685 = new SignlinkNode[class12_sub6.anInt1686];
				class12_sub6.anIntArray1698 = new int[class12_sub6.anInt1686];
				for (int i_3_ = 0; ((class12_sub6.anInt1686 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
					try {
						int i_4_ = arg2.readSignedByte(true);
						if ((i_4_ ^ 0xffffffff) != -1 && i_4_ != 1 && i_4_ != 2) {
							if (i_4_ == 3 || (i_4_ ^ 0xffffffff) == -5) {
								String string = new String(arg2
										.method246(20356).method940((byte) -57));
								String string_5_ = new String(arg2.method246(
										20356).method940((byte) 115));
								int i_6_ = arg2.readSignedByte(true);
								String[] strings = new String[i_6_];
								for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_7_++)
									strings[i_7_] = new String(arg2.method246(
											20356).method940((byte) 76));
								byte[][] is = new byte[i_6_][];
								if ((i_4_ ^ 0xffffffff) == -4) {
									for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)); i_8_++) {
										int i_9_ = arg2.method207(-708753192);
										is[i_8_] = new byte[i_9_];
										arg2.method213(14362, i_9_, 0, is[i_8_]);
									}
								}
								class12_sub6.anIntArray1689[i_3_] = i_4_;
								Class[] var_classes = new Class[i_6_];
								for (int i_10_ = 0; ((i_6_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++)
									var_classes[i_10_] = Class7.method87(0,
											strings[i_10_]);
								class12_sub6.aSignlinkNodeArray1685[i_3_] = arg3
										.putNodeType9(var_classes, string_5_,
												Class7.method87(0, string)
										);
								class12_sub6.aByteArrayArrayArray1693[i_3_] = is;
							}
						} else {
							String string = new String(arg2.method246(20356)
									.method940((byte) -105));
							String string_11_ = new String(arg2
									.method246(20356).method940((byte) -79));
							int i_12_ = 0;
							if ((i_4_ ^ 0xffffffff) == -2)
								i_12_ = arg2.method207(-708753192);
							class12_sub6.anIntArray1689[i_3_] = i_4_;
							class12_sub6.anIntArray1698[i_3_] = i_12_;
							class12_sub6.aSignlinkNodeArray1703[i_3_] = arg3
									.putNodeType10(string_11_,
											Class7.method87(0, string));
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class12_sub6.anIntArray1696[i_3_] = -1;
					} catch (SecurityException securityexception) {
						class12_sub6.anIntArray1696[i_3_] = -2;
					} catch (NullPointerException nullpointerexception) {
						class12_sub6.anIntArray1696[i_3_] = -3;
					} catch (Exception exception) {
						class12_sub6.anIntArray1696[i_3_] = -4;
					} catch (Throwable throwable) {
						class12_sub6.anIntArray1696[i_3_] = -5;
					}
				}
				Statics.aClass8_2017.method98(class12_sub6,
						(byte) 79);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ib.N(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method460(int arg0) {
		if (arg0 != 7786)
			method457((byte) -79);
		anInt2913++;
		if (Class1.anInt77 == 0) {
			if (Class12_Sub1.anInt1625 == 1) {
				int i = -5 + (Class42.anInt1000 + -4);
				int i_13_ = -25 + (Class10.anInt226 + -550);
				if (i_13_ >= 0 && (i ^ 0xffffffff) <= -1
						&& (i_13_ ^ 0xffffffff) > -147 && i < 151) {
					i -= 75;
					i_13_ -= 73;
					int i_14_ = Class48.anInt1127 + Class35.anInt842 & 0x7ff;
					int i_15_ = Class12_Sub12_Sub7_Sub3.anIntArray2596[i_14_];
					i_15_ = i_15_ * (Class15.anInt384 - -256) >> -251272184;
					int i_16_ = Class12_Sub12_Sub7_Sub3.anIntArray2602[i_14_];
					i_16_ = (256 + Class15.anInt384) * i_16_ >> 864439112;
					int i_17_ = i_16_ * i - i_15_ * i_13_ >> 926271787;
					int i_18_ = i_15_ * i + i_13_ * i_16_ >> 1399593259;
					int i_19_ = (i_18_
							+ (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) >> 1089039719);
					int i_20_ = ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683)
							+ -i_17_ >> -434771865);
					boolean bool = (Class64_Sub2
							.method997(
									true,
									i_20_,
									25,
									0,
									0,
									1,
									0,
									0,
									i_19_,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
					if (bool) {
						Game.outBuffer.writeByte(i_13_);
						Game.outBuffer.writeByte(i);
						Game.outBuffer.method247((byte) 91,
								Class48.anInt1127);
						Game.outBuffer.writeByte(
								57);
						Game.outBuffer.writeByte(
								Class35.anInt842);
						Game.outBuffer.writeByte(
								Class15.anInt384);
						Game.outBuffer.writeByte(89);
						Game.outBuffer
								.method247(
										(byte) 91,
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691));
						Game.outBuffer
								.method247(
										(byte) 91,
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683));
						Game.outBuffer.writeByte(
								RSCanvas.anInt64);
						Game.outBuffer.writeByte(
								63);
					}
				}
			}
		}
	}

	static {
		aClass27_2912 = new Class27(30);
		anInt2927 = 78;
		aClass59_2928 = Class55.method898("red:", -10983);
		aClass59_2926 = Class55.method898("sideicons", -10983);
		anInt2931 = 0;
		aClass59_2932 = Class55.method898("wave:", -10983);
		aClass59_2933 = aClass59_2928;
		aClass59_2935 = aClass59_2932;
		aClass8_2934 = new Class8();
		aClass59_2938 = Class55.method898("mapfunction", -10983);
		aClass59_2939 = Class55.method898("Password: ", -10983);
		aClass59_2936 = aClass59_2939;
	}
}
