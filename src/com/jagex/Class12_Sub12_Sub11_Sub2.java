package com.jagex;/* com.jagex.Class12_Sub12_Sub11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.util.Statics;

public abstract class Class12_Sub12_Sub11_Sub2 extends Class12_Sub12_Sub11 {
	public int anInt2662;
	public int anInt2663;
	public static int anInt2664;
	public int anInt2665;
	public int anInt2666;
	public int anInt2667;
	public int anInt2668;
	public int anInt2669;
	public int anInt2670 = 0;
	public int[] anIntArray2671;
	public int anInt2672;
	public int anInt2673;
	public int anInt2674;
	public int anInt2675;
	public int anInt2676;
	public int anInt2677;
	public RSString aClass59_2678 = null;
	public int anInt2679 = -1;
	public int anInt2680;
	public int anInt2681;
	public int anInt2682;
	public int anInt2683;
	public static RSString aClass59_2684;
	public static RSString aClass59_2685;
	public int anInt2686;
	public int anInt2687;
	public static int[] anIntArray2688;
	public int anInt2689;
	public int anInt2690;
	public int anInt2691;
	public int anInt2692;
	public static int anInt2693;
	public int anInt2694;
	public static int anInt2695;
	public static Class48 aClass48_2696;
	public static int anInt2697;
	public int anInt2698;
	public static int anInt2699;
	public int anInt2700;
	public int anInt2701;
	public int[] anIntArray2702;
	public static Class12_Sub12_Sub3 aClass12_Sub12_Sub3_2703;
	public static RSString aClass59_2704;
	public int anInt2705;
	public int anInt2706;
	public static int anInt2707 = -1;
	public int[] anIntArray2708;
	public int anInt2709;
	public int anInt2710;
	public int anInt2711;
	public boolean[] aBooleanArray2712;
	public int anInt2713;
	public int anInt2714;
	public static int anInt2715;
	public int[] anIntArray2716;
	public int anInt2717;
	public int anInt2718;
	public int anInt2719;
	public int[] anIntArray2720;
	public int anInt2721;
	public static int anInt2722;
	public boolean aBoolean2723;
	public int anInt2724;
	public int anInt2725;
	public int anInt2726;
	public int anInt2727;
	public int anInt2728;
	public static int anInt2729;
	public int anInt2730;
	public static int anInt2731;
	public static int anInt2732;
	public static int anInt2733;
	public int anInt2734;

	public void method445(int arg0, int arg1, boolean arg2) {
		try {
			anInt2695++;
			int i = anIntArray2671[0];
			int i_0_ = anIntArray2708[0];
			if (arg1 == 64) {
				if (anInt2734 != -1
						&& (Class5.method74(9, anInt2734).anInt2198 ^ 0xffffffff) == -2)
					anInt2734 = -1;
				if (arg0 == 0) {
					i++;
					i_0_--;
				}
				if (arg0 == 1)
					i++;
				if ((arg0 ^ 0xffffffff) == -3) {
					i++;
					i_0_++;
				}
				if (anInt2665 < 9)
					anInt2665++;
				if ((arg0 ^ 0xffffffff) == -4)
					i_0_--;
				if (arg0 == 4)
					i_0_++;
				if (arg0 == 5) {
					i--;
					i_0_--;
				}
				if ((arg0 ^ 0xffffffff) == -7)
					i--;
				for (int i_1_ = anInt2665; (i_1_ ^ 0xffffffff) < -1; i_1_--) {
					anIntArray2708[i_1_] = anIntArray2708[i_1_ - 1];
					anIntArray2671[i_1_] = anIntArray2671[-1 + i_1_];
					aBooleanArray2712[i_1_] = aBooleanArray2712[-1 + i_1_];
				}
				if (arg0 == 7) {
					i_0_++;
					i--;
				}
				anIntArray2708[0] = i_0_;
				anIntArray2671[0] = i;
				aBooleanArray2712[0] = arg2;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ed.F(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method446(int arg0) {
		try {
			anInt2714 = 0;
			anInt2665 = 0;
			if (arg0 >= -88)
				aBooleanArray2712 = null;
			anInt2693++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ed.I(" + arg0 + ')');
		}
	}

	public static void method447(int arg0, int arg1) {
		anInt2664++;
		int i = Class39.method745(arg1, false).anInt2551;
		if ((i ^ 0xffffffff) != -1) {
			int i_2_ = Class12_Sub12_Sub12.anIntArray2414[arg1];
			if (i == 1) {
				if (i_2_ == 1) {
					Class12_Sub12_Sub7_Sub3.method373(0.9);
					((Class7) Class12_Sub12_Sub7_Sub3.anInterface3_2607)
							.method84(0.9, true);
				}
				if ((i_2_ ^ 0xffffffff) == -3) {
					Class12_Sub12_Sub7_Sub3.method373(0.8);
					((Class7) Class12_Sub12_Sub7_Sub3.anInterface3_2607)
							.method84(0.8, true);
				}
				if ((i_2_ ^ 0xffffffff) == -4) {
					Class12_Sub12_Sub7_Sub3.method373(0.7);
					((Class7) Class12_Sub12_Sub7_Sub3.anInterface3_2607)
							.method84(0.7, true);
				}
				if ((i_2_ ^ 0xffffffff) == -5) {
					Class12_Sub12_Sub7_Sub3.method373(0.6);
					((Class7) Class12_Sub12_Sub7_Sub3.anInterface3_2607)
							.method84(0.6, true);
				}
				Class12_Sub12_Sub11.method438(arg0 + -8);
				Class27.aBoolean642 = true;
			}
			if ((i ^ 0xffffffff) == -4) {
				int i_3_ = 0;
				if ((i_2_ ^ 0xffffffff) == -1)
					i_3_ = 255;
				if (i_2_ == 1)
					i_3_ = 192;
				if (i_2_ == 2)
					i_3_ = 128;
				if ((i_2_ ^ 0xffffffff) == -4)
					i_3_ = 64;
				if (i_2_ == 4)
					i_3_ = 0;
				if ((i_3_ ^ 0xffffffff) != (Class30.anInt744 ^ 0xffffffff)) {
					if (Class30.anInt744 != 0 || Class28.anInt672 == -1) {
						if ((i_3_ ^ 0xffffffff) != -1)
							Class12_Sub4.method158(i_3_, 17324);
						else {
							Class11.method137(false);
							Class12_Sub12_Sub11.anInt2386 = 0;
						}
					} else {
						Class11.method138(i_3_, Class28.anInt672,
								(Cache.midiSongsArchive),
								0, 0, (byte) -123, false);
						Class12_Sub12_Sub11.anInt2386 = 0;
					}
					Class30.anInt744 = i_3_;
				}
			}
			if ((i ^ 0xffffffff) == -5) {
				if (i_2_ == 0)
					Class55.anInt1308 = 127;
				if (i_2_ == 1)
					Class55.anInt1308 = 96;
				if ((i_2_ ^ 0xffffffff) == -3)
					Class55.anInt1308 = 64;
				if (i_2_ == 3)
					Class55.anInt1308 = 32;
				if ((i_2_ ^ 0xffffffff) == -5)
					Class55.anInt1308 = 0;
			}
			if (i == arg0) {
				Class35.anInt862 = i_2_;
				Class8.aBoolean182 = true;
			}
			if (i == 5)
				Class43.anInt1016 = i_2_;
			if (i == 6)
				Class47.anInt1089 = i_2_;
			if ((i ^ 0xffffffff) == -10)
				Class39.anInt936 = i_2_;
		}
	}

	public void method448(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt2733++;
			for (int i = arg1; (i ^ 0xffffffff) > -5; i++) {
				if ((anIntArray2720[i] ^ 0xffffffff) >= (arg0 ^ 0xffffffff)) {
					anIntArray2702[i] = arg2;
					anIntArray2716[i] = arg3;
					anIntArray2720[i] = 70 + arg0;
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ed.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method449(boolean arg0) {
		try {
			aClass48_2696 = null;
			aClass59_2684 = null;
			aClass59_2704 = null;
			if (arg0 != false)
				method451((byte) 62);
			anIntArray2688 = null;
			aClass59_2685 = null;
			aClass12_Sub12_Sub3_2703 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ed.C(" + arg0 + ')');
		}
	}

	public static void method450(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9,
			int arg10) {
		try {
			anInt2699++;
			if (Class15.method589(arg7, 14585)
					&& (arg4 <= arg2 && arg0 <= arg10 && arg2 < arg5 && arg10 < arg9)) {
				Class12_Sub12_Sub3[] class12_sub12_sub3s = (Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg7]);
				int i = 0;
				if (arg8 != true)
					anInt2707 = 107;
				for (/**/; (i ^ 0xffffffff) > (class12_sub12_sub3s.length ^ 0xffffffff); i++) {
					Class12_Sub12_Sub3 class12_sub12_sub3 = class12_sub12_sub3s[i];
					if (class12_sub12_sub3 != null
							&& (arg6 ^ 0xffffffff) == (class12_sub12_sub3.anInt2107 ^ 0xffffffff)) {
						int i_4_ = arg4 + class12_sub12_sub3.anInt2171;
						int i_5_ = -arg1 + class12_sub12_sub3.anInt2166 - -arg0;
						if ((class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -9
								&& arg2 >= i_4_
								&& i_5_ <= arg10
								&& ((arg2 ^ 0xffffffff) > (class12_sub12_sub3.anInt2121
										+ i_4_ ^ 0xffffffff))
								&& (i_5_ - -class12_sub12_sub3.anInt2111 ^ 0xffffffff) < (arg10 ^ 0xffffffff))
							anInt2707 = i;
						if (((class12_sub12_sub3.anInt2179 ^ 0xffffffff) <= -1 || ((class12_sub12_sub3.anInt2136 ^ 0xffffffff) != -1))
								&& arg2 >= i_4_
								&& i_5_ <= arg10
								&& ((arg2 ^ 0xffffffff) > (i_4_
										- -class12_sub12_sub3.anInt2121 ^ 0xffffffff))
								&& arg10 < i_5_ - -class12_sub12_sub3.anInt2111) {
							if ((class12_sub12_sub3.anInt2179 ^ 0xffffffff) > -1)
								Class56.anInt1316 = i;
							else
								Class56.anInt1316 = class12_sub12_sub3.anInt2179;
						}
						if ((class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -1) {
							if (!class12_sub12_sub3.aBoolean2169
									|| Class29.method687(i, (byte) -45, arg3)
									|| Class36.aBoolean887) {
								method450(i_5_, class12_sub12_sub3.anInt2143,
										arg2, arg3, i_4_, i_4_
												+ class12_sub12_sub3.anInt2121,
										i, arg7, true,
										i_5_ - -class12_sub12_sub3.anInt2111,
										arg10);
								if ((class12_sub12_sub3.anInt2111 ^ 0xffffffff) > (class12_sub12_sub3.anInt2138 ^ 0xffffffff))
									Class56.method902(
											arg10,
											class12_sub12_sub3.anInt2111,
											-55,
											arg3,
											i_4_
													- -class12_sub12_sub3.anInt2121,
											class12_sub12_sub3, arg2, i_5_,
											class12_sub12_sub3.anInt2138);
							}
						} else {
							if (((class12_sub12_sub3.anInt2145 ^ 0xffffffff) == -2)
									&& (arg2 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff)
									&& (i_5_ ^ 0xffffffff) >= (arg10 ^ 0xffffffff)
									&& arg2 < i_4_
											+ class12_sub12_sub3.anInt2121
									&& (class12_sub12_sub3.anInt2111 + i_5_ > arg10)) {
								boolean bool = false;
								if ((class12_sub12_sub3.anInt2180 ^ 0xffffffff) != -1)
									bool = Class31.method698(
											class12_sub12_sub3, 91);
								if (!bool) {
									Class64.method977(i + (arg7 << -258677360),
											0, 8, 0,
											(class12_sub12_sub3.aClass59_2146),
											-116);
									Class12_Sub12_Sub2.anInt2102++;
								}
							}
							if (class12_sub12_sub3.anInt2145 == 2
									&& Class12.anInt315 == 0
									&& arg2 >= i_4_
									&& (i_5_ ^ 0xffffffff) >= (arg10 ^ 0xffffffff)
									&& i_4_ + class12_sub12_sub3.anInt2121 > arg2
									&& (class12_sub12_sub3.anInt2111 + i_5_ > arg10)) {
								Class12_Sub12.anInt1853++;
								Class64.method977(
										i + (arg7 << 78304912),
										0,
										4,
										0,
										(Statics
												.method251(
														(byte) -72,
														(new RSString[] {
																(class12_sub12_sub3.aClass59_2131),
																(Class12_Sub7.aClass59_1731),
																(class12_sub12_sub3.aClass59_2116) }))),
										-74);
							}
							if (class12_sub12_sub3.anInt2145 == 3
									&& arg2 >= i_4_
									&& (arg10 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)
									&& ((arg2 ^ 0xffffffff) > (i_4_
											- -class12_sub12_sub3.anInt2121 ^ 0xffffffff))
									&& (i_5_ + class12_sub12_sub3.anInt2111 ^ 0xffffffff) < (arg10 ^ 0xffffffff)) {
								int i_6_;
								if ((arg3 ^ 0xffffffff) == -4)
									i_6_ = 28;
								else
									i_6_ = 51;
								Class64.method977(i + (arg7 << -1561130032), 0,
										i_6_, 0, Class35.aClass59_872, -43);
								Class12_Sub12_Sub3.anInt2164++;
							}
							if (class12_sub12_sub3.anInt2145 == 4
									&& arg2 >= i_4_
									&& arg10 >= i_5_
									&& arg2 < i_4_
											+ class12_sub12_sub3.anInt2121
									&& (class12_sub12_sub3.anInt2111 + i_5_ ^ 0xffffffff) < (arg10 ^ 0xffffffff)) {
								Class31.anInt769++;
								Class64.method977(i + (arg7 << 1127591536), 0,
										43, 0,
										(class12_sub12_sub3.aClass59_2146), -49);
							}
							if (((class12_sub12_sub3.anInt2145 ^ 0xffffffff) == -6)
									&& arg2 >= i_4_
									&& arg10 >= i_5_
									&& arg2 < i_4_
											- -class12_sub12_sub3.anInt2121
									&& (i_5_ + class12_sub12_sub3.anInt2111 ^ 0xffffffff) < (arg10 ^ 0xffffffff)) {
								Class12_Sub12_Sub11_Sub1.anInt2640++;
								Class64.method977((arg7 << 1481734864) - -i, 0,
										32, 0,
										(class12_sub12_sub3.aClass59_2146), -83);
							}
							if (class12_sub12_sub3.anInt2145 == 6
									&& !Class12_Sub12_Sub16.aBoolean2559 == true
									&& arg2 >= i_4_
									&& (arg10 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)
									&& (class12_sub12_sub3.anInt2121 + i_4_ ^ 0xffffffff) < (arg2 ^ 0xffffffff)
									&& (class12_sub12_sub3.anInt2111 + i_5_ ^ 0xffffffff) < (arg10 ^ 0xffffffff)) {
								Class33.anInt814++;
								Class64.method977(i + (arg7 << 1357464112), 0,
										22, 0,
										(class12_sub12_sub3.aClass59_2146), -74);
							}
							if ((class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -3) {
								int i_7_ = 0;
								for (int i_8_ = 0; class12_sub12_sub3.anInt2111 > i_8_; i_8_++) {
									for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (class12_sub12_sub3.anInt2121 ^ 0xffffffff)); i_9_++) {
										int i_10_ = i_4_
												- -(((class12_sub12_sub3.anInt2151) + 32) * i_9_);
										int i_11_ = (i_5_ + i_8_
												* ((class12_sub12_sub3.anInt2133) + 32));
										if ((i_7_ ^ 0xffffffff) > -21) {
											i_11_ += (class12_sub12_sub3.anIntArray2182[i_7_]);
											i_10_ += (class12_sub12_sub3.anIntArray2163[i_7_]);
										}
										if (((i_10_ ^ 0xffffffff) >= (arg2 ^ 0xffffffff))
												&& ((arg10 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff))
												&& 32 + i_10_ > arg2
												&& ((i_11_ + 32 ^ 0xffffffff) < (arg10 ^ 0xffffffff))) {
											Class8.anInt175 = i
													+ (arg7 << -1358535664);
											Archive.anInt1904 = i_7_;
											if ((class12_sub12_sub3.anIntArray2140[i_7_]) > 0) {
												Class12_Sub12_Sub15 class12_sub12_sub15 = (Class12_Sub12_Sub11_Sub5
														.method502(
																(byte) 121,
																(class12_sub12_sub3.anIntArray2140[i_7_])
																		+ -1));
												if ((Class12_Sub12_Sub11_Sub5.anInt2848) != 1
														|| !(class12_sub12_sub3.aBoolean2135)) {
													if (Class12.anInt315 == 1
															&& (class12_sub12_sub3.aBoolean2135)) {
														if ((0x10 & (Class55.anInt1289)) == 16) {
															Class64.method977(
																	((arg7 << -1692256496) + i),
																	i_7_,
																	49,
																	(class12_sub12_sub15.anInt2497),
																	(Statics
																			.method251(
																					(byte) -98,
																					(new RSString[] {
																							(Class12_Sub12_Sub9.aClass59_2354),
																							(RSCanvas.aClass59_62),
																							(class12_sub12_sub15.aClass59_2480) }))),
																	-102);
															Archive.anInt1895++;
														}
													} else {
														Class12_Sub12_Sub16.anInt2547++;
														RSString[] class59s = (class12_sub12_sub15.aClass59Array2500);
														if (Class12_Sub1.aBoolean1615)
															class59s = (Class27
																	.method674(
																			-67,
																			class59s));
														if (class12_sub12_sub3.aBoolean2135) {
															for (int i_12_ = 4; i_12_ >= 3; i_12_--) {
																if ((class59s != null)
																		&& ((class59s[i_12_]) != null)) {
																	Class41.anInt967++;
																	int i_13_;
																	if (i_12_ == 3)
																		i_13_ = 18;
																	else
																		i_13_ = 36;
																	Class64.method977(
																			((arg7 << 121783024) + i),
																			i_7_,
																			i_13_,
																			(class12_sub12_sub15.anInt2497),
																			(Statics
																					.method251(
																							(byte) -52,
																							(new RSString[] {
																									class59s[i_12_],
																									RuntimeException_Sub1.aClass59_1467,
																									class12_sub12_sub15.aClass59_2480 }))),
																			-53);
																} else if ((i_12_ ^ 0xffffffff) == -5) {
																	Class17.anInt416++;
																	Class64.method977(
																			((arg7 << -1765774512) - -i),
																			i_7_,
																			36,
																			(class12_sub12_sub15.anInt2497),
																			(Statics
																					.method251(
																							(byte) -65,
																							(new RSString[] {
																									Class12_Sub12_Sub11_Sub5.aClass59_2860,
																									RuntimeException_Sub1.aClass59_1467,
																									class12_sub12_sub15.aClass59_2480 }))),
																			-55);
																}
															}
														}
														if (class12_sub12_sub3.aBoolean2162) {
															Class64.method977(
																	((arg7 << -1902670576) + i),
																	i_7_,
																	27,
																	(class12_sub12_sub15.anInt2497),
																	(Statics
																			.method251(
																					(byte) -64,
																					(new RSString[] {
																							(RSString.aClass59_1525),
																							(RuntimeException_Sub1.aClass59_1467),
																							(class12_sub12_sub15.aClass59_2480) }))),
																	-61);
															Class1.anInt79++;
														}
														if ((class12_sub12_sub3.aBoolean2135)
																&& (class59s != null)) {
															for (int i_14_ = 2; i_14_ >= 0; i_14_--) {
																if ((class59s[i_14_]) != null) {
																	Class17.anInt412++;
																	int i_15_ = 0;
																	if ((i_14_ ^ 0xffffffff) == -1)
																		i_15_ = 16;
																	if ((i_14_ ^ 0xffffffff) == -2)
																		i_15_ = 11;
																	if ((i_14_ ^ 0xffffffff) == -3)
																		i_15_ = 20;
																	Class64.method977(
																			((arg7 << 1260202384) - -i),
																			i_7_,
																			i_15_,
																			(class12_sub12_sub15.anInt2497),
																			(Statics
																					.method251(
																							(byte) -125,
																							(new RSString[] {
																									class59s[i_14_],
																									RuntimeException_Sub1.aClass59_1467,
																									class12_sub12_sub15.aClass59_2480 }))),
																			-126);
																}
															}
														}
														class59s = (class12_sub12_sub3.aClass59Array2137);
														if (Class12_Sub1.aBoolean1615)
															class59s = (Class27
																	.method674(
																			-120,
																			class59s));
														if (class59s != null) {
															for (int i_16_ = 4; i_16_ >= 0; i_16_--) {
																if ((class59s[i_16_]) != null) {
																	int i_17_ = 0;
																	Class7.anInt1547++;
																	if (i_16_ == 0)
																		i_17_ = 3;
																	if ((i_16_ ^ 0xffffffff) == -2)
																		i_17_ = 6;
																	if (i_16_ == 2)
																		i_17_ = 38;
																	if (i_16_ == 3)
																		i_17_ = 29;
																	if ((i_16_ ^ 0xffffffff) == -5)
																		i_17_ = 42;
																	Class64.method977(
																			(i + (arg7 << -916979472)),
																			i_7_,
																			i_17_,
																			(class12_sub12_sub15.anInt2497),
																			(Statics
																					.method251(
																							(byte) -98,
																							(new RSString[] {
																									class59s[i_16_],
																									RuntimeException_Sub1.aClass59_1467,
																									class12_sub12_sub15.aClass59_2480 }))),
																			-92);
																}
															}
														}
														Class64.method977(
																i
																		+ (arg7 << -880678192),
																i_7_,
																1006,
																(class12_sub12_sub15.anInt2497),
																(Statics
																		.method251(
																				(byte) -82,
																				(new RSString[] {
																						(Class32.aClass59_801),
																						(RuntimeException_Sub1.aClass59_1467),
																						(class12_sub12_sub15.aClass59_2480) }))),
																-57);
													}
												} else if ((i
														+ (arg7 << 7733456) != (Class9_Sub2.anInt1596))
														|| ((i_7_ ^ 0xffffffff) != ((Class13.anInt352) ^ 0xffffffff))) {
													Class64.method977(
															((arg7 << 637444752) - -i),
															i_7_,
															12,
															(class12_sub12_sub15.anInt2497),
															(Statics
																	.method251(
																			(byte) -41,
																			(new RSString[] {
																					(RSString.aClass59_1525),
																					(Class14.aClass59_371),
																					(Statics.aClass59_565),
																					(RSCanvas.aClass59_62),
																					(class12_sub12_sub15.aClass59_2480) }))),
															-115);
													Class56.anInt1320++;
												}
											}
										}
										i_7_++;
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ed.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ','
					+ arg10 + ')'));
		}
	}

	public static void method451(byte arg0) {
		if (arg0 <= 84)
			aClass12_Sub12_Sub3_2703 = null;
		anInt2697++;
		if (Class64.aClass14_1448 != null) {
			Class64.aClass14_1448.method573();
			Class64.aClass14_1448 = null;
		}
	}

	public boolean method452(int arg0) {
		try {
			if (arg0 != -251272184)
				return false;
			anInt2715++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ed.E(" + arg0 + ')');
		}
	}

	public void method453(int arg0, boolean arg1, boolean arg2, int arg3) {
		try {
			if (arg2 != false)
				anInt2730 = 94;
			if (anInt2734 != -1 && Class5.method74(9, anInt2734).anInt2198 == 1)
				anInt2734 = -1;
			anInt2732++;
			if (!arg1) {
				int i = arg0 - anIntArray2671[0];
				int i_18_ = -anIntArray2708[0] + arg3;
				if ((i_18_ ^ 0xffffffff) <= 7 && (i_18_ ^ 0xffffffff) >= -9
						&& i >= -8 && (i ^ 0xffffffff) >= -9) {
					if (anInt2665 < 9)
						anInt2665++;
					for (int i_19_ = anInt2665; (i_19_ ^ 0xffffffff) < -1; i_19_--) {
						anIntArray2708[i_19_] = anIntArray2708[i_19_ + -1];
						anIntArray2671[i_19_] = anIntArray2671[-1 + i_19_];
						aBooleanArray2712[i_19_] = aBooleanArray2712[-1 + i_19_];
					}
					anIntArray2708[0] = arg3;
					anIntArray2671[0] = arg0;
					aBooleanArray2712[0] = false;
					return;
				}
			}
			anInt2670 = 0;
			anInt2665 = 0;
			anInt2714 = 0;
			anIntArray2708[0] = arg3;
			anIntArray2671[0] = arg0;
			anInt2691 = anInt2727 * 64 + 128 * anIntArray2708[0];
			anInt2683 = anIntArray2671[0] * 128 + anInt2727 * 64;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ed.G(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub2() {
		anInt2675 = 0;
		anInt2669 = 32;
		anInt2673 = 0;
		anInt2676 = -1000;
		anInt2677 = -1;
		anInt2674 = 0;
		anInt2665 = 0;
		anIntArray2702 = new int[4];
		anInt2706 = -1;
		anInt2694 = -1;
		anInt2681 = -1;
		anInt2692 = -1;
		anInt2718 = -1;
		anInt2717 = 0;
		anInt2724 = 0;
		anIntArray2708 = new int[10];
		anInt2701 = 100;
		anInt2714 = 0;
		anInt2726 = 0;
		anInt2709 = 0;
		aBooleanArray2712 = new boolean[10];
		aBoolean2723 = false;
		anInt2725 = 200;
		anIntArray2720 = new int[4];
		anInt2727 = 1;
		anInt2700 = -1;
		anIntArray2716 = new int[4];
		anInt2672 = 0;
		anInt2690 = 0;
		anInt2687 = 0;
		anInt2663 = 0;
		anInt2730 = 0;
		anInt2719 = 0;
		anInt2710 = -1;
		anIntArray2671 = new int[10];
		anInt2734 = -1;
		anInt2662 = -1;
	}

	static {
		anIntArray2688 = new int[25];
		aClass59_2704 = Class55.method898(":", -10983);
		anInt2722 = 0;
		anInt2731 = 0;
		aClass59_2684 = Class55.method898("flash3:", -10983);
		aClass59_2685 = aClass59_2684;
		aClass12_Sub12_Sub3_2703 = new Class12_Sub12_Sub3();
	}
}
