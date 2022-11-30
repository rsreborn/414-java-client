package com.jagex;/* com.jagex.Class12_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class12_Sub10 extends Class12 {
	public int anInt1762;
	public boolean aBoolean1763;
	public int anInt1764;
	public int anInt1765;
	public int[] anIntArray1766;
	public static int[] anIntArray1767;
	public int[] anIntArray1768;
	public int[] anIntArray1769;
	public int[] anIntArray1770;
	public boolean aBoolean1771 = false;
	public int[] anIntArray1772;

	public void method198() {
		anIntArray1772 = null;
	}

	public void method199(int arg0) {
		if (anIntArray1772 != null) {
			if (anInt1764 == 1 || anInt1764 == 3) {
				if (anIntArray1767 == null
						|| anIntArray1767.length < anIntArray1772.length)
					anIntArray1767 = new int[anIntArray1772.length];
				int i;
				if (anIntArray1772.length == 16384)
					i = 64;
				else
					i = 128;
				int i_0_ = anIntArray1772.length / 4;
				int i_1_ = i * arg0 * anInt1765;
				int i_2_ = i_0_ - 1;
				if (anInt1764 == 1)
					i_1_ = -i_1_;
				for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
					int i_4_ = i_3_ + i_1_ & i_2_;
					anIntArray1767[i_3_] = anIntArray1772[i_4_];
					anIntArray1767[i_3_ + i_0_] = anIntArray1772[i_4_ + i_0_];
					anIntArray1767[i_3_ + i_0_ + i_0_] = anIntArray1772[i_4_
							+ i_0_ + i_0_];
					anIntArray1767[i_3_ + i_0_ + i_0_ + i_0_] = anIntArray1772[i_4_
							+ i_0_ + i_0_ + i_0_];
				}
				int[] is = anIntArray1772;
				anIntArray1772 = anIntArray1767;
				anIntArray1767 = is;
			}
			if (anInt1764 == 2 || anInt1764 == 4) {
				if (anIntArray1767 == null
						|| anIntArray1767.length < anIntArray1772.length)
					anIntArray1767 = new int[anIntArray1772.length];
				int i;
				if (anIntArray1772.length == 16384)
					i = 64;
				else
					i = 128;
				int i_5_ = anIntArray1772.length / 4;
				int i_6_ = arg0 * anInt1765;
				int i_7_ = i - 1;
				if (anInt1764 == 2)
					i_6_ = -i_6_;
				for (int i_8_ = 0; i_8_ < i_5_; i_8_ += i) {
					for (int i_9_ = 0; i_9_ < i; i_9_++) {
						int i_10_ = i_8_ + i_9_;
						int i_11_ = i_8_ + (i_9_ + i_6_ & i_7_);
						anIntArray1767[i_10_] = anIntArray1772[i_11_];
						anIntArray1767[i_10_ + i_5_] = anIntArray1772[i_11_
								+ i_5_];
						anIntArray1767[i_10_ + i_5_ + i_5_] = anIntArray1772[i_11_
								+ i_5_ + i_5_];
						anIntArray1767[i_10_ + i_5_ + i_5_ + i_5_] = anIntArray1772[i_11_
								+ i_5_ + i_5_ + i_5_];
					}
				}
				int[] is = anIntArray1772;
				anIntArray1772 = anIntArray1767;
				anIntArray1767 = is;
			}
		}
	}

	public Class12_Sub10(Buffer arg0) {
		anInt1762 = arg0.readShortBE();
		aBoolean1763 = arg0.readUByte() == 1;
		int i = arg0.readUByte();
		if (i < 1 || i > 4)
			throw new RuntimeException();
		anIntArray1770 = new int[i];
		for (int i_12_ = 0; i_12_ < i; i_12_++)
			anIntArray1770[i_12_] = arg0.readShortBE();
		if (i > 1) {
			anIntArray1766 = new int[i - 1];
			for (int i_13_ = 0; i_13_ < i - 1; i_13_++)
				anIntArray1766[i_13_] = arg0.readUByte();
		}
		if (i > 1) {
			anIntArray1768 = new int[i - 1];
			for (int i_14_ = 0; i_14_ < i - 1; i_14_++)
				anIntArray1768[i_14_] = arg0.readUByte();
		}
		anIntArray1769 = new int[i];
		for (int i_15_ = 0; i_15_ < i; i_15_++)
			anIntArray1769[i_15_] = arg0.method207(-708753192);
		anInt1764 = arg0.readUByte();
		anInt1765 = arg0.readUByte();
		anIntArray1772 = null;
	}

	public boolean method200(double arg0, int arg1, Class26 arg2) {
		for (int i = 0; i < anIntArray1770.length; i++) {
			if (arg2.method654(anIntArray1770[i], 0) == null)
				return false;
		}
		int i = arg1 * arg1;
		anIntArray1772 = new int[i * 4];
		for (int i_16_ = 0; i_16_ < anIntArray1770.length; i_16_++) {
			Class12_Sub12_Sub7_Sub2 class12_sub12_sub7_sub2 = Class12_Sub12_Sub4
					.method315(anIntArray1770[i_16_], -121, arg2);
			class12_sub12_sub7_sub2.method371();
			byte[] is = class12_sub12_sub7_sub2.aByteArray2588;
			int[] is_17_ = class12_sub12_sub7_sub2.anIntArray2587;
			int i_18_ = anIntArray1769[i_16_];
			if ((i_18_ & ~0xffffff) == 50331648) {
				int i_19_ = i_18_ & 0xff00ff;
				int i_20_ = i_18_ >> 8 & 0xff;
				for (int i_21_ = 0; i_21_ < is_17_.length; i_21_++) {
					int i_22_ = is_17_[i_21_];
					if ((i_22_ & 0xffff) == i_22_ >> 8) {
						i_22_ &= 0xff;
						is_17_[i_21_] = (i_19_ * i_22_ >> 8 & 0xff00ff | i_20_
								* i_22_ & 0xff00);
					}
				}
			}
			for (int i_23_ = 0; i_23_ < is_17_.length; i_23_++)
				is_17_[i_23_] = Class12_Sub12_Sub7_Sub3.method382(
						is_17_[i_23_], arg0);
			int i_24_;
			if (i_16_ == 0)
				i_24_ = 0;
			else
				i_24_ = anIntArray1766[i_16_ - 1];
			if (i_24_ == 0) {
				if (class12_sub12_sub7_sub2.anInt2589 == arg1) {
					for (int i_25_ = 0; i_25_ < i; i_25_++)
						anIntArray1772[i_25_] = is_17_[is[i_25_] & 0xff];
				} else if (class12_sub12_sub7_sub2.anInt2589 == 64
						&& arg1 == 128) {
					int i_26_ = 0;
					for (int i_27_ = 0; i_27_ < arg1; i_27_++) {
						for (int i_28_ = 0; i_28_ < arg1; i_28_++)
							anIntArray1772[i_26_++] = is_17_[(is[(i_28_ >> 1)
									+ (i_27_ >> 1 << 6)] & 0xff)];
					}
				} else if (class12_sub12_sub7_sub2.anInt2589 == 128
						&& arg1 == 64) {
					int i_29_ = 0;
					for (int i_30_ = 0; i_30_ < arg1; i_30_++) {
						for (int i_31_ = 0; i_31_ < arg1; i_31_++)
							anIntArray1772[i_29_++] = is_17_[(is[(i_31_ << 1)
									+ (i_30_ << 1 << 7)] & 0xff)];
					}
				} else
					throw new RuntimeException();
			}
		}
		for (int i_32_ = 0; i_32_ < i; i_32_++) {
			anIntArray1772[i_32_] &= 0xf8f8ff;
			int i_33_ = anIntArray1772[i_32_];
			anIntArray1772[i_32_ + i] = i_33_ - (i_33_ >>> 3) & 0xf8f8ff;
			anIntArray1772[i_32_ + i + i] = i_33_ - (i_33_ >>> 2) & 0xf8f8ff;
			anIntArray1772[i_32_ + i + i + i] = i_33_ - (i_33_ >>> 2)
					- (i_33_ >>> 3) & 0xf8f8ff;
		}
		return true;
	}

	public static void method201() {
		anIntArray1767 = null;
	}
}
