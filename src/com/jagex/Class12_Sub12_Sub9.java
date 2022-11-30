package com.jagex;/* com.jagex.Class12_Sub12_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

public class Class12_Sub12_Sub9 extends Class12_Sub12 {
	public int anInt2303 = -1;
	public int anInt2304;
	public static int anInt2305;
	public static int anInt2306;
	public int anInt2307;
	public int anInt2308 = 0;
	public static int anInt2309;
	public int[] anIntArray2310;
	public static int anInt2311;
	public RSString aClass59_2312;
	public int anInt2313;
	public boolean aBoolean2314;
	public static int anInt2315;
	public int anInt2316;
	public boolean aBoolean2317;
	public int anInt2318 = 1;
	public static int anInt2319;
	public int anInt2320;
	public boolean aBoolean2321 = true;
	public boolean aBoolean2322;
	public int anInt2323;
	public static int[] anIntArray2324 = new int[99];
	public int[] anIntArray2325;
	public int anInt2326;
	public RSString[] aClass59Array2327;
	public static int anInt2328;
	public boolean aBoolean2329;
	public int anInt2330;
	public int[] anIntArray2331;
	public int anInt2332;
	public static int anInt2333;
	public int anInt2334;
	public static int anInt2335;
	public boolean aBoolean2336;
	public boolean aBoolean2337;
	public static int anInt2338;
	public static Buffer aClass12_Sub11_2339;
	public int anInt2340;
	public static long aLong2341 = 0L;
	public static int anInt2342;
	public int anInt2343;
	public int anInt2344;
	public int anInt2345;
	public int anInt2346;
	public static int anInt2347;
	public boolean aBoolean2348;
	public static int anInt2349;
	public int[] anIntArray2350;
	public int anInt2351;
	public boolean aBoolean2352;
	public int[] anIntArray2353;
	public static RSString aClass59_2354 = null;
	public int anInt2355;
	public static boolean aBoolean2356;
	public static RSString aClass59_2357;
	public static RSString aClass59_2358;
	public static int[][] anIntArrayArray2359;
	public static boolean aBoolean2360;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_2361;
	public static int anInt2362;
	public static RSString aClass59_2363;
	public static RSString aClass59_2364;

	public Class12_Sub12_Sub9 method413(boolean arg0) {
		try {
			anInt2309++;
			if (arg0 != false)
				method417(false, null, 110);
			int i = -1;
			if (anInt2303 == -1) {
				if (anInt2326 != -1)
					i = Class12_Sub12_Sub12.anIntArray2414[anInt2326];
			} else
				i = Class43.method777(9, anInt2303);
			if (i < 0
					|| (i ^ 0xffffffff) <= (anIntArray2310.length ^ 0xffffffff)
					|| (anIntArray2310[i] ^ 0xffffffff) == 0)
				return null;
			return RSCanvas.method39(6, anIntArray2310[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "je.B(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub13 method414(int arg0, boolean arg1) {
		try {
			anInt2319++;
			Class12_Sub12_Sub13 class12_sub12_sub13 = ((Class12_Sub12_Sub13) Class64.aClass27_1444
					.method673(108, (long) arg0));
			if (class12_sub12_sub13 != null)
				return class12_sub12_sub13;
			if (arg1 != false)
				method414(-12, true);
			byte[] is = Class20.aClass26_474.method631(1, true, arg0);
			class12_sub12_sub13 = new Class12_Sub12_Sub13();
			if (is != null)
				class12_sub12_sub13
						.method522(new Buffer(is), arg1, arg0);
			class12_sub12_sub13.method532((byte) 60);
			Class64.aClass27_1444.method678((byte) 123, class12_sub12_sub13,
					(long) arg0);
			return class12_sub12_sub13;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "je.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method415(Buffer arg0, byte arg1) {
		anInt2342++;
		for (;;) {
			int i = arg0.readUByte();
			if (i == 0)
				break;
			method423(i, 128, arg0);
		}
		if (arg1 > -95)
			method425(-6, (byte) 33);
	}

	public static void method416(int arg0) {
		try {
			aClass12_Sub12_Sub7_Sub2_2361 = null;
			aClass59_2358 = null;
			aClass12_Sub11_2339 = null;
			aClass59_2354 = null;
			anIntArray2324 = null;
			aClass59_2357 = null;
			aClass59_2363 = null;
			aClass59_2364 = null;
			if (arg0 != 5)
				method419(-29);
			anIntArrayArray2359 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "je.K(" + arg0 + ')');
		}
	}

	public static boolean method417(boolean arg0, Signlink arg1, int arg2) {
		try {
			anInt2333++;
			Class49.anInt1142 = 20;
			try {
				Class5.aClass64_158 = ((Class64) Class.forName(
						"com.jagex.Class64_Sub1_Sub1").newInstance());
				return true;
			} catch (Throwable throwable) {
				Runnable_Impl1 runnable_impl1 = arg1.method873();
				int i = 73 % ((arg2 - -7) / 50);
				if (runnable_impl1 != null) {
					Class5.aClass64_158 = new Class64_Sub1_Sub2(arg1,
							runnable_impl1);
					return true;
				}
				if (arg0) {
					Class5.aClass64_158 = new Class64_Sub2(arg1);
					return true;
				}
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("je.H(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method418(int arg0, int arg1, int arg2,
			Class12_Sub12_Sub4 arg3, int arg4, int arg5, int arg6, int arg7,
			int arg8) {
		try {
			anInt2305++;
			long l;
			if (anIntArray2350 == null)
				l = (long) ((anInt2316 << -787962806) - -arg2);
			else
				l = (long) ((arg4 << 1352446563) + (anInt2316 << -1507496150) + arg2);
			int i = 92 / ((52 - arg5) / 33);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Player.aClass27_2961
					.method673(108, l));
			if (class12_sub12_sub11_sub4 == null) {
				class12_sub12_sub11_sub4 = method427(false, arg4, true, arg2,
						true);
				if (class12_sub12_sub11_sub4 == null)
					return null;
				Player.aClass27_2961.method678(
						(byte) 123, class12_sub12_sub11_sub4, l);
			}
			if (arg3 == null && !aBoolean2322)
				return class12_sub12_sub11_sub4;
			if (arg3 != null)
				class12_sub12_sub11_sub4 = arg3.method307(true,
						class12_sub12_sub11_sub4, arg2, arg6);
			else
				class12_sub12_sub11_sub4 = class12_sub12_sub11_sub4
						.method498(true);
			if (aBoolean2322) {
				int i_0_ = (arg7 + (arg8 + (arg0 + arg1))) / 4;
				for (int i_1_ = 0; class12_sub12_sub11_sub4.anInt2798 > i_1_; i_1_++) {
					int i_2_ = class12_sub12_sub11_sub4.anIntArray2791[i_1_];
					int i_3_ = class12_sub12_sub11_sub4.anIntArray2787[i_1_];
					int i_4_ = (64 + i_3_) * (arg8 + -arg0) / 128 + arg0;
					int i_5_ = arg7 - -((-arg7 + arg1) * (64 + i_3_) / 128);
					int i_6_ = (64 + i_2_) * (-i_4_ + i_5_) / 128 + i_4_;
					class12_sub12_sub11_sub4.anIntArray2802[i_1_] += -i_0_
							+ i_6_;
				}
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("je.G(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')'));
		}
	}

	public static void method419(int arg0) {
		anInt2335++;
		Class44.method779((byte) 76);
		if (Archive.anInt1903 == 1)
			Class23.aClass12_Sub12_Sub7_Sub1Array498[Class12_Sub12_Sub4.anInt2228 / 100]
					.method352(-4 + (-8 + Class33.anInt823), -8
							+ Class49.anInt1149 + -4);
		if (Archive.anInt1903 == 2)
			Class23.aClass12_Sub12_Sub7_Sub1Array498[Class12_Sub12_Sub4.anInt2228 / 100 + 4]
					.method352(-4 + (-8 + Class33.anInt823), -8
							+ Class49.anInt1149 - 4);
		if ((Statics.anInt2028 ^ 0xffffffff) != 0) {
			Class63.method971(Statics.anInt2028, arg0 ^ 0x78be);
			Class12_Sub12_Sub5.method322(0, 512, -1, 4, 0,
					Statics.anInt2028, (byte) 99, 334, 0);
		}
		if ((Class13.anInt343 ^ 0xffffffff) != 0) {
			Class63.method971(Class13.anInt343, -1);
			Class12_Sub12_Sub5.method322(0, 512, -1, 0, 0, Class13.anInt343,
					(byte) 99, 334, 0);
		}
		Class12_Sub12_Sub5.method324(false);
		if (!Class51.aBoolean1202) {
			Class12_Sub2.method154(69);
			Class62_Sub2.method962((byte) 120);
		} else if ((Class9.anInt212 ^ 0xffffffff) == -1)
			Class51.method814((byte) 91);
		if (Class49.anInt1157 == 1)
			Class12_Sub12_Sub11.aClass12_Sub12_Sub7_Sub1_2385.method352(472,
					296);
		if (Class43.aBoolean1023) {
			int i = 20;
			int i_7_ = 507;
			int i_8_ = 16776960;
			if (Class30.anInt750 < 30 && Class21.aBoolean483)
				i_8_ = 16711680;
			if (Class30.anInt750 < 20 && !Class21.aBoolean483)
				i_8_ = 16711680;
			Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method403(
					Statics.method251(
							(byte) -71,
							(new RSString[] {
									Class35.aClass59_851,
									Class19.method599(Class30.anInt750,
											(arg0 ^ ~0x78b4)) })), i_7_, i,
					i_8_);
			Runtime runtime = Runtime.getRuntime();
			i += 15;
			int i_9_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
			i_8_ = 16776960;
			if (i_9_ > 32768 && Class21.aBoolean483)
				i_8_ = 16711680;
			if (i_9_ > 65536 && !Class21.aBoolean483)
				i_8_ = 16711680;
			Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method403(
					Statics.method251((byte) -125, (new RSString[] {
							Class64.aClass59_1447, Class19.method599(i_9_, 10),
							(Class12_Sub12_Sub14.aClass59_2465) })), i_7_, i,
					i_8_);
			i += 15;
			if (Class8.aBoolean193) {
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method403(
						Class27.aClass59_646, i_7_, i, 16711680);
				i += 15;
				Class8.aBoolean193 = false;
			}
			if (Class15.aBoolean392) {
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method403(
						RSCanvas.aClass59_61, i_7_, i, 16711680);
				Class15.aBoolean392 = false;
				i += 15;
			}
			if (Class8.aBoolean188) {
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method403(
						Class12_Sub12_Sub11_Sub5.aClass59_2852, i_7_, i,
						16711680);
				Class8.aBoolean188 = false;
				i += 15;
			}
		}
		if (Class12_Sub1.anInt1617 != 0) {
			int i = Class12_Sub1.anInt1617 / 50;
			int i_10_ = i / 60;
			i %= 60;
			if (i < 10)
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method400(
						Statics.method251(
								(byte) -36,
								(new RSString[] { Class49.aClass59_1163,
										Class19.method599(i_10_, 10),
										Class51.aClass59_1194,
										Class19.method599(i, 10) })), 4, 329,
						16776960);
			else
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method400(
						(Statics.method251(
								(byte) -113,
								new RSString[] { Class49.aClass59_1163,
										Class19.method599(i_10_, arg0 + 30921),
										Class12_Sub12_Sub11_Sub2.aClass59_2704,
										Class19.method599(i, 10) })), 4, 329,
						16776960);
		}
		if (arg0 != -30911)
			anInt2362 = 5;
	}

	public void method420(int arg0) {
		anInt2338++;
		if ((anInt2320 ^ 0xffffffff) == 0) {
			anInt2320 = 0;
			if (anIntArray2353 != null
					&& (anIntArray2350 == null || anIntArray2350[0] == 10))
				anInt2320 = 1;
			for (int i = 0; i < 5; i++) {
				if (aClass59Array2327[i] != null)
					anInt2320 = 1;
			}
		}
		if (arg0 != 15)
			aClass59_2357 = null;
		if (anInt2344 == -1)
			anInt2344 = aBoolean2317 ? 1 : 0;
	}

	public static int method421(int arg0, int arg1) {
		try {
			return arg0 | arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "je.I(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static RSString method422(byte arg0, int arg1) {
		try {
			if (arg0 != 49)
				method422((byte) 96, -83);
			anInt2328++;
			if (arg1 < 999999999)
				return Class19.method599(arg1, arg0 ^ 0x3b);
			return Class12_Sub2.aClass59_1636;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "je.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method423(int arg0, int arg1, Buffer arg2) {
		try {
			if ((arg0 ^ 0xffffffff) == -2) {
				int i = arg2.readUByte();
				if ((i ^ 0xffffffff) < -1) {
					if (anIntArray2353 == null || Class49.aBoolean1167) {
						anIntArray2353 = new int[i];
						anIntArray2350 = new int[i];
						for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff); i_11_++) {
							anIntArray2353[i_11_] = arg2.readShortBE();
							anIntArray2350[i_11_] = arg2.readUByte();
						}
					} else
						arg2.position += i * 3;
				}
			} else if ((arg0 ^ 0xffffffff) != -3) {
				if ((arg0 ^ 0xffffffff) == -6) {
					int i = arg2.readUByte();
					if (i > 0) {
						if (anIntArray2353 == null || Class49.aBoolean1167) {
							anIntArray2350 = null;
							anIntArray2353 = new int[i];
							for (int i_12_ = 0; i_12_ < i; i_12_++)
								anIntArray2353[i_12_] = arg2.readShortBE();
						} else
							arg2.position += 2 * i;
					}
				} else if ((arg0 ^ 0xffffffff) != -15) {
					if (arg0 == 15)
						anInt2334 = arg2.readUByte();
					else if (arg0 == 17)
						aBoolean2317 = false;
					else if ((arg0 ^ 0xffffffff) == -19)
						aBoolean2321 = false;
					else if ((arg0 ^ 0xffffffff) == -20)
						anInt2320 = arg2.readUByte();
					else if ((arg0 ^ 0xffffffff) == -22)
						aBoolean2322 = true;
					else if ((arg0 ^ 0xffffffff) != -23) {
						if ((arg0 ^ 0xffffffff) == -24)
							aBoolean2352 = true;
						else if (arg0 != 24) {
							if ((arg0 ^ 0xffffffff) != -29) {
								if ((arg0 ^ 0xffffffff) != -30) {
									if (arg0 == 39)
										anInt2307 = 5 * arg2.readByte(true);
									else if ((arg0 ^ 0xffffffff) <= -31
											&& arg0 < 35) {
										aClass59Array2327[-30 + arg0] = arg2
												.method246(20356);
										if (aClass59Array2327[-30 + arg0]
												.method920(
														Class63.aClass59_1424,
														(byte) -122))
											aClass59Array2327[arg0 - 30] = null;
									} else if (arg0 == 40) {
										int i = arg2.readUByte();
										anIntArray2331 = new int[i];
										anIntArray2325 = new int[i];
										for (int i_13_ = 0; i > i_13_; i_13_++) {
											anIntArray2325[i_13_] = arg2
													.readShortBE();
											anIntArray2331[i_13_] = arg2
													.readShortBE();
										}
									} else if (arg0 == 60)
										anInt2313 = arg2.readShortBE();
									else if ((arg0 ^ 0xffffffff) != -63) {
										if ((arg0 ^ 0xffffffff) != -65) {
											if ((arg0 ^ 0xffffffff) == -66)
												anInt2323 = arg2.readShortBE();
											else if ((arg0 ^ 0xffffffff) != -67) {
												if (arg0 == 67)
													anInt2351 = arg2
															.readShortBE();
												else if (arg0 != 68) {
													if (arg0 == 69)
														anInt2340 = (arg2
																.readUByte());
													else if (arg0 != 70) {
														if (arg0 != 71) {
															if ((arg0 ^ 0xffffffff) != -73) {
																if ((arg0 ^ 0xffffffff) == -74)
																	aBoolean2336 = true;
																else if (arg0 == 74)
																	aBoolean2348 = true;
																else if (arg0 == 75)
																	anInt2344 = (arg2
																			.readUByte());
																else if (arg0 == 77) {
																	anInt2303 = (arg2
																			.readShortBE());
																	if ((anInt2303 ^ 0xffffffff) == -65536)
																		anInt2303 = -1;
																	anInt2326 = (arg2
																			.readShortBE());
																	if ((anInt2326 ^ 0xffffffff) == -65536)
																		anInt2326 = -1;
																	int i = (arg2
																			.readUByte());
																	anIntArray2310 = (new int[1 + i]);
																	for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) >= (i ^ 0xffffffff)); i_14_++) {
																		anIntArray2310[i_14_] = arg2
																				.readShortBE();
																		if (anIntArray2310[i_14_] == 65535)
																			anIntArray2310[i_14_] = -1;
																	}
																}
															} else
																anInt2304 = (arg2
																		.method212((byte) -71));
														} else
															anInt2343 = (arg2
																	.method212((byte) -119));
													} else
														anInt2308 = (arg2
																.method212((byte) -95));
												} else
													anInt2332 = arg2
															.readShortBE();
											} else
												anInt2345 = arg2.readShortBE();
										} else
											aBoolean2337 = false;
									} else
										aBoolean2329 = true;
								} else
									anInt2355 = arg2.readByte(true);
							} else
								anInt2346 = arg2.readUByte();
						} else {
							anInt2330 = arg2.readShortBE();
							if ((anInt2330 ^ 0xffffffff) == -65536)
								anInt2330 = -1;
						}
					} else
						aBoolean2314 = true;
				} else
					anInt2318 = arg2.readUByte();
			} else
				aClass59_2312 = arg2.method246(20356);
			if (arg1 != 128)
				anInt2307 = 86;
			anInt2315++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("je.F(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method424(int arg0, int arg1, int arg2,
			int arg3, int arg4, int arg5, int arg6) {
		try {
			long l;
			if (anIntArray2350 == null)
				l = (long) ((anInt2316 << 986937386) - -arg3);
			else
				l = (long) ((arg4 << 415069987) + (anInt2316 << -1021763798) + arg3);
			anInt2347++;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class44.aClass27_1046
					.method673(119, l));
			if (class12_sub12_sub11_sub4 == null) {
				class12_sub12_sub11_sub4 = method427(false, arg4,
						!aBoolean2314, arg3, false);
				if (class12_sub12_sub11_sub4 == null)
					return null;
				Class44.aClass27_1046.method678((byte) 123,
						class12_sub12_sub11_sub4, l);
			}
			if (aBoolean2322 || aBoolean2314)
				class12_sub12_sub11_sub4 = new Class12_Sub12_Sub11_Sub4(
						class12_sub12_sub11_sub4, aBoolean2322, aBoolean2314);
			if (arg0 != -73)
				method423(9, -26, null);
			if (aBoolean2322) {
				int i = (arg2 + arg6 + (arg5 + arg1)) / 4;
				for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (class12_sub12_sub11_sub4.anInt2798 ^ 0xffffffff)); i_15_++) {
					int i_16_ = class12_sub12_sub11_sub4.anIntArray2791[i_15_];
					int i_17_ = class12_sub12_sub11_sub4.anIntArray2787[i_15_];
					int i_18_ = arg1 - -((arg5 + -arg1) * (i_17_ + 64) / 128);
					int i_19_ = (i_17_ - -64) * (-arg2 + arg6) / 128 + arg2;
					int i_20_ = i_18_ + (-i_18_ + i_19_) * (64 + i_16_) / 128;
					class12_sub12_sub11_sub4.anIntArray2802[i_15_] += -i
							+ i_20_;
				}
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("je.N(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public boolean method425(int arg0, byte arg1) {
		try {
			anInt2349++;
			if (arg1 != -78)
				return true;
			if (anIntArray2350 == null) {
				if (anIntArray2353 == null)
					return true;
				if (arg0 != 10)
					return true;
				boolean bool = true;
				for (int i = 0; (i ^ 0xffffffff) > (anIntArray2353.length ^ 0xffffffff); i++)
					bool &= Class9_Sub2.aClass26_1597.method646(
							anIntArray2353[i] & 0xffff, -1, 0);
				return bool;
			}
			for (int i = 0; (i ^ 0xffffffff) > (anIntArray2350.length ^ 0xffffffff); i++) {
				if ((arg0 ^ 0xffffffff) == (anIntArray2350[i] ^ 0xffffffff))
					return Class9_Sub2.aClass26_1597.method646(
							anIntArray2353[i] & 0xffff, -1, 0);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "je.M(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method426(byte arg0) {
		try {
			anInt2311++;
			if (anIntArray2353 == null)
				return true;
			if (arg0 != -73)
				method425(9, (byte) 102);
			boolean bool = true;
			for (int i = 0; anIntArray2353.length > i; i++)
				bool &= Class9_Sub2.aClass26_1597.method646(
						anIntArray2353[i] & 0xffff, -1, 0);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "je.O(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method427(boolean arg0, int arg1,
			boolean arg2, int arg3, boolean arg4) {
		try {
			anInt2306++;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = null;
			if (anIntArray2350 != null) {
				int i = -1;
				for (int i_21_ = 0; ((anIntArray2350.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
					if (anIntArray2350[i_21_] == arg1) {
						i = i_21_;
						break;
					}
				}
				if (i == -1)
					return null;
				boolean bool = aBoolean2329 ^ arg3 > 3;
				int i_22_ = anIntArray2353[i];
				if (bool)
					i_22_ += 65536;
				class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class17.aClass27_424
						.method673(124, (long) i_22_));
				if (class12_sub12_sub11_sub4 == null) {
					class12_sub12_sub11_sub4 = Class12_Sub12_Sub11_Sub4
							.method496((Class9_Sub2.aClass26_1597),
									0xffff & i_22_, 0);
					if (class12_sub12_sub11_sub4 == null)
						return null;
					if (bool)
						class12_sub12_sub11_sub4.method481();
					Class17.aClass27_424.method678((byte) 123,
							class12_sub12_sub11_sub4, (long) i_22_);
				}
			} else {
				if ((arg1 ^ 0xffffffff) != -11)
					return null;
				if (anIntArray2353 == null)
					return null;
				boolean bool = aBoolean2329 ^ arg3 > 3;
				int i = anIntArray2353.length;
				for (int i_23_ = 0; i_23_ < i; i_23_++) {
					int i_24_ = anIntArray2353[i_23_];
					if (bool)
						i_24_ += 65536;
					class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class17.aClass27_424
							.method673(115, (long) i_24_));
					if (class12_sub12_sub11_sub4 == null) {
						class12_sub12_sub11_sub4 = (Class12_Sub12_Sub11_Sub4
								.method496(Class9_Sub2.aClass26_1597,
										i_24_ & 0xffff, 0));
						if (class12_sub12_sub11_sub4 == null)
							return null;
						if (bool)
							class12_sub12_sub11_sub4.method481();
						Class17.aClass27_424.method678((byte) 123,
								class12_sub12_sub11_sub4, (long) i_24_);
					}
					if (i > 1)
						Class12_Sub2.aClass12_Sub12_Sub11_Sub4Array1656[i_23_] = class12_sub12_sub11_sub4;
				}
				if ((i ^ 0xffffffff) < -2)
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							Class12_Sub2.aClass12_Sub12_Sub11_Sub4Array1656, i));
			}
			boolean bool;
			if (anInt2323 != 128 || anInt2345 != 128
					|| (anInt2351 ^ 0xffffffff) != -129)
				bool = true;
			else
				bool = false;
			boolean bool_25_;
			if (anInt2308 != 0 || (anInt2343 ^ 0xffffffff) != -1
					|| anInt2304 != 0)
				bool_25_ = true;
			else
				bool_25_ = false;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_26_ = new Class12_Sub12_Sub11_Sub4(
					class12_sub12_sub11_sub4, ((arg3 ^ 0xffffffff) == -1
							&& !bool && !bool_25_), anIntArray2325 == null,
					true);
			if (arg0 != false)
				method422((byte) 110, 107);
			arg3 &= 0x3;
			if ((arg3 ^ 0xffffffff) != -2) {
				if (arg3 == 2)
					class12_sub12_sub11_sub4_26_.method482();
				else if (arg3 == 3)
					class12_sub12_sub11_sub4_26_.method472();
			} else
				class12_sub12_sub11_sub4_26_.method473();
			if (anIntArray2325 != null) {
				for (int i = 0; anIntArray2325.length > i; i++)
					class12_sub12_sub11_sub4_26_.method489(anIntArray2325[i],
							anIntArray2331[i]);
			}
			if (bool)
				class12_sub12_sub11_sub4_26_.method477(anInt2323, anInt2345,
						anInt2351);
			if (bool_25_)
				class12_sub12_sub11_sub4_26_.method476(anInt2308, anInt2343,
						anInt2304);
			if (arg4)
				class12_sub12_sub11_sub4_26_.method471();
			class12_sub12_sub11_sub4_26_.method485(anInt2355 + 64,
					5 * anInt2307 + 768, -50, -10, -50, arg2);
			return class12_sub12_sub11_sub4_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("je.C(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')'));
		}
	}

	public Class12_Sub12_Sub9() {
		anInt2313 = -1;
		anInt2323 = 128;
		anInt2330 = -1;
		aClass59_2312 = Class12_Sub12_Sub11_Sub3.aClass59_2777;
		aBoolean2322 = false;
		anInt2332 = -1;
		aBoolean2329 = false;
		aBoolean2317 = true;
		aBoolean2336 = false;
		aBoolean2337 = true;
		anInt2320 = -1;
		anInt2304 = 0;
		anInt2345 = 128;
		anInt2307 = 0;
		anInt2326 = -1;
		aBoolean2314 = false;
		anInt2334 = 1;
		aBoolean2348 = false;
		anInt2344 = -1;
		anInt2340 = 0;
		aClass59Array2327 = new RSString[5];
		anInt2343 = 0;
		anInt2351 = 128;
		anInt2346 = 16;
		aBoolean2352 = false;
		anInt2355 = 0;
	}

	static {
		int i = 0;
		for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -100; i_27_++) {
			int i_28_ = i_27_ + 1;
			int i_29_ = (int) (Math.pow(2.0, (double) i_28_ / 7.0) * 300.0 + (double) i_28_);
			i += i_29_;
			anIntArray2324[i_27_] = i / 4;
		}
		aBoolean2356 = true;
		aBoolean2360 = false;
		anIntArrayArray2359 = new int[104][104];
		aClass59_2358 = Class55.method898("chatback", -10983);
		anInt2362 = 0;
		aClass59_2363 = Class55.method898("Unable to find ", -10983);
		aClass59_2357 = aClass59_2363;
		aClass59_2364 = Class55.method898(":  ", -10983);
	}
}
