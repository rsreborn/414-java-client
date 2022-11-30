package com.jagex;/* com.jagex.Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;

import java.util.Random;

public class Class3 {
	public int anInt99;
	public Class6 aClass6_100;
	public Class6 aClass6_101;
	public Class6 aClass6_102;
	public int[] anIntArray103;
	public Class6 aClass6_104;
	public int anInt105;
	public int[] anIntArray106;
	public int anInt107 = 500;
	public Class6 aClass6_108;
	public Class45 aClass45_109;
	public Class6 aClass6_110;
	public static int[] anIntArray111;
	public Class6 aClass6_112;
	public int[] anIntArray113;
	public Class6 aClass6_114;
	public static int[] anIntArray115 = new int[32768];
	public Class6 aClass6_116;
	public int anInt117;
	public static int[] anIntArray118;
	public static int[] anIntArray119;
	public static int[] anIntArray120;
	public static int[] anIntArray121;
	public static int[] anIntArray122;
	public static int[] anIntArray123;

	public void method64(Buffer arg0) {
		aClass6_114 = new Class6();
		aClass6_114.method81(arg0);
		aClass6_108 = new Class6();
		aClass6_108.method81(arg0);
		int i = arg0.readUByte();
		if (i != 0) {
			arg0.position--;
			aClass6_100 = new Class6();
			aClass6_100.method81(arg0);
			aClass6_101 = new Class6();
			aClass6_101.method81(arg0);
		}
		i = arg0.readUByte();
		if (i != 0) {
			arg0.position--;
			aClass6_110 = new Class6();
			aClass6_110.method81(arg0);
			aClass6_104 = new Class6();
			aClass6_104.method81(arg0);
		}
		i = arg0.readUByte();
		if (i != 0) {
			arg0.position--;
			aClass6_112 = new Class6();
			aClass6_112.method81(arg0);
			aClass6_102 = new Class6();
			aClass6_102.method81(arg0);
		}
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			int i_1_ = arg0.method231(false);
			if (i_1_ == 0)
				break;
			anIntArray103[i_0_] = i_1_;
			anIntArray106[i_0_] = arg0.method216(23138);
			anIntArray113[i_0_] = arg0.method231(false);
		}
		anInt105 = arg0.method231(false);
		anInt117 = arg0.method231(false);
		anInt107 = arg0.readShortBE();
		anInt99 = arg0.readShortBE();
		aClass45_109 = new Class45();
		aClass6_116 = new Class6();
		aClass45_109.method783(arg0, aClass6_116);
	}

	public int method65(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7fff) < 16384)
				return arg1;
			return -arg1;
		}
		if (arg2 == 2)
			return anIntArray111[arg0 & 0x7fff] * arg1 >> 14;
		if (arg2 == 3)
			return ((arg0 & 0x7fff) * arg1 >> 14) - arg1;
		if (arg2 == 4)
			return anIntArray115[arg0 / 2607 & 0x7fff] * arg1;
		return 0;
	}

	public int[] method66(int arg0, int arg1) {
		for (int i = 0; i < arg0; i++)
			anIntArray118[i] = 0;
		if (arg1 < 10)
			return anIntArray118;
		double d = (double) arg0 / ((double) arg1 + 0.0);
		aClass6_114.method79();
		aClass6_108.method79();
		int i = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (aClass6_100 != null) {
			aClass6_100.method79();
			aClass6_101.method79();
			i = (int) ((double) (aClass6_100.anInt166 - aClass6_100.anInt168) * 32.768 / d);
			i_2_ = (int) ((double) aClass6_100.anInt168 * 32.768 / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (aClass6_110 != null) {
			aClass6_110.method79();
			aClass6_104.method79();
			i_4_ = (int) ((double) (aClass6_110.anInt166 - aClass6_110.anInt168) * 32.768 / d);
			i_5_ = (int) ((double) aClass6_110.anInt168 * 32.768 / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (anIntArray103[i_7_] != 0) {
				anIntArray121[i_7_] = 0;
				anIntArray122[i_7_] = (int) ((double) anIntArray113[i_7_] * d);
				anIntArray120[i_7_] = (anIntArray103[i_7_] << 14) / 100;
				anIntArray119[i_7_] = (int) ((double) (aClass6_114.anInt166 - aClass6_114.anInt168)
						* 32.768
						* Math.pow(1.0057929410678534,
								(double) anIntArray106[i_7_]) / d);
				anIntArray123[i_7_] = (int) ((double) aClass6_114.anInt168 * 32.768 / d);
			}
		}
		for (int i_8_ = 0; i_8_ < arg0; i_8_++) {
			int i_9_ = aClass6_114.method78(arg0);
			int i_10_ = aClass6_108.method78(arg0);
			if (aClass6_100 != null) {
				int i_11_ = aClass6_100.method78(arg0);
				int i_12_ = aClass6_101.method78(arg0);
				i_9_ += method65(i_3_, i_12_, aClass6_100.anInt165) >> 1;
				i_3_ += (i_11_ * i >> 16) + i_2_;
			}
			if (aClass6_110 != null) {
				int i_13_ = aClass6_110.method78(arg0);
				int i_14_ = aClass6_104.method78(arg0);
				i_10_ = i_10_
						* ((method65(i_6_, i_14_, aClass6_110.anInt165) >> 1) + 32768) >> 15;
				i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (anIntArray103[i_15_] != 0) {
					int i_16_ = i_8_ + anIntArray122[i_15_];
					if (i_16_ < arg0) {
						anIntArray118[i_16_] += method65(anIntArray121[i_15_],
								i_10_ * anIntArray120[i_15_] >> 15,
								aClass6_114.anInt165);
						anIntArray121[i_15_] += (i_9_ * anIntArray119[i_15_] >> 16)
								+ anIntArray123[i_15_];
					}
				}
			}
		}
		if (aClass6_112 != null) {
			aClass6_112.method79();
			aClass6_102.method79();
			int i_17_ = 0;
			boolean bool = false;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < arg0; i_19_++) {
				int i_20_ = aClass6_112.method78(arg0);
				int i_21_ = aClass6_102.method78(arg0);
				int i_22_;
				if (bool_18_)
					i_22_ = aClass6_112.anInt168
							+ (((aClass6_112.anInt166 - aClass6_112.anInt168) * i_20_) >> 8);
				else
					i_22_ = aClass6_112.anInt168
							+ (((aClass6_112.anInt166 - aClass6_112.anInt168) * i_21_) >> 8);
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_)
					anIntArray118[i_19_] = 0;
			}
		}
		if (anInt105 > 0 && anInt117 > 0) {
			int i_23_ = (int) ((double) anInt105 * d);
			for (int i_24_ = i_23_; i_24_ < arg0; i_24_++)
				anIntArray118[i_24_] += anIntArray118[i_24_ - i_23_] * anInt117
						/ 100;
		}
		if (aClass45_109.anIntArray1054[0] > 0
				|| aClass45_109.anIntArray1054[1] > 0) {
			aClass6_116.method79();
			int i_25_ = aClass6_116.method78(arg0 + 1);
			int i_26_ = aClass45_109.method786(0, (float) i_25_ / 65536.0F);
			int i_27_ = aClass45_109.method786(1, (float) i_25_ / 65536.0F);
			if (arg0 >= i_26_ + i_27_) {
				int i_28_ = 0;
				int i_29_ = i_27_;
				if (i_29_ > arg0 - i_26_)
					i_29_ = arg0 - i_26_;
				for (/**/; i_28_ < i_29_; i_28_++) {
					int i_30_ = (int) (((long) anIntArray118[i_28_ + i_26_] * (long) Class45.anInt1058) >> 16);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						i_30_ += (int) (((long) (anIntArray118[i_28_ + i_26_
								- 1 - i_31_]) * (long) (Class45.anIntArrayArray1056[0][i_31_])) >> 16);
					for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
						i_30_ -= (int) (((long) anIntArray118[i_28_ - 1 - i_32_] * (long) (Class45.anIntArrayArray1056[1][i_32_])) >> 16);
					anIntArray118[i_28_] = i_30_;
					i_25_ = aClass6_116.method78(arg0 + 1);
				}
				i_29_ = 128;
				for (;;) {
					if (i_29_ > arg0 - i_26_)
						i_29_ = arg0 - i_26_;
					for (/**/; i_28_ < i_29_; i_28_++) {
						int i_33_ = (int) (((long) anIntArray118[i_28_ + i_26_] * (long) Class45.anInt1058) >> 16);
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
							i_33_ += (int) (((long) (anIntArray118[i_28_
									+ i_26_ - 1 - i_34_]) * (long) (Class45.anIntArrayArray1056[0][i_34_])) >> 16);
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
							i_33_ -= (int) (((long) (anIntArray118[i_28_ - 1
									- i_35_]) * (long) (Class45.anIntArrayArray1056[1][i_35_])) >> 16);
						anIntArray118[i_28_] = i_33_;
						i_25_ = aClass6_116.method78(arg0 + 1);
					}
					if (i_28_ >= arg0 - i_26_)
						break;
					i_26_ = aClass45_109.method786(0, (float) i_25_ / 65536.0F);
					i_27_ = aClass45_109.method786(1, (float) i_25_ / 65536.0F);
					i_29_ += 128;
				}
				for (/**/; i_28_ < arg0; i_28_++) {
					int i_36_ = 0;
					for (int i_37_ = i_28_ + i_26_ - arg0; i_37_ < i_26_; i_37_++)
						i_36_ += (int) (((long) (anIntArray118[i_28_ + i_26_
								- 1 - i_37_]) * (long) (Class45.anIntArrayArray1056[0][i_37_])) >> 16);
					for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
						i_36_ -= (int) (((long) anIntArray118[i_28_ - 1 - i_38_] * (long) (Class45.anIntArrayArray1056[1][i_38_])) >> 16);
					anIntArray118[i_28_] = i_36_;
					i_25_ = aClass6_116.method78(arg0 + 1);
				}
			}
		}
		for (int i_39_ = 0; i_39_ < arg0; i_39_++) {
			if (anIntArray118[i_39_] < -32768)
				anIntArray118[i_39_] = -32768;
			if (anIntArray118[i_39_] > 32767)
				anIntArray118[i_39_] = 32767;
		}
		return anIntArray118;
	}

	public static void method67() {
		anIntArray118 = null;
		anIntArray115 = null;
		anIntArray111 = null;
		anIntArray121 = null;
		anIntArray122 = null;
		anIntArray120 = null;
		anIntArray119 = null;
		anIntArray123 = null;
	}

	public Class3() {
		anInt99 = 0;
		anInt105 = 0;
		anIntArray103 = new int[5];
		anIntArray106 = new int[5];
		anIntArray113 = new int[5];
		anInt117 = 100;
	}

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray115[i] = (random.nextInt() & 0x2) - 1;
		anIntArray111 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray111[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		anIntArray118 = new int[220500];
		anIntArray120 = new int[5];
		anIntArray119 = new int[5];
		anIntArray121 = new int[5];
		anIntArray123 = new int[5];
		anIntArray122 = new int[5];
	}
}
