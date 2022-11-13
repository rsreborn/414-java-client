package com.jagex;/* com.jagex.Class12_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;

import java.awt.Component;

public class Class12_Sub12_Sub1 extends Class12_Sub12 {
	public static RSString aClass59_2029;
	public int anInt2030;
	public static int anInt2031;
	public static int anInt2032;
	public int anInt2033;
	public static int anInt2034;
	public static int anInt2035;
	public int anInt2036;
	public static RSString aClass59_2037;
	public int anInt2038;
	public static RSString aClass59_2039 = Class55.method898("titlebutton",
			-10983);
	public int anInt2040 = 0;
	public static volatile long aLong2041;
	public static int anInt2042;
	public boolean aBoolean2043;
	public static int anInt2044;
	public static int anInt2045;
	public int anInt2046;
	public static int anInt2047;
	public static long aLong2048;
	public static int anInt2049;
	public int anInt2050;
	public int anInt2051;
	public static RSString aClass59_2052;
	public static int anInt2053;
	public int anInt2054;
	public static Class12_Sub12_Sub7_Sub4 aClass12_Sub12_Sub7_Sub4_2055;
	public static volatile long aLong2056;

	public static int method274(int arg0, int arg1, int arg2) {
		try {
			anInt2045++;
			if (arg1 <= 122)
				return -114;
			if ((arg2 ^ 0xffffffff) == 1)
				return 12345678;
			if ((arg2 ^ 0xffffffff) == 0) {
				if ((arg0 ^ 0xffffffff) > -1)
					arg0 = 0;
				else if ((arg0 ^ 0xffffffff) < -128)
					arg0 = 127;
				arg0 = -arg0 + 127;
				return arg0;
			}
			arg0 = arg0 * (0x7f & arg2) / 128;
			if ((arg0 ^ 0xffffffff) > -3)
				arg0 = 2;
			else if ((arg0 ^ 0xffffffff) < -127)
				arg0 = 126;
			return (0xff80 & arg2) - -arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("bd.G(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method275(int arg0, byte arg1, int arg2, Buffer arg3) {
		try {
			if (arg2 == 1)
				anInt2040 = arg3.method233(16711680);
			else if (arg2 != 2) {
				if ((arg2 ^ 0xffffffff) != -6) {
					if ((arg2 ^ 0xffffffff) == -8)
						anInt2030 = arg3.method233(16711680);
				} else
					aBoolean2043 = false;
			} else
				anInt2050 = arg3.readUByte();
			if (arg1 != -87)
				method282(-25, false);
			anInt2034++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("bd.F(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static Class62 method276(Component arg0, int arg1, int arg2,
			boolean arg3) {
		try {
			anInt2032++;
			try {
				Class var_class = Class.forName("com.jagex.Class62_Sub1");
				Class62 class62 = (Class62) var_class.newInstance();
				if (arg3 != false)
					aClass12_Sub12_Sub7_Sub4_2055 = null;
				class62.method953(arg0, arg2, arg1, false);
				return class62;
			} catch (Throwable throwable) {
				Class62_Sub2 class62_sub2 = new Class62_Sub2();
				class62_sub2.method953(arg0, arg2, arg1, false);
				return class62_sub2;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("bd.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method277(byte arg0) {
		try {
			if (arg0 != 125)
				method279(-58, 11, -84, 68);
			aClass12_Sub12_Sub7_Sub4_2055 = null;
			aClass59_2029 = null;
			aClass59_2052 = null;
			aClass59_2037 = null;
			aClass59_2039 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bd.E(" + arg0 + ')');
		}
	}

	public void method278(boolean arg0) {
		if (anInt2030 != -1) {
			method282(anInt2030, true);
			anInt2033 = anInt2054;
			anInt2036 = anInt2038;
			anInt2051 = anInt2046;
		}
		method282(anInt2040, !arg0);
		anInt2049++;
		if (arg0 != false)
			method281(58, -30);
	}

	public static int method279(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt2053++;
			arg3 &= arg1;
			if ((arg3 ^ 0xffffffff) == -1)
				return arg0;
			if (arg3 == 1)
				return arg2;
			if (arg3 == 2)
				return -arg0 + 7;
			return -arg2 + 7;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("bd.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public void method280(byte arg0, Buffer arg1, int arg2) {
		try {
			int i = -10 % ((62 - arg0) / 54);
			for (;;) {
				int i_0_ = arg1.readUByte();
				if (i_0_ == 0)
					break;
				method275(arg2, (byte) -87, i_0_, arg1);
			}
			anInt2031++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("bd.I(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public static void method281(int arg0, int arg1) {
		try {
			anInt2035++;
			int[] is = Class31.aClass12_Sub12_Sub7_Sub1_753.anIntArray2578;
			int i = is.length;
			for (int i_1_ = 0; i > i_1_; i_1_++)
				is[i_1_] = 0;
			for (int i_2_ = arg1; (i_2_ ^ 0xffffffff) > -104; i_2_++) {
				int i_3_ = (52736 + -(i_2_ * 512)) * 4 + 24628;
				for (int i_4_ = 1; i_4_ < 103; i_4_++) {
					if (((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg0][i_4_][i_2_]) & 0x18 ^ 0xffffffff) == -1)
						Class12_Sub12_Sub8.aClass52_2295.method823(is, i_3_,
								512, arg0, i_4_, i_2_);
					if (arg0 < 3
							&& ((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg0 + 1][i_4_][i_2_]) & 0x8) != 0)
						Class12_Sub12_Sub8.aClass52_2295.method823(is, i_3_,
								512, arg0 + 1, i_4_, i_2_);
					i_3_ += 4;
				}
			}
			int i_5_ = ((-10 + (int) (Math.random() * 20.0) + 238 << 722501648)
					- (-(238 + (int) (20.0 * Math.random()) - 10 << -877460472) + 10)
					- -238 - -(int) (Math.random() * 20.0));
			int i_6_ = (int) (20.0 * Math.random()) + 238 - 10 << -1099112560;
			Class31.aClass12_Sub12_Sub7_Sub1_753.method356();
			for (int i_7_ = 1; (i_7_ ^ 0xffffffff) > -104; i_7_++) {
				for (int i_8_ = 1; i_8_ < 103; i_8_++) {
					if (((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg0][i_8_][i_7_]) & 0x18 ^ 0xffffffff) == -1)
						Class8.method90(i_7_, i_8_, i_5_, (byte) 19, i_6_, arg0);
					if ((arg0 ^ 0xffffffff) > -4
							&& ((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg0
									- -1][i_8_][i_7_]) & 0x8) != 0)
						Class8.method90(i_7_, i_8_, i_5_, (byte) 19, i_6_,
								1 + arg0);
				}
			}
			Class4.anInt144 = 0;
			for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -105; i_9_++) {
				for (int i_10_ = 0; i_10_ < 104; i_10_++) {
					int i_11_ = Class12_Sub12_Sub8.aClass52_2295.method864(
							RSString.anInt1504, i_9_, i_10_);
					if (i_11_ != 0) {
						i_11_ = 0x7fff & i_11_ >> 1540268622;
						int i_12_ = RSCanvas.method39(6, i_11_).anInt2313;
						if ((i_12_ ^ 0xffffffff) <= -1) {
							int i_13_ = i_9_;
							int i_14_ = i_10_;
							if (i_12_ != 22 && i_12_ != 29 && i_12_ != 34
									&& i_12_ != 36 && i_12_ != 46
									&& (i_12_ ^ 0xffffffff) != -48
									&& i_12_ != 48) {
								int[][] is_15_ = (Class11.aClass10Array280[RSString.anInt1504].anIntArrayArray222);
								for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -11; i_16_++) {
									int i_17_ = (int) (4.0 * Math.random());
									if ((i_17_ ^ 0xffffffff) == -1
											&& i_13_ > 0
											&& i_13_ > i_9_ - 3
											&& (is_15_[-1 + i_13_][i_14_] & 0x1280108) == 0)
										i_13_--;
									if (i_17_ == 1
											&& i_13_ < 103
											&& 3 + i_9_ > i_13_
											&& ((0x1280180 & is_15_[i_13_ - -1][i_14_]) ^ 0xffffffff) == -1)
										i_13_++;
									if (i_17_ == 2
											&& i_14_ > 0
											&& i_14_ > -3 + i_10_
											&& ((0x1280102 & is_15_[i_13_][i_14_ - 1]) ^ 0xffffffff) == -1)
										i_14_--;
									if (i_17_ == 3
											&& i_14_ < 103
											&& ((i_14_ ^ 0xffffffff) > (i_10_ + 3 ^ 0xffffffff))
											&& (0x1280120 & is_15_[i_13_][1 + i_14_]) == 0)
										i_14_++;
								}
							}
							Class32.aClass12_Sub12_Sub7_Sub1Array780[Class4.anInt144] = (Class38.aClass12_Sub12_Sub7_Sub1Array911[i_12_]);
							Class62_Sub2.anIntArray1929[Class4.anInt144] = i_13_;
							Class20.anIntArray479[Class4.anInt144] = i_14_;
							Class4.anInt144++;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bd.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method282(int arg0, boolean arg1) {
		anInt2047++;
		double d = (double) (0xff & arg0 >> -2078388248) / 256.0;
		double d_18_ = (double) ((arg0 & 0xfff4a0) >> -1084617200) / 256.0;
		double d_19_ = d_18_;
		double d_20_ = (double) (arg0 & 0xff) / 256.0;
		if (d_19_ > d)
			d_19_ = d;
		double d_21_ = 0.0;
		double d_22_ = d_18_;
		double d_23_ = 0.0;
		if (d_19_ > d_20_)
			d_19_ = d_20_;
		if (d > d_22_)
			d_22_ = d;
		if (arg1 != true)
			method275(74, (byte) -13, -33, null);
		if (d_22_ < d_20_)
			d_22_ = d_20_;
		double d_24_ = (d_19_ + d_22_) / 2.0;
		if (d_19_ != d_22_) {
			if (d_18_ == d_22_)
				d_23_ = (d - d_20_) / (-d_19_ + d_22_);
			else if (d != d_22_) {
				if (d_20_ == d_22_)
					d_23_ = (d_18_ - d) / (d_22_ - d_19_) + 4.0;
			} else
				d_23_ = (-d_18_ + d_20_) / (d_22_ - d_19_) + 2.0;
			if (d_24_ < 0.5)
				d_21_ = (d_22_ - d_19_) / (d_22_ + d_19_);
			if (d_24_ >= 0.5)
				d_21_ = (d_22_ - d_19_) / (-d_19_ + (2.0 - d_22_));
		}
		d_23_ /= 6.0;
		anInt2038 = (int) (d_23_ * 256.0);
		anInt2054 = (int) (d_24_ * 256.0);
		anInt2046 = (int) (d_21_ * 256.0);
		if (anInt2054 >= 0) {
			if ((anInt2054 ^ 0xffffffff) < -256)
				anInt2054 = 255;
		} else
			anInt2054 = 0;
		if ((anInt2046 ^ 0xffffffff) > -1)
			anInt2046 = 0;
		else if ((anInt2046 ^ 0xffffffff) < -256)
			anInt2046 = 255;
	}

	public Class12_Sub12_Sub1() {
		anInt2030 = -1;
		aBoolean2043 = true;
		anInt2050 = -1;
	}

	static {
		aClass59_2037 = Class55.method898("redstone1", -10983);
		anInt2044 = 0;
		anInt2042 = 500;
		aClass59_2052 = Class55.method898(
				"Enter name of friend to delete from list", -10983);
		aClass59_2029 = aClass59_2052;
		aLong2056 = 0L;
		aLong2041 = 0L;
	}
}
