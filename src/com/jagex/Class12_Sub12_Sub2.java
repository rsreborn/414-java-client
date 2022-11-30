package com.jagex;/* com.jagex.Class12_Sub12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.io.Buffer;
import com.jagex.util.Statics;

import java.awt.Graphics;

public class Class12_Sub12_Sub2 extends Class12_Sub12 {
	public static int anInt2057;
	public int anInt2058;
	public static int anInt2059;
	public int anInt2060;
	public static int anInt2061;
	public int anInt2062;
	public int[] anIntArray2063;
	public int anInt2064 = 128;
	public static int anInt2065;
	public static int anInt2066;
	public static RSString aClass59_2067;
	public int anInt2068;
	public int anInt2069;
	public static int anInt2070;
	public static int anInt2071;
	public RSString[] aClass59Array2072;
	public static int anInt2073;
	public boolean aBoolean2074;
	public static int anInt2075;
	public int[] anIntArray2076;
	public int anInt2077;
	public static int anInt2078 = 1;
	public boolean aBoolean2079;
	public int anInt2080;
	public static RSString aClass59_2081;
	public boolean aBoolean2082;
	public int[] anIntArray2083;
	public static int anInt2084;
	public int anInt2085;
	public int anInt2086;
	public static RSString aClass59_2087;
	public int anInt2088;
	public static RSString aClass59_2089 = Class55.method898("Login", -10983);
	public static int anInt2090;
	public RSString aClass59_2091;
	public int anInt2092;
	public int anInt2093;
	public static int anInt2094;
	public static int anInt2095;
	public int anInt2096;
	public int anInt2097;
	public static int anInt2098;
	public static int anInt2099;
	public int anInt2100;
	public int[] anIntArray2101;
	public static int anInt2102;
	public int[] anIntArray2103;
	public static int anInt2104;
	public static int anInt2105;

	public Class12_Sub12_Sub11_Sub4 method283(Class12_Sub12_Sub4 arg0,
			int arg1, Class12_Sub12_Sub4 arg2, int arg3, int arg4) {
		try {
			anInt2095++;
			if (anIntArray2063 != null) {
				Class12_Sub12_Sub2 class12_sub12_sub2 = method287((byte) 2);
				if (class12_sub12_sub2 == null)
					return null;
				return class12_sub12_sub2.method283(arg0, arg1, arg2, -9500,
						arg4);
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) Statics.aClass27_1785
					.method673(126, (long) anInt2086));
			if (arg3 != -9500)
				anInt2100 = -3;
			if (class12_sub12_sub11_sub4 == null) {
				boolean bool = false;
				for (int i = 0; (anIntArray2076.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
					if (!Class9.aClass26_210
							.method646(anIntArray2076[i], -1, 0))
						bool = true;
				}
				if (bool)
					return null;
				Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = new Class12_Sub12_Sub11_Sub4[anIntArray2076.length];
				for (int i = 0; i < anIntArray2076.length; i++)
					class12_sub12_sub11_sub4s[i] = Class12_Sub12_Sub11_Sub4
							.method496((Class9.aClass26_210),
									anIntArray2076[i], 0);
				if (class12_sub12_sub11_sub4s.length == 1)
					class12_sub12_sub11_sub4 = class12_sub12_sub11_sub4s[0];
				else
					class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
							class12_sub12_sub11_sub4s,
							class12_sub12_sub11_sub4s.length));
				if (anIntArray2083 != null) {
					for (int i = 0; i < anIntArray2083.length; i++)
						class12_sub12_sub11_sub4.method489(anIntArray2083[i],
								anIntArray2103[i]);
				}
				class12_sub12_sub11_sub4.method471();
				class12_sub12_sub11_sub4.method485(64 + anInt2093,
						850 + anInt2085, -30, -50, -30, true);
				Statics.aClass27_1785.method678((byte) 123,
						class12_sub12_sub11_sub4, (long) anInt2086);
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_0_;
			if (arg2 == null || arg0 == null) {
				if (arg2 == null) {
					if (arg0 != null)
						class12_sub12_sub11_sub4_0_ = arg0.method305(arg1,
								class12_sub12_sub11_sub4, arg3 ^ ~0x65d9);
					else
						class12_sub12_sub11_sub4_0_ = class12_sub12_sub11_sub4
								.method498(true);
				} else
					class12_sub12_sub11_sub4_0_ = arg2.method305(arg4,
							class12_sub12_sub11_sub4, 16578);
			} else
				class12_sub12_sub11_sub4_0_ = arg2.method309(arg4,
						class12_sub12_sub11_sub4, arg1, 1506013200, arg0);
			if (anInt2064 != 128 || (anInt2096 ^ 0xffffffff) != -129)
				class12_sub12_sub11_sub4_0_.method477(anInt2064, anInt2096,
						anInt2064);
			return class12_sub12_sub11_sub4_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cc.L("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ')'));
		}
	}

	public void method284(byte arg0, Buffer arg1) {
		try {
			anInt2071++;
			if (arg0 >= -7)
				method294(82);
			for (;;) {
				int i = arg1.readUByte();
				if ((i ^ 0xffffffff) == -1)
					break;
				method293(i, arg1, -9438);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cc.E(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public boolean method285(int arg0) {
		try {
			anInt2104++;
			if (anIntArray2063 == null)
				return true;
			int i = -1;
			if ((anInt2060 ^ 0xffffffff) != 0)
				i = Class43.method777(9, anInt2060);
			else if (anInt2062 != -1)
				i = Class12_Sub12_Sub12.anIntArray2414[anInt2062];
			if (arg0 < (i ^ 0xffffffff)
					|| (anIntArray2063.length ^ 0xffffffff) >= (i ^ 0xffffffff)
					|| anIntArray2063[i] == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cc.A(" + arg0 + ')');
		}
	}

	public static int method286(int arg0, int arg1, int arg2) {
		try {
			anInt2098++;
			if ((arg2 ^ 0xffffffff) == 0)
				return 12345678;
			arg1 = (0x7f & arg2) * arg1 / 128;
			if (arg0 != 31920)
				return 7;
			if (arg1 >= 2) {
				if ((arg1 ^ 0xffffffff) < -127)
					arg1 = 126;
			} else
				arg1 = 2;
			return (arg2 & 0xff80) + arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cc.G(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public Class12_Sub12_Sub2 method287(byte arg0) {
		try {
			if (arg0 != 2)
				method294(-88);
			int i = -1;
			anInt2075++;
			if ((anInt2060 ^ 0xffffffff) != 0)
				i = Class43.method777(9, anInt2060);
			else if (anInt2062 != -1)
				i = Class12_Sub12_Sub12.anIntArray2414[anInt2062];
			if ((i ^ 0xffffffff) > -1 || i >= anIntArray2063.length
					|| (anIntArray2063[i] ^ 0xffffffff) == 0)
				return null;
			return Class31.method701((byte) 63, anIntArray2063[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cc.K(" + arg0 + ')');
		}
	}

	public static void method288(int arg0, int arg1, int arg2, byte arg3,
			Class12_Sub12_Sub7_Sub4 arg4) {
		Class15.aClass62_386.method960(-1);
		Class28.aClass12_Sub12_Sub7_Sub2_680.method370(0, 0);
		arg4.method395(Class12_Sub9.aClass59_1759, 55, 28, 16777215, true);
		if (arg2 == 0)
			arg4.method395(Archive.aClass59_1889, 55, 41, 65280, true);
		if (arg2 == 1)
			arg4.method395(Class38.aClass59_922, 55, 41, 16776960, true);
		anInt2059++;
		if (arg2 == 2)
			arg4.method395(Class62.aClass59_1386, 55, 41, 16711680, true);
		if (arg2 == 3)
			arg4.method395(Class14.aClass59_374, 55, 41, 65535, true);
		arg4.method395(Class12.aClass59_320, 184, 28, 16777215, true);
		if ((arg1 ^ 0xffffffff) == -1)
			arg4.method395(Archive.aClass59_1889, 184, 41, 65280, true);
		if (arg1 == 1)
			arg4.method395(Class38.aClass59_922, 184, 41, 16776960, true);
		if (arg1 == 2)
			arg4.method395(Class62.aClass59_1386, 184, 41, 16711680, true);
		arg4.method395(Statics.aClass59_564, 324, 28, 16777215, true);
		if ((arg0 ^ 0xffffffff) == -1)
			arg4.method395(Archive.aClass59_1889, 324, 41, 65280, true);
		if (arg0 == 1)
			arg4.method395(Class38.aClass59_922, 324, 41, 16776960, true);
		if (arg0 == 2)
			arg4.method395(Class62.aClass59_1386, 324, 41, 16711680, true);
		arg4.method395(Class28.aClass59_683, 458, 33, 16777215, true);
		do {
			try {
				Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
						.getGraphics();
				Class15.aClass62_386.method957(-5917, 453, 0, graphics);
				if (arg3 >= 69)
					break;
				anInt2094 = 64;
			} catch (Exception exception) {
				Class12_Sub12_Sub5.aCanvas2243.repaint();
				break;
			}
			break;
		} while (false);
	}

	public static void method289(boolean arg0) {
		try {
			anInt2070++;
			int i = (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691 - -Class62_Sub2.anInt1927);
			int i_1_ = (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683 - -Class30.anInt728);
			if (Class21.anInt486 + -i < -500 || Class21.anInt486 + -i > 500
					|| (-i_1_ + Class15.anInt401 ^ 0xffffffff) > 499
					|| (Class15.anInt401 - i_1_ ^ 0xffffffff) < -501) {
				Class15.anInt401 = i_1_;
				Class21.anInt486 = i;
			}
			if (arg0 == false) {
				if (Class21.anInt486 != i)
					Class21.anInt486 += (i - Class21.anInt486) / 16;
				if ((i_1_ ^ 0xffffffff) != (Class15.anInt401 ^ 0xffffffff))
					Class15.anInt401 += (i_1_ - Class15.anInt401) / 16;
				if (Class12_Sub1.aBooleanArray1627[96])
					Class28.anInt677 += (-Class28.anInt677 + -24) / 2;
				else if (!Class12_Sub1.aBooleanArray1627[97])
					Class28.anInt677 /= 2;
				else
					Class28.anInt677 += (-Class28.anInt677 + 24) / 2;
				int i_2_ = Class21.anInt486 >> -1534154073;
				int i_3_ = 0;
				int i_4_ = Class15.anInt401 >> -691841113;
				if (!Class12_Sub1.aBooleanArray1627[98]) {
					if (!Class12_Sub1.aBooleanArray1627[99])
						Class12_Sub4.anInt1675 /= 2;
					else
						Class12_Sub4.anInt1675 += (-12 + -Class12_Sub4.anInt1675) / 2;
				} else
					Class12_Sub4.anInt1675 += (-Class12_Sub4.anInt1675 + 12) / 2;
				Class12_Sub12_Sub13.anInt2441 += Class12_Sub4.anInt1675 / 2;
				Class48.anInt1127 = Class48.anInt1127 + Class28.anInt677 / 2
						& 0x7ff;
				if ((Class12_Sub12_Sub13.anInt2441 ^ 0xffffffff) > -129)
					Class12_Sub12_Sub13.anInt2441 = 128;
				if ((Class12_Sub12_Sub13.anInt2441 ^ 0xffffffff) < -384)
					Class12_Sub12_Sub13.anInt2441 = 383;
				int i_5_ = Class26.method658(Class21.anInt486, -6,
						RSString.anInt1504, Class15.anInt401);
				if (i_2_ > 3 && i_4_ > 3 && i_2_ < 100
						&& (i_4_ ^ 0xffffffff) > -101) {
					for (int i_6_ = -4 + i_2_; (i_6_ ^ 0xffffffff) >= (i_2_
							- -4 ^ 0xffffffff); i_6_++) {
						for (int i_7_ = -4 + i_4_; (i_4_ - -4 ^ 0xffffffff) <= (i_7_ ^ 0xffffffff); i_7_++) {
							int i_8_ = RSString.anInt1504;
							if ((i_8_ ^ 0xffffffff) > -4
									&& ((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][i_6_][i_7_]) & 0x2) == 2)
								i_8_++;
							int i_9_ = (-(Statics.anIntArrayArrayArray569[i_8_][i_6_][i_7_]) + i_5_);
							if (i_9_ > i_3_)
								i_3_ = i_9_;
						}
					}
				}
				int i_10_ = 192 * i_3_;
				if ((i_10_ ^ 0xffffffff) < -98049)
					i_10_ = 98048;
				if (i_10_ < 32768)
					i_10_ = 32768;
				if ((i_10_ ^ 0xffffffff) >= (Class10.anInt248 ^ 0xffffffff)) {
					if ((Class10.anInt248 ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
						Class10.anInt248 += (-Class10.anInt248 + i_10_) / 80;
				} else
					Class10.anInt248 += (i_10_ + -Class10.anInt248) / 24;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cc.H(" + arg0 + ')');
		}
	}

	public void method290(int arg0) {
		try {
			int i = -62 / ((arg0 - 40) / 35);
			anInt2065++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cc.J(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method291(int arg0) {
		try {
			anInt2061++;
			if (anIntArray2063 != null) {
				Class12_Sub12_Sub2 class12_sub12_sub2 = method287((byte) 2);
				if (class12_sub12_sub2 == null)
					return null;
				return class12_sub12_sub2.method291(0);
			}
			if (anIntArray2101 == null)
				return null;
			boolean bool = false;
			for (int i = arg0; i < anIntArray2101.length; i++) {
				if (!Class9.aClass26_210.method646(anIntArray2101[i],
						arg0 + -1, 0))
					bool = true;
			}
			if (bool)
				return null;
			Class12_Sub12_Sub11_Sub4[] class12_sub12_sub11_sub4s = new Class12_Sub12_Sub11_Sub4[anIntArray2101.length];
			for (int i = 0; anIntArray2101.length > i; i++)
				class12_sub12_sub11_sub4s[i] = Class12_Sub12_Sub11_Sub4
						.method496(Class9.aClass26_210, anIntArray2101[i], 0);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4;
			if (class12_sub12_sub11_sub4s.length != 1)
				class12_sub12_sub11_sub4 = (new Class12_Sub12_Sub11_Sub4(
						class12_sub12_sub11_sub4s,
						class12_sub12_sub11_sub4s.length));
			else
				class12_sub12_sub11_sub4 = class12_sub12_sub11_sub4s[0];
			if (anIntArray2083 != null) {
				for (int i = 0; (anIntArray2083.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
					class12_sub12_sub11_sub4.method489(anIntArray2083[i],
							anIntArray2103[i]);
			}
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cc.B(" + arg0 + ')');
		}
	}

	public static int method292(int arg0, Class26 arg1) {
		try {
			anInt2090++;
			if (arg0 != 100)
				aClass59_2087 = null;
			int i = 0;
			if (arg1.method652(RSString.aClass59_1524,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class12_Sub12_Sub9.aClass59_2358,
					Class12_Sub1.aClass59_1620, arg0 + -101))
				i++;
			if (arg1.method652(Class47.aClass59_1113,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class39.aClass59_942,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class47.aClass59_1108,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class27.aClass59_658,
					Class12_Sub1.aClass59_1620, arg0 ^ ~0x64))
				i++;
			if (arg1.method652(Class27.aClass59_660,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class36.aClass59_875,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class17.aClass59_411,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class51.aClass59_1191,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(RSCanvas.aClass59_53,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Statics.aClass59_549,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class14.aClass59_375,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class4.aClass59_132, Class12_Sub1.aClass59_1620,
					-1))
				i++;
			if (arg1.method652(Class12_Sub12_Sub11_Sub3.aClass59_2735,
					Class12_Sub1.aClass59_1620, arg0 + -101))
				i++;
			if (arg1.method652(Class12_Sub12_Sub1.aClass59_2037,
					Class12_Sub1.aClass59_1620, arg0 + -101))
				i++;
			if (arg1.method652(Class12_Sub12_Sub16.aClass59_2541,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class12_Sub12_Sub15.aClass59_2527,
					Class12_Sub1.aClass59_1620, -1))
				i++;
			if (arg1.method652(Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2926,
					Class12_Sub1.aClass59_1620, arg0 ^ ~0x64))
				i++;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cc.I(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method293(int arg0, Buffer arg1, int arg2) {
		try {
			anInt2057++;
			if (arg2 != -9438)
				anInt2058 = 111;
			if (arg0 != 1) {
				if ((arg0 ^ 0xffffffff) == -3)
					aClass59_2091 = arg1.method246(20356);
				else if (arg0 == 12)
					anInt2097 = arg1.readUByte();
				else if (arg0 == 13)
					anInt2077 = arg1.readShortBE();
				else if ((arg0 ^ 0xffffffff) == -15)
					anInt2100 = arg1.readShortBE();
				else if (arg0 != 17) {
					if (arg0 >= 30 && arg0 < 35) {
						aClass59Array2072[arg0 - 30] = arg1
								.method246(arg2 + 29794);
						if (aClass59Array2072[-30 + arg0].method920(
								Class63.aClass59_1424, (byte) -102))
							aClass59Array2072[arg0 - 30] = null;
					} else if ((arg0 ^ 0xffffffff) != -41) {
						if ((arg0 ^ 0xffffffff) != -61) {
							if ((arg0 ^ 0xffffffff) != -94) {
								if (arg0 != 95) {
									if (arg0 == 97)
										anInt2064 = arg1.readShortBE();
									else if (arg0 == 98)
										anInt2096 = arg1.readShortBE();
									else if ((arg0 ^ 0xffffffff) != -100) {
										if (arg0 == 100)
											anInt2093 = arg1.readByte(true);
										else if ((arg0 ^ 0xffffffff) == -102)
											anInt2085 = 5 * arg1
													.readByte(true);
										else if (arg0 == 102)
											anInt2069 = arg1.readShortBE();
										else if ((arg0 ^ 0xffffffff) == -104)
											anInt2068 = arg1
													.readShortBE();
										else if (arg0 == 106) {
											anInt2060 = arg1.readShortBE();
											if (anInt2060 == 65535)
												anInt2060 = -1;
											anInt2062 = arg1.readShortBE();
											if (anInt2062 == 65535)
												anInt2062 = -1;
											int i = arg1.readUByte();
											anIntArray2063 = new int[i + 1];
											for (int i_11_ = 0; i >= i_11_; i_11_++) {
												anIntArray2063[i_11_] = arg1
														.readShortBE();
												if (anIntArray2063[i_11_] == 65535)
													anIntArray2063[i_11_] = -1;
											}
										} else if (arg0 == 107)
											aBoolean2074 = false;
									} else
										aBoolean2079 = true;
								} else
									anInt2088 = arg1.readShortBE();
							} else
								aBoolean2082 = false;
						} else {
							int i = arg1.readUByte();
							anIntArray2101 = new int[i];
							for (int i_12_ = 0; i > i_12_; i_12_++)
								anIntArray2101[i_12_] = arg1.readShortBE();
						}
					} else {
						int i = arg1.readUByte();
						anIntArray2103 = new int[i];
						anIntArray2083 = new int[i];
						for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i ^ 0xffffffff); i_13_++) {
							anIntArray2083[i_13_] = arg1.readShortBE();
							anIntArray2103[i_13_] = arg1.readShortBE();
						}
					}
				} else {
					anInt2100 = arg1.readShortBE();
					anInt2080 = arg1.readShortBE();
					anInt2058 = arg1.readShortBE();
					anInt2092 = arg1.readShortBE();
				}
			} else {
				int i = arg1.readUByte();
				anIntArray2076 = new int[i];
				for (int i_14_ = 0; i_14_ < i; i_14_++)
					anIntArray2076[i_14_] = arg1.readShortBE();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cc.D(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public static void method294(int arg0) {
		try {
			if (arg0 != 21218)
				method286(-47, -13, 106);
			aClass59_2067 = null;
			aClass59_2081 = null;
			aClass59_2089 = null;
			aClass59_2087 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cc.F(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub2() {
		anInt2062 = -1;
		aBoolean2074 = true;
		anInt2077 = -1;
		aClass59Array2072 = new RSString[5];
		aBoolean2079 = false;
		anInt2058 = -1;
		anInt2060 = -1;
		anInt2085 = 0;
		anInt2093 = 0;
		anInt2088 = -1;
		anInt2069 = -1;
		anInt2096 = 128;
		anInt2068 = 32;
		anInt2100 = -1;
		aBoolean2082 = true;
		anInt2097 = 1;
		anInt2080 = -1;
		aClass59_2091 = Class32.aClass59_777;
		anInt2092 = -1;
	}

	static {
		aClass59_2081 = (Class55.method898(
				"Please subscribe)1 or use a different world)3", -10983));
		aClass59_2067 = aClass59_2081;
		anInt2094 = 0;
		aClass59_2087 = aClass59_2089;
	}
}
