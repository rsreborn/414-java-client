package com.jagex;/* com.jagex.Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.RSSocket;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Class62 {
	public static int anInt1369;
	public static int anInt1370;
	public static int anInt1371;
	public Image anImage1372;
	public int anInt1373;
	public static RSString aClass59_1374;
	public static RSString aClass59_1375;
	public static Class62 aClass62_1377;
	public static RSString aClass59_1378;
	public int[] anIntArray1379;
	public static RSString aClass59_1380;
	public static int anInt1381;
	public static int anInt1382;
	public static RSString aClass59_1383 = Class55.method898("glow3:", -10983);
	public static int anInt1384;
	public int anInt1385;
	public static RSString aClass59_1386;
	public static boolean aBoolean1387;

	public abstract void method953(Component component, int i, int i_0_,
			boolean bool);

	public static Class12_Sub12_Sub3 method954(int arg0, int arg1) {
		try {
			anInt1382++;
			int i = arg0 >> -363311664;
			int i_1_ = arg1 & arg0;
			if ((Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[i] == null)
					|| (Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[i][i_1_]) == null) {
				boolean bool = Class15.method589(i, 14585);
				if (!bool)
					return null;
			}
			return (Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[i][i_1_]);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "w.K(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method955(boolean arg0) {
		try {
			aClass59_1386 = null;
			aClass59_1383 = null;
			aClass59_1374 = null;
			aClass62_1377 = null;
			if (arg0 != false)
				method956(117, -2L);
			aClass59_1378 = null;
			aClass59_1380 = null;
			aClass59_1375 = null;
			Cache.synthSoundsArchive = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "w.I(" + arg0 + ')');
		}
	}

	public static void method956(int arg0, long arg1) {
		try {
			anInt1369++;
			if (arg0 != 22793)
				method959(-72);
			if (arg1 != 0L) {
				for (int i = 0; (Class49.anInt1147 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
					if (Class35.aLongArray859[i] == arg1) {
						Class49.anInt1147--;
						Class49.aBoolean1146 = true;
						Class29.anInt687++;
						for (int i_2_ = i; ((Class49.anInt1147 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++)
							Class35.aLongArray859[i_2_] = Class35.aLongArray859[i_2_ + 1];
						Game.outBuffer.writePacket(87);
						Game.outBuffer.writeLongBE(arg1);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "w.J(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public abstract void method957(int i, int i_3_, int i_4_, Graphics graphics);

	public static void method958(int arg0, int arg1) {
		do {
			try {
				anInt1371++;
				Class12_Sub6.method188((byte) -99, arg1);
				if (arg0 <= -42)
					break;
				anInt1381 = 111;
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "w.H(" + arg0 + ','
						+ arg1 + ')');
			}
			break;
		} while (false);
	}

	public static void method959(int arg0) {
		do {
			try {
				if (arg0 == 17696) {
					anInt1370++;
					int i = 256;
					for (int i_5_ = 10; (i_5_ ^ 0xffffffff) > -118; i_5_++) {
						int i_6_ = (int) (100.0 * Math.random());
						if ((i_6_ ^ 0xffffffff) > -51)
							Class12_Sub6.anIntArray1702[i_5_
									+ (i - 2 << -1758179801)] = 255;
					}
					for (int i_7_ = 0; i_7_ < 100; i_7_++) {
						int i_8_ = 128 + (int) (Math.random() * 128.0);
						int i_9_ = (int) (Math.random() * 124.0) + 2;
						int i_10_ = i_9_ + (i_8_ << 1943350439);
						Class12_Sub6.anIntArray1702[i_10_] = 192;
					}
					for (int i_11_ = 1; -1 + i > i_11_; i_11_++) {
						for (int i_12_ = 1; i_12_ < 127; i_12_++) {
							int i_13_ = (i_11_ << -1944226553) + i_12_;
							Class12_Sub12_Sub11_Sub2_Sub1.anIntArray2929[i_13_] = (Class12_Sub6.anIntArray1702[i_13_ + 1]
									+ Class12_Sub6.anIntArray1702[i_13_ - 1] - (-Class12_Sub6.anIntArray1702[i_13_ - 128] - (Class12_Sub6.anIntArray1702[i_13_ + 128]))) / 4;
						}
					}
					Class62_Sub2.anInt1915 += 128;
					if (Class62_Sub2.anInt1915 > RSApplet.anIntArray36.length) {
						int i_14_ = (int) (12.0 * Math.random());
						Class62_Sub2.anInt1915 -= RSApplet.anIntArray36.length;
						Class35.method726(
								(RSSocket.aClass12_Sub12_Sub7_Sub2Array523[i_14_]),
								arg0 ^ ~0x4559);
					}
					for (int i_15_ = 1; (-1 + i ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
						for (int i_16_ = 1; i_16_ < 127; i_16_++) {
							int i_17_ = i_16_ - -(i_15_ << 325628231);
							int i_18_ = ((Class12_Sub12_Sub11_Sub2_Sub1.anIntArray2929[i_17_ + 128]) - ((RSApplet.anIntArray36[(RSApplet.anIntArray36.length
									+ -1 & i_17_ - -Class62_Sub2.anInt1915)]) / 5));
							if (i_18_ < 0)
								i_18_ = 0;
							Class12_Sub6.anIntArray1702[i_17_] = i_18_;
						}
					}
					for (int i_19_ = 0; i_19_ < i - 1; i_19_++)
						Class26.anIntArray624[i_19_] = Class26.anIntArray624[1 + i_19_];
					Class26.anIntArray624[i - 1] = (int) (16.0
							* Math.sin((double) (Class64_Sub2.anInt1968) / 14.0)
							+ Math.sin((double) Class64_Sub2.anInt1968 / 15.0)
							* 14.0 + Math
							.sin((double) Class64_Sub2.anInt1968 / 16.0) * 12.0);
					if (Class12_Sub9.anInt1756 > 0)
						Class12_Sub9.anInt1756 -= 4;
					if ((Archive.anInt1881 ^ 0xffffffff) < -1)
						Archive.anInt1881 -= 4;
					if (Class12_Sub9.anInt1756 != 0
							|| (Archive.anInt1881 ^ 0xffffffff) != -1)
						break;
					int i_20_ = (int) (2000.0 * Math.random());
					if ((i_20_ ^ 0xffffffff) == -2)
						Archive.anInt1881 = 1024;
					if (i_20_ != 0)
						break;
					Class12_Sub9.anInt1756 = 1024;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "w.L(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public void method960(int arg0) {
		try {
			anInt1384++;
			if (arg0 == -1)
				Class12_Sub12_Sub7.method345(anIntArray1379, anInt1373,
						anInt1385);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "w.M(" + arg0 + ')');
		}
	}

	static {
		aClass59_1378 = aClass59_1383;
		aClass59_1375 = Class55.method898("Off", -10983);
		anInt1381 = 0;
		aClass59_1386 = aClass59_1375;
		aBoolean1387 = false;
		aClass59_1374 = Class55.method898("Existing user", -10983);
		aClass59_1380 = aClass59_1374;
	}
}
