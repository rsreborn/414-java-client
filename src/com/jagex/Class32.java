package com.jagex;/* com.jagex.Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

public class Class32 {
	public int anInt772;
	public int anInt773;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_774;
	public static RSString aClass59_775 = null;
	public static int anInt776;
	public static RSString aClass59_777;
	public static int[] anIntArray778;
	public static RSString aClass59_779;
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array780;
	public int anInt781;
	public static Class27 aClass27_782;
	public int anInt783;
	public int anInt784;
	public static boolean aBoolean785 = true;
	public int anInt786;
	public static int anInt787;
	public int anInt788 = 0;
	public static int[] anIntArray789 = { 1, 2, 4, 8 };
	public int anInt790 = 0;
	public static int anInt791;
	public int anInt792;
	public static boolean aBoolean793;
	public static RSString aClass59_794 = Class55.method898("(Y", -10983);
	public int anInt795;
	public int anInt796;
	public static RSString aClass59_797;
	public int anInt798;
	public static int anInt799;
	public int anInt800;
	public static RSString aClass59_801;
	public static volatile int anInt802;
	public static RSString aClass59_803;

	public static void method702(boolean arg0, int arg1) {
		anInt791++;
		if (arg0 == true && Class5.aClass64_158 != null) {
			if ((Class49.anInt1142 ^ 0xffffffff) == -1) {
				if ((Class33.anInt825 ^ 0xffffffff) <= -1) {
					Class33.anInt825 = arg1;
					Class5.aClass64_158.method978(arg1, 0, (byte) 110);
				}
			} else if (Class27.aByteArray655 != null)
				Class12_Sub12_Sub13.anInt2421 = arg1;
		}
	}

	public static void method703(boolean arg0) {
		anInt776++;
		while (Class48.method791(arg0)) {
			if (Class13.anInt343 != -1
					&& (Class26.anInt616 ^ 0xffffffff) == (Class13.anInt343 ^ 0xffffffff)) {
				if (Class23.anInt502 == 85
						&& Class11.aClass59_278.length() > 0)
					Class11.aClass59_278 = (Class11.aClass59_278.method937(-1
							+ Class11.aClass59_278.length(), true, 0));
				if ((Class12_Sub12_Sub11_Sub2_Sub1.method454(
						Class12_Sub12.anInt1847, true) || (Class12_Sub12.anInt1847 ^ 0xffffffff) == -33)
						&& Class11.aClass59_278.length() < 12)
					Class11.aClass59_278 = Class11.aClass59_278.method938(38,
							Class12_Sub12.anInt1847);
			} else if (Class12_Sub4.aBoolean1671) {
				if (Class23.anInt502 == 85
						&& Class11.aClass59_297.length() > 0) {
					Class11.aClass59_297 = (Class11.aClass59_297.method937(-1
							+ Class11.aClass59_297.length(), true, 0));
					Class8.aBoolean182 = true;
				}
				if (Class12_Sub12_Sub12
						.method520(Class12_Sub12.anInt1847, 8159)
						&& ((Class11.aClass59_297.length() ^ 0xffffffff) > -81)) {
					Class11.aClass59_297 = Class11.aClass59_297.method938(38,
							Class12_Sub12.anInt1847);
					Class8.aBoolean182 = true;
				}
				if ((Class23.anInt502 ^ 0xffffffff) == -85) {
					Class12_Sub4.aBoolean1671 = false;
					Class8.aBoolean182 = true;
					if (Class9.anInt211 == 1) {
						long l = Class11.aClass59_297.method912(122);
						Class12_Sub12_Sub13.method533(-115, l);
					}
					if (Class9.anInt211 == 2 && Class7.anInt1540 > 0) {
						long l = Class11.aClass59_297.method912(118);
						Class40.method753(l, -19259);
					}
					if (Class9.anInt211 == 3
							&& ((Class11.aClass59_297.length() ^ 0xffffffff) < -1)) {
						Class12_Sub12_Sub12.anInt2419++;
						Game.outBuffer.writePacket(125);
						Game.outBuffer.writeByte(0);
						int i = Game.outBuffer.position;
						Game.outBuffer.writeLongBE(
                                Class56.aLong1323);
						Class12_Sub12_Sub3.method295(Class11.aClass59_297,
								Game.outBuffer, 0);
						Game.outBuffer.method242(-1, -i
								+ Game.outBuffer.position);
						if (Class12_Sub12_Sub3.anInt2154 == 2) {
							Class12_Sub12_Sub3.anInt2154 = 1;
							Class27.anInt636++;
							Statics.aBoolean2025 = true;
							Game.outBuffer
									.writePacket(251);
							Game.outBuffer.writeByte(
									Class31.anInt757);
							Game.outBuffer.writeByte(
									Class12_Sub12_Sub3.anInt2154);
							Game.outBuffer.writeByte(
									Class4.anInt138);
						}
					}
					if ((Class9.anInt211 ^ 0xffffffff) == -5
							&& Class49.anInt1147 < 100) {
						long l = Class11.aClass59_297.method912(117);
						Class12_Sub7.method191(l, 7159);
					}
					if ((Class9.anInt211 ^ 0xffffffff) == -6
							&& Class49.anInt1147 > 0) {
						long l = Class11.aClass59_297.method912(120);
						Class62.method956(22793, l);
					}
				}
			} else if ((Class1.anInt85 ^ 0xffffffff) == -2) {
				if ((Class23.anInt502 ^ 0xffffffff) == -86
						&& Class11.aClass59_265.length() > 0) {
					Class11.aClass59_265 = Class11.aClass59_265.method937(
							(Class11.aClass59_265.length() - 1), true, 0);
					Class8.aBoolean182 = true;
				}
				if (Class12_Sub12_Sub11_Sub6.method514(-1104831966,
						Class12_Sub12.anInt1847)
						&& ((Class11.aClass59_265.length() ^ 0xffffffff) > -11)) {
					Class11.aClass59_265 = Class11.aClass59_265.method938(38,
							Class12_Sub12.anInt1847);
					Class8.aBoolean182 = true;
				}
				if ((Class23.anInt502 ^ 0xffffffff) == -85) {
					if (Class11.aClass59_265.length() > 0) {
						Class62_Sub2.anInt1924++;
						int i = 0;
						if (Class11.aClass59_265.method947(-61))
							i = Class11.aClass59_265.method948(-107);
						Game.outBuffer.writePacket(119);
						Game.outBuffer
								.writeIntBE(i);
					}
					Class8.aBoolean182 = true;
					Class1.anInt85 = 0;
				}
			} else if ((Class1.anInt85 ^ 0xffffffff) != -3) {
				if (Class1.anInt85 != 3) {
					if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == 0
							&& Class31.anInt756 == -1) {
						if (Class23.anInt502 == 85
								&& (Class11.aClass59_306.length() ^ 0xffffffff) < -1) {
							Class11.aClass59_306 = (Class11.aClass59_306
									.method937(
											-1
													+ Class11.aClass59_306
															.length(),
											true, 0));
							Class8.aBoolean182 = true;
						}
						if (Class12_Sub12_Sub12.method520(
								Class12_Sub12.anInt1847, 8159)
								&& (Class11.aClass59_306.length() ^ 0xffffffff) > -81) {
							Class11.aClass59_306 = Class11.aClass59_306
									.method938(38, Class12_Sub12.anInt1847);
							Class8.aBoolean182 = true;
						}
						if ((Class23.anInt502 ^ 0xffffffff) == -85
								&& Class11.aClass59_306.length() > 0) {
							if (Class12_Sub12_Sub6.anInt2267 == 2) {
								if (Class11.aClass59_306.method934(
										Class49.aClass59_1169, 17706))
									Class12_Sub1.method148(21254);
								if (Class11.aClass59_306.method934(
										Class12_Sub12_Sub11_Sub1.aClass59_2660,
										17706))
									Class43.aBoolean1023 = true;
								if (Class11.aClass59_306.method934(
										Class11.aClass59_256, 17706))
									Class43.aBoolean1023 = false;
								if (Class11.aClass59_306.method934(
										Class9_Sub2.aClass59_1603, 17706)) {
									for (int i = 0; i < 4; i++) {
										for (int i_0_ = 1; i_0_ < 103; i_0_++) {
											for (int i_1_ = 1; (i_1_ ^ 0xffffffff) > -104; i_1_++)
												Class11.aClass10Array280[i].anIntArrayArray222[i_0_][i_1_] = 0;
										}
									}
								}
								if ((Class11.aClass59_306.method934(
										Class63.aClass59_1397, 17706))
										&& (Class20.anInt478 ^ 0xffffffff) == -3)
									throw new RuntimeException();
								if (Class11.aClass59_306.method934(
										Class12_Sub12_Sub11_Sub3.aClass59_2749,
										17706))
									Class36.aBoolean887 = true;
							}
							if (!Class11.aClass59_306.method928(
									Class63.aClass59_1403, 0)) {
								RSString class59 = Class11.aClass59_306
										.method939((byte) -124);
								Class35.anInt847++;
								int i = 0;
								if (class59.method928(
										(Class12_Sub12_Sub6.aClass59_2255), 0)) {
									i = 0;
									Class11.aClass59_306 = (Class11.aClass59_306
											.method945(
													63,
													Class12_Sub12_Sub6.aClass59_2255
															.length()));
								} else if (!class59
										.method928(
												(Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2933),
												0)) {
									if (!class59.method928(
											(RSSocket.aClass59_536), 0)) {
										if (class59.method928(
												(Class30.aClass59_720), 0)) {
											i = 3;
											Class11.aClass59_306 = (Class11.aClass59_306
													.method945(
															63,
															Class30.aClass59_720
																	.length()));
										} else if (!class59
												.method928(
														(Class12_Sub12_Sub6.aClass59_2262),
														0)) {
											if (class59.method928(
													Class28.aClass59_681, 0)) {
												Class11.aClass59_306 = (Class11.aClass59_306
														.method945(
																63,
																Class28.aClass59_681
																		.length()));
												i = 5;
											} else if (class59
													.method928(
															(Class12_Sub12_Sub11_Sub5.aClass59_2859),
															0)) {
												Class11.aClass59_306 = (Class11.aClass59_306
														.method945(
																63,
																Class12_Sub12_Sub11_Sub5.aClass59_2859
																		.length()));
												i = 6;
											} else if (class59.method928(
													Class4.aClass59_141, 0)) {
												i = 7;
												Class11.aClass59_306 = (Class11.aClass59_306
														.method945(
																63,
																Class4.aClass59_141
																		.length()));
											} else if (class59
													.method928(
															(Class12_Sub12_Sub11_Sub2.aClass59_2685),
															0)) {
												Class11.aClass59_306 = (Class11.aClass59_306
														.method945(
																63,
																Class12_Sub12_Sub11_Sub2.aClass59_2685
																		.length()));
												i = 8;
											} else if (class59.method928(
													Class35.aClass59_873, 0)) {
												i = 9;
												Class11.aClass59_306 = (Class11.aClass59_306
														.method945(
																63,
																Class35.aClass59_873
																		.length()));
											} else if (!class59
													.method928(
															(Class12_Sub1.aClass59_1624),
															0)) {
												if (class59.method928(
														Class62.aClass59_1378,
														0)) {
													i = 11;
													Class11.aClass59_306 = (Class11.aClass59_306
															.method945(
																	63,
																	(Class62.aClass59_1378
																			.length())));
												}
											} else {
												i = 10;
												Class11.aClass59_306 = (Class11.aClass59_306
														.method945(
																63,
																Class12_Sub1.aClass59_1624
																		.length()));
											}
										} else {
											i = 4;
											Class11.aClass59_306 = (Class11.aClass59_306
													.method945(
															63,
															Class12_Sub12_Sub6.aClass59_2262
																	.length()));
										}
									} else {
										i = 2;
										Class11.aClass59_306 = (Class11.aClass59_306
												.method945(63,
														RSSocket.aClass59_536
																.length()));
									}
								} else {
									i = 1;
									Class11.aClass59_306 = (Class11.aClass59_306
											.method945(
													63,
													Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2933
															.length()));
								}
								class59 = Class11.aClass59_306
										.method939((byte) -116);
								int i_2_ = 0;
								if (class59
										.method928(
												(Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2935),
												0)) {
									i_2_ = 1;
									Class11.aClass59_306 = (Class11.aClass59_306
											.method945(
													63,
													Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2935
															.length()));
								} else if (class59.method928(
										Class12_Sub12_Sub11.aClass59_2389, 0)) {
									Class11.aClass59_306 = (Class11.aClass59_306
											.method945(
													63,
													Class12_Sub12_Sub11.aClass59_2389
															.length()));
									i_2_ = 2;
								} else if (class59.method928(
										(Class4.aClass59_125), 0)) {
									i_2_ = 3;
									Class11.aClass59_306 = (Class11.aClass59_306
											.method945(63, Class4.aClass59_125
													.length()));
								} else if (!class59.method928(
										(Class49.aClass59_1164), 0)) {
									if (class59
											.method928(
													(Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2925),
													0)) {
										i_2_ = 5;
										Class11.aClass59_306 = (Class11.aClass59_306
												.method945(
														63,
														Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2925
																.length()));
									}
								} else {
									Class11.aClass59_306 = (Class11.aClass59_306
											.method945(63,
													Class49.aClass59_1164
															.length()));
									i_2_ = 4;
								}
								Game.outBuffer.writePacket(103
								);
								Game.outBuffer.writeByte(0);
								int i_3_ = (Game.outBuffer.position);
								Game.outBuffer.writeByte(i);
								Game.outBuffer.writeByte(
										i_2_);
								Class12_Sub12_Sub3.method295(
										Class11.aClass59_306,
										Game.outBuffer, 0);
								Game.outBuffer
										.method242(
												-1,
												(Game.outBuffer.position + -i_3_));
								if (Class31.anInt757 == 2) {
									Class27.anInt636++;
									Statics.aBoolean2025 = true;
									Class31.anInt757 = 3;
									Game.outBuffer.writePacket(
											251);
									Game.outBuffer.writeByte(
											Class31.anInt757);
									Game.outBuffer.writeByte(
											Class12_Sub12_Sub3.anInt2154);
									Game.outBuffer.writeByte(
											Class4.anInt138);
								}
							} else {
								Game.anInt1573++;
								Game.outBuffer.writePacket(55
								);
								Game.outBuffer.writeByte(
										Class11.aClass59_306.length() - 1);
								Game.outBuffer.writeString(
										Class11.aClass59_306.method945(63, 2)
								);
							}
							Class8.aBoolean182 = true;
							Class11.aClass59_306 = Class11.aClass59_310;
						}
					}
				} else {
					if (Class23.anInt502 == 85
							&& ((Class11.aClass59_265.length() ^ 0xffffffff) < -1)) {
						Class11.aClass59_265 = (Class11.aClass59_265.method937(
								-1 + Class11.aClass59_265.length(), true,
								0));
						Class8.aBoolean182 = true;
					}
					if (Class12_Sub12_Sub12.method520(Class12_Sub12.anInt1847,
							8159) && Class11.aClass59_265.length() < 40) {
						Class11.aClass59_265 = Class11.aClass59_265.method938(
								38, Class12_Sub12.anInt1847);
						Class8.aBoolean182 = true;
					}
				}
			} else {
				if ((Class23.anInt502 ^ 0xffffffff) == -86
						&& ((Class11.aClass59_265.length() ^ 0xffffffff) < -1)) {
					Class11.aClass59_265 = Class11.aClass59_265.method937(
							(Class11.aClass59_265.length() - 1), true, 0);
					Class8.aBoolean182 = true;
				}
				if ((Class12_Sub12_Sub11_Sub2_Sub1.method454(
						Class12_Sub12.anInt1847, true) || Class12_Sub12.anInt1847 == 32)
						&& Class11.aClass59_265.length() < 12) {
					Class11.aClass59_265 = Class11.aClass59_265.method938(38,
							Class12_Sub12.anInt1847);
					Class8.aBoolean182 = true;
				}
				if ((Class23.anInt502 ^ 0xffffffff) == -85) {
					if (Class11.aClass59_265.length() > 0) {
						Game.outBuffer.writePacket(238);
						Game.outBuffer.writeLongBE(
                                Class11.aClass59_265.method912(112));
						Class12_Sub12_Sub2.anInt2105++;
					}
					Class1.anInt85 = 0;
					Class8.aBoolean182 = true;
				}
			}
		}
		if (arg0 != true)
			aClass59_797 = null;
	}

	public static RSString method704(int arg0, int arg1) {
		try {
			anInt799++;
			if (arg0 < 100000)
				return Class19.method599(arg0, 10);
			if ((arg0 ^ 0xffffffff) > -10000001)
				return (Statics.method251((byte) -50, new RSString[] {
						Class19.method599(arg0 / 1000, 10),
						Class12_Sub7.aClass59_1735 }));
			if (arg1 < 28)
				aClass59_794 = null;
			return Statics.method251((byte) -56,
					(new RSString[] { Class19.method599(arg0 / 1000000, 10),
							Statics.aClass59_562 }));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "kd.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method705(int arg0) {
		try {
			int i = 69 % ((arg0 - 63) / 38);
			aClass59_794 = null;
			anIntArray789 = null;
			aClass59_775 = null;
			aClass59_803 = null;
			aClass59_797 = null;
			aClass59_779 = null;
			aClass59_801 = null;
			aClass59_777 = null;
			anIntArray778 = null;
			aClass27_782 = null;
			aClass12_Sub12_Sub7_Sub1Array780 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "kd.A(" + arg0 + ')');
		}
	}

	public static void method706(Class26 arg0, Class26 arg1, int arg2,
			Class26 arg3) {
		do {
			try {
				Class12_Sub12_Sub11.aClass26_2384 = arg3;
				anInt787++;
				Class12_Sub6.aClass26_1688 = arg0;
				Statics.aClass26_1830 = arg1;
				if (arg2 == 2)
					break;
				method706(null, null, -64, null);
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, ("kd.E("
						+ (arg0 != null ? "{...}" : "null") + ','
						+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
						+ (arg3 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass12_Sub12_Sub7_Sub1Array780 = new Class12_Sub12_Sub7_Sub1[1000];
		aClass59_777 = Class55.method898("null", -10983);
		aClass59_797 = (Class55
				.method898(
						"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\0341(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ",
						-10983));
		aClass59_779 = aClass59_797;
		aClass27_782 = new Class27(64);
		anInt802 = 0;
		aClass59_803 = Class55.method898("Examine", -10983);
		aClass59_801 = aClass59_803;
	}
}
