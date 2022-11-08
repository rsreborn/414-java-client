package com.jagex;/* com.jagex.Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class34 {
	public int anInt830;
	public int anInt831;
	public Class3[] aClass3Array832;

	public Class12_Sub8_Sub1 method717() {
		byte[] is = method720();
		return new Class12_Sub8_Sub1(22050, is, 22050 * anInt831 / 1000,
				22050 * anInt830 / 1000);
	}

	public int method718() {
		int i = 9999999;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (aClass3Array832[i_0_] != null
					&& aClass3Array832[i_0_].anInt99 / 20 < i)
				i = aClass3Array832[i_0_].anInt99 / 20;
		}
		if (anInt831 < anInt830 && anInt831 / 20 < i)
			i = anInt831 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_1_ = 0; i_1_ < 10; i_1_++) {
			if (aClass3Array832[i_1_] != null)
				aClass3Array832[i_1_].anInt99 -= i * 20;
		}
		if (anInt831 < anInt830) {
			anInt831 -= i * 20;
			anInt830 -= i * 20;
		}
		return i;
	}

	public static Class34 method719(Class26 arg0, int arg1, int arg2) {
		byte[] is = arg0.method631(arg1, true, arg2);
		if (is == null)
			return null;
		return new Class34(new Buffer(is));
	}

	public byte[] method720() {
		int i = 0;
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (aClass3Array832[i_2_] != null
					&& (aClass3Array832[i_2_].anInt107 + aClass3Array832[i_2_].anInt99) > i)
				i = (aClass3Array832[i_2_].anInt107 + aClass3Array832[i_2_].anInt99);
		}
		if (i == 0)
			return new byte[0];
		int i_3_ = 22050 * i / 1000;
		byte[] is = new byte[i_3_];
		for (int i_4_ = 0; i_4_ < 10; i_4_++) {
			if (aClass3Array832[i_4_] != null) {
				int i_5_ = aClass3Array832[i_4_].anInt107 * 22050 / 1000;
				int i_6_ = aClass3Array832[i_4_].anInt99 * 22050 / 1000;
				int[] is_7_ = aClass3Array832[i_4_].method66(i_5_,
						aClass3Array832[i_4_].anInt107);
				for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
					int i_9_ = is[i_8_ + i_6_] + (is_7_[i_8_] >> 8);
					if ((i_9_ + 128 & ~0xff) != 0)
						i_9_ = i_9_ >> 31 ^ 0x7f;
					is[i_8_ + i_6_] = (byte) i_9_;
				}
			}
		}
		return is;
	}

	public Class34(Buffer arg0) {
		aClass3Array832 = new Class3[10];
		for (int i = 0; i < 10; i++) {
			int i_10_ = arg0.readSignedByte(true);
			if (i_10_ != 0) {
				arg0.position--;
				aClass3Array832[i] = new Class3();
				aClass3Array832[i].method64(arg0);
			}
		}
		anInt831 = arg0.readShort(-1);
		anInt830 = arg0.readShort(-1);
	}

	public Class34() {
		aClass3Array832 = new Class3[10];
	}
}
