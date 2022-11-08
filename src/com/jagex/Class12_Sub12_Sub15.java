package com.jagex;/* com.jagex.Class12_Sub12_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.sign.SignlinkNode;
import com.jagex.util.Statics;

import java.io.DataInputStream;
import java.net.URL;

public class Class12_Sub12_Sub15 extends Class12_Sub12 {
	public static int anInt2468;
	public static int anInt2469;
	public int anInt2470;
	public static int anInt2471;
	public int anInt2472 = 0;
	public boolean aBoolean2473;
	public static boolean aBoolean2474 = false;
	public int anInt2475;
	public static int anInt2476;
	public int anInt2477;
	public int anInt2478;
	public int[] anIntArray2479;
	public RSString aClass59_2480;
	public int anInt2481;
	public int[] anIntArray2482;
	public int anInt2483;
	public static int anInt2484;
	public int anInt2485;
	public static int anInt2486;
	public int anInt2487;
	public int anInt2488;
	public int anInt2489 = 0;
	public int anInt2490;
	public static Class62 aClass62_2491;
	public int anInt2492;
	public static int anInt2493;
	public int[] anIntArray2494;
	public int anInt2495;
	public int anInt2496;
	public int anInt2497;
	public int[] anIntArray2498;
	public RSString[] aClass59Array2499;
	public RSString[] aClass59Array2500;
	public boolean aBoolean2501;
	public int anInt2502;
	public static Class62 aClass62_2503;
	public int anInt2504;
	public static int anInt2505;
	public static int anInt2506;
	public static int[] anIntArray2507 = new int[4000];
	public int anInt2508;
	public int anInt2509;
	public int anInt2510;
	public int anInt2511;
	public static RSString aClass59_2513 = Class55.method898("(U4", -10983);
	public static RSString aClass59_2514 = Class55.method898(" )2> @yel@",
			-10983);
	public static int anInt2515;
	public static int anInt2516;
	public int anInt2517;
	public static int anInt2518;
	public int anInt2519;
	public int anInt2520;
	public static int anInt2521;
	public static int anInt2522;
	public int anInt2523;
	public int anInt2524;
	public int anInt2525;
	public static int anInt2526;
	public static RSString aClass59_2527 = Class55
			.method898("redstone3", -10983);
	public static Class12_Sub12_Sub7_Sub4 aClass12_Sub12_Sub7_Sub4_2529;
	public int anInt2530;
	public static int anInt2531;

	public void method542(Class12_Sub12_Sub15 arg0, byte arg1,
			Class12_Sub12_Sub15 arg2) {
		try {
			aBoolean2501 = arg2.aBoolean2501;
			anInt2495 = arg0.anInt2495;
			aClass59_2480 = arg2.aClass59_2480;
			anInt2518++;
			anInt2475 = arg0.anInt2475;
			anInt2517 = arg0.anInt2517;
			anIntArray2494 = arg0.anIntArray2494;
			anInt2470 = arg0.anInt2470;
			anIntArray2498 = arg0.anIntArray2498;
			anInt2496 = arg2.anInt2496;
			aBoolean2473 = true;
			anInt2502 = arg0.anInt2502;
			anInt2489 = arg0.anInt2489;
			int i = -76 % ((arg1 - -41) / 37);
			anInt2477 = arg0.anInt2477;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ud.G("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method543(int arg0, Class12_Sub12_Sub11_Sub2 arg1) {
		arg1.anInt2718 = arg1.anInt2681;
		anInt2486++;
		if ((arg1.anInt2665 ^ 0xffffffff) == -1)
			arg1.anInt2670 = 0;
		else {
			if ((arg1.anInt2734 ^ 0xffffffff) != 0
					&& (arg1.anInt2719 ^ 0xffffffff) == -1) {
				Class12_Sub12_Sub4 class12_sub12_sub4 = Class5.method74(
						arg0 + 21312, arg1.anInt2734);
				if ((arg1.anInt2714 ^ 0xffffffff) < -1
						&& class12_sub12_sub4.anInt2188 == 0) {
					arg1.anInt2670++;
					return;
				}
				if (arg1.anInt2714 <= 0 && class12_sub12_sub4.anInt2198 == 0) {
					arg1.anInt2670++;
					return;
				}
			}
			int i = arg1.anInt2691;
			int i_0_ = arg1.anInt2683;
			int i_1_ = (arg1.anIntArray2708[arg1.anInt2665 + -1] * 128 + 64 * arg1.anInt2727);
			int i_2_ = (arg1.anInt2727 * 64 + 128 * arg1.anIntArray2671[-1
					+ arg1.anInt2665]);
			if (-i + i_1_ > 256 || (i_1_ + -i ^ 0xffffffff) > 255
					|| i_2_ + -i_0_ > 256 || i_2_ + -i_0_ < -256) {
				arg1.anInt2691 = i_1_;
				arg1.anInt2683 = i_2_;
			} else {
				if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
					if ((i_0_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
						arg1.anInt2666 = 1280;
					else if ((i_0_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
						arg1.anInt2666 = 1536;
					else
						arg1.anInt2666 = 1792;
				} else if ((i_1_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					if (i_0_ < i_2_)
						arg1.anInt2666 = 1024;
					else
						arg1.anInt2666 = 0;
				} else if ((i_0_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
					arg1.anInt2666 = 768;
				else if (i_0_ > i_2_)
					arg1.anInt2666 = 256;
				else
					arg1.anInt2666 = 512;
				int i_3_ = 0x7ff & -arg1.anInt2680 + arg1.anInt2666;
				if (arg0 != -21303)
					method555(-34);
				int i_4_ = 4;
				if ((arg1.anInt2680 ^ 0xffffffff) != (arg1.anInt2666 ^ 0xffffffff)
						&& arg1.anInt2694 == -1 && arg1.anInt2669 != 0)
					i_4_ = 2;
				if ((arg1.anInt2665 ^ 0xffffffff) < -3)
					i_4_ = 6;
				if ((arg1.anInt2665 ^ 0xffffffff) < -4)
					i_4_ = 8;
				int i_5_ = arg1.anInt2700;
				if ((i_3_ ^ 0xffffffff) < -1025)
					i_3_ -= 2048;
				if ((i_3_ ^ 0xffffffff) > 255 || i_3_ > 256) {
					if ((i_3_ ^ 0xffffffff) <= -257
							&& (i_3_ ^ 0xffffffff) > -769)
						i_5_ = arg1.anInt2706;
					else if (i_3_ >= -768 && i_3_ <= -256)
						i_5_ = arg1.anInt2662;
				} else
					i_5_ = arg1.anInt2710;
				if (arg1.anInt2670 > 0 && (arg1.anInt2665 ^ 0xffffffff) < -2) {
					arg1.anInt2670--;
					i_4_ = 8;
				}
				if (i_5_ == -1)
					i_5_ = arg1.anInt2710;
				arg1.anInt2718 = i_5_;
				if (arg1.aBooleanArray2712[arg1.anInt2665 - 1])
					i_4_ <<= 1;
				if ((i ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
					if (i > i_1_) {
						arg1.anInt2691 -= i_4_;
						if (i_1_ > arg1.anInt2691)
							arg1.anInt2691 = i_1_;
					}
				} else {
					arg1.anInt2691 += i_4_;
					if ((i_1_ ^ 0xffffffff) > (arg1.anInt2691 ^ 0xffffffff))
						arg1.anInt2691 = i_1_;
				}
				if (i_2_ <= i_0_) {
					if (i_0_ > i_2_) {
						arg1.anInt2683 -= i_4_;
						if (arg1.anInt2683 < i_2_)
							arg1.anInt2683 = i_2_;
					}
				} else {
					arg1.anInt2683 += i_4_;
					if ((i_2_ ^ 0xffffffff) > (arg1.anInt2683 ^ 0xffffffff))
						arg1.anInt2683 = i_2_;
				}
				if (arg1.anInt2691 == i_1_ && i_2_ == arg1.anInt2683) {
					arg1.anInt2665--;
					if (arg1.anInt2714 > 0)
						arg1.anInt2714--;
				}
				if (i_4_ >= 8
						&& (arg1.anInt2718 ^ 0xffffffff) == (arg1.anInt2710 ^ 0xffffffff)
						&& (arg1.anInt2677 ^ 0xffffffff) != 0)
					arg1.anInt2718 = arg1.anInt2677;
			}
		}
	}

	public void method544(Buffer arg0, byte arg1) {
		try {
			int i = -16 % ((arg1 - 48) / 40);
			anInt2493++;
			for (;;) {
				int i_6_ = arg0.readSignedByte(true);
				if (i_6_ == 0)
					break;
				method550(i_6_, arg0, -1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public boolean method545(byte arg0, boolean arg1) {
		try {
			int i = anInt2490;
			anInt2471++;
			if (arg0 > -23)
				anIntArray2482 = null;
			int i_7_ = anInt2485;
			if (arg1) {
				i_7_ = anInt2511;
				i = anInt2508;
			}
			if ((i ^ 0xffffffff) == 0)
				return true;
			boolean bool = true;
			if (!Class35.aClass26_848.method646(i, -1, 0))
				bool = false;
			if (i_7_ != -1 && !Class35.aClass26_848.method646(i_7_, -1, 0))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.I(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method546(byte arg0) {
		try {
			anInt2526++;
			int i = 46 / ((-78 - arg0) / 45);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.D(" + arg0 + ')');
		}
	}

	public static RSString method547(Class12_Sub12_Sub3 arg0, int arg1,
                                     RSString arg2) {
		try {
			anInt2468++;
			if (arg2.method930(arg1 ^ 0x1, Class12_Sub6.aClass59_1701) != arg1) {
				for (;;) {
					int i = arg2
							.method930(-2, Class12_Sub12_Sub6.aClass59_2257);
					if (i == -1)
						break;
					arg2 = (Statics.method251(
							(byte) -46,
							new RSString[] {
									arg2.method937(i, true, 0),
									(Class12_Sub12_Sub9.method422((byte) 49,
											Class4.method71(arg0, 123, 0))),
									arg2.method945(63, i - -2) }));
				}
				for (;;) {
					int i = arg2.method930(arg1 + -1, Class12.aClass59_316);
					if ((i ^ 0xffffffff) == 0)
						break;
					arg2 = (Statics.method251(
							(byte) -107,
							new RSString[] {
									arg2.method937(i, true, 0),
									(Class12_Sub12_Sub9.method422((byte) 49,
											Class4.method71(arg0, 116, 1))),
									arg2.method945(63, i + 2) }));
				}
				for (;;) {
					int i = arg2.method930(-2, Statics.aClass59_1806);
					if (i == -1)
						break;
					arg2 = (Statics.method251(
							(byte) -61,
							new RSString[] {
									arg2.method937(i, true, 0),
									(Class12_Sub12_Sub9.method422((byte) 49,
											Class4.method71(arg0, 120, 2))),
									arg2.method945(63, 2 + i) }));
				}
				for (;;) {
					int i = arg2.method930(-2, aClass59_2513);
					if (i == -1)
						break;
					arg2 = (Statics.method251(
							(byte) -80,
							new RSString[] {
									arg2.method937(i, true, 0),
									(Class12_Sub12_Sub9.method422((byte) 49,
											Class4.method71(arg0, 123, 3))),
									arg2.method945(63, i - -2) }));
				}
				for (;;) {
					int i = arg2.method930(-2,
							RuntimeException_Sub1.aClass59_1468);
					if ((i ^ 0xffffffff) == 0)
						break;
					arg2 = (Statics.method251(
							(byte) -98,
							new RSString[] {
									arg2.method937(i, true, 0),
									(Class12_Sub12_Sub9.method422((byte) 49,
											Class4.method71(arg0, 118, 4))),
									arg2.method945(63, i + 2) }));
				}
				for (;;) {
					int i = arg2.method930(-2, Class18.aClass59_433);
					if (i == -1)
						break;
					RSString class59 = Class11.aClass59_310;
					if (Game.aSignlinkNode_1567 != null) {
						class59 = Class13.method562(
								Game.aSignlinkNode_1567.integerData, false);
						try {
							if (Game.aSignlinkNode_1567.value != null) {
								byte[] is = ((String) Game.aSignlinkNode_1567.value)
										.getBytes("ISO-8859-1");
								class59 = (Class12_Sub12_Sub14.method539(
										arg1 ^ 0xffffffff, is, is.length, 0));
							}
						} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
							/* empty */
						}
					}
					arg2 = Statics.method251((byte) -56,
							(new RSString[] { arg2.method937(i, true, 0),
									class59, arg2.method945(63, 4 + i) }));
				}
			}
			return arg2;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ud.K("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public boolean method548(int arg0, boolean arg1) {
		try {
			anInt2506++;
			int i = anInt2524;
			if (arg0 != 11105)
				anInt2489 = 1;
			int i_8_ = anInt2530;
			int i_9_ = anInt2519;
			if (arg1) {
				i_8_ = anInt2523;
				i_9_ = anInt2487;
				i = anInt2492;
			}
			if (i == -1)
				return true;
			boolean bool = true;
			if (!Class35.aClass26_848.method646(i, -1, 0))
				bool = false;
			if ((i_9_ ^ 0xffffffff) != 0
					&& !Class35.aClass26_848.method646(i_9_, -1, 0))
				bool = false;
			if (i_8_ != -1 && !Class35.aClass26_848.method646(i_8_, -1, 0))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method549(int arg0, byte arg1, boolean arg2) {
		try {
			if (arg1 != 59)
				method552(false, true);
			anInt2521++;
			if (anIntArray2479 != null && (arg0 ^ 0xffffffff) < -2) {
				int i = -1;
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -11; i_10_++) {
					if ((arg0 ^ 0xffffffff) <= (anIntArray2482[i_10_] ^ 0xffffffff)
							&& anIntArray2482[i_10_] != 0)
						i = anIntArray2479[i_10_];
				}
				if ((i ^ 0xffffffff) != 0)
					return Class12_Sub12_Sub11_Sub5.method502((byte) 121, i)
							.method549(1, (byte) 59, arg2);
			}
			if (arg2) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Class20.aClass27_463
						.method673(arg1 + 57, (long) anInt2497));
				if (class12_sub12_sub11_sub4 != null)
					return class12_sub12_sub11_sub4;
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = Class12_Sub12_Sub11_Sub4
					.method496(Class35.aClass26_848, anInt2475, 0);
			if (class12_sub12_sub11_sub4 == null)
				return null;
			if ((anInt2478 ^ 0xffffffff) != -129 || anInt2504 != 128
					|| anInt2481 != 128)
				class12_sub12_sub11_sub4.method477(anInt2478, anInt2504,
						anInt2481);
			if (anIntArray2494 != null) {
				for (int i = 0; anIntArray2494.length > i; i++)
					class12_sub12_sub11_sub4.method489(anIntArray2494[i],
							anIntArray2498[i]);
			}
			if (arg2) {
				class12_sub12_sub11_sub4.method485(anInt2525 + 64,
						anInt2472 + 768, -50, -10, -50, true);
				class12_sub12_sub11_sub4.aBoolean2799 = true;
				Class20.aClass27_463.method678((byte) 123,
						class12_sub12_sub11_sub4, (long) anInt2497);
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ud.J(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method550(int arg0, Buffer arg1, int arg2) {
		try {
			if (arg2 == -1) {
				anInt2531++;
				if ((arg0 ^ 0xffffffff) != -2) {
					if (arg0 != 2) {
						if ((arg0 ^ 0xffffffff) == -5)
							anInt2502 = arg1.readShort(-1);
						else if ((arg0 ^ 0xffffffff) != -6) {
							if ((arg0 ^ 0xffffffff) != -7) {
								if (arg0 != 7) {
									if (arg0 == 8) {
										anInt2477 = arg1.readShort(-1);
										if ((anInt2477 ^ 0xffffffff) < -32768)
											anInt2477 -= 65536;
									} else if ((arg0 ^ 0xffffffff) != -11) {
										if ((arg0 ^ 0xffffffff) == -12)
											aBoolean2473 = true;
										else if ((arg0 ^ 0xffffffff) != -13) {
											if (arg0 == 16)
												aBoolean2501 = true;
											else if ((arg0 ^ 0xffffffff) == -24) {
												anInt2524 = arg1.readShort(-1);
												anInt2510 = arg1
														.readSignedByte(true);
											} else if (arg0 != 24) {
												if (arg0 == 25) {
													anInt2492 = arg1
															.readShort(arg2);
													anInt2509 = arg1
															.readSignedByte(true);
												} else if ((arg0 ^ 0xffffffff) != -27) {
													if (arg0 < 30 || arg0 >= 35) {
														if (arg0 >= 35
																&& arg0 < 40)
															aClass59Array2500[arg0 - 35] = (arg1
																	.method246(arg2 + 20357));
														else if ((arg0 ^ 0xffffffff) != -41) {
															if (arg0 == 78)
																anInt2530 = (arg1
																		.readShort(-1));
															else if ((arg0 ^ 0xffffffff) != -80) {
																if (arg0 == 90)
																	anInt2490 = (arg1
																			.readShort(-1));
																else if (arg0 == 91)
																	anInt2508 = (arg1
																			.readShort(-1));
																else if (arg0 == 92)
																	anInt2485 = (arg1
																			.readShort(-1));
																else if (arg0 != 93) {
																	if (arg0 == 95)
																		anInt2495 = arg1
																				.readShort(arg2);
																	else if (arg0 == 97)
																		anInt2488 = arg1
																				.readShort(-1);
																	else if (arg0 != 98) {
																		if ((arg0 ^ 0xffffffff) > -101
																				|| arg0 >= 110) {
																			if (arg0 == 110)
																				anInt2478 = arg1
																						.readShort(-1);
																			else if (arg0 == 111)
																				anInt2504 = arg1
																						.readShort(arg2);
																			else if ((arg0 ^ 0xffffffff) != -113) {
																				if ((arg0 ^ 0xffffffff) == -114)
																					anInt2525 = arg1
																							.readByte(true);
																				else if ((arg0 ^ 0xffffffff) != -115) {
																					if ((arg0 ^ 0xffffffff) == -116)
																						anInt2520 = arg1
																								.readSignedByte(true);
																				} else
																					anInt2472 = 5 * arg1
																							.readByte(true);
																			} else
																				anInt2481 = arg1
																						.readShort(-1);
																		} else {
																			if (anIntArray2479 == null) {
																				anIntArray2479 = new int[10];
																				anIntArray2482 = new int[10];
																			}
																			anIntArray2479[-100
																					+ arg0] = arg1
																					.readShort(-1);
																			anIntArray2482[arg0 - 100] = arg1
																					.readShort(-1);
																		}
																	} else
																		anInt2483 = arg1
																				.readShort(-1);
																} else
																	anInt2511 = (arg1
																			.readShort(arg2));
															} else
																anInt2523 = (arg1
																		.readShort(arg2));
														} else {
															int i = (arg1
																	.readSignedByte(true));
															anIntArray2498 = new int[i];
															anIntArray2494 = new int[i];
															for (int i_11_ = 0; i > i_11_; i_11_++) {
																anIntArray2494[i_11_] = (arg1
																		.readShort(-1));
																anIntArray2498[i_11_] = (arg1
																		.readShort(-1));
															}
														}
													} else {
														aClass59Array2499[-30
																+ arg0] = (arg1
																.method246(20356));
														if (aClass59Array2499[-30
																+ arg0]
																.method920(
																		(Class63.aClass59_1424),
																		(byte) 84))
															aClass59Array2499[-30
																	+ arg0] = null;
													}
												} else
													anInt2487 = arg1
															.readShort(-1);
											} else
												anInt2519 = arg1.readShort(-1);
										} else
											anInt2496 = arg1
													.method207(-708753192);
									} else
										arg1.readShort(arg2);
								} else {
									anInt2517 = arg1.readShort(-1);
									if (anInt2517 > 32767)
										anInt2517 -= 65536;
								}
							} else
								anInt2489 = arg1.readShort(-1);
						} else
							anInt2470 = arg1.readShort(-1);
					} else
						aClass59_2480 = arg1.method246(20356);
				} else
					anInt2475 = arg1.readShort(-1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ud.L(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public static void method551(boolean arg0, String arg1, Throwable arg2) {
		try {
			try {
				String string = "";
				if (arg2 != null)
					string = Class21.method610(false, arg2);
				if (arg1 != null) {
					if (arg2 != null)
						string += " | ";
					string += (String) arg1;
				}
				System.out.println("Error: " + string);
				string = string.replace(':', '.');
				if (arg0 != true)
					aClass12_Sub12_Sub7_Sub4_2529 = null;
				string = string.replace('@', '_');
				string = string.replace('&', '_');
				string = string.replace('#', '_');
				SignlinkNode signlinkNode = (Class47.aSignlink_1092.putNodeType4(
                        new URL(Class47.aSignlink_1092.applet
								.getCodeBase(), ("clienterror.ws?c="
								+ RuntimeException_Sub1.anInt1466 + "&u="
								+ Class12_Sub12_Sub11_Sub3.aLong2774 + "&v1="
								+ Signlink.javaVendor + "&v2="
								+ Signlink.javaVersion + "&e=" + string))));
				while ((signlinkNode.status ^ 0xffffffff) == -1)
					Statics.method218(1L, true);
				if ((signlinkNode.status ^ 0xffffffff) == -2) {
					DataInputStream datainputstream = (DataInputStream) signlinkNode.value;
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt2516++;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Class12_Sub12_Sub11_Sub4 method552(boolean arg0, boolean arg1) {
		try {
			int i = anInt2524;
			if (arg0 != false)
				method552(true, false);
			anInt2515++;
			int i_12_ = anInt2519;
			int i_13_ = anInt2530;
			if (arg1) {
				i = anInt2492;
				i_12_ = anInt2487;
				i_13_ = anInt2523;
			}
			if ((i ^ 0xffffffff) == 0)
				return null;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = Class12_Sub12_Sub11_Sub4
					.method496(Class35.aClass26_848, i, 0);
			if (i_12_ != -1) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_14_ = Class12_Sub12_Sub11_Sub4
						.method496(Class35.aClass26_848, i_12_, 0);
				if (i_13_ != -1) {
					Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_15_ = Class12_Sub12_Sub11_Sub4
							.method496(Class35.aClass26_848, i_13_, 0);
					Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = {
							class12_sub12_sub11_sub4,
							class12_sub12_sub11_sub4_14_,
							class12_sub12_sub11_sub4_15_ };
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							class12_sub12_sub11_sub4s, 3));
				} else {
					Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = {
							class12_sub12_sub11_sub4,
							class12_sub12_sub11_sub4_14_ };
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							class12_sub12_sub11_sub4s, 2));
				}
			}
			if (!arg1 && anInt2510 != 0)
				class12_sub12_sub11_sub4.method476(0, anInt2510, 0);
			if (arg1 && anInt2509 != 0)
				class12_sub12_sub11_sub4.method476(0, anInt2509, 0);
			if (anIntArray2494 != null) {
				for (int i_16_ = 0; anIntArray2494.length > i_16_; i_16_++)
					class12_sub12_sub11_sub4.method489(anIntArray2494[i_16_],
							anIntArray2498[i_16_]);
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.O(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub1[] method553(int arg0, Class26 arg1,
			int arg2, int arg3) {
		try {
			if (arg3 > -75)
				aClass59_2513 = null;
			anInt2476++;
			if (!Class5.method77(arg2, 29066, arg1, arg0))
				return null;
			return Class13.method564(110);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ud.N(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public Class12_Sub12_Sub11_Sub4 method554(boolean arg0, int arg1) {
		try {
			int i = anInt2490;
			int i_17_ = anInt2485;
			if (arg0) {
				i = anInt2508;
				i_17_ = anInt2511;
			}
			anInt2505++;
			if (arg1 != 18321)
				method544(null, (byte) -107);
			if ((i ^ 0xffffffff) == 0)
				return null;
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = Class12_Sub12_Sub11_Sub4
					.method496(Class35.aClass26_848, i, 0);
			if ((i_17_ ^ 0xffffffff) != 0) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_18_ = Class12_Sub12_Sub11_Sub4
						.method496(Class35.aClass26_848, i_17_, 0);
				Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = {
						class12_sub12_sub11_sub4, class12_sub12_sub11_sub4_18_ };
				class12_sub12_sub11_sub4 = new Class12_Sub12_Sub11_Sub4(
						class12_sub12_sub11_sub4s, 2);
			}
			if (anIntArray2494 != null) {
				for (int i_19_ = 0; anIntArray2494.length > i_19_; i_19_++)
					class12_sub12_sub11_sub4.method489(anIntArray2494[i_19_],
							anIntArray2498[i_19_]);
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method555(int arg0) {
		try {
			aClass59_2514 = null;
			aClass59_2527 = null;
			aClass59_2513 = null;
			aClass62_2503 = null;
			aClass12_Sub12_Sub7_Sub4_2529 = null;
			if (arg0 == 128) {
				aClass62_2491 = null;
				Cache.midiJinglesArchive = null;
				Game.gameServerSocket = null;
				anIntArray2507 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.F(" + arg0 + ')');
		}
	}

	public static void method556(byte arg0) {
		try {
			Class42.aClass27_987.method675(true);
			if (arg0 == -84) {
				Class39.aClass27_938.method675(true);
				anInt2522++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ud.M(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub15() {
		aBoolean2473 = false;
		anInt2487 = -1;
		aClass59Array2499 = new RSString[] { null, null, Class29.aClass59_709,
				null, null };
		aClass59_2480 = Archive.aClass59_1872;
		anInt2470 = 0;
		anInt2502 = 2000;
		anInt2485 = -1;
		anInt2504 = 128;
		anInt2492 = -1;
		anInt2496 = 1;
		anInt2495 = 0;
		anInt2517 = 0;
		anInt2508 = -1;
		anInt2483 = -1;
		anInt2488 = -1;
		aClass59Array2500 = new RSString[] { null, null, null, null,
				Class12_Sub12_Sub11_Sub5.aClass59_2860 };
		anInt2490 = -1;
		anInt2481 = 128;
		anInt2510 = 0;
		anInt2509 = 0;
		anInt2511 = -1;
		anInt2525 = 0;
		anInt2523 = -1;
		anInt2477 = 0;
		anInt2520 = 0;
		anInt2519 = -1;
		anInt2524 = -1;
		aBoolean2501 = false;
		anInt2530 = -1;
		anInt2478 = 128;
	}
}
