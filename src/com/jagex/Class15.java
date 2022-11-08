package com.jagex;/* com.jagex.Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

import java.awt.Component;

public class Class15 {
	public static RSString aClass59_378 = Class55.method898(
			"Invalid loginserver requested)3", -10983);
	public static int anInt379;
	public static int anInt380;
	public byte[] aByteArray381;
	public static Class12_Sub12_Sub7_Sub2[] aClass12_Sub12_Sub7_Sub2Array382;
	public static RSString aClass59_383;
	public static int anInt384 = 0;
	public static int[] anIntArray385;
	public static Class62 aClass62_386;
	public static Class12_Sub12_Sub7_Sub2[] aClass12_Sub12_Sub7_Sub2Array387;
	public static int anInt388;
	public static int anInt389;
	public int[] anIntArray390;
	public static int anInt391;
	public static boolean aBoolean392;
	public static int anInt393;
	public int[] anIntArray394;
	public static int anInt395;
	public static RSString aClass59_396;
	public static int[] anIntArray397;
	public static byte aByte398;
	public static boolean aBoolean399;
	public static int anInt400;
	public static int anInt401;
	public static int[] anIntArray402;
	public static RSString aClass59_403;
	public static int anInt404;

	public static int method587(byte arg0, int arg1, int arg2) {
		try {
			anInt389++;
			int i = (Statics.method202(-1 + arg1, (byte) 106, arg2 - 1) - (-Statics
					.method202(1 + arg1, (byte) 106, -1 + arg2)
					+ -Statics
							.method202(-1 + arg1, (byte) 106, arg2 - -1) - Statics
					.method202(arg1 - -1, (byte) 106, arg2 - -1)));
			if (arg0 <= 72)
				method587((byte) 103, 27, -41);
			int i_0_ = (Statics.method202(-1 + arg1, (byte) 106, arg2) - (-Statics
					.method202(arg1 - -1, (byte) 106, arg2)
					- Statics.method202(arg1, (byte) 106, arg2 - 1) + -Statics
					.method202(arg1, (byte) 106, 1 + arg2)));
			int i_1_ = Statics.method202(arg1, (byte) 106, arg2);
			return i_0_ / 8 + (i / 16 + i_1_ / 4);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ec.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method588(int arg0) {
		try {
			anIntArray402 = null;
			aClass59_383 = null;
			aClass62_386 = null;
			anIntArray385 = null;
			aClass12_Sub12_Sub7_Sub2Array387 = null;
			aClass12_Sub12_Sub7_Sub2Array382 = null;
			aClass59_378 = null;
			aClass59_396 = null;
			aClass59_403 = null;
			if (arg0 != -25704)
				aBoolean392 = true;
			anIntArray397 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ec.F(" + arg0 + ')');
		}
	}

	public static boolean method589(int arg0, int arg1) {
		try {
			anInt380++;
			if (Class30.aBooleanArray749[arg0])
				return true;
			if (!Class55.aClass26_1298.method647(86, arg0))
				return false;
			int i = Class55.aClass26_1298.method645(arg0, false);
			if ((i ^ 0xffffffff) == -1) {
				Class30.aBooleanArray749[arg0] = true;
				return true;
			}
			if (arg1 != 14585)
				aBoolean392 = true;
			if (Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg0] == null)
				Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg0] = new Class12_Sub12_Sub3[i];
			for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				if ((Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg0][i_2_]) == null) {
					byte[] is = Class55.aClass26_1298.method631(arg0, true,
							i_2_);
					if (is != null) {
						Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg0][i_2_] = new Class12_Sub12_Sub3();
						Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg0][i_2_]
								.method297(new Buffer(is), 75);
					}
				}
			}
			Class30.aBooleanArray749[arg0] = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ec.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int method590(byte[] arg0, int arg1, byte[] arg2, int arg3,
			int arg4, byte arg5) {
		try {
			anInt393++;
			if (arg5 > -15)
				method588(-67);
			if (arg1 == 0)
				return 0;
			int i = 0;
			arg1 += arg4;
			int i_3_ = arg3;
			for (;;) {
				byte i_4_ = arg0[i_3_];
				if ((i_4_ ^ 0xffffffff) > -1)
					i = anIntArray394[i];
				else
					i++;
				int i_5_;
				if ((i_5_ = anIntArray394[i]) < 0) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if (arg4 >= arg1)
						break;
					i = 0;
				}
				if ((i_4_ & 0x40) == 0)
					i++;
				else
					i = anIntArray394[i];
				if ((i_5_ = anIntArray394[i]) < 0) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if ((arg1 ^ 0xffffffff) >= (arg4 ^ 0xffffffff))
						break;
					i = 0;
				}
				if ((i_4_ & 0x20) != 0)
					i = anIntArray394[i];
				else
					i++;
				if (((i_5_ = anIntArray394[i]) ^ 0xffffffff) > -1) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if ((arg1 ^ 0xffffffff) >= (arg4 ^ 0xffffffff))
						break;
					i = 0;
				}
				if ((i_4_ & 0x10 ^ 0xffffffff) != -1)
					i = anIntArray394[i];
				else
					i++;
				if (((i_5_ = anIntArray394[i]) ^ 0xffffffff) > -1) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if (arg4 >= arg1)
						break;
					i = 0;
				}
				if ((i_4_ & 0x8 ^ 0xffffffff) != -1)
					i = anIntArray394[i];
				else
					i++;
				if ((i_5_ = anIntArray394[i]) < 0) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if ((arg4 ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
						break;
					i = 0;
				}
				if ((i_4_ & 0x4 ^ 0xffffffff) == -1)
					i++;
				else
					i = anIntArray394[i];
				if ((i_5_ = anIntArray394[i]) < 0) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if ((arg1 ^ 0xffffffff) >= (arg4 ^ 0xffffffff))
						break;
					i = 0;
				}
				if ((i_4_ & 0x2 ^ 0xffffffff) != -1)
					i = anIntArray394[i];
				else
					i++;
				if ((i_5_ = anIntArray394[i]) < 0) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if (arg1 <= arg4)
						break;
					i = 0;
				}
				if ((i_4_ & 0x1) != 0)
					i = anIntArray394[i];
				else
					i++;
				if ((i_5_ = anIntArray394[i]) < 0) {
					arg2[arg4++] = (byte) (i_5_ ^ 0xffffffff);
					if ((arg4 ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
						break;
					i = 0;
				}
				i_3_++;
			}
			return -arg3 + (i_3_ - -1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ec.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ',' + arg5 + ')'));
		}
	}

	public static void method591(Signlink arg0, Component arg1, byte arg2) {
		try {
			anInt379++;
			try {
				Class14_Sub2 class14_sub2 = ((Class14_Sub2) Class.forName(
                        "com.jagex.Class14_Sub2_Sub2").newInstance());
				class14_sub2.method584(arg0, 2048);
				Class64.aClass14_1448 = class14_sub2;
				if (arg2 <= 75) {
					/* empty */
				}
			} catch (Throwable throwable) {
				try {
					Class64.aClass14_1448 = new Class14_Sub2_Sub1(arg0, arg1); // why?
				} catch (Throwable throwable_6_) {
					if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") >= 0) {
						try {
							Class64.aClass14_1448 = new Class14_Sub1();
							return;
						} catch (Throwable throwable_7_) {
							/* empty */
						}
					}
					Class64.aClass14_1448 = new Class14(8000);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ec.A("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public int method592(byte[] arg0, byte arg1, int arg2, byte[] arg3,
			int arg4, int arg5) {
		try {
			anInt388++;
			int i = 0;
			arg5 += arg2;
			if (arg1 < 4)
				aBoolean399 = true;
			int i_8_ = arg4 << -1941094653;
			for (/**/; arg2 < arg5; arg2++) {
				int i_9_ = 0xff & arg3[arg2];
				int i_10_ = anIntArray390[i_9_];
				int i_11_ = aByteArray381[i_9_];
				if ((i_11_ ^ 0xffffffff) == -1)
					throw new RuntimeException("No codeword for data value "
							+ i_9_);
				int i_12_ = 0x7 & i_8_;
				i &= -i_12_ >> 944834175;
				int i_13_ = i_8_ >> 1115549475;
				int i_14_ = (-1 + i_12_ - -i_11_ >> 1740613731) + i_13_;
				i_12_ += 24;
				arg0[i_13_] = (byte) (i = Class12_Sub12_Sub9.method421(i,
						i_10_ >>> i_12_));
				if ((i_14_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
					i_12_ -= 8;
					i_13_++;
					arg0[i_13_] = (byte) (i = i_10_ >>> i_12_);
					if ((i_13_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
						i_13_++;
						i_12_ -= 8;
						arg0[i_13_] = (byte) (i = i_10_ >>> i_12_);
						if (i_13_ < i_14_) {
							i_13_++;
							i_12_ -= 8;
							arg0[i_13_] = (byte) (i = i_10_ >>> i_12_);
							if ((i_13_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
								i_12_ -= 8;
								i_13_++;
								arg0[i_13_] = (byte) (i = i_10_ << -i_12_);
							}
						}
					}
				}
				i_8_ += i_11_;
			}
			return (i_8_ - -7 >> -1334703741) - arg4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ec.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + (arg3 != null ? "{...}" : "null") + ','
					+ arg4 + ',' + arg5 + ')'));
		}
	}

	public Class15(byte[] arg0) {
		try {
			int i = arg0.length;
			aByteArray381 = arg0;
			int[] is = new int[33];
			anIntArray390 = new int[i];
			int i_15_ = 0;
			anIntArray394 = new int[8];
			for (int i_16_ = 0; (i ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				int i_17_ = arg0[i_16_];
				if (i_17_ != 0) {
					int i_18_ = 1 << 32 + -i_17_;
					int i_19_ = is[i_17_];
					anIntArray390[i_16_] = i_19_;
					int i_20_;
					if ((i_19_ & i_18_ ^ 0xffffffff) != -1)
						i_20_ = is[-1 + i_17_];
					else {
						i_20_ = i_18_ | i_19_;
						for (int i_21_ = -1 + i_17_; (i_21_ ^ 0xffffffff) <= -2; i_21_--) {
							int i_22_ = is[i_21_];
							if ((i_22_ ^ 0xffffffff) != (i_19_ ^ 0xffffffff))
								break;
							int i_23_ = 1 << -i_21_ + 32;
							if ((i_22_ & i_23_ ^ 0xffffffff) == -1)
								is[i_21_] = Class12_Sub12_Sub9.method421(i_23_,
										i_22_);
							else {
								is[i_21_] = is[i_21_ - 1];
								break;
							}
						}
					}
					is[i_17_] = i_20_;
					for (int i_24_ = i_17_ + 1; (i_24_ ^ 0xffffffff) >= -33; i_24_++) {
						if ((i_19_ ^ 0xffffffff) == (is[i_24_] ^ 0xffffffff))
							is[i_24_] = i_20_;
					}
					int i_25_ = 0;
					for (int i_26_ = 0; i_26_ < i_17_; i_26_++) {
						int i_27_ = -2147483648 >>> i_26_;
						if ((i_27_ & i_19_ ^ 0xffffffff) != -1) {
							if ((anIntArray394[i_25_] ^ 0xffffffff) == -1)
								anIntArray394[i_25_] = i_15_;
							i_25_ = anIntArray394[i_25_];
						} else
							i_25_++;
						if (anIntArray394.length <= i_25_) {
							int[] is_28_ = new int[2 * anIntArray394.length];
							for (int i_29_ = 0; i_29_ < anIntArray394.length; i_29_++)
								is_28_[i_29_] = anIntArray394[i_29_];
							anIntArray394 = is_28_;
						}
						i_27_ >>>= 1;
					}
					if ((i_25_ ^ 0xffffffff) <= (i_15_ ^ 0xffffffff))
						i_15_ = 1 + i_25_;
					anIntArray394[i_25_] = i_16_ ^ 0xffffffff;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ec.<init>("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass59_383 = Class55.method898("level)2", -10983);
		aBoolean392 = false;
		anInt395 = 0;
		aClass59_396 = aClass59_383;
		anInt391 = 0;
		anInt400 = 3;
		anIntArray402 = new int[] { 0, -1, 0, 1 };
		aByte398 = (byte) 0;
		aClass59_403 = aClass59_378;
	}
}
