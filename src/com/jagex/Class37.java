package com.jagex;/* com.jagex.Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class37 {
	public int[] anIntArray897;
	public Class12_Sub4 aClass12_Sub4_898 = null;
	public static int[] anIntArray899;
	public static int[] anIntArray900;
	public int[] anIntArray901;
	public int[] anIntArray902;
	public boolean aBoolean903;
	public int anInt904 = -1;
	public static int[] anIntArray905;
	public static int[] anIntArray906 = new int[500];
	public int[] anIntArray907;

	public static void method735() {
		anIntArray905 = null;
		anIntArray899 = null;
		anIntArray906 = null;
		anIntArray900 = null;
	}

	public Class37(byte[] arg0, Class12_Sub4 arg1) {
		aBoolean903 = false;
		aClass12_Sub4_898 = arg1;
		Buffer class12_sub11 = new Buffer(arg0);
		Buffer class12_sub11_0_ = new Buffer(arg0);
		class12_sub11.position = 2;
		int i = class12_sub11.readSignedByte(true);
		int i_1_ = -1;
		int i_2_ = 0;
		class12_sub11_0_.position = class12_sub11.position + i;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = class12_sub11.readSignedByte(true);
			if (i_4_ > 0) {
				if (aClass12_Sub4_898.anIntArray1665[i_3_] != 0) {
					for (int i_5_ = i_3_ - 1; i_5_ > i_1_; i_5_--) {
						if (aClass12_Sub4_898.anIntArray1665[i_5_] == 0) {
							anIntArray905[i_2_] = i_5_;
							anIntArray899[i_2_] = 0;
							anIntArray906[i_2_] = 0;
							anIntArray900[i_2_] = 0;
							i_2_++;
							break;
						}
					}
				}
				anIntArray905[i_2_] = i_3_;
				int i_6_ = 0;
				if (aClass12_Sub4_898.anIntArray1665[i_3_] == 3)
					i_6_ = 128;
				if ((i_4_ & 0x1) != 0)
					anIntArray899[i_2_] = class12_sub11_0_.method216(23138);
				else
					anIntArray899[i_2_] = i_6_;
				if ((i_4_ & 0x2) != 0)
					anIntArray906[i_2_] = class12_sub11_0_.method216(23138);
				else
					anIntArray906[i_2_] = i_6_;
				if ((i_4_ & 0x4) != 0)
					anIntArray900[i_2_] = class12_sub11_0_.method216(23138);
				else
					anIntArray900[i_2_] = i_6_;
				i_1_ = i_3_;
				i_2_++;
				if (aClass12_Sub4_898.anIntArray1665[i_3_] == 5)
					aBoolean903 = true;
			}
		}
		if (class12_sub11_0_.position != arg0.length)
			throw new RuntimeException();
		anInt904 = i_2_;
		anIntArray897 = new int[i_2_];
		anIntArray901 = new int[i_2_];
		anIntArray907 = new int[i_2_];
		anIntArray902 = new int[i_2_];
		for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
			anIntArray897[i_7_] = anIntArray905[i_7_];
			anIntArray901[i_7_] = anIntArray899[i_7_];
			anIntArray907[i_7_] = anIntArray906[i_7_];
			anIntArray902[i_7_] = anIntArray900[i_7_];
		}
	}

	static {
		anIntArray900 = new int[500];
		anIntArray905 = new int[500];
		anIntArray899 = new int[500];
	}
}
