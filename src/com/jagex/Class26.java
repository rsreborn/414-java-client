package com.jagex;/* com.jagex.Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;
import com.jagex.util.Statics;

import java.awt.Component;

public abstract class Class26 {
	public static int anInt578;
	public static int anInt579;
	public static int anInt580;
	public static int anInt581;
	public int[] anIntArray582;
	public static int anInt583;
	public static int anInt584;
	public static boolean aBoolean585;
	public static int anInt586;
	public static int anInt587;
	public int[][] anIntArrayArray588;
	public int[] anIntArray589;
	public int[] anIntArray590;
	public static RSString[] aClass59Array591;
	public static int anInt592;
	public byte[][][] aByteArrayArrayArray593;
	public static int anInt594;
	public static int anInt595;
	public static int anInt596 = 0;
	public static byte[][] aByteArrayArray597;
	public int[][] anIntArrayArray598;
	public int[] anIntArray599;
	public static int anInt600;
	public static int anInt601;
	public static int anInt602;
	public static int anInt603;
	public int checksum;
	public static int anInt605;
	public static int anInt606;
	public static int anInt607;
	public boolean aBoolean608;
	public static int anInt609;
	public static int anInt610;
	public static int anInt611;
	public static Class62 aClass62_612;
	public static int anInt613;
	public static RSString aClass59_614;
	public static int anInt615;
	public static int anInt616;
	public static RSString aClass59_617;
	public int anInt618;
	public Class1[] aClass1Array619;
	public byte[][] aByteArrayArray620;
	public static int anInt621;
	public static int anInt622;
	public Class1 aClass1_623;
	public static int[] anIntArray624;
	public boolean aBoolean625;
	public static int anInt626;
	public static int anInt627;
	public static int anInt628;
	public static int anInt629;
	public int[] anIntArray630;

	public static void method630(byte arg0) {
		try {
			aClass59Array591 = null;
			if (arg0 == -118) {
				aByteArrayArray597 = null;
				aClass62_612 = null;
				aClass59_617 = null;
				anIntArray624 = null;
				aClass59_614 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.U(" + arg0 + ')');
		}
	}

	public byte[] method631(int arg0, boolean arg1, int arg2) {
		try {
			anInt592++;
			if (arg1 != true)
				return null;
			return method639(arg2, (byte) 115, null, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.P(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method632(RSString arg0, int arg1) {
		try {
			int i = 38 / ((-4 - arg1) / 62);
			arg0 = arg0.method939((byte) 81);
			int i_0_ = aClass1_623.method43(arg0.method929((byte) 103), -1);
			anInt583++;
			if ((i_0_ ^ 0xffffffff) <= -1)
				method634(false, i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.NA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static void method633(byte arg0) {
		try {
			anInt580++;
			int i = 14 % ((arg0 - -85) / 38);
			synchronized (Class56.anObject1321) {
				if ((Class12_Sub12_Sub12.anInt2404 ^ 0xffffffff) == -1)
					Game.signlink.putNodeType2(new Class28(), 5);
				Class12_Sub12_Sub12.anInt2404 = 600;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.HA(" + arg0 + ')');
		}
	}

	public void method634(boolean arg0, int arg1) {
		try {
			if (arg0 != false)
				aBoolean608 = true;
			anInt628++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method635(int arg0) {
		try {
			if (arg0 != -1)
				aBoolean625 = true;
			anInt601++;
			boolean bool = true;
			for (int i = 0; i < anIntArray590.length; i++) {
				int i_1_ = anIntArray590[i];
				if (aByteArrayArray620[i_1_] == null) {
					method650(arg0 ^ ~0xff, i_1_);
					if (aByteArrayArray620[i_1_] == null)
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.S(" + arg0 + ')');
		}
	}

	public boolean method636(int[] arg0, byte arg1, int arg2) {
		try {
			anInt610++;
			if (aByteArrayArray620[arg2] == null)
				return false;
			int[] is = anIntArrayArray588[arg2];
			int i = anIntArray599[arg2];
			boolean bool = true;
			byte[][] is_2_ = aByteArrayArrayArray593[arg2];
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_++) {
				if (is_2_[is[i_3_]] == null) {
					bool = false;
					break;
				}
			}
			if (arg1 <= 34)
				method636(null, (byte) -128, 96);
			if (bool)
				return true;
			byte[] is_4_;
			if (arg0 == null
					|| ((arg0[0] ^ 0xffffffff) == -1 && arg0[1] == 0
							&& arg0[2] == 0 && arg0[3] == 0))
				is_4_ = aByteArrayArray620[arg2];
			else {
				is_4_ = new byte[aByteArrayArray620[arg2].length];
				Class22.method611(aByteArrayArray620[arg2], 0, is_4_, 0,
						is_4_.length);
				Buffer class12_sub11 = new Buffer(is_4_);
				class12_sub11.method223((byte) 78,
						class12_sub11.payload.length, arg0, 5);
			}
			byte[] is_5_;
			try {
				is_5_ = Class19.method600((byte) 98, is_4_);
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(
						runtimeexception,
						("T3 - "
								+ (arg0 != null)
								+ ","
								+ arg2
								+ ","
								+ is_4_.length
								+ ","
								+ Class12_Sub12_Sub5.method319(is_4_.length,
										is_4_, (byte) 52)
								+ ","
								+ Class12_Sub12_Sub5.method319(is_4_.length
										+ -2, is_4_, (byte) 52) + ","
								+ anIntArray582[arg2] + "," + checksum));
			}
			if (aBoolean625)
				aByteArrayArray620[arg2] = null;
			if (i <= 1)
				is_2_[is[0]] = is_5_;
			else {
				int i_6_ = is_5_.length;
				int i_7_ = is_5_[--i_6_] & 0xff;
				i_6_ -= i * i_7_ * 4;
				Buffer class12_sub11 = new Buffer(is_5_);
				class12_sub11.position = i_6_;
				int[] is_8_ = new int[i];
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_9_++) {
					int i_10_ = 0;
					for (int i_11_ = 0; i > i_11_; i_11_++) {
						i_10_ += class12_sub11.method207(-708753192);
						is_8_[i_11_] += i_10_;
					}
				}
				for (int i_12_ = 0; i_12_ < i; i_12_++) {
					if (is_2_[is[i_12_]] == null)
						is_2_[is[i_12_]] = new byte[is_8_[i_12_]];
					is_8_[i_12_] = 0;
				}
				class12_sub11.position = i_6_;
				int i_13_ = 0;
				for (int i_14_ = 0; i_14_ < i_7_; i_14_++) {
					int i_15_ = 0;
					for (int i_16_ = 0; i > i_16_; i_16_++) {
						i_15_ += class12_sub11.method207(-708753192);
						Class22.method611(is_5_, i_13_, is_2_[is[i_16_]],
								is_8_[i_16_], i_15_);
						i_13_ += i_15_;
						is_8_[i_16_] += i_15_;
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.JA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public byte[] method637(int arg0, int arg1, int arg2) {
		try {
			anInt586++;
			if (arg2 < 0
					|| ((aByteArrayArrayArray593.length ^ 0xffffffff) >= (arg2 ^ 0xffffffff))
					|| aByteArrayArrayArray593[arg2] == null
					|| (arg0 ^ 0xffffffff) > -1
					|| arg0 >= aByteArrayArrayArray593[arg2].length)
				return null;
			if (arg1 != 18054)
				return null;
			if (aByteArrayArrayArray593[arg2][arg0] == null) {
				boolean bool = method636(null, (byte) 38, arg2);
				if (!bool) {
					method650(255, arg2);
					bool = method636(null, (byte) 109, arg2);
					if (!bool)
						return null;
				}
			}
			byte[] is = aByteArrayArrayArray593[arg2][arg0];
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.MA(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public byte[] method638(int arg0, int arg1) {
		try {
			anInt602++;
			if (aByteArrayArrayArray593.length == 1)
				return method631(0, true, arg1);
			if (aByteArrayArrayArray593[arg1].length == 1)
				return method631(arg1, true, 0);
			if (arg0 != 15970)
				method656(-37, 103, 59);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.AA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public byte[] method639(int arg0, byte arg1, int[] arg2, int arg3) {
		try {
			if (arg1 < 76)
				method648(true, -99);
			anInt629++;
			if (arg3 < 0
					|| (arg3 ^ 0xffffffff) <= (aByteArrayArrayArray593.length ^ 0xffffffff)
					|| aByteArrayArrayArray593[arg3] == null || arg0 < 0
					|| aByteArrayArrayArray593[arg3].length <= arg0)
				return null;
			if (aByteArrayArrayArray593[arg3][arg0] == null) {
				boolean bool = method636(arg2, (byte) 103, arg3);
				if (!bool) {
					method650(255, arg3);
					bool = method636(arg2, (byte) 127, arg3);
					if (!bool)
						return null;
				}
			}
			byte[] is = aByteArrayArrayArray593[arg3][arg0];
			if (aBoolean608)
				aByteArrayArrayArray593[arg3][arg0] = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.PA(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ')'));
		}
	}

	public void method640(boolean arg0, byte[] arg1) {
		anInt594++;
		checksum = Class12_Sub12_Sub5.method319(arg1.length, arg1, (byte) 52);
		Buffer class12_sub11 = new Buffer(Class19.method600(
				(byte) 98, arg1));
		int i = class12_sub11.readSignedByte(true);
		if ((i ^ 0xffffffff) == -6) {
			int i_17_ = class12_sub11.readSignedByte(!arg0);
			anInt618 = class12_sub11.readShort(-1);
			anIntArray590 = new int[anInt618];
			int i_18_ = 0;
			int i_19_ = -1;
			for (int i_20_ = 0; (anInt618 ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
				anIntArray590[i_20_] = i_18_ += class12_sub11.readShort(-1);
				if ((i_19_ ^ 0xffffffff) > (anIntArray590[i_20_] ^ 0xffffffff))
					i_19_ = anIntArray590[i_20_];
			}
			aByteArrayArray620 = new byte[1 + i_19_][];
			anIntArray589 = new int[i_19_ - -1];
			if (arg0 != false)
				anIntArray630 = null;
			aByteArrayArrayArray593 = new byte[i_19_ - -1][][];
			anIntArrayArray588 = new int[1 + i_19_][];
			anIntArray582 = new int[1 + i_19_];
			anIntArray599 = new int[i_19_ - -1];
			if ((i_17_ ^ 0xffffffff) != -1) {
				anIntArray630 = new int[1 + i_19_];
				for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (anInt618 ^ 0xffffffff); i_21_++)
					anIntArray630[anIntArray590[i_21_]] = class12_sub11
							.method207(-708753192);
				aClass1_623 = new Class1(anIntArray630);
			}
			for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (anInt618 ^ 0xffffffff); i_22_++)
				anIntArray582[anIntArray590[i_22_]] = class12_sub11
						.method207(-708753192);
			for (int i_23_ = 0; (anInt618 ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++)
				anIntArray589[anIntArray590[i_23_]] = class12_sub11
						.method207(-708753192);
			for (int i_24_ = 0; i_24_ < anInt618; i_24_++)
				anIntArray599[anIntArray590[i_24_]] = class12_sub11
						.readShort(-1);
			for (int i_25_ = 0; anInt618 > i_25_; i_25_++) {
				i_18_ = 0;
				int i_26_ = anIntArray590[i_25_];
				int i_27_ = anIntArray599[i_26_];
				anIntArrayArray588[i_26_] = new int[i_27_];
				int i_28_ = -1;
				for (int i_29_ = 0; i_27_ > i_29_; i_29_++) {
					int i_30_ = (anIntArrayArray588[i_26_][i_29_] = i_18_ += class12_sub11
							.readShort(-1));
					if (i_28_ < i_30_)
						i_28_ = i_30_;
				}
				aByteArrayArrayArray593[i_26_] = new byte[1 + i_28_][];
			}
			if ((i_17_ ^ 0xffffffff) != -1) {
				aClass1Array619 = new Class1[i_19_ + 1];
				anIntArrayArray598 = new int[1 + i_19_][];
				for (int i_31_ = 0; (anInt618 ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
					int i_32_ = anIntArray590[i_31_];
					int i_33_ = anIntArray599[i_32_];
					anIntArrayArray598[i_32_] = new int[aByteArrayArrayArray593[i_32_].length];
					for (int i_34_ = 0; (i_33_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++)
						anIntArrayArray598[i_32_][(anIntArrayArray588[i_32_][i_34_])] = class12_sub11
								.method207(-708753192);
					aClass1Array619[i_32_] = new Class1(
							anIntArrayArray598[i_32_]);
				}
			}
		}
	}

	public static void method641(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			if (arg4 >= -51)
				method642(null, 43);
			anInt584++;
			int i = 0x7ff & -arg3 + 2048;
			int i_35_ = 0x7ff & 2048 + -arg0;
			int i_36_ = 0;
			int i_37_ = 0;
			int i_38_ = arg5;
			if ((i ^ 0xffffffff) != -1) {
				int i_39_ = Class12_Sub12_Sub11_Sub4.anIntArray2833[i];
				int i_40_ = Class12_Sub12_Sub11_Sub4.anIntArray2831[i];
				int i_41_ = i_37_ * i_39_ - i_38_ * i_40_ >> 1497284464;
				i_38_ = i_37_ * i_40_ - -(i_39_ * i_38_) >> -2090512048;
				i_37_ = i_41_;
			}
			if (i_35_ != 0) {
				int i_42_ = Class12_Sub12_Sub11_Sub4.anIntArray2831[i_35_];
				int i_43_ = Class12_Sub12_Sub11_Sub4.anIntArray2833[i_35_];
				int i_44_ = i_43_ * i_36_ + i_42_ * i_38_ >> 76303792;
				i_38_ = -(i_36_ * i_42_) + i_38_ * i_43_ >> 1417289360;
				i_36_ = i_44_;
			}
			Class57.anInt1339 = arg6 + -i_37_;
			Class20.anInt464 = -i_38_ + arg1;
			Class10.anInt250 = -i_36_ + arg2;
			Statics.anInt2021 = arg3;
			Class27.anInt645 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.R(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public static void method642(Component arg0, int arg1) {
		try {
			anInt622++;
			arg0.removeKeyListener(Class35.aClass49_837);
			if (arg1 == 32)
				arg0.removeFocusListener(Class35.aClass49_837);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.M("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public byte[] method643(RSString arg0, RSString arg1, int arg2) {
		try {
			if (arg2 != 255)
				method639(-59, (byte) -48, null, -35);
			arg0 = arg0.method939((byte) 56);
			anInt621++;
			arg1 = arg1.method939((byte) 67);
			int i = aClass1_623.method43(arg0.method929((byte) 103), -1);
			int i_45_ = aClass1Array619[i].method43(arg1.method929((byte) 103),
					-1);
			return method631(i, true, i_45_);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.OA("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public void method644(int arg0) {
		try {
			int i = 14 % ((arg0 - 65) / 43);
			anInt581++;
			for (int i_46_ = 0; aByteArrayArrayArray593.length > i_46_; i_46_++) {
				if (aByteArrayArrayArray593[i_46_] != null) {
					for (int i_47_ = 0; ((aByteArrayArrayArray593[i_46_].length ^ 0xffffffff) < (i_47_ ^ 0xffffffff)); i_47_++)
						aByteArrayArrayArray593[i_46_][i_47_] = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.CA(" + arg0 + ')');
		}
	}

	public int method645(int arg0, boolean arg1) {
		try {
			if (arg1 != false)
				anIntArray624 = null;
			anInt600++;
			return aByteArrayArrayArray593[arg0].length;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.KA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method646(int arg0, int arg1, int arg2) {
		try {
			anInt587++;
			if ((arg0 ^ 0xffffffff) > arg1
					|| ((aByteArrayArrayArray593.length ^ 0xffffffff) >= (arg0 ^ 0xffffffff))
					|| aByteArrayArrayArray593[arg0] == null
					|| (arg2 ^ 0xffffffff) > -1
					|| aByteArrayArrayArray593[arg0].length <= arg2)
				return false;
			if (aByteArrayArrayArray593[arg0][arg2] != null)
				return true;
			if (aByteArrayArray620[arg0] != null)
				return true;
			method650(255, arg0);
			if (aByteArrayArray620[arg0] != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.V(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public boolean method647(int arg0, int arg1) {
		try {
			anInt627++;
			if (aByteArrayArray620[arg1] != null)
				return true;
			int i = -3 / ((arg0 - -32) / 50);
			method650(255, arg1);
			if (aByteArrayArray620[arg1] != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.EA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method648(boolean arg0, int arg1) {
		try {
			int i = 0;
			if (arg0 != true)
				aClass1_623 = null;
			for (/**/; aByteArrayArrayArray593[arg1].length > i; i++)
				aByteArrayArrayArray593[arg1][i] = null;
			anInt613++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.LA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int method649(RSString arg0, int arg1) {
		try {
			if (arg1 != -22814)
				aClass59Array591 = null;
			anInt615++;
			arg0 = arg0.method939((byte) 93);
			return aClass1_623.method43(arg0.method929((byte) 103), -1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.GA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public void method650(int arg0, int arg1) {
		try {
			if (arg0 == 255)
				anInt607++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.F(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int[] method651(int arg0, int arg1) {
		try {
			anInt603++;
			if (arg1 <= 82)
				return null;
			return anIntArrayArray588[arg0];
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.BA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method652(RSString arg0, RSString arg1, int arg2) {
		try {
			arg0 = arg0.method939((byte) 97);
			if (arg2 != -1)
				anIntArray590 = null;
			arg1 = arg1.method939((byte) 99);
			anInt605++;
			int i = aClass1_623.method43(arg0.method929((byte) 103), arg2);
			int i_48_ = aClass1Array619[i].method43(arg1.method929((byte) 103),
					-1);
			return method646(i, -1, i_48_);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.N("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public int method653(int arg0) {
		try {
			if (arg0 != -1)
				return -57;
			anInt578++;
			return aByteArrayArrayArray593.length;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.FA(" + arg0 + ')');
		}
	}

	public byte[] method654(int arg0, int arg1) {
		try {
			anInt611++;
			if (aByteArrayArrayArray593.length == 1)
				return method637(arg0, 18054, 0);
			if ((aByteArrayArrayArray593[arg0].length ^ 0xffffffff) == -2)
				return method637(0, 18054, arg0);
			if (arg1 != 0)
				anIntArray630 = null;
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.W(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int method655(int arg0, byte arg1, RSString arg2) {
		try {
			if (arg1 != 57)
				method647(-22, 22);
			anInt606++;
			arg2 = arg2.method939((byte) -82);
			return aClass1Array619[arg0].method43(arg2.method929((byte) 103),
					-1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.DA(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static RSString method656(int arg0, int arg1, int arg2) {
		try {
			int i = -arg1 + arg2;
			anInt609++;
			if (i < -9)
				return Class44.aClass59_1035;
			if ((i ^ 0xffffffff) > 5)
				return Class9.aClass59_213;
			if ((i ^ 0xffffffff) > 2)
				return Statics.aClass59_2018;
			if (i < 0)
				return Class20.aClass59_480;
			if ((i ^ 0xffffffff) < -10)
				return Class12.aClass59_331;
			if (i > 6)
				return Class58.aClass59_1351;
			if (i > 3)
				return Class38.aClass59_908;
			if (arg0 < i)
				return Class43.aClass59_1019;
			return Class47.aClass59_1112;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.O(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static Class12_Sub12_Sub7_Sub1 method657(int arg0, int arg1,
			int arg2, byte arg3) {
		try {
			anInt579++;
			if (arg1 == 0) {
				Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = ((Class12_Sub12_Sub7_Sub1) Class12.aClass27_327
						.method673(120, (long) arg2));
				if (class12_sub12_sub7_sub1 != null
						&& class12_sub12_sub7_sub1.anInt2577 != arg0
						&& class12_sub12_sub7_sub1.anInt2577 != -1) {
					class12_sub12_sub7_sub1.method143((byte) 39);
					class12_sub12_sub7_sub1 = null;
				}
				if (class12_sub12_sub7_sub1 != null)
					return class12_sub12_sub7_sub1;
			}
			Class12_Sub12_Sub15 class12_sub12_sub15 = Class12_Sub12_Sub11_Sub5
					.method502((byte) 121, arg2);
			if (class12_sub12_sub15.anIntArray2479 == null)
				arg0 = -1;
			if (arg0 > 1) {
				int i = -1;
				for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -11; i_49_++) {
					if ((class12_sub12_sub15.anIntArray2482[i_49_] ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
							&& (class12_sub12_sub15.anIntArray2482[i_49_] ^ 0xffffffff) != -1)
						i = class12_sub12_sub15.anIntArray2479[i_49_];
				}
				if (i != -1)
					class12_sub12_sub15 = Class12_Sub12_Sub11_Sub5.method502(
							(byte) 121, i);
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = class12_sub12_sub15
					.method549(1, (byte) 59, true);
			if (class12_sub12_sub11_sub4 == null)
				return null;
			Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = null;
			if (class12_sub12_sub15.anInt2483 != -1) {
				class12_sub12_sub7_sub1 = method657(10, -1,
						class12_sub12_sub15.anInt2488, (byte) 118);
				if (class12_sub12_sub7_sub1 == null)
					return null;
			}
			int i = Class12_Sub12_Sub7.anInt2282;
			int[] is = Class12_Sub12_Sub7.anIntArray2281;
			int i_50_ = Class12_Sub12_Sub7.anInt2277;
			int i_51_ = Class12_Sub12_Sub7.anInt2280;
			int i_52_ = Class12_Sub12_Sub7.anInt2278;
			int i_53_ = Class12_Sub12_Sub7.anInt2279;
			int i_54_ = Class12_Sub12_Sub7.anInt2276;
			int i_55_ = 13 % ((arg3 - 85) / 32);
			int[] is_56_ = Class12_Sub12_Sub7_Sub3.method375();
			int i_57_ = Class12_Sub12_Sub7_Sub3.anInt2600;
			int i_58_ = Class12_Sub12_Sub7_Sub3.anInt2592;
			Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1_59_ = new Class12_Sub12_Sub7_Sub1(
					32, 32);
			Class12_Sub12_Sub7.method345(
					class12_sub12_sub7_sub1_59_.anIntArray2578, 32, 32);
			RuntimeException_Sub1.anIntArray1465 = Class12_Sub12_Sub7_Sub3
					.method376(RuntimeException_Sub1.anIntArray1465);
			Class12_Sub12_Sub7.method347(0, 0, 32, 32, 0);
			Class12_Sub12_Sub7_Sub3.aBoolean2597 = false;
			int i_60_ = class12_sub12_sub15.anInt2502;
			if (arg1 == -1)
				i_60_ = (int) (1.5 * (double) i_60_);
			if (arg1 > 0)
				i_60_ = (int) (1.04 * (double) i_60_);
			int i_61_ = (i_60_
					* (Class12_Sub12_Sub7_Sub3.anIntArray2602[class12_sub12_sub15.anInt2470]) >> -1267638064);
			int i_62_ = ((Class12_Sub12_Sub7_Sub3.anIntArray2596[class12_sub12_sub15.anInt2470])
					* i_60_ >> -2128002384);
			class12_sub12_sub11_sub4.method499();
			class12_sub12_sub11_sub4
					.method492(
							0,
							class12_sub12_sub15.anInt2489,
							class12_sub12_sub15.anInt2495,
							class12_sub12_sub15.anInt2470,
							class12_sub12_sub15.anInt2517,
							(class12_sub12_sub11_sub4.anInt2394 / 2 + i_62_ + class12_sub12_sub15.anInt2477),
							i_61_ + class12_sub12_sub15.anInt2477);
			for (int i_63_ = 31; i_63_ >= 0; i_63_--) {
				for (i_61_ = 31; (i_61_ ^ 0xffffffff) <= -1; i_61_--) {
					if (((class12_sub12_sub7_sub1_59_.anIntArray2578[i_61_ * 32
							+ i_63_]) ^ 0xffffffff) == -1) {
						if ((i_63_ ^ 0xffffffff) >= -1
								|| (class12_sub12_sub7_sub1_59_.anIntArray2578[32
										* i_61_ + (-1 + i_63_)]) <= 1) {
							if ((i_61_ ^ 0xffffffff) >= -1
									|| (class12_sub12_sub7_sub1_59_.anIntArray2578[32
											* i_61_ + -32 + i_63_]) <= 1) {
								if (i_63_ < 31
										&& ((class12_sub12_sub7_sub1_59_.anIntArray2578[1 + (i_63_ - -(32 * i_61_))]) ^ 0xffffffff) < -2)
									class12_sub12_sub7_sub1_59_.anIntArray2578[i_63_
											+ 32 * i_61_] = 1;
								else if ((i_61_ ^ 0xffffffff) > -32
										&& ((class12_sub12_sub7_sub1_59_.anIntArray2578[i_63_
												+ 32 + i_61_ * 32]) ^ 0xffffffff) < -2)
									class12_sub12_sub7_sub1_59_.anIntArray2578[i_61_
											* 32 + i_63_] = 1;
							} else
								class12_sub12_sub7_sub1_59_.anIntArray2578[32
										* i_61_ + i_63_] = 1;
						} else
							class12_sub12_sub7_sub1_59_.anIntArray2578[i_61_
									* 32 + i_63_] = 1;
					}
				}
			}
			if ((arg1 ^ 0xffffffff) < -1) {
				for (int i_64_ = 31; i_64_ >= 0; i_64_--) {
					for (i_61_ = 31; i_61_ >= 0; i_61_--) {
						if (((class12_sub12_sub7_sub1_59_.anIntArray2578[i_61_
								* 32 + i_64_]) ^ 0xffffffff) == -1) {
							if (i_64_ <= 0
									|| ((class12_sub12_sub7_sub1_59_.anIntArray2578[32
											* i_61_ + (-1 + i_64_)]) ^ 0xffffffff) != -2) {
								if (i_61_ > 0
										&& (class12_sub12_sub7_sub1_59_.anIntArray2578[i_64_
												- -(32 * (-1 + i_61_))]) == 1)
									class12_sub12_sub7_sub1_59_.anIntArray2578[32
											* i_61_ + i_64_] = arg1;
								else if (i_64_ < 31
										&& ((class12_sub12_sub7_sub1_59_.anIntArray2578[32
												* i_61_ + 1 + i_64_]) ^ 0xffffffff) == -2)
									class12_sub12_sub7_sub1_59_.anIntArray2578[i_64_
											+ i_61_ * 32] = arg1;
								else if (i_61_ < 31
										&& ((class12_sub12_sub7_sub1_59_.anIntArray2578[i_64_
												- -(32 * (1 + i_61_))]) ^ 0xffffffff) == -2)
									class12_sub12_sub7_sub1_59_.anIntArray2578[32
											* i_61_ + i_64_] = arg1;
							} else
								class12_sub12_sub7_sub1_59_.anIntArray2578[32
										* i_61_ + i_64_] = arg1;
						}
					}
				}
			} else if ((arg1 ^ 0xffffffff) == -1) {
				for (int i_65_ = 31; i_65_ >= 0; i_65_--) {
					for (i_61_ = 31; (i_61_ ^ 0xffffffff) <= -1; i_61_--) {
						if ((class12_sub12_sub7_sub1_59_.anIntArray2578[i_65_
								+ i_61_ * 32]) == 0
								&& i_65_ > 0
								&& i_61_ > 0
								&& (class12_sub12_sub7_sub1_59_.anIntArray2578[32
										* (-1 + i_61_) + (i_65_ + -1)]) > 0)
							class12_sub12_sub7_sub1_59_.anIntArray2578[32
									* i_61_ + i_65_] = 3153952;
					}
				}
			}
			if ((class12_sub12_sub15.anInt2483 ^ 0xffffffff) != 0) {
				int i_66_ = class12_sub12_sub7_sub1.anInt2575;
				class12_sub12_sub7_sub1.anInt2575 = 32;
				int i_67_ = class12_sub12_sub7_sub1.anInt2577;
				class12_sub12_sub7_sub1.anInt2577 = 32;
				class12_sub12_sub7_sub1.method352(0, 0);
				class12_sub12_sub7_sub1.anInt2577 = i_67_;
				class12_sub12_sub7_sub1.anInt2575 = i_66_;
			}
			if (arg1 == 0)
				Class12.aClass27_327.method678((byte) 123,
						class12_sub12_sub7_sub1_59_, (long) arg2);
			Class12_Sub12_Sub7.method345(is, i, i_50_);
			Class12_Sub12_Sub7.method346(i_51_, i_53_, i_52_, i_54_);
			Class12_Sub12_Sub7_Sub3.method376(is_56_);
			Class12_Sub12_Sub7_Sub3.anInt2600 = i_57_;
			Class12_Sub12_Sub7_Sub3.anInt2592 = i_58_;
			Class12_Sub12_Sub7_Sub3.method384();
			Class12_Sub12_Sub7_Sub3.aBoolean2597 = true;
			class12_sub12_sub7_sub1_59_.anInt2577 = arg0;
			if (class12_sub12_sub15.aBoolean2473)
				class12_sub12_sub7_sub1_59_.anInt2575 = 33;
			else
				class12_sub12_sub7_sub1_59_.anInt2575 = 32;
			return class12_sub12_sub7_sub1_59_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.Q(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static int method658(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt595++;
			int i = arg0 >> 804379431;
			int i_68_ = arg3 >> -928244665;
			if ((i ^ 0xffffffff) > -1 || i_68_ < 0 || i > 103 || i_68_ > 103)
				return 0;
			int i_69_ = arg2;
			if ((i_69_ ^ 0xffffffff) > -4
					&& ((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][i][i_68_]) & 0x2 ^ 0xffffffff) == -3)
				i_69_++;
			int i_70_ = arg0 & 0x7f;
			if (arg1 != -6)
				aClass59Array591 = null;
			int i_71_ = (i_70_
					* Statics.anIntArrayArrayArray569[i_69_][1 + i][i_68_] + (Statics.anIntArrayArrayArray569[i_69_][i][i_68_] * (128 + -i_70_))) >> 1589111719;
			int i_72_ = (((128 - i_70_) * Statics.anIntArrayArrayArray569[i_69_][i][i_68_ + 1]) + (Statics.anIntArrayArrayArray569[i_69_][i
					- -1][1 + i_68_] * i_70_)) >> -1173812601;
			int i_73_ = 0x7f & arg3;
			return i_73_ * i_72_ + i_71_ * (-i_73_ + 128) >> -1383738617;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("he.T(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public Class26(boolean arg0, boolean arg1) {
		try {
			aBoolean625 = arg0;
			aBoolean608 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "he.<init>(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		aClass59Array591 = new RSString[100];
		anInt616 = -1;
		aClass59_617 = Class55.method898("logo", -10983);
		aClass59_614 = Class55.method898(")1", -10983);
		anInt626 = -1;
		aBoolean585 = false;
		anIntArray624 = new int[256];
	}
}
