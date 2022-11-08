package com.jagex;/* com.jagex.Class12_Sub12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.Buffer;
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

public class Class12_Sub12_Sub3 extends Class12_Sub12 {
	public int anInt2106;
	public int anInt2107;
	public static int anInt2108;
	public int anInt2109;
	public int anInt2110 = 0;
	public int anInt2111;
	public int anInt2112;
	public static int anInt2113 = 0;
	public int anInt2114;
	public static RSString aClass59_2115;
	public RSString aClass59_2116;
	public int anInt2117;
	public int[] anIntArray2118;
	public int anInt2119;
	public int anInt2120;
	public int anInt2121;
	public int anInt2122 = 0;
	public int anInt2123;
	public int anInt2124;
	public static int anInt2125 = 0;
	public static int anInt2126;
	public static RSString aClass59_2127;
	public static long aLong2128 = 0L;
	public int anInt2129;
	public RSString aClass59_2130;
	public RSString aClass59_2131;
	public int anInt2132 = 0;
	public int anInt2133;
	public static int anInt2134;
	public boolean aBoolean2135;
	public int anInt2136;
	public RSString[] aClass59Array2137;
	public int anInt2138;
	public int anInt2139;
	public int[] anIntArray2140;
	public int anInt2141;
	public int anInt2142;
	public int anInt2143;
	public static int anInt2144;
	public int anInt2145;
	public RSString aClass59_2146;
	public int anInt2147;
	public int[] anIntArray2148;
	public int[] anIntArray2149;
	public RSString aClass59_2150;
	public int anInt2151 = 0;
	public int[] anIntArray2152;
	public boolean aBoolean2153;
	public static int anInt2154;
	public static int anInt2155 = 0;
	public static int anInt2156;
	public static int[] anIntArray2157;
	public static int anInt2158;
	public boolean aBoolean2159;
	public int anInt2160;
	public static int anInt2161;
	public boolean aBoolean2162;
	public int[] anIntArray2163;
	public static int anInt2164;
	public int anInt2165;
	public int anInt2166;
	public int anInt2167;
	public static RSString aClass59_2168 = Class55
			.method898(":duelreq:", -10983);
	public boolean aBoolean2169;
	public int[][] anIntArrayArray2170;
	public int anInt2171;
	public boolean aBoolean2172;
	public static RSString aClass59_2173;
	public int anInt2174;
	public static int anInt2175;
	public static int anInt2176;
	public boolean aBoolean2177;
	public int anInt2178;
	public int anInt2179;
	public int anInt2180;
	public int anInt2181;
	public int[] anIntArray2182;
	public int anInt2183;
	public static int anInt2184;
	public int anInt2185;
	public int anInt2186;

	public static int method295(RSString arg0, Buffer arg1, int arg2) {
		try {
			anInt2184++;
			int i = arg1.position;
			arg1.method250(arg0.anInt1480, true);
			arg1.position += Class23.aClass15_510.method592(
					arg1.payload, (byte) 112, arg2, arg0.chars,
					arg1.position, arg0.anInt1480);
			return -i + arg1.position;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("d.G("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public Class12_Sub12_Sub7_Sub1 method296(boolean arg0, int arg1) {
		try {
			int i;
			if (!arg0)
				i = anInt2109;
			else
				i = anInt2124;
			Class10.aBoolean224 = false;
			anInt2144++;
			if (i == -1)
				return null;
			Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = ((Class12_Sub12_Sub7_Sub1) Class42.aClass27_987
					.method673(124, (long) i));
			if (class12_sub12_sub7_sub1 != null)
				return class12_sub12_sub7_sub1;
			if (arg1 > -52)
				anInt2147 = 14;
			class12_sub12_sub7_sub1 = Class28.method683(0,
					Class12_Sub12_Sub11_Sub1.aClass26_2655, i, (byte) -62);
			if (class12_sub12_sub7_sub1 == null)
				Class10.aBoolean224 = true;
			else
				Class42.aClass27_987.method678((byte) 123,
						class12_sub12_sub7_sub1, (long) i);
			return class12_sub12_sub7_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "d.I(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method297(Buffer arg0, int arg1) {
		anInt2126++;
		anInt2141 = arg0.readSignedByte(true);
		anInt2145 = arg0.readSignedByte(true);
		anInt2180 = arg0.readShort(-1);
		anInt2106 = anInt2171 = arg0.method212((byte) -88);
		anInt2178 = anInt2166 = arg0.method212((byte) -80);
		anInt2121 = arg0.readShort(-1);
		anInt2111 = arg0.readShort(-1);
		anInt2120 = arg0.readSignedByte(true);
		anInt2107 = arg0.readShort(-1);
		if (anInt2107 == 65535)
			anInt2107 = -1;
		anInt2179 = arg0.readShort(-1);
		if ((anInt2179 ^ 0xffffffff) == -65536)
			anInt2179 = -1;
		int i = arg0.readSignedByte(true);
		if (i > 0) {
			anIntArray2152 = new int[i];
			anIntArray2118 = new int[i];
			for (int i_0_ = 0; i > i_0_; i_0_++) {
				anIntArray2152[i_0_] = arg0.readSignedByte(true);
				anIntArray2118[i_0_] = arg0.readShort(-1);
			}
		}
		int i_1_ = arg0.readSignedByte(true);
		if (i_1_ > 0) {
			anIntArrayArray2170 = new int[i_1_][];
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				int i_3_ = arg0.readShort(-1);
				anIntArrayArray2170[i_2_] = new int[i_3_];
				for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					anIntArrayArray2170[i_2_][i_4_] = arg0.readShort(-1);
					if ((anIntArrayArray2170[i_2_][i_4_] ^ 0xffffffff) == -65536)
						anIntArrayArray2170[i_2_][i_4_] = -1;
				}
			}
		}
		if ((anInt2141 ^ 0xffffffff) == -1) {
			anInt2138 = arg0.readShort(-1);
			aBoolean2169 = (arg0.readSignedByte(true) ^ 0xffffffff) == -2;
		}
		if ((anInt2141 ^ 0xffffffff) == -2) {
			arg0.readShort(-1);
			arg0.readSignedByte(true);
		}
		if ((anInt2141 ^ 0xffffffff) == -3) {
			anIntArray2140 = new int[anInt2111 * anInt2121];
			anIntArray2149 = new int[anInt2111 * anInt2121];
			aBoolean2172 = arg0.readSignedByte(true) == 1;
			aBoolean2135 = (arg0.readSignedByte(true) ^ 0xffffffff) == -2;
			aBoolean2162 = arg0.readSignedByte(true) == 1;
			aBoolean2159 = (arg0.readSignedByte(true) ^ 0xffffffff) == -2;
			anInt2151 = arg0.readSignedByte(true);
			anInt2133 = arg0.readSignedByte(true);
			anIntArray2148 = new int[20];
			anIntArray2163 = new int[20];
			anIntArray2182 = new int[20];
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -21; i_5_++) {
				int i_6_ = arg0.readSignedByte(true);
				if (i_6_ != 1)
					anIntArray2148[i_5_] = -1;
				else {
					anIntArray2163[i_5_] = arg0.method212((byte) -108);
					anIntArray2182[i_5_] = arg0.method212((byte) -99);
					anIntArray2148[i_5_] = arg0.method207(-708753192);
				}
			}
			aClass59Array2137 = new RSString[5];
			for (int i_7_ = 0; i_7_ < 5; i_7_++) {
				aClass59Array2137[i_7_] = arg0.method246(20356);
				if ((aClass59Array2137[i_7_].length() ^ 0xffffffff) == -1)
					aClass59Array2137[i_7_] = null;
			}
		}
		if (anInt2141 == 3)
			aBoolean2177 = (arg0.readSignedByte(true) ^ 0xffffffff) == -2;
		if ((anInt2141 ^ 0xffffffff) == -5 || anInt2141 == 1) {
			anInt2122 = arg0.readSignedByte(true);
			anInt2181 = arg0.readSignedByte(true);
			anInt2117 = arg0.readSignedByte(true);
			anInt2160 = arg0.readSignedByte(true);
			aBoolean2153 = (arg0.readSignedByte(true) ^ 0xffffffff) == -2;
		}
		if ((anInt2141 ^ 0xffffffff) == -5) {
			aClass59_2130 = arg0.method246(20356);
			aClass59_2150 = arg0.method246(20356);
		}
		if ((anInt2141 ^ 0xffffffff) == -2 || anInt2141 == 3 || anInt2141 == 4)
			anInt2186 = arg0.method207(-708753192);
		if (anInt2141 == 3 || anInt2141 == 4) {
			anInt2167 = arg0.method207(-708753192);
			anInt2136 = arg0.method207(-708753192);
			anInt2165 = arg0.method207(-708753192);
		}
		if (arg1 > 50) {
			if (anInt2141 == 5) {
				anInt2109 = arg0.method207(-708753192);
				anInt2124 = arg0.method207(-708753192);
			}
			if ((anInt2141 ^ 0xffffffff) == -7) {
				anInt2114 = 1;
				anInt2112 = arg0.readShort(-1);
				if ((anInt2112 ^ 0xffffffff) == -65536)
					anInt2112 = -1;
				anInt2119 = 1;
				anInt2185 = arg0.readShort(-1);
				if (anInt2185 == 65535)
					anInt2185 = -1;
				anInt2142 = arg0.readShort(-1);
				if ((anInt2142 ^ 0xffffffff) == -65536)
					anInt2142 = -1;
				anInt2129 = arg0.readShort(-1);
				if ((anInt2129 ^ 0xffffffff) == -65536)
					anInt2129 = -1;
				anInt2139 = arg0.readShort(-1);
				anInt2147 = arg0.readShort(-1);
				anInt2123 = arg0.readShort(-1);
			}
			if (anInt2141 == 7) {
				anIntArray2140 = new int[anInt2111 * anInt2121];
				anIntArray2149 = new int[anInt2121 * anInt2111];
				anInt2122 = arg0.readSignedByte(true);
				anInt2160 = arg0.readSignedByte(true);
				aBoolean2153 = arg0.readSignedByte(true) == 1;
				anInt2186 = arg0.method207(-708753192);
				anInt2151 = arg0.method212((byte) -113);
				anInt2133 = arg0.method212((byte) -28);
				aBoolean2135 = arg0.readSignedByte(true) == 1;
				aClass59Array2137 = new RSString[5];
				for (int i_8_ = 0; i_8_ < 5; i_8_++) {
					aClass59Array2137[i_8_] = arg0.method246(20356);
					if (aClass59Array2137[i_8_].length() == 0)
						aClass59Array2137[i_8_] = null;
				}
			}
			if ((anInt2141 ^ 0xffffffff) == -9)
				aClass59_2130 = arg0.method246(20356);
			if ((anInt2145 ^ 0xffffffff) == -3
					|| (anInt2141 ^ 0xffffffff) == -3) {
				aClass59_2131 = arg0.method246(20356);
				aClass59_2116 = arg0.method246(20356);
				anInt2174 = arg0.readShort(-1);
			}
			if ((anInt2145 ^ 0xffffffff) == -2 || anInt2145 == 4
					|| anInt2145 == 5 || (anInt2145 ^ 0xffffffff) == -7) {
				aClass59_2146 = arg0.method246(20356);
				if ((aClass59_2146.length() ^ 0xffffffff) == -1) {
					if ((anInt2145 ^ 0xffffffff) == -2)
						aClass59_2146 = Class8.aClass59_195;
					if ((anInt2145 ^ 0xffffffff) == -5)
						aClass59_2146 = Class23.aClass59_509;
					if ((anInt2145 ^ 0xffffffff) == -6)
						aClass59_2146 = Class23.aClass59_509;
					if (anInt2145 == 6)
						aClass59_2146 = Class12_Sub12_Sub16.aClass59_2532;
				}
			}
		}
	}

	public Class12_Sub12_Sub11_Sub4 method298(boolean arg0, Class42 arg1,
			int arg2, int arg3, Class12_Sub12_Sub4 arg4) {
		try {
			anInt2108++;
			Class10.aBoolean224 = false;
			int i;
			int i_9_;
			if (arg0) {
				i_9_ = anInt2185;
				i = anInt2119;
			} else {
				i = anInt2114;
				i_9_ = anInt2112;
			}
			if (i == 0)
				return null;
			if (i == 1 && i_9_ == -1)
				return null;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class39.aClass27_938
					.method673(118, (long) ((i << -1094701424) - -i_9_)));
			if (class12_sub12_sub11_sub4 == null) {
				if ((i ^ 0xffffffff) == -2) {
					class12_sub12_sub11_sub4 = (Class12_Sub12_Sub11_Sub4
							.method496(Class12_Sub12_Sub11_Sub3.aClass26_2769,
									i_9_, 0));
					if (class12_sub12_sub11_sub4 == null) {
						Class10.aBoolean224 = true;
						return null;
					}
					class12_sub12_sub11_sub4.method471();
					class12_sub12_sub11_sub4.method485(64, 768, -50, -10, -50,
							true);
				}
				if (i == 2) {
					class12_sub12_sub11_sub4 = Class31.method701((byte) 75,
							i_9_).method291(0);
					if (class12_sub12_sub11_sub4 == null) {
						Class10.aBoolean224 = true;
						return null;
					}
					class12_sub12_sub11_sub4.method471();
					class12_sub12_sub11_sub4.method485(64, 768, -50, -10, -50,
							true);
				}
				if ((i ^ 0xffffffff) == -4) {
					if (arg1 == null)
						return null;
					class12_sub12_sub11_sub4 = arg1.method762(arg2 + 28);
					if (class12_sub12_sub11_sub4 == null) {
						Class10.aBoolean224 = true;
						return null;
					}
					class12_sub12_sub11_sub4.method471();
					class12_sub12_sub11_sub4.method485(64, 768, -50, -10, -50,
							true);
				}
				if (i == 4) {
					Class12_Sub12_Sub15 class12_sub12_sub15 = Class12_Sub12_Sub11_Sub5
							.method502((byte) 121, i_9_);
					class12_sub12_sub11_sub4 = class12_sub12_sub15.method549(
							10, (byte) 59, false);
					if (class12_sub12_sub11_sub4 == null) {
						Class10.aBoolean224 = true;
						return null;
					}
					class12_sub12_sub11_sub4.method471();
					class12_sub12_sub11_sub4.method485(
							class12_sub12_sub15.anInt2525 + 64,
							class12_sub12_sub15.anInt2472 + 768, -50, -10, -50,
							true);
				}
				Class39.aClass27_938.method678((byte) 123,
						class12_sub12_sub11_sub4,
						(long) (i_9_ + (i << -1833252752)));
			}
			if (arg4 != null)
				class12_sub12_sub11_sub4 = arg4.method312(
						class12_sub12_sub11_sub4, arg3, arg2 + -95);
			if (arg2 != -1)
				anInt2110 = -44;
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("d.A(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method299(byte arg0) {
		try {
			aClass59_2173 = null;
			anIntArray2157 = null;
			aClass59_2168 = null;
			aClass59_2115 = null;
			if (arg0 == -118)
				aClass59_2127 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "d.F(" + arg0 + ')');
		}
	}

	public static void method300(boolean arg0) {
		anInt2161++;
		if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -1) {
			Class12_Sub12_Sub8.aClass52_2295 = new Class52(4, 104, 104,
					Statics.anIntArrayArrayArray569);
			for (int i = 0; (i ^ 0xffffffff) > -5; i++)
				Class11.aClass10Array280[i] = new Class10(104, 104);
			Class31.aClass12_Sub12_Sub7_Sub1_753 = new Class12_Sub12_Sub7_Sub1(
					512, 512);
			Class11.aClass59_285 = Class42.aClass59_998;
			Class12_Sub12_Sub11_Sub1.anInt2642 = 20;
			Class64_Sub1.anInt1951 = 5;
		} else if (Class12_Sub12_Sub11_Sub1.anInt2642 == 20) {
			int[] is = new int[9];
			for (int i = 0; (i ^ 0xffffffff) > -10; i++) {
				int i_10_ = 32 * i + 128 + 15;
				int i_11_ = Class12_Sub12_Sub7_Sub3.anIntArray2596[i_10_];
				int i_12_ = 600 - -(i_10_ * 3);
				is[i] = i_12_ * i_11_ >> 2102815952;
			}
			Class52.method829(is, 500, 800, 512, 334);
			Class12_Sub12_Sub11_Sub1.anInt2642 = 30;
			Class11.aClass59_285 = Class12_Sub12_Sub12.aClass59_2405;
			Class64_Sub1.anInt1951 = 10;
		} else if (Class12_Sub12_Sub11_Sub1.anInt2642 == 30) {
			Cache.animsArchive = Class12_Sub12_Sub6.method335(false,
					true, 0, true, -28677);
			Cache.basesArchive = Class12_Sub12_Sub6.method335(
					false, true, 1, true, -28677);
			Cache.configArchive = Class12_Sub12_Sub6.method335(true,
					true, 2, false, -28677);
			Cache.interfacesArchive = Class12_Sub12_Sub6.method335(false,
					true, 3, true, -28677);
			Cache.synthSoundsArchive = Class12_Sub12_Sub6.method335(false,
					true, 4, true, -28677);
			Cache.mapsArchive = Class12_Sub12_Sub6.method335(true,
					true, 5, true, -28677);
			Cache.midiSongsArchive = Class12_Sub12_Sub6
					.method335(true, false, 6, true, -28677);
			Cache.modelsArchive = Class12_Sub12_Sub6
					.method335(false, true, 7, true, -28677);
			Cache.spritesArchive = Class12_Sub12_Sub6.method335(false,
					true, 8, true, -28677);
			Cache.texturesArchive = Class12_Sub12_Sub6.method335(
					false, true, 9, true, -28677);
			Cache.binaryArchive = Class12_Sub12_Sub6
					.method335(false, true, 10, true, -28677);
			Cache.midiJinglesArchive = Class12_Sub12_Sub6
					.method335(false, true, 11, true, -28677);
			Class11.aClass59_285 = Class29.aClass59_710;
			Class12_Sub12_Sub11_Sub1.anInt2642 = 40;
			Class64_Sub1.anInt1951 = 20;
		} else if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -41) {
			int i = 0;
			i += 5 * Cache.animsArchive.method665((byte) -35) / 100;
			i += (5 * Cache.basesArchive.method665((byte) -35) / 100);
			i += Cache.configArchive.method665((byte) -35) * 5 / 100;
			i += 5 * Cache.interfacesArchive.method665((byte) -35) / 100;
			i += 5 * Cache.synthSoundsArchive.method665((byte) -35) / 100;
			i += 5 * Cache.mapsArchive.method665((byte) -35) / 100;
			i += Cache.midiSongsArchive
					.method665((byte) -35) * 5 / 100;
			i += 45 * Cache.modelsArchive
					.method665((byte) -35) / 100;
			i += 5 * Cache.spritesArchive.method665((byte) -35) / 100;
			i += (Cache.texturesArchive.method665((byte) -35) * 5 / 100);
			i += Cache.binaryArchive
					.method665((byte) -35) * 5 / 100;
			i += (Cache.midiJinglesArchive.method665((byte) -35) * 5 / 100);
			if ((i ^ 0xffffffff) != -101) {
				if ((i ^ 0xffffffff) != -1)
					Class11.aClass59_285 = Statics.method251(
							(byte) -60,
							(new RSString[] { Class27.aClass59_641,
									Class19.method599(i, 10),
									(Class12_Sub6.aClass59_1701) }));
				Class64_Sub1.anInt1951 = 30;
			} else {
				Class64_Sub1.anInt1951 = 30;
				Class11.aClass59_285 = Class36.aClass59_891;
				Class12_Sub12_Sub11_Sub1.anInt2642 = 45;
			}
		} else if (Class12_Sub12_Sub11_Sub1.anInt2642 == 45) {
			Class12_Sub12_Sub5.method323(!Class21.aBoolean483, true,
					Game.signlink, 0);
			Class12_Sub12_Sub14.aClass12_Sub5_Sub1_2450 = Class12_Sub9
					.method196(Class12_Sub12_Sub5.aCanvas2243, 0,
							Game.signlink);
			Class12_Sub12_Sub11_Sub3.aClass33_2766 = new Class33(22050,
					Class19.anInt446);
			Class12_Sub12_Sub11_Sub1.anInt2642 = 50;
			Class64_Sub1.anInt1951 = 35;
			Class11.aClass59_285 = Class13.aClass59_357;
		} else if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -51) {
			int i = 0;
			if (Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055 != null)
				i++;
			else
				Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055 = Class12_Sub12_Sub13
						.method530(Class11.aClass59_310, Class61.aClass59_1367,
								Cache.spritesArchive, -1);
			if (Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529 != null)
				i++;
			else
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529 = Class12_Sub12_Sub13
						.method530(Class11.aClass59_310, Class14.aClass59_358,
								Cache.spritesArchive, -1);
			if (Class29.aClass12_Sub12_Sub7_Sub4_693 == null)
				Class29.aClass12_Sub12_Sub7_Sub4_693 = Class12_Sub12_Sub13
						.method530(Class11.aClass59_310, Class43.aClass59_1014,
								Cache.spritesArchive, -1);
			else
				i++;
			if (Statics.aClass12_Sub12_Sub7_Sub4_546 == null)
				Statics.aClass12_Sub12_Sub7_Sub4_546 = Class12_Sub12_Sub13
						.method530(Class11.aClass59_310, Class21.aClass59_497,
								Cache.spritesArchive, -1);
			else
				i++;
			if ((i ^ 0xffffffff) > -5) {
				Class11.aClass59_285 = Statics.method251(
						(byte) -63,
						(new RSString[] { Class57.aClass59_1328,
								Class19.method599(i * 100 / 4, 10),
								(Class12_Sub6.aClass59_1701) }));
				Class64_Sub1.anInt1951 = 40;
			} else {
				Class11.aClass59_285 = Class12_Sub12_Sub16.aClass59_2549;
				Class64.aClass12_Sub12_Sub7_Sub4Array1438 = (new Class12_Sub12_Sub7_Sub4[] {
						Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055,
						Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529,
						Class29.aClass12_Sub12_Sub7_Sub4_693,
						Statics.aClass12_Sub12_Sub7_Sub4_546 });
				Class12_Sub12_Sub11_Sub1.anInt2642 = 60;
				Class64_Sub1.anInt1951 = 40;
			}
		} else if (Class12_Sub12_Sub11_Sub1.anInt2642 == 60) {
			int i = Class55.method900(5138, Cache.spritesArchive,
					(Cache.binaryArchive));
			int i_13_ = Class12_Sub12_Sub13.method534(99);
			if (i < i_13_) {
				Class11.aClass59_285 = (Statics.method251(
						(byte) -51,
						new RSString[] { Class31.aClass59_754,
								Class19.method599(i * 100 / i_13_, 10),
								Class12_Sub6.aClass59_1701 }));
				Class64_Sub1.anInt1951 = 50;
			} else {
				Class64_Sub1.anInt1951 = 50;
				Class11.aClass59_285 = RSSocket.aClass59_517;
				Class29.method686((byte) 67, 5);
				Class12_Sub12_Sub11_Sub1.anInt2642 = 70;
			}
		} else if (Class12_Sub12_Sub11_Sub1.anInt2642 == 70) {
			if (!Cache.configArchive.method635(-1)) {
				Class11.aClass59_285 = (Statics.method251(
						(byte) -43,
						(new RSString[] {
								Class20.aClass59_461,
								Class19.method599(Cache.configArchive
										.method666((byte) 123), 10),
								Class12_Sub6.aClass59_1701 })));
				Class64_Sub1.anInt1951 = 60;
			} else {
				Class12_Sub12_Sub6.method334(Cache.configArchive, -60);
				Class55.method896(Cache.configArchive, (byte) 29);
				Class12_Sub12_Sub12.method517((byte) -59,
						Cache.configArchive,
						(Cache.modelsArchive));
				Class12_Sub12_Sub11_Sub1.method443(
						(Cache.modelsArchive), (byte) -22,
						Class21.aBoolean483, Cache.configArchive);
				Class30.method693(Cache.modelsArchive,
						Cache.configArchive, 100);
				Class58.method909(Cache.modelsArchive,
						-20188, Cache.configArchive,
						Class12_Sub12_Sub11_Sub6.aBoolean2898);
				Class32.method706(Cache.basesArchive,
						Cache.animsArchive, 2, Cache.configArchive);
				Class12_Sub12_Sub11_Sub1.method442(-16269,
						(Cache.modelsArchive),
						Cache.configArchive);
				Class12_Sub9.method195(Cache.configArchive, -79);
				Archive.method668(Cache.configArchive, 115);
				Class14.method567(Cache.spritesArchive,
						Cache.interfacesArchive,
						Cache.modelsArchive, 0);
				Class64_Sub1.anInt1951 = 60;
				Class12_Sub12_Sub11_Sub1.anInt2642 = 80;
				Class11.aClass59_285 = Class27.aClass59_648;
			}
		} else if (Class12_Sub12_Sub11_Sub1.anInt2642 == 80) {
			int i = 0;
			if (Class31.aClass12_Sub12_Sub7_Sub1_758 != null)
				i++;
			else
				Class31.aClass12_Sub12_Sub7_Sub1_758 = Class17.method594(
						Class11.aClass59_310, 0, Cache.spritesArchive,
						Class12_Sub2.aClass59_1630);
			if (Class12.aClass12_Sub12_Sub7_Sub1_314 == null)
				Class12.aClass12_Sub12_Sub7_Sub1_314 = Class17.method594(
						Class11.aClass59_310, 0, Cache.spritesArchive,
						Class43.aClass59_1024);
			else
				i++;
			if (Class21.aClass12_Sub12_Sub7_Sub2Array495 == null)
				Class21.aClass12_Sub12_Sub7_Sub2Array495 = Statics
						.method263(Cache.spritesArchive,
								RSApplet.aClass59_35, Class11.aClass59_310,
								-29072);
			else
				i++;
			if (Class38.aClass12_Sub12_Sub7_Sub1Array911 == null)
				Class38.aClass12_Sub12_Sub7_Sub1Array911 = RSString.method936(
						-23078, Cache.spritesArchive,
						Class11.aClass59_310,
						(Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2938));
			else
				i++;
			if (Class62_Sub2.aClass12_Sub12_Sub7_Sub1Array1926 == null)
				Class62_Sub2.aClass12_Sub12_Sub7_Sub1Array1926 = RSString
						.method936(-23078, Cache.spritesArchive,
								Class11.aClass59_310, Class55.aClass59_1288);
			else
				i++;
			if (Class1.aClass12_Sub12_Sub7_Sub1Array82 == null)
				Class1.aClass12_Sub12_Sub7_Sub1Array82 = RSString.method936(
						-23078, Cache.spritesArchive,
						Class11.aClass59_310, Class18.aClass59_437);
			else
				i++;
			if (Class11.aClass12_Sub12_Sub7_Sub1Array254 == null)
				Class11.aClass12_Sub12_Sub7_Sub1Array254 = RSString.method936(
						-23078, Cache.spritesArchive,
						Class11.aClass59_310, Class27.aClass59_640);
			else
				i++;
			if (Class12_Sub12_Sub13.aClass12_Sub12_Sub7_Sub1Array2422 == null)
				Class12_Sub12_Sub13.aClass12_Sub12_Sub7_Sub1Array2422 = RSString
						.method936(-23078, Cache.spritesArchive,
								Class11.aClass59_310,
								Class12_Sub12_Sub13.aClass59_2435);
			else
				i++;
			if (Class12_Sub12_Sub11.aClass12_Sub12_Sub7_Sub1_2385 != null)
				i++;
			else
				Class12_Sub12_Sub11.aClass12_Sub12_Sub7_Sub1_2385 = Class17
						.method594(Class11.aClass59_310, 0,
								Cache.spritesArchive,
								Class56.aClass59_1319);
			if (Class29.aClass12_Sub12_Sub7_Sub1Array717 != null)
				i++;
			else
				Class29.aClass12_Sub12_Sub7_Sub1Array717 = RSString.method936(
						-23078, Cache.spritesArchive,
						Class11.aClass59_310, Class9_Sub2.aClass59_1598);
			if (Class23.aClass12_Sub12_Sub7_Sub1Array498 == null)
				Class23.aClass12_Sub12_Sub7_Sub1Array498 = RSString.method936(
						-23078, Cache.spritesArchive,
						Class11.aClass59_310, Class5.aClass59_155);
			else
				i++;
			if (Game.aClass12_Sub12_Sub7_Sub1Array1575 == null)
				Game.aClass12_Sub12_Sub7_Sub1Array1575 = RSString.method936(
						-23078, Cache.spritesArchive,
						Class11.aClass59_310, Class43.aClass59_1010);
			else
				i++;
			if (Class15.aClass12_Sub12_Sub7_Sub2Array387 == null)
				Class15.aClass12_Sub12_Sub7_Sub2Array387 = Statics
						.method263(Cache.spritesArchive,
								Class31.aClass59_762, Class11.aClass59_310,
								-29072);
			else
				i++;
			if (Class15.aClass12_Sub12_Sub7_Sub2Array382 == null)
				Class15.aClass12_Sub12_Sub7_Sub2Array382 = Statics
						.method263(Cache.spritesArchive,
								(Class12_Sub12_Sub11_Sub1.aClass59_2639),
								Class11.aClass59_310, -29072);
			else
				i++;
			if (i < 14) {
				Class11.aClass59_285 = (Statics.method251((byte) -85,
						new RSString[] { Class12_Sub12_Sub4.aClass59_2196,
								Class19.method599(i * 100 / 14, 10),
								Class12_Sub6.aClass59_1701 }));
				Class64_Sub1.anInt1951 = 70;
			} else {
				Class12.aClass12_Sub12_Sub7_Sub1_314.method362();
				int i_14_ = (int) (21.0 * Math.random()) - 10;
				int i_15_ = (int) (Math.random() * 21.0) + -10;
				int i_16_ = (int) (41.0 * Math.random()) + -20;
				int i_17_ = (int) (21.0 * Math.random()) + -10;
				for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (Class38.aClass12_Sub12_Sub7_Sub1Array911.length ^ 0xffffffff)); i_18_++)
					Class38.aClass12_Sub12_Sub7_Sub1Array911[i_18_].method364(
							i_14_ - -i_16_, i_15_ - -i_16_, i_17_ - -i_16_);
				Class21.aClass12_Sub12_Sub7_Sub2Array495[0].method365(i_14_
						- -i_16_, i_15_ - -i_16_, i_17_ + i_16_);
				Class64_Sub1.anInt1951 = 70;
				Class12_Sub12_Sub11_Sub1.anInt2642 = 85;
				Class11.aClass59_285 = Class44.aClass59_1034;
			}
		} else if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -86) {
			int i = Class12_Sub12_Sub2
					.method292(100, Cache.spritesArchive);
			int i_19_ = Class21.method608(19);
			if ((i ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
				Class11.aClass59_285 = (Statics.method251(
						(byte) -125,
						new RSString[] { Class41.aClass59_970,
								Class19.method599(100 * i / i_19_, 10),
								Class12_Sub6.aClass59_1701 }));
				Class64_Sub1.anInt1951 = 80;
			} else {
				Class12_Sub12_Sub11_Sub1.anInt2642 = 90;
				Class11.aClass59_285 = Class18.aClass59_436;
				Class64_Sub1.anInt1951 = 80;
			}
		} else if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -91) {
			if (!Cache.texturesArchive.method635(-1)) {
				Class11.aClass59_285 = (Statics.method251(
						(byte) -88,
						(new RSString[] {
								Class42.aClass59_983,
								Class19.method599(
										Cache.texturesArchive
												.method666((byte) 115), 10),
								Class12_Sub6.aClass59_1701 })));
				Class64_Sub1.anInt1951 = 90;
			} else {
				Class7 class7 = new Class7(Cache.texturesArchive,
						Cache.spritesArchive, 20, 0.8,
						!Class21.aBoolean483 ? 128 : 64);
				Class12_Sub12_Sub7_Sub3.method386(class7);
				Class12_Sub12_Sub7_Sub3.method373(0.8);
				Class11.aClass59_285 = Class12_Sub12_Sub11_Sub2_Sub2.aClass59_2968;
				Class12_Sub12_Sub11_Sub1.anInt2642 = 110;
				Class64_Sub1.anInt1951 = 90;
			}
		} else if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -111) {
			Class1.aClass19_72 = new Class19();
			Game.signlink.putNodeType2(Class1.aClass19_72, 10);
			Class11.aClass59_285 = Class12_Sub7.aClass59_1734;
			Class12_Sub12_Sub11_Sub1.anInt2642 = 120;
			Class64_Sub1.anInt1951 = 94;
		} else if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -121) {
			if (!Cache.binaryArchive.method652(
					RSSocket.aClass59_534, Class11.aClass59_310, -1)) {
				Class11.aClass59_285 = Statics.method251((byte) -36,
						(new RSString[] {
								(Class12_Sub12_Sub11_Sub5.aClass59_2872),
								Class14.aClass59_370 }));
				Class64_Sub1.anInt1951 = 96;
			} else {
				Class15 class15 = new Class15(
						Cache.binaryArchive
								.method643(RSSocket.aClass59_534,
										Class11.aClass59_310, 255));
				Class12_Sub12_Sub10.method432((byte) -41, class15);
				Class11.aClass59_285 = Class64.aClass59_1442;
				Class12_Sub12_Sub11_Sub1.anInt2642 = 130;
				Class64_Sub1.anInt1951 = 96;
			}
		} else {
			if (arg0 != true)
				anIntArray2157 = null;
			if ((Class12_Sub12_Sub11_Sub1.anInt2642 ^ 0xffffffff) == -131) {
				if (!Cache.interfacesArchive.method635(-1)) {
					Class11.aClass59_285 = (Statics.method251(
							(byte) -38,
							(new RSString[] {
									Class57.aClass59_1325,
									Class19.method599(Cache.interfacesArchive
											.method666((byte) 115), 10),
									Class12_Sub6.aClass59_1701 })));
					Class64_Sub1.anInt1951 = 100;
				} else {
					Class11.aClass59_285 = Class10.aClass59_244;
					Class64_Sub1.anInt1951 = 100;
					Class12_Sub12_Sub11_Sub1.anInt2642 = 140;
				}
			} else if (Class12_Sub12_Sub11_Sub1.anInt2642 == 140)
				Class29.method686((byte) 67, 10);
		}
	}

	public static void method301(boolean arg0) {
		try {
			anInt2158++;
			if (arg0 != false)
				anInt2125 = 56;
			if ((Class12_Sub12_Sub11_Sub5.anInt2848 ^ 0xffffffff) == -1
					&& Class12.anInt315 == 0) {
				Class12_Sub12_Sub8.anInt2291++;
				Class64.method977(anInt2176, Class18.anInt432, 13, 0,
						Class14.aClass59_372, -65);
			}
			int i = -1;
			int i_20_ = 0;
			for (/**/; ((i_20_ ^ 0xffffffff) > (Class12_Sub12_Sub11_Sub4.anInt2818 ^ 0xffffffff)); i_20_++) {
				int i_21_ = Class12_Sub12_Sub11_Sub4.anIntArray2823[i_20_];
				int i_22_ = 0x7fff & i_21_ >> -1529477938;
				int i_23_ = (0x3fd7 & i_21_) >> -94103033;
				int i_24_ = (i_21_ & 0x73fadaae) >> 1928714077;
				int i_25_ = i_21_ & 0x7f;
				if ((i ^ 0xffffffff) != (i_21_ ^ 0xffffffff)) {
					i = i_21_;
					if (i_24_ == 2
							&& ((Class12_Sub12_Sub8.aClass52_2295.method844(
									RSString.anInt1504, i_25_, i_23_, i_21_)) ^ 0xffffffff) <= -1) {
						Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
								.method39(6, i_22_);
						if (class12_sub12_sub9.anIntArray2310 != null)
							class12_sub12_sub9 = class12_sub12_sub9
									.method413(false);
						if (class12_sub12_sub9 == null)
							continue;
						if (Class12_Sub12_Sub11_Sub5.anInt2848 == 1) {
							Class12_Sub12_Sub11_Sub5.anInt2854++;
							Class64.method977(
									i_23_,
									i_25_,
									37,
									i_21_,
									(Statics
											.method251(
													(byte) -104,
													(new RSString[] {
															RSString.aClass59_1525,
															Class14.aClass59_371,
															Statics.aClass59_565,
															(Class12_Sub12_Sub11_Sub5.aClass59_2862),
															(class12_sub12_sub9.aClass59_2312) }))),
									-105);
						} else if ((Class12.anInt315 ^ 0xffffffff) == -2) {
							if ((0x4 & Class55.anInt1289 ^ 0xffffffff) == -5) {
								Class48.anInt1120++;
								Class64.method977(
										i_23_,
										i_25_,
										40,
										i_21_,
										(Statics
												.method251(
														(byte) -108,
														(new RSString[] {
																Class12_Sub12_Sub9.aClass59_2354,
																(Class12_Sub12_Sub11_Sub5.aClass59_2862),
																(class12_sub12_sub9.aClass59_2312) }))),
										-99);
							}
						} else {
							Class12_Sub9.anInt1752++;
							RSString[] class59s = class12_sub12_sub9.aClass59Array2327;
							if (Class12_Sub1.aBoolean1615)
								class59s = Class27.method674(-108, class59s);
							if (class59s != null) {
								for (int i_26_ = 4; i_26_ >= 0; i_26_--) {
									if (class59s[i_26_] != null) {
										Class28.anInt674++;
										int i_27_ = 0;
										if (i_26_ == 0)
											i_27_ = 53;
										if (i_26_ == 1)
											i_27_ = 2;
										if (i_26_ == 2)
											i_27_ = 26;
										if ((i_26_ ^ 0xffffffff) == -4)
											i_27_ = 56;
										if ((i_26_ ^ 0xffffffff) == -5)
											i_27_ = 1004;
										Class64.method977(
												i_23_,
												i_25_,
												i_27_,
												i_21_,
												(Statics
														.method251(
																(byte) -94,
																(new RSString[] {
																		class59s[i_26_],
																		Class10.aClass59_237,
																		(class12_sub12_sub9.aClass59_2312) }))),
												-45);
									}
								}
							}
							Class64.method977(
									i_23_,
									i_25_,
									1001,
									(class12_sub12_sub9.anInt2316 << -1136172146),
									(Statics
											.method251(
													(byte) -91,
													(new RSString[] {
															Class32.aClass59_801,
															Class10.aClass59_237,
															(class12_sub12_sub9.aClass59_2312) }))),
									-54);
						}
					}
					if (i_24_ == 1) {
						Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_22_]);
						if (((class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2097) ^ 0xffffffff) == -2
								&& (class12_sub12_sub11_sub2_sub1.anInt2691 & 0x7f) == 64
								&& ((0x7f & class12_sub12_sub11_sub2_sub1.anInt2683) == 64)) {
							for (int i_28_ = 0; ((Class62_Sub2.anInt1916 ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
								Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1_29_ = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[Class1.anIntArray76[i_28_]]);
								if (class12_sub12_sub11_sub2_sub1_29_ != null
										&& (class12_sub12_sub11_sub2_sub1 != class12_sub12_sub11_sub2_sub1_29_)
										&& ((class12_sub12_sub11_sub2_sub1_29_.aClass12_Sub12_Sub2_2923.anInt2097) ^ 0xffffffff) == -2
										&& (((class12_sub12_sub11_sub2_sub1.anInt2691) ^ 0xffffffff) == ((class12_sub12_sub11_sub2_sub1_29_.anInt2691) ^ 0xffffffff))
										&& ((class12_sub12_sub11_sub2_sub1_29_.anInt2683) == (class12_sub12_sub11_sub2_sub1.anInt2683)))
									Class27.method672(
											(class12_sub12_sub11_sub2_sub1_29_.aClass12_Sub12_Sub2_2923),
											Class1.anIntArray76[i_28_], i_25_,
											i_23_, (byte) -44);
							}
							for (int i_30_ = 0; Class9.anInt203 > i_30_; i_30_++) {
								Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[Class36.anIntArray888[i_30_]]);
								if (class12_sub12_sub11_sub2_sub2 != null
										&& (((class12_sub12_sub11_sub2_sub2.anInt2691) ^ 0xffffffff) == ((class12_sub12_sub11_sub2_sub1.anInt2691) ^ 0xffffffff))
										&& (class12_sub12_sub11_sub2_sub1.anInt2683 == (class12_sub12_sub11_sub2_sub2.anInt2683)))
									Class12_Sub12_Sub12
											.method516(
													i_25_,
													(byte) -82,
													class12_sub12_sub11_sub2_sub2,
													i_23_,
													Class36.anIntArray888[i_30_]);
							}
						}
						Class27.method672(
								(class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923),
								i_22_, i_25_, i_23_, (byte) -44);
					}
					if (i_24_ == 0) {
						Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_22_]);
						if (((0x7f & class12_sub12_sub11_sub2_sub2.anInt2691) == 64)
								&& (class12_sub12_sub11_sub2_sub2.anInt2683 & 0x7f) == 64) {
							for (int i_31_ = 0; Class62_Sub2.anInt1916 > i_31_; i_31_++) {
								Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[Class1.anIntArray76[i_31_]]);
								if (class12_sub12_sub11_sub2_sub1 != null
										&& ((class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2097) == 1)
										&& (class12_sub12_sub11_sub2_sub2.anInt2691 == (class12_sub12_sub11_sub2_sub1.anInt2691))
										&& (class12_sub12_sub11_sub2_sub1.anInt2683 == (class12_sub12_sub11_sub2_sub2.anInt2683)))
									Class27.method672(
											(class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923),
											Class1.anIntArray76[i_31_], i_25_,
											i_23_, (byte) -44);
							}
							for (int i_32_ = 0; Class9.anInt203 > i_32_; i_32_++) {
								Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2_33_ = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[Class36.anIntArray888[i_32_]]);
								if (class12_sub12_sub11_sub2_sub2_33_ != null
										&& (class12_sub12_sub11_sub2_sub2_33_ != class12_sub12_sub11_sub2_sub2)
										&& (class12_sub12_sub11_sub2_sub2.anInt2691 == (class12_sub12_sub11_sub2_sub2_33_.anInt2691))
										&& (class12_sub12_sub11_sub2_sub2.anInt2683 == (class12_sub12_sub11_sub2_sub2_33_.anInt2683)))
									Class12_Sub12_Sub12
											.method516(
													i_25_,
													(byte) -127,
													class12_sub12_sub11_sub2_sub2_33_,
													i_23_,
													Class36.anIntArray888[i_32_]);
							}
						}
						Class12_Sub12_Sub12.method516(i_25_, (byte) -112,
								class12_sub12_sub11_sub2_sub2, i_23_, i_22_);
					}
					if ((i_24_ ^ 0xffffffff) == -4) {
						Class8 class8 = (Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_25_][i_23_]);
						if (class8 != null) {
							for (Class12_Sub12_Sub11_Sub1 class12_sub12_sub11_sub1 = ((Class12_Sub12_Sub11_Sub1) class8
									.method89(3)); class12_sub12_sub11_sub1 != null; class12_sub12_sub11_sub1 = ((Class12_Sub12_Sub11_Sub1) class8
									.method103(-80))) {
								Class12_Sub12_Sub15 class12_sub12_sub15 = (Class12_Sub12_Sub11_Sub5
										.method502(
												(byte) 121,
												class12_sub12_sub11_sub1.anInt2643));
								if (Class12_Sub12_Sub11_Sub5.anInt2848 == 1) {
									Class12_Sub12_Sub11_Sub2_Sub1.anInt2916++;
									Class64.method977(
											i_23_,
											i_25_,
											14,
											class12_sub12_sub11_sub1.anInt2643,
											(Statics
													.method251(
															(byte) -103,
															(new RSString[] {
																	RSString.aClass59_1525,
																	Class14.aClass59_371,
																	Statics.aClass59_565,
																	RSCanvas.aClass59_62,
																	(class12_sub12_sub15.aClass59_2480) }))),
											-42);
								} else if ((Class12.anInt315 ^ 0xffffffff) == -2) {
									if ((Class55.anInt1289 & 0x1 ^ 0xffffffff) == -2) {
										Class58.anInt1360++;
										Class64.method977(
												i_23_,
												i_25_,
												7,
												(class12_sub12_sub11_sub1.anInt2643),
												(Statics
														.method251(
																(byte) -90,
																(new RSString[] {
																		(Class12_Sub12_Sub9.aClass59_2354),
																		RSCanvas.aClass59_62,
																		(class12_sub12_sub15.aClass59_2480) }))),
												-80);
									}
								} else {
									Class63.anInt1404++;
									RSString[] class59s = (class12_sub12_sub15.aClass59Array2499);
									if (Class12_Sub1.aBoolean1615)
										class59s = Class27.method674(100,
												class59s);
									for (int i_34_ = 4; (i_34_ ^ 0xffffffff) <= -1; i_34_--) {
										if (class59s != null
												&& class59s[i_34_] != null) {
											Class47.anInt1087++;
											int i_35_ = 0;
											if ((i_34_ ^ 0xffffffff) == -1)
												i_35_ = 34;
											if (i_34_ == 1)
												i_35_ = 21;
											if ((i_34_ ^ 0xffffffff) == -3)
												i_35_ = 10;
											if ((i_34_ ^ 0xffffffff) == -4)
												i_35_ = 46;
											if ((i_34_ ^ 0xffffffff) == -5)
												i_35_ = 23;
											Class64.method977(
													i_23_,
													i_25_,
													i_35_,
													(class12_sub12_sub11_sub1.anInt2643),
													(Statics
															.method251(
																	(byte) -72,
																	(new RSString[] {
																			class59s[i_34_],
																			(RuntimeException_Sub1.aClass59_1467),
																			(class12_sub12_sub15.aClass59_2480) }))),
													-114);
										} else if ((i_34_ ^ 0xffffffff) == -3) {
											Class33.anInt811++;
											Class64.method977(
													i_23_,
													i_25_,
													10,
													(class12_sub12_sub11_sub1.anInt2643),
													(Statics
															.method251(
																	(byte) -96,
																	(new RSString[] {
																			Class29.aClass59_709,
																			(RuntimeException_Sub1.aClass59_1467),
																			(class12_sub12_sub15.aClass59_2480) }))),
													-83);
										}
									}
									Class64.method977(
											i_23_,
											i_25_,
											1005,
											class12_sub12_sub11_sub1.anInt2643,
											(Statics
													.method251(
															(byte) -53,
															(new RSString[] {
																	Class32.aClass59_801,
																	(RuntimeException_Sub1.aClass59_1467),
																	(class12_sub12_sub15.aClass59_2480) }))),
											-79);
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "d.D(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub7_Sub1 method302(byte arg0, int arg1) {
		try {
			anInt2156++;
			if (arg0 != 33)
				anInt2109 = 38;
			Class10.aBoolean224 = false;
			if ((arg1 ^ 0xffffffff) > -1 || arg1 >= anIntArray2148.length)
				return null;
			int i = anIntArray2148[arg1];
			if (i == -1)
				return null;
			Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = ((Class12_Sub12_Sub7_Sub1) Class42.aClass27_987
					.method673(123, (long) i));
			if (class12_sub12_sub7_sub1 != null)
				return class12_sub12_sub7_sub1;
			class12_sub12_sub7_sub1 = Class28.method683(0,
					Class12_Sub12_Sub11_Sub1.aClass26_2655, i, (byte) -75);
			if (class12_sub12_sub7_sub1 == null)
				Class10.aBoolean224 = true;
			else
				Class42.aClass27_987.method678((byte) 123,
						class12_sub12_sub7_sub1, (long) i);
			return class12_sub12_sub7_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "d.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method303(byte arg0, int arg1, int arg2) {
		try {
			int i = anIntArray2140[arg1];
			if (arg0 > 46) {
				anInt2134++;
				anIntArray2140[arg1] = anIntArray2140[arg2];
				anIntArray2140[arg2] = i;
				i = anIntArray2149[arg1];
				anIntArray2149[arg1] = anIntArray2149[arg2];
				anIntArray2149[arg2] = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("d.E(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public Class12_Sub12_Sub3() {
		anInt2117 = 0;
		anInt2133 = 0;
		aBoolean2159 = false;
		anInt2181 = 0;
	}

	static {
		aClass59_2115 = Class55.method898("Please remove ", -10983);
		anInt2154 = 0;
		anInt2176 = 0;
		aClass59_2173 = aClass59_2115;
		aClass59_2127 = aClass59_2115;
	}
}
