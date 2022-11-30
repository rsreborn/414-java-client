package com.jagex;/* com.jagex.Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class45 {
	public int[] anIntArray1051 = new int[2];
	public int[][][] anIntArrayArrayArray1052;
	public static float aFloat1053;
	public int[] anIntArray1054 = new int[2];
	public int[][][] anIntArrayArrayArray1055 = new int[2][2][4];
	public static int[][] anIntArrayArray1056 = new int[2][8];
	public static float[][] aFloatArrayArray1057 = new float[2][8];
	public static int anInt1058;

	public void method783(Buffer arg0, Class6 arg1) {
		int i = arg0.readUByte();
		anIntArray1054[0] = i >> 4;
		anIntArray1054[1] = i & 0xf;
		if (i != 0) {
			anIntArray1051[0] = arg0.readShortBE();
			anIntArray1051[1] = arg0.readShortBE();
			int i_0_ = arg0.readUByte();
			for (int i_1_ = 0; i_1_ < 2; i_1_++) {
				for (int i_2_ = 0; i_2_ < anIntArray1054[i_1_]; i_2_++) {
					anIntArrayArrayArray1052[i_1_][0][i_2_] = arg0
							.readShortBE();
					anIntArrayArrayArray1055[i_1_][0][i_2_] = arg0
							.readShortBE();
				}
			}
			for (int i_3_ = 0; i_3_ < 2; i_3_++) {
				for (int i_4_ = 0; i_4_ < anIntArray1054[i_3_]; i_4_++) {
					if ((i_0_ & 1 << i_3_ * 4 << i_4_) != 0) {
						anIntArrayArrayArray1052[i_3_][1][i_4_] = arg0
								.readShortBE();
						anIntArrayArrayArray1055[i_3_][1][i_4_] = arg0
								.readShortBE();
					} else {
						anIntArrayArrayArray1052[i_3_][1][i_4_] = anIntArrayArrayArray1052[i_3_][0][i_4_];
						anIntArrayArrayArray1055[i_3_][1][i_4_] = anIntArrayArrayArray1055[i_3_][0][i_4_];
					}
				}
			}
			if (i_0_ != 0 || anIntArray1051[1] != anIntArray1051[0])
				arg1.method80(arg0);
		} else
			anIntArray1051[0] = anIntArray1051[1] = 0;
	}

	public static float method784(float arg0) {
		float f = 32.703197F * (float) Math.pow(2.0, (double) arg0);
		return f * 3.1415927F / 11025.0F;
	}

	public static void method785() {
		aFloatArrayArray1057 = null;
		anIntArrayArray1056 = null;
	}

	public int method786(int arg0, float arg1) {
		if (arg0 == 0) {
			float f = ((float) anIntArray1051[0] + (float) (anIntArray1051[1] - anIntArray1051[0])
					* arg1);
			f *= 0.0030517578F;
			aFloat1053 = (float) Math.pow(0.1, (double) (f / 20.0F));
			anInt1058 = (int) (aFloat1053 * 65536.0F);
		}
		if (anIntArray1054[arg0] == 0)
			return 0;
		float f = method787(arg0, 0, arg1);
		aFloatArrayArray1057[arg0][0] = -2.0F * f
				* (float) Math.cos((double) method788(arg0, 0, arg1));
		aFloatArrayArray1057[arg0][1] = f * f;
		for (int i = 1; i < anIntArray1054[arg0]; i++) {
			f = method787(arg0, i, arg1);
			float f_5_ = (-2.0F * f * (float) Math.cos((double) method788(arg0,
					i, arg1)));
			float f_6_ = f * f;
			aFloatArrayArray1057[arg0][i * 2 + 1] = aFloatArrayArray1057[arg0][i * 2 - 1]
					* f_6_;
			aFloatArrayArray1057[arg0][i * 2] = (aFloatArrayArray1057[arg0][i * 2 - 1]
					* f_5_ + aFloatArrayArray1057[arg0][i * 2 - 2] * f_6_);
			for (int i_7_ = i * 2 - 1; i_7_ >= 2; i_7_--)
				aFloatArrayArray1057[arg0][i_7_] += (aFloatArrayArray1057[arg0][i_7_ - 1]
						* f_5_ + aFloatArrayArray1057[arg0][i_7_ - 2] * f_6_);
			aFloatArrayArray1057[arg0][1] += aFloatArrayArray1057[arg0][0]
					* f_5_ + f_6_;
			aFloatArrayArray1057[arg0][0] += f_5_;
		}
		if (arg0 == 0) {
			for (int i = 0; i < anIntArray1054[0] * 2; i++)
				aFloatArrayArray1057[0][i] *= aFloat1053;
		}
		for (int i = 0; i < anIntArray1054[arg0] * 2; i++)
			anIntArrayArray1056[arg0][i] = (int) (aFloatArrayArray1057[arg0][i] * 65536.0F);
		return anIntArray1054[arg0] * 2;
	}

	public float method787(int arg0, int arg1, float arg2) {
		float f = ((float) anIntArrayArrayArray1055[arg0][0][arg1] + arg2
				* (float) (anIntArrayArrayArray1055[arg0][1][arg1] - anIntArrayArrayArray1055[arg0][0][arg1]));
		f *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f / 20.0F));
	}

	public float method788(int arg0, int arg1, float arg2) {
		float f = ((float) anIntArrayArrayArray1052[arg0][0][arg1] + arg2
				* (float) (anIntArrayArrayArray1052[arg0][1][arg1] - anIntArrayArrayArray1052[arg0][0][arg1]));
		f *= 1.2207031E-4F;
		return method784(f);
	}

	public Class45() {
		anIntArrayArrayArray1052 = new int[2][2][4];
	}
}
