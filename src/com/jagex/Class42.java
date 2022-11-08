package com.jagex;/* com.jagex.Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

public class Class42 {
	public long aLong975;
	public static int anInt976;
	public static int anInt977;
	public static int anInt978;
	public static int anInt979;
	public static int anInt980;
	public static int anInt981;
	public static int anInt982;
	public static RSString aClass59_983;
	public static Class62 aClass62_984;
	public static int[] anIntArray985;
	public static Class62 aClass62_986;
	public static Class27 aClass27_987;
	public static int anInt988;
	public static int anInt989;
	public static RSString aClass59_990 = Class55.method898(
			"Loading textures )2 ", -10983);
	public static int anInt991;
	public static int anInt992;
	public static int anInt993;
	public static int[] anIntArray994 = new int[5];
	public static int anInt995;
	public int[] anIntArray996;
	public int anInt997;
	public static RSString aClass59_998;
	public static int anInt999;
	public static int anInt1000;
	public static int anInt1001;
	public static int anInt1002;
	public boolean aBoolean1003;
	public long aLong1004;
	public int[] anIntArray1005;
	public static int anInt1006;
	public static int anInt1007;
	public static RSString aClass59_1008;

	public void method759(boolean arg0, int arg1, int arg2) {
		try {
			anInt1001++;
			int i = anIntArray1005[arg1];
			if (arg2 == -1) {
				if (!arg0) {
					if (--i < 0)
						i = (Class12_Sub12_Sub4.anIntArrayArray2206[arg1]).length
								+ -1;
				} else if ((++i ^ 0xffffffff) <= ((Class12_Sub12_Sub4.anIntArrayArray2206[arg1]).length ^ 0xffffffff))
					i = 0;
				anIntArray1005[arg1] = i;
				method763(-14408);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nd.C(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method760(int arg0) {
		if (arg0 >= 106) {
			anInt982++;
			if ((Class12_Sub12_Sub12.anInt2417 ^ 0xffffffff) == -1) {
				int i = Class12_Sub1.anInt1625;
				if ((Class12.anInt315 ^ 0xffffffff) == -2
						&& (Class10.anInt226 ^ 0xffffffff) <= -517
						&& (anInt1000 ^ 0xffffffff) <= -161
						&& (Class10.anInt226 ^ 0xffffffff) >= -766
						&& anInt1000 <= 205)
					i = 0;
				if (!Class51.aBoolean1202) {
					if (i == 1 && Class13.anInt338 > 0) {
						int i_0_ = Class19.anIntArray454[Class13.anInt338 + -1];
						if (i_0_ == 3 || (i_0_ ^ 0xffffffff) == -7
								|| (i_0_ ^ 0xffffffff) == -39
								|| (i_0_ ^ 0xffffffff) == -30
								|| (i_0_ ^ 0xffffffff) == -43
								|| (i_0_ ^ 0xffffffff) == -17 || i_0_ == 11
								|| i_0_ == 20 || (i_0_ ^ 0xffffffff) == -19
								|| (i_0_ ^ 0xffffffff) == -37 || i_0_ == 27
								|| (i_0_ ^ 0xffffffff) == -1007) {
							int i_1_ = (Class12_Sub12_Sub5.anIntArray2238[-1
									+ Class13.anInt338]);
							int i_2_ = (Class12_Sub2.anIntArray1646[-1
									+ Class13.anInt338]);
							Class12_Sub12_Sub3 class12_sub12_sub3 = Class62
									.method954(i_2_, 65535);
							if (class12_sub12_sub3.aBoolean2172
									|| class12_sub12_sub3.aBoolean2159) {
								Class12_Sub12_Sub10.anInt2369 = 0;
								Class63.anInt1388 = anInt1000;
								Statics.anInt576 = Class10.anInt226;
								Class12_Sub12_Sub12.anInt2417 = 2;
								Class12_Sub12_Sub8.anInt2285 = i_1_;
								Class62.anInt1381 = i_2_;
								if ((i_2_ >> -1636580976 ^ 0xffffffff) == (Class13.anInt343 ^ 0xffffffff))
									Class12_Sub12_Sub12.anInt2417 = 1;
								Class26.aBoolean585 = false;
								if (Class12_Sub12_Sub12.anInt2407 == i_2_ >> -1581931728)
									Class12_Sub12_Sub12.anInt2417 = 3;
								return;
							}
						}
					}
					if (i == 1
							&& (Class43.anInt1016 == 1 || Class12_Sub12_Sub5
									.method321(-1 + (Class13.anInt338),
											(byte) 54)) && Class13.anInt338 > 2)
						i = 2;
					if ((i ^ 0xffffffff) == -2 && Class13.anInt338 > 0)
						Class36.method728(-1 + Class13.anInt338, (byte) -94);
					if ((i ^ 0xffffffff) == -3 && Class13.anInt338 > 0)
						Class33.method713(-5);
				} else {
					if ((i ^ 0xffffffff) != -2) {
						int i_3_ = Class18.anInt432;
						int i_4_ = Class12_Sub12_Sub3.anInt2176;
						if ((Class9.anInt212 ^ 0xffffffff) == -1) {
							i_4_ -= 4;
							i_3_ -= 4;
						}
						if ((Class9.anInt212 ^ 0xffffffff) == -2) {
							i_3_ -= 553;
							i_4_ -= 205;
						}
						if ((Class9.anInt212 ^ 0xffffffff) == -3) {
							i_4_ -= 357;
							i_3_ -= 17;
						}
						if (i_3_ < Statics.anInt2019 + -10
								|| ((i_3_ ^ 0xffffffff) < (10 + (Class49.anInt1143 + Statics.anInt2019) ^ 0xffffffff))
								|| ((i_4_ ^ 0xffffffff) > (-10
										+ Class12_Sub4.anInt1673 ^ 0xffffffff))
								|| i_4_ > 10 + anInt992
										+ Class12_Sub4.anInt1673) {
							Class51.aBoolean1202 = false;
							if (Class9.anInt212 == 2)
								Class8.aBoolean182 = true;
							if ((Class9.anInt212 ^ 0xffffffff) == -2)
								Class49.aBoolean1146 = true;
						}
					}
					if ((i ^ 0xffffffff) == -2) {
						int i_5_ = Statics.anInt2019;
						int i_6_ = Class12_Sub4.anInt1673;
						int i_7_ = Class49.anInt1143;
						int i_8_ = Class10.anInt226;
						int i_9_ = anInt1000;
						if (Class9.anInt212 == 0) {
							i_8_ -= 4;
							i_9_ -= 4;
						}
						if ((Class9.anInt212 ^ 0xffffffff) == -2) {
							i_8_ -= 553;
							i_9_ -= 205;
						}
						if (Class9.anInt212 == 2) {
							i_9_ -= 357;
							i_8_ -= 17;
						}
						int i_10_ = -1;
						for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (Class13.anInt338 ^ 0xffffffff)); i_11_++) {
							int i_12_ = (31 + i_6_ + (-i_11_ + Class13.anInt338 + -1) * 15);
							if (i_5_ < i_8_
									&& (i_8_ ^ 0xffffffff) > (i_5_ - -i_7_ ^ 0xffffffff)
									&& i_9_ > i_12_ - 13
									&& (i_12_ - -3 ^ 0xffffffff) < (i_9_ ^ 0xffffffff))
								i_10_ = i_11_;
						}
						if ((i_10_ ^ 0xffffffff) != 0)
							Class36.method728(i_10_, (byte) -55);
						Class51.aBoolean1202 = false;
						if ((Class9.anInt212 ^ 0xffffffff) == -3)
							Class8.aBoolean182 = true;
						if (Class9.anInt212 == 1)
							Class49.aBoolean1146 = true;
					}
				}
			}
		}
	}

	public Class12_Sub12_Sub11_Sub4 method761(boolean arg0, int arg1,
			Class12_Sub12_Sub4 arg2, Class12_Sub12_Sub4 arg3, int arg4) {
		try {
			anInt978++;
			if (anInt997 != -1)
				return Class31.method701((byte) 123, anInt997).method283(arg2,
						arg1, arg3, -9500, arg4);
			long l = aLong975;
			int[] is = anIntArray996;
			if (arg3 != null
					&& ((arg3.anInt2187 ^ 0xffffffff) <= -1 || arg3.anInt2218 >= 0)) {
				is = new int[12];
				for (int i = 0; i < 12; i++)
					is[i] = anIntArray996[i];
				if (arg3.anInt2187 >= 0) {
					l += (long) (arg3.anInt2187 - anIntArray996[5] << 1558313000);
					is[5] = arg3.anInt2187;
				}
				if (arg3.anInt2218 >= 0) {
					l += (long) (arg3.anInt2218 - anIntArray996[3] << 1137572208);
					is[3] = arg3.anInt2218;
				}
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class12_Sub12_Sub5.aClass27_2236
					.method673(105, l));
			if (arg0 != false)
				aClass62_984 = null;
			if (class12_sub12_sub11_sub4 == null) {
				boolean bool = false;
				for (int i = 0; i < 12; i++) {
					int i_13_ = is[i];
					if ((i_13_ ^ 0xffffffff) <= -257
							&& (i_13_ ^ 0xffffffff) > -513
							&& !Class63.method968(853, -256 + i_13_).method336(
									(byte) -122))
						bool = true;
					if (i_13_ >= 512
							&& !Class12_Sub12_Sub11_Sub5.method502((byte) 121,
									-512 + i_13_)
									.method548(11105, aBoolean1003))
						bool = true;
				}
				if (bool) {
					if ((aLong1004 ^ 0xffffffffffffffffL) != 0L)
						class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class12_Sub12_Sub5.aClass27_2236
								.method673(104, aLong1004));
					if (class12_sub12_sub11_sub4 == null)
						return null;
				}
				if (class12_sub12_sub11_sub4 == null) {
					Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = new Class12_Sub12_Sub11_Sub4[12];
					int i = 0;
					for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -13; i_14_++) {
						int i_15_ = is[i_14_];
						if (i_15_ >= 256 && i_15_ < 512) {
							Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_16_ = Class63
									.method968(853, -256 + i_15_).method333(
											(byte) 65);
							if (class12_sub12_sub11_sub4_16_ != null)
								class12_sub12_sub11_sub4s[i++] = class12_sub12_sub11_sub4_16_;
						}
						if ((i_15_ ^ 0xffffffff) <= -513) {
							Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_17_ = Class12_Sub12_Sub11_Sub5
									.method502((byte) 121, -512 + i_15_)
									.method552(false, aBoolean1003);
							if (class12_sub12_sub11_sub4_17_ != null)
								class12_sub12_sub11_sub4s[i++] = class12_sub12_sub11_sub4_17_;
						}
					}
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							class12_sub12_sub11_sub4s, i));
					for (int i_18_ = 0; i_18_ < 5; i_18_++) {
						if (anIntArray1005[i_18_] != 0) {
							class12_sub12_sub11_sub4
									.method489(
											(Class12_Sub12_Sub4.anIntArrayArray2206[i_18_][0]),
											(Class12_Sub12_Sub4.anIntArrayArray2206[i_18_][anIntArray1005[i_18_]]));
							if (i_18_ == 1)
								class12_sub12_sub11_sub4
										.method489(
												Class9.anIntArray209[0],
												(Class9.anIntArray209[anIntArray1005[i_18_]]));
						}
					}
					class12_sub12_sub11_sub4.method471();
					class12_sub12_sub11_sub4.method485(64, 850, -30, -50, -30,
							true);
					Class12_Sub12_Sub5.aClass27_2236.method678((byte) 123,
							class12_sub12_sub11_sub4, l);
					aLong1004 = l;
				}
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_19_;
			if (arg3 != null || arg2 != null) {
				if (arg3 != null && arg2 != null)
					class12_sub12_sub11_sub4_19_ = arg3.method309(arg4,
							class12_sub12_sub11_sub4, arg1, 1506013200, arg2);
				else if (arg3 == null)
					class12_sub12_sub11_sub4_19_ = arg2.method305(arg1,
							class12_sub12_sub11_sub4, 16578);
				else
					class12_sub12_sub11_sub4_19_ = arg3.method305(arg4,
							class12_sub12_sub11_sub4, 16578);
			} else
				return class12_sub12_sub11_sub4;
			return class12_sub12_sub11_sub4_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nd.E(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method762(int arg0) {
		try {
			anInt977++;
			if (anInt997 != -1)
				return Class31.method701((byte) -76, anInt997).method291(0);
			boolean bool = false;
			int i = 0;
			if (arg0 != 27)
				method761(false, -42, null, null, -91);
			for (/**/; (i ^ 0xffffffff) > -13; i++) {
				int i_20_ = anIntArray996[i];
				if (i_20_ >= 256 && (i_20_ ^ 0xffffffff) > -513
						&& !Class63.method968(853, -256 + i_20_).method327(0))
					bool = true;
				if ((i_20_ ^ 0xffffffff) <= -513
						&& !Class12_Sub12_Sub11_Sub5.method502((byte) 121,
								i_20_ - 512).method545((byte) -109,
								aBoolean1003))
					bool = true;
			}
			if (bool)
				return null;
			int i_21_ = 0;
			Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = new Class12_Sub12_Sub11_Sub4[12];
			for (int i_22_ = 0; i_22_ < 12; i_22_++) {
				int i_23_ = anIntArray996[i_22_];
				if (i_23_ >= 256 && i_23_ < 512) {
					Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = Class63
							.method968(arg0 + 826, -256 + i_23_)
							.method332(4922);
					if (class12_sub12_sub11_sub4 != null)
						class12_sub12_sub11_sub4s[i_21_++] = class12_sub12_sub11_sub4;
				}
				if ((i_23_ ^ 0xffffffff) <= -513) {
					Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = Class12_Sub12_Sub11_Sub5
							.method502((byte) 121, i_23_ + -512).method554(
									aBoolean1003, arg0 ^ 0x478a);
					if (class12_sub12_sub11_sub4 != null)
						class12_sub12_sub11_sub4s[i_21_++] = class12_sub12_sub11_sub4;
				}
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = new Class12_Sub12_Sub11_Sub4(
					class12_sub12_sub11_sub4s, i_21_);
			for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -6; i_24_++) {
				if ((anIntArray1005[i_24_] ^ 0xffffffff) != -1) {
					class12_sub12_sub11_sub4
							.method489(
									Class12_Sub12_Sub4.anIntArrayArray2206[i_24_][0],
									(Class12_Sub12_Sub4.anIntArrayArray2206[i_24_][anIntArray1005[i_24_]]));
					if ((i_24_ ^ 0xffffffff) == -2)
						class12_sub12_sub11_sub4.method489(
								Class9.anIntArray209[0],
								Class9.anIntArray209[anIntArray1005[i_24_]]);
				}
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nd.L(" + arg0 + ')');
		}
	}

	public void method763(int arg0) {
		long l = aLong975;
		anInt1002++;
		int i = anIntArray996[5];
		int i_25_ = anIntArray996[9];
		anIntArray996[5] = i_25_;
		anIntArray996[9] = i;
		aLong975 = 0L;
		for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -13; i_26_++) {
			aLong975 <<= 4;
			if (anIntArray996[i_26_] >= 256)
				aLong975 += (long) (-256 + anIntArray996[i_26_]);
		}
		if ((anIntArray996[0] ^ 0xffffffff) <= -257)
			aLong975 += (long) (-256 + anIntArray996[0] >> 1944739716);
		if (anIntArray996[1] >= 256)
			aLong975 += (long) (-256 + anIntArray996[1] >> 502055816);
		if (arg0 != -14408)
			aClass59_990 = null;
		for (int i_27_ = 0; i_27_ < 5; i_27_++) {
			aLong975 <<= 3;
			aLong975 += (long) anIntArray1005[i_27_];
		}
		aLong975 <<= 1;
		Class42 class42 = this;
		class42.aLong975 = class42.aLong975 + (long) (!aBoolean1003 ? 0 : 1);
		anIntArray996[5] = i;
		anIntArray996[9] = i_25_;
		if (l != 0L && aLong975 != l)
			Class12_Sub12_Sub5.aClass27_2236.method669(-31, l);
	}

	public static void method764(boolean arg0) {
		anInt988++;
		if ((Class57.anInt1334 ^ 0xffffffff) == -62) {
			int i = Game.inBuffer.readSignedByte(true);
			int i_28_ = Class19.anInt456 + ((i & 0x72) >> -294562300);
			int i_29_ = Class40.anInt949 + (0x7 & i);
			int i_30_ = Game.inBuffer.readShort(-1);
			int i_31_ = Game.inBuffer.readSignedByte(true);
			int i_32_ = i_31_ >> -1972947132 & 0xf;
			int i_33_ = 0x7 & i_31_;
			if ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]) >= i_28_
					+ -i_32_
					&& ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]) ^ 0xffffffff) >= (i_32_
							+ i_28_ ^ 0xffffffff)
					&& ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]) ^ 0xffffffff) <= (i_29_
							+ -i_32_ ^ 0xffffffff)
					&& ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]) ^ 0xffffffff) >= (i_32_
							+ i_29_ ^ 0xffffffff)
					&& Class55.anInt1308 != 0
					&& i_33_ > 0
					&& ((Class12_Sub12_Sub11_Sub2_Sub1.anInt2931 ^ 0xffffffff) > -51)) {
				RSApplet.anIntArray12[(Class12_Sub12_Sub11_Sub2_Sub1.anInt2931)] = i_30_;
				Class12_Sub12_Sub11_Sub5.anIntArray2882[Class12_Sub12_Sub11_Sub2_Sub1.anInt2931] = i_33_;
				Class58.anIntArray1346[Class12_Sub12_Sub11_Sub2_Sub1.anInt2931] = 0;
				Class12_Sub12_Sub12.aClass34Array2408[Class12_Sub12_Sub11_Sub2_Sub1.anInt2931] = null;
				Class12_Sub12_Sub11_Sub2_Sub1.anInt2931++;
			}
		}
		if (Class57.anInt1334 == 209) {
			int i = Game.inBuffer.method230(false);
			int i_34_ = i >> -1591634270;
			int i_35_ = i & 0x3;
			int i_36_ = RSCanvas.anIntArray63[i_34_];
			int i_37_ = Game.inBuffer.readSignedByte(true);
			int i_38_ = (i_37_ & 0x7) + Class40.anInt949;
			int i_39_ = Class19.anInt456 - -((i_37_ & 0x79) >> -1739226236);
			if ((i_39_ ^ 0xffffffff) <= -1 && i_38_ >= 0 && i_39_ < 104
					&& (i_38_ ^ 0xffffffff) > -105)
				Class12_Sub12_Sub13.method525(i_36_, i_39_, -1, -1, 0,
						RSString.anInt1504, i_34_, (byte) 17, i_35_, i_38_);
		} else if (Class57.anInt1334 == 18) {
			int i = Game.inBuffer.method238(true);
			int i_40_ = i >> -8775870;
			int i_41_ = i & 0x3;
			int i_42_ = RSCanvas.anIntArray63[i_40_];
			int i_43_ = Game.inBuffer.method214(512);
			int i_44_ = Game.inBuffer.method230(false);
			int i_45_ = (0x7 & i_44_) + Class40.anInt949;
			int i_46_ = (i_44_ >> 1437460068 & 0x7) + Class19.anInt456;
			if ((i_46_ ^ 0xffffffff) <= -1 && (i_45_ ^ 0xffffffff) <= -1
					&& i_46_ < 103 && i_45_ < 103) {
				int i_47_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][i_46_][i_45_]);
				int i_48_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][1 + i_46_][1 + i_45_]);
				int i_49_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][1 + i_46_][i_45_]);
				int i_50_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][i_46_][i_45_ + 1]);
				if (i_42_ == 0) {
					Class55 class55 = Class12_Sub12_Sub8.aClass52_2295
							.method836(RSString.anInt1504, i_46_, i_45_);
					if (class55 != null) {
						int i_51_ = 0x7fff & class55.anInt1296 >> -159807602;
						if (i_40_ == 2) {
							class55.aClass12_Sub12_Sub11_1302 = new Class12_Sub12_Sub11_Sub6(
									i_51_, 2, 4 + i_41_, i_47_, i_49_, i_48_,
									i_50_, i_43_, false);
							class55.aClass12_Sub12_Sub11_1307 = new Class12_Sub12_Sub11_Sub6(
									i_51_, 2, i_41_ + 1 & 0x3, i_47_, i_49_,
									i_48_, i_50_, i_43_, false);
						} else
							class55.aClass12_Sub12_Sub11_1302 = new Class12_Sub12_Sub11_Sub6(
									i_51_, i_40_, i_41_, i_47_, i_49_, i_48_,
									i_50_, i_43_, false);
					}
				}
				if (i_42_ == 1) {
					Class4 class4 = Class12_Sub12_Sub8.aClass52_2295.method839(
							RSString.anInt1504, i_46_, i_45_);
					if (class4 != null)
						class4.aClass12_Sub12_Sub11_133 = new Class12_Sub12_Sub11_Sub6(
								((class4.anInt130 >> -1779104882) & 0x7fff), 4,
								0, i_47_, i_49_, i_48_, i_50_, i_43_, false);
				}
				if ((i_42_ ^ 0xffffffff) == -3) {
					if ((i_40_ ^ 0xffffffff) == -12)
						i_40_ = 10;
					Class32 class32 = Class12_Sub12_Sub8.aClass52_2295
							.method869(RSString.anInt1504, i_46_, i_45_);
					if (class32 != null)
						class32.aClass12_Sub12_Sub11_774 = new Class12_Sub12_Sub11_Sub6(
								((0x1fffd539 & (class32.anInt788)) >> 752792302),
								i_40_, i_41_, i_47_, i_49_, i_48_, i_50_,
								i_43_, false);
				}
				if ((i_42_ ^ 0xffffffff) == -4) {
					Class44 class44 = Class12_Sub12_Sub8.aClass52_2295
							.method828(RSString.anInt1504, i_46_, i_45_);
					if (class44 != null)
						class44.aClass12_Sub12_Sub11_1033 = (new Class12_Sub12_Sub11_Sub6(
								0x7fff & class44.anInt1048 >> -20192690, 22,
								i_41_, i_47_, i_49_, i_48_, i_50_, i_43_, false));
				}
			}
		} else if ((Class57.anInt1334 ^ 0xffffffff) == -101) {
			int i = Game.inBuffer.readSignedByte(arg0);
			int i_52_ = Class19.anInt456 + ((i & 0x71) >> 1668368228);
			int i_53_ = Class40.anInt949 + (i & 0x7);
			int i_54_ = i_52_
					- -Game.inBuffer.readByte(true);
			int i_55_ = Game.inBuffer.readByte(true) + i_53_;
			int i_56_ = Game.inBuffer.method212((byte) -66);
			int i_57_ = Game.inBuffer.readShort(-1);
			int i_58_ = 4 * Game.inBuffer.readSignedByte(arg0);
			int i_59_ = 4 * Game.inBuffer.readSignedByte(true);
			int i_60_ = Game.inBuffer.readShort(-1);
			int i_61_ = Game.inBuffer.readShort(-1);
			int i_62_ = Game.inBuffer.readSignedByte(true);
			int i_63_ = Game.inBuffer.readSignedByte(arg0);
			if ((i_52_ ^ 0xffffffff) <= -1 && i_53_ >= 0
					&& (i_52_ ^ 0xffffffff) > -105
					&& (i_53_ ^ 0xffffffff) > -105 && i_54_ >= 0 && i_55_ >= 0
					&& (i_54_ ^ 0xffffffff) > -105 && i_55_ < 104
					&& (i_57_ ^ 0xffffffff) != -65536) {
				i_54_ = 64 + i_54_ * 128;
				i_55_ = i_55_ * 128 - -64;
				i_52_ = i_52_ * 128 + 64;
				i_53_ = i_53_ * 128 + 64;
				Class12_Sub12_Sub11_Sub3 class12_sub12_sub11_sub3 = (new Class12_Sub12_Sub11_Sub3(
						i_57_, RSString.anInt1504, i_52_, i_53_, -i_58_
								+ Class26.method658(i_52_, -6,
										RSString.anInt1504, i_53_),
						Class64_Sub2.anInt1968 + i_60_, i_61_
								+ Class64_Sub2.anInt1968, i_62_, i_63_, i_56_,
						i_59_));
				class12_sub12_sub11_sub3
						.method470(0, (Class26.method658(i_54_, -6,
								RSString.anInt1504, i_55_) - i_59_), i_55_,
								i_54_, Class64_Sub2.anInt1968 + i_60_);
				Class56.aClass8_1324.method98(class12_sub12_sub11_sub3,
						(byte) 79);
			}
		} else if ((Class57.anInt1334 ^ 0xffffffff) == -109) {
			int i = Game.inBuffer.method236(-12543);
			int i_64_ = Game.inBuffer.readShort(-1);
			int i_65_ = Game.inBuffer.method236(-12543);
			int i_66_ = Game.inBuffer.method230(false);
			int i_67_ = Class19.anInt456 + (i_66_ >> -138874716 & 0x7);
			int i_68_ = Class40.anInt949 - -(0x7 & i_66_);
			if ((i_67_ ^ 0xffffffff) <= -1 && (i_68_ ^ 0xffffffff) <= -1
					&& (i_67_ ^ 0xffffffff) > -105 && i_68_ < 104
					&& i_65_ != Class12_Sub9.anInt1751) {
				Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1 = new Class12_Sub12_Sub11_Sub1();
				class12_sub12_sub11_sub1.anInt2643 = i_64_;
				class12_sub12_sub11_sub1.anInt2638 = i;
				if ((Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_67_][i_68_]) == null)
					Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_67_][i_68_] = new Class8();
				Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_67_][i_68_]
						.method98(class12_sub12_sub11_sub1, (byte) 79);
				Class12_Sub12_Sub13.method531(i_67_, i_68_, false);
			}
		} else if (arg0 == true) {
			if (Class57.anInt1334 == 158) {
				int i = Game.inBuffer.method236(-12543);
				int i_69_ = Game.inBuffer.method230(!arg0);
				int i_70_ = i_69_ >> -1101373662;
				int i_71_ = RSCanvas.anIntArray63[i_70_];
				int i_72_ = Game.inBuffer.readSignedByte(arg0);
				int i_73_ = 0x3 & i_69_;
				int i_74_ = Class19.anInt456 + (i_72_ >> 1959689444 & 0x7);
				int i_75_ = Class40.anInt949 - -(0x7 & i_72_);
				if ((i_74_ ^ 0xffffffff) <= -1 && (i_75_ ^ 0xffffffff) <= -1
						&& i_74_ < 104 && (i_75_ ^ 0xffffffff) > -105)
					Class12_Sub12_Sub13.method525(i_71_, i_74_, -1, i, 0,
							RSString.anInt1504, i_70_, (byte) 17, i_73_, i_75_);
			} else if ((Class57.anInt1334 ^ 0xffffffff) == -239) {
				int i = Game.inBuffer.readSignedByte(true);
				int i_76_ = (i & 0x7) + Class40.anInt949;
				int i_77_ = ((i & 0x70) >> 172045476) + Class19.anInt456;
				int i_78_ = Game.inBuffer.readShort(-1);
				int i_79_ = Game.inBuffer.readSignedByte(true);
				int i_80_ = Game.inBuffer.readShort(-1);
				if ((i_77_ ^ 0xffffffff) <= -1 && i_76_ >= 0
						&& (i_77_ ^ 0xffffffff) > -105 && i_76_ < 104) {
					i_76_ = i_76_ * 128 + 64;
					i_77_ = i_77_ * 128 - -64;
					Class12_Sub12_Sub11_Sub5 class12_sub12_sub11_sub5 = (new Class12_Sub12_Sub11_Sub5(
							i_78_, RSString.anInt1504, i_77_, i_76_,
							Class26.method658(i_77_, -6, RSString.anInt1504,
									i_76_) + -i_79_, i_80_,
							Class64_Sub2.anInt1968));
					Class10.aClass8_243.method98(class12_sub12_sub11_sub5,
							(byte) 79);
				}
			} else if ((Class57.anInt1334 ^ 0xffffffff) == -93) {
				int i = Game.inBuffer.method214(512);
				int i_81_ = Game.inBuffer.readSignedByte(true);
				int i_82_ = (0x7 & i_81_ >> 672454020) + Class19.anInt456;
				int i_83_ = Class40.anInt949 - -(i_81_ & 0x7);
				int i_84_ = Game.inBuffer
						.method227((byte) 121);
				if ((i_82_ ^ 0xffffffff) <= -1 && i_83_ >= 0
						&& (i_82_ ^ 0xffffffff) > -105
						&& (i_83_ ^ 0xffffffff) > -105) {
					Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1 = new Class12_Sub12_Sub11_Sub1();
					class12_sub12_sub11_sub1.anInt2638 = i;
					class12_sub12_sub11_sub1.anInt2643 = i_84_;
					if ((Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_82_][i_83_]) == null)
						Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_82_][i_83_] = new Class8();
					Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_82_][i_83_]
							.method98(class12_sub12_sub11_sub1, (byte) 79);
					Class12_Sub12_Sub13.method531(i_82_, i_83_, false);
				}
			} else {
				if ((Class57.anInt1334 ^ 0xffffffff) == -137) {
					int i = Game.inBuffer.readSignedByte(true);
					int i_85_ = Class40.anInt949 + (i & 0x7);
					int i_86_ = (0x7 & i >> -259292) + Class19.anInt456;
					int i_87_ = Game.inBuffer.method214(512);
					int i_88_ = Game.inBuffer.method228(true);
					int i_89_ = Game.inBuffer.method214(512);
					int i_90_ = Game.inBuffer.method237(0);
					int i_91_ = Game.inBuffer.method214(512);
					int i_92_ = Game.inBuffer
							.method227((byte) 118);
					int i_93_ = Game.inBuffer.method228(true);
					int i_94_ = Game.inBuffer.readSignedByte(true);
					int i_95_ = i_94_ >> -1762634078;
					int i_96_ = RSCanvas.anIntArray63[i_95_];
					int i_97_ = Game.inBuffer.method228(true);
					Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2;
					if ((Class12_Sub9.anInt1751 ^ 0xffffffff) != (i_87_ ^ 0xffffffff))
						class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_87_]);
					else
						class12_sub12_sub11_sub2_sub2 = Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713;
					int i_98_ = 0x3 & i_94_;
					if (class12_sub12_sub11_sub2_sub2 != null) {
						Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
								.method39(6, i_89_);
						int i_99_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][i_86_][i_85_]);
						int i_100_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][i_86_ + 1][i_85_]);
						int i_101_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][i_86_][i_85_
								- -1]);
						int i_102_ = (Statics.anIntArrayArrayArray569[RSString.anInt1504][1 + i_86_][i_85_
								- -1]);
						Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = class12_sub12_sub9
								.method424(-73, i_99_, i_101_, i_98_, i_95_,
										i_100_, i_102_);
						if (class12_sub12_sub11_sub4 != null) {
							Class12_Sub12_Sub13.method525(i_96_, i_86_,
									i_92_ + 1, -1, 1 + i_91_,
									RSString.anInt1504, 0, (byte) 17, 0, i_85_);
							int i_103_ = class12_sub12_sub9.anInt2318;
							if ((i_93_ ^ 0xffffffff) < (i_97_ ^ 0xffffffff)) {
								int i_104_ = i_93_;
								i_93_ = i_97_;
								i_97_ = i_104_;
							}
							int i_105_ = class12_sub12_sub9.anInt2334;
							class12_sub12_sub11_sub2_sub2.anInt2959 = i_92_
									+ Class64_Sub2.anInt1968;
							if (i_98_ == 1 || (i_98_ ^ 0xffffffff) == -4) {
								i_105_ = class12_sub12_sub9.anInt2318;
								i_103_ = class12_sub12_sub9.anInt2334;
							}
							class12_sub12_sub11_sub2_sub2.anInt2945 = i_85_
									* 128 - -(i_105_ * 64);
							class12_sub12_sub11_sub2_sub2.anInt2952 = i_86_
									* 128 - -(i_103_ * 64);
							class12_sub12_sub11_sub2_sub2.aClass12_Sub12_Sub11_Sub4_2963 = class12_sub12_sub11_sub4;
							if (i_88_ < i_90_) {
								int i_106_ = i_90_;
								i_90_ = i_88_;
								i_88_ = i_106_;
							}
							class12_sub12_sub11_sub2_sub2.anInt2946 = i_91_
									- -Class64_Sub2.anInt1968;
							class12_sub12_sub11_sub2_sub2.anInt2964 = (Class26
									.method658(
											class12_sub12_sub11_sub2_sub2.anInt2952,
											-6,
											RSString.anInt1504,
											class12_sub12_sub11_sub2_sub2.anInt2945));
							class12_sub12_sub11_sub2_sub2.anInt2940 = i_85_
									- -i_88_;
							class12_sub12_sub11_sub2_sub2.anInt2942 = i_90_
									+ i_85_;
							class12_sub12_sub11_sub2_sub2.anInt2958 = i_86_
									+ i_93_;
							class12_sub12_sub11_sub2_sub2.anInt2950 = i_86_
									+ i_97_;
						}
					}
				}
				if (Class57.anInt1334 == 249) {
					int i = Game.inBuffer.readSignedByte(true);
					int i_107_ = Class40.anInt949 + (i & 0x7);
					int i_108_ = (0x7 & i >> 224019652) + Class19.anInt456;
					int i_109_ = Game.inBuffer.readShort(-1);
					int i_110_ = Game.inBuffer.readShort(-1);
					int i_111_ = Game.inBuffer.readShort(-1);
					if ((i_108_ ^ 0xffffffff) <= -1 && i_107_ >= 0
							&& (i_108_ ^ 0xffffffff) > -105 && i_107_ < 104) {
						Class8 class8 = (Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_108_][i_107_]);
						if (class8 != null) {
							for (Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1 = ((Class12_Sub12_Sub11_Sub1) class8
									.method91((byte) 86)); class12_sub12_sub11_sub1 != null; class12_sub12_sub11_sub1 = ((Class12_Sub12_Sub11_Sub1) class8
									.method100(-29860))) {
								if (((i_109_ & 0x7fff ^ 0xffffffff) == (class12_sub12_sub11_sub1.anInt2643 ^ 0xffffffff))
										&& ((i_110_ ^ 0xffffffff) == (class12_sub12_sub11_sub1.anInt2638 ^ 0xffffffff))) {
									class12_sub12_sub11_sub1.anInt2638 = i_111_;
									break;
								}
							}
							Class12_Sub12_Sub13
									.method531(i_108_, i_107_, false);
						}
					}
				} else if ((Class57.anInt1334 ^ 0xffffffff) == -185) {
					int i = Game.inBuffer.readSignedByte(true);
					int i_112_ = ((0x74 & i) >> 436773444) + Class19.anInt456;
					int i_113_ = Class40.anInt949 + (i & 0x7);
					int i_114_ = Game.inBuffer
							.method236(-12543);
					if (i_112_ >= 0 && (i_113_ ^ 0xffffffff) <= -1
							&& i_112_ < 104 && i_113_ < 104) {
						Class8 class8 = (Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_112_][i_113_]);
						if (class8 != null) {
							for (Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1 = ((Class12_Sub12_Sub11_Sub1) class8
									.method91((byte) 86)); class12_sub12_sub11_sub1 != null; class12_sub12_sub11_sub1 = ((Class12_Sub12_Sub11_Sub1) class8
									.method100(-29860))) {
								if ((0x7fff & i_114_ ^ 0xffffffff) == (class12_sub12_sub11_sub1.anInt2643 ^ 0xffffffff)) {
									class12_sub12_sub11_sub1
											.method143((byte) 39);
									break;
								}
							}
							if (class8.method91((byte) 86) == null)
								Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_112_][i_113_] = null;
							Class12_Sub12_Sub13
									.method531(i_112_, i_113_, false);
						}
					}
				}
			}
		}
	}

	public void method765(int arg0, boolean arg1) {
		try {
			if (arg0 != 0)
				anInt1000 = -30;
			anInt1007++;
			if (aBoolean1003 != arg1)
				method770(anIntArray1005, -1, arg1, arg0 ^ 0x3402, null);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nd.M(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method766(boolean arg0, int arg1, boolean arg2) {
		try {
			anInt999++;
			if (arg1 != 1 || !aBoolean1003) {
				int i = anIntArray996[Class5.anIntArray149[arg1]];
				if (i != 0) {
					i -= 256;
					Class12_Sub12_Sub6 class12_sub12_sub6;
					do {
						if (!arg2) {
							if ((--i ^ 0xffffffff) > -1)
								i = -1 + Class31.anInt766;
						} else if ((++i ^ 0xffffffff) <= (Class31.anInt766 ^ 0xffffffff))
							i = 0;
						class12_sub12_sub6 = Class63.method968(853, i);
					} while (class12_sub12_sub6 == null
							|| class12_sub12_sub6.aBoolean2271
							|| ((!aBoolean1003 ? 0 : 7) + arg1 != class12_sub12_sub6.anInt2251));
					if (arg0 == false) {
						anIntArray996[Class5.anIntArray149[arg1]] = 256 + i;
						method763(-14408);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nd.J(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method767(byte arg0) {
		try {
			aClass62_984 = null;
			anIntArray985 = null;
			aClass27_987 = null;
			aClass59_1008 = null;
			aClass59_983 = null;
			aClass62_986 = null;
			anIntArray994 = null;
			if (arg0 != -13)
				aClass62_986 = null;
			aClass59_998 = null;
			aClass59_990 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nd.G(" + arg0 + ')');
		}
	}

	public void method768(int arg0, Buffer arg1) {
		try {
			anInt993++;
			arg1.writeByte(!aBoolean1003 ? 0 : 1);
			for (int i = 0; i < 7; i++) {
				int i_115_ = anIntArray996[Class5.anIntArray149[i]];
				if (i_115_ == 0)
					arg1.writeByte(-1);
				else
					arg1.writeByte(i_115_ - 256);
			}
			if (arg0 == 0) {
				for (int i = 0; i < 5; i++)
					arg1.writeByte(anIntArray1005[i]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nd.H(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public int method769(byte arg0) {
		try {
			int i = 41 % ((arg0 - 78) / 45);
			anInt991++;
			if ((anInt997 ^ 0xffffffff) == 0)
				return (anIntArray996[1] + ((anIntArray996[11] << 847363461) + ((anIntArray996[8] << 1893290634)
						+ (anIntArray996[0] << -699301649)
						+ (anIntArray1005[4] << 1447683252) + (anIntArray1005[0] << 451824409))));
			return (Class31.method701((byte) -116, anInt997).anInt2086 + 305419896);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nd.F(" + arg0 + ')');
		}
	}

	public void method770(int[] arg0, int arg1, boolean arg2, int arg3,
			int[] arg4) {
		try {
			if (arg4 == null) {
				arg4 = new int[12];
				for (int i = 0; (i ^ 0xffffffff) > -8; i++) {
					for (int i_116_ = 0; ((i_116_ ^ 0xffffffff) > (Class31.anInt766 ^ 0xffffffff)); i_116_++) {
						Class12_Sub12_Sub6 class12_sub12_sub6 = Class63
								.method968(853, i_116_);
						if (class12_sub12_sub6 != null
								&& !class12_sub12_sub6.aBoolean2271
								&& (((arg2 ? 7 : 0) + i ^ 0xffffffff) == (class12_sub12_sub6.anInt2251 ^ 0xffffffff))) {
							arg4[Class5.anIntArray149[i]] = 256 + i_116_;
							break;
						}
					}
				}
			}
			if (arg3 != 13314)
				method767((byte) -114);
			anInt976++;
			anIntArray1005 = arg0;
			aBoolean1003 = arg2;
			anIntArray996 = arg4;
			anInt997 = arg1;
			method763(-14408);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nd.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public static Class12_Sub12_Sub7_Sub2 method771(int arg0, byte arg1,
			int arg2, Class26 arg3) {
		try {
			anInt980++;
			if (arg1 < 116)
				return null;
			if (!Class5.method77(arg2, 29066, arg3, arg0))
				return null;
			return Class12_Sub2.method150(0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nd.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method772(int arg0) {
		if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			Class1.anIntArray73[186] = 57;
			Class1.anIntArray73[187] = 27;
			Class1.anIntArray73[188] = 71;
			Class1.anIntArray73[189] = 26;
			Class1.anIntArray73[190] = 72;
			Class1.anIntArray73[191] = 73;
			Class1.anIntArray73[192] = 58;
			Class1.anIntArray73[219] = 42;
			Class1.anIntArray73[220] = 74;
			Class1.anIntArray73[221] = 43;
			Class1.anIntArray73[222] = 59;
			Class1.anIntArray73[223] = 28;
		} else {
			Class1.anIntArray73[44] = 71;
			Class1.anIntArray73[45] = 26;
			Class1.anIntArray73[46] = 72;
			Class1.anIntArray73[47] = 73;
			Class1.anIntArray73[59] = 57;
			Class1.anIntArray73[61] = 27;
			Class1.anIntArray73[91] = 42;
			Class1.anIntArray73[92] = 74;
			Class1.anIntArray73[93] = 43;
			if (Signlink.setFocusTraversalKeysEnabled != null) {
				Class1.anIntArray73[192] = 28;
				Class1.anIntArray73[222] = 58;
				Class1.anIntArray73[520] = 59;
			} else {
				Class1.anIntArray73[192] = 58;
				Class1.anIntArray73[222] = 59;
			}
		}
		anInt981++;
		if (arg0 != 8518)
			anIntArray985 = null;
	}

	static {
		aClass59_983 = aClass59_990;
		anInt1000 = 0;
		aClass59_1008 = Class55.method898("Starting game engine)3)3)3", -10983);
		anInt1006 = 0;
		aClass59_998 = aClass59_1008;
		aClass27_987 = new Class27(200);
	}
}
