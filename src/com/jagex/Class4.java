package com.jagex;/* com.jagex.Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Cache;
import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

import java.awt.Component;
import java.lang.reflect.Method;

public class Class4 {
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_124;
	public static RSString aClass59_125;
	public static int anInt126;
	public int anInt127;
	public static int anInt128;
	public static int anInt129;
	public int anInt130 = 0;
	public int anInt131;
	public static RSString aClass59_132;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_133;
	public int anInt134;
	public int anInt135;
	public static RSString aClass59_136 = Class55.method898(
			" is already on your friend list", -10983);
	public static int anInt137;
	public static int anInt138;
	public static RSString aClass59_139 = Class55.method898("flash2:", -10983);
	public static int anInt140;
	public static RSString aClass59_141;
	public static RSString aClass59_142;
	public static RSString aClass59_143;
	public static int anInt144;
	public int anInt145 = 0;
	public static int anInt146;
	public int anInt147;

	public static void method68(int arg0) {
		try {
			if (Class35.aClass49_837 != null) {
				synchronized (Class35.aClass49_837) {
					Class35.aClass49_837 = null;
				}
			}
			if (arg0 > 105)
				anInt129++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ac.E(" + arg0 + ')');
		}
	}

	public static boolean method69(int arg0) {
		try {
			anInt146++;
			if (Game.gameServerSocket == null)
				return false;
			try {
				int i = Game.gameServerSocket.method617(false);
				if (i == 0)
					return false;
				if ((Class57.anInt1334 ^ 0xffffffff) == arg0) {
					i--;
					Game.gameServerSocket.method618((byte) 32, 1,
							Game.inBuffer.payload, 0);
					Game.inBuffer.position = 0;
					Class57.anInt1334 = Game.inBuffer
							.readPacket();
					Class5.anInt159 = Class12_Sub12_Sub4.anIntArray2220[Class57.anInt1334];
				}
				if (Class5.anInt159 == -1) {
					if (i > 0) {
						Game.gameServerSocket.method618((byte) 32,
								1,
								Game.inBuffer.payload,
								0);
						Class5.anInt159 = (Game.inBuffer.payload[0]) & 0xff;
						i--;
					} else
						return false;
				}
				if ((Class5.anInt159 ^ 0xffffffff) == 1) {
					if (i <= 1)
						return false;
					Game.gameServerSocket.method618((byte) 32, 2,
							Game.inBuffer.payload, 0);
					i -= 2;
					Game.inBuffer.position = 0;
					Class5.anInt159 = Game.inBuffer
							.readShort(-1);
				}
				if (i < Class5.anInt159)
					return false;
				Game.inBuffer.position = 0;
				Game.gameServerSocket.method618((byte) 32,
						Class5.anInt159,
						Game.inBuffer.payload, 0);
				Class12_Sub12_Sub4.anInt2230 = 0;
				Class47.anInt1103 = Class29.anInt705;
				Class29.anInt705 = Class28.anInt678;
				Class28.anInt678 = Class57.anInt1334;
				if ((Class57.anInt1334 ^ 0xffffffff) == -42) {
					Class12_Sub12_Sub8.method409(arg0 ^ ~0x43);
					Class57.anInt1334 = -1;
					return false;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -18) {
					Class14.constructMapRegion(94, true);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 125) {
					Class15.anInt400 = Game.inBuffer
							.getByteS(-762);
					Class49.aBoolean1146 = true;
					Class57.anInt1334 = -1;
					Class12_Sub2.aBoolean1641 = true;
					return true;
				}
				if (Class57.anInt1334 == 232) {
					int i_0_ = Game.inBuffer
							.method219(550259848);
					if ((i_0_ ^ 0xffffffff) <= -1)
						Class30.method692((byte) -68, i_0_);
					if (i_0_ != Statics.anInt2028) {
						Class62.method958(-74, Statics.anInt2028);
						Statics.anInt2028 = i_0_;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 89) {
					Class1.anInt85 = 1;
					Class11.aClass59_265 = Class11.aClass59_310;
					Class8.aBoolean182 = true;
					Class12_Sub4.aBoolean1671 = false;
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 46) {
					Class58.anInt1343 = Game.inBuffer
							.readUByte();
					Class57.anInt1334 = -1;
					if (Class15.anInt400 == Class58.anInt1343) {
						Class49.aBoolean1146 = true;
						if (Class58.anInt1343 != 3)
							Class15.anInt400 = 3;
						else
							Class15.anInt400 = 1;
					}
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -41) {
					int i_1_ = Game.inBuffer.readUByte();
					int i_2_ = Game.inBuffer.readUByte();
					int i_3_ = Game.inBuffer.readUByte();
					int i_4_ = Game.inBuffer.readUByte();
					Statics.aBooleanArray2022[i_1_] = true;
					Class35.anIntArray836[i_1_] = i_2_;
					Class1.anIntArray74[i_1_] = i_3_;
					Class12_Sub12_Sub8.anIntArray2297[i_1_] = i_4_;
					Class42.anIntArray994[i_1_] = 0;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -136) {
					Class12_Sub4.aBoolean1671 = false;
					Class11.aClass59_265 = Class11.aClass59_310;
					Class57.anInt1334 = -1;
					Class1.anInt85 = 2;
					Class8.aBoolean182 = true;
					return true;
				}
				if (Class57.anInt1334 == 211) {
					Class19.anInt456 = Game.inBuffer
							.getByteS(-762);
					Class40.anInt949 = Game.inBuffer
							.readUByte();
					for (int i_5_ = Class19.anInt456; ((i_5_ ^ 0xffffffff) > (Class19.anInt456 + 8 ^ 0xffffffff)); i_5_++) {
						for (int i_6_ = Class40.anInt949; Class40.anInt949 + 8 > i_6_; i_6_++) {
							if ((Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_5_][i_6_]) != null) {
								Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_5_][i_6_] = null;
								Class12_Sub12_Sub13
										.method531(i_5_, i_6_, false);
							}
						}
					}
					for (Class12_Sub2 class12_sub2 = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
							.method91((byte) 86); class12_sub2 != null; class12_sub2 = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
							.method100(-29860)) {
						if (((Class19.anInt456 ^ 0xffffffff) >= (class12_sub2.anInt1638 ^ 0xffffffff))
								&& ((class12_sub2.anInt1638 ^ 0xffffffff) > (8 + Class19.anInt456 ^ 0xffffffff))
								&& ((Class40.anInt949 ^ 0xffffffff) >= (class12_sub2.anInt1644 ^ 0xffffffff))
								&& ((8 + Class40.anInt949 ^ 0xffffffff) < (class12_sub2.anInt1644 ^ 0xffffffff))
								&& RSString.anInt1504 == class12_sub2.anInt1629)
							class12_sub2.anInt1633 = 0;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 154) {
					int i_7_ = Game.inBuffer.readShort(-1);
					int i_8_ = Game.inBuffer.readUByte();
					int i_9_ = Game.inBuffer.readShort(-1);
					if ((Class55.anInt1308 ^ 0xffffffff) != -1
							&& (i_8_ ^ 0xffffffff) != -1
							&& (Class12_Sub12_Sub11_Sub2_Sub1.anInt2931 ^ 0xffffffff) > -51) {
						RSApplet.anIntArray12[(Class12_Sub12_Sub11_Sub2_Sub1.anInt2931)] = i_7_;
						Class12_Sub12_Sub11_Sub5.anIntArray2882[Class12_Sub12_Sub11_Sub2_Sub1.anInt2931] = i_8_;
						Class58.anIntArray1346[(Class12_Sub12_Sub11_Sub2_Sub1.anInt2931)] = i_9_;
						Class12_Sub12_Sub12.aClass34Array2408[Class12_Sub12_Sub11_Sub2_Sub1.anInt2931] = null;
						Class12_Sub12_Sub11_Sub2_Sub1.anInt2931++;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -26) {
					int i_10_ = Game.inBuffer
							.readUShortLE();
					Class30.method692((byte) -90, i_10_);
					if ((Class35.anInt860 ^ 0xffffffff) != 0) {
						Class62.method958(-67, Class35.anInt860);
						Class12_Sub2.aBoolean1641 = true;
						Class49.aBoolean1146 = true;
						Class35.anInt860 = -1;
					}
					if (Class31.anInt756 != -1) {
						Class62.method958(-111, Class31.anInt756);
						Class31.anInt756 = -1;
						Class29.method686((byte) 67, 30);
					}
					if ((anInt128 ^ 0xffffffff) != 0) {
						Class62.method958(-106, anInt128);
						anInt128 = -1;
					}
					if (Class13.anInt343 != -1) {
						Class62.method958(arg0 ^ ~0x69, Class13.anInt343);
						Class13.anInt343 = -1;
					}
					if (i_10_ != Class12_Sub12_Sub12.anInt2407) {
						Class62.method958(-100, Class12_Sub12_Sub12.anInt2407);
						Class12_Sub12_Sub12.anInt2407 = i_10_;
					}
					Class12_Sub12_Sub16.aBoolean2559 = false;
					Class8.aBoolean182 = true;
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 196) {
					int i_11_ = Game.inBuffer.readUShortLE();
					int i_12_ = Game.inBuffer
							.readUShortLEA();
					Class30.method692((byte) -74, i_11_);
					if (i_12_ != -1)
						Class30.method692((byte) -128, i_12_);
					if ((Class13.anInt343 ^ 0xffffffff) != 0) {
						Class62.method958(-121, Class13.anInt343);
						Class13.anInt343 = -1;
					}
					if (Class35.anInt860 != -1) {
						Class62.method958(-100, Class35.anInt860);
						Class35.anInt860 = -1;
					}
					if (Class12_Sub12_Sub12.anInt2407 != -1) {
						Class62.method958(-65, Class12_Sub12_Sub12.anInt2407);
						Class12_Sub12_Sub12.anInt2407 = -1;
					}
					if (Class31.anInt756 != i_11_) {
						Class62.method958(arg0 ^ ~0x5b, Class31.anInt756);
						Class31.anInt756 = i_11_;
						Class29.method686((byte) 67, 35);
					}
					if ((anInt128 ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
						Class62.method958(arg0 ^ ~0x5c, anInt128);
						anInt128 = i_12_;
					}
					Class1.anInt85 = 0;
					Class12_Sub12_Sub16.aBoolean2559 = false;
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 23) {
					for (int i_13_ = 0; i_13_ < Class41.anInt973; i_13_++) {
						Class12_Sub12_Sub16 class12_sub12_sub16 = Class39
								.method745(i_13_, false);
						if (class12_sub12_sub16 != null
								&& ((class12_sub12_sub16.anInt2551 ^ 0xffffffff) == -1)) {
							Class13.anIntArray356[i_13_] = 0;
							Class12_Sub12_Sub12.anIntArray2414[i_13_] = 0;
						}
					}
					if ((Class58.anInt1342 ^ 0xffffffff) != 0)
						Class8.aBoolean182 = true;
					Class57.anInt1334 = -1;
					Class49.aBoolean1146 = true;
					return true;
				}
				if (Class57.anInt1334 == 225) {
					Class62_Sub2.updatePlayers((byte) 124);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 129) {
					long l = Game.inBuffer.readLong(108);
					int i_14_ = Game.inBuffer
							.readShort(arg0 ^ 0xffffffff);
					RSString class59 = Class12_Sub12_Sub13.method524(-3, l)
							.toString(-14767);
					for (int i_15_ = 0; i_15_ < Class7.anInt1540; i_15_++) {
						if ((l ^ 0xffffffffffffffffL) == (Class47.aLongArray1099[i_15_] ^ 0xffffffffffffffffL)) {
							if ((Class12_Sub12_Sub4.anIntArray2227[i_15_] ^ 0xffffffff) != (i_14_ ^ 0xffffffff)) {
								Class12_Sub12_Sub4.anIntArray2227[i_15_] = i_14_;
								Class49.aBoolean1146 = true;
								if ((i_14_ ^ 0xffffffff) < -1)
									Class12_Sub7
											.method190(
													Class11.aClass59_310,
													(Statics
															.method251(
																	(byte) -68,
																	(new RSString[] {
																			class59,
																			Class58.aClass59_1341 }))),
													5, false);
								if (i_14_ == 0)
									Class12_Sub7
											.method190(
													Class11.aClass59_310,
													(Statics
															.method251(
																	(byte) -126,
																	(new RSString[] {
																			class59,
																			Class49.aClass59_1170 }))),
													5, false);
							}
							class59 = null;
							break;
						}
					}
					if (class59 != null
							&& (Class7.anInt1540 ^ 0xffffffff) > -201) {
						Class47.aLongArray1099[Class7.anInt1540] = l;
						Class12_Sub12_Sub11_Sub6.aClass59Array2910[Class7.anInt1540] = class59;
						Class12_Sub12_Sub4.anIntArray2227[Class7.anInt1540] = i_14_;
						Class49.aBoolean1146 = true;
						Class7.anInt1540++;
					}
					boolean bool = false;
					while (!bool) {
						bool = true;
						for (int i_16_ = 0; ((-1 + Class7.anInt1540 ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++) {
							if (((RSCanvas.anInt65 != Class12_Sub12_Sub4.anIntArray2227[i_16_]) && (Class12_Sub12_Sub4.anIntArray2227[1 + i_16_]) == RSCanvas.anInt65)
									|| ((Class12_Sub12_Sub4.anIntArray2227[i_16_] == 0) && ((Class12_Sub12_Sub4.anIntArray2227[i_16_
											- -1]) ^ 0xffffffff) != -1)) {
								int i_17_ = Class12_Sub12_Sub4.anIntArray2227[i_16_];
								Class12_Sub12_Sub4.anIntArray2227[i_16_] = (Class12_Sub12_Sub4.anIntArray2227[i_16_
										- -1]);
								bool = false;
								Class12_Sub12_Sub4.anIntArray2227[i_16_ + 1] = i_17_;
								RSString class59_18_ = (Class12_Sub12_Sub11_Sub6.aClass59Array2910[i_16_]);
								Class12_Sub12_Sub11_Sub6.aClass59Array2910[i_16_] = (Class12_Sub12_Sub11_Sub6.aClass59Array2910[i_16_ + 1]);
								Class12_Sub12_Sub11_Sub6.aClass59Array2910[i_16_ + 1] = class59_18_;
								long l_19_ = Class47.aLongArray1099[i_16_];
								Class47.aLongArray1099[i_16_] = Class47.aLongArray1099[1 + i_16_];
								Class47.aLongArray1099[1 + i_16_] = l_19_;
								Class49.aBoolean1146 = true;
							}
						}
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 128) {
					int i_20_ = Game.inBuffer
							.method207(-708753192);
					int i_21_ = Game.inBuffer
							.readUShortLEA();
					int i_22_ = Game.inBuffer
							.readUShortLEA();
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_20_, 65535);
					class12_sub12_sub3.anInt2183 = (i_21_ << -249435312)
							+ i_22_;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -119) {
					Class57.aBoolean1326 = true;
					Class12_Sub12_Sub11_Sub6.anInt2883 = Game.inBuffer
							.readUByte();
					Class13.anInt353 = Game.inBuffer
							.readUByte();
					RSCanvas.anInt60 = Game.inBuffer
							.readShort(-1);
					Class12_Sub12_Sub11_Sub1.anInt2661 = Game.inBuffer
							.readUByte();
					Class35.anInt849 = Game.inBuffer
							.readUByte();
					if ((Class35.anInt849 ^ 0xffffffff) <= -101) {
						Class10.anInt250 = 64 + 128 * Class12_Sub12_Sub11_Sub6.anInt2883;
						Class20.anInt464 = 64 + 128 * Class13.anInt353;
						Class57.anInt1339 = (Class26.method658(
								Class10.anInt250, -6, RSString.anInt1504,
								Class20.anInt464) - RSCanvas.anInt60);
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 248) {
					Class57.aBoolean1326 = false;
					for (int i_23_ = 0; i_23_ < 5; i_23_++)
						Statics.aBooleanArray2022[i_23_] = false;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -222) {
					long l = Game.inBuffer.readLong(20);
					RSString class59 = Class12.method142(
							Game.inBuffer, 32767).method946(
							(byte) 80);
					Class12_Sub7.method190(
							Class12_Sub12_Sub13.method524(arg0 + -3, l)
									.toString(arg0 + -14767), class59, 6,
							false);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 195) {
					for (int i_24_ = 0; Class12_Sub12_Sub12.anIntArray2414.length > i_24_; i_24_++) {
						if (Class13.anIntArray356[i_24_] != Class12_Sub12_Sub12.anIntArray2414[i_24_]) {
							Class12_Sub12_Sub12.anIntArray2414[i_24_] = Class13.anIntArray356[i_24_];
							Class12_Sub12_Sub11_Sub2.method447(8, i_24_);
							Class49.aBoolean1146 = true;
						}
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 150) {
					int i_25_ = Game.inBuffer
							.method215((byte) 94);
					int i_26_ = Game.inBuffer.readUShortLE();
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_25_, arg0 ^ 0xffff);
					Class57.anInt1334 = -1;
					class12_sub12_sub3.anInt2114 = 1;
					class12_sub12_sub3.anInt2112 = i_26_;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -176) {
					for (int i_27_ = 0; ((Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398).length > i_27_); i_27_++) {
						if ((Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_27_]) != null)
							Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_27_].anInt2734 = -1;
					}
					for (int i_28_ = 0; (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531.length > i_28_); i_28_++) {
						if ((Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_28_]) != null)
							Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_28_].anInt2734 = -1;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 61 || Class57.anInt1334 == 249
						|| (Class57.anInt1334 ^ 0xffffffff) == -137
						|| Class57.anInt1334 == 108
						|| (Class57.anInt1334 ^ 0xffffffff) == -239
						|| (Class57.anInt1334 ^ 0xffffffff) == -101
						|| Class57.anInt1334 == 184
						|| (Class57.anInt1334 ^ 0xffffffff) == -93
						|| (Class57.anInt1334 ^ 0xffffffff) == -19
						|| Class57.anInt1334 == 209 || Class57.anInt1334 == 158) {
					Class42.method764(true);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 97) {
					Class12_Sub12_Sub11_Sub2_Sub1.method459(43,
							Class5.anInt159, Game.inBuffer,
							Game.signlink);
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -255) {
					if (Class15.anInt400 == 12)
						Class49.aBoolean1146 = true;
					Class28.anInt665 = Game.inBuffer
							.readUByte();
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 78) {
					int i_29_ = Game.inBuffer
							.method207(-708753192);
					int i_30_ = Game.inBuffer
							.method212((byte) -41);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_29_, 65535);
					if (class12_sub12_sub3.anInt2142 != i_30_ || i_30_ == -1) {
						class12_sub12_sub3.anInt2132 = 0;
						class12_sub12_sub3.anInt2110 = 0;
						class12_sub12_sub3.anInt2142 = i_30_;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 222) {
					int i_31_ = Game.inBuffer
							.method219(550259848);
					int i_32_ = Game.inBuffer
							.method215((byte) 94);
					int i_33_ = Game.inBuffer.method205(true);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_32_, arg0 + 65535);
					Class57.anInt1334 = -1;
					class12_sub12_sub3.anInt2171 = class12_sub12_sub3.anInt2106
							+ i_33_;
					class12_sub12_sub3.anInt2166 = class12_sub12_sub3.anInt2178
							+ i_31_;
					return true;
				}
				if (Class57.anInt1334 == 98) {
					boolean bool = ((Game.inBuffer
							.getByteS(arg0 ^ ~0x2f9) ^ 0xffffffff) == -2);
					int i_34_ = Game.inBuffer
							.method215((byte) 94);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_34_, arg0 ^ 0xffff);
					Class57.anInt1334 = -1;
					class12_sub12_sub3.aBoolean2169 = bool;
					return true;
				}
				if (Class57.anInt1334 == 76) {
					int i_35_ = Game.inBuffer
							.method210((byte) -6);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_35_, 65535);
					class12_sub12_sub3.anInt2114 = 3;
					class12_sub12_sub3.anInt2112 = Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass42_2954
							.method769((byte) 8);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 157) {
					Class49.anInt1157 = Game.inBuffer
							.readUByte();
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 2) {
					int i_36_ = Game.inBuffer
							.readUShortLEA();
					int i_37_ = Game.inBuffer
							.method215((byte) 94);
					int i_38_ = Game.inBuffer.readShort(-1);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_37_, arg0 + 65535);
					if ((i_36_ ^ 0xffffffff) == -65536) {
						class12_sub12_sub3.anInt2114 = 0;
						Class57.anInt1334 = -1;
						return true;
					}
					Class12_Sub12_Sub15 class12_sub12_sub15 = Class12_Sub12_Sub11_Sub5
							.method502((byte) 121, i_36_);
					class12_sub12_sub3.anInt2123 = class12_sub12_sub15.anInt2489;
					class12_sub12_sub3.anInt2139 = 100
							* class12_sub12_sub15.anInt2502 / i_38_;
					class12_sub12_sub3.anInt2112 = i_36_;
					class12_sub12_sub3.anInt2114 = 4;
					Class57.anInt1334 = -1;
					class12_sub12_sub3.anInt2147 = class12_sub12_sub15.anInt2470;
					return true;
				}
				if (Class57.anInt1334 == 6) {
					Class12_Sub12_Sub11_Sub2_Sub1.method456((byte) 75);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 63) {
					int i_39_ = Game.inBuffer
							.readUShortLEA();
					Class30.method692((byte) -102, i_39_);
					if (Class12_Sub12_Sub12.anInt2407 != -1) {
						Class62.method958(arg0 + -59,
								Class12_Sub12_Sub12.anInt2407);
						Class12_Sub12_Sub12.anInt2407 = -1;
						Class8.aBoolean182 = true;
					}
					if ((Class31.anInt756 ^ 0xffffffff) != 0) {
						Class62.method958(arg0 + -85, Class31.anInt756);
						Class31.anInt756 = -1;
						Class29.method686((byte) 67, 30);
					}
					if (anInt128 != -1) {
						Class62.method958(-105, anInt128);
						anInt128 = -1;
					}
					if (Class13.anInt343 != -1) {
						Class62.method958(-116, Class13.anInt343);
						Class13.anInt343 = -1;
					}
					if ((Class35.anInt860 ^ 0xffffffff) != (i_39_ ^ 0xffffffff)) {
						Class62.method958(-107, Class35.anInt860);
						Class35.anInt860 = i_39_;
					}
					Class12_Sub12_Sub16.aBoolean2559 = false;
					Class49.aBoolean1146 = true;
					if (Class1.anInt85 != 0) {
						Class8.aBoolean182 = true;
						Class1.anInt85 = 0;
					}
					Class12_Sub2.aBoolean1641 = true;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -243) {
					int i_40_ = Game.inBuffer.method236(arg0
							+ -12543);
					if ((i_40_ ^ 0xffffffff) == -65536)
						i_40_ = -1;
					int i_41_ = Game.inBuffer.getByteS(arg0
							+ -762);
					if (i_40_ != Class62_Sub2.anIntArray1907[i_41_]) {
						Class62.method958(-51,
								Class62_Sub2.anIntArray1907[i_41_]);
						Class62_Sub2.anIntArray1907[i_41_] = i_40_;
					}
					Class57.anInt1334 = -1;
					Class49.aBoolean1146 = true;
					Class12_Sub2.aBoolean1641 = true;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -253) {
					Class12_Sub1.anInt1617 = (Game.inBuffer
							.method236(-12543) * 30);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 26) {
					Class40.anInt949 = Game.inBuffer
							.readUByteA();
					Class19.anInt456 = Game.inBuffer
							.getByteS(-762);
							System.out.println("X: " + Class19.anInt456 +  " Y:" + Class40.anInt949);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 10) {
					int i_42_ = Game.inBuffer
							.method236(-12543);
					int i_43_ = Game.inBuffer
							.readUShortLEA();
					if (Class12_Sub12_Sub12.anInt2407 != -1) {
						Class62.method958(-71, Class12_Sub12_Sub12.anInt2407);
						Class8.aBoolean182 = true;
						Class12_Sub12_Sub12.anInt2407 = -1;
					}
					if (Class31.anInt756 != -1) {
						Class62.method958(-48, Class31.anInt756);
						Class31.anInt756 = -1;
						Class29.method686((byte) 67, 30);
					}
					if ((anInt128 ^ 0xffffffff) != 0) {
						Class62.method958(-114, anInt128);
						anInt128 = -1;
					}
					if (i_42_ != Class13.anInt343) {
						Class62.method958(-108, Class13.anInt343);
						Class13.anInt343 = i_42_;
					}
					if (i_43_ != Class35.anInt860) {
						Class62.method958(arg0 ^ ~0x45, Class35.anInt860);
						Class35.anInt860 = i_43_;
					}
					Class57.anInt1334 = -1;
					Class12_Sub2.aBoolean1641 = true;
					Class49.aBoolean1146 = true;
					if (Class1.anInt85 != 0) {
						Class8.aBoolean182 = true;
						Class1.anInt85 = 0;
					}
					Class12_Sub12_Sub16.aBoolean2559 = false;
					return true;
				}
				if (Class57.anInt1334 == 77) {
					int i_44_ = Game.inBuffer.readUIntLE();
					int i_45_ = Game.inBuffer.readShort(-1);
					int i_46_ = 0x1f & i_45_ >> -1061821622;
					int i_47_ = 0x1f & i_45_ >> -1313477499;
					int i_48_ = 0x1f & i_45_;
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_44_, 65535);
					class12_sub12_sub3.anInt2186 = ((i_48_ << 711959395)
							+ (i_47_ << -1505269013) + (i_46_ << -827443853));
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 13) {
					int i_49_ = Game.inBuffer.readUShortLE();
					int i_50_ = Game.inBuffer
							.method215((byte) 94);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_50_, 65535);
					Class57.anInt1334 = -1;
					if (class12_sub12_sub3 != null
							&& (class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -1) {
						if (i_49_ < 0)
							i_49_ = 0;
						if (((-class12_sub12_sub3.anInt2111 + class12_sub12_sub3.anInt2138) ^ 0xffffffff) > (i_49_ ^ 0xffffffff))
							i_49_ = (-class12_sub12_sub3.anInt2111 + class12_sub12_sub3.anInt2138);
						class12_sub12_sub3.anInt2143 = i_49_;
					}
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -123) {
					int i_51_ = Game.inBuffer.method238(true);
					System.out.println("top = "+i_51_);
					RSString class59 = Game.inBuffer
							.method246(20356);
					//System.out.println("name = "+class59);
					int i_52_ = Game.inBuffer
							.readUByteA();
					System.out.println("slot = "+i_52_);
					if (i_52_ >= 1 && i_52_ <= 5) {
						if (class59.method920(Class44.aClass59_1050,
								(byte) -122))
							class59 = null;
						RSApplet.aClass59Array8[-1 + i_52_] = class59;
						RuntimeException_Sub1.aBooleanArray1470[-1 + i_52_] = (i_51_ ^ 0xffffffff) == -1;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 139) {
					Class49.anInt1147 = Class5.anInt159 / 8;
					for (int i_53_ = 0; i_53_ < Class49.anInt1147; i_53_++)
						Class35.aLongArray859[i_53_] = Game.inBuffer
								.readLong(115);
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -175) {
					int i_54_ = Game.inBuffer
							.method236(-12543);
					int i_55_ = Game.inBuffer
							.method236(-12543);
					int i_56_ = Game.inBuffer
							.readUShortLEA();
					int i_57_ = Game.inBuffer.readUIntLE();
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_57_, arg0 ^ 0xffff);
					Class57.anInt1334 = -1;
					class12_sub12_sub3.anInt2139 = i_55_;
					class12_sub12_sub3.anInt2123 = i_56_;
					class12_sub12_sub3.anInt2147 = i_54_;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -16) {
					if ((Class35.anInt860 ^ 0xffffffff) != 0) {
						Class62.method958(-128, Class35.anInt860);
						Class35.anInt860 = -1;
						Class12_Sub2.aBoolean1641 = true;
						Class49.aBoolean1146 = true;
					}
					if (Class12_Sub12_Sub12.anInt2407 != -1) {
						Class62.method958(arg0 ^ ~0x7b,
								Class12_Sub12_Sub12.anInt2407);
						Class8.aBoolean182 = true;
						Class12_Sub12_Sub12.anInt2407 = -1;
					}
					if ((Class31.anInt756 ^ 0xffffffff) != 0) {
						Class62.method958(-73, Class31.anInt756);
						Class31.anInt756 = -1;
						Class29.method686((byte) 67, 30);
					}
					if (anInt128 != -1) {
						Class62.method958(arg0 ^ ~0x6a, anInt128);
						anInt128 = -1;
					}
					if (Class13.anInt343 != -1) {
						Class62.method958(-71, Class13.anInt343);
						Class13.anInt343 = -1;
					}
					if (Class1.anInt85 != 0) {
						Class1.anInt85 = 0;
						Class8.aBoolean182 = true;
					}
					Class12_Sub12_Sub16.aBoolean2559 = false;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -218) {
					Class31.anInt757 = Game.inBuffer
							.readUByte();
					Class12_Sub12_Sub3.anInt2154 = Game.inBuffer
							.readUByte();
					anInt138 = Game.inBuffer.readUByte();
					Statics.aBoolean2025 = true;
					Class8.aBoolean182 = true;
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 164) {
					int i_58_ = Game.inBuffer
							.method236(-12543);
					if ((i_58_ ^ 0xffffffff) == -65536)
						i_58_ = -1;
					if ((i_58_ ^ 0xffffffff) != 0
							|| Class12_Sub12_Sub11.anInt2386 != 0) {
						if (i_58_ != -1
								&& ((Class28.anInt672 ^ 0xffffffff) != (i_58_ ^ 0xffffffff))
								&& Class30.anInt744 != 0
								&& Class12_Sub12_Sub11.anInt2386 == 0)
							Class11.method140(
									(byte) 85,
									0,
									10,
									Class30.anInt744,
									false,
									0,
									i_58_,
									(Cache.midiSongsArchive));
					} else
						Class11.method137(false);
					Class28.anInt672 = i_58_;
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 182) {
					int i_59_ = Game.inBuffer
							.method240((byte) 1);
					int i_60_ = Game.inBuffer.readUShortLE();
					if ((i_60_ ^ 0xffffffff) == -65536)
						i_60_ = -1;
					if ((Class30.anInt744 ^ 0xffffffff) != -1
							&& (i_60_ ^ 0xffffffff) != 0) {
						Class11.method138(Class30.anInt744, i_60_,
								(Cache.midiJinglesArchive), 0, 1,
								(byte) -100, false);
						Class12_Sub12_Sub11.anInt2386 = i_59_;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 50) {
					Class7.anInt1530 = Game.inBuffer
							.readUShortLE();
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 161) {
					RSCanvas.anInt59 = Game.inBuffer
							.readUByte();
					Class49.aBoolean1146 = true;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -256) {
					Class49.aBoolean1146 = true;
					int i_61_ = Game.inBuffer
							.method207(-708753192);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_61_, arg0 + 65535);
					while (Game.inBuffer.position < Class5.anInt159) {
						int i_62_ = Game.inBuffer
								.method231(false);
						int i_63_ = Game.inBuffer
								.readShort(-1);
						int i_64_ = Game.inBuffer
								.readUByte();
						if (i_64_ == 255)
							i_64_ = Game.inBuffer
									.method207(-708753192);
						if (i_62_ >= 0
								&& (class12_sub12_sub3.anIntArray2140.length > i_62_)) {
							class12_sub12_sub3.anIntArray2140[i_62_] = i_63_;
							class12_sub12_sub3.anIntArray2149[i_62_] = i_64_;
						}
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 231) {
					int i_65_ = Game.inBuffer
							.method236(-12543);
					int i_66_ = Game.inBuffer
							.method207(-708753192);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_66_, arg0 + 65535);
					class12_sub12_sub3.anInt2114 = 2;
					class12_sub12_sub3.anInt2112 = i_65_;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -115) {
					int i_67_ = Game.inBuffer
							.method207(-708753192);
					Game.aSignlinkNode_1567 = Game.signlink.putNodeType3(
							i_67_);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 69) {
					Class49.aBoolean1146 = true;
					int i_68_ = Game.inBuffer
							.method207(-708753192);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_68_, arg0 + 65535);
					int i_69_ = Game.inBuffer.readShort(-1);
					for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > (i_69_ ^ 0xffffffff); i_70_++) {
						int i_71_ = Game.inBuffer
								.readUByte();
						if ((i_71_ ^ 0xffffffff) == -256)
							i_71_ = Game.inBuffer
									.method215((byte) 94);
						class12_sub12_sub3.anIntArray2140[i_70_] = Game.inBuffer
								.readUShortLE();
						class12_sub12_sub3.anIntArray2149[i_70_] = i_71_;
					}
					for (int i_72_ = i_69_; ((class12_sub12_sub3.anIntArray2140.length ^ 0xffffffff) < (i_72_ ^ 0xffffffff)); i_72_++) {
						class12_sub12_sub3.anIntArray2140[i_72_] = 0;
						class12_sub12_sub3.anIntArray2149[i_72_] = 0;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -184) {
					int i_73_ = Game.inBuffer
							.method210((byte) -6);
					RSString class59 = Game.inBuffer
							.method246(arg0 + 20356);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_73_, 65535);
					class12_sub12_sub3.aClass59_2130 = class59;
					if (i_73_ >> 601218672 == Class62_Sub2.anIntArray1907[Class15.anInt400])
						Class49.aBoolean1146 = true;
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -242) {
					Class12_Sub12_Sub13.anInt2431 = Game.inBuffer
							.readUByte();
					if ((Class12_Sub12_Sub13.anInt2431 ^ 0xffffffff) == -2)
						Class55.anInt1299 = Game.inBuffer
								.readShort(-1);
					if (Class12_Sub12_Sub13.anInt2431 >= 2
							&& ((Class12_Sub12_Sub13.anInt2431 ^ 0xffffffff) >= -7)) {
						if ((Class12_Sub12_Sub13.anInt2431 ^ 0xffffffff) == -3) {
							Class30.anInt736 = 64;
							Class26.anInt596 = 64;
						}
						if (Class12_Sub12_Sub13.anInt2431 == 3) {
							Class30.anInt736 = 64;
							Class26.anInt596 = 0;
						}
						if ((Class12_Sub12_Sub13.anInt2431 ^ 0xffffffff) == -5) {
							Class30.anInt736 = 64;
							Class26.anInt596 = 128;
						}
						if (Class12_Sub12_Sub13.anInt2431 == 5) {
							Class30.anInt736 = 0;
							Class26.anInt596 = 64;
						}
						if ((Class12_Sub12_Sub13.anInt2431 ^ 0xffffffff) == -7) {
							Class30.anInt736 = 128;
							Class26.anInt596 = 64;
						}
						Class12_Sub12_Sub13.anInt2431 = 2;
						Statics.anInt1834 = Game.inBuffer
								.readShort(-1);
						Class20.anInt475 = Game.inBuffer
								.readShort(-1);
						Class12_Sub12_Sub3.anInt2155 = Game.inBuffer
								.readUByte();
					}
					if (Class12_Sub12_Sub13.anInt2431 == 10)
						Class12_Sub12_Sub9.anInt2362 = Game.inBuffer
								.readShort(arg0 ^ 0xffffffff);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 88) {
					Class23.anInt499 = 0;
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 163) {
					int i_74_ = Game.inBuffer.method237(0);
					int i_75_ = Game.inBuffer
							.readUShortLEA();
					Class13.anIntArray356[i_75_] = i_74_;
					if ((i_74_ ^ 0xffffffff) != (Class12_Sub12_Sub12.anIntArray2414[i_75_] ^ 0xffffffff)) {
						Class12_Sub12_Sub12.anIntArray2414[i_75_] = i_74_;
						Class12_Sub12_Sub11_Sub2.method447(8, i_75_);
						Class49.aBoolean1146 = true;
						if (Class58.anInt1342 != -1)
							Class8.aBoolean182 = true;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 75) {
					RSString class59 = Game.inBuffer
							.method246(arg0 + 20356);
					if (class59.method914(Class12_Sub12_Sub14.aClass59_2462,
							-25730)) {
						RSString class59_76_ = (class59
								.method937(
										class59.method930(
												-2,
												(Class12_Sub12_Sub11_Sub2.aClass59_2704)),
										true, 0));
						long l = class59_76_.method912(126);
						boolean bool = false;
						for (int i_77_ = 0; i_77_ < Class49.anInt1147; i_77_++) {
							if (l == Class35.aLongArray859[i_77_]) {
								bool = true;
								break;
							}
						}
						if (!bool && RSCanvas.anInt46 == 0)
							Class12_Sub7.method190(class59_76_,
									(Class12_Sub12_Sub16.aClass59_2543), 4,
									false);
					} else if (!class59.method914(
							(Class12_Sub12_Sub3.aClass59_2168), arg0 ^ ~0x6481)) {
						if (!class59.method914(
								(Class12_Sub12_Sub11_Sub3.aClass59_2744),
								-25730))
							Class12_Sub7.method190(Class11.aClass59_310,
									class59, 0, false);
						else {
							RSString class59_78_ = (class59
									.method937(
											class59.method930(
													-2,
													(Class12_Sub12_Sub11_Sub2.aClass59_2704)),
											true, 0));
							long l = class59_78_.method912(114);
							boolean bool = false;
							for (int i_79_ = 0; Class49.anInt1147 > i_79_; i_79_++) {
								if ((l ^ 0xffffffffffffffffL) == (Class35.aLongArray859[i_79_] ^ 0xffffffffffffffffL)) {
									bool = true;
									break;
								}
							}
							if (!bool
									&& (RSCanvas.anInt46 ^ 0xffffffff) == -1) {
								RSString class59_80_ = (class59
										.method937(
												class59.length() - 9,
												true,
												1 + (class59
														.method930(
																-2,
																(Class12_Sub12_Sub11_Sub2.aClass59_2704)))));
								Class12_Sub7.method190(class59_78_,
										class59_80_, 8, false);
							}
						}
					} else {
						RSString class59_81_ = (class59
								.method937(
										class59.method930(
												-2,
												(Class12_Sub12_Sub11_Sub2.aClass59_2704)),
										true, 0));
						long l = class59_81_.method912(106);
						boolean bool = false;
						for (int i_82_ = 0; ((Class49.anInt1147 ^ 0xffffffff) < (i_82_ ^ 0xffffffff)); i_82_++) {
							if ((l ^ 0xffffffffffffffffL) == (Class35.aLongArray859[i_82_] ^ 0xffffffffffffffffL)) {
								bool = true;
								break;
							}
						}
						if (!bool && RSCanvas.anInt46 == 0)
							Class12_Sub7.method190(class59_81_,
									Class30.aClass59_726, 8, false);
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -139) {
					int i_83_ = Game.inBuffer
							.method212((byte) -58);
					if (i_83_ != Class58.anInt1342) {
						Class62.method958(arg0 ^ ~0x4e, Class58.anInt1342);
						Class58.anInt1342 = i_83_;
					}
					Class57.anInt1334 = -1;
					Class8.aBoolean182 = true;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -146) {
					int i_84_ = Game.inBuffer
							.method236(-12543);
					System.out.println("i_84_ = "+i_84_);
					int i_85_ = Game.inBuffer
							.method215((byte) 94);
					System.out.println("i_85_ = "+i_85_);
					Class13.anIntArray356[i_84_] = i_85_;
					if (Class12_Sub12_Sub12.anIntArray2414[i_84_] != i_85_) {
						Class12_Sub12_Sub12.anIntArray2414[i_84_] = i_85_;
						Class12_Sub12_Sub11_Sub2.method447(8, i_84_);
						if ((Class58.anInt1342 ^ 0xffffffff) != 0)
							Class8.aBoolean182 = true;
						Class49.aBoolean1146 = true;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 200) {
					long l = Game.inBuffer.readLong(7);
					long l_86_ = (long) Game.inBuffer
							.readShort(-1);
					long l_87_ = (long) Game.inBuffer
							.method233(16711680);
					int i_88_ = Game.inBuffer.readUByte();
					boolean bool = false;
					long l_89_ = (l_86_ << 1248514208) - -l_87_;
					for (int i_90_ = 0; i_90_ < 100; i_90_++) {
						if (Class5.aLongArray151[i_90_] == l_89_) {
							bool = true;
							break;
						}
					}
					if ((i_88_ ^ 0xffffffff) >= -2) {
						for (int i_91_ = 0; Class49.anInt1147 > i_91_; i_91_++) {
							if ((l ^ 0xffffffffffffffffL) == (Class35.aLongArray859[i_91_] ^ 0xffffffffffffffffL)) {
								bool = true;
								break;
							}
						}
					}
					if (!bool && RSCanvas.anInt46 == 0) {
						Class5.aLongArray151[Class12.anInt325] = l_89_;
						Class12.anInt325 = (Class12.anInt325 + 1) % 100;
						RSString class59 = Class12.method142(
								Game.inBuffer, arg0 ^ 0x7fff)
								.method946((byte) 39);
						if ((i_88_ ^ 0xffffffff) == -3
								|| (i_88_ ^ 0xffffffff) == -4)
							Class12_Sub7.method190((Statics.method251(
									(byte) -64, (new RSString[] {
											Class12_Sub12_Sub6.aClass59_2259,
											Class12_Sub12_Sub13
													.method524(-3, l)
													.toString(-14767) }))),
									class59, 7, false);
						else if ((i_88_ ^ 0xffffffff) == -2)
							Class12_Sub7
									.method190(
											(Statics
													.method251(
															(byte) -41,
															(new RSString[] {
																	Class12_Sub12_Sub16.aClass59_2542,
																	Class12_Sub12_Sub13
																			.method524(
																					-3,
																					l)
																			.toString(
																					arg0
																							^ ~0x39ae) }))),
											class59, 7, false);
						else
							Class12_Sub7.method190(Class12_Sub12_Sub13
									.method524(-3, l).toString(-14767),
									class59, 3, false);
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -216) {
					if (Class15.anInt400 == 12)
						Class49.aBoolean1146 = true;
					Class12_Sub12_Sub11_Sub1.anInt2649 = Game.inBuffer
							.method212((byte) -92);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 142) {
					int i_92_ = Game.inBuffer.readShort(-1);
					Class30.method692((byte) -99, i_92_);
					if ((Class35.anInt860 ^ 0xffffffff) != 0) {
						Class62.method958(arg0 + -64, Class35.anInt860);
						Class49.aBoolean1146 = true;
						Class35.anInt860 = -1;
						Class12_Sub2.aBoolean1641 = true;
					}
					if (Class12_Sub12_Sub12.anInt2407 != -1) {
						Class62.method958(-99, Class12_Sub12_Sub12.anInt2407);
						Class12_Sub12_Sub12.anInt2407 = -1;
						Class8.aBoolean182 = true;
					}
					if (Class31.anInt756 != -1) {
						Class62.method958(-113, Class31.anInt756);
						Class31.anInt756 = -1;
						Class29.method686((byte) 67, 30);
					}
					if (anInt128 != -1) {
						Class62.method958(-66, anInt128);
						anInt128 = -1;
					}
					if ((i_92_ ^ 0xffffffff) != (Class13.anInt343 ^ 0xffffffff)) {
						Class62.method958(arg0 ^ ~0x7d, Class13.anInt343);
						Class13.anInt343 = i_92_;
					}
					Class57.anInt1334 = -1;
					Class12_Sub12_Sub16.aBoolean2559 = false;
					if (Class1.anInt85 != 0) {
						Class8.aBoolean182 = true;
						Class1.anInt85 = 0;
					}
					return true;
				}
				if (Class57.anInt1334 == 127) {
					Class14.constructMapRegion(123, false);
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 169) {
					Class19.anInt456 = Game.inBuffer
							.method238(true);
					Class40.anInt949 = Game.inBuffer
							.readUByte();
					while ((Class5.anInt159 ^ 0xffffffff) < (Game.inBuffer.position ^ 0xffffffff)) {
						Class57.anInt1334 = Game.inBuffer
								.readUByte();
						Class42.method764(true);
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 11) {
					Class49.aBoolean1146 = true;
					int i_93_ = Game.inBuffer.readUByte();
					int i_94_ = Game.inBuffer
							.method215((byte) 94);
					int i_95_ = Game.inBuffer.getByteS(arg0
							+ -762);
					Class12.anIntArray323[i_95_] = i_94_;
					Class12_Sub12_Sub11_Sub2.anIntArray2688[i_95_] = i_93_;
					Game.anIntArray1574[i_95_] = 1;
					for (int i_96_ = 0; (i_96_ ^ 0xffffffff) > -99; i_96_++) {
						if ((i_94_ ^ 0xffffffff) <= (Class12_Sub12_Sub9.anIntArray2324[i_96_] ^ 0xffffffff))
							Game.anIntArray1574[i_95_] = i_96_ - -2;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if ((Class57.anInt1334 ^ 0xffffffff) == -254) {
					Class57.aBoolean1326 = true;
					Class42.anInt989 = Game.inBuffer
							.readUByte();
					Class29.anInt695 = Game.inBuffer
							.readUByte();
					Class12_Sub12_Sub12.anInt2400 = Game.inBuffer
							.readShort(-1);
					Class51.anInt1188 = Game.inBuffer
							.readUByte();
					Class64_Sub1.anInt1952 = Game.inBuffer
							.readUByte();
					if (Class64_Sub1.anInt1952 >= 100) {
						int i_97_ = Class29.anInt695 * 128 + 64;
						int i_98_ = 64 + 128 * Class42.anInt989;
						int i_99_ = (Class26.method658(i_98_, -6,
								RSString.anInt1504, i_97_) - Class12_Sub12_Sub12.anInt2400);
						int i_100_ = i_98_ - Class10.anInt250;
						int i_101_ = i_97_ - Class20.anInt464;
						int i_102_ = -Class57.anInt1339 + i_99_;
						int i_103_ = (int) Math
								.sqrt((double) (i_101_ * i_101_ + i_100_
										* i_100_));
						Statics.anInt2021 = (int) (Math.atan2(
								(double) i_102_, (double) i_103_) * 325.949) & 0x7ff;
						Class27.anInt645 = 0x7ff & (int) (Math.atan2(
								(double) i_100_, (double) i_101_) * -325.949);
						if (Statics.anInt2021 < 128)
							Statics.anInt2021 = 128;
						if ((Statics.anInt2021 ^ 0xffffffff) < -384)
							Statics.anInt2021 = 383;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 147) {
					Class1.anInt77 = Game.inBuffer
							.readUByte();
					Class57.anInt1334 = -1;
					return true;
				}
				if (Class57.anInt1334 == 197) {
					int i_104_ = Game.inBuffer
							.method210((byte) -6);
					Class12_Sub12_Sub3 class12_sub12_sub3 = Class62.method954(
							i_104_, 65535);
					for (int i_105_ = 0; class12_sub12_sub3.anIntArray2140.length > i_105_; i_105_++) {
						class12_sub12_sub3.anIntArray2140[i_105_] = -1;
						class12_sub12_sub3.anIntArray2140[i_105_] = 0;
					}
					Class57.anInt1334 = -1;
					return true;
				}
				Class12_Sub12_Sub15.method551(true, ("T1 - "
						+ Class57.anInt1334 + "," + Class29.anInt705 + ","
						+ Class47.anInt1103 + " - " + Class5.anInt159), null);
				Class12_Sub12_Sub8.method409(-88);
			} catch (java.io.IOException ioexception) {
				Class12_Sub1.method148(arg0 ^ 0x5306);
			} catch (Exception exception) {
				String string = ("T2 - "
						+ Class57.anInt1334
						+ ","
						+ Class29.anInt705
						+ ","
						+ Class47.anInt1103
						+ " - "
						+ Class5.anInt159
						+ ","
						+ (Class64.anInt1451 + (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0]))
						+ ","
						+ (Class8.anInt174 - -(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0])) + " - ");
				for (int i = 0; ((Class5.anInt159 ^ 0xffffffff) < (i ^ 0xffffffff) && (i ^ 0xffffffff) > -51); i++)
					string += (Game.inBuffer.payload[i] + ",");
				Class12_Sub12_Sub15.method551(true, string, exception);
				Class12_Sub12_Sub8.method409(-113);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ac.C(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub1 method70(int arg0) {
		try {
			anInt140++;
			Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = new Class12_Sub12_Sub7_Sub1();
			class12_sub12_sub7_sub1.anInt2575 = Class1.anInt81;
			class12_sub12_sub7_sub1.anInt2577 = Class12_Sub2.anInt1654;
			class12_sub12_sub7_sub1.anInt2580 = Class57.anIntArray1337[0];
			class12_sub12_sub7_sub1.anInt2576 = Class32.anIntArray778[0];
			class12_sub12_sub7_sub1.anInt2581 = Class55.anIntArray1313[0];
			class12_sub12_sub7_sub1.anInt2579 = Class44.anIntArray1027[0];
			int i = (class12_sub12_sub7_sub1.anInt2581 * class12_sub12_sub7_sub1.anInt2579);
			byte[] is = Class28.aByteArrayArray669[0];
			class12_sub12_sub7_sub1.anIntArray2578 = new int[i];
			for (int i_106_ = arg0; (i_106_ ^ 0xffffffff) > (i ^ 0xffffffff); i_106_++)
				class12_sub12_sub7_sub1.anIntArray2578[i_106_] = (Class15.anIntArray385[Class12_Sub12_Sub12
						.method519(255, is[i_106_])]);
			Class1.method46((byte) 116);
			return class12_sub12_sub7_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ac.B(" + arg0 + ')');
		}
	}

	public static int method71(Class12_Sub12_Sub3 arg0, int arg1, int arg2) {
		try {
			anInt126++;
			if (arg0.anIntArrayArray2170 == null
					|| arg2 >= arg0.anIntArrayArray2170.length)
				return -2;
			try {
				int[] is = arg0.anIntArrayArray2170[arg2];
				int i = 0;
				int i_107_ = 0;
				if (arg1 < 108)
					method70(123);
				int i_108_ = 0;
				for (;;) {
					int i_109_ = is[i_107_++];
					int i_110_ = 0;
					int i_111_ = 0;
					if (i_109_ == 0)
						return i;
					if (i_109_ == 1)
						i_110_ = (Class12_Sub12_Sub11_Sub2.anIntArray2688[is[i_107_++]]);
					if ((i_109_ ^ 0xffffffff) == -16)
						i_111_ = 1;
					if (i_109_ == 2)
						i_110_ = Game.anIntArray1574[is[i_107_++]];
					if ((i_109_ ^ 0xffffffff) == -4)
						i_110_ = Class12.anIntArray323[is[i_107_++]];
					if ((i_109_ ^ 0xffffffff) == -17)
						i_111_ = 2;
					if ((i_109_ ^ 0xffffffff) == -5) {
						int i_112_ = is[i_107_++] << 114091696;
						i_112_ += is[i_107_++];
						Class12_Sub12_Sub3 class12_sub12_sub3 = Class62
								.method954(i_112_, 65535);
						int i_113_ = is[i_107_++];
						if ((i_113_ ^ 0xffffffff) != 0
								&& (!(Class12_Sub12_Sub11_Sub5.method502(
										(byte) 121, i_113_).aBoolean2501) || Class12_Sub12_Sub11_Sub6.aBoolean2898)) {
							for (int i_114_ = 0; ((class12_sub12_sub3.anIntArray2140.length ^ 0xffffffff) < (i_114_ ^ 0xffffffff)); i_114_++) {
								if (i_113_ - -1 == (class12_sub12_sub3.anIntArray2140[i_114_]))
									i_110_ += (class12_sub12_sub3.anIntArray2149[i_114_]);
							}
						}
					}
					if (i_109_ == 5)
						i_110_ = Class12_Sub12_Sub12.anIntArray2414[is[i_107_++]];
					if ((i_109_ ^ 0xffffffff) == -18)
						i_111_ = 3;
					if (i_109_ == 6)
						i_110_ = (Class12_Sub12_Sub9.anIntArray2324[-1
								+ Game.anIntArray1574[is[i_107_++]]]);
					if ((i_109_ ^ 0xffffffff) == -8)
						i_110_ = 100 * (Class12_Sub12_Sub12.anIntArray2414[is[i_107_++]]) / 46875;
					if (i_109_ == 8)
						i_110_ = (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2955);
					if (i_109_ == 9) {
						for (int i_115_ = 0; i_115_ < 25; i_115_++) {
							if (Class31.aBooleanArray752[i_115_])
								i_110_ += Game.anIntArray1574[i_115_];
						}
					}
					if ((i_109_ ^ 0xffffffff) == -11) {
						int i_116_ = is[i_107_++] << -464181104;
						i_116_ += is[i_107_++];
						Class12_Sub12_Sub3 class12_sub12_sub3 = Class62
								.method954(i_116_, 65535);
						int i_117_ = is[i_107_++];
						if (i_117_ != -1
								&& (!(Class12_Sub12_Sub11_Sub5.method502(
										(byte) 121, i_117_).aBoolean2501) || Class12_Sub12_Sub11_Sub6.aBoolean2898)) {
							for (int i_118_ = 0; ((class12_sub12_sub3.anIntArray2140.length ^ 0xffffffff) < (i_118_ ^ 0xffffffff)); i_118_++) {
								if (i_117_ + 1 == (class12_sub12_sub3.anIntArray2140[i_118_])) {
									i_110_ = 999999999;
									break;
								}
							}
						}
					}
					if (i_109_ == 11)
						i_110_ = Class28.anInt665;
					if ((i_109_ ^ 0xffffffff) == -13)
						i_110_ = Class12_Sub12_Sub11_Sub1.anInt2649;
					if (i_109_ == 13) {
						int i_119_ = Class12_Sub12_Sub12.anIntArray2414[is[i_107_++]];
						int i_120_ = is[i_107_++];
						i_110_ = (1 << i_120_ & i_119_) == 0 ? 0 : 1;
					}
					if (i_109_ == 14) {
						int i_121_ = is[i_107_++];
						i_110_ = Class43.method777(9, i_121_);
					}
					if ((i_109_ ^ 0xffffffff) == -19)
						i_110_ = (Class64.anInt1451 + ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) >> 343890215));
					if (i_109_ == 19)
						i_110_ = ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) >> 8720103)
								+ Class8.anInt174;
					if (i_109_ == 20)
						i_110_ = is[i_107_++];
					if (i_111_ == 0) {
						if (i_108_ == 0)
							i += i_110_;
						if ((i_108_ ^ 0xffffffff) == -2)
							i -= i_110_;
						if (i_108_ == 2 && i_110_ != 0)
							i /= i_110_;
						if ((i_108_ ^ 0xffffffff) == -4)
							i *= i_110_;
						i_108_ = 0;
					} else
						i_108_ = i_111_;
				}
			} catch (Exception exception) {
				return -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ac.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static void method72(boolean arg0) {
		aClass59_136 = null;
		aClass59_143 = null;
		aClass59_139 = null;
		aClass59_125 = null;
		aClass12_Sub12_Sub7_Sub2_124 = null;
		aClass59_142 = null;
		aClass59_132 = null;
		aClass59_141 = null;
		if (arg0 != true)
			aClass59_132 = null;
	}

	public static void method73(byte arg0, Component arg1) {
		try {
			try {
				Method method = Signlink.setFocusTraversalKeysEnabled;
				if (method != null)
					method.invoke(arg1, new Object[] { Boolean.FALSE });
			} catch (Throwable throwable) {
				/* empty */
			}
			arg1.addKeyListener(Class35.aClass49_837);
			int i = 49 % ((arg0 - 5) / 43);
			arg1.addFocusListener(Class35.aClass49_837);
			anInt137++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ac.A(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass59_132 = Class55.method898("backvmid3", -10983);
		anInt144 = 0;
		anInt138 = 0;
		anInt128 = -1;
		aClass59_143 = Class55.method898("shake:", -10983);
		aClass59_141 = aClass59_139;
		aClass59_142 = aClass59_136;
		aClass59_125 = aClass59_143;
	}
}
