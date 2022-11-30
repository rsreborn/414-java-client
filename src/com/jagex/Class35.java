package com.jagex;/* com.jagex.Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.Buffer;

public class Class35 {
	public int anInt833;
	public static int anInt834;
	public static int anInt835;
	public static int[] anIntArray836;
	public static Class49 aClass49_837;
	public int anInt838;
	public static int[] anIntArray839;
	public static int anInt840;
	public static int[] anIntArray841;
	public static int anInt842 = 0;
	public static int[] anIntArray843;
	public static RSString[] aClass59Array844;
	public int anInt845;
	public static Class26 aClass26_846;
	public static int anInt847;
	public static Class26 aClass26_848;
	public static int anInt849;
	public static int[] anIntArray850;
	public static RSString aClass59_851;
	public int anInt852;
	public static int anInt853;
	public static int anInt854;
	public static int[] anIntArray855;
	public static int anInt856;
	public static RSString aClass59_857 = (Class55
			.method898(
					"Please close the interface you have open before using (Wreport abuse(W",
					-10983));
	public static int anInt858;
	public static long[] aLongArray859;
	public static int anInt860;
	public static int[] anIntArray861;
	public static int anInt862;
	public static Class62 aClass62_863;
	public static Class62 aClass62_864;
	public static int[] anIntArray865;
	public static Class9 aClass9_866;
	public static RSString aClass59_867;
	public static int anInt868;
	public static RSString aClass59_869;
	public static RSString aClass59_870;
	public static RSString aClass59_871;
	public static RSString aClass59_872;
	public static RSString aClass59_873;

	public static void method721(byte arg0) {
		try {
			aClass59_871 = null;
			aClass26_848 = null;
			anIntArray841 = null;
			aClass59_870 = null;
			anIntArray843 = null;
			anIntArray839 = null;
			aClass59_873 = null;
			anIntArray865 = null;
			aClass59Array844 = null;
			aClass49_837 = null;
			aClass62_863 = null;
			aClass59_869 = null;
			anIntArray861 = null;
			Cache.mapsArchive = null;
			aLongArray859 = null;
			if (arg0 >= -53)
				method727((byte) -118);
			anIntArray850 = null;
			aClass59_867 = null;
			aClass9_866 = null;
			aClass59_851 = null;
			aClass59_857 = null;
			anIntArray836 = null;
			aClass26_846 = null;
			aClass59_872 = null;
			anIntArray855 = null;
			aClass62_864 = null;
		} catch (RuntimeException runtimeexception) {
			throw method724(runtimeexception, "lc.G(" + arg0 + ')');
		}
	}

	public static int method722(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg1 >= -64)
				method725(-17, null, 40, -37, (byte) 9);
			anInt868++;
			int i = (65536 - (Class12_Sub12_Sub7_Sub3.anIntArray2602[1024
					* arg3 / arg0]) >> -259203839);
			return (((-i + 65536) * arg2 >> 1087077136) - -(arg4 * i >> 1449009232));
		} catch (RuntimeException runtimeexception) {
			throw method724(runtimeexception, ("lc.C(" + arg0 + ',' + arg1
					+ ',' + arg2 + ',' + arg3 + ',' + arg4 + ')'));
		}
	}

	public static void method723(int arg0, byte[] arg1) {
		try {
			anInt834++;
			Buffer class12_sub11 = new Buffer(arg1);
			class12_sub11.position = arg1.length - 2;
			Class12_Sub12.anInt1838 = class12_sub11.readShortBE();
			Class44.anIntArray1027 = new int[Class12_Sub12.anInt1838];
			Class55.anIntArray1313 = new int[Class12_Sub12.anInt1838];
			Class57.anIntArray1337 = new int[Class12_Sub12.anInt1838];
			Class28.aByteArrayArray669 = new byte[Class12_Sub12.anInt1838][];
			Class32.anIntArray778 = new int[Class12_Sub12.anInt1838];
			class12_sub11.position = -(8 * Class12_Sub12.anInt1838) + -7
					+ arg1.length;
			Class1.anInt81 = class12_sub11.readShortBE();
			Class12_Sub2.anInt1654 = class12_sub11.readShortBE();
			int i = (0xff & class12_sub11.readUByte()) - -1;
			for (int i_0_ = 0; (Class12_Sub12.anInt1838 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++)
				Class57.anIntArray1337[i_0_] = class12_sub11.readShortBE();
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (Class12_Sub12.anInt1838 ^ 0xffffffff); i_1_++)
				Class32.anIntArray778[i_1_] = class12_sub11.readShortBE();
			for (int i_2_ = 0; i_2_ < Class12_Sub12.anInt1838; i_2_++)
				Class55.anIntArray1313[i_2_] = class12_sub11.readShortBE();
			int i_3_ = 0;
			if (arg0 != 24507)
				anInt849 = 58;
			for (/**/; (Class12_Sub12.anInt1838 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
				Class44.anIntArray1027[i_3_] = class12_sub11.readShortBE();
			class12_sub11.position = -(Class12_Sub12.anInt1838 * 8)
					+ arg1.length - (7 - -((i - 1) * 3));
			Class15.anIntArray385 = new int[i];
			for (int i_4_ = 1; i > i_4_; i_4_++) {
				Class15.anIntArray385[i_4_] = class12_sub11.method233(Class21
						.method609(arg0, 16736187));
				if (Class15.anIntArray385[i_4_] == 0)
					Class15.anIntArray385[i_4_] = 1;
			}
			class12_sub11.position = 0;
			for (int i_5_ = 0; i_5_ < Class12_Sub12.anInt1838; i_5_++) {
				int i_6_ = Class55.anIntArray1313[i_5_];
				int i_7_ = Class44.anIntArray1027[i_5_];
				int i_8_ = i_6_ * i_7_;
				byte[] is = new byte[i_8_];
				Class28.aByteArrayArray669[i_5_] = is;
				int i_9_ = class12_sub11.readUByte();
				if ((i_9_ ^ 0xffffffff) == -1) {
					for (int i_10_ = 0; i_8_ > i_10_; i_10_++)
						is[i_10_] = class12_sub11.readByte(true);
				} else if ((i_9_ ^ 0xffffffff) == -2) {
					for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_11_++) {
						for (int i_12_ = 0; (i_7_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++)
							is[i_6_ * i_12_ + i_11_] = class12_sub11
									.readByte(true);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw method724(runtimeexception, ("lc.A(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static RuntimeException_Sub1 method724(Throwable arg0, String arg1) {
		try {
			anInt858++;
			RuntimeException_Sub1 runtimeexception_sub1;
			if (arg0 instanceof RuntimeException_Sub1) {
				runtimeexception_sub1 = (RuntimeException_Sub1) arg0;
				runtimeexception_sub1.aString1458 += ' ' + (String) arg1;
			} else
				runtimeexception_sub1 = new RuntimeException_Sub1(arg0, arg1);
			return runtimeexception_sub1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static byte[] method725(int arg0, Class26 arg1, int arg2, int arg3,
			byte arg4) {
		try {
			anInt840++;
			long l = ((long) (arg2 << -812943632) + ((long) arg3 << 942074080) - -(long) (0xffff & arg2
					* 37 + arg0));
			if (Class58.aClass27_1344 != null) {
				Class12_Sub12_Sub12 class12_sub12_sub12 = ((Class12_Sub12_Sub12) Class58.aClass27_1344
						.method673(115, l));
				if (class12_sub12_sub12 != null)
					return class12_sub12_sub12.aByteArray2413;
			}
			byte[] is = arg1.method631(arg2, true, arg0);
			int i = 106 / ((arg4 - 37) / 63);
			if (is == null)
				return null;
			if (Class58.aClass27_1344 != null)
				Class58.aClass27_1344.method678((byte) 123,
						new Class12_Sub12_Sub12(is), l);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw method724(runtimeexception, ("lc.D(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + arg4 + ')'));
		}
	}

	public static void method726(Class12_Sub12_Sub7_Sub2 arg0, int arg1) {
		anInt856++;
		for (int i = 0; RSApplet.anIntArray36.length > i; i++)
			RSApplet.anIntArray36[i] = 0;
		int i = 256;
		for (int i_13_ = 0; i_13_ < 5000; i_13_++) {
			int i_14_ = (int) (Math.random() * 128.0 * (double) i);
			RSApplet.anIntArray36[i_14_] = (int) (Math.random() * 256.0);
		}
		for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -21; i_15_++) {
			for (int i_16_ = 1; (i + -1 ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				for (int i_17_ = 1; i_17_ < 127; i_17_++) {
					int i_18_ = i_17_ + (i_16_ << -1957512761);
					Class29.anIntArray714[i_18_] = ((RSApplet.anIntArray36[i_18_
							- -128] + (RSApplet.anIntArray36[i_18_ - 1] - (-RSApplet.anIntArray36[1 + i_18_] - RSApplet.anIntArray36[i_18_ - 128]))) / 4);
				}
			}
			int[] is = RSApplet.anIntArray36;
			RSApplet.anIntArray36 = Class29.anIntArray714;
			Class29.anIntArray714 = is;
		}
		int i_19_ = 105 / ((arg1 - -39) / 49);
		if (arg0 != null) {
			int i_20_ = 0;
			for (int i_21_ = 0; i_21_ < arg0.anInt2583; i_21_++) {
				for (int i_22_ = 0; arg0.anInt2589 > i_22_; i_22_++) {
					if (arg0.aByteArray2588[i_20_++] != 0) {
						int i_23_ = arg0.anInt2586 + 16 + i_22_;
						int i_24_ = 16 + i_21_ - -arg0.anInt2584;
						int i_25_ = i_23_ - -(i_24_ << 1089904391);
						RSApplet.anIntArray36[i_25_] = 0;
					}
				}
			}
		}
	}

	public static void method727(byte arg0) {
		RSCanvas.aByteArrayArrayArray43 = new byte[4][105][105];
		Archive.anInt1882 = 99;
		Class12_Sub2.anIntArray1643 = new int[104];
		Class64_Sub2.aByteArrayArrayArray1975 = new byte[4][104][104];
		Class51.anIntArray1185 = new int[104];
		anInt835++;
		Class12_Sub12_Sub4.aByteArrayArrayArray2204 = new byte[4][104][104];
		Class64_Sub2.anIntArray1984 = new int[104];
		Class9_Sub2.anIntArrayArray1580 = new int[105][105];
		Class18.anIntArray439 = new int[104];
		Class40.anIntArray951 = new int[104];
		Class30.anIntArrayArrayArray732 = new int[4][105][105];
		Class27.aByteArrayArrayArray654 = new byte[4][104][104];
		Class17.aByteArrayArrayArray423 = new byte[4][104][104];
		if (arg0 >= -107)
			method724(null, null);
	}

	static {
		anIntArray836 = new int[5];
		anInt853 = 50;
		aLongArray859 = new long[100];
		anIntArray841 = new int[anInt853];
		anIntArray843 = new int[anInt853];
		anIntArray861 = new int[anInt853];
		anInt854 = 0;
		aClass59_851 = Class55.method898("Fps:", -10983);
		anIntArray855 = new int[anInt853];
		anInt860 = -1;
		aClass59Array844 = new RSString[anInt853];
		anIntArray850 = new int[anInt853];
		aClass59_867 = aClass59_857;
		anIntArray865 = new int[anInt853];
		anIntArray839 = new int[anInt853];
		anInt862 = 0;
		aClass49_837 = new Class49();
		aClass59_869 = Class55.method898("m", -10983);
		aClass59_871 = Class55.method898("glow1:", -10983);
		aClass59_870 = Class55.method898("Close", -10983);
		aClass59_872 = aClass59_870;
		aClass59_873 = aClass59_871;
	}
}
