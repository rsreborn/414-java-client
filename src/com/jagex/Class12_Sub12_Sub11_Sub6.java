package com.jagex;/* com.jagex.Class12_Sub12_Sub11_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class12_Sub12_Sub11_Sub6 extends Class12_Sub12_Sub11 {
	public static int anInt2883;
	public int anInt2885;
	public static int[] anIntArray2886;
	public int anInt2887;
	public static int anInt2888;
	public int anInt2889;
	public static int anInt2890;
	public static int anInt2891;
	public static int anInt2892;
	public int anInt2893;
	public static Class62 aClass62_2894;
	public static RSString aClass59_2895 = Class55.method898("Connection lost",
			-10983);
	public Class12_Sub12_Sub4 aClass12_Sub12_Sub4_2896;
	public int anInt2897;
	public static boolean aBoolean2898 = false;
	public int anInt2899;
	public static int anInt2900;
	public static int anInt2901;
	public static int anInt2902;
	public static int anInt2903 = 0;
	public static int anInt2905;
	public static int anInt2906;
	public int anInt2907;
	public int anInt2908;
	public static RSString aClass59_2909 = aClass59_2895;
	public static RSString[] aClass59Array2910 = new RSString[200];
	public int anInt2911;

	public static void method509(int arg0) {
		try {
			Cache.midiSongsArchive = null;
			aClass59_2895 = null;
			aClass62_2894 = null;
			aClass59Array2910 = null;
			if (arg0 >= -58)
				method510(true);
			Cache.binaryArchive = null;
			aClass59_2909 = null;
			anIntArray2886 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wc.B(" + arg0 + ')');
		}
	}

	public static void method510(boolean arg0) {
		anInt2900++;
		int i = 64 + 128 * anInt2883;
		int i_0_ = 128 * Class13.anInt353 + 64;
		int i_1_ = (Class26.method658(i, -6, RSString.anInt1504, i_0_) + -RSCanvas.anInt60);
		if ((Class10.anInt250 ^ 0xffffffff) > (i ^ 0xffffffff)) {
			Class10.anInt250 += (Class12_Sub12_Sub11_Sub1.anInt2661 + (-Class10.anInt250 + i)
					* Class35.anInt849 / 1000);
			if (Class10.anInt250 > i)
				Class10.anInt250 = i;
		}
		if ((i_0_ ^ 0xffffffff) < (Class20.anInt464 ^ 0xffffffff)) {
			Class20.anInt464 += (Class12_Sub12_Sub11_Sub1.anInt2661 + (i_0_ + -Class20.anInt464)
					* Class35.anInt849 / 1000);
			if (Class20.anInt464 > i_0_)
				Class20.anInt464 = i_0_;
		}
		if (i_1_ > Class57.anInt1339) {
			Class57.anInt1339 += (Class12_Sub12_Sub11_Sub1.anInt2661 + Class35.anInt849
					* (-Class57.anInt1339 + i_1_) / 1000);
			if ((i_1_ ^ 0xffffffff) > (Class57.anInt1339 ^ 0xffffffff))
				Class57.anInt1339 = i_1_;
		}
		if (i_1_ < Class57.anInt1339) {
			Class57.anInt1339 -= (Class12_Sub12_Sub11_Sub1.anInt2661 + Class35.anInt849
					* (-i_1_ + Class57.anInt1339) / 1000);
			if (Class57.anInt1339 < i_1_)
				Class57.anInt1339 = i_1_;
		}
		if ((Class20.anInt464 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)) {
			Class20.anInt464 -= (Class12_Sub12_Sub11_Sub1.anInt2661 - -((-i_0_ + Class20.anInt464)
					* Class35.anInt849 / 1000));
			if ((Class20.anInt464 ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
				Class20.anInt464 = i_0_;
		}
		if ((i ^ 0xffffffff) > (Class10.anInt250 ^ 0xffffffff)) {
			Class10.anInt250 -= (Class35.anInt849 * (-i + Class10.anInt250)
					/ 1000 + Class12_Sub12_Sub11_Sub1.anInt2661);
			if (Class10.anInt250 < i)
				Class10.anInt250 = i;
		}
		i = Class42.anInt989 * 128 - -64;
		i_0_ = Class29.anInt695 * 128 + 64;
		i_1_ = (Class26.method658(i, -6, RSString.anInt1504, i_0_) + -Class12_Sub12_Sub12.anInt2400);
		int i_2_ = i - Class10.anInt250;
		int i_3_ = i_0_ - Class20.anInt464;
		int i_4_ = -Class57.anInt1339 + i_1_;
		int i_5_ = (int) Math.sqrt((double) (i_2_ * i_2_ + i_3_ * i_3_));
		int i_6_ = ((int) (Math.atan2((double) i_4_, (double) i_5_) * 325.949) & 0x7ff);
		if (i_6_ < 128)
			i_6_ = 128;
		if ((i_6_ ^ 0xffffffff) < -384)
			i_6_ = 383;
		int i_7_ = ((int) (-325.949 * Math.atan2((double) i_2_, (double) i_3_)) & 0x7ff);
		int i_8_ = i_7_ + -Class27.anInt645;
		if (Statics.anInt2021 < i_6_) {
			Statics.anInt2021 += ((Class64_Sub1.anInt1952
					* (-Statics.anInt2021 + i_6_) / 1000) + Class51.anInt1188);
			if (Statics.anInt2021 > i_6_)
				Statics.anInt2021 = i_6_;
		}
		if (Statics.anInt2021 > i_6_) {
			Statics.anInt2021 -= (Class51.anInt1188 - -(Class64_Sub1.anInt1952
					* (Statics.anInt2021 - i_6_) / 1000));
			if (Statics.anInt2021 < i_6_)
				Statics.anInt2021 = i_6_;
		}
		if (i_8_ > 1024)
			i_8_ -= 2048;
		if (i_8_ < -1024)
			i_8_ += 2048;
		if (i_8_ > 0) {
			Class27.anInt645 += Class64_Sub1.anInt1952 * i_8_ / 1000
					+ Class51.anInt1188;
			Class27.anInt645 &= 0x7ff;
		}
		if (i_8_ < 0) {
			Class27.anInt645 -= Class51.anInt1188
					- -(Class64_Sub1.anInt1952 * -i_8_ / 1000);
			Class27.anInt645 &= 0x7ff;
		}
		int i_9_ = i_7_ + -Class27.anInt645;
		if (i_9_ > 1024)
			i_9_ -= 2048;
		if ((i_9_ ^ 0xffffffff) > 1023)
			i_9_ += 2048;
		if ((i_9_ ^ 0xffffffff) > -1 && i_8_ > 0 || (i_9_ ^ 0xffffffff) < -1
				&& i_8_ < 0)
			Class27.anInt645 = i_7_;
		if (arg0 != true)
			anIntArray2886 = null;
	}

	public static void method511(int arg0, int arg1, int arg2, byte[] arg3,
			int arg4, boolean arg5, int arg6, Class10[] arg7, int arg8,
			Class52 arg9, int arg10) {
		try {
			anInt2888++;
			int i = -1;
			if (arg5 != true)
				method514(-118, 27);
			Buffer class12_sub11 = new Buffer(arg3);
			for (;;) {
				int i_10_ = class12_sub11.method231(false);
				if ((i_10_ ^ 0xffffffff) == -1)
					break;
				i += i_10_;
				int i_11_ = 0;
				for (;;) {
					int i_12_ = class12_sub11.method231(false);
					if (i_12_ == 0)
						break;
					i_11_ += -1 + i_12_;
					int i_13_ = 0x3f & i_11_;
					int i_14_ = (i_11_ & 0xfc0) >> -317780698;
					int i_15_ = i_11_ >> -871530292;
					int i_16_ = class12_sub11.readSignedByte(true);
					int i_17_ = i_16_ >> -1104831966;
					int i_18_ = 0x3 & i_16_;
					if ((i_15_ ^ 0xffffffff) == (arg0 ^ 0xffffffff)
							&& (arg8 ^ 0xffffffff) >= (i_14_ ^ 0xffffffff)
							&& arg8 + 8 > i_14_
							&& (arg1 ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)
							&& i_13_ < arg1 - -8) {
						Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
								.method39(6, i);
						int i_19_ = arg10
								- -(Class12_Sub12_Sub4.method310(
										class12_sub12_sub9.anInt2318,
										0x7 & i_13_, -3, arg4, i_18_,
										class12_sub12_sub9.anInt2334,
										i_14_ & 0x7));
						int i_20_ = (Class64_Sub1.method989(45, arg4,
								0x7 & i_13_, i_18_, 0x7 & i_14_,
								(class12_sub12_sub9.anInt2334),
								(class12_sub12_sub9.anInt2318)) + arg6);
						if ((i_19_ ^ 0xffffffff) < -1 && i_20_ > 0
								&& i_19_ < 103 && (i_20_ ^ 0xffffffff) > -104) {
							int i_21_ = arg2;
							Class10 class10 = null;
							if ((0x2 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][i_19_][i_20_]) ^ 0xffffffff) == -3)
								i_21_--;
							if ((i_21_ ^ 0xffffffff) <= -1)
								class10 = arg7[i_21_];
							RuntimeException_Sub1.method1005(i_19_, 16057,
									class10, (0x3 & i_18_ - -arg4), i, arg2,
									arg9, i_17_, i_20_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wc.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ','
					+ (arg7 != null ? "{...}" : "null") + ',' + arg8 + ','
					+ (arg9 != null ? "{...}" : "null") + ',' + arg10 + ')'));
		}
	}

	public static void method512(int arg0, boolean arg1, Archive arg2,
			int arg3, byte arg4, int arg5, int arg6) {
		try {
			anInt2891++;
			long l = (long) ((arg5 << arg0) + arg6);
			Class12_Sub12_Sub8 class12_sub12_sub8 = ((Class12_Sub12_Sub8) Class12_Sub1.aClass48_1612
					.method795(l, -9));
			if (class12_sub12_sub8 == null) {
				class12_sub12_sub8 = ((Class12_Sub12_Sub8) Class12_Sub12_Sub8.aClass48_2288
						.method795(l, -119));
				if (class12_sub12_sub8 == null) {
					class12_sub12_sub8 = ((Class12_Sub12_Sub8) RSCanvas.aClass48_45
							.method795(l, -127));
					if (class12_sub12_sub8 != null) {
						if (arg1) {
							class12_sub12_sub8.method268(true);
							Class12_Sub1.aClass48_1612.method797((byte) -70,
									class12_sub12_sub8, l);
							Game.anInt1562--;
							Class12_Sub12_Sub14.anInt2464++;
						}
					} else {
						if (!arg1) {
							class12_sub12_sub8 = ((Class12_Sub12_Sub8) Archive.aClass48_1887
									.method795(l, 54));
							if (class12_sub12_sub8 != null)
								return;
						}
						class12_sub12_sub8 = new Class12_Sub12_Sub8();
						class12_sub12_sub8.anInt2293 = arg3;
						class12_sub12_sub8.aClass26_Sub1_2284 = arg2;
						class12_sub12_sub8.aByte2287 = arg4;
						if (!arg1) {
							Class12_Sub12_Sub11_Sub5.aClass38_2857.method742(3,
									class12_sub12_sub8);
							RSCanvas.aClass48_45.method797((byte) -64,
									class12_sub12_sub8, l);
							Game.anInt1562++;
						} else {
							Class12_Sub1.aClass48_1612.method797((byte) -62,
									class12_sub12_sub8, l);
							Class12_Sub12_Sub14.anInt2464++;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wc.F(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public static boolean method513(byte[] arg0, byte arg1, int arg2, int arg3) {
		try {
			anInt2906++;
			int i = -38 / ((arg1 - 10) / 41);
			boolean bool = true;
			int i_22_ = -1;
			Buffer class12_sub11 = new Buffer(arg0);
			for (;;) {
				int i_23_ = class12_sub11.method231(false);
				if (i_23_ == 0)
					break;
				int i_24_ = 0;
				i_22_ += i_23_;
				boolean bool_25_ = false;
				for (;;) {
					if (!bool_25_) {
						int i_26_ = class12_sub11.method231(false);
						if ((i_26_ ^ 0xffffffff) == -1)
							break;
						i_24_ += -1 + i_26_;
						int i_27_ = 0x3f & i_24_;
						int i_28_ = class12_sub11.readSignedByte(true) >> 581957570;
						int i_29_ = (i_24_ & 0xfcb) >> 1904997382;
						int i_30_ = arg3 + i_29_;
						int i_31_ = i_27_ + arg2;
						if (i_30_ > 0 && (i_31_ ^ 0xffffffff) < -1
								&& (i_30_ ^ 0xffffffff) > -104 && i_31_ < 103) {
							Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
									.method39(6, i_22_);
							if (i_28_ != 22 || !Class21.aBoolean483
									|| class12_sub12_sub9.anInt2320 != 0
									|| class12_sub12_sub9.aBoolean2336) {
								bool_25_ = true;
								if (!class12_sub12_sub9.method426((byte) -73)) {
									Class36.anInt883++;
									bool = false;
								}
							}
						}
					} else {
						int i_32_ = class12_sub11.method231(false);
						if (i_32_ == 0)
							break;
						class12_sub11.readSignedByte(true);
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wc.G("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public static boolean method514(int arg0, int arg1) {
		try {
			anInt2890++;
			if (arg0 != -1104831966)
				method510(true);
			if (arg1 < 48 || arg1 > 57)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wc.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method436(int arg0) {
		try {
			if (aClass12_Sub12_Sub4_2896 != null) {
				int i = -anInt2887 + Class64_Sub2.anInt1968;
				if ((i ^ 0xffffffff) < -101
						&& aClass12_Sub12_Sub4_2896.anInt2200 > 0)
					i = 100;
				while ((aClass12_Sub12_Sub4_2896.anIntArray2215[anInt2889] ^ 0xffffffff) > (i ^ 0xffffffff)) {
					i -= aClass12_Sub12_Sub4_2896.anIntArray2215[anInt2889];
					anInt2889++;
					if ((anInt2889 ^ 0xffffffff) <= (aClass12_Sub12_Sub4_2896.anIntArray2207.length ^ 0xffffffff)) {
						anInt2889 -= aClass12_Sub12_Sub4_2896.anInt2200;
						if ((anInt2889 ^ 0xffffffff) > -1
								|| ((anInt2889 ^ 0xffffffff) <= ((aClass12_Sub12_Sub4_2896.anIntArray2207).length ^ 0xffffffff))) {
							aClass12_Sub12_Sub4_2896 = null;
							break;
						}
					}
				}
				anInt2887 = -i + Class64_Sub2.anInt1968;
			}
			anInt2892++;
			Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas.method39(6,
					anInt2893);
			if (class12_sub12_sub9.anIntArray2310 != null)
				class12_sub12_sub9 = class12_sub12_sub9.method413(false);
			if (class12_sub12_sub9 == null)
				return null;
			if (arg0 <= 60)
				anInt2889 = 53;
			return class12_sub12_sub9.method418(anInt2885, anInt2897,
					anInt2899, aClass12_Sub12_Sub4_2896, anInt2911, 122,
					anInt2889, anInt2908, anInt2907);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wc.P(" + arg0 + ')');
		}
	}

	public static void method515(boolean arg0) {
		try {
			Game.inBuffer.initBitAccess();
			anInt2902++;
			int i = Game.inBuffer.readBits(8);
			if (Class62_Sub2.anInt1916 > i) {
				for (int i_33_ = i; ((Class62_Sub2.anInt1916 ^ 0xffffffff) < (i_33_ ^ 0xffffffff)); i_33_++)
					Statics.anIntArray1833[Class11.anInt287++] = Class1.anIntArray76[i_33_];
			}
			if (Class62_Sub2.anInt1916 < i)
				throw new RuntimeException("gnpov1");
			if (arg0 != false)
				aBoolean2898 = false;
			Class62_Sub2.anInt1916 = 0;
			for (int i_34_ = 0; i > i_34_; i_34_++) {
				int i_35_ = Class1.anIntArray76[i_34_];
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_35_];
				int i_36_ = Game.inBuffer.readBits(1);
				if (i_36_ == 0) {
					Class1.anIntArray76[Class62_Sub2.anInt1916++] = i_35_;
					class12_sub12_sub11_sub2_sub1.anInt2663 = Class64_Sub2.anInt1968;
				} else {
					int i_37_ = Game.inBuffer.readBits(2
					);
					if ((i_37_ ^ 0xffffffff) == -1) {
						Class1.anIntArray76[Class62_Sub2.anInt1916++] = i_35_;
						class12_sub12_sub11_sub2_sub1.anInt2663 = Class64_Sub2.anInt1968;
						Class10.anIntArray220[Class47.anInt1094++] = i_35_;
					} else if ((i_37_ ^ 0xffffffff) == -2) {
						Class1.anIntArray76[Class62_Sub2.anInt1916++] = i_35_;
						class12_sub12_sub11_sub2_sub1.anInt2663 = Class64_Sub2.anInt1968;
						int i_38_ = Game.inBuffer.readBits(
								3);
						class12_sub12_sub11_sub2_sub1.method445(i_38_, 64,
								false);
						int i_39_ = Game.inBuffer.readBits(
								1);
						if (i_39_ == 1)
							Class10.anIntArray220[Class47.anInt1094++] = i_35_;
					} else if (i_37_ == 2) {
						Class1.anIntArray76[Class62_Sub2.anInt1916++] = i_35_;
						class12_sub12_sub11_sub2_sub1.anInt2663 = Class64_Sub2.anInt1968;
						int i_40_ = Game.inBuffer.readBits(
								3);
						class12_sub12_sub11_sub2_sub1
								.method445(i_40_, 64, true);
						int i_41_ = Game.inBuffer.readBits(
								3);
						class12_sub12_sub11_sub2_sub1
								.method445(i_41_, 64, true);
						int i_42_ = Game.inBuffer.readBits(
								1);
						if ((i_42_ ^ 0xffffffff) == -2)
							Class10.anIntArray220[Class47.anInt1094++] = i_35_;
					} else if ((i_37_ ^ 0xffffffff) == -4)
						Statics.anIntArray1833[Class11.anInt287++] = i_35_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wc.A(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub6(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		anInt2908 = arg6;
		anInt2885 = arg3;
		anInt2893 = arg0;
		anInt2907 = arg4;
		anInt2911 = arg1;
		anInt2899 = arg2;
		anInt2897 = arg5;
		if (arg7 != -1) {
			aClass12_Sub12_Sub4_2896 = Class5.method74(9, arg7);
			anInt2887 = Class64_Sub2.anInt1968 - 1;
			anInt2889 = 0;
			if (arg8 && aClass12_Sub12_Sub4_2896.anInt2200 != -1) {
				anInt2889 = (int) ((double) (aClass12_Sub12_Sub4_2896.anIntArray2207).length * Math
						.random());
				anInt2887 -= (int) (Math.random() * (double) (aClass12_Sub12_Sub4_2896.anIntArray2215[anInt2889]));
			}
		}
	}
}
