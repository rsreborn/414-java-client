package com.jagex;/* com.jagex.Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.zip.GZIPInputStream;

public class Class19 implements Runnable {
	public static int anInt440 = 0;
	public static int anInt441;
	public Object anObject442;
	public static int anInt443;
	public static int anInt444;
	public static RSString aClass59_445;
	public static int anInt446;
	public static int[] anIntArray447;
	public static RSString aClass59_448 = Class55.method898(
			"Welcome to RuneScape", -10983);
	public boolean aBoolean449 = true;
	public static RSString aClass59_450;
	public static int anInt451;
	public static Class51[] aClass51Array452;
	public static RSString aClass59_453;
	public static int[] anIntArray454;
	public static int anInt455;
	public static int anInt456;
	public int anInt457;
	public int[] anIntArray458;
	public int[] anIntArray459;

	public void run() {
		try {
			anInt441++;
			while (aBoolean449) {
				synchronized (anObject442) {
					if (anInt457 < 500) {
						anIntArray459[anInt457] = Class18.anInt432;
						anIntArray458[anInt457] = Class12_Sub12_Sub3.anInt2176;
						anInt457++;
					}
				}
				Statics.method218(50L, true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "fd.run(" + ')');
		}
	}

	public static int method598(boolean arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 != true)
				anInt456 = 108;
			anInt443++;
			arg3 &= 0x3;
			if (arg3 == 0)
				return arg2;
			if (arg3 == 1)
				return 7 - arg1;
			if ((arg3 ^ 0xffffffff) == -3)
				return -arg2 + 7;
			return arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("fd.A(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static RSString method599(int arg0, int arg1) {
		try {
			if (arg1 != 10)
				return null;
			anInt444++;
			return Class33.method716(false, 10, arg0, (byte) 37);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "fd.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static byte[] method600(byte arg0, byte[] arg1) {
		try {
			Buffer class12_sub11 = new Buffer(arg1);
			if (arg0 != 98)
				return null;
			int i = class12_sub11.readUByte();
			int i_0_ = class12_sub11.method207(-708753192);
			anInt451++;
			if (i_0_ < 0
					|| ((RSSocket.anInt516 ^ 0xffffffff) != -1 && RSSocket.anInt516 < i_0_))
				throw new RuntimeException();
			if ((i ^ 0xffffffff) == -1) {
				byte[] is = new byte[i_0_];
				class12_sub11.method213(14362, i_0_, 0, is);
				return is;
			}
			int i_1_ = class12_sub11.method207(-708753192);
			if ((i_1_ ^ 0xffffffff) > -1
					|| ((RSSocket.anInt516 ^ 0xffffffff) != -1 && RSSocket.anInt516 < i_1_))
			//	throw new RuntimeException();'
				return new byte[1000];
			if (i_1_ >= 2000000) {
				return new byte[1000];
			}
			byte[] is = new byte[i_1_];
			if (i != 1) {
				try {
					DataInputStream datainputstream = (new DataInputStream(
							new GZIPInputStream(new ByteArrayInputStream(arg1,
									9, i_0_))));
					datainputstream.readFully(is);
					datainputstream.close();
				} catch (java.io.IOException ioexception) {
					/* empty */
				}
			} else
				Class54.method890(is, i_1_, arg1, i_0_, 9);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("fd.C(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method601(int arg0) {
		anIntArray447 = null;
		aClass59_445 = null;
		aClass59_453 = null;
		aClass59_450 = null;
		aClass51Array452 = null;
		anIntArray454 = null;
		aClass59_448 = null;
		if (arg0 != 0)
			method601(-39);
	}

	public Class19() {
		anObject442 = new Object();
		anInt457 = 0;
		anIntArray458 = new int[500];
		anIntArray459 = new int[500];
	}

	static {
		anIntArray447 = new int[128];
		aClass59_453 = Class55.method898("Please reload this page)3", -10983);
		anIntArray454 = new int[500];
		aClass59_450 = aClass59_448;
		anInt455 = (int) (17.0 * Math.random()) - 8;
		aClass51Array452 = new Class51[12];
		aClass59_445 = aClass59_453;
	}
}
