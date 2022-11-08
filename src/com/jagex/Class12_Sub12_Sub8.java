package com.jagex;/* com.jagex.Class12_Sub12_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;

public class Class12_Sub12_Sub8 extends Class12_Sub12 {
	public static int[] anIntArray2283;
	public Archive aClass26_Sub1_2284;
	public static int anInt2285 = 0;
	public static int anInt2286;
	public byte aByte2287;
	public static Class48 aClass48_2288;
	public static int anInt2289;
	public static int anInt2290;
	public static int anInt2291;
	public static int anInt2292;
	public int anInt2293;
	public static int anInt2294;
	public static Class52 aClass52_2295;
	public static RSString aClass59_2296;
	public static int[] anIntArray2297;
	public static int[] anIntArray2298;
	public static RSString aClass59_2299;
	public static int anInt2300;
	public static RSString[] aClass59Array2301;
	public static Class27 aClass27_2302;

	public static void method409(int arg0) {
		try {
			anInt2300++;
			if (Game.gameServerSocket != null)
				Game.gameServerSocket.method619(-2);
			Game.gameServerSocket = null;
			Class49.method801((byte) 80);
			aClass52_2295.method858();
			for (int i = 0; i < 4; i++)
				Class11.aClass10Array280[i].method127(-115);
			System.gc();
			Class11.method139(10, (byte) 119);
			Class12_Sub12_Sub11.anInt2386 = 0;
			if (arg0 <= -65) {
				Class28.anInt672 = -1;
				Class29.method686((byte) 67, 10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jd.B(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub5 method410(Class26 arg0, Class26 arg1,
			boolean arg2, int arg3, int arg4) {
		try {
			anInt2289++;
			boolean bool = true;
			int[] is = arg1.method651(arg3, 87);
			for (int i = 0; is.length > i; i++) {
				byte[] is_0_ = arg1.method637(is[i], arg4 + -536852857, arg3);
				if (is_0_ == null)
					bool = false;
				else {
					int i_1_ = is_0_[1] & 0xff
							| (is_0_[0] & 0xff) << -1830878712;
					byte[] is_2_;
					if (!arg2)
						is_2_ = arg0.method637(0, arg4 ^ 0x1fffb979, i_1_);
					else
						is_2_ = arg0.method637(i_1_, 18054, 0);
					if (is_2_ == null)
						bool = false;
				}
			}
			if (arg4 != 536870911)
				method409(116);
			if (!bool)
				return null;
			try {
				return new Class12_Sub12_Sub5(arg1, arg0, arg3, arg2);
			} catch (Exception exception) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("jd.A("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + arg4 + ')'));
		}
	}

	public static void method411(int arg0) {
		try {
			anInt2290++;
			Class52.aBoolean1212 = true;
			if (arg0 == 12855)
				Class21.aBoolean483 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jd.C(" + arg0 + ')');
		}
	}

	public static void method412(byte arg0) {
		try {
			if (arg0 == 27) {
				aClass48_2288 = null;
				aClass59Array2301 = null;
				aClass59_2296 = null;
				anIntArray2283 = null;
				aClass27_2302 = null;
				anIntArray2297 = null;
				anIntArray2298 = null;
				aClass59_2299 = null;
				aClass52_2295 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "jd.D(" + arg0 + ')');
		}
	}

	static {
		anIntArray2283 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
				1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143,
				524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431,
				67108863, 134217727, 268435455, 536870911, 1073741823,
				2147483647, -1 };
		anInt2294 = 0;
		anIntArray2297 = new int[5];
		aClass59Array2301 = new RSString[100];
		aClass59_2296 = Class55.method898(
				"We suspect someone knows your password)3", -10983);
		aClass59_2299 = aClass59_2296;
		aClass48_2288 = new Class48(32);
		aClass27_2302 = new Class27(64);
	}
}
