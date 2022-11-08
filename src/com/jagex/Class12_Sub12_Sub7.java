package com.jagex;/* com.jagex.Class12_Sub12_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub12_Sub7 extends Class12_Sub12 {
	public static int anInt2276;
	public static int anInt2277;
	public static int anInt2278 = 0;
	public static int anInt2279 = 0;
	public static int anInt2280 = 0;
	public static int[] anIntArray2281;
	public static int anInt2282;

	public static void method339(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		method343(arg0, arg1, arg2, arg4);
		method343(arg0, arg1 + arg3 - 1, arg2, arg4);
		method351(arg0, arg1, arg3, arg4);
		method351(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	public static void method340(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		method342(arg0, arg1, arg2, arg4, arg5);
		method342(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method344(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method344(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	public static void method341() {
		int i = 0;
		int i_0_ = anInt2282 * anInt2277 - 7;
		while (i < i_0_) {
			anIntArray2281[i++] = 0;
			anIntArray2281[i++] = 0;
			anIntArray2281[i++] = 0;
			anIntArray2281[i++] = 0;
			anIntArray2281[i++] = 0;
			anIntArray2281[i++] = 0;
			anIntArray2281[i++] = 0;
			anIntArray2281[i++] = 0;
		}
		i_0_ += 7;
		while (i < i_0_)
			anIntArray2281[i++] = 0;
	}

	public static void method342(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		if (arg1 >= anInt2279 && arg1 < anInt2276) {
			if (arg0 < anInt2280) {
				arg2 -= anInt2280 - arg0;
				arg0 = anInt2280;
			}
			if (arg0 + arg2 > anInt2278)
				arg2 = anInt2278 - arg0;
			int i = 256 - arg4;
			int i_1_ = (arg3 >> 16 & 0xff) * arg4;
			int i_2_ = (arg3 >> 8 & 0xff) * arg4;
			int i_3_ = (arg3 & 0xff) * arg4;
			int i_4_ = arg0 + arg1 * anInt2282;
			for (int i_5_ = 0; i_5_ < arg2; i_5_++) {
				int i_6_ = (anIntArray2281[i_4_] >> 16 & 0xff) * i;
				int i_7_ = (anIntArray2281[i_4_] >> 8 & 0xff) * i;
				int i_8_ = (anIntArray2281[i_4_] & 0xff) * i;
				int i_9_ = ((i_1_ + i_6_ >> 8 << 16) + (i_2_ + i_7_ >> 8 << 8) + (i_3_
						+ i_8_ >> 8));
				anIntArray2281[i_4_++] = i_9_;
			}
		}
	}

	public static void method343(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= anInt2279 && arg1 < anInt2276) {
			if (arg0 < anInt2280) {
				arg2 -= anInt2280 - arg0;
				arg0 = anInt2280;
			}
			if (arg0 + arg2 > anInt2278)
				arg2 = anInt2278 - arg0;
			int i = arg0 + arg1 * anInt2282;
			for (int i_10_ = 0; i_10_ < arg2; i_10_++)
				anIntArray2281[i + i_10_] = arg3;
		}
	}

	public static void method344(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		if (arg0 >= anInt2280 && arg0 < anInt2278) {
			if (arg1 < anInt2279) {
				arg2 -= anInt2279 - arg1;
				arg1 = anInt2279;
			}
			if (arg1 + arg2 > anInt2276)
				arg2 = anInt2276 - arg1;
			int i = 256 - arg4;
			int i_11_ = (arg3 >> 16 & 0xff) * arg4;
			int i_12_ = (arg3 >> 8 & 0xff) * arg4;
			int i_13_ = (arg3 & 0xff) * arg4;
			int i_14_ = arg0 + arg1 * anInt2282;
			for (int i_15_ = 0; i_15_ < arg2; i_15_++) {
				int i_16_ = (anIntArray2281[i_14_] >> 16 & 0xff) * i;
				int i_17_ = (anIntArray2281[i_14_] >> 8 & 0xff) * i;
				int i_18_ = (anIntArray2281[i_14_] & 0xff) * i;
				int i_19_ = ((i_11_ + i_16_ >> 8 << 16)
						+ (i_12_ + i_17_ >> 8 << 8) + (i_13_ + i_18_ >> 8));
				anIntArray2281[i_14_] = i_19_;
				i_14_ += anInt2282;
			}
		}
	}

	public static void method345(int[] arg0, int arg1, int arg2) {
		anIntArray2281 = arg0;
		anInt2282 = arg1;
		anInt2277 = arg2;
		method346(0, 0, arg1, arg2);
	}

	public static void method346(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0)
			arg0 = 0;
		if (arg1 < 0)
			arg1 = 0;
		if (arg2 > anInt2282)
			arg2 = anInt2282;
		if (arg3 > anInt2277)
			arg3 = anInt2277;
		anInt2280 = arg0;
		anInt2279 = arg1;
		anInt2278 = arg2;
		anInt2276 = arg3;
	}

	public static void method347(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		if (arg0 < anInt2280) {
			arg2 -= anInt2280 - arg0;
			arg0 = anInt2280;
		}
		if (arg1 < anInt2279) {
			arg3 -= anInt2279 - arg1;
			arg1 = anInt2279;
		}
		if (arg0 + arg2 > anInt2278)
			arg2 = anInt2278 - arg0;
		if (arg1 + arg3 > anInt2276)
			arg3 = anInt2276 - arg1;
		int i = anInt2282 - arg2;
		int i_20_ = arg0 + arg1 * anInt2282;
		for (int i_21_ = -arg3; i_21_ < 0; i_21_++) {
			for (int i_22_ = -arg2; i_22_ < 0; i_22_++)
				anIntArray2281[i_20_++] = arg4;
			i_20_ += i;
		}
	}

	public static void method348() {
		anInt2280 = 0;
		anInt2279 = 0;
		anInt2278 = anInt2282;
		anInt2276 = anInt2277;
	}

	public static void method349() {
		anIntArray2281 = null;
	}

	public static void method350(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		if (arg0 < anInt2280) {
			arg2 -= anInt2280 - arg0;
			arg0 = anInt2280;
		}
		if (arg1 < anInt2279) {
			arg3 -= anInt2279 - arg1;
			arg1 = anInt2279;
		}
		if (arg0 + arg2 > anInt2278)
			arg2 = anInt2278 - arg0;
		if (arg1 + arg3 > anInt2276)
			arg3 = anInt2276 - arg1;
		int i = 256 - arg5;
		int i_23_ = (arg4 >> 16 & 0xff) * arg5;
		int i_24_ = (arg4 >> 8 & 0xff) * arg5;
		int i_25_ = (arg4 & 0xff) * arg5;
		int i_26_ = anInt2282 - arg2;
		int i_27_ = arg0 + arg1 * anInt2282;
		for (int i_28_ = 0; i_28_ < arg3; i_28_++) {
			for (int i_29_ = -arg2; i_29_ < 0; i_29_++) {
				int i_30_ = (anIntArray2281[i_27_] >> 16 & 0xff) * i;
				int i_31_ = (anIntArray2281[i_27_] >> 8 & 0xff) * i;
				int i_32_ = (anIntArray2281[i_27_] & 0xff) * i;
				int i_33_ = ((i_23_ + i_30_ >> 8 << 16)
						+ (i_24_ + i_31_ >> 8 << 8) + (i_25_ + i_32_ >> 8));
				anIntArray2281[i_27_++] = i_33_;
			}
			i_27_ += i_26_;
		}
	}

	public static void method351(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= anInt2280 && arg0 < anInt2278) {
			if (arg1 < anInt2279) {
				arg2 -= anInt2279 - arg1;
				arg1 = anInt2279;
			}
			if (arg1 + arg2 > anInt2276)
				arg2 = anInt2276 - arg1;
			int i = arg0 + arg1 * anInt2282;
			for (int i_34_ = 0; i_34_ < arg2; i_34_++)
				anIntArray2281[i + i_34_ * anInt2282] = arg3;
		}
	}

	static {
		anInt2276 = 0;
	}
}
