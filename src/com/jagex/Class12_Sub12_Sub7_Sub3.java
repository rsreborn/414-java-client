package com.jagex;/* com.jagex.Class12_Sub12_Sub7_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub12_Sub7_Sub3 extends Class12_Sub12_Sub7 {
	public static int anInt2590;
	public static int[] anIntArray2591 = new int[2048];
	public static int anInt2592;
	public static int anInt2593;
	public static int anInt2594;
	public static boolean aBoolean2595;
	public static int[] anIntArray2596 = new int[2048];
	public static boolean aBoolean2597;
	public static int anInt2598;
	public static int anInt2599;
	public static int anInt2600;
	public static int[] anIntArray2601;
	public static int[] anIntArray2602;
	public static int anInt2603;
	public static int[] anIntArray2604;
	public static boolean aBoolean2605;
	public static boolean aBoolean2606;
	public static Interface3 anInterface3_2607;
	public static int anInt2608;
	public static int[] anIntArray2609;

	public static void method372(int arg0, int arg1) {
		int i = anIntArray2601[0];
		int i_0_ = i / Class12_Sub12_Sub7.anInt2282;
		int i_1_ = i - i_0_ * Class12_Sub12_Sub7.anInt2282;
		anInt2598 = arg0 - i_1_;
		anInt2593 = arg1 - i_0_;
		anInt2603 = -anInt2598;
		anInt2599 = anInt2592 - anInt2598;
		anInt2594 = -anInt2593;
		anInt2608 = anInt2600 - anInt2593;
	}

	public static void method373(double arg0) {
		arg0 += Math.random() * 0.03 - 0.015;
		int i = 0;
		for (int i_2_ = 0; i_2_ < 512; i_2_++) {
			double d = (double) (i_2_ >> 3) / 64.0 + 0.0078125;
			double d_3_ = (double) (i_2_ & 0x7) / 8.0 + 0.0625;
			for (int i_4_ = 0; i_4_ < 128; i_4_++) {
				double d_5_ = (double) i_4_ / 128.0;
				double d_6_ = d_5_;
				double d_7_ = d_5_;
				double d_8_ = d_5_;
				if (d_3_ != 0.0) {
					double d_9_;
					if (d_5_ < 0.5)
						d_9_ = d_5_ * (1.0 + d_3_);
					else
						d_9_ = d_5_ + d_3_ - d_5_ * d_3_;
					double d_10_ = 2.0 * d_5_ - d_9_;
					double d_11_ = d + 0.3333333333333333;
					if (d_11_ > 1.0)
						d_11_--;
					double d_12_ = d;
					double d_13_ = d - 0.3333333333333333;
					if (d_13_ < 0.0)
						d_13_++;
					if (6.0 * d_11_ < 1.0)
						d_6_ = d_10_ + (d_9_ - d_10_) * 6.0 * d_11_;
					else if (2.0 * d_11_ < 1.0)
						d_6_ = d_9_;
					else if (3.0 * d_11_ < 2.0)
						d_6_ = d_10_
								+ ((d_9_ - d_10_)
										* (0.6666666666666666 - d_11_) * 6.0);
					else
						d_6_ = d_10_;
					if (6.0 * d_12_ < 1.0)
						d_7_ = d_10_ + (d_9_ - d_10_) * 6.0 * d_12_;
					else if (2.0 * d_12_ < 1.0)
						d_7_ = d_9_;
					else if (3.0 * d_12_ < 2.0)
						d_7_ = d_10_
								+ ((d_9_ - d_10_)
										* (0.6666666666666666 - d_12_) * 6.0);
					else
						d_7_ = d_10_;
					if (6.0 * d_13_ < 1.0)
						d_8_ = d_10_ + (d_9_ - d_10_) * 6.0 * d_13_;
					else if (2.0 * d_13_ < 1.0)
						d_8_ = d_9_;
					else if (3.0 * d_13_ < 2.0)
						d_8_ = d_10_
								+ ((d_9_ - d_10_)
										* (0.6666666666666666 - d_13_) * 6.0);
					else
						d_8_ = d_10_;
				}
				int i_14_ = (int) (d_6_ * 256.0);
				int i_15_ = (int) (d_7_ * 256.0);
				int i_16_ = (int) (d_8_ * 256.0);
				int i_17_ = (i_14_ << 16) + (i_15_ << 8) + i_16_;
				i_17_ = method382(i_17_, arg0);
				if (i_17_ == 0)
					i_17_ = 1;
				anIntArray2609[i++] = i_17_;
			}
		}
	}

	public static void method374(int[] arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		if (aBoolean2595) {
			if (arg5 > anInt2592)
				arg5 = anInt2592;
			if (arg4 < 0)
				arg4 = 0;
		}
		if (arg4 < arg5) {
			arg1 += arg4;
			arg3 = arg5 - arg4 >> 2;
			if (anInt2590 == 0) {
				while (--arg3 >= 0) {
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
				}
				arg3 = arg5 - arg4 & 0x3;
				while (--arg3 >= 0)
					arg0[arg1++] = arg2;
			} else {
				int i = anInt2590;
				int i_18_ = 256 - anInt2590;
				arg2 = (((arg2 & 0xff00ff) * i_18_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
						* i_18_ >> 8 & 0xff00));
				while (--arg3 >= 0) {
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
				}
				arg3 = arg5 - arg4 & 0x3;
				while (--arg3 >= 0)
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
			}
		}
	}

	public static int[] method375() {
		return anIntArray2601;
	}

	public static int[] method376(int[] arg0) {
		return method379(Class12_Sub12_Sub7.anInt2280,
				Class12_Sub12_Sub7.anInt2279, Class12_Sub12_Sub7.anInt2278,
				Class12_Sub12_Sub7.anInt2276, arg0);
	}

	public static void method377(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, int arg12, int arg13, int arg14, int arg15,
			int arg16, int arg17, int arg18) {
		int[] is = anInterface3_2607.method7(5370, arg18);
		if (is == null) {
			int i = anInterface3_2607.method6(arg18, (byte) -127);
			method378(arg0, arg1, arg2, arg3, arg4, arg5, method381(i, arg6),
					method381(i, arg7), method381(i, arg8));
		} else {
			aBoolean2606 = anInterface3_2607.method9(arg18, 15390);
			aBoolean2605 = anInterface3_2607.method8(arg18, 118);
			arg10 = arg9 - arg10;
			arg13 = arg12 - arg13;
			arg16 = arg15 - arg16;
			arg11 -= arg9;
			arg14 -= arg12;
			arg17 -= arg15;
			int i = arg11 * arg12 - arg14 * arg9 << 14;
			int i_19_ = arg14 * arg15 - arg17 * arg12 << 8;
			int i_20_ = arg17 * arg9 - arg11 * arg15 << 5;
			int i_21_ = arg10 * arg12 - arg13 * arg9 << 14;
			int i_22_ = arg13 * arg15 - arg16 * arg12 << 8;
			int i_23_ = arg16 * arg9 - arg10 * arg15 << 5;
			int i_24_ = arg13 * arg11 - arg10 * arg14 << 14;
			int i_25_ = arg16 * arg14 - arg13 * arg17 << 8;
			int i_26_ = arg10 * arg17 - arg16 * arg11 << 5;
			int i_27_ = 0;
			int i_28_ = 0;
			if (arg1 != arg0) {
				i_27_ = (arg4 - arg3 << 16) / (arg1 - arg0);
				i_28_ = (arg7 - arg6 << 16) / (arg1 - arg0);
			}
			int i_29_ = 0;
			int i_30_ = 0;
			if (arg2 != arg1) {
				i_29_ = (arg5 - arg4 << 16) / (arg2 - arg1);
				i_30_ = (arg8 - arg7 << 16) / (arg2 - arg1);
			}
			int i_31_ = 0;
			int i_32_ = 0;
			if (arg2 != arg0) {
				i_31_ = (arg3 - arg5 << 16) / (arg0 - arg2);
				i_32_ = (arg6 - arg8 << 16) / (arg0 - arg2);
			}
			if (arg0 <= arg1 && arg0 <= arg2) {
				if (arg0 < anInt2600) {
					if (arg1 > anInt2600)
						arg1 = anInt2600;
					if (arg2 > anInt2600)
						arg2 = anInt2600;
					if (arg1 < arg2) {
						arg5 = arg3 <<= 16;
						arg8 = arg6 <<= 16;
						if (arg0 < 0) {
							arg5 -= i_31_ * arg0;
							arg3 -= i_27_ * arg0;
							arg8 -= i_32_ * arg0;
							arg6 -= i_28_ * arg0;
							arg0 = 0;
						}
						arg4 <<= 16;
						arg7 <<= 16;
						if (arg1 < 0) {
							arg4 -= i_29_ * arg1;
							arg7 -= i_30_ * arg1;
							arg1 = 0;
						}
						int i_33_ = arg0 - anInt2593;
						i += i_20_ * i_33_;
						i_21_ += i_23_ * i_33_;
						i_24_ += i_26_ * i_33_;
						if (arg0 != arg1 && i_31_ < i_27_ || arg0 == arg1
								&& i_31_ > i_29_) {
							arg2 -= arg1;
							arg1 -= arg0;
							arg0 = anIntArray2601[arg0];
							while (--arg1 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg5 >> 16, arg3 >> 16,
										arg8 >> 8, arg6 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_31_;
								arg3 += i_27_;
								arg8 += i_32_;
								arg6 += i_28_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg5 >> 16, arg4 >> 16,
										arg8 >> 8, arg7 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_31_;
								arg4 += i_29_;
								arg8 += i_32_;
								arg7 += i_30_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						} else {
							arg2 -= arg1;
							arg1 -= arg0;
							arg0 = anIntArray2601[arg0];
							while (--arg1 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg3 >> 16, arg5 >> 16,
										arg6 >> 8, arg8 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_31_;
								arg3 += i_27_;
								arg8 += i_32_;
								arg6 += i_28_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg4 >> 16, arg5 >> 16,
										arg7 >> 8, arg8 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_31_;
								arg4 += i_29_;
								arg8 += i_32_;
								arg7 += i_30_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						}
					} else {
						arg4 = arg3 <<= 16;
						arg7 = arg6 <<= 16;
						if (arg0 < 0) {
							arg4 -= i_31_ * arg0;
							arg3 -= i_27_ * arg0;
							arg7 -= i_32_ * arg0;
							arg6 -= i_28_ * arg0;
							arg0 = 0;
						}
						arg5 <<= 16;
						arg8 <<= 16;
						if (arg2 < 0) {
							arg5 -= i_29_ * arg2;
							arg8 -= i_30_ * arg2;
							arg2 = 0;
						}
						int i_34_ = arg0 - anInt2593;
						i += i_20_ * i_34_;
						i_21_ += i_23_ * i_34_;
						i_24_ += i_26_ * i_34_;
						if (arg0 != arg2 && i_31_ < i_27_ || arg0 == arg2
								&& i_29_ > i_27_) {
							arg1 -= arg2;
							arg2 -= arg0;
							arg0 = anIntArray2601[arg0];
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg4 >> 16, arg3 >> 16,
										arg7 >> 8, arg6 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg4 += i_31_;
								arg3 += i_27_;
								arg7 += i_32_;
								arg6 += i_28_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg1 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg5 >> 16, arg3 >> 16,
										arg8 >> 8, arg6 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_29_;
								arg3 += i_27_;
								arg8 += i_30_;
								arg6 += i_28_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						} else {
							arg1 -= arg2;
							arg2 -= arg0;
							arg0 = anIntArray2601[arg0];
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg3 >> 16, arg4 >> 16,
										arg6 >> 8, arg7 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg4 += i_31_;
								arg3 += i_27_;
								arg7 += i_32_;
								arg6 += i_28_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg1 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg0, arg3 >> 16, arg5 >> 16,
										arg6 >> 8, arg8 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_29_;
								arg3 += i_27_;
								arg8 += i_30_;
								arg6 += i_28_;
								arg0 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						}
					}
				}
			} else if (arg1 <= arg2) {
				if (arg1 < anInt2600) {
					if (arg2 > anInt2600)
						arg2 = anInt2600;
					if (arg0 > anInt2600)
						arg0 = anInt2600;
					if (arg2 < arg0) {
						arg3 = arg4 <<= 16;
						arg6 = arg7 <<= 16;
						if (arg1 < 0) {
							arg3 -= i_27_ * arg1;
							arg4 -= i_29_ * arg1;
							arg6 -= i_28_ * arg1;
							arg7 -= i_30_ * arg1;
							arg1 = 0;
						}
						arg5 <<= 16;
						arg8 <<= 16;
						if (arg2 < 0) {
							arg5 -= i_31_ * arg2;
							arg8 -= i_32_ * arg2;
							arg2 = 0;
						}
						int i_35_ = arg1 - anInt2593;
						i += i_20_ * i_35_;
						i_21_ += i_23_ * i_35_;
						i_24_ += i_26_ * i_35_;
						if (arg1 != arg2 && i_27_ < i_29_ || arg1 == arg2
								&& i_27_ > i_31_) {
							arg0 -= arg2;
							arg2 -= arg1;
							arg1 = anIntArray2601[arg1];
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg3 >> 16, arg4 >> 16,
										arg6 >> 8, arg7 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg3 += i_27_;
								arg4 += i_29_;
								arg6 += i_28_;
								arg7 += i_30_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg0 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg3 >> 16, arg5 >> 16,
										arg6 >> 8, arg8 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg3 += i_27_;
								arg5 += i_31_;
								arg6 += i_28_;
								arg8 += i_32_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						} else {
							arg0 -= arg2;
							arg2 -= arg1;
							arg1 = anIntArray2601[arg1];
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg4 >> 16, arg3 >> 16,
										arg7 >> 8, arg6 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg3 += i_27_;
								arg4 += i_29_;
								arg6 += i_28_;
								arg7 += i_30_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg0 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg5 >> 16, arg3 >> 16,
										arg8 >> 8, arg6 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg3 += i_27_;
								arg5 += i_31_;
								arg6 += i_28_;
								arg8 += i_32_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						}
					} else {
						arg5 = arg4 <<= 16;
						arg8 = arg7 <<= 16;
						if (arg1 < 0) {
							arg5 -= i_27_ * arg1;
							arg4 -= i_29_ * arg1;
							arg8 -= i_28_ * arg1;
							arg7 -= i_30_ * arg1;
							arg1 = 0;
						}
						arg3 <<= 16;
						arg6 <<= 16;
						if (arg0 < 0) {
							arg3 -= i_31_ * arg0;
							arg6 -= i_32_ * arg0;
							arg0 = 0;
						}
						int i_36_ = arg1 - anInt2593;
						i += i_20_ * i_36_;
						i_21_ += i_23_ * i_36_;
						i_24_ += i_26_ * i_36_;
						if (i_27_ < i_29_) {
							arg2 -= arg0;
							arg0 -= arg1;
							arg1 = anIntArray2601[arg1];
							while (--arg0 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg5 >> 16, arg4 >> 16,
										arg8 >> 8, arg7 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_27_;
								arg4 += i_29_;
								arg8 += i_28_;
								arg7 += i_30_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg3 >> 16, arg4 >> 16,
										arg6 >> 8, arg7 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg3 += i_31_;
								arg4 += i_29_;
								arg6 += i_32_;
								arg7 += i_30_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						} else {
							arg2 -= arg0;
							arg0 -= arg1;
							arg1 = anIntArray2601[arg1];
							while (--arg0 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg4 >> 16, arg5 >> 16,
										arg7 >> 8, arg8 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg5 += i_27_;
								arg4 += i_29_;
								arg8 += i_28_;
								arg7 += i_30_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
							while (--arg2 >= 0) {
								method383(Class12_Sub12_Sub7.anIntArray2281,
										is, 0, 0, arg1, arg4 >> 16, arg3 >> 16,
										arg7 >> 8, arg6 >> 8, i, i_21_, i_24_,
										i_19_, i_22_, i_25_);
								arg3 += i_31_;
								arg4 += i_29_;
								arg6 += i_32_;
								arg7 += i_30_;
								arg1 += Class12_Sub12_Sub7.anInt2282;
								i += i_20_;
								i_21_ += i_23_;
								i_24_ += i_26_;
							}
						}
					}
				}
			} else if (arg2 < anInt2600) {
				if (arg0 > anInt2600)
					arg0 = anInt2600;
				if (arg1 > anInt2600)
					arg1 = anInt2600;
				if (arg0 < arg1) {
					arg4 = arg5 <<= 16;
					arg7 = arg8 <<= 16;
					if (arg2 < 0) {
						arg4 -= i_29_ * arg2;
						arg5 -= i_31_ * arg2;
						arg7 -= i_30_ * arg2;
						arg8 -= i_32_ * arg2;
						arg2 = 0;
					}
					arg3 <<= 16;
					arg6 <<= 16;
					if (arg0 < 0) {
						arg3 -= i_27_ * arg0;
						arg6 -= i_28_ * arg0;
						arg0 = 0;
					}
					int i_37_ = arg2 - anInt2593;
					i += i_20_ * i_37_;
					i_21_ += i_23_ * i_37_;
					i_24_ += i_26_ * i_37_;
					if (i_29_ < i_31_) {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 = anIntArray2601[arg2];
						while (--arg0 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8,
									arg8 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg4 += i_29_;
							arg5 += i_31_;
							arg7 += i_30_;
							arg8 += i_32_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
						while (--arg1 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8,
									arg6 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg4 += i_29_;
							arg3 += i_27_;
							arg7 += i_30_;
							arg6 += i_28_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
					} else {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 = anIntArray2601[arg2];
						while (--arg0 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8,
									arg7 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg4 += i_29_;
							arg5 += i_31_;
							arg7 += i_30_;
							arg8 += i_32_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
						while (--arg1 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8,
									arg7 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg4 += i_29_;
							arg3 += i_27_;
							arg7 += i_30_;
							arg6 += i_28_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
					}
				} else {
					arg3 = arg5 <<= 16;
					arg6 = arg8 <<= 16;
					if (arg2 < 0) {
						arg3 -= i_29_ * arg2;
						arg5 -= i_31_ * arg2;
						arg6 -= i_30_ * arg2;
						arg8 -= i_32_ * arg2;
						arg2 = 0;
					}
					arg4 <<= 16;
					arg7 <<= 16;
					if (arg1 < 0) {
						arg4 -= i_27_ * arg1;
						arg7 -= i_28_ * arg1;
						arg1 = 0;
					}
					int i_38_ = arg2 - anInt2593;
					i += i_20_ * i_38_;
					i_21_ += i_23_ * i_38_;
					i_24_ += i_26_ * i_38_;
					if (i_29_ < i_31_) {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 = anIntArray2601[arg2];
						while (--arg1 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8,
									arg8 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg3 += i_29_;
							arg5 += i_31_;
							arg6 += i_30_;
							arg8 += i_32_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
						while (--arg0 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8,
									arg8 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg4 += i_27_;
							arg5 += i_31_;
							arg7 += i_28_;
							arg8 += i_32_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
					} else {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 = anIntArray2601[arg2];
						while (--arg1 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8,
									arg6 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg3 += i_29_;
							arg5 += i_31_;
							arg6 += i_30_;
							arg8 += i_32_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
						while (--arg0 >= 0) {
							method383(Class12_Sub12_Sub7.anIntArray2281, is, 0,
									0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8,
									arg7 >> 8, i, i_21_, i_24_, i_19_, i_22_,
									i_25_);
							arg4 += i_27_;
							arg5 += i_31_;
							arg7 += i_28_;
							arg8 += i_32_;
							arg2 += Class12_Sub12_Sub7.anInt2282;
							i += i_20_;
							i_21_ += i_23_;
							i_24_ += i_26_;
						}
					}
				}
			}
		}
	}

	public static void method378(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = 0;
		int i_39_ = 0;
		if (arg1 != arg0) {
			i = (arg4 - arg3 << 16) / (arg1 - arg0);
			i_39_ = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		int i_40_ = 0;
		int i_41_ = 0;
		if (arg2 != arg1) {
			i_40_ = (arg5 - arg4 << 16) / (arg2 - arg1);
			i_41_ = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		int i_42_ = 0;
		int i_43_ = 0;
		if (arg2 != arg0) {
			i_42_ = (arg3 - arg5 << 16) / (arg0 - arg2);
			i_43_ = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt2600) {
				if (arg1 > anInt2600)
					arg1 = anInt2600;
				if (arg2 > anInt2600)
					arg2 = anInt2600;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 16;
					arg8 = arg6 <<= 15;
					if (arg0 < 0) {
						arg5 -= i_42_ * arg0;
						arg3 -= i * arg0;
						arg8 -= i_43_ * arg0;
						arg6 -= i_39_ * arg0;
						arg0 = 0;
					}
					arg4 <<= 16;
					arg7 <<= 15;
					if (arg1 < 0) {
						arg4 -= i_40_ * arg1;
						arg7 -= i_41_ * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && i_42_ < i || arg0 == arg1
							&& i_42_ > i_40_) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg1 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
									arg6 >> 7);
							arg5 += i_42_;
							arg3 += i;
							arg8 += i_43_;
							arg6 += i_39_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
									arg7 >> 7);
							arg5 += i_42_;
							arg4 += i_40_;
							arg8 += i_43_;
							arg7 += i_41_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg1 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
									arg8 >> 7);
							arg5 += i_42_;
							arg3 += i;
							arg8 += i_43_;
							arg6 += i_39_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
									arg8 >> 7);
							arg5 += i_42_;
							arg4 += i_40_;
							arg8 += i_43_;
							arg7 += i_41_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				} else {
					arg4 = arg3 <<= 16;
					arg7 = arg6 <<= 15;
					if (arg0 < 0) {
						arg4 -= i_42_ * arg0;
						arg3 -= i * arg0;
						arg7 -= i_43_ * arg0;
						arg6 -= i_39_ * arg0;
						arg0 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= i_40_ * arg2;
						arg8 -= i_41_ * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && i_42_ < i || arg0 == arg2 && i_40_ > i) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
									arg6 >> 7);
							arg4 += i_42_;
							arg3 += i;
							arg7 += i_43_;
							arg6 += i_39_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg1 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
									arg6 >> 7);
							arg5 += i_40_;
							arg3 += i;
							arg8 += i_41_;
							arg6 += i_39_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
									arg7 >> 7);
							arg4 += i_42_;
							arg3 += i;
							arg7 += i_43_;
							arg6 += i_39_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg1 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg0,
									0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
									arg8 >> 7);
							arg5 += i_40_;
							arg3 += i;
							arg8 += i_41_;
							arg6 += i_39_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt2600) {
				if (arg2 > anInt2600)
					arg2 = anInt2600;
				if (arg0 > anInt2600)
					arg0 = anInt2600;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 16;
					arg6 = arg7 <<= 15;
					if (arg1 < 0) {
						arg3 -= i * arg1;
						arg4 -= i_40_ * arg1;
						arg6 -= i_39_ * arg1;
						arg7 -= i_41_ * arg1;
						arg1 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= i_42_ * arg2;
						arg8 -= i_43_ * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && i < i_40_ || arg1 == arg2 && i > i_42_) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
									arg7 >> 7);
							arg3 += i;
							arg4 += i_40_;
							arg6 += i_39_;
							arg7 += i_41_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg0 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
									arg8 >> 7);
							arg3 += i;
							arg5 += i_42_;
							arg6 += i_39_;
							arg8 += i_43_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
									arg6 >> 7);
							arg3 += i;
							arg4 += i_40_;
							arg6 += i_39_;
							arg7 += i_41_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg0 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
									arg6 >> 7);
							arg3 += i;
							arg5 += i_42_;
							arg6 += i_39_;
							arg8 += i_43_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				} else {
					arg5 = arg4 <<= 16;
					arg8 = arg7 <<= 15;
					if (arg1 < 0) {
						arg5 -= i * arg1;
						arg4 -= i_40_ * arg1;
						arg8 -= i_39_ * arg1;
						arg7 -= i_41_ * arg1;
						arg1 = 0;
					}
					arg3 <<= 16;
					arg6 <<= 15;
					if (arg0 < 0) {
						arg3 -= i_42_ * arg0;
						arg6 -= i_43_ * arg0;
						arg0 = 0;
					}
					if (i < i_40_) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg0 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
									arg7 >> 7);
							arg5 += i;
							arg4 += i_40_;
							arg8 += i_39_;
							arg7 += i_41_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
									arg7 >> 7);
							arg3 += i_42_;
							arg4 += i_40_;
							arg6 += i_43_;
							arg7 += i_41_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg0 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
									arg8 >> 7);
							arg5 += i;
							arg4 += i_40_;
							arg8 += i_39_;
							arg7 += i_41_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method385(Class12_Sub12_Sub7.anIntArray2281, arg1,
									0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
									arg6 >> 7);
							arg3 += i_42_;
							arg4 += i_40_;
							arg6 += i_43_;
							arg7 += i_41_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				}
			}
		} else if (arg2 < anInt2600) {
			if (arg0 > anInt2600)
				arg0 = anInt2600;
			if (arg1 > anInt2600)
				arg1 = anInt2600;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 16;
				arg7 = arg8 <<= 15;
				if (arg2 < 0) {
					arg4 -= i_40_ * arg2;
					arg5 -= i_42_ * arg2;
					arg7 -= i_41_ * arg2;
					arg8 -= i_43_ * arg2;
					arg2 = 0;
				}
				arg3 <<= 16;
				arg6 <<= 15;
				if (arg0 < 0) {
					arg3 -= i * arg0;
					arg6 -= i_39_ * arg0;
					arg0 = 0;
				}
				if (i_40_ < i_42_) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg0 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += i_40_;
						arg5 += i_42_;
						arg7 += i_41_;
						arg8 += i_43_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg1 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
						arg4 += i_40_;
						arg3 += i;
						arg7 += i_41_;
						arg6 += i_39_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg0 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += i_40_;
						arg5 += i_42_;
						arg7 += i_41_;
						arg8 += i_43_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg1 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
						arg4 += i_40_;
						arg3 += i;
						arg7 += i_41_;
						arg6 += i_39_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				}
			} else {
				arg3 = arg5 <<= 16;
				arg6 = arg8 <<= 15;
				if (arg2 < 0) {
					arg3 -= i_40_ * arg2;
					arg5 -= i_42_ * arg2;
					arg6 -= i_41_ * arg2;
					arg8 -= i_43_ * arg2;
					arg2 = 0;
				}
				arg4 <<= 16;
				arg7 <<= 15;
				if (arg1 < 0) {
					arg4 -= i * arg1;
					arg7 -= i_39_ * arg1;
					arg1 = 0;
				}
				if (i_40_ < i_42_) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg1 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += i_40_;
						arg5 += i_42_;
						arg6 += i_41_;
						arg8 += i_43_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg0 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += i;
						arg5 += i_42_;
						arg7 += i_39_;
						arg8 += i_43_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg1 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += i_40_;
						arg5 += i_42_;
						arg6 += i_41_;
						arg8 += i_43_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg0 >= 0) {
						method385(Class12_Sub12_Sub7.anIntArray2281, arg2, 0,
								0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += i;
						arg5 += i_42_;
						arg7 += i_39_;
						arg8 += i_43_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				}
			}
		}
	}

	public static int[] method379(int arg0, int arg1, int arg2, int arg3,
			int[] arg4) {
		anInt2592 = arg2 - arg0;
		anInt2600 = arg3 - arg1;
		if (arg4 == null) {
			int i = anInt2600;
			if (i == 0)
				i++;
			anIntArray2601 = new int[i];
			for (int i_44_ = 0; i_44_ < i; i_44_++)
				anIntArray2601[i_44_] = (arg1 + i_44_)
						* Class12_Sub12_Sub7.anInt2282 + arg0;
		} else
			anIntArray2601 = arg4;
		method384();
		return anIntArray2601;
	}

	public static void method380(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		int i = 0;
		if (arg1 != arg0)
			i = (arg4 - arg3 << 16) / (arg1 - arg0);
		int i_45_ = 0;
		if (arg2 != arg1)
			i_45_ = (arg5 - arg4 << 16) / (arg2 - arg1);
		int i_46_ = 0;
		if (arg2 != arg0)
			i_46_ = (arg3 - arg5 << 16) / (arg0 - arg2);
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt2600) {
				if (arg1 > anInt2600)
					arg1 = anInt2600;
				if (arg2 > anInt2600)
					arg2 = anInt2600;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 16;
					if (arg0 < 0) {
						arg5 -= i_46_ * arg0;
						arg3 -= i * arg0;
						arg0 = 0;
					}
					arg4 <<= 16;
					if (arg1 < 0) {
						arg4 -= i_45_ * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && i_46_ < i || arg0 == arg1
							&& i_46_ > i_45_) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg1 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg5 >> 16, arg3 >> 16);
							arg5 += i_46_;
							arg3 += i;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg5 >> 16, arg4 >> 16);
							arg5 += i_46_;
							arg4 += i_45_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg1 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg3 >> 16, arg5 >> 16);
							arg5 += i_46_;
							arg3 += i;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg4 >> 16, arg5 >> 16);
							arg5 += i_46_;
							arg4 += i_45_;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				} else {
					arg4 = arg3 <<= 16;
					if (arg0 < 0) {
						arg4 -= i_46_ * arg0;
						arg3 -= i * arg0;
						arg0 = 0;
					}
					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= i_45_ * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && i_46_ < i || arg0 == arg2 && i_45_ > i) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg4 >> 16, arg3 >> 16);
							arg4 += i_46_;
							arg3 += i;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg1 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg5 >> 16, arg3 >> 16);
							arg5 += i_45_;
							arg3 += i;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray2601[arg0];
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg3 >> 16, arg4 >> 16);
							arg4 += i_46_;
							arg3 += i;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg1 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg0,
									arg6, 0, arg3 >> 16, arg5 >> 16);
							arg5 += i_45_;
							arg3 += i;
							arg0 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt2600) {
				if (arg2 > anInt2600)
					arg2 = anInt2600;
				if (arg0 > anInt2600)
					arg0 = anInt2600;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 16;
					if (arg1 < 0) {
						arg3 -= i * arg1;
						arg4 -= i_45_ * arg1;
						arg1 = 0;
					}
					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= i_46_ * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && i < i_45_ || arg1 == arg2 && i > i_46_) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg3 >> 16, arg4 >> 16);
							arg3 += i;
							arg4 += i_45_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg0 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg3 >> 16, arg5 >> 16);
							arg3 += i;
							arg5 += i_46_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg4 >> 16, arg3 >> 16);
							arg3 += i;
							arg4 += i_45_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg0 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg5 >> 16, arg3 >> 16);
							arg3 += i;
							arg5 += i_46_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				} else {
					arg5 = arg4 <<= 16;
					if (arg1 < 0) {
						arg5 -= i * arg1;
						arg4 -= i_45_ * arg1;
						arg1 = 0;
					}
					arg3 <<= 16;
					if (arg0 < 0) {
						arg3 -= i_46_ * arg0;
						arg0 = 0;
					}
					if (i < i_45_) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg0 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg5 >> 16, arg4 >> 16);
							arg5 += i;
							arg4 += i_45_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg3 >> 16, arg4 >> 16);
							arg3 += i_46_;
							arg4 += i_45_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray2601[arg1];
						while (--arg0 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg4 >> 16, arg5 >> 16);
							arg5 += i;
							arg4 += i_45_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
						while (--arg2 >= 0) {
							method374(Class12_Sub12_Sub7.anIntArray2281, arg1,
									arg6, 0, arg4 >> 16, arg3 >> 16);
							arg3 += i_46_;
							arg4 += i_45_;
							arg1 += Class12_Sub12_Sub7.anInt2282;
						}
					}
				}
			}
		} else if (arg2 < anInt2600) {
			if (arg0 > anInt2600)
				arg0 = anInt2600;
			if (arg1 > anInt2600)
				arg1 = anInt2600;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 16;
				if (arg2 < 0) {
					arg4 -= i_45_ * arg2;
					arg5 -= i_46_ * arg2;
					arg2 = 0;
				}
				arg3 <<= 16;
				if (arg0 < 0) {
					arg3 -= i * arg0;
					arg0 = 0;
				}
				if (i_45_ < i_46_) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg0 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg4 >> 16, arg5 >> 16);
						arg4 += i_45_;
						arg5 += i_46_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg1 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg4 >> 16, arg3 >> 16);
						arg4 += i_45_;
						arg3 += i;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg0 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg5 >> 16, arg4 >> 16);
						arg4 += i_45_;
						arg5 += i_46_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg1 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg3 >> 16, arg4 >> 16);
						arg4 += i_45_;
						arg3 += i;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				}
			} else {
				arg3 = arg5 <<= 16;
				if (arg2 < 0) {
					arg3 -= i_45_ * arg2;
					arg5 -= i_46_ * arg2;
					arg2 = 0;
				}
				arg4 <<= 16;
				if (arg1 < 0) {
					arg4 -= i * arg1;
					arg1 = 0;
				}
				if (i_45_ < i_46_) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg1 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg3 >> 16, arg5 >> 16);
						arg3 += i_45_;
						arg5 += i_46_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg0 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg4 >> 16, arg5 >> 16);
						arg4 += i;
						arg5 += i_46_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray2601[arg2];
					while (--arg1 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg5 >> 16, arg3 >> 16);
						arg3 += i_45_;
						arg5 += i_46_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
					while (--arg0 >= 0) {
						method374(Class12_Sub12_Sub7.anIntArray2281, arg2,
								arg6, 0, arg5 >> 16, arg4 >> 16);
						arg4 += i;
						arg5 += i_46_;
						arg2 += Class12_Sub12_Sub7.anInt2282;
					}
				}
			}
		}
	}

	public static int method381(int arg0, int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
		if (arg1 < 2)
			arg1 = 2;
		else if (arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public static int method382(int arg0, double arg1) {
		double d = (double) (arg0 >> 16) / 256.0;
		double d_47_ = (double) (arg0 >> 8 & 0xff) / 256.0;
		double d_48_ = (double) (arg0 & 0xff) / 256.0;
		d = Math.pow(d, arg1);
		d_47_ = Math.pow(d_47_, arg1);
		d_48_ = Math.pow(d_48_, arg1);
		int i = (int) (d * 256.0);
		int i_49_ = (int) (d_47_ * 256.0);
		int i_50_ = (int) (d_48_ * 256.0);
		return (i << 16) + (i_49_ << 8) + i_50_;
	}

	public static void method383(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, int arg12, int arg13, int arg14) {
		if (arg5 < arg6) {
			int i;
			int i_51_;
			if (aBoolean2595) {
				i_51_ = (arg8 - arg7) / (arg6 - arg5);
				if (arg6 > anInt2592)
					arg6 = anInt2592;
				if (arg5 < 0) {
					arg7 -= arg5 * i_51_;
					arg5 = 0;
				}
				if (arg5 >= arg6)
					return;
				i = arg6 - arg5 >> 3;
				i_51_ <<= 12;
				arg7 <<= 9;
			} else {
				if (arg6 - arg5 > 7) {
					i = arg6 - arg5 >> 3;
					i_51_ = (arg8 - arg7) * anIntArray2604[i] >> 6;
				} else {
					i = 0;
					i_51_ = 0;
				}
				arg7 <<= 9;
			}
			arg4 += arg5;
			if (aBoolean2606) {
				int i_52_ = 0;
				int i_53_ = 0;
				int i_54_ = arg5 - anInt2598;
				arg9 += (arg12 >> 3) * i_54_;
				arg10 += (arg13 >> 3) * i_54_;
				arg11 += (arg14 >> 3) * i_54_;
				int i_55_ = arg11 >> 12;
				if (i_55_ != 0) {
					arg2 = arg9 / i_55_;
					arg3 = arg10 / i_55_;
					if (arg2 < 0)
						arg2 = 0;
					else if (arg2 > 4032)
						arg2 = 4032;
				}
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				i_55_ = arg11 >> 12;
				if (i_55_ != 0) {
					i_52_ = arg9 / i_55_;
					i_53_ = arg10 / i_55_;
					if (i_52_ < 7)
						i_52_ = 7;
					else if (i_52_ > 4032)
						i_52_ = 4032;
				}
				int i_56_ = i_52_ - arg2 >> 3;
				int i_57_ = i_53_ - arg3 >> 3;
				arg2 += (arg7 & 0x600000) >> 3;
				int i_58_ = arg7 >> 23;
				if (aBoolean2605) {
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 = i_52_;
						arg3 = i_53_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_55_ = arg11 >> 12;
						if (i_55_ != 0) {
							i_52_ = arg9 / i_55_;
							i_53_ = arg10 / i_55_;
							if (i_52_ < 7)
								i_52_ = 7;
							else if (i_52_ > 4032)
								i_52_ = 4032;
						}
						i_56_ = i_52_ - arg2 >> 3;
						i_57_ = i_53_ - arg3 >> 3;
						arg7 += i_51_;
						arg2 += (arg7 & 0x600000) >> 3;
						i_58_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_;
						arg2 += i_56_;
						arg3 += i_57_;
					}
				} else {
					while (i-- > 0) {
						int i_59_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
						if ((i_59_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_59_;
						arg4++;
						arg2 = i_52_;
						arg3 = i_53_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_55_ = arg11 >> 12;
						if (i_55_ != 0) {
							i_52_ = arg9 / i_55_;
							i_53_ = arg10 / i_55_;
							if (i_52_ < 7)
								i_52_ = 7;
							else if (i_52_ > 4032)
								i_52_ = 4032;
						}
						i_56_ = i_52_ - arg2 >> 3;
						i_57_ = i_53_ - arg3 >> 3;
						arg7 += i_51_;
						arg2 += (arg7 & 0x600000) >> 3;
						i_58_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						int i_60_;
						if ((i_60_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_58_) != 0)
							arg0[arg4] = i_60_;
						arg4++;
						arg2 += i_56_;
						arg3 += i_57_;
					}
				}
			} else {
				int i_61_ = 0;
				int i_62_ = 0;
				int i_63_ = arg5 - anInt2598;
				arg9 += (arg12 >> 3) * i_63_;
				arg10 += (arg13 >> 3) * i_63_;
				arg11 += (arg14 >> 3) * i_63_;
				int i_64_ = arg11 >> 14;
				if (i_64_ != 0) {
					arg2 = arg9 / i_64_;
					arg3 = arg10 / i_64_;
					if (arg2 < 0)
						arg2 = 0;
					else if (arg2 > 16256)
						arg2 = 16256;
				}
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				i_64_ = arg11 >> 14;
				if (i_64_ != 0) {
					i_61_ = arg9 / i_64_;
					i_62_ = arg10 / i_64_;
					if (i_61_ < 7)
						i_61_ = 7;
					else if (i_61_ > 16256)
						i_61_ = 16256;
				}
				int i_65_ = i_61_ - arg2 >> 3;
				int i_66_ = i_62_ - arg3 >> 3;
				arg2 += arg7 & 0x600000;
				int i_67_ = arg7 >> 23;
				if (aBoolean2605) {
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 = i_61_;
						arg3 = i_62_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_64_ = arg11 >> 14;
						if (i_64_ != 0) {
							i_61_ = arg9 / i_64_;
							i_62_ = arg10 / i_64_;
							if (i_61_ < 7)
								i_61_ = 7;
							else if (i_61_ > 16256)
								i_61_ = 16256;
						}
						i_65_ = i_61_ - arg2 >> 3;
						i_66_ = i_62_ - arg3 >> 3;
						arg7 += i_51_;
						arg2 += arg7 & 0x600000;
						i_67_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_;
						arg2 += i_65_;
						arg3 += i_66_;
					}
				} else {
					while (i-- > 0) {
						int i_68_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
						if ((i_68_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_68_;
						arg4++;
						arg2 = i_61_;
						arg3 = i_62_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_64_ = arg11 >> 14;
						if (i_64_ != 0) {
							i_61_ = arg9 / i_64_;
							i_62_ = arg10 / i_64_;
							if (i_61_ < 7)
								i_61_ = 7;
							else if (i_61_ > 16256)
								i_61_ = 16256;
						}
						i_65_ = i_61_ - arg2 >> 3;
						i_66_ = i_62_ - arg3 >> 3;
						arg7 += i_51_;
						arg2 += arg7 & 0x600000;
						i_67_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						int i_69_;
						if ((i_69_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_67_) != 0)
							arg0[arg4] = i_69_;
						arg4++;
						arg2 += i_65_;
						arg3 += i_66_;
					}
				}
			}
		}
	}

	public static void method384() {
		anInt2598 = anInt2592 / 2;
		anInt2593 = anInt2600 / 2;
		anInt2603 = -anInt2598;
		anInt2599 = anInt2592 - anInt2598;
		anInt2594 = -anInt2593;
		anInt2608 = anInt2600 - anInt2593;
	}

	public static void method385(int[] arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {
		if (aBoolean2597) {
			int i;
			if (aBoolean2595) {
				if (arg5 - arg4 > 3)
					i = (arg7 - arg6) / (arg5 - arg4);
				else
					i = 0;
				if (arg5 > anInt2592)
					arg5 = anInt2592;
				if (arg4 < 0) {
					arg6 -= arg4 * i;
					arg4 = 0;
				}
				if (arg4 >= arg5)
					return;
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				i <<= 2;
			} else {
				if (arg4 >= arg5)
					return;
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				if (arg3 > 0)
					i = (arg7 - arg6) * anIntArray2604[arg3] >> 15;
				else
					i = 0;
			}
			if (anInt2590 == 0) {
				while (--arg3 >= 0) {
					arg2 = anIntArray2609[arg6 >> 8];
					arg6 += i;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
				}
				arg3 = arg5 - arg4 & 0x3;
				if (arg3 > 0) {
					arg2 = anIntArray2609[arg6 >> 8];
					do
						arg0[arg1++] = arg2;
					while (--arg3 > 0);
				}
			} else {
				int i_70_ = anInt2590;
				int i_71_ = 256 - anInt2590;
				while (--arg3 >= 0) {
					arg2 = anIntArray2609[arg6 >> 8];
					arg6 += i;
					arg2 = (((arg2 & 0xff00ff) * i_71_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
							* i_71_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_70_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_70_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_70_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_70_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_70_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_70_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_70_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_70_ >> 8 & 0xff00));
				}
				arg3 = arg5 - arg4 & 0x3;
				if (arg3 > 0) {
					arg2 = anIntArray2609[arg6 >> 8];
					arg2 = (((arg2 & 0xff00ff) * i_71_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
							* i_71_ >> 8 & 0xff00));
					do
						arg0[arg1++] = (arg2
								+ ((arg0[arg1] & 0xff00ff) * i_70_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
								* i_70_ >> 8 & 0xff00));
					while (--arg3 > 0);
				}
			}
		} else if (arg4 < arg5) {
			int i = (arg7 - arg6) / (arg5 - arg4);
			if (aBoolean2595) {
				if (arg5 > anInt2592)
					arg5 = anInt2592;
				if (arg4 < 0) {
					arg6 -= arg4 * i;
					arg4 = 0;
				}
				if (arg4 >= arg5)
					return;
			}
			arg1 += arg4;
			arg3 = arg5 - arg4;
			if (anInt2590 == 0) {
				do {
					arg0[arg1++] = anIntArray2609[arg6 >> 8];
					arg6 += i;
				} while (--arg3 > 0);
			} else {
				int i_72_ = anInt2590;
				int i_73_ = 256 - anInt2590;
				do {
					arg2 = anIntArray2609[arg6 >> 8];
					arg6 += i;
					arg2 = (((arg2 & 0xff00ff) * i_73_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
							* i_73_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_72_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_72_ >> 8 & 0xff00));
				} while (--arg3 > 0);
			}
		}
	}

	public static void method386(Interface3 arg0) {
		anInterface3_2607 = arg0;
	}

	public static void method387() {
		anIntArray2601 = null;
		anIntArray2609 = null;
		anInterface3_2607 = null;
		anIntArray2604 = null;
		anIntArray2591 = null;
		anIntArray2596 = null;
		anIntArray2602 = null;
	}

	static {
		aBoolean2595 = false;
		anIntArray2602 = new int[2048];
		anIntArray2604 = new int[512];
		aBoolean2597 = true;
		anInt2590 = 0;
		aBoolean2605 = false;
		anIntArray2609 = new int[65536];
		aBoolean2606 = false;
		for (int i = 1; i < 512; i++)
			anIntArray2604[i] = 32768 / i;
		for (int i = 1; i < 2048; i++)
			anIntArray2591[i] = 65536 / i;
		for (int i = 0; i < 2048; i++) {
			anIntArray2596[i] = (int) (65536.0 * Math
					.sin((double) i * 0.0030679615));
			anIntArray2602[i] = (int) (65536.0 * Math
					.cos((double) i * 0.0030679615));
		}
	}
}
