package com.jagex;/* com.jagex.Class12_Sub12_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub12_Sub7_Sub2 extends Class12_Sub12_Sub7 {
	public int anInt2582;
	public int anInt2583;
	public int anInt2584;
	public int anInt2585;
	public int anInt2586;
	public int[] anIntArray2587;
	public byte[] aByteArray2588;
	public int anInt2589;

	public void method365(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anIntArray2587.length; i++) {
			int i_0_ = anIntArray2587[i] >> 16 & 0xff;
			i_0_ += arg0;
			if (i_0_ < 0)
				i_0_ = 0;
			else if (i_0_ > 255)
				i_0_ = 255;
			int i_1_ = anIntArray2587[i] >> 8 & 0xff;
			i_1_ += arg1;
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ > 255)
				i_1_ = 255;
			int i_2_ = anIntArray2587[i] & 0xff;
			i_2_ += arg2;
			if (i_2_ < 0)
				i_2_ = 0;
			else if (i_2_ > 255)
				i_2_ = 255;
			anIntArray2587[i] = (i_0_ << 16) + (i_1_ << 8) + i_2_;
		}
	}

	public Class12_Sub12_Sub7_Sub2 method366() {
		Class12_Sub12_Sub7_Sub2 class12_sub12_sub7_sub2 = new Class12_Sub12_Sub7_Sub2(
				anInt2589, anInt2583, anIntArray2587.length);
		class12_sub12_sub7_sub2.anInt2585 = anInt2585;
		class12_sub12_sub7_sub2.anInt2582 = anInt2582;
		class12_sub12_sub7_sub2.anInt2586 = anInt2586;
		class12_sub12_sub7_sub2.anInt2584 = anInt2584;
		int i = aByteArray2588.length;
		for (int i_3_ = 0; i_3_ < i; i_3_++)
			class12_sub12_sub7_sub2.aByteArray2588[i_3_] = aByteArray2588[i_3_];
		i = anIntArray2587.length;
		for (int i_4_ = 0; i_4_ < i; i_4_++)
			class12_sub12_sub7_sub2.anIntArray2587[i_4_] = anIntArray2587[i_4_];
		return class12_sub12_sub7_sub2;
	}

	public void method367() {
		byte[] is = new byte[anInt2589 * anInt2583];
		int i = 0;
		for (int i_5_ = anInt2583 - 1; i_5_ >= 0; i_5_--) {
			for (int i_6_ = 0; i_6_ < anInt2589; i_6_++)
				is[i++] = aByteArray2588[i_6_ + i_5_ * anInt2589];
		}
		aByteArray2588 = is;
		anInt2584 = anInt2582 - anInt2583 - anInt2584;
	}

	public void method368() {
		byte[] is = new byte[anInt2589 * anInt2583];
		int i = 0;
		for (int i_7_ = 0; i_7_ < anInt2583; i_7_++) {
			for (int i_8_ = anInt2589 - 1; i_8_ >= 0; i_8_--)
				is[i++] = aByteArray2588[i_8_ + i_7_ * anInt2589];
		}
		aByteArray2588 = is;
		anInt2586 = anInt2585 - anInt2589 - anInt2586;
	}

	public static void method369(int[] arg0, byte[] arg1, int[] arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int i_9_ = -arg6; i_9_ < 0; i_9_++) {
			for (int i_10_ = i; i_10_ < 0; i_10_++) {
				int i_11_ = arg1[arg3++];
				if (i_11_ != 0)
					arg0[arg4++] = arg2[i_11_ & 0xff];
				else
					arg4++;
				i_11_ = arg1[arg3++];
				if (i_11_ != 0)
					arg0[arg4++] = arg2[i_11_ & 0xff];
				else
					arg4++;
				i_11_ = arg1[arg3++];
				if (i_11_ != 0)
					arg0[arg4++] = arg2[i_11_ & 0xff];
				else
					arg4++;
				i_11_ = arg1[arg3++];
				if (i_11_ != 0)
					arg0[arg4++] = arg2[i_11_ & 0xff];
				else
					arg4++;
			}
			for (int i_12_ = arg5; i_12_ < 0; i_12_++) {
				int i_13_ = arg1[arg3++];
				if (i_13_ != 0)
					arg0[arg4++] = arg2[i_13_ & 0xff];
				else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method370(int arg0, int arg1) {
		arg0 += anInt2586;
		arg1 += anInt2584;
		int i = arg0 + arg1 * Class12_Sub12_Sub7.anInt2282;
		int i_14_ = 0;
		int i_15_ = anInt2583;
		int i_16_ = anInt2589;
		int i_17_ = Class12_Sub12_Sub7.anInt2282 - i_16_;
		int i_18_ = 0;
		if (arg1 < Class12_Sub12_Sub7.anInt2279) {
			int i_19_ = Class12_Sub12_Sub7.anInt2279 - arg1;
			i_15_ -= i_19_;
			arg1 = Class12_Sub12_Sub7.anInt2279;
			i_14_ += i_19_ * i_16_;
			i += i_19_ * Class12_Sub12_Sub7.anInt2282;
		}
		if (arg1 + i_15_ > Class12_Sub12_Sub7.anInt2276)
			i_15_ -= arg1 + i_15_ - Class12_Sub12_Sub7.anInt2276;
		if (arg0 < Class12_Sub12_Sub7.anInt2280) {
			int i_20_ = Class12_Sub12_Sub7.anInt2280 - arg0;
			i_16_ -= i_20_;
			arg0 = Class12_Sub12_Sub7.anInt2280;
			i_14_ += i_20_;
			i += i_20_;
			i_18_ += i_20_;
			i_17_ += i_20_;
		}
		if (arg0 + i_16_ > Class12_Sub12_Sub7.anInt2278) {
			int i_21_ = arg0 + i_16_ - Class12_Sub12_Sub7.anInt2278;
			i_16_ -= i_21_;
			i_18_ += i_21_;
			i_17_ += i_21_;
		}
		if (i_16_ > 0 && i_15_ > 0)
			method369(Class12_Sub12_Sub7.anIntArray2281, aByteArray2588,
					anIntArray2587, i_14_, i, i_16_, i_15_, i_17_, i_18_);
	}

	public void method371() {
		if (anInt2589 != anInt2585 || anInt2583 != anInt2582) {
			byte[] is = new byte[anInt2585 * anInt2582];
			int i = 0;
			for (int i_22_ = 0; i_22_ < anInt2583; i_22_++) {
				for (int i_23_ = 0; i_23_ < anInt2589; i_23_++)
					is[i_23_ + anInt2586 + (i_22_ + anInt2584) * anInt2585] = aByteArray2588[i++];
			}
			aByteArray2588 = is;
			anInt2589 = anInt2585;
			anInt2583 = anInt2582;
			anInt2586 = 0;
			anInt2584 = 0;
		}
	}

	public Class12_Sub12_Sub7_Sub2() {
		/* empty */
	}

	public Class12_Sub12_Sub7_Sub2(int arg0, int arg1, int arg2) {
		anInt2585 = anInt2589 = arg0;
		anInt2582 = anInt2583 = arg1;
		anInt2586 = anInt2584 = 0;
		aByteArray2588 = new byte[arg0 * arg1];
		anIntArray2587 = new int[arg2];
	}
}
