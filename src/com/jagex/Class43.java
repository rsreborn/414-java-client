package com.jagex;/* com.jagex.Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.io.Buffer;
import com.jagex.util.Statics;

import java.io.IOException;

public class Class43 {
	public static RSString aClass59_1009;
	public static RSString aClass59_1010;
	public static RSString aClass59_1011 = Class55.method898("(X", -10983);
	public static int anInt1012;
	public static RSString aClass59_1013;
	public static RSString aClass59_1014 = Class55.method898("b12_full", -10983);
	public static int anInt1015;
	public static int anInt1016;
	public static int[] anIntArray1017;
	public static int anInt1018;
	public static RSString aClass59_1019;
	public static int anInt1020;
	public static int anInt1021;
	public static int anInt1022;
	public static boolean aBoolean1023;
	public static RSString aClass59_1024;

	public static boolean method773(int arg0) {
		try {
			anInt1012++;
			long l = System.currentTimeMillis();
			int i = (int) (l + -Class17.aLong425);
			Class17.aLong425 = l;
			if (i > 200)
				i = 200;
			Class15.anInt391 += i;
			if (Class27.anInt635 == 0 && Class61.anInt1363 == 0
					&& (Game.anInt1562 ^ 0xffffffff) == -1
					&& (Class12_Sub12_Sub14.anInt2464 ^ 0xffffffff) == -1)
				return true;
			if (Class48.aClass24_1124 == null)
				return false;
			try {
				if (Class15.anInt391 > 30000)
					throw new IOException();
				while (Class61.anInt1363 < 20) {
					if ((Class12_Sub12_Sub14.anInt2464 ^ 0xffffffff) >= -1)
						break;
					Class12_Sub12_Sub8 class12_sub12_sub8 = ((Class12_Sub12_Sub8) Class12_Sub1.aClass48_1612
							.method796((byte) 51));
					Buffer class12_sub11 = new Buffer(4);
					class12_sub11.writeByte(1);
					class12_sub11.method254((int) class12_sub12_sub8.aLong319,
							(byte) -77);
					Class48.aClass24_1124.method622(
							class12_sub11.payload, 4, 0, true);
					Class12_Sub12_Sub8.aClass48_2288.method797((byte) -87,
							class12_sub12_sub8, class12_sub12_sub8.aLong319);
					Class61.anInt1363++;
					Class12_Sub12_Sub14.anInt2464--;
				}
				for (/**/; ((Class27.anInt635 ^ 0xffffffff) > -21 && Game.anInt1562 > 0); Class27.anInt635++) {
					Class12_Sub12_Sub8 class12_sub12_sub8 = (Class12_Sub12_Sub8) Class12_Sub12_Sub11_Sub5.aClass38_2857
							.method738(0);
					Buffer class12_sub11 = new Buffer(4);
					class12_sub11.writeByte(0);
					class12_sub11.method254((int) class12_sub12_sub8.aLong319,
							(byte) -97);
					Class48.aClass24_1124.method622(
							class12_sub11.payload, 4, 0, true);
					class12_sub12_sub8.method268(true);
					Archive.aClass48_1887.method797((byte) -106,
							class12_sub12_sub8, (class12_sub12_sub8.aLong319));
					Game.anInt1562--;
				}
				if (arg0 < 63)
					method777(-41, 119);
				for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -101; i_0_++) {
					int i_1_ = Class48.aClass24_1124.method617(false);
					if ((i_1_ ^ 0xffffffff) > -1)
						throw new IOException();
					if (i_1_ == 0)
						break;
					int i_2_ = 0;
					if (Class13.aClass12_Sub12_Sub8_354 != null) {
						if ((Class12_Sub12_Sub3.anInt2113 ^ 0xffffffff) == -1)
							i_2_ = 1;
					} else
						i_2_ = 8;
					Class15.anInt391 = 0;
					if (i_2_ > 0) {
						int i_3_ = i_2_
								- (Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position);
						if ((i_1_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
							i_3_ = i_1_;
						Class48.aClass24_1124
								.method618(
										(byte) 32,
										i_3_,
										(Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.payload),
										(Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position));
						if ((Class15.aByte398 ^ 0xffffffff) != -1) {
							for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
								Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.payload[(Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position)
										+ i_4_] = (byte) (Class21
										.method609(
												(Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.payload[(Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position)
														+ i_4_]),
												Class15.aByte398));
						}
						Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position += i_3_;
						if ((Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position) < i_2_)
							break;
						if (Class13.aClass12_Sub12_Sub8_354 == null) {
							Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position = 0;
							int i_5_ = Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659
									.readUByte();
							int i_6_ = Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659
									.readShortBE();
							long l_7_ = (long) (i_6_ + (i_5_ << 1341974000));
							int i_8_ = Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659
									.readUByte();
							int i_9_ = Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659
									.method207(-708753192);
							Class12_Sub12_Sub8 class12_sub12_sub8 = ((Class12_Sub12_Sub8) Class12_Sub12_Sub8.aClass48_2288
									.method795(l_7_, 31));
							Class15.aBoolean399 = true;
							if (class12_sub12_sub8 == null) {
								class12_sub12_sub8 = ((Class12_Sub12_Sub8) Archive.aClass48_1887
										.method795(l_7_, -123));
								Class15.aBoolean399 = false;
							}
							if (class12_sub12_sub8 == null)
								throw new IOException();
							Class13.aClass12_Sub12_Sub8_354 = class12_sub12_sub8;
							int i_10_ = (i_8_ ^ 0xffffffff) == -1 ? 5 : 9;
							Class12_Sub12_Sub10.aClass12_Sub11_2377 = new Buffer(
									i_9_
											+ i_10_
											+ (Class13.aClass12_Sub12_Sub8_354.aByte2287));
							Class12_Sub12_Sub10.aClass12_Sub11_2377.writeByte(
									i_8_);
							Class12_Sub12_Sub10.aClass12_Sub11_2377.writeIntBE(
									i_9_);
							Class12_Sub12_Sub3.anInt2113 = 8;
							Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position = 0;
						} else if (Class12_Sub12_Sub3.anInt2113 == 0) {
							if (((Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.payload[0]) ^ 0xffffffff) == 0) {
								Class12_Sub12_Sub11_Sub1.aClass12_Sub11_2659.position = 0;
								Class12_Sub12_Sub3.anInt2113 = 1;
							} else
								Class13.aClass12_Sub12_Sub8_354 = null;
						}
					} else {
						int i_11_ = (-Class13.aClass12_Sub12_Sub8_354.aByte2287 + (Class12_Sub12_Sub10.aClass12_Sub11_2377.payload).length);
						int i_12_ = -Class12_Sub12_Sub3.anInt2113 + 512;
						if ((-(Class12_Sub12_Sub10.aClass12_Sub11_2377.position)
								+ i_11_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff))
							i_12_ = i_11_
									- (Class12_Sub12_Sub10.aClass12_Sub11_2377.position);
						if (i_1_ < i_12_)
							i_12_ = i_1_;
						Class48.aClass24_1124
								.method618(
										(byte) 32,
										i_12_,
										(Class12_Sub12_Sub10.aClass12_Sub11_2377.payload),
										(Class12_Sub12_Sub10.aClass12_Sub11_2377.position));
						if ((Class15.aByte398 ^ 0xffffffff) != -1) {
							for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_13_++)
								Class12_Sub12_Sub10.aClass12_Sub11_2377.payload[(Class12_Sub12_Sub10.aClass12_Sub11_2377.position)
										+ i_13_] = (byte) (Class21
										.method609(
												(Class12_Sub12_Sub10.aClass12_Sub11_2377.payload[(Class12_Sub12_Sub10.aClass12_Sub11_2377.position)
														+ i_13_]),
												Class15.aByte398));
						}
						Class12_Sub12_Sub3.anInt2113 += i_12_;
						Class12_Sub12_Sub10.aClass12_Sub11_2377.position += i_12_;
						if ((Class12_Sub12_Sub10.aClass12_Sub11_2377.position) == i_11_) {
							if (Class13.aClass12_Sub12_Sub8_354.aLong319 == 16711935L) {
								Class12_Sub12_Sub9.aClass12_Sub11_2339 = Class12_Sub12_Sub10.aClass12_Sub11_2377;
								for (int i_14_ = 0; i_14_ < 256; i_14_++) {
									Archive class26_sub1 = Class5.aClass26_Sub1Array154[i_14_];
									if (class26_sub1 != null) {
										Class12_Sub12_Sub9.aClass12_Sub11_2339.position = 5 + 4 * i_14_;
										int i_15_ = Class12_Sub12_Sub9.aClass12_Sub11_2339
												.method207(-708753192);
										class26_sub1.method663(255, i_15_);
									}
								}
							} else {
								Player.aCRC32_2966
										.reset();
								Player.aCRC32_2966
										.update((Class12_Sub12_Sub10.aClass12_Sub11_2377.payload),
												0, i_11_);
								int i_16_ = (int) Player.aCRC32_2966
										.getValue();
								if (i_16_ != (Class13.aClass12_Sub12_Sub8_354.anInt2293)) {
									try {
										Class48.aClass24_1124.method619(-2);
									} catch (Exception exception) {
										/* empty */
									}
									Class15.aByte398 = (byte) (int) (255.0 * Math
											.random() + 1.0);
									Class48.aClass24_1124 = null;
									Class12_Sub12_Sub10.anInt2365++;
									return false;
								}
								Class12_Sub12_Sub10.anInt2365 = 0;
								Class12_Sub12_Sub8.anInt2294 = 0;
								Class13.aClass12_Sub12_Sub8_354.aClass26_Sub1_2284
										.method667(
												(Class12_Sub12_Sub10.aClass12_Sub11_2377.payload),
												(int) (0xffffL & (Class13.aClass12_Sub12_Sub8_354.aLong319)),
												((Class13.aClass12_Sub12_Sub8_354.aLong319 & 0xff0000L) ^ 0xffffffffffffffffL) == -16711681L,
												Class15.aBoolean399, -18);
							}
							Class13.aClass12_Sub12_Sub8_354
									.method143((byte) 39);
							Class13.aClass12_Sub12_Sub8_354 = null;
							Class12_Sub12_Sub3.anInt2113 = 0;
							if (!Class15.aBoolean399)
								Class27.anInt635--;
							else
								Class61.anInt1363--;
							Class12_Sub12_Sub10.aClass12_Sub11_2377 = null;
						} else {
							if (Class12_Sub12_Sub3.anInt2113 != 512)
								break;
							Class12_Sub12_Sub3.anInt2113 = 0;
						}
					}
				}
				return true;
			} catch (IOException ioexception) {
				try {
					Class48.aClass24_1124.method619(-2);
				} catch (Exception exception) {
					/* empty */
				}
				Class48.aClass24_1124 = null;
				Class12_Sub12_Sub8.anInt2294++;
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "o.F(" + arg0 + ')');
		}
	}

	public static void method774(int arg0) {
		try {
			if (arg0 == 60) {
				Class32.aClass27_782.method675(true);
				anInt1020++;
				Class20.aClass27_463.method675(true);
				Class12.aClass27_327.method675(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "o.D(" + arg0 + ')');
		}
	}

	public static void method775(int arg0) {
		for (Class12_Sub2 class12_sub2 = ((Class12_Sub2) RuntimeException_Sub1.aClass8_1460
				.method91((byte) 86)); class12_sub2 != null; class12_sub2 = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
				.method100(-29860)) {
			if ((class12_sub2.anInt1633 ^ 0xffffffff) < -1)
				class12_sub2.anInt1633--;
			if ((class12_sub2.anInt1633 ^ 0xffffffff) != -1) {
				if (class12_sub2.anInt1640 > 0)
					class12_sub2.anInt1640--;
				if ((class12_sub2.anInt1640 ^ 0xffffffff) == -1
						&& (class12_sub2.anInt1638 ^ 0xffffffff) <= -2
						&& (class12_sub2.anInt1644 ^ 0xffffffff) <= -2
						&& class12_sub2.anInt1638 <= 102
						&& class12_sub2.anInt1644 <= 102
						&& (class12_sub2.anInt1650 < 0 || Class33.method711(
								class12_sub2.anInt1650, class12_sub2.anInt1657,
								true))) {
					Class13.method565(class12_sub2.anInt1650,
							class12_sub2.anInt1638, class12_sub2.anInt1657,
							class12_sub2.anInt1629, 25359,
							class12_sub2.anInt1658, class12_sub2.anInt1635,
							class12_sub2.anInt1644);
					class12_sub2.anInt1640 = -1;
					if (((class12_sub2.anInt1650 ^ 0xffffffff) != (class12_sub2.anInt1652 ^ 0xffffffff))
							|| (class12_sub2.anInt1652 ^ 0xffffffff) != 0) {
						if (((class12_sub2.anInt1650 ^ 0xffffffff) == (class12_sub2.anInt1652 ^ 0xffffffff))
								&& class12_sub2.anInt1651 == class12_sub2.anInt1658
								&& ((class12_sub2.anInt1653 ^ 0xffffffff) == (class12_sub2.anInt1657 ^ 0xffffffff)))
							class12_sub2.method143((byte) 39);
					} else
						class12_sub2.method143((byte) 39);
				}
			} else if (class12_sub2.anInt1652 < 0
					|| Class33.method711(class12_sub2.anInt1652,
							class12_sub2.anInt1653, true)) {
				Class13.method565(class12_sub2.anInt1652,
						class12_sub2.anInt1638, class12_sub2.anInt1653,
						class12_sub2.anInt1629, 25359, class12_sub2.anInt1651,
						class12_sub2.anInt1635, class12_sub2.anInt1644);
				class12_sub2.method143((byte) 39);
			}
		}
		anInt1021++;
		if (arg0 >= -23)
			method776(-85);
	}

	public static void method776(int arg0) {
		try {
			anInt1022++;
			Class15.aBoolean392 = true;
			Statics.method248(-128);
			if (Class12_Sub4.aBoolean1671) {
				Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
						Class11.aClass59_290, 239, 40, 0);
				Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
						Statics.method251((byte) -111, (new RSString[] {
								Class11.aClass59_297,
								Class12_Sub2.aClass59_1636 })), 239, 60, 128);
			} else if (Class1.anInt85 == 1) {
				Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
						Class28.aClass59_679, 239, 40, 0);
				Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
						Statics.method251((byte) -39, (new RSString[] {
								Class11.aClass59_265,
								Class12_Sub2.aClass59_1636 })), 239, 60, 128);
			} else if ((Class1.anInt85 ^ 0xffffffff) != -3) {
				if (Class1.anInt85 == 3) {
					if (Class11.aClass59_265 != Class11.aClass59_299) {
						Game.method34(0, Class11.aClass59_265);
						Class11.aClass59_299 = Class11.aClass59_265;
					}
					Class12_Sub12_Sub7_Sub4 class12_sub12_sub7_sub4 = Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529;
					Class12_Sub12_Sub7.method346(0, 0, 463, 77);
					for (int i = 0; i < RuntimeException_Sub1.anInt1473; i++) {
						int i_17_ = i * 14 + (18 - Class29.anInt713);
						if ((i_17_ ^ 0xffffffff) < -1 && i_17_ < 110)
							class12_sub12_sub7_sub4
									.method396(Class48.aClass59Array1118[i],
											239, i_17_, 0);
					}
					Class12_Sub12_Sub7.method348();
					if ((RuntimeException_Sub1.anInt1473 ^ 0xffffffff) < -6)
						Class30.method694(0,
								(RuntimeException_Sub1.anInt1473 * 14 - -7),
								77, (byte) 119, Class29.anInt713, 463);
					if ((Class11.aClass59_265.length() ^ 0xffffffff) == -1)
						Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
								Class12_Sub12_Sub11_Sub1.aClass59_2654, 239,
								40, 255);
					else if (RuntimeException_Sub1.anInt1473 == 0)
						Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
								Statics.aClass59_553, 239, 40, 0);
					class12_sub12_sub7_sub4.method396(
							Statics.method251((byte) -66, (new RSString[] {
									Class11.aClass59_265,
									(Class12_Sub2.aClass59_1636) })), 239, 90,
							0);
					Class12_Sub12_Sub7.method343(0, 77, 479, 0);
				} else if (Class32.aClass59_775 != null) {
					Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
							Class32.aClass59_775, 239, 40, 0);
					Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
							Class12_Sub12_Sub12.aClass59_2415, 239, 60, 128);
				} else if (Class12_Sub12_Sub12.anInt2407 != -1) {
					boolean bool = Class12_Sub12_Sub5.method322(0, 479, -1, 2,
							0, (Class12_Sub12_Sub12.anInt2407), (byte) 99, 96,
							0);
					if (!bool)
						Class8.aBoolean182 = true;
				} else if ((Class58.anInt1342 ^ 0xffffffff) != 0) {
					boolean bool = Class12_Sub12_Sub5.method322(0, 479, -1, 3,
							0, Class58.anInt1342, (byte) 99, 96, 0);
					if (!bool)
						Class8.aBoolean182 = true;
				} else {
					Class12_Sub12_Sub7_Sub4 class12_sub12_sub7_sub4 = Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529;
					int i = 0;
					Class12_Sub12_Sub7.method346(0, 0, 463, 77);
					for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -101; i_18_++) {
						if (Class26.aClass59Array591[i_18_] != null) {
							int i_19_ = Class30.anIntArray746[i_18_];
							RSString class59 = Class12_Sub12_Sub8.aClass59Array2301[i_18_];
							int i_20_ = Class17.anInt421 + -(14 * i) + 70;
							int i_21_ = 0;
							if (class59 != null
									&& class59
											.method928(
													(Class12_Sub12_Sub16.aClass59_2542),
													0)) {
								i_21_ = 1;
								class59 = class59.method945(63, 5);
							}
							if (class59 != null
									&& class59.method928(
											(Class12_Sub12_Sub6.aClass59_2259),
											0)) {
								i_21_ = 2;
								class59 = class59.method945(arg0 ^ ~0x45ca, 5);
							}
							if ((i_19_ ^ 0xffffffff) == -1) {
								if (i_20_ > 0 && i_20_ < 110)
									class12_sub12_sub7_sub4.method400(
											Class26.aClass59Array591[i_18_], 4,
											i_20_, 0);
								i++;
							}
							if (((i_19_ ^ 0xffffffff) == -2 || (i_19_ ^ 0xffffffff) == -3)
									&& (i_19_ == 1 || Class31.anInt757 == 0 || (Class31.anInt757 == 1 && (Class12_Sub12_Sub11_Sub5
											.method506(arg0 ^ ~0x45d8, class59))))) {
								if ((i_20_ ^ 0xffffffff) < -1 && i_20_ < 110) {
									int i_22_ = 4;
									if ((i_21_ ^ 0xffffffff) == -2) {
										Class15.aClass12_Sub12_Sub7_Sub2Array382[0]
												.method370(i_22_, i_20_ + -12);
										i_22_ += 14;
									}
									if (i_21_ == 2) {
										Class15.aClass12_Sub12_Sub7_Sub2Array382[1]
												.method370(i_22_, i_20_ + -12);
										i_22_ += 14;
									}
									class12_sub12_sub7_sub4
											.method400(
													(Statics
															.method251(
																	(byte) -62,
																	(new RSString[] {
																			class59,
																			(Class12_Sub12_Sub11_Sub2.aClass59_2704) }))),
													i_22_, i_20_, 0);
									i_22_ += 8 + class12_sub12_sub7_sub4
											.method401(class59);
									class12_sub12_sub7_sub4.method400(
											Class26.aClass59Array591[i_18_],
											i_22_, i_20_, 255);
								}
								i++;
							}
							if ((i_19_ == 3 || (i_19_ ^ 0xffffffff) == -8)
									&& Class35.anInt862 == 0
									&& ((i_19_ ^ 0xffffffff) == -8
											|| Class12_Sub12_Sub3.anInt2154 == 0 || (Class12_Sub12_Sub3.anInt2154 == 1 && (Class12_Sub12_Sub11_Sub5
											.method506(arg0 + 17999, class59))))) {
								i++;
								if ((i_20_ ^ 0xffffffff) < -1
										&& (i_20_ ^ 0xffffffff) > -111) {
									int i_23_ = 4;
									class12_sub12_sub7_sub4.method400(
											Class30.aClass59_739, i_23_, i_20_,
											0);
									i_23_ += (class12_sub12_sub7_sub4
											.method401(Class30.aClass59_739));
									i_23_ += class12_sub12_sub7_sub4
											.method404(32);
									if (i_21_ == 1) {
										Class15.aClass12_Sub12_Sub7_Sub2Array382[0]
												.method370(i_23_, i_20_ - 12);
										i_23_ += 14;
									}
									if (i_21_ == 2) {
										Class15.aClass12_Sub12_Sub7_Sub2Array382[1]
												.method370(i_23_, -12 + i_20_);
										i_23_ += 14;
									}
									class12_sub12_sub7_sub4
											.method400(
													(Statics
															.method251(
																	(byte) -86,
																	(new RSString[] {
																			class59,
																			(Class12_Sub12_Sub11_Sub2.aClass59_2704) }))),
													i_23_, i_20_, 0);
									i_23_ += class12_sub12_sub7_sub4
											.method401(class59) - -8;
									class12_sub12_sub7_sub4.method400(
											Class26.aClass59Array591[i_18_],
											i_23_, i_20_, 8388608);
								}
							}
							if ((i_19_ ^ 0xffffffff) == -5
									&& ((Class4.anInt138 ^ 0xffffffff) == -1 || (Class4.anInt138 == 1 && Class12_Sub12_Sub11_Sub5
											.method506(82, class59)))) {
								i++;
								if (i_20_ > 0 && i_20_ < 110)
									class12_sub12_sub7_sub4
											.method400(
													(Statics
															.method251(
																	(byte) -42,
																	(new RSString[] {
																			class59,
																			Class14.aClass59_371,
																			(Class26.aClass59Array591[i_18_]) }))),
													4, i_20_, 8388736);
							}
							if ((i_19_ ^ 0xffffffff) == -6
									&& Class35.anInt862 == 0
									&& ((Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) > -3)) {
								if (i_20_ > 0 && i_20_ < 110)
									class12_sub12_sub7_sub4.method400(
											Class26.aClass59Array591[i_18_], 4,
											i_20_, 8388608);
								i++;
							}
							if ((i_19_ ^ 0xffffffff) == -7
									&& (Class35.anInt862 ^ 0xffffffff) == -1
									&& Class12_Sub12_Sub3.anInt2154 < 2) {
								i++;
								if (i_20_ > 0 && (i_20_ ^ 0xffffffff) > -111) {
									class12_sub12_sub7_sub4
											.method400(
													(Statics
															.method251(
																	(byte) -102,
																	(new RSString[] {
																			Statics.aClass59_1837,
																			Class14.aClass59_371,
																			class59,
																			(Class12_Sub12_Sub11_Sub2.aClass59_2704) }))),
													4, i_20_, 0);
									class12_sub12_sub7_sub4
											.method400(
													Class26.aClass59Array591[i_18_],
													(12 + (class12_sub12_sub7_sub4
															.method401(Statics
																	.method251(
																			(byte) -62,
																			(new RSString[] {
																					Statics.aClass59_1837,
																					Class14.aClass59_371,
																					class59 }))))),
													i_20_, 8388608);
								}
							}
							if (i_19_ == 8
									&& ((Class4.anInt138 ^ 0xffffffff) == -1 || ((Class4.anInt138 ^ 0xffffffff) == -2 && (Class12_Sub12_Sub11_Sub5
											.method506(arg0 ^ ~0x4595, class59))))) {
								if (i_20_ > 0 && (i_20_ ^ 0xffffffff) > -111)
									class12_sub12_sub7_sub4
											.method400(
													(Statics
															.method251(
																	(byte) -51,
																	(new RSString[] {
																			class59,
																			Class14.aClass59_371,
																			(Class26.aClass59Array591[i_18_]) }))),
													4, i_20_, 8270336);
								i++;
							}
						}
					}
					Class12_Sub12_Sub7.method348();
					Class12_Sub12_Sub11_Sub2_Sub1.anInt2927 = 14 * i + 7;
					if (Class12_Sub12_Sub11_Sub2_Sub1.anInt2927 < 78)
						Class12_Sub12_Sub11_Sub2_Sub1.anInt2927 = 78;
					Class30.method694(
							0,
							Class12_Sub12_Sub11_Sub2_Sub1.anInt2927,
							77,
							(byte) 55,
							(Class12_Sub12_Sub11_Sub2_Sub1.anInt2927 + (-Class17.anInt421 + -77)),
							463);
					RSString class59;
					if ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713 == null)
							|| (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass59_2951) == null)
						class59 = Class11.aClass59_260;
					else
						class59 = (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass59_2951);
					class12_sub12_sub7_sub4
							.method400(
									Statics
											.method251(
													(byte) -102,
													(new RSString[] {
															class59,
															(Class12_Sub12_Sub11_Sub2.aClass59_2704) })),
									4, 90, 0);
					class12_sub12_sub7_sub4
							.method400(
									Statics
											.method251(
													(byte) -128,
													(new RSString[] {
															Class11.aClass59_306,
															(Class12_Sub2.aClass59_1636) })),
									((class12_sub12_sub7_sub4.method401(Statics
											.method251(
													(byte) -110,
													(new RSString[] {
															class59,
															(Class48.aClass59_1132) })))) + 6),
									90, 255);
					Class12_Sub12_Sub7.method343(0, 77, 479, 0);
				}
			} else {
				Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
						Class11.aClass59_257, 239, 40, 0);
				Class29.aClass12_Sub12_Sub7_Sub4_693.method396(
						Statics.method251((byte) -63, (new RSString[] {
								Class11.aClass59_265,
								Class12_Sub2.aClass59_1636 })), 239, 60, 128);
			}
			if (Class51.aBoolean1202 && Class9.anInt212 == 2)
				Class51.method814((byte) 119);
			if (arg0 != -17910)
				aClass59_1011 = null;
			Statics.method628(-79);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "o.A(" + arg0 + ')');
		}
	}

	public static int method777(int arg0, int arg1) {
		try {
			anInt1015++;
			if (arg0 != 9)
				aClass59_1019 = null;
			Class12_Sub12_Sub10 class12_sub12_sub10 = Class27.method676(
					(byte) -107, arg1);
			int i = class12_sub12_sub10.anInt2382;
			int i_24_ = class12_sub12_sub10.anInt2380;
			int i_25_ = class12_sub12_sub10.anInt2373;
			int i_26_ = Class63.anIntArray1435[-i + i_24_];
			return i_26_ & Class12_Sub12_Sub12.anIntArray2414[i_25_] >> i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "o.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method778(boolean arg0) {
		try {
			aClass59_1010 = null;
			aClass59_1024 = null;
			aClass59_1011 = null;
			aClass59_1019 = null;
			aClass59_1014 = null;
			aClass59_1013 = null;
			if (arg0 == true) {
				aClass59_1009 = null;
				anIntArray1017 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "o.E(" + arg0 + ')');
		}
	}

	static {
		aClass59_1013 = Class55.method898(" (X", -10983);
		aClass59_1019 = Class55.method898("@gr1@", -10983);
		anIntArray1017 = new int[] { 16, 32, 64, 128 };
		anInt1016 = 0;
		anInt1018 = 2;
		aClass59_1009 = Class55.method898("runes", -10983);
		aClass59_1010 = Class55.method898("mapdots", -10983);
		aBoolean1023 = false;
		aClass59_1024 = Class55.method898("mapedge", -10983);
	}
}
