package com.jagex;/* com.jagex.Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.PacketBuffer;
import com.jagex.util.Statics;

import java.awt.Component;

public class Class33 {
	public static int anInt804;
	public static int anInt805;
	public int[][] anIntArrayArray806;
	public int anInt807;
	public static int anInt808;
	public static RSString aClass59_810 = (Class55.method898(
			"Account locked as we suspect it has been stolen)3", -10983));
	public static int anInt811;
	public static int anInt812;
	public static int anInt813;
	public static int anInt814;
	public static int anInt815;
	public static int anInt816;
	public static RSString aClass59_817 = aClass59_810;
	public static int anInt818;
	public int anInt819;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_820;
	public static volatile int anInt821;
	public static boolean aBoolean822;
	public static int anInt823;
	public static RSString aClass59_824;
	public static int anInt825;
	public static RSString aClass59_826;
	public static int anInt827;
	public static int anInt828;
	public static int anInt829;

	public int method707(int arg0, byte arg1) {
		try {
			anInt805++;
			if (arg1 != -13)
				return -24;
			if (anIntArrayArray806 != null)
				arg0 = arg0 * anInt819 / anInt807;
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "l.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method708(int arg0, Component arg1) {
		try {
			anInt827++;
			arg1.addMouseListener(Class12_Sub12_Sub11_Sub1.aClass13_2641);
			if (arg0 >= 85)
				arg1.addMouseMotionListener(Class12_Sub12_Sub11_Sub1.aClass13_2641);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("l.C(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method709(Component arg0, boolean arg1) {
		try {
			if (arg1 != true)
				method712(null, -1, 10);
			anInt812++;
			arg0.removeMouseListener(Class12_Sub12_Sub11_Sub1.aClass13_2641);
			arg0.removeMouseMotionListener(Class12_Sub12_Sub11_Sub1.aClass13_2641);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("l.H("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public byte[] method710(byte[] arg0, byte arg1) {
		try {
			if (anIntArrayArray806 != null) {
				int i = arg0.length * anInt819 / anInt807 - -14;
				int i_0_ = 0;
				int[] is = new int[i];
				int i_1_ = 0;
				for (int i_2_ = 0; arg0.length > i_2_; i_2_++) {
					int i_3_ = arg0[i_2_];
					int[] is_4_ = anIntArrayArray806[i_1_];
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -15; i_5_++)
						is[i_5_ + i_0_] += i_3_ * is_4_[i_5_];
					i_1_ += anInt819;
					int i_6_ = i_1_ / anInt807;
					i_1_ -= i_6_ * anInt807;
					i_0_ += i_6_;
				}
				arg0 = new byte[i];
				for (int i_7_ = 0; (i ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
					int i_8_ = 32768 + is[i_7_] >> 12429136;
					if (i_8_ >= -128) {
						if ((i_8_ ^ 0xffffffff) >= -128)
							arg0[i_7_] = (byte) i_8_;
						else
							arg0[i_7_] = (byte) 127;
					} else
						arg0[i_7_] = (byte) -128;
				}
			}
			anInt816++;
			if (arg1 >= -8)
				method712(null, -111, 33);
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("l.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static boolean method711(int arg0, int arg1, boolean arg2) {
		try {
			if (arg2 != true)
				method716(false, 69, -47, (byte) -9);
			if (arg1 == 11)
				arg1 = 10;
			if (arg1 >= 5 && (arg1 ^ 0xffffffff) >= -9)
				arg1 = 4;
			Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas.method39(6,
					arg0);
			anInt813++;
			return class12_sub12_sub9.method425(arg1, (byte) -78);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("l.J(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method712(Class12_Sub12_Sub11_Sub2 arg0, int arg1,
			int arg2) {
		try {
			if (arg0.anInt2691 < 128 || arg0.anInt2683 < 128
					|| (arg0.anInt2691 ^ 0xffffffff) <= -13185
					|| arg0.anInt2683 >= 13184) {
				arg0.anInt2667 = 0;
				arg0.anInt2734 = -1;
				arg0.anInt2721 = 0;
				arg0.anInt2692 = -1;
				arg0.anInt2691 = arg0.anInt2727 * 64 + arg0.anIntArray2708[0]
						* 128;
				arg0.anInt2683 = 64 * arg0.anInt2727 + 128
						* arg0.anIntArray2671[0];
				arg0.method446(arg2 + -118);
			}
			anInt808++;
			if (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713 == arg0
					&& ((arg0.anInt2691 ^ 0xffffffff) > -1537
							|| (arg0.anInt2683 ^ 0xffffffff) > -1537
							|| arg0.anInt2691 >= 11776 || arg0.anInt2683 >= 11776)) {
				arg0.anInt2734 = -1;
				arg0.anInt2721 = 0;
				arg0.anInt2692 = -1;
				arg0.anInt2667 = 0;
				arg0.anInt2691 = arg0.anInt2727 * 64 + arg0.anIntArray2708[0]
						* 128;
				arg0.anInt2683 = arg0.anInt2727 * 64 + 128
						* arg0.anIntArray2671[0];
				arg0.method446(-103);
			}
			if (arg0.anInt2667 > Class64_Sub2.anInt1968)
				Class12_Sub7.method192(arg2 ^ 0x40, arg0);
			else if (arg0.anInt2721 >= Class64_Sub2.anInt1968)
				Class12_Sub4.method162(arg0, -46);
			else
				Class12_Sub12_Sub15.method543(-21303, arg0);
			Class58.method907(36, arg0);
			if (arg2 != 0)
				method709(null, false);
			Statics.method264((byte) -106, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("l.I("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static void method713(int arg0) {
		if (arg0 == -5) {
			anInt818++;
			int i = Class29.aClass12_Sub12_Sub7_Sub4_693
					.method401(Class12_Sub12_Sub5.aClass59_2245);
			for (int i_9_ = 0; (Class13.anInt338 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
				int i_10_ = Class29.aClass12_Sub12_Sub7_Sub4_693
						.method393(Class12_Sub1.aClass59Array1621[i_9_]);
				if (i < i_10_)
					i = i_10_;
			}
			int i_11_ = 15 * Class13.anInt338 + 21;
			i += 8;
			if (Class10.anInt226 > 4 && (Class42.anInt1000 ^ 0xffffffff) < -5
					&& Class10.anInt226 < 516 && Class42.anInt1000 < 338) {
				Class51.aBoolean1202 = true;
				Class42.anInt992 = Class13.anInt338 * 15 - -22;
				Class49.anInt1143 = i;
				Class9.anInt212 = 0;
				int i_12_ = -(i / 2) + (Class10.anInt226 - 4);
				if ((i_12_ - -i ^ 0xffffffff) < -513)
					i_12_ = 512 - i;
				if ((i_12_ ^ 0xffffffff) > -1)
					i_12_ = 0;
				int i_13_ = -4 + Class42.anInt1000;
				Statics.anInt2019 = i_12_;
				if (i_11_ + i_13_ > 334)
					i_13_ = 334 - i_11_;
				if ((i_13_ ^ 0xffffffff) > -1)
					i_13_ = 0;
				Class12_Sub4.anInt1673 = i_13_;
			}
			if ((Class10.anInt226 ^ 0xffffffff) < -554
					&& Class42.anInt1000 > 205
					&& (Class10.anInt226 ^ 0xffffffff) > -744
					&& (Class42.anInt1000 ^ 0xffffffff) > -467) {
				Class51.aBoolean1202 = true;
				Class42.anInt992 = 22 + 15 * Class13.anInt338;
				int i_14_ = Class10.anInt226 - 553 + -(i / 2);
				Class9.anInt212 = 1;
				Class49.anInt1143 = i;
				if (i_14_ < 0)
					i_14_ = 0;
				else if (i + i_14_ > 190)
					i_14_ = 190 + -i;
				int i_15_ = Class42.anInt1000 + -205;
				Statics.anInt2019 = i_14_;
				if ((i_15_ ^ 0xffffffff) > -1)
					i_15_ = 0;
				else if (i_15_ - -i_11_ > 261)
					i_15_ = -i_11_ + 261;
				Class12_Sub4.anInt1673 = i_15_;
			}
			if (Class10.anInt226 > 17 && Class42.anInt1000 > 357
					&& (Class10.anInt226 ^ 0xffffffff) > -497
					&& Class42.anInt1000 < 453) {
				Class51.aBoolean1202 = true;
				int i_16_ = -(i / 2) + (Class10.anInt226 - 17);
				if ((i_16_ ^ 0xffffffff) <= -1) {
					if (i + i_16_ > 479)
						i_16_ = -i + 479;
				} else
					i_16_ = 0;
				Class49.anInt1143 = i;
				Class9.anInt212 = 2;
				Class42.anInt992 = 15 * Class13.anInt338 + 22;
				Statics.anInt2019 = i_16_;
				int i_17_ = Class42.anInt1000 + -357;
				if ((i_17_ ^ 0xffffffff) <= -1) {
					if ((i_17_ + i_11_ ^ 0xffffffff) < -97)
						i_17_ = 96 - i_11_;
				} else
					i_17_ = 0;
				Class12_Sub4.anInt1673 = i_17_;
			}
		}
	}

	public int method714(int arg0, int arg1) {
		try {
			if (arg1 != 7)
				anInt819 = 66;
			if (anIntArrayArray806 != null)
				arg0 = 7 - -(anInt819 * arg0 / anInt807);
			anInt815++;
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "l.F(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method715(byte arg0) {
		try {
			aClass12_Sub12_Sub7_Sub2_820 = null;
			aClass59_810 = null;
			aClass59_817 = null;
			aClass59_826 = null;
			Game.inBuffer = null;
			if (arg0 >= 55)
				aClass59_824 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "l.A(" + arg0 + ')');
		}
	}

	public static RSString method716(boolean arg0, int arg1, int arg2, byte arg3) {
		try {
			anInt804++;
			int i = 1;
			if ((arg1 ^ 0xffffffff) > -2 || arg1 > 36)
				arg1 = 10;
			if (arg3 != 37)
				return null;
			for (int i_18_ = arg2 / arg1; (i_18_ ^ 0xffffffff) != -1; i_18_ /= arg1)
				i++;
			int i_19_ = i;
			if (arg2 < 0 || arg0)
				i_19_++;
			byte[] is = new byte[i_19_];
			if (arg2 >= 0) {
				if (arg0)
					is[0] = (byte) 43;
			} else
				is[0] = (byte) 45;
			for (int i_20_ = 0; i > i_20_; i_20_++) {
				int i_21_ = arg2 % arg1;
				arg2 /= arg1;
				if (i_21_ < 0)
					i_21_ = -i_21_;
				if ((i_21_ ^ 0xffffffff) < -10)
					i_21_ += 39;
				is[i_19_ - (i_20_ + 1)] = (byte) (i_21_ + 48);
			}
			RSString class59 = new RSString();
			class59.chars = is;
			class59.anInt1480 = i_19_;
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("l.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public Class33(int arg0, int arg1) {
		try {
			int i = Class38.method736(arg1, arg0, 18963);
			arg1 /= i;
			arg0 /= i;
			anInt807 = arg0;
			anInt819 = arg1;
			if (arg1 != arg0) {
				anIntArrayArray806 = new int[arg0][14];
				for (int i_22_ = 0; (arg0 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
					int[] is = anIntArrayArray806[i_22_];
					double d = 6.0 + (double) i_22_ / (double) arg0;
					int i_23_ = (int) Math.floor(1.0 + (-7.0 + d));
					if ((i_23_ ^ 0xffffffff) > -1)
						i_23_ = 0;
					double d_24_ = (double) arg1 / (double) arg0;
					int i_25_ = (int) Math.ceil(d + 7.0);
					if ((i_25_ ^ 0xffffffff) < -15)
						i_25_ = 14;
					for (/**/; i_25_ > i_23_; i_23_++) {
						double d_26_ = (-d + (double) i_23_) * 3.141592653589793;
						double d_27_ = d_24_;
						if (d_26_ < -1.0E-4 || d_26_ > 1.0E-4)
							d_27_ *= Math.sin(d_26_) / d_26_;
						d_27_ *= 0.54 + Math
								.cos((-d + (double) i_23_) * 0.2243994752564138) * 0.46;
						is[i_23_] = (int) Math.floor(d_27_ * 65536.0 + 0.5);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "l.<init>(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		Game.inBuffer = new PacketBuffer(5000);
		anInt823 = 0;
		aClass59_826 = Class55.method898("Enter your username (V password)3",
				-10983);
		anInt821 = 0;
		aClass59_824 = aClass59_826;
		anInt829 = 0;
		anInt828 = 2301979;
		anInt825 = -1;
	}
}
