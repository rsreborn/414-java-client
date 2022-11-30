package com.jagex;/* com.jagex.Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

public class Class36 {
	public static RSString aClass59_875;
	public static int anInt876;
	public static RSString aClass59_877 = Class55.method898(
			"Loaded update list", -10983);
	public static int anInt878;
	public static Class51 aClass51_879;
	public static int anInt880;
	public static RSString aClass59_881;
	public static int anInt882;
	public static int anInt883;
	public static boolean aBoolean884;
	public static int anInt885;
	public int anInt886 = 65000;
	public static boolean aBoolean887;
	public static int[] anIntArray888 = new int[2048];
	public static RSString aClass59_889;
	public int anInt890;
	public static RSString aClass59_891;
	public Class51 aClass51_892;
	public static int anInt893;
	public Class51 aClass51_894 = null;
	public static int anInt895;
	public static int anInt896;

	public static void method728(int arg0, byte arg1) {
		anInt878++;
		if (arg0 >= 0) {
			int i = Class12_Sub12_Sub5.anIntArray2238[arg0];
			int i_0_ = Class12_Sub2.anIntArray1646[arg0];
			int i_1_ = Class19.anIntArray454[arg0];
			if (i_1_ >= 2000)
				i_1_ -= 2000;
			int i_2_ = Class12_Sub12_Sub4.anIntArray2209[arg0];
			if (Class1.anInt85 != 0 && i_1_ != 1002) {
				Class1.anInt85 = 0;
				Class8.aBoolean182 = true;
			}
			if ((i_1_ ^ 0xffffffff) == -39) {
				Game.outBuffer.writePacket(64);
				Game.outBuffer.method209(-921469304, i_0_);
				Game.outBuffer.writeShortBEA(i, (byte) 119);
				Game.outBuffer.writeShortBE(i_2_);
				Class12_Sub12_Sub16.anInt2560 = 2;
				Player.anInt2973 = i_0_;
				Class33.anInt829 = i;
				Class12.anInt333 = 0;
				if (Class13.anInt343 == i_0_ >> 763043664)
					Class12_Sub12_Sub16.anInt2560 = 1;
				Class12_Sub12_Sub2.anInt2073++;
				if ((i_0_ >> 870307888 ^ 0xffffffff) == (Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff))
					Class12_Sub12_Sub16.anInt2560 = 3;
			}
			if (i_1_ == 54) {
				Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_];
				if (class12_sub12_sub11_sub2_sub2 != null) {
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub2.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub2.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Class33.anInt823 = Class10.anInt226;
					Class49.anInt1149 = Class42.anInt1000;
					Class12_Sub12_Sub4.anInt2228 = 0;
					Class47.anInt1101++;
					Archive.anInt1903 = 2;
					Game.outBuffer.writePacket(112);
					Game.outBuffer.writeIntBE(
                            Class12_Sub2.anInt1647);
					Game.outBuffer.writeShortLEA(96, i_2_);
				}
			}
			if (i_1_ == 19) {
				Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_];
				if (class12_sub12_sub11_sub2_sub2 != null) {
					Class48.anInt1116++;
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub2.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub2.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Class33.anInt823 = Class10.anInt226;
					Class12_Sub12_Sub4.anInt2228 = 0;
					Class49.anInt1149 = Class42.anInt1000;
					Archive.anInt1903 = 2;
					Game.outBuffer.writePacket(98);
					Game.outBuffer.writeShortLE(i_2_);
				}
			}
			if (i_1_ == 28) {
				Class62.method958(-108, Class58.anInt1342);
				Class8.aBoolean182 = true;
				Class58.anInt1342 = -1;
			}
			if (i_1_ == 21) {
				boolean bool = (Class64_Sub2
						.method997(
								false,
								i_0_,
								25,
								0,
								0,
								2,
								0,
								0,
								i,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								0,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				if (!bool)
					bool = (Class64_Sub2
							.method997(
									false,
									i_0_,
									25,
									1,
									0,
									2,
									0,
									1,
									i,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				Class49.anInt1149 = Class42.anInt1000;
				Class12_Sub12_Sub4.anInt2228 = 0;
				Class64_Sub1.anInt1947++;
				Class33.anInt823 = Class10.anInt226;
				Archive.anInt1903 = 2;
				Game.outBuffer.writePacket(28);
				Game.outBuffer.writeShortLE(i_0_
						- -Class8.anInt174);
				Game.outBuffer.writeShortLE(i_2_);
				Game.outBuffer.writeShortLE(
						Class64.anInt1451 + i);
			}
			if (i_1_ == 46) {
				Class12_Sub12_Sub11_Sub1.anInt2653++;
				boolean bool = (Class64_Sub2
						.method997(
								false,
								i_0_,
								25,
								0,
								0,
								2,
								0,
								0,
								i,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								0,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				if (!bool)
					bool = (Class64_Sub2
							.method997(
									false,
									i_0_,
									25,
									1,
									0,
									2,
									0,
									1,
									i,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				Class33.anInt823 = Class10.anInt226;
				Class12_Sub12_Sub4.anInt2228 = 0;
				Class49.anInt1149 = Class42.anInt1000;
				Archive.anInt1903 = 2;
				Game.outBuffer.writePacket(5);
				Game.outBuffer.writeShortBE(i_2_);
				Game.outBuffer.writeShortBEA(Class8.anInt174
						+ i_0_, (byte) 83);
				Game.outBuffer.writeShortLEA(96, Class64.anInt1451
						+ i);
			}
			if ((i_1_ ^ 0xffffffff) == -1004) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_];
				if (class12_sub12_sub11_sub2_sub1 != null) {
					Class12_Sub12_Sub2 class12_sub12_sub2 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923);
					if (class12_sub12_sub2.anIntArray2063 != null)
						class12_sub12_sub2 = class12_sub12_sub2
								.method287((byte) 2);
					if (class12_sub12_sub2 != null) {
						Class30.anInt741++;
						Game.outBuffer.writePacket(121);
						Game.outBuffer.writeShortLE(
								class12_sub12_sub2.anInt2086);
					}
				}
			}
			if ((i_1_ ^ 0xffffffff) == -10) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_];
				if (class12_sub12_sub11_sub2_sub1 != null) {
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub1.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub1.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Class12_Sub12_Sub4.anInt2228 = 0;
					Class33.anInt823 = Class10.anInt226;
					Class12_Sub12_Sub11_Sub6.anInt2901++;
					Archive.anInt1903 = 2;
					Class49.anInt1149 = Class42.anInt1000;
					Game.outBuffer.writePacket(181);
					Game.outBuffer.writeShortBEA(i_2_, (byte) 61);
				}
			}
			if (i_1_ == 6) {
				Class12_Sub12_Sub14.anInt2451++;
				Game.outBuffer.writePacket(161);
				Game.outBuffer.writeShortLEA(96, i_2_);
				Game.outBuffer.writeShortBEA(i, (byte) 59);
				Game.outBuffer.method209(-921469304, i_0_);
				Class33.anInt829 = i;
				Class12_Sub12_Sub16.anInt2560 = 2;
				Player.anInt2973 = i_0_;
				if ((Class13.anInt343 ^ 0xffffffff) == (i_0_ >> -1415612240 ^ 0xffffffff))
					Class12_Sub12_Sub16.anInt2560 = 1;
				if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == (i_0_ >> 748863920 ^ 0xffffffff))
					Class12_Sub12_Sub16.anInt2560 = 3;
				Class12.anInt333 = 0;
			}
			if (i_1_ == 12) {
				Game.outBuffer.writePacket(131);
				Class12_Sub9.anInt1744++;
				Game.outBuffer.writeShortLE(i_2_);
				Game.outBuffer.writeShortLEA(96, Class13.anInt352);
				Game.outBuffer.writeShortBE(
						Class12_Sub12_Sub13.anInt2434);
				Game.outBuffer.writeShortBEA(i, (byte) 89);
				Game.outBuffer.writeIntBE(i_0_);
				Game.outBuffer.writeIntBE(
                        Class9_Sub2.anInt1596);
				Class33.anInt829 = i;
				Class12_Sub12_Sub16.anInt2560 = 2;
				if (Class13.anInt343 == i_0_ >> -509448432)
					Class12_Sub12_Sub16.anInt2560 = 1;
				if (i_0_ >> 1014606800 == Class12_Sub12_Sub12.anInt2407)
					Class12_Sub12_Sub16.anInt2560 = 3;
				Player.anInt2973 = i_0_;
				Class12.anInt333 = 0;
			}
			if ((i_1_ ^ 0xffffffff) == -2) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_];
				if (class12_sub12_sub11_sub2_sub1 != null) {
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub1.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub1.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Archive.anInt1903 = 2;
					Class30.anInt740++;
					Class33.anInt823 = Class10.anInt226;
					Class12_Sub12_Sub4.anInt2228 = 0;
					Class49.anInt1149 = Class42.anInt1000;
					Game.outBuffer.writePacket(242);
					Game.outBuffer.writeShortLE(i_2_);
					Game.outBuffer.writeShortBEA(
							Class12_Sub12_Sub13.anInt2434, (byte) 114);
					Game.outBuffer.writeShortBEA(Class13.anInt352,
							(byte) 79);
					Game.outBuffer.method245((byte) -70,
							Class9_Sub2.anInt1596);
				}
			}
			if ((i_1_ ^ 0xffffffff) == -41
					&& Player.method461(i_0_, i_2_,
							-121, i)) {
				Game.outBuffer.writePacket(252);
				Class12_Sub12.anInt1840++;
				Game.outBuffer.writeShortBE(
						Class64.anInt1451 + i);
				Game.outBuffer.writeShortLEA(96,
						(0x1ffff66b & i_2_) >> 1081981230);
				Game.outBuffer.writeShortLE(Class8.anInt174
						+ i_0_);
				Game.outBuffer.method225(-11129,
						Class12_Sub2.anInt1647);
			}
			if (i_1_ == 25) {
				Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_];
				if (class12_sub12_sub11_sub2_sub2 != null) {
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub2.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub2.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Class12_Sub12_Sub4.anInt2228 = 0;
					Archive.anInt1903 = 2;
					Class33.anInt823 = Class10.anInt226;
					Class49.anInt1149 = Class42.anInt1000;
					Class42.anInt995++;
					Game.outBuffer.writePacket(175);
					Game.outBuffer.writeShortBEA(i_2_, (byte) 117);
				}
			}
			if ((i_1_ ^ 0xffffffff) == -56) {
				RSString class59 = Class12_Sub1.aClass59Array1621[arg0];
				int i_3_ = class59.method930(-2,
						Class12_Sub12_Sub13.aClass59_2426);
				if (i_3_ != -1) {
					int i_4_ = -1;
					long l = class59.method945(63, i_3_ + 5).method935(false)
							.method912(118);
					for (int i_5_ = 0; (Class7.anInt1540 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
						if ((Class47.aLongArray1099[i_5_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
							i_4_ = i_5_;
							break;
						}
					}
					if ((i_4_ ^ 0xffffffff) != 0
							&& (Class12_Sub12_Sub4.anIntArray2227[i_4_] ^ 0xffffffff) < -1) {
						Class12_Sub4.aBoolean1671 = true;
						Class11.aClass59_297 = Class11.aClass59_310;
						Class9.anInt211 = 3;
						Class1.anInt85 = 0;
						Class8.aBoolean182 = true;
						Class56.aLong1323 = Class47.aLongArray1099[i_4_];
						Class11.aClass59_290 = (Statics
								.method251(
										(byte) -116,
										new RSString[] {
												Class18.aClass59_430,
												(Class12_Sub12_Sub11_Sub6.aClass59Array2910[i_4_]) }));
					}
				}
			}
			if (i_1_ == 56) {
				Player.method461(i_0_, i_2_, -128, i);
				Game.outBuffer.writePacket(201);
				Player.anInt2953++;
				Game.outBuffer.writeShortLEA(96, i_0_
						+ Class8.anInt174);
				Game.outBuffer.writeShortLE(
						Class64.anInt1451 + i);
				Game.outBuffer.writeShortBEA(
						i_2_ >> 1168071374 & 0x7fff, (byte) 118);
			}
			if ((i_1_ ^ 0xffffffff) == -40) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_];
				if (class12_sub12_sub11_sub2_sub1 != null) {
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub1.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub1.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Archive.anInt1903 = 2;
					Class33.anInt823 = Class10.anInt226;
					Class12_Sub12_Sub11_Sub3.anInt2740++;
					Class49.anInt1149 = Class42.anInt1000;
					Class12_Sub12_Sub4.anInt2228 = 0;
					Game.outBuffer.writePacket(178);
					Game.outBuffer.writeShortBEA(i_2_, (byte) 97);
				}
			}
			if (i_1_ == 45) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_];
				if (class12_sub12_sub11_sub2_sub1 != null) {
					Class12_Sub12_Sub11_Sub1.anInt2646++;
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub1.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub1.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Class33.anInt823 = Class10.anInt226;
					Class12_Sub12_Sub4.anInt2228 = 0;
					Class49.anInt1149 = Class42.anInt1000;
					Archive.anInt1903 = 2;
					Game.outBuffer.writePacket(147);
					Game.outBuffer.writeShortBE(i_2_);
				}
			}
			if (i_1_ == 18) {
				Class12_Sub12_Sub11_Sub2.anInt2729++;
				Game.outBuffer.writePacket(10);
				Game.outBuffer.method225(-11129, i_0_);
				Game.outBuffer.writeShortLEA(96, i);
				Game.outBuffer.writeShortLEA(96, i_2_);
				Class12_Sub12_Sub16.anInt2560 = 2;
				if ((Class13.anInt343 ^ 0xffffffff) == (i_0_ >> -2040270480 ^ 0xffffffff))
					Class12_Sub12_Sub16.anInt2560 = 1;
				if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == (i_0_ >> 318918896 ^ 0xffffffff))
					Class12_Sub12_Sub16.anInt2560 = 3;
				Class12.anInt333 = 0;
				Class33.anInt829 = i;
				Player.anInt2973 = i_0_;
			}
			if ((i_1_ ^ 0xffffffff) == -48) {
				Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_];
				if (class12_sub12_sub11_sub2_sub2 != null) {
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub2.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub2.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Class12_Sub12_Sub4.anInt2228 = 0;
					Archive.anInt1903 = 2;
					Class33.anInt823 = Class10.anInt226;
					Class12_Sub12_Sub6.anInt2252++;
					Class49.anInt1149 = Class42.anInt1000;
					Game.outBuffer.writePacket(47);
					Game.outBuffer.writeShortBEA(i_2_, (byte) 79);
				}
			}
			if (i_1_ == 1004) {
				Player.method461(i_0_, i_2_, -118, i);
				Class12_Sub12_Sub2.anInt2099++;
				Game.outBuffer.writePacket(212);
				Game.outBuffer.writeShortLEA(96, i_0_
						+ Class8.anInt174);
				Game.outBuffer.writeShortLE(
						0x7fff & i_2_ >> 558854478);
				Game.outBuffer.writeShortLEA(96, i
						+ Class64.anInt1451);
			}
			if (i_1_ == 3) {
				Game.outBuffer.writePacket(146);
				Game.outBuffer.writeShortLE(i_2_);
				Statics.anInt548++;
				Game.outBuffer.method225(-11129, i_0_);
				Game.outBuffer.writeShortLEA(96, i);
				Class12_Sub12_Sub16.anInt2560 = 2;
				Player.anInt2973 = i_0_;
				Class12.anInt333 = 0;
				Class33.anInt829 = i;
				if (i_0_ >> -983855216 == Class13.anInt343)
					Class12_Sub12_Sub16.anInt2560 = 1;
				if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == (i_0_ >> -1740941456 ^ 0xffffffff))
					Class12_Sub12_Sub16.anInt2560 = 3;
			}
			if ((i_1_ ^ 0xffffffff) == -1006) {
				Game.outBuffer.writePacket(233);
				Class9_Sub2.anInt1602++;
				Game.outBuffer.writeShortBEA(i_2_, (byte) 90);
			}
			if (i_1_ == 23) {
				Class58.anInt1347++;
				boolean bool = (Class64_Sub2
						.method997(
								false,
								i_0_,
								25,
								0,
								0,
								2,
								0,
								0,
								i,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								0,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				if (!bool)
					bool = (Class64_Sub2
							.method997(
									false,
									i_0_,
									25,
									1,
									0,
									2,
									0,
									1,
									i,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				Class33.anInt823 = Class10.anInt226;
				Class12_Sub12_Sub4.anInt2228 = 0;
				Class49.anInt1149 = Class42.anInt1000;
				Archive.anInt1903 = 2;
				Game.outBuffer.writePacket(80);
				Game.outBuffer.writeShortBE(i_2_);
				Game.outBuffer.writeShortLE(
						i + Class64.anInt1451);
				Game.outBuffer.writeShortLE(Class8.anInt174
						+ i_0_);
			}
			int i_6_ = 32 % ((arg1 - 64) / 35);
			if ((i_1_ ^ 0xffffffff) == -15) {
				boolean bool = (Class64_Sub2
						.method997(
								false,
								i_0_,
								25,
								0,
								0,
								2,
								0,
								0,
								i,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								0,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				Class14.anInt359++;
				if (!bool)
					bool = (Class64_Sub2
							.method997(
									false,
									i_0_,
									25,
									1,
									0,
									2,
									0,
									1,
									i,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				Class49.anInt1149 = Class42.anInt1000;
				Class12_Sub12_Sub4.anInt2228 = 0;
				Class33.anInt823 = Class10.anInt226;
				Archive.anInt1903 = 2;
				Game.outBuffer.writePacket(162);
				Game.outBuffer.writeShortLE(i_0_
						+ Class8.anInt174);
				Game.outBuffer.writeIntBE(
                        Class9_Sub2.anInt1596);
				Game.outBuffer.writeShortLE(i
						- -Class64.anInt1451);
				Game.outBuffer.writeShortLE(
						Class12_Sub12_Sub13.anInt2434);
				Game.outBuffer.writeShortBEA(Class13.anInt352,
						(byte) 113);
				Game.outBuffer.writeShortBE(i_2_);
			}
			if (i_1_ == 7) {
				Class12_Sub7.anInt1723++;
				boolean bool = (Class64_Sub2
						.method997(
								false,
								i_0_,
								25,
								0,
								0,
								2,
								0,
								0,
								i,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								0,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				if (!bool)
					bool = (Class64_Sub2
							.method997(
									false,
									i_0_,
									25,
									1,
									0,
									2,
									0,
									1,
									i,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				Archive.anInt1903 = 2;
				Class49.anInt1149 = Class42.anInt1000;
				Class33.anInt823 = Class10.anInt226;
				Class12_Sub12_Sub4.anInt2228 = 0;
				Game.outBuffer.writePacket(202);
				Game.outBuffer.writeShortBE(
						Class8.anInt174 + i_0_);
				Game.outBuffer.method245((byte) -70,
						Class12_Sub2.anInt1647);
				Game.outBuffer.writeShortLE(
						i + Class64.anInt1451);
				Game.outBuffer.writeShortBEA(i_2_, (byte) 83);
			}
			if ((i_1_ ^ 0xffffffff) == -30) {
				Class12_Sub12_Sub11.anInt2397++;
				Game.outBuffer.writePacket(2);
				Game.outBuffer.writeShortBE(i_2_);
				Game.outBuffer.method209(-921469304, i_0_);
				Game.outBuffer.writeShortBE(i);
				Class12_Sub12_Sub16.anInt2560 = 2;
				Class12.anInt333 = 0;
				if (Class13.anInt343 == i_0_ >> -1109196944)
					Class12_Sub12_Sub16.anInt2560 = 1;
				Player.anInt2973 = i_0_;
				Class33.anInt829 = i;
				if (i_0_ >> -25368560 == Class12_Sub12_Sub12.anInt2407)
					Class12_Sub12_Sub16.anInt2560 = 3;
			}
			if ((i_1_ ^ 0xffffffff) == -53) {
				Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_];
				if (class12_sub12_sub11_sub2_sub2 != null) {
					Game.anInt1570++;
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub2.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub2.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Archive.anInt1903 = 2;
					Class33.anInt823 = Class10.anInt226;
					Class12_Sub12_Sub4.anInt2228 = 0;
					Class49.anInt1149 = Class42.anInt1000;
					Game.outBuffer.writePacket(86);
					Game.outBuffer.writeShortBEA(i_2_, (byte) 76);
				}
			}
			if (i_1_ == 37
					&& Player.method461(i_0_, i_2_, -93,
							i)) {
				Class12_Sub12_Sub11_Sub5.anInt2869++;
				Game.outBuffer.writePacket(68);
				Game.outBuffer.writeShortLE(i_0_
						+ Class8.anInt174);
				Game.outBuffer.writeShortBEA(
						Class12_Sub12_Sub13.anInt2434, (byte) 78);
				Game.outBuffer.writeShortBE(
						Class13.anInt352);
				Game.outBuffer.writeShortLEA(96, i
						- -Class64.anInt1451);
				Game.outBuffer.method225(-11129,
						Class9_Sub2.anInt1596);
				Game.outBuffer.writeShortBE(
						i_2_ >> 415563758 & 0x7fff);
			}
			if ((i_1_ ^ 0xffffffff) == -34) {
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_];
				if (class12_sub12_sub11_sub2_sub1 != null) {
					RSString.anInt1500++;
					Class64_Sub2
							.method997(
									false,
									class12_sub12_sub11_sub2_sub1.anIntArray2671[0],
									25,
									1,
									0,
									2,
									0,
									1,
									class12_sub12_sub11_sub2_sub1.anIntArray2708[0],
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
					Class33.anInt823 = Class10.anInt226;
					Class49.anInt1149 = Class42.anInt1000;
					Archive.anInt1903 = 2;
					Class12_Sub12_Sub4.anInt2228 = 0;
					Game.outBuffer.writePacket(37);
					Game.outBuffer.writeShortLEA(96, i_2_);
				}
			}
			if (i_1_ == 34) {
				Class12_Sub12_Sub10.anInt2374++;
				boolean bool = (Class64_Sub2
						.method997(
								false,
								i_0_,
								25,
								0,
								0,
								2,
								0,
								0,
								i,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
								0,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				if (!bool)
					bool = (Class64_Sub2
							.method997(
									false,
									i_0_,
									25,
									1,
									0,
									2,
									0,
									1,
									i,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
									0,
									(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
				Class12_Sub12_Sub4.anInt2228 = 0;
				Class49.anInt1149 = Class42.anInt1000;
				Archive.anInt1903 = 2;
				Class33.anInt823 = Class10.anInt226;
				Game.outBuffer.writePacket(183);
				Game.outBuffer.writeShortLE(i
						- -Class64.anInt1451);
				Game.outBuffer.writeShortLEA(96, i_2_);
				Game.outBuffer.writeShortBEA(Class8.anInt174
						+ i_0_, (byte) 115);
			}
			if (i_1_ == 13) {
				if (Class51.aBoolean1202)
					Class12_Sub12_Sub8.aClass52_2295
							.method867(i - 4, -4 + i_0_);
				else
					Class12_Sub12_Sub8.aClass52_2295.method867(Class10.anInt226
							+ -4, Class42.anInt1000 + -4);
			}
			if (i_1_ == 27) {
				Class13.anInt352 = i;
				Class9_Sub2.anInt1596 = i_0_;
				Class12_Sub12_Sub13.anInt2434 = i_2_;
				Class12_Sub12_Sub11_Sub5.anInt2848 = 1;
				Statics.aClass59_565 = Statics.method251(
						(byte) -91,
						(new RSString[] {
								Game.aClass59_1569,
								(Class12_Sub12_Sub11_Sub5.method502((byte) 121,
										i_2_).aClass59_2480),
								(Class12_Sub12_Sub13.aClass59_2426) }));
				Class12.anInt315 = 0;
				Class49.aBoolean1146 = true;
				if (Statics.aClass59_565 == null)
					Statics.aClass59_565 = Class44.aClass59_1050;
			} else {
				if (i_1_ == 51)
					Class64_Sub1.method991(true);
				if ((i_1_ ^ 0xffffffff) == -33) {
					Game.outBuffer.writePacket(189);
					Game.outBuffer.writeIntBE(i_0_);
					Class47.anInt1111++;
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_0_, 65535);
					if (class12_sub12_sub3.anIntArrayArray2170 != null
							&& (class12_sub12_sub3.anIntArrayArray2170[0][0] ^ 0xffffffff) == -6) {
						int i_7_ = class12_sub12_sub3.anIntArrayArray2170[0][1];
						if (Class12_Sub12_Sub12.anIntArray2414[i_7_] != class12_sub12_sub3.anIntArray2118[0]) {
							Class12_Sub12_Sub12.anIntArray2414[i_7_] = class12_sub12_sub3.anIntArray2118[0];
							Class12_Sub12_Sub11_Sub2.method447(8, i_7_);
							Class49.aBoolean1146 = true;
						}
					}
				}
				if ((i_1_ ^ 0xffffffff) == -21) {
					Class12_Sub12_Sub11_Sub2_Sub1.anInt2914++;
					Game.outBuffer.writePacket(109);
					Game.outBuffer.writeIntBE(i_0_);
					Game.outBuffer.writeShortLE(i_2_);
					Game.outBuffer.writeShortBEA(i, (byte) 101);
					Class12_Sub12_Sub16.anInt2560 = 2;
					Class33.anInt829 = i;
					Player.anInt2973 = i_0_;
					Class12.anInt333 = 0;
					if (i_0_ >> -1269096080 == Class13.anInt343)
						Class12_Sub12_Sub16.anInt2560 = 1;
					if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == (i_0_ >> 1109974128 ^ 0xffffffff))
						Class12_Sub12_Sub16.anInt2560 = 3;
				}
				if (i_1_ == 53) {
					Player
							.method461(i_0_, i_2_, -106, i);
					Class64_Sub2.anInt1956++;
					Game.outBuffer.writePacket(184);
					Game.outBuffer.writeShortLE(Class64.anInt1451
							+ i);
					Game.outBuffer.writeShortLE(
							0x7fff & i_2_ >> -1491580210);
					Game.outBuffer.writeShortLEA(96, i_0_
							- -Class8.anInt174);
				}
				if (i_1_ == 1006) {
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_0_, 65535);
					if (class12_sub12_sub3 != null
							&& class12_sub12_sub3.anIntArray2149[i] >= 100000)
						Class12_Sub7
								.method190(
										Class11.aClass59_310,
										(Statics
												.method251(
														(byte) -68,
														(new RSString[] {
																Class19.method599(
																		(class12_sub12_sub3.anIntArray2149[i]),
																		10),
																Class12_Sub12_Sub11.aClass59_2399,
																(Class12_Sub12_Sub11_Sub5
																		.method502(
																				(byte) 121,
																				i_2_).aClass59_2480) }))),
										0, false);
					else {
						Game.outBuffer.writePacket(233);
						Class9_Sub2.anInt1602++;
						Game.outBuffer.writeShortBEA(i_2_,
								(byte) 113);
					}
				}
				if (i_1_ == 2) {
					Class12_Sub12_Sub15.anInt2484++;
					Player.method461(i_0_, i_2_, -77, i);
					Game.outBuffer.writePacket(159);
					Game.outBuffer.writeShortBE(i
							+ Class64.anInt1451);
					Game.outBuffer.writeShortLEA(96,
							(i_2_ & 0x1fffc966) >> -1806687602);
					Game.outBuffer.writeShortBE(
							Class8.anInt174 + i_0_);
				}
				if ((i_1_ ^ 0xffffffff) == -23
						&& !Class12_Sub12_Sub16.aBoolean2559) {
					Game.outBuffer.writePacket(72);
					Class12_Sub12_Sub16.aBoolean2559 = true;
					Class23.anInt500++;
				}
				if (i_1_ == 5) {
					Player class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_]);
					if (class12_sub12_sub11_sub2_sub2 != null) {
						Class28.anInt682++;
						Class64_Sub2
								.method997(
										false,
										class12_sub12_sub11_sub2_sub2.anIntArray2671[0],
										25,
										1,
										0,
										2,
										0,
										1,
										class12_sub12_sub11_sub2_sub2.anIntArray2708[0],
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
										0,
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
						Class12_Sub12_Sub4.anInt2228 = 0;
						Archive.anInt1903 = 2;
						Class49.anInt1149 = Class42.anInt1000;
						Class33.anInt823 = Class10.anInt226;
						Game.outBuffer.writePacket(244);
						Game.outBuffer.writeShortBE(
								i_2_);
					}
				}
				if ((i_1_ ^ 0xffffffff) == -51) {
					Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_];
					if (class12_sub12_sub11_sub2_sub1 != null) {
						Class64_Sub2
								.method997(
										false,
										class12_sub12_sub11_sub2_sub1.anIntArray2671[0],
										25,
										1,
										0,
										2,
										0,
										1,
										class12_sub12_sub11_sub2_sub1.anIntArray2708[0],
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
										0,
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
						Archive.anInt1903 = 2;
						Class49.anInt1149 = Class42.anInt1000;
						Class47.anInt1091++;
						Class12_Sub12_Sub4.anInt2228 = 0;
						Class33.anInt823 = Class10.anInt226;
						Game.outBuffer.writePacket(90);
						Game.outBuffer.writeIntBE(
                                Class12_Sub2.anInt1647);
						Game.outBuffer.writeShortBEA(i_2_,
								(byte) 116);
					}
				}
				if ((i_1_ ^ 0xffffffff) == -50) {
					RSSocket.anInt529++;
					Game.outBuffer.writePacket(107);
					Game.outBuffer.method245((byte) -70,
							Class12_Sub2.anInt1647);
					Game.outBuffer.writeShortLE(i_2_);
					Game.outBuffer.method245((byte) -70, i_0_);
					Game.outBuffer.writeShortLEA(96, i);
					Player.anInt2973 = i_0_;
					Class12.anInt333 = 0;
					Class12_Sub12_Sub16.anInt2560 = 2;
					if ((Class13.anInt343 ^ 0xffffffff) == (i_0_ >> 1955051632 ^ 0xffffffff))
						Class12_Sub12_Sub16.anInt2560 = 1;
					Class33.anInt829 = i;
					if ((i_0_ >> -537073264 ^ 0xffffffff) == (Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff))
						Class12_Sub12_Sub16.anInt2560 = 3;
				}
				if (i_1_ == 31) {
					Player class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_2_]);
					if (class12_sub12_sub11_sub2_sub2 != null) {
						Class58.anInt1356++;
						Class64_Sub2
								.method997(
										false,
										class12_sub12_sub11_sub2_sub2.anIntArray2671[0],
										25,
										1,
										0,
										2,
										0,
										1,
										class12_sub12_sub11_sub2_sub2.anIntArray2708[0],
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
										0,
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
						Class49.anInt1149 = Class42.anInt1000;
						Class33.anInt823 = Class10.anInt226;
						Archive.anInt1903 = 2;
						Class12_Sub12_Sub4.anInt2228 = 0;
						Game.outBuffer.writePacket(253);
						Game.outBuffer.writeShortLE(i_2_);
						Game.outBuffer.writeIntBE(
                                Class9_Sub2.anInt1596);
						Game.outBuffer.writeShortLE(
								Class12_Sub12_Sub13.anInt2434);
						Game.outBuffer.writeShortLE(
								Class13.anInt352);
					}
				}
				if ((i_1_ ^ 0xffffffff) == -9) {
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_0_, 65535);
					boolean bool = true;
					if (class12_sub12_sub3.anInt2180 > 0)
						bool = Class63
								.method969((byte) -53, class12_sub12_sub3);
					if (bool) {
						Game.outBuffer.writePacket(189);
						Class47.anInt1111++;
						Game.outBuffer.writeIntBE(
                                i_0_);
					}
				}
				if (i_1_ == 24 || (i_1_ ^ 0xffffffff) == -36) {
					RSString class59 = Class12_Sub1.aClass59Array1621[arg0];
					int i_8_ = class59.method930(-2,
							Class12_Sub12_Sub13.aClass59_2426);
					if (i_8_ != -1) {
						class59 = class59.method945(63, 5 + i_8_).method935(
								false);
						RSString class59_9_ = class59.method917(107).toString(
								-14767);
						boolean bool = false;
						for (int i_10_ = 0; Class9.anInt203 > i_10_; i_10_++) {
							Player class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[anIntArray888[i_10_]]);
							if (class12_sub12_sub11_sub2_sub2 != null
									&& (class12_sub12_sub11_sub2_sub2.aClass59_2951 != null)
									&& class12_sub12_sub11_sub2_sub2.aClass59_2951
											.method920(class59_9_, (byte) 20)) {
								Class64_Sub2
										.method997(
												false,
												(class12_sub12_sub11_sub2_sub2.anIntArray2671[0]),
												25,
												1,
												0,
												2,
												0,
												1,
												(class12_sub12_sub11_sub2_sub2.anIntArray2708[0]),
												(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
												0,
												(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
								bool = true;
								if (i_1_ == 24) {
									Game.outBuffer.writePacket(
											244);
									Class28.anInt682++;
									Game.outBuffer.writeShortBE(
											anIntArray888[i_10_]);
								}
								if ((i_1_ ^ 0xffffffff) == -36) {
									Game.anInt1570++;
									Game.outBuffer.writePacket(
											86);
									Game.outBuffer.writeShortBEA(
											anIntArray888[i_10_], (byte) 62);
								}
								break;
							}
						}
						if (!bool)
							Class12_Sub7
									.method190(
											Class11.aClass59_310,
											Statics
													.method251(
															(byte) -45,
															(new RSString[] {
																	(Class12_Sub12_Sub9.aClass59_2357),
																	class59_9_ })),
											0, false);
					}
				}
				if ((i_1_ ^ 0xffffffff) == -5) {
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_0_, 65535);
					Class12_Sub2.anInt1647 = i_0_;
					Class55.anInt1289 = class12_sub12_sub3.anInt2174;
					Class12.anInt315 = 1;
					Class12_Sub12_Sub11_Sub5.anInt2848 = 0;
					Class49.aBoolean1146 = true;
					Class12_Sub12_Sub9.aClass59_2354 = (Statics
							.method251((byte) -86, (new RSString[] {
									class12_sub12_sub3.aClass59_2131,
									Class12_Sub7.aClass59_1731,
									class12_sub12_sub3.aClass59_2116,
									Class12_Sub12_Sub13.aClass59_2426 })));
					if ((Class55.anInt1289 ^ 0xffffffff) == -17) {
						Class12_Sub2.aBoolean1641 = true;
						Class15.anInt400 = 3;
						Class49.aBoolean1146 = true;
					}
				} else {
					if (i_1_ == 11) {
						Game.outBuffer.writePacket(166);
						Class12_Sub12_Sub2.anInt2066++;
						Game.outBuffer.writeShortLE(i);
						Game.outBuffer.writeIntBE(
                                i_0_);
						Game.outBuffer.writeShortLE(i_2_);
						Class12_Sub12_Sub16.anInt2560 = 2;
						Player.anInt2973 = i_0_;
						if ((i_0_ >> -1941335344 ^ 0xffffffff) == (Class13.anInt343 ^ 0xffffffff))
							Class12_Sub12_Sub16.anInt2560 = 1;
						Class12.anInt333 = 0;
						if (i_0_ >> -599178320 == Class12_Sub12_Sub12.anInt2407)
							Class12_Sub12_Sub16.anInt2560 = 3;
						Class33.anInt829 = i;
					}
					if (i_1_ == 44) {
						RSString class59 = Class12_Sub1.aClass59Array1621[arg0];
						int i_11_ = class59.method930(-2,
								(Class12_Sub12_Sub13.aClass59_2426));
						if (i_11_ != -1) {
							if ((Class13.anInt343 ^ 0xffffffff) != 0)
								Class12_Sub7.method190(Class11.aClass59_310,
										Class35.aClass59_867, 0, false);
							else {
								Class64_Sub1.method991(true);
								if (Class7.anInt1530 != -1) {
									Class11.aClass59_278 = class59.method945(
											63, 5 + i_11_).method935(false);
									Game.aBoolean1565 = false;
									Class26.anInt616 = Class13.anInt343 = Class7.anInt1530;
								}
							}
						}
					}
					if ((i_1_ ^ 0xffffffff) == -1002) {
						Class62_Sub2.anInt1909++;
						Game.outBuffer.writePacket(74);
						Game.outBuffer.writeShortBE(
								0x7fff & i_2_ >> -1995444626);
					}
					if (i_1_ == 17 || (i_1_ ^ 0xffffffff) == -16 || i_1_ == 48
							|| i_1_ == 30) {
						RSString class59 = Class12_Sub1.aClass59Array1621[arg0];
						int i_12_ = class59.method930(-2,
								(Class12_Sub12_Sub13.aClass59_2426));
						if ((i_12_ ^ 0xffffffff) != 0) {
							long l = class59.method945(63, 5 + i_12_)
									.method935(false).method912(107);
							if ((i_1_ ^ 0xffffffff) == -18)
								Class12_Sub12_Sub13.method533(-118, l);
							if ((i_1_ ^ 0xffffffff) == -16)
								Class12_Sub7.method191(l, 7159);
							if ((i_1_ ^ 0xffffffff) == -49)
								Class40.method753(l, -19259);
							if ((i_1_ ^ 0xffffffff) == -31)
								Class62.method956(22793, l);
						}
					}
					if (i_1_ == 43) {
						Game.outBuffer.writePacket(189);
						Class47.anInt1111++;
						Game.outBuffer.writeIntBE(
                                i_0_);
						Class12_Sub12_Sub3 class12_sub12_sub3 = Class62
								.method954(i_0_, 65535);
						if (class12_sub12_sub3.anIntArrayArray2170 != null
								&& (class12_sub12_sub3.anIntArrayArray2170[0][0] == 5)) {
							int i_13_ = class12_sub12_sub3.anIntArrayArray2170[0][1];
							Class12_Sub12_Sub12.anIntArray2414[i_13_] = (-Class12_Sub12_Sub12.anIntArray2414[i_13_] + 1);
							Class12_Sub12_Sub11_Sub2.method447(8, i_13_);
							Class49.aBoolean1146 = true;
						}
					}
					if (i_1_ == 16) {
						Game.outBuffer.writePacket(240);
						Game.outBuffer.method225(-11129, i_0_);
						Class12_Sub12_Sub11_Sub2_Sub1.anInt2920++;
						Game.outBuffer.writeShortLE(i_2_);
						Game.outBuffer.writeShortBE(i);
						Player.anInt2973 = i_0_;
						Class12.anInt333 = 0;
						Class33.anInt829 = i;
						Class12_Sub12_Sub16.anInt2560 = 2;
						if (i_0_ >> 2107246800 == Class13.anInt343)
							Class12_Sub12_Sub16.anInt2560 = 1;
						if (i_0_ >> 398488816 == Class12_Sub12_Sub12.anInt2407)
							Class12_Sub12_Sub16.anInt2560 = 3;
					}
					if (i_1_ == 10) {
						boolean bool = (Class64_Sub2
								.method997(
										false,
										i_0_,
										25,
										0,
										0,
										2,
										0,
										0,
										i,
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
										0,
										(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
						if (!bool)
							bool = (Class64_Sub2
									.method997(
											false,
											i_0_,
											25,
											1,
											0,
											2,
											0,
											1,
											i,
											(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
											0,
											(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])));
						Class33.anInt823 = Class10.anInt226;
						Class49.anInt1149 = Class42.anInt1000;
						Player.anInt2956++;
						Archive.anInt1903 = 2;
						Class12_Sub12_Sub4.anInt2228 = 0;
						Game.outBuffer.writePacket(99);
						Game.outBuffer.writeShortBE(
								i_0_ - -Class8.anInt174);
						Game.outBuffer.writeShortLEA(96, i
								+ Class64.anInt1451);
						Game.outBuffer.writeShortLEA(96, i_2_);
					}
					if ((i_1_ ^ 0xffffffff) == -37) {
						Game.outBuffer.writePacket(148);
						Game.outBuffer.method225(-11129, i_0_);
						Class12_Sub12_Sub11_Sub5.anInt2850++;
						Game.outBuffer.writeShortLEA(96, i_2_);
						Game.outBuffer.writeShortBE(i);
						Class12_Sub12_Sub16.anInt2560 = 2;
						Player.anInt2973 = i_0_;
						if (Class13.anInt343 == i_0_ >> 1252456176)
							Class12_Sub12_Sub16.anInt2560 = 1;
						Class12.anInt333 = 0;
						Class33.anInt829 = i;
						if (i_0_ >> -1514719440 == Class12_Sub12_Sub12.anInt2407)
							Class12_Sub12_Sub16.anInt2560 = 3;
					}
					if ((i_1_ ^ 0xffffffff) == -43) {
						Class1.anInt70++;
						Game.outBuffer.writePacket(249);
						Game.outBuffer.writeShortLEA(96, i);
						Game.outBuffer.writeShortLE(i_2_);
						Game.outBuffer.method209(-921469304,
								i_0_);
						Class12.anInt333 = 0;
						Class33.anInt829 = i;
						Class12_Sub12_Sub16.anInt2560 = 2;
						Player.anInt2973 = i_0_;
						if (i_0_ >> -1415675792 == Class13.anInt343)
							Class12_Sub12_Sub16.anInt2560 = 1;
						if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == (i_0_ >> 119333648 ^ 0xffffffff))
							Class12_Sub12_Sub16.anInt2560 = 3;
					}
					if ((i_1_ ^ 0xffffffff) == -27) {
						Player.method461(i_0_, i_2_,
								-103, i);
						Game.outBuffer.writePacket(213);
						Game.outBuffer.writeShortBEA(i_0_
								+ Class8.anInt174, (byte) 61);
						Class12_Sub12_Sub2.anInt2084++;
						Game.outBuffer.writeShortBEA(
								(i_2_ & 0x1fffc6ef) >> 171041390, (byte) 109);
						Game.outBuffer.writeShortBE(
								Class64.anInt1451 + i);
					}
					if (i_1_ == 41) {
						Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_2_]);
						if (class12_sub12_sub11_sub2_sub1 != null) {
							Class12_Sub9.anInt1749++;
							Class64_Sub2
									.method997(
											false,
											(class12_sub12_sub11_sub2_sub1.anIntArray2671[0]),
											25,
											1,
											0,
											2,
											0,
											1,
											(class12_sub12_sub11_sub2_sub1.anIntArray2708[0]),
											(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]),
											0,
											(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]));
							Class49.anInt1149 = Class42.anInt1000;
							Class12_Sub12_Sub4.anInt2228 = 0;
							Archive.anInt1903 = 2;
							Class33.anInt823 = Class10.anInt226;
							Game.outBuffer
									.writePacket(153);
							Game.outBuffer.writeShortBEA(i_2_,
									(byte) 64);
						}
					}
					if ((Class12_Sub12_Sub11_Sub5.anInt2848 ^ 0xffffffff) != -1) {
						Class12_Sub12_Sub11_Sub5.anInt2848 = 0;
						Class49.aBoolean1146 = true;
					}
					if (Class12.anInt315 != 0) {
						Class12.anInt315 = 0;
						Class49.aBoolean1146 = true;
					}
				}
			}
		}
	}

	public static void method729(boolean arg0, RSString arg1, int arg2,
                                 RSString arg3) {
		try {
			anInt876++;
			if (Class27.aBoolean642) {
				Class27.aBoolean642 = false;
				Class11.method132(false);
				Statics.method628(arg2 + -1962);
				Class20.method603(-18443);
				Class41.method756((byte) -54);
				Class12_Sub12_Sub2.method288(Class4.anInt138,
						Class12_Sub12_Sub3.anInt2154, Class31.anInt757,
						(byte) 106,
						(Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529));
				Class23.method612(-1, -14659, Class62_Sub2.anIntArray1907,
						Class15.anInt400, (Class35.anInt860 ^ 0xffffffff) == 0);
				Class8.aBoolean193 = true;
				Class15.aBoolean392 = true;
				Class8.aBoolean188 = true;
			}
			Class12_Sub6.method189(-123);
			int i = 151;
			i -= 3;
			Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method396(arg3,
					257, i, 0);
			Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method396(arg3,
					256, -1 + i, 16777215);
			if (arg2 != 1932)
				anInt883 = 119;
			if (arg1 != null) {
				i += 15;
				if (arg0) {
					int i_14_ = 4 + Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529
							.method401(arg1);
					Class12_Sub12_Sub7.method347(257 - i_14_ / 2, i - 11,
							i_14_, 11, 0);
				}
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method396(
						arg1, 257, i, 0);
				Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529.method396(
						arg1, 256, -1 + i, 16777215);
			}
			Class12_Sub12_Sub12.method518(4);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("le.E(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public String toString() {
		try {
			anInt896++;
			return "Cache:" + anInt890;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "le.toString(" + ')');
		}
	}

	public static void method730(int arg0) {
		aClass59_891 = null;
		aClass59_877 = null;
		aClass51_879 = null;
		anIntArray888 = null;
		aClass59_881 = null;
		aClass59_889 = null;
		aClass59_875 = null;
		if (arg0 != 0)
			aClass59_875 = null;
	}

	public static void method731(byte arg0) {
		anInt885++;
		synchronized (Class56.anObject1321) {
			if (Class12_Sub12_Sub12.anInt2404 != 0) {
				Class12_Sub12_Sub12.anInt2404 = 1;
				try {
					Class56.anObject1321.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
		if (arg0 <= 79)
			method729(false, null, 50, null);
	}

	public boolean method732(boolean arg0, int arg1, int arg2, int arg3,
			byte[] arg4) {
		try {
			anInt880++;
			synchronized (aClass51_894) {
				try {
					int i;
					if (!arg0) {
						i = (int) ((519L + aClass51_894.method819(17)) / 520L);
						if ((i ^ 0xffffffff) == -1)
							i = 1;
					} else {
						if ((long) (arg1 * 6 + 6) > aClass51_892.method819(17))
							return false;
						aClass51_892.method815(3, (long) (6 * arg1));
						aClass51_892.method818(6, -94, Class55.aByteArray1291,
								0);
						i = ((0xff & Class55.aByteArray1291[5])
								+ ((0xff & Class55.aByteArray1291[3]) << 1315180784) - -(Class55.aByteArray1291[4] << -1345803288 & 0xff00));
						if ((i ^ 0xffffffff) >= -1
								|| (((long) i ^ 0xffffffffffffffffL) < (aClass51_894
										.method819(17) / 520L ^ 0xffffffffffffffffL)))
							return false;
					}
					Class55.aByteArray1291[0] = (byte) (arg2 >> 248290640);
					int i_15_ = 0;
					Class55.aByteArray1291[1] = (byte) (arg2 >> 256527208);
					int i_16_ = 0;
					if (arg3 <= 2)
						aClass51_894 = null;
					Class55.aByteArray1291[2] = (byte) arg2;
					Class55.aByteArray1291[3] = (byte) (i >> 2006561328);
					Class55.aByteArray1291[4] = (byte) (i >> -1377247448);
					Class55.aByteArray1291[5] = (byte) i;
					aClass51_892.method815(3, (long) (6 * arg1));
					aClass51_892.method817(Class55.aByteArray1291, 0, 6, true);
					int i_17_;
					for (/**/; (arg2 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_ += i_17_) {
						int i_18_ = 0;
						if (arg0) {
							aClass51_894.method815(3, (long) (i * 520));
							try {
								aClass51_894.method818(8, -121,
										Class55.aByteArray1291, 0);
							} catch (java.io.EOFException eofexception) {
								break;
							}
							i_18_ = ((Class55.aByteArray1291[6] & 0xff) + (((0xff & Class55.aByteArray1291[5]) << 1788962216) + (Class55.aByteArray1291[4] << 560817296 & 0xff0000)));
							i_17_ = (((0xff & Class55.aByteArray1291[0]) << 2139690920) - -(0xff & Class55.aByteArray1291[1]));
							int i_19_ = 0xff & Class55.aByteArray1291[7];
							int i_20_ = ((0xff & Class55.aByteArray1291[3]) + (Class55.aByteArray1291[2] << -500591256 & 0xff00));
							if ((arg1 ^ 0xffffffff) != (i_17_ ^ 0xffffffff)
									|| i_20_ != i_16_ || anInt890 != i_19_)
								return false;
							if ((i_18_ ^ 0xffffffff) > -1
									|| (aClass51_894.method819(17) / 520L < (long) i_18_))
								return false;
						}
						if ((i_18_ ^ 0xffffffff) == -1) {
							i_18_ = (int) ((519L + aClass51_894.method819(17)) / 520L);
							arg0 = false;
							if (i_18_ == 0)
								i_18_++;
							if ((i ^ 0xffffffff) == (i_18_ ^ 0xffffffff))
								i_18_++;
						}
						Class55.aByteArray1291[0] = (byte) (arg1 >> 739833864);
						if ((arg2 - i_15_ ^ 0xffffffff) >= -513)
							i_18_ = 0;
						Class55.aByteArray1291[1] = (byte) arg1;
						Class55.aByteArray1291[2] = (byte) (i_16_ >> 1617403304);
						i_17_ = -i_15_ + arg2;
						if (i_17_ > 512)
							i_17_ = 512;
						Class55.aByteArray1291[3] = (byte) i_16_;
						Class55.aByteArray1291[4] = (byte) (i_18_ >> 178623568);
						Class55.aByteArray1291[5] = (byte) (i_18_ >> 2026709640);
						i_16_++;
						Class55.aByteArray1291[6] = (byte) i_18_;
						Class55.aByteArray1291[7] = (byte) anInt890;
						aClass51_894.method815(3, (long) (520 * i));
						i = i_18_;
						aClass51_894.method817(Class55.aByteArray1291, 0, 8,
								true);
						aClass51_894.method817(arg4, i_15_, i_17_, true);
					}
					return true;
				} catch (java.io.IOException ioexception) {
					return false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("le.A(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public byte[] method733(int arg0, int arg1) {
		try {
			anInt895++;
			synchronized (aClass51_894) {
				try {
					if (((long) (6 + arg0 * 6) ^ 0xffffffffffffffffL) < (aClass51_892
							.method819(17) ^ 0xffffffffffffffffL))
						return null;
					aClass51_892.method815(3, (long) (arg0 * 6));
					aClass51_892.method818(6, -112, Class55.aByteArray1291, 0);
					int i = (((Class55.aByteArray1291[3] & 0xff) << -806867632)
							- -(Class55.aByteArray1291[4] << -1467953464 & 0xff00) + (Class55.aByteArray1291[5] & 0xff));
					int i_21_ = (((0xff & Class55.aByteArray1291[1]) << -1325376856) + ((Class55.aByteArray1291[0] << 1622951504 & 0xff0000) + (Class55.aByteArray1291[2] & 0xff)));
					if (i_21_ < 0
							|| (anInt886 ^ 0xffffffff) > (i_21_ ^ 0xffffffff))
						return null;
					if (i <= 0
							|| ((aClass51_894.method819(17) / 520L ^ 0xffffffffffffffffL) > ((long) i ^ 0xffffffffffffffffL)))
						return null;
					int i_22_ = 0;
					if (arg1 != -1319)
						method733(16, 111);
					byte[] is = new byte[i_21_];
					int i_23_ = 0;
					while (i_21_ > i_22_) {
						if (i == 0)
							return null;
						aClass51_894.method815(3, (long) (i * 520));
						int i_24_ = i_21_ - i_22_;
						if ((i_24_ ^ 0xffffffff) < -513)
							i_24_ = 512;
						aClass51_894.method818(8 + i_24_, 77,
								Class55.aByteArray1291, 0);
						int i_25_ = ((0xff & Class55.aByteArray1291[6]) + ((0xff00 & Class55.aByteArray1291[5] << 95594792) + ((Class55.aByteArray1291[4] & 0xff) << -1129249808)));
						int i_26_ = ((Class55.aByteArray1291[3] & 0xff) + ((0xff & Class55.aByteArray1291[2]) << 1223531976));
						int i_27_ = (((0xff & Class55.aByteArray1291[0]) << -162081880) + (0xff & Class55.aByteArray1291[1]));
						int i_28_ = Class55.aByteArray1291[7] & 0xff;
						if ((arg0 ^ 0xffffffff) != (i_27_ ^ 0xffffffff)
								|| i_26_ != i_23_ || anInt890 != i_28_)
							return null;
						if ((i_25_ ^ 0xffffffff) > -1
								|| (((long) i_25_ ^ 0xffffffffffffffffL) < (aClass51_894
										.method819(arg1 + 1336) / 520L ^ 0xffffffffffffffffL)))
							return null;
						i = i_25_;
						for (int i_29_ = 0; i_29_ < i_24_; i_29_++)
							is[i_22_++] = Class55.aByteArray1291[i_29_ + 8];
						i_23_++;
					}
					return is;
				} catch (java.io.IOException ioexception) {
					return null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "le.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method734(byte[] arg0, byte arg1, int arg2, int arg3) {
		try {
			anInt893++;
			synchronized (aClass51_894) {
				if (arg3 < 0 || arg3 > anInt886)
					throw new IllegalArgumentException();
				if (arg1 != 72)
					aClass59_875 = null;
				boolean bool = method732(true, arg2, arg3, 90, arg0);
				if (!bool)
					bool = method732(false, arg2, arg3, arg1 + -40, arg0);
				return bool;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("le.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public Class36(int arg0, Class51 arg1, Class51 arg2, int arg3) {
		aClass51_892 = null;
		try {
			aClass51_894 = arg1;
			anInt886 = arg3;
			aClass51_892 = arg2;
			anInt890 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("le.<init>(" + arg0
					+ ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	static {
		anInt883 = 0;
		aClass59_891 = aClass59_877;
		aClass59_875 = Class55.method898("backleft2", -10983);
		aClass59_881 = Class55.method898("Enter name of player to add to list",
				-10983);
		aBoolean887 = false;
		aClass59_889 = aClass59_881;
	}
}
