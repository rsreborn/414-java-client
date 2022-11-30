package com.jagex;/* com.jagex.Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class2 {
	public static byte[] aByteArray90 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0 };
	public Buffer aClass12_Sub11_91 = new Buffer(null);
	public int[] anIntArray92;
	public int anInt93;
	public int[] anIntArray94;
	public long aLong95;
	public int[] anIntArray96;
	public int[] anIntArray97;
	public int anInt98;

	public void method47(int arg0) {
		int i = aClass12_Sub11_91.method217((byte) 41);
		anIntArray96[arg0] += i;
	}

	public boolean method48() {
		if (aClass12_Sub11_91.position >= 0)
			return false;
		return true;
	}

	public void method49(int arg0) {
		anIntArray94[arg0] = aClass12_Sub11_91.position;
	}

	public void method50() {
		aClass12_Sub11_91.payload = null;
		anIntArray97 = null;
		anIntArray94 = null;
		anIntArray96 = null;
		anIntArray92 = null;
	}

	public int method51(int arg0) {
		int i = aClass12_Sub11_91.payload[aClass12_Sub11_91.position];
		if (i < 0) {
			i &= 0xff;
			anIntArray92[arg0] = i;
			aClass12_Sub11_91.position++;
		} else
			i = anIntArray92[arg0];
		if (i == 240 || i == 247) {
			int i_0_ = aClass12_Sub11_91.method217((byte) 89);
			if (i == 247 && i_0_ > 0) {
				int i_1_ = ((aClass12_Sub11_91.payload[aClass12_Sub11_91.position]) & 0xff);
				if (i_1_ >= 241 && i_1_ <= 243 || i_1_ == 246 || i_1_ == 248
						|| i_1_ >= 250 && i_1_ <= 252 || i_1_ == 254) {
					aClass12_Sub11_91.position++;
					anIntArray92[arg0] = i_1_;
					return method62(arg0, i_1_);
				}
			}
			aClass12_Sub11_91.position += i_0_;
			return 0;
		}
		return method62(arg0, i);
	}

	public void method52(byte[] arg0) {
		aClass12_Sub11_91.payload = arg0;
		aClass12_Sub11_91.position = 10;
		int i = aClass12_Sub11_91.readShortBE();
		anInt93 = aClass12_Sub11_91.readShortBE();
		anInt98 = 500000;
		anIntArray97 = new int[i];
		int i_2_ = 0;
		while (i_2_ < i) {
			int i_3_ = aClass12_Sub11_91.method207(-708753192);
			int i_4_ = aClass12_Sub11_91.method207(-708753192);
			if (i_3_ == 1297379947) {
				anIntArray97[i_2_] = aClass12_Sub11_91.position;
				i_2_++;
			}
			aClass12_Sub11_91.position += i_4_;
		}
		anIntArray94 = (int[]) anIntArray97.clone();
		anIntArray96 = new int[i];
		anIntArray92 = new int[i];
	}

	public void method53(int arg0) {
		aClass12_Sub11_91.position = anIntArray94[arg0];
	}

	public boolean method54() {
		if (aClass12_Sub11_91.payload == null)
			return false;
		return true;
	}

	public void method55() {
		aClass12_Sub11_91.position = -1;
	}

	public int method56(int arg0) {
		int i = method51(arg0);
		return i;
	}

	public static void method57() {
		aByteArray90 = null;
	}

	public boolean method58() {
		int i = anIntArray94.length;
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			if (anIntArray94[i_5_] >= 0)
				return false;
		}
		return true;
	}

	public long method59(int arg0) {
		return aLong95 + (long) arg0 * (long) anInt98;
	}

	public int method60() {
		return anIntArray94.length;
	}

	public void method61(long arg0) {
		aLong95 = arg0;
		int i = anIntArray94.length;
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			anIntArray96[i_6_] = 0;
			anIntArray92[i_6_] = 0;
			aClass12_Sub11_91.position = anIntArray97[i_6_];
			method47(i_6_);
			anIntArray94[i_6_] = aClass12_Sub11_91.position;
		}
	}

	public int method62(int arg0, int arg1) {
		if (arg1 == 255) {
			int i = aClass12_Sub11_91.readUByte();
			int i_7_ = aClass12_Sub11_91.method217((byte) 104);
			if (i == 47) {
				aClass12_Sub11_91.position += i_7_;
				return 1;
			}
			if (i == 81) {
				int i_8_ = aClass12_Sub11_91.method233(16711680);
				i_7_ -= 3;
				int i_9_ = anIntArray96[arg0];
				aLong95 += (long) i_9_ * (long) (anInt98 - i_8_);
				anInt98 = i_8_;
				aClass12_Sub11_91.position += i_7_;
				return 2;
			}
			aClass12_Sub11_91.position += i_7_;
			return 3;
		}
		byte i = aByteArray90[arg1 - 128];
		int i_10_ = arg1;
		if (i >= 1)
			i_10_ |= aClass12_Sub11_91.readUByte() << 8;
		if (i >= 2)
			i_10_ |= aClass12_Sub11_91.readUByte() << 16;
		return i_10_;
	}

	public int method63() {
		int i = anIntArray94.length;
		int i_11_ = -1;
		int i_12_ = 2147483647;
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			if (anIntArray94[i_13_] >= 0 && anIntArray96[i_13_] < i_12_) {
				i_11_ = i_13_;
				i_12_ = anIntArray96[i_13_];
			}
		}
		return i_11_;
	}
}
