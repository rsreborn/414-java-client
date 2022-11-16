package com.jagex;/* com.jagex.Class62_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.util.Statics;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Class62_Sub2 extends Class62 implements ImageProducer,
		ImageObserver {
	public static int anInt1906;
	public static int[] anIntArray1907;
	public static int anInt1908;
	public static int anInt1909;
	public static RSString aClass59_1910;
	public static int anInt1911;
	public static int anInt1912;
	public static int anInt1913;
	public static int anInt1914;
	public static int anInt1915;
	public static int anInt1916;
	public static int anInt1917 = 0;
	public static int anInt1918;
	public static int anInt1919;
	public static int anInt1920;
	public static int anInt1921;
	public static int anInt1922;
	public ColorModel aColorModel1923;
	public static int anInt1924;
	public static int anInt1925;
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array1926;
	public static int anInt1927;
	public static int anInt1928;
	public static int[] anIntArray1929;
	public static int anInt1930;
	public static RSString aClass59_1931;
	public static int anInt1932;
	public ImageConsumer anImageConsumer1933;
	public static RSString aClass59_1934;
	public static int anInt1935;
	public static int anInt1936;
	public static RSString aClass59_1937;

	public synchronized void removeConsumer(ImageConsumer arg0) {
		try {
			if (anImageConsumer1933 == arg0)
				anImageConsumer1933 = null;
			anInt1922++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("h.removeConsumer("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method961(byte arg0) {
		try {
			anIntArray1907 = null;
			aClass59_1937 = null;
			if (arg0 > -46)
				anIntArray1907 = null;
			aClass59_1934 = null;
			aClass59_1910 = null;
			anIntArray1929 = null;
			aClass59_1931 = null;
			aClass12_Sub12_Sub7_Sub1Array1926 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "h.C(" + arg0 + ')');
		}
	}

	public static void method962(byte arg0) {
		anInt1919++;
		if ((Class13.anInt338 ^ 0xffffffff) <= -3
				|| (Class12_Sub12_Sub11_Sub5.anInt2848 ^ 0xffffffff) != -1
				|| (Class12.anInt315 ^ 0xffffffff) != -1) {
			RSString class59;
			if (Class12_Sub12_Sub11_Sub5.anInt2848 != 1
					|| (Class13.anInt338 ^ 0xffffffff) <= -3) {
				if (Class12.anInt315 == 1 && Class13.anInt338 < 2)
					class59 = Statics.method251((byte) -98,
							(new RSString[] {
									(Class12_Sub12_Sub9.aClass59_2354),
									Class20.aClass59_468 }));
				else
					class59 = (Class12_Sub1.aClass59Array1621[Class13.anInt338
							+ -1]);
			} else
				class59 = Statics.method251((byte) -39, (new RSString[] {
						RSString.aClass59_1525, Class14.aClass59_371,
						Statics.aClass59_565, Class20.aClass59_468 }));
			if (Class13.anInt338 > 2)
				class59 = (Statics.method251((byte) -104,
						(new RSString[] { class59, Class55.aClass59_1312,
								Class19.method599(-2 + Class13.anInt338, 10),
								aClass59_1910 })));
			Class29.aClass12_Sub12_Sub7_Sub4_693.method408(class59, 4, 15,
					16777215, true, ((Class64_Sub2.anInt1968) / 1000));
			if (arg0 <= 93)
				method964(-24, null, null, -46);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		try {
			anInt1930++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("h.imageUpdate("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')'));
		}
	}

	public void method953(Component arg0, int arg1, int arg2, boolean arg3) {
		try {
			anInt1373 = arg1;
			anInt1385 = arg2;
			anIntArray1379 = new int[arg2 * arg1 + 1];
			anInt1935++;
			aColorModel1923 = new DirectColorModel(32, 16711680, 65280, 255);
			anImage1372 = arg0.createImage(this);
			method963(0);
			if (arg3 != false)
				startProduction(null);
			arg0.prepareImage(anImage1372, this);
			method963(0);
			arg0.prepareImage(anImage1372, this);
			method963(0);
			arg0.prepareImage(anImage1372, this);
			this.method960(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("h.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public void startProduction(ImageConsumer arg0) {
		try {
			anInt1914++;
			addConsumer(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("h.startProduction("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public synchronized void method963(int arg0) {
		try {
			if (arg0 != 0)
				anIntArray1907 = null;
			anInt1921++;
			if (anImageConsumer1933 != null) {
				anImageConsumer1933.setPixels(0, 0, anInt1373, anInt1385,
						aColorModel1923, anIntArray1379, 0, anInt1373);
				anImageConsumer1933.imageComplete(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "h.A(" + arg0 + ')');
		}
	}

	public static void method964(int arg0, Class36 arg1, Archive arg2,
			int arg3) {
		try {
			anInt1912++;
			Class12_Sub9 class12_sub9 = new Class12_Sub9();
			class12_sub9.aClass26_Sub1_1753 = arg2;
			class12_sub9.aClass36_1746 = arg1;
			class12_sub9.anInt1748 = arg3;
			class12_sub9.aLong319 = (long) arg0;
			synchronized (Class10.aClass8_240) {
				Class10.aClass8_240.method98(class12_sub9, (byte) 79);
			}
			Class26.method633((byte) -128);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("h.D(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		try {
			anInt1932++;
			anImageConsumer1933 = arg0;
			arg0.setDimensions(anInt1373, anInt1385);
			arg0.setProperties(null);
			arg0.setColorModel(aColorModel1923);
			arg0.setHints(14);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "h.addConsumer("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public static void updatePlayers(byte arg0) {
		try {
			Class47.anInt1094 = 0;
			int i = 92 / ((52 - arg0) / 40);
			Class11.anInt287 = 0;
			anInt1911++;
			Class12_Sub12_Sub5.parsePlayerMovement(7);
			Class64_Sub2.parseTrackedPlayerMovement(14015);
			Class28.registerNewPlayers((byte) -126);
			Class9.parseTrackedPlayerUpdateMasks((byte) 109);
			for (int i_0_ = 0; (Class11.anInt287 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
				int i_1_ = Statics.anIntArray1833[i_0_];
				if (((Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_1_].anInt2663) ^ 0xffffffff) != (Class64_Sub2.anInt1968 ^ 0xffffffff))
					Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_1_] = null;
			}
			if ((Class5.anInt159 ^ 0xffffffff) != (Game.inBuffer.position ^ 0xffffffff))
				throw new RuntimeException("gpp1 pos:"
						+ (Game.inBuffer.position)
						+ " psize:" + Class5.anInt159);
			for (int i_2_ = 0; i_2_ < Class9.anInt203; i_2_++) {
				if ((Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[Class36.anIntArray888[i_2_]]) == null)
					throw new RuntimeException("gpp2 pos:" + i_2_ + " size:"
							+ Class9.anInt203);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "h.G(" + arg0 + ')');
		}
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		try {
			anInt1906++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception,
					("h.requestTopDownLeftRightResend("
							+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method957(int arg0, int arg1, int arg2, Graphics arg3) {
		try {
			method963(0);
			if (arg0 != -5917)
				anImageConsumer1933 = null;
			arg3.drawImage(anImage1372, arg2, arg1, this);
			anInt1920++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("h.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		try {
			anInt1908++;
			if (arg0 != anImageConsumer1933)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "h.isConsumer("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		anInt1915 = 0;
		anInt1916 = 0;
		anIntArray1907 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1 };
		anInt1928 = 0;
		anIntArray1929 = new int[1000];
		anInt1918 = 0;
		anInt1927 = 0;
		aClass59_1931 = Class55.method898(
				"go back to the main RuneScape webpage", -10983);
		aClass59_1934 = aClass59_1931;
		aClass59_1937 = Class55.method898(" more options", -10983);
		anInt1925 = 7759444;
		anInt1936 = -1;
		aClass59_1910 = aClass59_1937;
	}
}
