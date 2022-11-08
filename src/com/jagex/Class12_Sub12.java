package com.jagex;/* com.jagex.Class12_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

public class Class12_Sub12 extends Class12 {
	public static int anInt1838;
	public static int anInt1839 = 2;
	public static int anInt1840;
	public static int anInt1841;
	public static int anInt1842;
	public static int anInt1844;
	public static int anInt1845;
	public static int anInt1846;
	public static int anInt1847;
	public Class12_Sub12 aClass12_Sub12_1848;
	public static RSString aClass59_1849;
	public Class12_Sub12 aClass12_Sub12_1850;
	public static RSString aClass59_1851 = Class55.method898(
			" is already on your ignore list", -10983);
	public static Class26 aClass26_1852;
	public static int anInt1853;
	public static int anInt1854;

	public void method268(boolean arg0) {
		try {
			anInt1854++;
			if (aClass12_Sub12_1850 != null) {
				aClass12_Sub12_1850.aClass12_Sub12_1848 = aClass12_Sub12_1848;
				aClass12_Sub12_1848.aClass12_Sub12_1850 = aClass12_Sub12_1850;
				if (arg0 == true) {
					aClass12_Sub12_1850 = null;
					aClass12_Sub12_1848 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "v.HB(" + arg0 + ')');
		}
	}

	public static void method269(int arg0) {
		try {
			Class55.method894(109);
			anInt1841++;
			if (Class1.anInt77 == 2) {
				int[] is = Class12_Sub12_Sub7.anIntArray2281;
				byte[] is_0_ = Class61.aClass12_Sub12_Sub7_Sub2_1365.aByteArray2588;
				int i = is_0_.length;
				for (int i_1_ = 0; i > i_1_; i_1_++) {
					if (is_0_[i_1_] == 0)
						is[i_1_] = 0;
				}
				Class31.aClass12_Sub12_Sub7_Sub1_758.method363(0, 0, 33, 33,
						25, 25, Class48.anInt1127, 256, Class42.anIntArray985,
						Game.anIntArray1555);
				Class41.method756((byte) -54);
			} else {
				int i = Class35.anInt842 + Class48.anInt1127 & 0x7ff;
				int i_2_ = ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32 + 48);
				int i_3_ = 464 + -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / arg0);
				Class31.aClass12_Sub12_Sub7_Sub1_753.method363(25, 5, 146, 151,
						i_2_, i_3_, i, Class15.anInt384 + 256,
						RSSocket.anIntArray524, Class49.anIntArray1144);
				Class31.aClass12_Sub12_Sub7_Sub1_758.method363(0, 0, 33, 33,
						25, 25, Class48.anInt1127, 256, Class42.anIntArray985,
						Game.anIntArray1555);
				for (int i_4_ = 0; i_4_ < Class4.anInt144; i_4_++) {
					i_3_ = (4 * Class20.anIntArray479[i_4_] - (-2 - -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32)));
					i_2_ = (4 * Class62_Sub2.anIntArray1929[i_4_] - -2 + -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32));
					Class27.method679(i_2_, (byte) -99,
							(Class32.aClass12_Sub12_Sub7_Sub1Array780[i_4_]),
							i_3_);
				}
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -105; i_5_++) {
					for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -105; i_6_++) {
						Class8 class8 = (Class9_Sub2.aClass8ArrayArrayArray1584[RSString.anInt1504][i_5_][i_6_]);
						if (class8 != null) {
							i_3_ = -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32)
									+ i_6_ * 4 - -2;
							i_2_ = (4 * i_5_ + 2 - (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32);
							Class27.method679(
									i_2_,
									(byte) -58,
									Game.aClass12_Sub12_Sub7_Sub1Array1575[0],
									i_3_);
						}
					}
				}
				for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (Class62_Sub2.anInt1916 ^ 0xffffffff)); i_7_++) {
					Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[Class1.anIntArray76[i_7_]]);
					if (class12_sub12_sub11_sub2_sub1 != null
							&& class12_sub12_sub11_sub2_sub1
									.method452(-251272184)) {
						Class12_Sub12_Sub2 class12_sub12_sub2 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923);
						if (class12_sub12_sub2.anIntArray2063 != null)
							class12_sub12_sub2 = class12_sub12_sub2
									.method287((byte) 2);
						if (class12_sub12_sub2 != null
								&& class12_sub12_sub2.aBoolean2082
								&& class12_sub12_sub2.aBoolean2074) {
							i_2_ = (class12_sub12_sub11_sub2_sub1.anInt2691 / 32 - (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32);
							i_3_ = (class12_sub12_sub11_sub2_sub1.anInt2683 / 32 - (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32);
							Class27.method679(
									i_2_,
									(byte) -123,
									Game.aClass12_Sub12_Sub7_Sub1Array1575[1],
									i_3_);
						}
					}
				}
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (Class9.anInt203 ^ 0xffffffff); i_8_++) {
					Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[Class36.anIntArray888[i_8_]]);
					if (class12_sub12_sub11_sub2_sub2 != null
							&& class12_sub12_sub11_sub2_sub2.method452(arg0
									^ ~0xefa1bd7)) {
						i_2_ = (-((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32) + class12_sub12_sub11_sub2_sub2.anInt2691 / 32);
						i_3_ = (-((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32) + class12_sub12_sub11_sub2_sub2.anInt2683 / 32);
						boolean bool = false;
						long l = class12_sub12_sub11_sub2_sub2.aClass59_2951
								.method912(arg0 + 80);
						for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (Class7.anInt1540 ^ 0xffffffff)); i_9_++) {
							if (l == Class47.aLongArray1099[i_9_]
									&& (Class12_Sub12_Sub4.anIntArray2227[i_9_] != 0)) {
								bool = true;
								break;
							}
						}
						boolean bool_10_ = false;
						if ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2962) != 0
								&& (class12_sub12_sub11_sub2_sub2.anInt2962 ^ 0xffffffff) != -1
								&& (((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2962) ^ 0xffffffff) == (class12_sub12_sub11_sub2_sub2.anInt2962 ^ 0xffffffff)))
							bool_10_ = true;
						if (!bool) {
							if (!bool_10_)
								Class27.method679(
										i_2_,
										(byte) -73,
										(Game.aClass12_Sub12_Sub7_Sub1Array1575[2]),
										i_3_);
							else
								Class27.method679(
										i_2_,
										(byte) -108,
										(Game.aClass12_Sub12_Sub7_Sub1Array1575[4]),
										i_3_);
						} else
							Class27.method679(
									i_2_,
									(byte) -98,
									Game.aClass12_Sub12_Sub7_Sub1Array1575[3],
									i_3_);
					}
				}
				if ((Class12_Sub12_Sub13.anInt2431 ^ 0xffffffff) != -1
						&& Class64_Sub2.anInt1968 % 20 < 10) {
					if ((Class12_Sub12_Sub13.anInt2431 ^ 0xffffffff) == -2
							&& Class55.anInt1299 >= 0
							&& ((Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531).length > Class55.anInt1299)) {
						Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[Class55.anInt1299]);
						if (class12_sub12_sub11_sub2_sub1 != null) {
							i_2_ = (-((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32) + (class12_sub12_sub11_sub2_sub1.anInt2691 / 32));
							i_3_ = (class12_sub12_sub11_sub2_sub1.anInt2683 / 32 - (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32);
							Class56.method903(
									-12199,
									i_2_,
									Class29.aClass12_Sub12_Sub7_Sub1Array717[1],
									i_3_);
						}
					}
					if (Class12_Sub12_Sub13.anInt2431 == 2) {
						i_3_ = (-((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32) + 2 + 4 * (-Class8.anInt174 + Class20.anInt475));
						i_2_ = (2 + (Statics.anInt1834 - Class64.anInt1451) * 4 + -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32));
						Class56.method903(-12199, i_2_,
								(Class29.aClass12_Sub12_Sub7_Sub1Array717[1]),
								i_3_);
					}
					if (Class12_Sub12_Sub13.anInt2431 == 10
							&& (Class12_Sub12_Sub9.anInt2362 ^ 0xffffffff) <= -1
							&& ((Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398).length > Class12_Sub12_Sub9.anInt2362)) {
						Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[Class12_Sub12_Sub9.anInt2362]);
						if (class12_sub12_sub11_sub2_sub2 != null) {
							i_3_ = (class12_sub12_sub11_sub2_sub2.anInt2683 / 32 + -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32));
							i_2_ = (class12_sub12_sub11_sub2_sub2.anInt2691 / 32 + -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32));
							Class56.method903(
									arg0 + -12231,
									i_2_,
									Class29.aClass12_Sub12_Sub7_Sub1Array717[1],
									i_3_);
						}
					}
				}
				if (Class23.anInt499 != 0) {
					i_3_ = -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) / 32)
							+ 4 * Class29.anInt711 + 2;
					i_2_ = -((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) / 32)
							+ (Class23.anInt499 * 4 + 2);
					Class27.method679(i_2_, (byte) -58,
							(Class29.aClass12_Sub12_Sub7_Sub1Array717[0]), i_3_);
				}
				Class12_Sub12_Sub7.method347(97, 78, 3, 3, 16777215);
				Class41.method756((byte) -54);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "v.JB(" + arg0 + ')');
		}
	}

	public static void method270(byte arg0) {
		try {
			aClass26_1852 = null;
			aClass59_1849 = null;
			if (arg0 != -37)
				anInt1847 = -89;
			aClass59_1851 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "v.LB(" + arg0 + ')');
		}
	}

	public static int method271(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt1846++;
			int i = arg2 / arg1;
			int i_11_ = arg0 / arg1;
			int i_12_ = -1 + arg1 & arg0;
			int i_13_ = arg2 & arg1 - 1;
			int i_14_ = Class15.method587((byte) 117, i_11_, i);
			if (arg3 != -20648)
				aClass59_1849 = null;
			int i_15_ = Class15.method587((byte) 109, 1 + i_11_, i);
			int i_16_ = Class15.method587((byte) 81, i_11_, 1 + i);
			int i_17_ = Class15.method587((byte) 94, i_11_ - -1, i - -1);
			int i_18_ = Class35.method722(arg1, arg3 + 20540, i_14_, i_12_,
					i_15_);
			int i_19_ = Class35.method722(arg1, arg3 ^ 0x50cc, i_16_, i_12_,
					i_17_);
			return Class35.method722(arg1, -107, i_18_, i_13_, i_19_);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("v.KB(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method272(int arg0, int arg1, Archive arg2,
			Class36 arg3) {
		try {
			anInt1845++;
			byte[] is = null;
			synchronized (Class10.aClass8_240) {
				int i = -32 % ((32 - arg1) / 58);
				for (Class12_Sub9 class12_sub9 = ((Class12_Sub9) Class10.aClass8_240
						.method91((byte) 86)); class12_sub9 != null; class12_sub9 = ((Class12_Sub9) Class10.aClass8_240
						.method100(-29860))) {
					if ((long) arg0 == class12_sub9.aLong319
							&& arg3 == class12_sub9.aClass36_1746
							&& class12_sub9.anInt1748 == 0) {
						is = class12_sub9.aByteArray1757;
						break;
					}
				}
			}
			if (is != null)
				arg2.method661(is, true, -3, arg0, arg3);
			else {
				byte[] is_20_ = arg3.method733(arg0, -1319);
				arg2.method661(is_20_, true, -3, arg0, arg3);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("v.GB(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method273(byte arg0) {
		try {
			if (arg0 == -8) {
				Class29.aFont708 = null;
				anInt1844++;
				Class64_Sub2.aFontMetrics1979 = null;
				Class57.anImage1327 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "v.IB(" + arg0 + ')');
		}
	}

	static {
		aClass59_1849 = aClass59_1851;
	}
}
