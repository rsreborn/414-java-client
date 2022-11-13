package com.jagex;/* com.jagex.Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.util.Statics;

public class Class28 implements Runnable {
	public static int anInt665;
	public static int anInt666;
	public static RSString aClass59_667 = Class55.method898("Enter amount:",
			-10983);
	public static int anInt668;
	public static byte[][] aByteArrayArray669;
	public static int anInt670;
	public static RSString aClass59_671;
	public static int anInt672;
	public static RSString aClass59_673;
	public static int anInt674;
	public static int anInt675;
	public static int anInt676;
	public static int anInt677;
	public static int anInt678;
	public static RSString aClass59_679;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_680;
	public static RSString aClass59_681;
	public static int anInt682;
	public static RSString aClass59_683;
	public static int anInt684;

	public static void method681(int arg0) {
		try {
			aClass12_Sub12_Sub7_Sub2_680 = null;
			aClass59_667 = null;
			aClass59_683 = null;
			aClass59_671 = null;
			if (arg0 == 255) {
				aClass59_673 = null;
				aByteArrayArray669 = null;
				aClass59_679 = null;
				aClass59_681 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jc.E(" + arg0 + ')');
		}
	}

	public static void method682(byte arg0) {
		anInt675++;
		while ((Game.inBuffer.getRemainingBits(Class5.anInt159
		) ^ 0xffffffff) <= -12) {
			int i = Game.inBuffer.readBits(11);
			if (i == 2047)
				break;
			if (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i] == null) {
				Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i] = new Class12_Sub12_Sub11_Sub2_Sub2();
				if (Class9_Sub2.aClass12_Sub11Array1589[i] != null)
					Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i]
							.method462(Class9_Sub2.aClass12_Sub11Array1589[i],
									false);
			}
			Class36.anIntArray888[Class9.anInt203++] = i;
			Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i];
			class12_sub12_sub11_sub2_sub2.anInt2663 = Class64_Sub2.anInt1968;
			int i_0_ = Game.inBuffer.readBits(1);
			if ((i_0_ ^ 0xffffffff) == -2)
				Class10.anIntArray220[Class47.anInt1094++] = i;
			int i_1_ = Game.inBuffer.readBits(5);
			if ((i_1_ ^ 0xffffffff) < -16)
				i_1_ -= 32;
			int i_2_ = Game.inBuffer.readBits(1);
			int i_3_ = Game.inBuffer.readBits(5);
			if (i_3_ > 15)
				i_3_ -= 32;
			class12_sub12_sub11_sub2_sub2
					.method453(
							(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])
									+ i_3_,
							(i_2_ ^ 0xffffffff) == -2,
							false,
							i_1_
									+ (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]));
		}
		Game.inBuffer.finishBitAccess();
		if (arg0 > -99)
			aClass59_681 = null;
	}

	public static Class12_Sub12_Sub7_Sub1 method683(int arg0, Class26 arg1,
			int arg2, byte arg3) {
		try {
			anInt666++;
			if (arg3 > -22)
				anInt672 = -23;
			if (!Class5.method77(arg0, 29066, arg1, arg2))
				return null;
			return Class4.method70(0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("jc.D(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public static Class12_Sub12_Sub5 method684(byte arg0, int arg1) {
		try {
			anInt670++;
			Class12_Sub12_Sub5 class12_sub12_sub5 = ((Class12_Sub12_Sub5) Class64.aClass27_1449
					.method673(123, (long) arg1));
			if (class12_sub12_sub5 != null)
				return class12_sub12_sub5;
			class12_sub12_sub5 = Class12_Sub12_Sub8.method410(
					Class12_Sub6.aClass26_1688, Statics.aClass26_1830,
					false, arg1, 536870911);
			if (class12_sub12_sub5 != null)
				Class64.aClass27_1449.method678((byte) 123, class12_sub12_sub5,
						(long) arg1);
			if (arg0 < 96)
				return null;
			return class12_sub12_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jc.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void run() {
		try {
			anInt684++;
			try {
				for (;;) {
					Class12_Sub9 class12_sub9;
					synchronized (Class10.aClass8_240) {
						class12_sub9 = (Class12_Sub9) Class10.aClass8_240
								.method91((byte) 86);
					}
					if (class12_sub9 == null) {
						Statics.method218(100L, true);
						synchronized (Class56.anObject1321) {
							if ((Class12_Sub12_Sub12.anInt2404 ^ 0xffffffff) >= -2) {
								Class12_Sub12_Sub12.anInt2404 = 0;
								Class56.anObject1321.notifyAll();
								break;
							}
							Class12_Sub12_Sub12.anInt2404--;
						}
					} else {
						if ((class12_sub9.anInt1748 ^ 0xffffffff) != -1) {
							if (class12_sub9.anInt1748 == 1) {
								class12_sub9.aByteArray1757 = (class12_sub9.aClass36_1746
										.method733((int) class12_sub9.aLong319,
												-1319));
								synchronized (Class10.aClass8_240) {
									Class12_Sub12_Sub11_Sub2_Sub1.aClass8_2934
											.method98(class12_sub9, (byte) 79);
								}
							}
						} else {
							class12_sub9.aClass36_1746.method734(
									class12_sub9.aByteArray1757, (byte) 72,
									(int) class12_sub9.aLong319,
									class12_sub9.aByteArray1757.length);
							synchronized (Class10.aClass8_240) {
								class12_sub9.method143((byte) 39);
							}
						}
						synchronized (Class56.anObject1321) {
							if ((Class12_Sub12_Sub12.anInt2404 ^ 0xffffffff) >= -2) {
								Class12_Sub12_Sub12.anInt2404 = 0;
								Class56.anObject1321.notifyAll();
								break;
							}
							Class12_Sub12_Sub12.anInt2404 = 600;
						}
					}
				}
			} catch (Exception exception) {
				Class12_Sub12_Sub15.method551(true, null, exception);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jc.run(" + ')');
		}
	}

	public static void method685(int arg0) {
		try {
			anInt676++;
			Class48.method799(-47, false);
			boolean bool = true;
			Class35.anInt854 = 0;
			for (int i = 0; ((Class26.aByteArrayArray597.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
				if ((Class48.anIntArray1125[i] ^ 0xffffffff) != 0
						&& Class26.aByteArrayArray597[i] == null) {
					Class26.aByteArrayArray597[i] = Cache.mapsArchive
							.method631(Class48.anIntArray1125[i], true, 0);
					if (Class26.aByteArrayArray597[i] == null) {
						Class35.anInt854++;
						bool = false;
					}
				}
				if ((Class12_Sub12_Sub3.anIntArray2157[i] ^ 0xffffffff) != 0
						&& Class40.aByteArrayArray957[i] == null) {
					Class40.aByteArrayArray957[i] = (Cache.mapsArchive
							.method639(0, (byte) 97,
									Class58.xteaKeys[i],
									Class12_Sub12_Sub3.anIntArray2157[i]));
					if (Class40.aByteArrayArray957[i] == null) {
						bool = false;
						Class35.anInt854++;
					}
				}
			}
			if (!bool)
				Class12_Sub12_Sub10.anInt2375 = 1;
			else {
				Class36.anInt883 = 0;
				bool = true;
				for (int i = 0; i < Class26.aByteArrayArray597.length; i++) {
					byte[] is = Class40.aByteArrayArray957[i];
					if (is != null) {
						int i_4_ = (64 * (Statics.anIntArray573[i] >> 626952712) + -Class64.anInt1451);
						int i_5_ = (-Class8.anInt174 + 64 * (Statics.anIntArray573[i] & 0xff));
						if (Class44.aBoolean1038) {
							i_5_ = 10;
							i_4_ = 10;
						}
						bool &= Class12_Sub12_Sub11_Sub6.method513(is,
								(byte) -104, i_5_, i_4_);
					}
				}
				if (!bool)
					Class12_Sub12_Sub10.anInt2375 = 2;
				else {
					if (arg0 != -1975)
						aClass59_667 = null;
					if ((Class12_Sub12_Sub10.anInt2375 ^ 0xffffffff) != -1)
						Class36.method729(true, Class12_Sub6.aClass59_1699,
								1932, Class64_Sub2.aClass59_1970);
					Class49.method801((byte) 89);
					Class12_Sub12_Sub8.aClass52_2295.method858();
					System.gc();
					for (int i = 0; i < 4; i++)
						Class11.aClass10Array280[i].method127(-111);
					for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
						for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -105; i_6_++) {
							for (int i_7_ = 0; i_7_ < 104; i_7_++)
								Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[i][i_6_][i_7_] = (byte) 0;
						}
					}
					Class35.method727((byte) -126);
					int i = Class26.aByteArrayArray597.length;
					Class48.method799(-99, true);
					if (!Class44.aBoolean1038) {
						for (int i_8_ = 0; (i ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
							int i_9_ = (64 * (Statics.anIntArray573[i_8_] >> 840875080) - Class64.anInt1451);
							int i_10_ = (-Class8.anInt174 + (Statics.anIntArray573[i_8_] & 0xff) * 64);
							byte[] is = Class26.aByteArrayArray597[i_8_];
							if (is != null)
								Class40.method752(-65,
										Class51.anInt1178 * 8 - 48,
										Class11.aClass10Array280, is, i_10_,
										-48 + Class29.anInt715 * 8, i_9_);
						}
						for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff); i_11_++) {
							int i_12_ = (-Class8.anInt174 + ((0xff & Statics.anIntArray573[i_11_]) * 64));
							int i_13_ = (-Class64.anInt1451 + 64 * (Statics.anIntArray573[i_11_] >> -318867896));
							byte[] is = Class26.aByteArrayArray597[i_11_];
							if (is == null && Class51.anInt1178 < 800)
								Class12_Sub2.method152(64, i_12_, i_13_, false,
										64);
						}
						Class48.method799(-65, true);
						for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i ^ 0xffffffff); i_14_++) {
							byte[] is = Class40.aByteArrayArray957[i_14_];
							if (is != null) {
								int i_15_ = ((Statics.anIntArray573[i_14_] >> -1662467192) * 64 + -Class64.anInt1451);
								int i_16_ = (64 * (0xff & Statics.anIntArray573[i_14_]) - Class8.anInt174);
								Class12_Sub12_Sub11_Sub5.method504(-2307,
										i_16_,
										Class12_Sub12_Sub8.aClass52_2295, is,
										i_15_, Class11.aClass10Array280);
							}
						}
					}
					if (Class44.aBoolean1038) {
						for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -5; i_17_++) {
							for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -14; i_18_++) {
								for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -14; i_19_++) {
									boolean bool_20_ = false;
									int i_21_ = (Class12_Sub12_Sub5.anIntArrayArrayArray2246[i_17_][i_18_][i_19_]);
									if (i_21_ != -1) {
										int i_22_ = ((0x38aae50 & i_21_) >> 1837117336);
										int i_23_ = (i_21_ & 0x6) >> 925725505;
										int i_24_ = (0xffe742 & i_21_) >> 581549678;
										int i_25_ = (i_21_ & 0x3ffc) >> 452770179;
										int i_26_ = ((i_24_ / 8 << -74856408) - -(i_25_ / 8));
										for (int i_27_ = 0; ((i_27_ ^ 0xffffffff) > (Statics.anIntArray573.length ^ 0xffffffff)); i_27_++) {
											if (((i_26_ ^ 0xffffffff) == ((Statics.anIntArray573[i_27_]) ^ 0xffffffff))
													&& (Class26.aByteArrayArray597[i_27_]) != null) {
												Class41.method758(
														(byte) -83,
														i_17_,
														8 * (0x7 & i_24_),
														Class11.aClass10Array280,
														i_23_,
														8 * (i_25_ & 0x7),
														i_22_,
														8 * i_18_,
														8 * i_19_,
														(Class26.aByteArrayArray597[i_27_]));
												bool_20_ = true;
												break;
											}
										}
									}
									if (!bool_20_)
										Class12_Sub6.method187(i_17_,
												i_19_ * 8, i_18_ * 8, -114);
								}
							}
						}
						for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -14; i_28_++) {
							for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -14; i_29_++) {
								int i_30_ = (Class12_Sub12_Sub5.anIntArrayArrayArray2246[0][i_28_][i_29_]);
								if ((i_30_ ^ 0xffffffff) == 0)
									Class12_Sub2.method152(8, 8 * i_29_,
											8 * i_28_, false, 8);
							}
						}
						Class48.method799(arg0 + 1878, true);
						for (int i_31_ = 0; i_31_ < 4; i_31_++) {
							for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > -14; i_32_++) {
								for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -14; i_33_++) {
									int i_34_ = (Class12_Sub12_Sub5.anIntArrayArrayArray2246[i_31_][i_32_][i_33_]);
									if ((i_34_ ^ 0xffffffff) != 0) {
										int i_35_ = (0x6 & i_34_) >> 399917377;
										int i_36_ = i_34_ >> 1570850958 & 0x3ff;
										int i_37_ = i_34_ >> -1849897064 & 0x3;
										int i_38_ = (i_34_ & 0x3fff) >> -1973020445;
										int i_39_ = (i_38_ / 8 + (i_36_ / 8 << -1362852664));
										for (int i_40_ = 0; ((Statics.anIntArray573.length ^ 0xffffffff) < (i_40_ ^ 0xffffffff)); i_40_++) {
											if ((Statics.anIntArray573[i_40_] == i_39_)
													&& (Class40.aByteArrayArray957[i_40_]) != null) {
												Class12_Sub12_Sub11_Sub6
														.method511(
																i_37_,
																8 * (i_38_ & 0x7),
																i_31_,
																(Class40.aByteArrayArray957[i_40_]),
																i_35_,
																true,
																i_33_ * 8,
																Class11.aClass10Array280,
																8 * (i_36_ & 0x7),
																(Class12_Sub12_Sub8.aClass52_2295),
																i_32_ * 8);
												break;
											}
										}
									}
								}
							}
						}
					}
					Class48.method799(-106, true);
					Class49.method801((byte) 79);
					Archive.method664(Class11.aClass10Array280,
							Class12_Sub12_Sub8.aClass52_2295, -15456);
					Class48.method799(-45, true);
					int i_41_ = Archive.anInt1882;
					if (i_41_ > RSString.anInt1504)
						i_41_ = RSString.anInt1504;
					if ((-1 + RSString.anInt1504 ^ 0xffffffff) < (i_41_ ^ 0xffffffff))
						i_41_ = -1 + RSString.anInt1504;
					if (!Class21.aBoolean483)
						Class12_Sub12_Sub8.aClass52_2295.method863(0);
					else
						Class12_Sub12_Sub8.aClass52_2295
								.method863(Archive.anInt1882);
					for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > -105; i_42_++) {
						for (int i_43_ = 0; i_43_ < 104; i_43_++)
							Class12_Sub12_Sub13.method531(i_42_, i_43_, false);
					}
					Class12_Sub12_Sub6.method326(arg0 + -9326);
					Class17.aClass27_424.method675(true);
					if (Class12_Sub12_Sub16.aFrame2539 != null) {
						Class10.anInt236++;
						Game.outBuffer.writePacket(171);
						Game.outBuffer.writeIntBE(
								1057001181);
					}
					if (!Class44.aBoolean1038) {
						int i_44_ = (-6 + Class29.anInt715) / 8;
						int i_45_ = (-6 + Class51.anInt1178) / 8;
						int i_46_ = (6 + Class29.anInt715) / 8;
						int i_47_ = (Class51.anInt1178 + 6) / 8;
						for (int i_48_ = i_44_ - 1; (1 + i_46_ ^ 0xffffffff) <= (i_48_ ^ 0xffffffff); i_48_++) {
							for (int i_49_ = i_45_ + -1; ((i_49_ ^ 0xffffffff) >= (i_47_
									- -1 ^ 0xffffffff)); i_49_++) {
								if ((i_48_ ^ 0xffffffff) > (i_44_ ^ 0xffffffff)
										|| (i_46_ ^ 0xffffffff) > (i_48_ ^ 0xffffffff)
										|| i_49_ < i_45_ || i_49_ > i_47_) {
									Cache.mapsArchive
											.method632(
													(Statics
															.method251(
																	(byte) -71,
																	(new RSString[] {
																			Class35.aClass59_869,
																			Class19.method599(
																					i_48_,
																					10),
																			Class64_Sub2.aClass59_1983,
																			Class19.method599(
																					i_49_,
																					(arg0 + 1985)) }))),
													arg0 ^ ~0x7db);
									Cache.mapsArchive
											.method632(
													(Statics
															.method251(
																	(byte) -110,
																	(new RSString[] {
																			Class10.aClass59_249,
																			Class19.method599(
																					i_48_,
																					arg0
																							^ ~0x7bc),
																			Class64_Sub2.aClass59_1983,
																			Class19.method599(
																					i_49_,
																					(arg0 + 1985)) }))),
													63);
								}
							}
						}
					}
					if ((Class31.anInt756 ^ 0xffffffff) != 0)
						Class29.method686((byte) 67, 35);
					else
						Class29.method686((byte) 67, 30);
					Class12_Sub12_Sub11_Sub1.method441(-3);
					Game.outBuffer.writePacket(140);
					Class63.method966(arg0 + 1975);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jc.C(" + arg0 + ')');
		}
	}

	static {
		anInt665 = 0;
		aClass59_673 = Class55.method898("white:", -10983);
		anInt677 = 0;
		aClass59_681 = aClass59_673;
		aClass59_679 = aClass59_667;
		aClass59_671 = Class55.method898("Report abuse", -10983);
		aClass59_683 = aClass59_671;
		anInt678 = 0;
		anInt672 = -1;
	}
}
