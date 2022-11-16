package com.jagex;/* com.jagex.Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.util.Statics;

public abstract class Class9 {
	public static int anInt203 = 0;
	public static long aLong204;
	public static int anInt205;
	public static int anInt206;
	public static int anInt207;
	public static int anInt208;
	public static int[] anIntArray209 = { 9104, 10275, 7595, 3610, 7975, 8526,
			918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	public static Class26 aClass26_210;
	public static int anInt211 = 0;
	public static int anInt212;
	public static RSString aClass59_213 = Class55.method898("@or3@", -10983);
	public static Class62 aClass62_214;
	public static int anInt215;

	public abstract int method105(int i, int i_0_, int i_1_);

	public abstract void method106(boolean bool);

	public static void method107(int arg0) {
		try {
			if (Class12_Sub12_Sub11_Sub1.aClass13_2641 != null) {
				synchronized (Class12_Sub12_Sub11_Sub1.aClass13_2641) {
					Class12_Sub12_Sub11_Sub1.aClass13_2641 = null;
				}
			}
			if (arg0 > 41)
				anInt205++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "c.D(" + arg0 + ')');
		}
	}

	public abstract void method108(byte i);

	public static void parseTrackedPlayerUpdateMasks(byte arg0) {
		try {
			for (int i = 0; Class47.anInt1094 > i; i++) {
				int i_2_ = Class10.anIntArray220[i];
				Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_];
				int i_3_ = Game.inBuffer.readUByte();
				if ((i_3_ & 0x40) != 0)
					i_3_ += (Game.inBuffer.readUByte() << 8);
				Class23.parsePlayerSyncMasks(i_2_, i_3_, 255,
						class12_sub12_sub11_sub2_sub2);
			}
			int i = -41 / ((arg0 - -4) / 58);
			anInt206++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "c.F(" + arg0 + ')');
		}
	}

	public static void method110(int arg0) {
		try {
			aClass26_210 = null;
			anIntArray209 = null;
			aClass62_214 = null;
			aClass59_213 = null;
			int i = -12 % ((-77 - arg0) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "c.E(" + arg0 + ')');
		}
	}

	public static void method111(byte arg0) {
		do {
			try {
				anInt208++;
				if (Class62_Sub2.anInt1918 > 0)
					Class62_Sub2.anInt1918--;
				if (Class12_Sub1.anInt1617 > 1)
					Class12_Sub1.anInt1617--;
				if (Class38.aBoolean912) {
					Class38.aBoolean912 = false;
					Class12_Sub1.method148(21254);
				} else {
					for (int i = 0; i < 100; i++) {
						if (!Class4.method69(0))
							break;
					}
					if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -31
							|| Class9_Sub2.anInt1588 == 35) {
						if (Class12_Sub12_Sub9.aBoolean2356
								&& (Class9_Sub2.anInt1588 ^ 0xffffffff) == -31) {
							Class12_Sub1.anInt1625 = 0;
							Class55.anInt1295 = 0;
							while (Class48.method791(true)) {
								/* empty */
							}
							for (int i = 0; ((Class12_Sub1.aBooleanArray1627.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++)
								Class12_Sub1.aBooleanArray1627[i] = false;
						}
						Class55.method895(Game.outBuffer, 0,
								186);
						synchronized (Class1.aClass19_72.anObject442) {
							if (!Class12_Sub12_Sub9.aBoolean2360)
								Class1.aClass19_72.anInt457 = 0;
							else if (((Class12_Sub1.anInt1625 ^ 0xffffffff) != -1)
									|| Class1.aClass19_72.anInt457 >= 40) {
								Game.outBuffer.writePacket(56
								);
								Class12_Sub2.anInt1642++;
								int i = 0;
								Game.outBuffer.writeByte(0);
								int i_4_ = (Game.outBuffer.position);
								for (int i_5_ = 0; i_5_ < Class1.aClass19_72.anInt457; i_5_++) {
									if ((-i_4_
											+ (Game.outBuffer.position) ^ 0xffffffff) <= -241)
										break;
									i++;
									int i_6_ = (Class1.aClass19_72.anIntArray458[i_5_]);
									int i_7_ = (Class1.aClass19_72.anIntArray459[i_5_]);
									if (i_7_ >= 0) {
										if ((i_7_ ^ 0xffffffff) < -765)
											i_7_ = 764;
									} else
										i_7_ = 0;
									if ((i_6_ ^ 0xffffffff) > -1)
										i_6_ = 0;
									else if (i_6_ > 502)
										i_6_ = 502;
									int i_8_ = 765 * i_6_ - -i_7_;
									if ((Class1.aClass19_72.anIntArray458[i_5_] == -1)
											&& (Class1.aClass19_72.anIntArray459[i_5_]) == -1) {
										i_6_ = -1;
										i_7_ = -1;
										i_8_ = 524287;
									}
									if ((i_7_ == Class12_Sub12_Sub11_Sub3.anInt2739)
											&& (Class12_Sub12_Sub1.anInt2044 == i_6_)) {
										if (Class12_Sub12_Sub11_Sub2.anInt2731 < 2047)
											Class12_Sub12_Sub11_Sub2.anInt2731++;
									} else {
										int i_9_ = (-Class12_Sub12_Sub1.anInt2044 + i_6_);
										Class12_Sub12_Sub1.anInt2044 = i_6_;
										int i_10_ = (-(Class12_Sub12_Sub11_Sub3.anInt2739) + i_7_);
										Class12_Sub12_Sub11_Sub3.anInt2739 = i_7_;
										if ((Class12_Sub12_Sub11_Sub2.anInt2731 ^ 0xffffffff) > -9
												&& i_10_ >= -32
												&& i_10_ <= 31
												&& i_9_ >= -32 && i_9_ <= 31) {
											i_10_ += 32;
											i_9_ += 32;
											Game.outBuffer
													.method247(
															(byte) 91,
															(i_9_ + ((i_10_ << 498233734) + ((Class12_Sub12_Sub11_Sub2.anInt2731) << 411314476))));
											Class12_Sub12_Sub11_Sub2.anInt2731 = 0;
										} else if (((Class12_Sub12_Sub11_Sub2.anInt2731) ^ 0xffffffff) > -9) {
											Game.outBuffer
													.method254(
															(i_8_ + (8388608 - -((Class12_Sub12_Sub11_Sub2.anInt2731) << 1965392947))),
															(byte) -37);
											Class12_Sub12_Sub11_Sub2.anInt2731 = 0;
										} else {
											Game.outBuffer
													.writeIntBE(
                                                            (i_8_ + (((Class12_Sub12_Sub11_Sub2.anInt2731) << 219368179) + -1073741824)));
											Class12_Sub12_Sub11_Sub2.anInt2731 = 0;
										}
									}
								}
								Game.outBuffer
										.method242(
												-1,
												(Game.outBuffer.position - i_4_));
								if ((i ^ 0xffffffff) > (Class1.aClass19_72.anInt457 ^ 0xffffffff)) {
									Class1.aClass19_72.anInt457 -= i;
									for (int i_11_ = 0; ((Class1.aClass19_72.anInt457 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
										Class1.aClass19_72.anIntArray459[i_11_] = (Class1.aClass19_72.anIntArray459[i
												+ i_11_]);
										Class1.aClass19_72.anIntArray458[i_11_] = (Class1.aClass19_72.anIntArray458[i_11_
												+ i]);
									}
								} else
									Class1.aClass19_72.anInt457 = 0;
							}
						}
						if ((Class12_Sub1.anInt1625 ^ 0xffffffff) != -1) {
							Class12_Sub12_Sub14.anInt2447++;
							long l = ((Archive.aLong1870 - Class12_Sub12_Sub3.aLong2128) / 50L);
							int i = Class10.anInt226;
							if ((i ^ 0xffffffff) <= -1) {
								if ((i ^ 0xffffffff) < -765)
									i = 764;
							} else
								i = 0;
							int i_12_ = Class42.anInt1000;
							if ((i_12_ ^ 0xffffffff) <= -1) {
								if (i_12_ > 502)
									i_12_ = 502;
							} else
								i_12_ = 0;
							if (l > 4095L)
								l = 4095L;
							Class12_Sub12_Sub3.aLong2128 = Archive.aLong1870;
							int i_13_ = i + i_12_ * 765;
							int i_14_ = 0;
							if ((Class12_Sub1.anInt1625 ^ 0xffffffff) == -3)
								i_14_ = 1;
							Game.outBuffer.writePacket(76);
							int i_15_ = (int) l;
							Game.outBuffer.method209(
									-921469304, ((i_15_ << 20)
											- -(i_14_ << 19) + i_13_));
						}
						if ((Class12_Sub12_Sub3.anInt2125 ^ 0xffffffff) < -1)
							Class12_Sub12_Sub3.anInt2125--;
						if (Class12_Sub1.aBooleanArray1627[96]
								|| Class12_Sub1.aBooleanArray1627[97]
								|| Class12_Sub1.aBooleanArray1627[98]
								|| Class12_Sub1.aBooleanArray1627[99])
							Class12_Sub12_Sub15.aBoolean2474 = true;
						if (Class12_Sub12_Sub15.aBoolean2474
								&& ((Class12_Sub12_Sub3.anInt2125 ^ 0xffffffff) >= -1)) {
							Class12_Sub1.anInt1618++;
							Class12_Sub12_Sub3.anInt2125 = 20;
							Class12_Sub12_Sub15.aBoolean2474 = false;
							Game.outBuffer.writePacket(0);
							Game.outBuffer.method241(96,
									Class12_Sub12_Sub13.anInt2441);
							Game.outBuffer.method235(
									Class48.anInt1127, (byte) 86);
						}
						if (arg0 < -104) {
							if (!Class36.aBoolean884 != true
									&& Class32.aBoolean785 == false) {
								Class12_Sub12_Sub8.anInt2286++;
								Class32.aBoolean785 = true;
								Game.outBuffer.writePacket(150
								);
								Game.outBuffer.writeByte(1);
							}
							if (!Class36.aBoolean884 != false
									&& !Class32.aBoolean785 != true) {
								Class32.aBoolean785 = false;
								Game.outBuffer.writePacket(150
								);
								Class12_Sub12_Sub8.anInt2286++;
								Game.outBuffer.writeByte(0);
							}
							Class27.method677((byte) -44);
							if (Class9_Sub2.anInt1588 == 30
									|| ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -36)) {
								Class43.method775(-39);
								Class10.method125(256);
								Class12_Sub12_Sub4.anInt2230++;
								if ((Class12_Sub12_Sub4.anInt2230 ^ 0xffffffff) < -751)
									Class12_Sub1.method148(21254);
								else {
									Class61.method952(false);
									Class12_Sub12_Sub11.method434(-2382);
									Class12_Sub12_Sub10.method433((byte) 127);
									Class12_Sub12_Sub11_Sub6.anInt2903++;
									if (Class12_Sub12_Sub16.anInt2560 != 0) {
										Class12.anInt333++;
										if (Class12.anInt333 >= 15) {
											if (Class12_Sub12_Sub16.anInt2560 == 2)
												Class49.aBoolean1146 = true;
											if ((Class12_Sub12_Sub16.anInt2560 ^ 0xffffffff) == -4)
												Class8.aBoolean182 = true;
											Class12_Sub12_Sub16.anInt2560 = 0;
										}
									}
									if ((Archive.anInt1903 ^ 0xffffffff) != -1) {
										Class12_Sub12_Sub4.anInt2228 += 20;
										if (Class12_Sub12_Sub4.anInt2228 >= 400)
											Archive.anInt1903 = 0;
									}
									if (Class12_Sub12_Sub12.anInt2417 != 0) {
										Class12_Sub12_Sub10.anInt2369++;
										if ((Class18.anInt432 > Statics.anInt576
												- -5)
												|| ((Class18.anInt432 ^ 0xffffffff) > (-5
														+ Statics.anInt576 ^ 0xffffffff))
												|| ((5 + Class63.anInt1388 ^ 0xffffffff) > (Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff))
												|| ((Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) > (-5
														+ Class63.anInt1388 ^ 0xffffffff)))
											Class26.aBoolean585 = true;
										if ((Class55.anInt1295 ^ 0xffffffff) == -1) {
											if (Class12_Sub12_Sub12.anInt2417 == 2)
												Class49.aBoolean1146 = true;
											if ((Class12_Sub12_Sub12.anInt2417 ^ 0xffffffff) == -4)
												Class8.aBoolean182 = true;
											Class12_Sub12_Sub12.anInt2417 = 0;
											if (!Class26.aBoolean585
													|| (Class12_Sub12_Sub10.anInt2369) < 5) {
												if (((Class43.anInt1016 ^ 0xffffffff) == -2 || (Class12_Sub12_Sub5
														.method321(
																(-1 + Class13.anInt338),
																(byte) 54)))
														&& (Class13.anInt338 ^ 0xffffffff) < -3)
													Class33.method713(-5);
												else if ((Class13.anInt338 ^ 0xffffffff) < -1)
													Class36.method728(-1
															+ Class13.anInt338,
															(byte) -67);
											} else {
												Class8.anInt175 = -1;
												Class12_Sub2.method154(83);
												if ((Class62.anInt1381 == Class8.anInt175)
														&& ((Class12_Sub12_Sub8.anInt2285) != (Archive.anInt1904))) {
													Class5.anInt162++;
													Class12_Sub12_Sub3 class12_sub12_sub3 = (Class62
															.method954(
																	Class62.anInt1381,
																	65535));
													int i = 0;
													if ((Class39.anInt936 ^ 0xffffffff) == -2
															&& (((class12_sub12_sub3.anInt2180) ^ 0xffffffff) == -207))
														i = 1;
													if ((class12_sub12_sub3.anIntArray2140[(Archive.anInt1904)]) <= 0)
														i = 0;
													if (!class12_sub12_sub3.aBoolean2159) {
														if (i != 1)
															class12_sub12_sub3
																	.method303(
																			(byte) 104,
																			(Class12_Sub12_Sub8.anInt2285),
																			(Archive.anInt1904));
														else {
															int i_16_ = (Archive.anInt1904);
															int i_17_ = (Class12_Sub12_Sub8.anInt2285);
															while ((i_16_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff)) {
																if (i_16_ < i_17_) {
																	class12_sub12_sub3
																			.method303(
																					(byte) 68,
																					i_17_,
																					(i_17_ - 1));
																	i_17_--;
																} else if ((i_17_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)) {
																	class12_sub12_sub3
																			.method303(
																					(byte) 57,
																					i_17_,
																					(i_17_ + 1));
																	i_17_++;
																}
															}
														}
													} else {
														int i_18_ = (Class12_Sub12_Sub8.anInt2285);
														int i_19_ = (Archive.anInt1904);
														class12_sub12_sub3.anIntArray2140[i_19_] = (class12_sub12_sub3.anIntArray2140[i_18_]);
														class12_sub12_sub3.anIntArray2149[i_19_] = (class12_sub12_sub3.anIntArray2149[i_18_]);
														class12_sub12_sub3.anIntArray2140[i_18_] = -1;
														class12_sub12_sub3.anIntArray2149[i_18_] = 0;
													}
													Game.outBuffer
															.writePacket(40);
													Game.outBuffer
															.method235(
																	(Class12_Sub12_Sub8.anInt2285),
																	(byte) 67);
													Game.outBuffer
															.method208(i, false);
													Game.outBuffer
															.method245(
																	(byte) -70,
																	Class62.anInt1381);
													Game.outBuffer
															.method235(
																	(Archive.anInt1904),
																	(byte) 103);
												}
											}
											Class12_Sub1.anInt1625 = 0;
											Class12.anInt333 = 10;
										}
									}
									if (Class52.anInt1218 != -1) {
										int i = Class52.anInt1225;
										int i_20_ = Class52.anInt1218;
										boolean bool = (Class64_Sub2
												.method997(
														true,
														i,
														25,
														0,
														0,
														0,
														0,
														0,
														i_20_,
														(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
														0,
														(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
										if (bool) {
											Class49.anInt1149 = Class42.anInt1000;
											Class12_Sub12_Sub4.anInt2228 = 0;
											Archive.anInt1903 = 1;
											Class33.anInt823 = Class10.anInt226;
										}
										Class52.anInt1218 = -1;
									}
									if (((Class12_Sub1.anInt1625 ^ 0xffffffff) == -2)
											&& Class32.aClass59_775 != null) {
										Class12_Sub1.anInt1625 = 0;
										Class8.aBoolean182 = true;
										Class32.aClass59_775 = null;
									}
									Class42.method760(120);
									if ((Class31.anInt756 ^ 0xffffffff) == 0) {
										Class12_Sub12_Sub11_Sub2_Sub1
												.method460(7786);
										Class13.method561((byte) -102);
										Class23.method616((byte) 102);
									}
									if (Class55.anInt1295 == 1
											|| Class12_Sub1.anInt1625 == 1)
										Class7.anInt1538++;
									if (((Class12_Sub1.anInt1626 ^ 0xffffffff) == 0)
											&& Class57.anInt1335 == -1
											&& Class63.anInt1418 == -1) {
										if ((Class30.anInt747 ^ 0xffffffff) < -1)
											Class30.anInt747--;
									} else if ((Class41.anInt961 ^ 0xffffffff) < (Class30.anInt747 ^ 0xffffffff)) {
										Class30.anInt747++;
										if ((Class30.anInt747 ^ 0xffffffff) == (Class41.anInt961 ^ 0xffffffff)) {
											if ((Class12_Sub1.anInt1626 ^ 0xffffffff) != 0)
												Class8.aBoolean182 = true;
											if ((Class57.anInt1335 ^ 0xffffffff) != 0)
												Class49.aBoolean1146 = true;
										}
									}
									Class12_Sub12_Sub2.method289(false);
									if (Class57.aBoolean1326)
										Class12_Sub12_Sub11_Sub6
												.method510(true);
									for (int i = 0; i < 5; i++)
										Class42.anIntArray994[i]++;
									Class32.method703(true);
									int i = Class12_Sub12_Sub11_Sub5
											.method508((byte) 93);
									int i_21_ = Class29.method689(false);
									if ((i ^ 0xffffffff) < -4501
											&& i_21_ > 4500) {
										RSApplet.anInt15++;
										Class62_Sub2.anInt1918 = 250;
										Class12_Sub2.method155(4000, 91);
										Game.outBuffer
												.writePacket(62);
									}
									Class12_Sub12_Sub11_Sub3.anInt2753++;
									Class12_Sub12_Sub13.anInt2437++;
									Class12_Sub12_Sub4.anInt2205++;
									if (Class12_Sub12_Sub4.anInt2205 > 500) {
										Class12_Sub12_Sub4.anInt2205 = 0;
										int i_22_ = (int) (Math.random() * 8.0);
										if ((i_22_ & 0x2) == 2)
											Class30.anInt728 += Class12_Sub12.anInt1839;
										if ((0x1 & i_22_ ^ 0xffffffff) == -2)
											Class62_Sub2.anInt1927 += Class43.anInt1018;
										if ((i_22_ & 0x4) == 4)
											Class11.anInt294 += Archive.anInt1886;
									}
									if (Class62_Sub2.anInt1927 < -50)
										Class43.anInt1018 = 2;
									if ((Class30.anInt728 ^ 0xffffffff) > 54)
										Class12_Sub12.anInt1839 = 2;
									if ((Class12_Sub12_Sub13.anInt2437 ^ 0xffffffff) < -501) {
										Class12_Sub12_Sub13.anInt2437 = 0;
										int i_23_ = (int) (Math.random() * 8.0);
										if ((0x1 & i_23_ ^ 0xffffffff) == -2)
											Class35.anInt842 += Class29.anInt691;
										if ((i_23_ & 0x2) == 2)
											Class15.anInt384 += Class39.anInt931;
									}
									if ((Class35.anInt842 ^ 0xffffffff) > 59)
										Class29.anInt691 = 2;
									if (Class30.anInt728 > 55)
										Class12_Sub12.anInt1839 = -2;
									if (Class11.anInt294 < -40)
										Archive.anInt1886 = 1;
									if (Class62_Sub2.anInt1927 > 50)
										Class43.anInt1018 = -2;
									if ((Class15.anInt384 ^ 0xffffffff) > 19)
										Class39.anInt931 = 1;
									if ((Class15.anInt384 ^ 0xffffffff) < -11)
										Class39.anInt931 = -1;
									if (Class11.anInt294 > 40)
										Archive.anInt1886 = -1;
									if ((Class35.anInt842 ^ 0xffffffff) < -61)
										Class29.anInt691 = -2;
									if ((Class12_Sub12_Sub11_Sub3.anInt2753 ^ 0xffffffff) < -51) {
										Class47.anInt1100++;
										Game.outBuffer
												.writePacket(139);
									}
									try {
										if ((Game.gameServerSocket == null)
												|| (Game.outBuffer.position) <= 0)
											break;
										Game.gameServerSocket
												.method622(
														(Game.outBuffer.payload),
														(Game.outBuffer.position),
														0, true);
										Game.outBuffer.position = 0;
										Class12_Sub12_Sub11_Sub3.anInt2753 = 0;
									} catch (java.io.IOException ioexception) {
										Class12_Sub1.method148(21254);
									}
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "c.G(" + arg0 + ')');
			}
		} while (false);
	}
}
