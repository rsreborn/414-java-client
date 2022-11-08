package com.jagex;/* com.jagex.Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;

import java.awt.Graphics;

public class Class41 {
	public static RSString aClass59_958;
	public static int anInt959;
	public static int anInt960;
	public static int anInt961;
	public static volatile int anInt962 = -1;
	public static Class27 aClass27_963;
	public static int anInt964;
	public static RSString aClass59_965;
	public static RSString aClass59_966;
	public static int anInt967;
	public static RSString aClass59_968;
	public static RSString aClass59_969;
	public static RSString aClass59_970;
	public static volatile int anInt971;
	public static RSString aClass59_972;
	public static int anInt973;
	public static RSString aClass59_974;

	public static void method755(int arg0, int arg1) {
		if (arg1 >= -75)
			method756((byte) -92);
		Class9_Sub2.anInt1592 += arg0;
		anInt964++;
		while (Class9_Sub2.anInt1592 >= Class19.anInt446) {
			Class9_Sub2.anInt1592 -= Class19.anInt446;
			Class12_Sub12_Sub16.anInt2557 -= Class12_Sub12_Sub16.anInt2557 >> 877921442;
		}
		Class12_Sub12_Sub16.anInt2557 -= arg0 * 1000;
		if (Class12_Sub12_Sub16.anInt2557 < 0)
			Class12_Sub12_Sub16.anInt2557 = 0;
	}

	public static void method756(byte arg0) {
		try {
			anInt959++;
			try {
				if (arg0 == -54) {
					Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
							.getGraphics();
					Class44.aClass62_1042.method957(arg0 + -5863, 4, 550,
							graphics);
				}
			} catch (Exception exception) {
				Class12_Sub12_Sub5.aCanvas2243.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "nc.C(" + arg0 + ')');
		}
	}

	public static void method757(int arg0) {
		aClass59_965 = null;
		aClass59_970 = null;
		aClass59_958 = null;
		aClass59_966 = null;
		aClass59_972 = null;
		aClass59_969 = null;
		aClass59_968 = null;
		aClass27_963 = null;
		aClass59_974 = null;
		if (arg0 != 8)
			method758((byte) 104, 67, -67, null, -100, -33, 106, 111, -31, null);
	}

	public static void method758(byte arg0, int arg1, int arg2, Class10[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		try {
			for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
				for (int i_0_ = 0; i_0_ < 8; i_0_++) {
					if (arg7 - -i > 0 && (arg7 - -i ^ 0xffffffff) > -104
							&& i_0_ + arg8 > 0 && arg8 + i_0_ < 103)
						arg3[arg1].anIntArrayArray222[i + arg7][i_0_ + arg8] = (Class12_Sub12_Sub12
								.method519((arg3[arg1].anIntArrayArray222[i
										+ arg7][i_0_ + arg8]), -16777217));
				}
			}
			if (arg0 >= -36)
				anInt973 = 11;
			Buffer class12_sub11 = new Buffer(arg9);
			for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -65; i_1_++) {
					for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -65; i_2_++) {
						if (arg6 != i
								|| arg2 > i_1_
								|| (arg2 + 8 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)
								|| i_2_ < arg5
								|| (i_2_ ^ 0xffffffff) <= (8 + arg5 ^ 0xffffffff))
							Class51.method812(0, -1, 0, 0, 0, 125, -1,
									class12_sub11);
						else
							Class51.method812(
									0,
									arg8
											+ Class19.method598(true,
													i_1_ & 0x7, i_2_ & 0x7,
													arg4), arg4, arg1, 0, 120,
									(arg7 - -Class12_Sub12_Sub1.method279(
											0x7 & i_1_, 3, i_2_ & 0x7, arg4)),
									class12_sub11);
					}
				}
			}
			anInt960++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("nc.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ','
					+ (arg9 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt961 = 50;
		aClass59_965 = Class55.method898(" seconds)3", -10983);
		aClass59_966 = Class55.method898("Enter name of friend to add to list",
				-10983);
		aClass59_958 = aClass59_966;
		aClass59_968 = aClass59_965;
		aClass27_963 = new Class27(64);
		anInt971 = 0;
		aClass59_969 = Class55.method898("Accept trade", -10983);
		aClass59_974 = Class55.method898("Loading game screen )2 ", -10983);
		aClass59_970 = aClass59_974;
		aClass59_972 = aClass59_969;
	}
}
