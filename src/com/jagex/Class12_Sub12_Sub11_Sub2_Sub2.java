package com.jagex;/* com.jagex.Class12_Sub12_Sub11_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.io.Buffer;

import java.util.zip.CRC32;

public class Class12_Sub12_Sub11_Sub2_Sub2 extends Class12_Sub12_Sub11_Sub2 {
	public int anInt2940;
	public int anInt2941 = -1;
	public int anInt2942;
	public int anInt2943;
	public static int anInt2944;
	public int anInt2945;
	public int anInt2946;
	public int anInt2947 = 0;
	public static int anInt2948;
	public static int anInt2949;
	public int anInt2950;
	public RSString aClass59_2951;
	public int anInt2952;
	public static int anInt2953;
	public Class42 aClass42_2954;
	public int anInt2955;
	public static int anInt2956;
	public int anInt2957;
	public int anInt2958;
	public int anInt2959;
	public boolean aBoolean2960;
	public static Class27 aClass27_2961 = new Class27(30);
	public int anInt2962;
	public Class12_Sub12_Sub11_Sub4 aClass12_Sub12_Sub11_Sub4_2963;
	public int anInt2964;
	public static int anInt2965;
	public static CRC32 aCRC32_2966 = new CRC32();
	public static RSString aClass59_2967;
	public static RSString aClass59_2968;
	public static RSString aClass59_2969;
	public static RSString aClass59_2970;
	public static RSString aClass59_2971;
	public static RSString aClass59_2972;
	public static int anInt2973 = 0;
	public static RSString aClass59_2974;
	public static RSString aClass59_2975;
	public static int anInt2976;
	public static RSString aClass59_2977;

	public static boolean method461(int arg0, int arg1, int arg2, int arg3) {
		try {
			int i = Class12_Sub12_Sub8.aClass52_2295.method844(
					RSString.anInt1504, arg3, arg0, arg1);
			anInt2948++;
			if (arg2 > -54)
				return true;
			int i_0_ = (arg1 & 0x1fffe08a) >> -279894450;
			if ((i ^ 0xffffffff) == 0)
				return false;
			int i_1_ = i & 0x1f;
			int i_2_ = i >> 945255014 & 0x3;
			if (i_1_ == 10 || i_1_ == 11 || i_1_ == 22) {
				Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas.method39(6,
						i_0_);
				int i_3_;
				int i_4_;
				if ((i_2_ ^ 0xffffffff) == -1 || (i_2_ ^ 0xffffffff) == -3) {
					i_4_ = class12_sub12_sub9.anInt2318;
					i_3_ = class12_sub12_sub9.anInt2334;
				} else {
					i_3_ = class12_sub12_sub9.anInt2318;
					i_4_ = class12_sub12_sub9.anInt2334;
				}
				int i_5_ = class12_sub12_sub9.anInt2340;
				if ((i_2_ ^ 0xffffffff) != -1)
					i_5_ = (i_5_ >> 4 - i_2_) + (0xf & i_5_ << i_2_);
				Class64_Sub2
						.method997(
								true,
								arg0,
								25,
								i_3_,
								i_5_,
								2,
								0,
								i_4_,
								arg3,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								0,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
			} else
				Class64_Sub2
						.method997(
								true,
								arg0,
								25,
								0,
								0,
								2,
								i_2_,
								0,
								arg3,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								i_1_ + 1,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
			Class33.anInt823 = Class10.anInt226;
			Archive.anInt1903 = 2;
			Class49.anInt1149 = Class42.anInt1000;
			Class12_Sub12_Sub4.anInt2228 = 0;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("me.L(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method436(int arg0) {
		try {
			anInt2965++;
			if (aClass42_2954 == null)
				return null;
			Class12_Sub12_Sub4 class12_sub12_sub4 = ((anInt2734 ^ 0xffffffff) == 0
					|| anInt2719 != 0 ? null : Class5.method74(9, anInt2734));
			Class12_Sub12_Sub4 class12_sub12_sub4_6_ = (((anInt2718 ^ 0xffffffff) != 0
					&& !aBoolean2960 && ((anInt2681 ^ 0xffffffff) != (anInt2718 ^ 0xffffffff) || class12_sub12_sub4 == null)) ? Class5
					.method74(9, anInt2718) : null);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = aClass42_2954
					.method761(false, anInt2674, class12_sub12_sub4_6_,
							class12_sub12_sub4, anInt2726);
			if (class12_sub12_sub11_sub4 == null)
				return null;
			if (arg0 <= 60)
				method463(97);
			class12_sub12_sub11_sub4.method499();
			anInt2725 = class12_sub12_sub11_sub4.anInt2394;
			if (!aBoolean2960 && anInt2692 != -1
					&& (anInt2673 ^ 0xffffffff) != 0) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_7_ = Class30
						.method695(anInt2692, -119).method536((byte) 125,
								anInt2673);
				if (class12_sub12_sub11_sub4_7_ != null) {
					class12_sub12_sub11_sub4_7_.method476(0, -anInt2713, 0);
					Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = {
							class12_sub12_sub11_sub4,
							class12_sub12_sub11_sub4_7_ };
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							class12_sub12_sub11_sub4s, 2, true));
				}
			}
			if (!aBoolean2960 && aClass12_Sub12_Sub11_Sub4_2963 != null) {
				if ((anInt2959 ^ 0xffffffff) >= (Class64_Sub2.anInt1968 ^ 0xffffffff))
					aClass12_Sub12_Sub11_Sub4_2963 = null;
				if (anInt2946 <= Class64_Sub2.anInt1968
						&& anInt2959 > Class64_Sub2.anInt1968) {
					Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_8_ = aClass12_Sub12_Sub11_Sub4_2963;
					class12_sub12_sub11_sub4_8_.method476(anInt2952
							+ -anInt2691, anInt2964 + -anInt2943, anInt2945
							- anInt2683);
					Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = {
							class12_sub12_sub11_sub4,
							class12_sub12_sub11_sub4_8_ };
					if ((anInt2666 ^ 0xffffffff) != -513) {
						if (anInt2666 == 1024) {
							class12_sub12_sub11_sub4_8_.method473();
							class12_sub12_sub11_sub4_8_.method473();
						} else if ((anInt2666 ^ 0xffffffff) == -1537)
							class12_sub12_sub11_sub4_8_.method473();
					} else {
						class12_sub12_sub11_sub4_8_.method473();
						class12_sub12_sub11_sub4_8_.method473();
						class12_sub12_sub11_sub4_8_.method473();
					}
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							class12_sub12_sub11_sub4s, 2, true));
					if ((anInt2666 ^ 0xffffffff) != -513) {
						if (anInt2666 != 1024) {
							if ((anInt2666 ^ 0xffffffff) == -1537) {
								class12_sub12_sub11_sub4_8_.method473();
								class12_sub12_sub11_sub4_8_.method473();
								class12_sub12_sub11_sub4_8_.method473();
							}
						} else {
							class12_sub12_sub11_sub4_8_.method473();
							class12_sub12_sub11_sub4_8_.method473();
						}
					} else
						class12_sub12_sub11_sub4_8_.method473();
					class12_sub12_sub11_sub4_8_.method476(-anInt2952
							+ anInt2691, -anInt2964 + anInt2943, anInt2683
							+ -anInt2945);
				}
			}
			class12_sub12_sub11_sub4.aBoolean2799 = true;
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "me.P(" + arg0 + ')');
		}
	}

	public boolean method452(int arg0) {
		try {
			anInt2944++;
			if (arg0 != -251272184)
				anInt2940 = -125;
			if (aClass42_2954 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "me.E(" + arg0 + ')');
		}
	}

	public void method462(Buffer arg0, boolean arg1) {
		try {
			arg0.position = 0;
			anInt2949++;
			int i = arg0.readUByte();
			anInt2957 = arg0.readByte(true);
			int[] is = new int[12];
			int i_9_ = -1;
			anInt2941 = arg0.readByte(!arg1);
			anInt2962 = 0;
			if (arg1 != false)
				method463(-25);
			for (int i_10_ = 0; i_10_ < 12; i_10_++) {
				int i_11_ = arg0.readUByte();
				if (i_11_ == 0)
					is[i_10_] = 0;
				else {
					int i_12_ = arg0.readUByte();
					is[i_10_] = (i_11_ << -1468252792) + i_12_;
					if ((i_10_ ^ 0xffffffff) == -1
							&& (is[0] ^ 0xffffffff) == -65536) {
						i_9_ = arg0.readShort(-1);
						break;
					}
					if (is[i_10_] >= 512) {
						int i_13_ = (Class12_Sub12_Sub11_Sub5.method502(
								(byte) 121, is[i_10_] - 512).anInt2520);
						if (i_13_ != 0)
							anInt2962 = i_13_;
					}
				}
			}
			int[] is_14_ = new int[5];
			for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -6; i_15_++) {
				int i_16_ = arg0.readUByte();
				if ((i_16_ ^ 0xffffffff) > -1
						|| (Class12_Sub12_Sub4.anIntArrayArray2206[i_15_].length ^ 0xffffffff) >= (i_16_ ^ 0xffffffff))
					i_16_ = 0;
				is_14_[i_15_] = i_16_;
			}
			anInt2681 = arg0.readShort(-1);
			if (anInt2681 == 65535)
				anInt2681 = -1;
			anInt2679 = arg0.readShort(-1);
			if ((anInt2679 ^ 0xffffffff) == -65536)
				anInt2679 = -1;
			anInt2710 = arg0.readShort(-1);
			if (anInt2710 == 65535)
				anInt2710 = -1;
			anInt2700 = arg0.readShort(-1);
			if (anInt2700 == 65535)
				anInt2700 = -1;
			anInt2662 = arg0.readShort(-1);
			if ((anInt2662 ^ 0xffffffff) == -65536)
				anInt2662 = -1;
			anInt2706 = arg0.readShort(-1);
			if (anInt2706 == 65535)
				anInt2706 = -1;
			anInt2677 = arg0.readShort(-1);
			if ((anInt2677 ^ 0xffffffff) == -65536)
				anInt2677 = -1;
			aClass59_2951 = Class12_Sub12_Sub13.method524(-3,
					arg0.readLong(103)).toString(-14767);
			anInt2955 = arg0.readUByte();
			anInt2947 = arg0.readShort(-1);
			if (aClass42_2954 == null)
				aClass42_2954 = new Class42();
			aClass42_2954.method770(is_14_, i_9_, (i ^ 0xffffffff) == -2,
					13314, is);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "me.J("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static void method463(int arg0) {
		try {
			aClass59_2975 = null;
			if (arg0 != 12)
				method461(-13, 72, -83, 104);
			aClass59_2971 = null;
			aClass59_2967 = null;
			aClass59_2969 = null;
			aClass59_2972 = null;
			aClass59_2968 = null;
			aClass59_2977 = null;
			aClass27_2961 = null;
			aClass59_2970 = null;
			aCRC32_2966 = null;
			aClass59_2974 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "me.K(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub2_Sub2() {
		anInt2946 = 0;
		anInt2955 = 0;
		anInt2957 = -1;
		aBoolean2960 = false;
		anInt2962 = 0;
		anInt2959 = 0;
	}

	static {
		aClass59_2967 = Class55.method898("Loaded textures", -10983);
		aClass59_2969 = Class55.method898(
				"Please try using a different world)3", -10983);
		aClass59_2974 = aClass59_2969;
		aClass59_2968 = aClass59_2967;
		anInt2976 = 0;
		aClass59_2971 = aClass59_2969;
		aClass59_2975 = aClass59_2969;
		aClass59_2977 = aClass59_2969;
		aClass59_2972 = aClass59_2969;
		aClass59_2970 = aClass59_2969;
	}
}
