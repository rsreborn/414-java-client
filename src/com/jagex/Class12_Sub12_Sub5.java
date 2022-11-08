package com.jagex;/* com.jagex.Class12_Sub12_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

import java.awt.Canvas;

public class Class12_Sub12_Sub5 extends Class12_Sub12 {
	public static long aLong2231 = 0L;
	public static int anInt2232;
	public static int anInt2233;
	public static int anInt2234;
	public static int anInt2235;
	public static Class27 aClass27_2236;
	public static int anInt2237;
	public static int[] anIntArray2238 = new int[500];
	public static int anInt2239;
	public static int anInt2240;
	public static int anInt2241;
	public static int anInt2242;
	public static Canvas aCanvas2243;
	public static RSString aClass59_2244;
	public static RSString aClass59_2245;
	public static int[][][] anIntArrayArrayArray2246;
	public Class37[] aClass37Array2247;
	public static boolean aBoolean2248;

	public static void method316(int arg0, byte arg1) {
		Class40.method750(false, arg0, 0, null, arg1 ^ ~0x3b35);
		anInt2240++;
		if (arg1 != -82)
			anIntArray2238 = null;
	}

	public boolean method317(boolean arg0, int arg1) {
		try {
			anInt2235++;
			if (arg0 != true)
				method316(47, (byte) -46);
			return aClass37Array2247[arg1].aBoolean903;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hd.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method318(int arg0) {
		Game.inBuffer.initBitAccess();
		anInt2237++;
		if (arg0 == 7) {
			int i = Game.inBuffer.readBits(1);
			if (i != 0) {
				int i_0_ = Game.inBuffer.readBits(2);
				if (i_0_ == 0)
					Class10.anIntArray220[Class47.anInt1094++] = 2047;
				else if (i_0_ == 1) {
					int i_1_ = Game.inBuffer.readBits(3
					);
					Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.method445(
							i_1_, 64, false);
					int i_2_ = Game.inBuffer
							.readBits(1);
					if ((i_2_ ^ 0xffffffff) == -2)
						Class10.anIntArray220[Class47.anInt1094++] = 2047;
				} else if (i_0_ == 2) {
					int i_3_ = Game.inBuffer
							.readBits(3);
					Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.method445(
							i_3_, 64, true);
					int i_4_ = Game.inBuffer.readBits(3
					);
					Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.method445(
							i_4_, 64, true);
					int i_5_ = Game.inBuffer.readBits(1
					);
					if ((i_5_ ^ 0xffffffff) == -2)
						Class10.anIntArray220[Class47.anInt1094++] = 2047;
				} else if (i_0_ == 3) {
					int i_6_ = Game.inBuffer.readBits(7
					);
					int i_7_ = Game.inBuffer
							.readBits(1);
					if (i_7_ == 1)
						Class10.anIntArray220[Class47.anInt1094++] = 2047;
					int i_8_ = Game.inBuffer
							.readBits(7);
					int i_9_ = Game.inBuffer.readBits(1
					);
					RSString.anInt1504 = Game.inBuffer
							.readBits(2);
					Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.method453(
							i_8_, (i_9_ ^ 0xffffffff) == -2, false, i_6_);
				}
			}
		}
	}

	public static int method319(int arg0, byte[] arg1, byte arg2) {
		try {
			anInt2234++;
			if (arg2 != 52)
				return -68;
			return Class12_Sub12_Sub13.method523(0, arg0, arg1, (byte) -125);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("hd.H(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public static void method320(Class12_Sub12_Sub11_Sub2 arg0, int arg1,
			byte arg2) {
		try {
			anInt2239++;
			Class29.method690(arg1, 119, arg0.anInt2683, arg0.anInt2691);
			int i = 5 % ((arg2 - 53) / 63);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("hd.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static boolean method321(int arg0, byte arg1) {
		try {
			anInt2241++;
			if (arg0 < 0)
				return false;
			int i = Class19.anIntArray454[arg0];
			if ((i ^ 0xffffffff) <= -2001)
				i -= 2000;
			if (arg1 != 54)
				method321(37, (byte) -35);
			if ((i ^ 0xffffffff) == -18)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hd.I(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static boolean method322(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, byte arg6, int arg7, int arg8) {
		try {
			anInt2233++;
			if (!Class15.method589(arg5, 14585))
				return false;
			Class12_Sub12_Sub7.method346(arg4, arg8, arg1, arg7);
			if (arg6 != 99)
				return false;
			boolean bool = true;
			Class12_Sub12_Sub3[] class12_sub12_sub3s = Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg5];
			for (int i = 0; (i ^ 0xffffffff) > (class12_sub12_sub3s.length ^ 0xffffffff); i++) {
				Class12_Sub12_Sub3 class12_sub12_sub3 = class12_sub12_sub3s[i];
				if (class12_sub12_sub3 != null
						&& arg2 == class12_sub12_sub3.anInt2107) {
					if (class12_sub12_sub3.anInt2180 > 0)
						Class20.method604((byte) -61, class12_sub12_sub3);
					int i_10_ = class12_sub12_sub3.anInt2171 + arg4;
					int i_11_ = -arg0 + class12_sub12_sub3.anInt2166 - -arg8;
					if (class12_sub12_sub3.anInt2141 == 0) {
						if (class12_sub12_sub3.aBoolean2169
								&& !Class29.method687(i, (byte) -45, arg3))
							continue;
						if ((-class12_sub12_sub3.anInt2111 + class12_sub12_sub3.anInt2138) < class12_sub12_sub3.anInt2143)
							class12_sub12_sub3.anInt2143 = (class12_sub12_sub3.anInt2138 - class12_sub12_sub3.anInt2111);
						if ((class12_sub12_sub3.anInt2143 ^ 0xffffffff) > -1)
							class12_sub12_sub3.anInt2143 = 0;
						bool &= method322(class12_sub12_sub3.anInt2143, i_10_
								- -class12_sub12_sub3.anInt2121, i, arg3,
								i_10_, arg5, (byte) 99, i_11_
										- -class12_sub12_sub3.anInt2111, i_11_);
						Class12_Sub12_Sub7.method346(arg4, arg8, arg1, arg7);
						if ((class12_sub12_sub3.anInt2111 ^ 0xffffffff) > (class12_sub12_sub3.anInt2138 ^ 0xffffffff))
							Class30.method694(i_11_,
									class12_sub12_sub3.anInt2138,
									class12_sub12_sub3.anInt2111, (byte) 102,
									class12_sub12_sub3.anInt2143, i_10_
											- -(class12_sub12_sub3.anInt2121));
					}
					if (class12_sub12_sub3.anInt2141 != 1) {
						if (class12_sub12_sub3.anInt2141 == 2) {
							int i_12_ = 0;
							for (int i_13_ = 0; i_13_ < class12_sub12_sub3.anInt2111; i_13_++) {
								for (int i_14_ = 0; ((class12_sub12_sub3.anInt2121 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
									int i_15_ = i_11_
											- -((32 - -(class12_sub12_sub3.anInt2133)) * i_13_);
									int i_16_ = i_10_
											+ (32 - -(class12_sub12_sub3.anInt2151))
											* i_14_;
									if ((i_12_ ^ 0xffffffff) > -21) {
										i_16_ += (class12_sub12_sub3.anIntArray2163[i_12_]);
										i_15_ += (class12_sub12_sub3.anIntArray2182[i_12_]);
									}
									if (((class12_sub12_sub3.anIntArray2140[i_12_]) ^ 0xffffffff) >= -1) {
										if ((class12_sub12_sub3.anIntArray2148 != null)
												&& i_12_ < 20) {
											Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = (class12_sub12_sub3
													.method302((byte) 33, i_12_));
											if (class12_sub12_sub7_sub1 == null) {
												if (Class10.aBoolean224)
													bool = false;
											} else
												class12_sub12_sub7_sub1
														.method352(i_16_, i_15_);
										}
									} else {
										int i_17_ = 0;
										int i_18_ = 0;
										int i_19_ = ((class12_sub12_sub3.anIntArray2140[i_12_]) + -1);
										if ((i_16_ > -32
												+ (Class12_Sub12_Sub7.anInt2280)
												&& (Class12_Sub12_Sub7.anInt2278 > i_16_)
												&& ((i_15_ ^ 0xffffffff) < (-32
														+ (Class12_Sub12_Sub7.anInt2279) ^ 0xffffffff)) && ((i_15_ ^ 0xffffffff) > ((Class12_Sub12_Sub7.anInt2276) ^ 0xffffffff)))
												|| ((Class12_Sub12_Sub12.anInt2417 ^ 0xffffffff) != -1 && (((Class12_Sub12_Sub8.anInt2285) ^ 0xffffffff) == (i_12_ ^ 0xffffffff)))) {
											int i_20_ = 0;
											if (((Class12_Sub12_Sub11_Sub5.anInt2848) ^ 0xffffffff) == -2
													&& i_12_ == Class13.anInt352
													&& (Class9_Sub2.anInt1596 == i
															+ (arg5 << -1241455440)))
												i_20_ = 16777215;
											Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = (Class26
													.method657(
															(class12_sub12_sub3.anIntArray2149[i_12_]),
															i_20_, i_19_,
															(byte) 31));
											if (class12_sub12_sub7_sub1 == null)
												bool = false;
											else {
												if (((Class12_Sub12_Sub12.anInt2417) ^ 0xffffffff) == -1
														|| ((i_12_ ^ 0xffffffff) != ((Class12_Sub12_Sub8.anInt2285) ^ 0xffffffff))
														|| (Class62.anInt1381 != ((arg5 << 218949232) - -i))) {
													if ((Class12_Sub12_Sub16.anInt2560) != 0
															&& ((i_12_ ^ 0xffffffff) == ((Class33.anInt829) ^ 0xffffffff))
															&& ((i
																	+ (arg5 << 951925200) ^ 0xffffffff) == ((Class12_Sub12_Sub11_Sub2_Sub2.anInt2973) ^ 0xffffffff)))
														class12_sub12_sub7_sub1
																.method360(
																		i_16_,
																		i_15_,
																		128);
													else
														class12_sub12_sub7_sub1
																.method352(
																		i_16_,
																		i_15_);
												} else {
													i_18_ = (-Class63.anInt1388 + (Class12_Sub12_Sub3.anInt2176));
													if (i_18_ < 5
															&& (i_18_ ^ 0xffffffff) < 4)
														i_18_ = 0;
													i_17_ = (Class18.anInt432 - Statics.anInt576);
													if (i_17_ < 5 && i_17_ > -5)
														i_17_ = 0;
													if ((Class12_Sub12_Sub10.anInt2369) < 5) {
														i_17_ = 0;
														i_18_ = 0;
													}
													class12_sub12_sub7_sub1
															.method360(
																	i_17_
																			+ i_16_,
																	i_18_
																			+ i_15_,
																	128);
													if (arg2 != -1) {
														Class12_Sub12_Sub3 class12_sub12_sub3_21_ = (class12_sub12_sub3s[arg2]);
														if ((((Class12_Sub12_Sub7.anInt2279) ^ 0xffffffff) < (i_15_
																- -i_18_ ^ 0xffffffff))
																&& ((class12_sub12_sub3_21_.anInt2143) > 0)) {
															int i_22_ = ((Class12_Sub12_Sub11_Sub6.anInt2903)
																	* (-i_18_ + (-i_15_ + (Class12_Sub12_Sub7.anInt2279))) / 3);
															if (i_22_ > (10 * (Class12_Sub12_Sub11_Sub6.anInt2903)))
																i_22_ = ((Class12_Sub12_Sub11_Sub6.anInt2903) * 10);
															if (((class12_sub12_sub3_21_.anInt2143) ^ 0xffffffff) > (i_22_ ^ 0xffffffff))
																i_22_ = (class12_sub12_sub3_21_.anInt2143);
															class12_sub12_sub3_21_.anInt2143 -= i_22_;
															Class63.anInt1388 += i_22_;
														}
														if (((i_18_
																+ (i_15_ - -32) ^ 0xffffffff) < ((Class12_Sub12_Sub7.anInt2276) ^ 0xffffffff))
																&& ((-(class12_sub12_sub3_21_.anInt2111) + (class12_sub12_sub3_21_.anInt2138)) > (class12_sub12_sub3_21_.anInt2143))) {
															int i_23_ = ((Class12_Sub12_Sub11_Sub6.anInt2903)
																	* (-(Class12_Sub12_Sub7.anInt2276) + (i_18_ + (i_15_ - -32))) / 3);
															if ((i_23_ ^ 0xffffffff) < (((Class12_Sub12_Sub11_Sub6.anInt2903) * 10) ^ 0xffffffff))
																i_23_ = (10 * (Class12_Sub12_Sub11_Sub6.anInt2903));
															if (i_23_ > ((class12_sub12_sub3_21_.anInt2138) + (-(class12_sub12_sub3_21_.anInt2111) - (class12_sub12_sub3_21_.anInt2143))))
																i_23_ = (-(class12_sub12_sub3_21_.anInt2143) + ((class12_sub12_sub3_21_.anInt2138) - class12_sub12_sub3_21_.anInt2111));
															Class63.anInt1388 -= i_23_;
															class12_sub12_sub3_21_.anInt2143 += i_23_;
														}
													}
												}
												if ((class12_sub12_sub7_sub1.anInt2575) == 33
														|| ((class12_sub12_sub3.anIntArray2149[i_12_]) ^ 0xffffffff) != -2) {
													int i_24_ = (class12_sub12_sub3.anIntArray2149[i_12_]);
													Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055
															.method400(
																	(Class32.method704(
																			i_24_,
																			arg6 ^ 0xb)),
																	i_17_
																			+ (i_16_ + 1),
																	i_18_
																			+ 10
																			+ i_15_,
																	0);
													Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055
															.method400(
																	(Class32.method704(
																			i_24_,
																			81)),
																	i_16_
																			+ i_17_,
																	i_18_
																			+ (i_15_ + 9),
																	16776960);
												}
											}
										}
									}
									i_12_++;
								}
							}
						} else if (class12_sub12_sub3.anInt2141 == 3) {
							int i_25_;
							if (Class27.method670(class12_sub12_sub3, 47)) {
								i_25_ = class12_sub12_sub3.anInt2167;
								if (Class29.method687(i, (byte) -45, arg3)
										&& (class12_sub12_sub3.anInt2165 ^ 0xffffffff) != -1)
									i_25_ = class12_sub12_sub3.anInt2165;
							} else {
								i_25_ = class12_sub12_sub3.anInt2186;
								if (Class29.method687(i, (byte) -45, arg3)
										&& (class12_sub12_sub3.anInt2136 ^ 0xffffffff) != -1)
									i_25_ = class12_sub12_sub3.anInt2136;
							}
							if ((class12_sub12_sub3.anInt2120 ^ 0xffffffff) != -1) {
								if (!class12_sub12_sub3.aBoolean2177)
									Class12_Sub12_Sub7
											.method340(
													i_10_,
													i_11_,
													class12_sub12_sub3.anInt2121,
													class12_sub12_sub3.anInt2111,
													i_25_,
													256 - (0xff & (class12_sub12_sub3.anInt2120)));
								else
									Class12_Sub12_Sub7
											.method350(
													i_10_,
													i_11_,
													class12_sub12_sub3.anInt2121,
													class12_sub12_sub3.anInt2111,
													i_25_,
													(-(0xff & class12_sub12_sub3.anInt2120) + 256));
							} else if (class12_sub12_sub3.aBoolean2177)
								Class12_Sub12_Sub7.method347(i_10_, i_11_,
										class12_sub12_sub3.anInt2121,
										class12_sub12_sub3.anInt2111, i_25_);
							else
								Class12_Sub12_Sub7.method339(i_10_, i_11_,
										class12_sub12_sub3.anInt2121,
										class12_sub12_sub3.anInt2111, i_25_);
						} else if ((class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -5) {
							Class12_Sub12_Sub7_Sub4 class12_sub12_sub7_sub4 = (Class64.aClass12_Sub12_Sub7_Sub4Array1438[class12_sub12_sub3.anInt2160]);
							RSString class59 = class12_sub12_sub3.aClass59_2130;
							int i_26_;
							if (Class27.method670(class12_sub12_sub3,
									arg6 ^ 0x2e)) {
								i_26_ = class12_sub12_sub3.anInt2167;
								if (Class29.method687(i, (byte) -45, arg3)
										&& class12_sub12_sub3.anInt2165 != 0)
									i_26_ = class12_sub12_sub3.anInt2165;
								if (class12_sub12_sub3.aClass59_2150
										.length() > 0)
									class59 = class12_sub12_sub3.aClass59_2150;
							} else {
								i_26_ = class12_sub12_sub3.anInt2186;
								if (Class29.method687(i, (byte) -45, arg3)
										&& (class12_sub12_sub3.anInt2136 ^ 0xffffffff) != -1)
									i_26_ = class12_sub12_sub3.anInt2136;
							}
							if (class12_sub12_sub3.anInt2145 == 6
									&& Class12_Sub12_Sub16.aBoolean2559) {
								i_26_ = class12_sub12_sub3.anInt2186;
								class59 = Class12_Sub12_Sub16.aClass59_2552;
							}
							if ((Class12_Sub12_Sub7.anInt2282 ^ 0xffffffff) == -480) {
								if ((i_26_ ^ 0xffffffff) == -16776961)
									i_26_ = 255;
								if ((i_26_ ^ 0xffffffff) == -49153)
									i_26_ = 16777215;
							}
							class59 = (Class12_Sub12_Sub15.method547(
									class12_sub12_sub3, -1, class59));
							class12_sub12_sub7_sub4.method398(class59, i_10_,
									i_11_, class12_sub12_sub3.anInt2121,
									class12_sub12_sub3.anInt2111, i_26_,
									class12_sub12_sub3.aBoolean2153,
									class12_sub12_sub3.anInt2122,
									class12_sub12_sub3.anInt2181,
									class12_sub12_sub3.anInt2117);
						} else if (class12_sub12_sub3.anInt2141 == 5) {
							Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = (class12_sub12_sub3
									.method296(Class27.method670(
											class12_sub12_sub3, 109), arg6
											+ -169));
							if (class12_sub12_sub7_sub1 == null) {
								if (Class10.aBoolean224)
									bool = false;
							} else
								class12_sub12_sub7_sub1.method352(i_10_, i_11_);
						} else if ((class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -7) {
							Class12_Sub12_Sub7_Sub3.method372(
									class12_sub12_sub3.anInt2121 / 2 + i_10_,
									class12_sub12_sub3.anInt2111 / 2 + i_11_);
							int i_27_ = ((class12_sub12_sub3.anInt2139 * (Class12_Sub12_Sub7_Sub3.anIntArray2596[class12_sub12_sub3.anInt2147])) >> -213898960);
							int i_28_ = ((class12_sub12_sub3.anInt2139 * (Class12_Sub12_Sub7_Sub3.anIntArray2602[class12_sub12_sub3.anInt2147])) >> 769487984);
							boolean bool_29_ = Class27.method670(
									class12_sub12_sub3, -120);
							int i_30_;
							if (!bool_29_)
								i_30_ = class12_sub12_sub3.anInt2142;
							else
								i_30_ = class12_sub12_sub3.anInt2129;
							Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4;
							if ((class12_sub12_sub3.anInt2114 ^ 0xffffffff) == -6)
								class12_sub12_sub11_sub4 = Class49.aClass42_1140
										.method761(false, -1, null, null, -1);
							else if (i_30_ != -1) {
								Class12_Sub12_Sub4 class12_sub12_sub4 = Class5
										.method74(arg6 ^ 0x6a, i_30_);
								class12_sub12_sub11_sub4 = (class12_sub12_sub3
										.method298(
												bool_29_,
												(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass42_2954),
												-1,
												class12_sub12_sub3.anInt2132,
												class12_sub12_sub4));
								if (class12_sub12_sub11_sub4 == null
										&& Class10.aBoolean224)
									bool = false;
							} else {
								class12_sub12_sub11_sub4 = (class12_sub12_sub3
										.method298(
												bool_29_,
												(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass42_2954),
												arg6 ^ ~0x63, -1, null));
								if (class12_sub12_sub11_sub4 == null
										&& Class10.aBoolean224)
									bool = false;
							}
							if (class12_sub12_sub11_sub4 != null)
								class12_sub12_sub11_sub4.method492(0,
										class12_sub12_sub3.anInt2123, 0,
										class12_sub12_sub3.anInt2147, 0, i_27_,
										i_28_);
							Class12_Sub12_Sub7_Sub3.method384();
						} else {
							if ((class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -8) {
								Class12_Sub12_Sub7_Sub4 class12_sub12_sub7_sub4 = (Class64.aClass12_Sub12_Sub7_Sub4Array1438[class12_sub12_sub3.anInt2160]);
								int i_31_ = 0;
								for (int i_32_ = 0; ((i_32_ ^ 0xffffffff) > (class12_sub12_sub3.anInt2111 ^ 0xffffffff)); i_32_++) {
									for (int i_33_ = 0; ((class12_sub12_sub3.anInt2121 ^ 0xffffffff) < (i_33_ ^ 0xffffffff)); i_33_++) {
										if ((class12_sub12_sub3.anIntArray2140[i_31_]) > 0) {
											Class12_Sub12_Sub15 class12_sub12_sub15 = (Class12_Sub12_Sub11_Sub5
													.method502(
															(byte) 121,
															-1
																	+ (class12_sub12_sub3.anIntArray2140[i_31_])));
											RSString class59 = (class12_sub12_sub15.aClass59_2480);
											if (class59 == null)
												class59 = Class44.aClass59_1050;
											if ((class12_sub12_sub15.aBoolean2473)
													|| ((class12_sub12_sub3.anIntArray2149[i_31_]) ^ 0xffffffff) != -2)
												class59 = (Statics
														.method251(
																(byte) -48,
																(new RSString[] {
																		class59,
																		(Class47.aClass59_1096),
																		(Class64_Sub1
																				.method987(
																						(byte) -76,
																						(class12_sub12_sub3.anIntArray2149[i_31_]))) })));
											int i_34_ = (i_10_ - -(((class12_sub12_sub3.anInt2151) + 115) * i_33_));
											int i_35_ = (i_11_ + ((12 + (class12_sub12_sub3.anInt2133)) * i_32_));
											if ((class12_sub12_sub3.anInt2122 ^ 0xffffffff) != -1)
												class12_sub12_sub7_sub4
														.method406(
																class59,
																i_34_,
																i_35_,
																(class12_sub12_sub3.anInt2186),
																(class12_sub12_sub3.aBoolean2153));
											else
												class12_sub12_sub7_sub4
														.method395(
																class59,
																(i_34_ + (class12_sub12_sub3.anInt2121) / 2),
																i_35_,
																(class12_sub12_sub3.anInt2186),
																(class12_sub12_sub3.aBoolean2153));
										}
										i_31_++;
									}
								}
							}
							if (((class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -9)
									&& Class5.method75(i, (byte) -66, arg3)
									&& Class30.anInt747 == Class41.anInt961) {
								int i_36_ = 0;
								int i_37_ = 0;
								Class12_Sub12_Sub7_Sub4 class12_sub12_sub7_sub4 = (Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529);
								RSString class59 = class12_sub12_sub3.aClass59_2130;
								class59 = (Class12_Sub12_Sub15.method547(
										class12_sub12_sub3, arg6 + -100,
										class59));
								while ((class59.length() ^ 0xffffffff) < -1) {
									int i_38_ = class59.method930(-2,
											(Class10.aClass59_246));
									RSString class59_39_;
									if (i_38_ != -1) {
										class59_39_ = class59.method937(i_38_,
												true, 0);
										class59 = class59.method945(63, i_38_
												- -2);
									} else {
										class59_39_ = class59;
										class59 = Class11.aClass59_310;
									}
									int i_40_ = class12_sub12_sub7_sub4
											.method393(class59_39_);
									i_37_ += 1 + (class12_sub12_sub7_sub4.anInt2613);
									if ((i_36_ ^ 0xffffffff) > (i_40_ ^ 0xffffffff))
										i_36_ = i_40_;
								}
								i_37_ += 7;
								i_36_ += 6;
								int i_41_ = (i_11_
										- -class12_sub12_sub3.anInt2111 - -5);
								int i_42_ = (-i_36_ + -5 + (class12_sub12_sub3.anInt2121 + i_10_));
								if ((i_10_ + 5 ^ 0xffffffff) < (i_42_ ^ 0xffffffff))
									i_42_ = i_10_ + 5;
								if ((i_41_ - -i_37_ ^ 0xffffffff) < (arg7 ^ 0xffffffff))
									i_41_ = arg7 - i_37_;
								if (arg1 < i_36_ + i_42_)
									i_42_ = -i_36_ + arg1;
								Class12_Sub12_Sub7.method347(i_42_, i_41_,
										i_36_, i_37_, 16777120);
								Class12_Sub12_Sub7.method339(i_42_, i_41_,
										i_36_, i_37_, 0);
								class59 = class12_sub12_sub3.aClass59_2130;
								int i_43_ = (class12_sub12_sub7_sub4.anInt2613
										+ i_41_ - -2);
								class59 = (Class12_Sub12_Sub15.method547(
										class12_sub12_sub3, -1, class59));
								while (class59.length() > 0) {
									int i_44_ = class59.method930(-2,
											(Class10.aClass59_246));
									RSString class59_45_;
									if ((i_44_ ^ 0xffffffff) != 0) {
										class59_45_ = class59.method937(i_44_,
												true, 0);
										class59 = class59.method945(63,
												i_44_ + 2);
									} else {
										class59_45_ = class59;
										class59 = Class11.aClass59_310;
									}
									class12_sub12_sub7_sub4.method406(
											class59_45_, 3 + i_42_, i_43_, 0,
											false);
									i_43_ += (class12_sub12_sub7_sub4.anInt2613 - -1);
								}
							}
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("hd.C(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ',' + arg7 + ',' + arg8 + ')'));
		}
	}

	public static boolean method323(boolean arg0, boolean arg1, Signlink arg2,
			int arg3) {
		try {
			anInt2232++;
			if (!Class12_Sub12_Sub9.method417(arg0, arg2, -95))
				return false;
			if (arg1 != true)
				return false;
			if (arg3 > 0)
				Class58.aClass27_1344 = new Class27(arg3);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("hd.D(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ')'));
		}
	}

	public static void method324(boolean arg0) {
		int i = ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691 >> 1625794695) - -Class64.anInt1451);
		anInt2242++;
		int i_46_ = (Class8.anInt174 + (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683 >> 1305758919));
		RSCanvas.anInt46 = 0;
		if ((i ^ 0xffffffff) <= -3054 && i <= 3156 && i_46_ >= 3056
				&& i_46_ <= 3136)
			RSCanvas.anInt46 = 1;
		if (arg0 != false)
			method321(-39, (byte) -53);
		if (i >= 3072 && (i ^ 0xffffffff) >= -3119
				&& (i_46_ ^ 0xffffffff) <= -9493
				&& (i_46_ ^ 0xffffffff) >= -9536)
			RSCanvas.anInt46 = 1;
		if ((RSCanvas.anInt46 ^ 0xffffffff) == -2 && i >= 3139 && i <= 3199
				&& (i_46_ ^ 0xffffffff) <= -3009 && i_46_ <= 3062)
			RSCanvas.anInt46 = 0;
	}

	public static void method325(byte arg0) {
		try {
			aClass59_2245 = null;
			aCanvas2243 = null;
			anIntArrayArrayArray2246 = null;
			anIntArray2238 = null;
			int i = -25 / ((45 - arg0) / 61);
			aClass27_2236 = null;
			aClass59_2244 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hd.F(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub5(Class26 arg0, Class26 arg1, int arg2, boolean arg3) {
		try {
			Class8 class8 = new Class8();
			int i = arg0.method645(arg2, false);
			aClass37Array2247 = new Class37[i];
			int[] is = arg0.method651(arg2, 93);
			for (int i_47_ = 0; is.length > i_47_; i_47_++) {
				byte[] is_48_ = arg0.method631(arg2, true, is[i_47_]);
				int i_49_ = 0xff00 & is_48_[0] << -463599192 | 0xff & is_48_[1];
				Class12_Sub4 class12_sub4 = (Class12_Sub4) class8
						.method91((byte) 86);
				Class12_Sub4 class12_sub4_50_ = null;
				for (/**/; class12_sub4 != null; class12_sub4 = (Class12_Sub4) class8
						.method100(-29860)) {
					if (class12_sub4.anInt1667 == i_49_) {
						class12_sub4_50_ = class12_sub4;
						break;
					}
				}
				if (class12_sub4_50_ == null) {
					byte[] is_51_;
					if (arg3)
						is_51_ = arg1.method637(i_49_, 18054, 0);
					else
						is_51_ = arg1.method637(0, 18054, i_49_);
					class12_sub4_50_ = new Class12_Sub4(i_49_, is_51_);
					class8.method98(class12_sub4_50_, (byte) 79);
				}
				aClass37Array2247[is[i_47_]] = new Class37(is_48_,
						class12_sub4_50_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("hd.<init>("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	static {
		aClass27_2236 = new Class27(260);
		aClass59_2244 = Class55.method898("Choose Option", -10983);
		aClass59_2245 = aClass59_2244;
		anIntArrayArrayArray2246 = new int[4][13][13];
		aBoolean2248 = false;
	}
}
