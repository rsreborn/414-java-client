package com.jagex;/* com.jagex.Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52 {
	public static int anInt1204;
	public static Class47[][] aClass47ArrayArray1205;
	public static int anInt1206;
	public static int[] anIntArray1207;
	public static int anInt1208;
	public static int anInt1209 = 4;
	public static int anInt1210;
	public static int anInt1211;
	public static boolean aBoolean1212 = true;
	public static int anInt1213;
	public int anInt1214 = 0;
	public static int anInt1215 = 0;
	public static boolean aBoolean1216;
	public static int anInt1217;
	public static int anInt1218;
	public static int anInt1219;
	public int anInt1220;
	public Class12_Sub7[][][] aClass12_Sub7ArrayArrayArray1221;
	public int anInt1222;
	public static int anInt1223;
	public static int anInt1224;
	public static int anInt1225;
	public static int[] anIntArray1226;
	public static int anInt1227;
	public static int anInt1228;
	public static int anInt1229;
	public static Class47[] aClass47Array1230;
	public static int anInt1231;
	public static int[] anIntArray1232;
	public int anInt1233 = 0;
	public int[][][] anIntArrayArrayArray1234;
	public int anInt1235;
	public int[][][] anIntArrayArrayArray1236;
	public static int[] anIntArray1237;
	public static int[] anIntArray1238;
	public static int anInt1239;
	public static Class32[] aClass32Array1240;
	public static int anInt1241;
	public static int anInt1242;
	public static int anInt1243;
	public Class32[] aClass32Array1244 = new Class32[5000];
	public static Class8 aClass8_1245;
	public int[][] anIntArrayArray1246 = { new int[16],
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	public int[][] anIntArrayArray1247;
	public int anInt1248 = 0;
	public static int anInt1249;
	public static int anInt1250;
	public static int[] anIntArray1251;
	public static int[] anIntArray1252;
	public static int[] anIntArray1253;
	public static boolean[][] aBooleanArrayArray1254;
	public static int[] anIntArray1255;
	public static int anInt1256;
	public static int[] anIntArray1257;
	public static int anInt1258;
	public static int anInt1259;
	public int[] anIntArray1260;
	public static boolean[][][][] aBooleanArrayArrayArrayArray1261;
	public int[] anIntArray1262;
	public static int[] anIntArray1263;
	public static int anInt1264;
	public static int[] anIntArray1265;

	public void method820(int arg0, int arg1, int arg2, int arg3) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null)
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].anInt1711 = arg3;
	}

	public static void method821() {
		aClass32Array1240 = null;
		anIntArray1226 = null;
		anIntArray1232 = null;
		anIntArray1207 = null;
		anIntArray1238 = null;
		anIntArray1237 = null;
		aClass47ArrayArray1205 = null;
		aClass47Array1230 = null;
		aClass8_1245 = null;
		anIntArray1255 = null;
		anIntArray1252 = null;
		anIntArray1263 = null;
		anIntArray1253 = null;
		anIntArray1251 = null;
		anIntArray1257 = null;
		anIntArray1265 = null;
		aBooleanArrayArrayArrayArray1261 = null;
		aBooleanArrayArray1254 = null;
	}

	public boolean method822(int arg0, int arg1, int arg2, int arg3) {
		if (!method824(arg0, arg1, arg2))
			return false;
		int i = arg1 << 7;
		int i_0_ = arg2 << 7;
		int i_1_ = anIntArrayArrayArray1234[arg0][arg1][arg2] - 1;
		int i_2_ = i_1_ - 120;
		int i_3_ = i_1_ - 230;
		int i_4_ = i_1_ - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (i > anInt1206) {
					if (!method866(i, i_1_, i_0_))
						return false;
					if (!method866(i, i_1_, i_0_ + 128))
						return false;
				}
				if (arg0 > 0) {
					if (!method866(i, i_2_, i_0_))
						return false;
					if (!method866(i, i_2_, i_0_ + 128))
						return false;
				}
				if (!method866(i, i_3_, i_0_))
					return false;
				if (!method866(i, i_3_, i_0_ + 128))
					return false;
				return true;
			}
			if (arg3 == 2) {
				if (i_0_ < anInt1208) {
					if (!method866(i, i_1_, i_0_ + 128))
						return false;
					if (!method866(i + 128, i_1_, i_0_ + 128))
						return false;
				}
				if (arg0 > 0) {
					if (!method866(i, i_2_, i_0_ + 128))
						return false;
					if (!method866(i + 128, i_2_, i_0_ + 128))
						return false;
				}
				if (!method866(i, i_3_, i_0_ + 128))
					return false;
				if (!method866(i + 128, i_3_, i_0_ + 128))
					return false;
				return true;
			}
			if (arg3 == 4) {
				if (i < anInt1206) {
					if (!method866(i + 128, i_1_, i_0_))
						return false;
					if (!method866(i + 128, i_1_, i_0_ + 128))
						return false;
				}
				if (arg0 > 0) {
					if (!method866(i + 128, i_2_, i_0_))
						return false;
					if (!method866(i + 128, i_2_, i_0_ + 128))
						return false;
				}
				if (!method866(i + 128, i_3_, i_0_))
					return false;
				if (!method866(i + 128, i_3_, i_0_ + 128))
					return false;
				return true;
			}
			if (arg3 == 8) {
				if (i_0_ > anInt1208) {
					if (!method866(i, i_1_, i_0_))
						return false;
					if (!method866(i + 128, i_1_, i_0_))
						return false;
				}
				if (arg0 > 0) {
					if (!method866(i, i_2_, i_0_))
						return false;
					if (!method866(i + 128, i_2_, i_0_))
						return false;
				}
				if (!method866(i, i_3_, i_0_))
					return false;
				if (!method866(i + 128, i_3_, i_0_))
					return false;
				return true;
			}
		}
		if (!method866(i + 64, i_4_, i_0_ + 64))
			return false;
		if (arg3 == 16) {
			if (!method866(i, i_3_, i_0_ + 128))
				return false;
			return true;
		}
		if (arg3 == 32) {
			if (!method866(i + 128, i_3_, i_0_ + 128))
				return false;
			return true;
		}
		if (arg3 == 64) {
			if (!method866(i + 128, i_3_, i_0_))
				return false;
			return true;
		}
		if (arg3 == 128) {
			if (!method866(i, i_3_, i_0_))
				return false;
			return true;
		}
		return true;
	}

	public void method823(int[] arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg3][arg4][arg5];
		if (class12_sub7 != null) {
			Class29 class29 = class12_sub7.aClass29_1715;
			if (class29 != null) {
				int i = class29.anInt699;
				if (i != 0) {
					for (int i_5_ = 0; i_5_ < 4; i_5_++) {
						arg0[arg1] = i;
						arg0[arg1 + 1] = i;
						arg0[arg1 + 2] = i;
						arg0[arg1 + 3] = i;
						arg1 += arg2;
					}
				}
			} else {
				Class46 class46 = class12_sub7.aClass46_1719;
				if (class46 != null) {
					int i = class46.anInt1075;
					int i_6_ = class46.anInt1069;
					int i_7_ = class46.anInt1073;
					int i_8_ = class46.anInt1062;
					int[] is = anIntArrayArray1246[i];
					int[] is_9_ = anIntArrayArray1247[i_6_];
					int i_10_ = 0;
					if (i_7_ != 0) {
						for (int i_11_ = 0; i_11_ < 4; i_11_++) {
							arg0[arg1] = is[is_9_[i_10_++]] == 0 ? i_7_ : i_8_;
							arg0[arg1 + 1] = is[is_9_[i_10_++]] == 0 ? i_7_
									: i_8_;
							arg0[arg1 + 2] = is[is_9_[i_10_++]] == 0 ? i_7_
									: i_8_;
							arg0[arg1 + 3] = is[is_9_[i_10_++]] == 0 ? i_7_
									: i_8_;
							arg1 += arg2;
						}
					} else {
						for (int i_12_ = 0; i_12_ < 4; i_12_++) {
							if (is[is_9_[i_10_++]] != 0)
								arg0[arg1] = i_8_;
							if (is[is_9_[i_10_++]] != 0)
								arg0[arg1 + 1] = i_8_;
							if (is[is_9_[i_10_++]] != 0)
								arg0[arg1 + 2] = i_8_;
							if (is[is_9_[i_10_++]] != 0)
								arg0[arg1 + 3] = i_8_;
							arg1 += arg2;
						}
					}
				}
			}
		}
	}

	public boolean method824(int arg0, int arg1, int arg2) {
		int i = anIntArrayArrayArray1236[arg0][arg1][arg2];
		if (i == -anInt1217)
			return false;
		if (i == anInt1217)
			return true;
		int i_13_ = arg1 << 7;
		int i_14_ = arg2 << 7;
		if (method866(i_13_ + 1, anIntArrayArrayArray1234[arg0][arg1][arg2],
				i_14_ + 1)
				&& method866(i_13_ + 128 - 1,
						anIntArrayArrayArray1234[arg0][arg1 + 1][arg2],
						i_14_ + 1)
				&& method866(i_13_ + 128 - 1,
						anIntArrayArrayArray1234[arg0][arg1 + 1][arg2 + 1],
						i_14_ + 128 - 1)
				&& method866(i_13_ + 1,
						anIntArrayArrayArray1234[arg0][arg1][arg2 + 1],
						i_14_ + 128 - 1)) {
			anIntArrayArrayArray1236[arg0][arg1][arg2] = anInt1217;
			return true;
		}
		anIntArrayArrayArray1236[arg0][arg1][arg2] = -anInt1217;
		return false;
	}

	public int method825(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null || class12_sub7.aClass4_1728 == null)
			return 0;
		return class12_sub7.aClass4_1728.anInt130;
	}

	public boolean method826(int arg0, int arg1, int arg2, int arg3) {
		if (!method824(arg0, arg1, arg2))
			return false;
		int i = arg1 << 7;
		int i_15_ = arg2 << 7;
		if (method866(i + 1, anIntArrayArrayArray1234[arg0][arg1][arg2] - arg3,
				i_15_ + 1)
				&& method866(i + 128 - 1,
						anIntArrayArrayArray1234[arg0][arg1 + 1][arg2] - arg3,
						i_15_ + 1)
				&& method866(
						i + 128 - 1,
						(anIntArrayArrayArray1234[arg0][arg1 + 1][arg2 + 1] - arg3),
						i_15_ + 128 - 1)
				&& method866(i + 1,
						anIntArrayArrayArray1234[arg0][arg1][arg2 + 1] - arg3,
						i_15_ + 128 - 1))
			return true;
		return false;
	}

	public void method827(Class12_Sub12_Sub11_Sub4 arg0, int arg1, int arg2,
			int arg3, int arg4, int arg5) {
		boolean bool = true;
		int i = arg2;
		int i_16_ = arg2 + arg4;
		int i_17_ = arg3 - 1;
		int i_18_ = arg3 + arg5;
		for (int i_19_ = arg1; i_19_ <= arg1 + 1; i_19_++) {
			if (i_19_ != anInt1220) {
				for (int i_20_ = i; i_20_ <= i_16_; i_20_++) {
					if (i_20_ >= 0 && i_20_ < anInt1235) {
						for (int i_21_ = i_17_; i_21_ <= i_18_; i_21_++) {
							if (i_21_ >= 0
									&& i_21_ < anInt1222
									&& (!bool || i_20_ >= i_16_
											|| i_21_ >= i_18_ || i_21_ < arg3
											&& i_20_ != arg2)) {
								Class12_Sub7 class12_sub7 = (aClass12_Sub7ArrayArrayArray1221[i_19_][i_20_][i_21_]);
								if (class12_sub7 != null) {
									int i_22_ = (((anIntArrayArrayArray1234[i_19_][i_20_][i_21_])
											+ (anIntArrayArrayArray1234[i_19_][i_20_ + 1][i_21_])
											+ (anIntArrayArrayArray1234[i_19_][i_20_][i_21_ + 1]) + (anIntArrayArrayArray1234[i_19_][i_20_ + 1][i_21_ + 1])) / 4 - ((anIntArrayArrayArray1234[arg1][arg2][arg3])
											+ (anIntArrayArrayArray1234[arg1][arg2 + 1][arg3])
											+ (anIntArrayArrayArray1234[arg1][arg2][arg3 + 1]) + (anIntArrayArrayArray1234[arg1][arg2 + 1][arg3 + 1])) / 4);
									Class55 class55 = class12_sub7.aClass55_1710;
									if (class55 != null) {
										if (class55.aClass12_Sub12_Sub11_1302 instanceof Class12_Sub12_Sub11_Sub4) {
											Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) (class55.aClass12_Sub12_Sub11_1302));
											if ((class12_sub12_sub11_sub4.aClass35Array2804) != null)
												method841(
														arg0,
														class12_sub12_sub11_sub4,
														((i_20_ - arg2) * 128 + (1 - arg4) * 64),
														i_22_,
														((i_21_ - arg3) * 128 + (1 - arg5) * 64),
														bool);
										}
										if (class55.aClass12_Sub12_Sub11_1307 instanceof Class12_Sub12_Sub11_Sub4) {
											Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) (class55.aClass12_Sub12_Sub11_1307));
											if ((class12_sub12_sub11_sub4.aClass35Array2804) != null)
												method841(
														arg0,
														class12_sub12_sub11_sub4,
														((i_20_ - arg2) * 128 + (1 - arg4) * 64),
														i_22_,
														((i_21_ - arg3) * 128 + (1 - arg5) * 64),
														bool);
										}
									}
									for (int i_23_ = 0; i_23_ < class12_sub7.anInt1712; i_23_++) {
										Class32 class32 = (class12_sub7.aClass32Array1706[i_23_]);
										if (class32 != null
												&& ((class32.aClass12_Sub12_Sub11_774) instanceof Class12_Sub12_Sub11_Sub4)) {
											Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) (class32.aClass12_Sub12_Sub11_774));
											if ((class12_sub12_sub11_sub4.aClass35Array2804) != null) {
												int i_24_ = (class32.anInt800
														- class32.anInt786 + 1);
												int i_25_ = (class32.anInt796
														- class32.anInt784 + 1);
												method841(
														arg0,
														class12_sub12_sub11_sub4,
														((class32.anInt786 - arg2) * 128 + (i_24_ - arg4) * 64),
														i_22_,
														((class32.anInt784 - arg3) * 128 + (i_25_ - arg5) * 64),
														bool);
											}
										}
									}
								}
							}
						}
					}
				}
				i--;
				bool = false;
			}
		}
	}

	public Class44 method828(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null || class12_sub7.aClass44_1720 == null)
			return null;
		return class12_sub7.aClass44_1720;
	}

	public static void method829(int[] arg0, int arg1, int arg2, int arg3,
			int arg4) {
		anInt1259 = 0;
		anInt1256 = 0;
		anInt1264 = arg3;
		anInt1250 = arg4;
		anInt1258 = arg3 / 2;
		anInt1249 = arg4 / 2;
		boolean[][][][] bools = new boolean[9][32][53][53];
		for (int i = 128; i <= 384; i += 32) {
			for (int i_26_ = 0; i_26_ < 2048; i_26_ += 64) {
				anInt1224 = Class12_Sub12_Sub11_Sub4.anIntArray2831[i];
				anInt1213 = Class12_Sub12_Sub11_Sub4.anIntArray2833[i];
				anInt1204 = Class12_Sub12_Sub11_Sub4.anIntArray2831[i_26_];
				anInt1219 = Class12_Sub12_Sub11_Sub4.anIntArray2833[i_26_];
				int i_27_ = (i - 128) / 32;
				int i_28_ = i_26_ / 64;
				for (int i_29_ = -26; i_29_ <= 26; i_29_++) {
					for (int i_30_ = -26; i_30_ <= 26; i_30_++) {
						int i_31_ = i_29_ * 128;
						int i_32_ = i_30_ * 128;
						boolean bool = false;
						for (int i_33_ = -arg1; i_33_ <= arg2; i_33_ += 128) {
							if (method830(i_31_, arg0[i_27_] + i_33_, i_32_)) {
								bool = true;
								break;
							}
						}
						bools[i_27_][i_28_][i_29_ + 25 + 1][i_30_ + 25 + 1] = bool;
					}
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int i_34_ = 0; i_34_ < 32; i_34_++) {
				for (int i_35_ = -25; i_35_ < 25; i_35_++) {
					for (int i_36_ = -25; i_36_ < 25; i_36_++) {
						boolean bool = false;
						while_6_: for (int i_37_ = -1; i_37_ <= 1; i_37_++) {
							for (int i_38_ = -1; i_38_ <= 1; i_38_++) {
								if (bools[i][i_34_][i_35_ + i_37_ + 25 + 1][i_36_
										+ i_38_ + 25 + 1]) {
									bool = true;
									break while_6_;
								}
								if (bools[i][(i_34_ + 1) % 31][i_35_ + i_37_
										+ 25 + 1][i_36_ + i_38_ + 25 + 1]) {
									bool = true;
									break while_6_;
								}
								if (bools[i + 1][i_34_][i_35_ + i_37_ + 25 + 1][i_36_
										+ i_38_ + 25 + 1]) {
									bool = true;
									break while_6_;
								}
								if (bools[i + 1][(i_34_ + 1) % 31][i_35_
										+ i_37_ + 25 + 1][i_36_ + i_38_ + 25
										+ 1]) {
									bool = true;
									break while_6_;
								}
							}
						}
						aBooleanArrayArrayArrayArray1261[i][i_34_][i_35_ + 25][i_36_ + 25] = bool;
					}
				}
			}
		}
	}

	public static boolean method830(int arg0, int arg1, int arg2) {
		int i = arg2 * anInt1204 + arg0 * anInt1219 >> 16;
		int i_39_ = arg2 * anInt1219 - arg0 * anInt1204 >> 16;
		int i_40_ = arg1 * anInt1224 + i_39_ * anInt1213 >> 16;
		int i_41_ = arg1 * anInt1213 - i_39_ * anInt1224 >> 16;
		if (i_40_ < 50 || i_40_ > 3500)
			return false;
		int i_42_ = anInt1258 + (i << 9) / i_40_;
		int i_43_ = anInt1249 + (i_41_ << 9) / i_40_;
		if (i_42_ < anInt1259 || i_42_ > anInt1264 || i_43_ < anInt1256
				|| i_43_ > anInt1250)
			return false;
		return true;
	}

	public static int method831(int arg0, int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
		if (arg1 < 2)
			arg1 = 2;
		else if (arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public void method832(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null)
			class12_sub7.aClass4_1728 = null;
	}

	public boolean method833(int arg0, int arg1, int arg2, int arg3, int arg4,
			Class12_Sub12_Sub11 arg5, int arg6, int arg7, boolean arg8) {
		if (arg5 == null)
			return true;
		int i = arg1 - arg4;
		int i_44_ = arg2 - arg4;
		int i_45_ = arg1 + arg4;
		int i_46_ = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408)
				i_46_ += 128;
			if (arg6 > 1152 && arg6 < 1920)
				i_45_ += 128;
			if (arg6 > 1664 || arg6 < 384)
				i_44_ -= 128;
			if (arg6 > 128 && arg6 < 896)
				i -= 128;
		}
		i /= 128;
		i_44_ /= 128;
		i_45_ /= 128;
		i_46_ /= 128;
		return method853(arg0, i, i_44_, i_45_ - i + 1, i_46_ - i_44_ + 1,
				arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	public void method834(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		if (arg0 < 0)
			arg0 = 0;
		else if (arg0 >= anInt1235 * 128)
			arg0 = anInt1235 * 128 - 1;
		if (arg2 < 0)
			arg2 = 0;
		else if (arg2 >= anInt1222 * 128)
			arg2 = anInt1222 * 128 - 1;
		anInt1217++;
		anInt1224 = Class12_Sub12_Sub11_Sub4.anIntArray2831[arg3];
		anInt1213 = Class12_Sub12_Sub11_Sub4.anIntArray2833[arg3];
		anInt1204 = Class12_Sub12_Sub11_Sub4.anIntArray2831[arg4];
		anInt1219 = Class12_Sub12_Sub11_Sub4.anIntArray2833[arg4];
		aBooleanArrayArray1254 = aBooleanArrayArrayArrayArray1261[(arg3 - 128) / 32][arg4 / 64];
		anInt1206 = arg0;
		anInt1241 = arg1;
		anInt1208 = arg2;
		anInt1227 = arg0 / 128;
		anInt1243 = arg2 / 128;
		anInt1231 = arg5;
		anInt1228 = anInt1227 - 25;
		if (anInt1228 < 0)
			anInt1228 = 0;
		anInt1242 = anInt1243 - 25;
		if (anInt1242 < 0)
			anInt1242 = 0;
		anInt1211 = anInt1227 + 25;
		if (anInt1211 > anInt1235)
			anInt1211 = anInt1235;
		anInt1223 = anInt1243 + 25;
		if (anInt1223 > anInt1222)
			anInt1223 = anInt1222;
		method851();
		anInt1239 = 0;
		for (int i = anInt1233; i < anInt1220; i++) {
			Class12_Sub7[][] class12_sub7s = aClass12_Sub7ArrayArrayArray1221[i];
			for (int i_47_ = anInt1228; i_47_ < anInt1211; i_47_++) {
				for (int i_48_ = anInt1242; i_48_ < anInt1223; i_48_++) {
					Class12_Sub7 class12_sub7 = class12_sub7s[i_47_][i_48_];
					if (class12_sub7 != null) {
						if (class12_sub7.anInt1711 > arg5
								|| (!(aBooleanArrayArray1254[i_47_ - anInt1227
										+ 25][i_48_ - anInt1243 + 25]) && (anIntArrayArrayArray1234[i][i_47_][i_48_] - arg1) < 2000)) {
							class12_sub7.aBoolean1708 = false;
							class12_sub7.aBoolean1714 = false;
							class12_sub7.anInt1739 = 0;
						} else {
							class12_sub7.aBoolean1708 = true;
							class12_sub7.aBoolean1714 = true;
							if (class12_sub7.anInt1712 > 0)
								class12_sub7.aBoolean1709 = true;
							else
								class12_sub7.aBoolean1709 = false;
							anInt1239++;
						}
					}
				}
			}
		}
		for (int i = anInt1233; i < anInt1220; i++) {
			Class12_Sub7[][] class12_sub7s = aClass12_Sub7ArrayArrayArray1221[i];
			for (int i_49_ = -25; i_49_ <= 0; i_49_++) {
				int i_50_ = anInt1227 + i_49_;
				int i_51_ = anInt1227 - i_49_;
				if (i_50_ >= anInt1228 || i_51_ < anInt1211) {
					for (int i_52_ = -25; i_52_ <= 0; i_52_++) {
						int i_53_ = anInt1243 + i_52_;
						int i_54_ = anInt1243 - i_52_;
						if (i_50_ >= anInt1228) {
							if (i_53_ >= anInt1242) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_50_][i_53_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, true);
							}
							if (i_54_ < anInt1223) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_50_][i_54_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, true);
							}
						}
						if (i_51_ < anInt1211) {
							if (i_53_ >= anInt1242) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_51_][i_53_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, true);
							}
							if (i_54_ < anInt1223) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_51_][i_54_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, true);
							}
						}
						if (anInt1239 == 0) {
							aBoolean1216 = false;
							return;
						}
					}
				}
			}
		}
		for (int i = anInt1233; i < anInt1220; i++) {
			Class12_Sub7[][] class12_sub7s = aClass12_Sub7ArrayArrayArray1221[i];
			for (int i_55_ = -25; i_55_ <= 0; i_55_++) {
				int i_56_ = anInt1227 + i_55_;
				int i_57_ = anInt1227 - i_55_;
				if (i_56_ >= anInt1228 || i_57_ < anInt1211) {
					for (int i_58_ = -25; i_58_ <= 0; i_58_++) {
						int i_59_ = anInt1243 + i_58_;
						int i_60_ = anInt1243 - i_58_;
						if (i_56_ >= anInt1228) {
							if (i_59_ >= anInt1242) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_56_][i_59_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, false);
							}
							if (i_60_ < anInt1223) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_56_][i_60_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, false);
							}
						}
						if (i_57_ < anInt1211) {
							if (i_59_ >= anInt1242) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_57_][i_59_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, false);
							}
							if (i_60_ < anInt1223) {
								Class12_Sub7 class12_sub7 = class12_sub7s[i_57_][i_60_];
								if (class12_sub7 != null
										&& class12_sub7.aBoolean1708)
									method838(class12_sub7, false);
							}
						}
						if (anInt1239 == 0) {
							aBoolean1216 = false;
							return;
						}
					}
				}
			}
		}
		aBoolean1216 = false;
	}

	public static void method835(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {
		Class47 class47 = new Class47();
		class47.anInt1102 = arg2 / 128;
		class47.anInt1097 = arg3 / 128;
		class47.anInt1086 = arg4 / 128;
		class47.anInt1085 = arg5 / 128;
		class47.anInt1109 = arg1;
		class47.anInt1110 = arg2;
		class47.anInt1082 = arg3;
		class47.anInt1081 = arg4;
		class47.anInt1084 = arg5;
		class47.anInt1105 = arg6;
		class47.anInt1090 = arg7;
		aClass47ArrayArray1205[arg0][anIntArray1237[arg0]++] = class47;
	}

	public Class55 method836(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null)
			return null;
		return class12_sub7.aClass55_1710;
	}

	public boolean method837(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, Class12_Sub12_Sub11 arg6, int arg7, int arg8, int arg9) {
		if (arg6 == null)
			return true;
		int i = arg1 * 128 + 64 * arg4;
		int i_61_ = arg2 * 128 + 64 * arg5;
		return method853(arg0, arg1, arg2, arg4, arg5, i, i_61_, arg3, arg6,
				arg7, false, arg8, arg9);
	}

	public void method838(Class12_Sub7 arg0, boolean arg1) {
		aClass8_1245.method98(arg0, (byte) 79);
		for (;;) {
			Class12_Sub7 class12_sub7 = (Class12_Sub7) aClass8_1245
					.method102(5416);
			if (class12_sub7 == null)
				break;
			if (class12_sub7.aBoolean1714) {
				int i = class12_sub7.anInt1733;
				int i_62_ = class12_sub7.anInt1722;
				int i_63_ = class12_sub7.anInt1707;
				int i_64_ = class12_sub7.anInt1718;
				Class12_Sub7[][] class12_sub7s = aClass12_Sub7ArrayArrayArray1221[i_63_];
				if (class12_sub7.aBoolean1708) {
					if (arg1) {
						if (i_63_ > 0) {
							Class12_Sub7 class12_sub7_65_ = (aClass12_Sub7ArrayArrayArray1221[i_63_ - 1][i][i_62_]);
							if (class12_sub7_65_ != null
									&& class12_sub7_65_.aBoolean1714)
								continue;
						}
						if (i <= anInt1227 && i > anInt1228) {
							Class12_Sub7 class12_sub7_66_ = class12_sub7s[i - 1][i_62_];
							if (class12_sub7_66_ != null
									&& class12_sub7_66_.aBoolean1714
									&& (class12_sub7_66_.aBoolean1708 || (class12_sub7.anInt1737 & 0x1) == 0))
								continue;
						}
						if (i >= anInt1227 && i < anInt1211 - 1) {
							Class12_Sub7 class12_sub7_67_ = class12_sub7s[i + 1][i_62_];
							if (class12_sub7_67_ != null
									&& class12_sub7_67_.aBoolean1714
									&& (class12_sub7_67_.aBoolean1708 || (class12_sub7.anInt1737 & 0x4) == 0))
								continue;
						}
						if (i_62_ <= anInt1243 && i_62_ > anInt1242) {
							Class12_Sub7 class12_sub7_68_ = class12_sub7s[i][i_62_ - 1];
							if (class12_sub7_68_ != null
									&& class12_sub7_68_.aBoolean1714
									&& (class12_sub7_68_.aBoolean1708 || (class12_sub7.anInt1737 & 0x8) == 0))
								continue;
						}
						if (i_62_ >= anInt1243 && i_62_ < anInt1223 - 1) {
							Class12_Sub7 class12_sub7_69_ = class12_sub7s[i][i_62_ + 1];
							if (class12_sub7_69_ != null
									&& class12_sub7_69_.aBoolean1714
									&& (class12_sub7_69_.aBoolean1708 || (class12_sub7.anInt1737 & 0x2) == 0))
								continue;
						}
					} else
						arg1 = true;
					class12_sub7.aBoolean1708 = false;
					if (class12_sub7.aClass12_Sub7_1732 != null) {
						Class12_Sub7 class12_sub7_70_ = class12_sub7.aClass12_Sub7_1732;
						if (class12_sub7_70_.aClass29_1715 != null) {
							if (!method824(0, i, i_62_))
								method854(class12_sub7_70_.aClass29_1715, 0,
										anInt1224, anInt1213, anInt1204,
										anInt1219, i, i_62_);
						} else if (class12_sub7_70_.aClass46_1719 != null
								&& !method824(0, i, i_62_))
							method857(class12_sub7_70_.aClass46_1719,
									anInt1224, anInt1213, anInt1204, anInt1219,
									i, i_62_);
						Class55 class55 = class12_sub7_70_.aClass55_1710;
						if (class55 != null)
							class55.aClass12_Sub12_Sub11_1302.method437(0,
									anInt1224, anInt1213, anInt1204, anInt1219,
									class55.anInt1294 - anInt1206,
									class55.anInt1309 - anInt1241,
									class55.anInt1293 - anInt1208,
									class55.anInt1296);
						for (int i_71_ = 0; i_71_ < class12_sub7_70_.anInt1712; i_71_++) {
							Class32 class32 = class12_sub7_70_.aClass32Array1706[i_71_];
							if (class32 != null)
								class32.aClass12_Sub12_Sub11_774.method437(
										class32.anInt781, anInt1224, anInt1213,
										anInt1204, anInt1219, class32.anInt772
												- anInt1206, class32.anInt773
												- anInt1241, class32.anInt795
												- anInt1208, class32.anInt788);
						}
					}
					boolean bool = false;
					if (class12_sub7.aClass29_1715 != null) {
						if (!method824(i_64_, i, i_62_)) {
							bool = true;
							method854(class12_sub7.aClass29_1715, i_64_,
									anInt1224, anInt1213, anInt1204, anInt1219,
									i, i_62_);
						}
					} else if (class12_sub7.aClass46_1719 != null
							&& !method824(i_64_, i, i_62_)) {
						bool = true;
						method857(class12_sub7.aClass46_1719, anInt1224,
								anInt1213, anInt1204, anInt1219, i, i_62_);
					}
					int i_72_ = 0;
					int i_73_ = 0;
					Class55 class55 = class12_sub7.aClass55_1710;
					Class4 class4 = class12_sub7.aClass4_1728;
					if (class55 != null || class4 != null) {
						if (anInt1227 == i)
							i_72_++;
						else if (anInt1227 < i)
							i_72_ += 2;
						if (anInt1243 == i_62_)
							i_72_ += 3;
						else if (anInt1243 > i_62_)
							i_72_ += 6;
						i_73_ = anIntArray1255[i_72_];
						class12_sub7.anInt1721 = anIntArray1263[i_72_];
					}
					if (class55 != null) {
						if ((class55.anInt1300 & anIntArray1252[i_72_]) != 0) {
							if (class55.anInt1300 == 16) {
								class12_sub7.anInt1739 = 3;
								class12_sub7.anInt1730 = anIntArray1253[i_72_];
								class12_sub7.anInt1717 = 3 - class12_sub7.anInt1730;
							} else if (class55.anInt1300 == 32) {
								class12_sub7.anInt1739 = 6;
								class12_sub7.anInt1730 = anIntArray1251[i_72_];
								class12_sub7.anInt1717 = 6 - class12_sub7.anInt1730;
							} else if (class55.anInt1300 == 64) {
								class12_sub7.anInt1739 = 12;
								class12_sub7.anInt1730 = anIntArray1257[i_72_];
								class12_sub7.anInt1717 = 12 - class12_sub7.anInt1730;
							} else {
								class12_sub7.anInt1739 = 9;
								class12_sub7.anInt1730 = anIntArray1265[i_72_];
								class12_sub7.anInt1717 = 9 - class12_sub7.anInt1730;
							}
						} else
							class12_sub7.anInt1739 = 0;
						if ((class55.anInt1300 & i_73_) != 0
								&& !method822(i_64_, i, i_62_,
										class55.anInt1300))
							class55.aClass12_Sub12_Sub11_1302.method437(0,
									anInt1224, anInt1213, anInt1204, anInt1219,
									class55.anInt1294 - anInt1206,
									class55.anInt1309 - anInt1241,
									class55.anInt1293 - anInt1208,
									class55.anInt1296);
						if ((class55.anInt1305 & i_73_) != 0
								&& !method822(i_64_, i, i_62_,
										class55.anInt1305))
							class55.aClass12_Sub12_Sub11_1307.method437(0,
									anInt1224, anInt1213, anInt1204, anInt1219,
									class55.anInt1294 - anInt1206,
									class55.anInt1309 - anInt1241,
									class55.anInt1293 - anInt1208,
									class55.anInt1296);
					}
					if (class4 != null
							&& !method826(i_64_, i, i_62_,
									(class4.aClass12_Sub12_Sub11_133.anInt2394))) {
						if ((class4.anInt135 & i_73_) != 0)
							class4.aClass12_Sub12_Sub11_133.method437(
									class4.anInt127, anInt1224, anInt1213,
									anInt1204, anInt1219, class4.anInt147
											- anInt1206, class4.anInt131
											- anInt1241, class4.anInt134
											- anInt1208, class4.anInt130);
						else if ((class4.anInt135 & 0x300) != 0) {
							int i_74_ = class4.anInt147 - anInt1206;
							int i_75_ = class4.anInt131 - anInt1241;
							int i_76_ = class4.anInt134 - anInt1208;
							int i_77_ = class4.anInt127;
							int i_78_;
							if (i_77_ == 1 || i_77_ == 2)
								i_78_ = -i_74_;
							else
								i_78_ = i_74_;
							int i_79_;
							if (i_77_ == 2 || i_77_ == 3)
								i_79_ = -i_76_;
							else
								i_79_ = i_76_;
							if ((class4.anInt135 & 0x100) != 0 && i_79_ < i_78_) {
								int i_80_ = i_74_ + anIntArray1226[i_77_];
								int i_81_ = i_76_ + anIntArray1232[i_77_];
								class4.aClass12_Sub12_Sub11_133.method437(
										i_77_ * 512 + 256, anInt1224,
										anInt1213, anInt1204, anInt1219, i_80_,
										i_75_, i_81_, class4.anInt130);
							}
							if ((class4.anInt135 & 0x200) != 0 && i_79_ > i_78_) {
								int i_82_ = i_74_ + anIntArray1207[i_77_];
								int i_83_ = i_76_ + anIntArray1238[i_77_];
								class4.aClass12_Sub12_Sub11_133.method437(
										i_77_ * 512 + 1280 & 0x7ff, anInt1224,
										anInt1213, anInt1204, anInt1219, i_82_,
										i_75_, i_83_, class4.anInt130);
							}
						}
					}
					if (bool) {
						Class44 class44 = class12_sub7.aClass44_1720;
						if (class44 != null)
							class44.aClass12_Sub12_Sub11_1033.method437(0,
									anInt1224, anInt1213, anInt1204, anInt1219,
									class44.anInt1049 - anInt1206,
									class44.anInt1026 - anInt1241,
									class44.anInt1029 - anInt1208,
									class44.anInt1048);
						Class21 class21 = class12_sub7.aClass21_1727;
						if (class21 != null && class21.anInt494 == 0) {
							if (class21.aClass12_Sub12_Sub11_496 != null)
								class21.aClass12_Sub12_Sub11_496.method437(0,
										anInt1224, anInt1213, anInt1204,
										anInt1219,
										class21.anInt482 - anInt1206,
										class21.anInt491 - anInt1241,
										class21.anInt489 - anInt1208,
										class21.anInt481);
							if (class21.aClass12_Sub12_Sub11_492 != null)
								class21.aClass12_Sub12_Sub11_492.method437(0,
										anInt1224, anInt1213, anInt1204,
										anInt1219,
										class21.anInt482 - anInt1206,
										class21.anInt491 - anInt1241,
										class21.anInt489 - anInt1208,
										class21.anInt481);
							if (class21.aClass12_Sub12_Sub11_487 != null)
								class21.aClass12_Sub12_Sub11_487.method437(0,
										anInt1224, anInt1213, anInt1204,
										anInt1219,
										class21.anInt482 - anInt1206,
										class21.anInt491 - anInt1241,
										class21.anInt489 - anInt1208,
										class21.anInt481);
						}
					}
					int i_84_ = class12_sub7.anInt1737;
					if (i_84_ != 0) {
						if (i < anInt1227 && (i_84_ & 0x4) != 0) {
							Class12_Sub7 class12_sub7_85_ = class12_sub7s[i + 1][i_62_];
							if (class12_sub7_85_ != null
									&& class12_sub7_85_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_85_,
										(byte) 79);
						}
						if (i_62_ < anInt1243 && (i_84_ & 0x2) != 0) {
							Class12_Sub7 class12_sub7_86_ = class12_sub7s[i][i_62_ + 1];
							if (class12_sub7_86_ != null
									&& class12_sub7_86_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_86_,
										(byte) 79);
						}
						if (i > anInt1227 && (i_84_ & 0x1) != 0) {
							Class12_Sub7 class12_sub7_87_ = class12_sub7s[i - 1][i_62_];
							if (class12_sub7_87_ != null
									&& class12_sub7_87_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_87_,
										(byte) 79);
						}
						if (i_62_ > anInt1243 && (i_84_ & 0x8) != 0) {
							Class12_Sub7 class12_sub7_88_ = class12_sub7s[i][i_62_ - 1];
							if (class12_sub7_88_ != null
									&& class12_sub7_88_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_88_,
										(byte) 79);
						}
					}
				}
				if (class12_sub7.anInt1739 != 0) {
					boolean bool = true;
					for (int i_89_ = 0; i_89_ < class12_sub7.anInt1712; i_89_++) {
						if ((class12_sub7.aClass32Array1706[i_89_].anInt798 != anInt1217)
								&& ((class12_sub7.anIntArray1724[i_89_] & class12_sub7.anInt1739) == class12_sub7.anInt1730)) {
							bool = false;
							break;
						}
					}
					if (bool) {
						Class55 class55 = class12_sub7.aClass55_1710;
						if (!method822(i_64_, i, i_62_, class55.anInt1300))
							class55.aClass12_Sub12_Sub11_1302.method437(0,
									anInt1224, anInt1213, anInt1204, anInt1219,
									class55.anInt1294 - anInt1206,
									class55.anInt1309 - anInt1241,
									class55.anInt1293 - anInt1208,
									class55.anInt1296);
						class12_sub7.anInt1739 = 0;
					}
				}
				if (class12_sub7.aBoolean1709) {
					try {
						int i_90_ = class12_sub7.anInt1712;
						class12_sub7.aBoolean1709 = false;
						int i_91_ = 0;
						while_8_: for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
							Class32 class32 = class12_sub7.aClass32Array1706[i_92_];
							if (class32.anInt798 != anInt1217) {
								for (int i_93_ = class32.anInt786; i_93_ <= class32.anInt800; i_93_++) {
									for (int i_94_ = class32.anInt784; i_94_ <= class32.anInt796; i_94_++) {
										Class12_Sub7 class12_sub7_95_ = class12_sub7s[i_93_][i_94_];
										if (class12_sub7_95_.aBoolean1708) {
											class12_sub7.aBoolean1709 = true;
											continue while_8_;
										}
										if (class12_sub7_95_.anInt1739 != 0) {
											int i_96_ = 0;
											if (i_93_ > class32.anInt786)
												i_96_++;
											if (i_93_ < class32.anInt800)
												i_96_ += 4;
											if (i_94_ > class32.anInt784)
												i_96_ += 8;
											if (i_94_ < class32.anInt796)
												i_96_ += 2;
											if ((i_96_ & class12_sub7_95_.anInt1739) == class12_sub7.anInt1717) {
												class12_sub7.aBoolean1709 = true;
												continue while_8_;
											}
										}
									}
								}
								aClass32Array1240[i_91_++] = class32;
								int i_97_ = anInt1227 - class32.anInt786;
								int i_98_ = class32.anInt800 - anInt1227;
								if (i_98_ > i_97_)
									i_97_ = i_98_;
								int i_99_ = anInt1243 - class32.anInt784;
								int i_100_ = class32.anInt796 - anInt1243;
								if (i_100_ > i_99_)
									class32.anInt792 = i_97_ + i_100_;
								else
									class32.anInt792 = i_97_ + i_99_;
							}
						}
						while (i_91_ > 0) {
							int i_101_ = -50;
							int i_102_ = -1;
							for (int i_103_ = 0; i_103_ < i_91_; i_103_++) {
								Class32 class32 = aClass32Array1240[i_103_];
								if (class32.anInt798 != anInt1217) {
									if (class32.anInt792 > i_101_) {
										i_101_ = class32.anInt792;
										i_102_ = i_103_;
									} else if (class32.anInt792 == i_101_) {
										int i_104_ = class32.anInt772
												- anInt1206;
										int i_105_ = class32.anInt795
												- anInt1208;
										int i_106_ = ((aClass32Array1240[i_102_].anInt772) - anInt1206);
										int i_107_ = ((aClass32Array1240[i_102_].anInt795) - anInt1208);
										if (i_104_ * i_104_ + i_105_ * i_105_ > (i_106_
												* i_106_ + i_107_ * i_107_))
											i_102_ = i_103_;
									}
								}
							}
							if (i_102_ == -1)
								break;
							Class32 class32 = aClass32Array1240[i_102_];
							class32.anInt798 = anInt1217;
							if (!method870(
									i_64_,
									class32.anInt786,
									class32.anInt800,
									class32.anInt784,
									class32.anInt796,
									(class32.aClass12_Sub12_Sub11_774.anInt2394)))
								class32.aClass12_Sub12_Sub11_774.method437(
										class32.anInt781, anInt1224, anInt1213,
										anInt1204, anInt1219, class32.anInt772
												- anInt1206, class32.anInt773
												- anInt1241, class32.anInt795
												- anInt1208, class32.anInt788);
							for (int i_108_ = class32.anInt786; i_108_ <= class32.anInt800; i_108_++) {
								for (int i_109_ = class32.anInt784; i_109_ <= class32.anInt796; i_109_++) {
									Class12_Sub7 class12_sub7_110_ = class12_sub7s[i_108_][i_109_];
									if (class12_sub7_110_.anInt1739 != 0)
										aClass8_1245.method98(
												class12_sub7_110_, (byte) 79);
									else if ((i_108_ != i || i_109_ != i_62_)
											&& class12_sub7_110_.aBoolean1714)
										aClass8_1245.method98(
												class12_sub7_110_, (byte) 79);
								}
							}
						}
						if (class12_sub7.aBoolean1709)
							continue;
					} catch (Exception exception) {
						class12_sub7.aBoolean1709 = false;
					}
				}
				if (class12_sub7.aBoolean1714) {
					if (class12_sub7.anInt1739 == 0) {
						if (i <= anInt1227 && i > anInt1228) {
							Class12_Sub7 class12_sub7_111_ = class12_sub7s[i - 1][i_62_];
							if (class12_sub7_111_ != null
									&& class12_sub7_111_.aBoolean1714)
								continue;
						}
						if (i >= anInt1227 && i < anInt1211 - 1) {
							Class12_Sub7 class12_sub7_112_ = class12_sub7s[i + 1][i_62_];
							if (class12_sub7_112_ != null
									&& class12_sub7_112_.aBoolean1714)
								continue;
						}
						if (i_62_ <= anInt1243 && i_62_ > anInt1242) {
							Class12_Sub7 class12_sub7_113_ = class12_sub7s[i][i_62_ - 1];
							if (class12_sub7_113_ != null
									&& class12_sub7_113_.aBoolean1714)
								continue;
						}
						if (i_62_ >= anInt1243 && i_62_ < anInt1223 - 1) {
							Class12_Sub7 class12_sub7_114_ = class12_sub7s[i][i_62_ + 1];
							if (class12_sub7_114_ != null
									&& class12_sub7_114_.aBoolean1714)
								continue;
						}
						class12_sub7.aBoolean1714 = false;
						anInt1239--;
						Class21 class21 = class12_sub7.aClass21_1727;
						if (class21 != null && class21.anInt494 != 0) {
							if (class21.aClass12_Sub12_Sub11_496 != null)
								class21.aClass12_Sub12_Sub11_496
										.method437(
												0,
												anInt1224,
												anInt1213,
												anInt1204,
												anInt1219,
												class21.anInt482 - anInt1206,
												(class21.anInt491 - anInt1241 - class21.anInt494),
												class21.anInt489 - anInt1208,
												class21.anInt481);
							if (class21.aClass12_Sub12_Sub11_492 != null)
								class21.aClass12_Sub12_Sub11_492
										.method437(
												0,
												anInt1224,
												anInt1213,
												anInt1204,
												anInt1219,
												class21.anInt482 - anInt1206,
												(class21.anInt491 - anInt1241 - class21.anInt494),
												class21.anInt489 - anInt1208,
												class21.anInt481);
							if (class21.aClass12_Sub12_Sub11_487 != null)
								class21.aClass12_Sub12_Sub11_487
										.method437(
												0,
												anInt1224,
												anInt1213,
												anInt1204,
												anInt1219,
												class21.anInt482 - anInt1206,
												(class21.anInt491 - anInt1241 - class21.anInt494),
												class21.anInt489 - anInt1208,
												class21.anInt481);
						}
						if (class12_sub7.anInt1721 != 0) {
							Class4 class4 = class12_sub7.aClass4_1728;
							if (class4 != null
									&& !method826(
											i_64_,
											i,
											i_62_,
											(class4.aClass12_Sub12_Sub11_133.anInt2394))) {
								if ((class4.anInt135 & class12_sub7.anInt1721) != 0)
									class4.aClass12_Sub12_Sub11_133.method437(
											class4.anInt127, anInt1224,
											anInt1213, anInt1204, anInt1219,
											class4.anInt147 - anInt1206,
											class4.anInt131 - anInt1241,
											class4.anInt134 - anInt1208,
											class4.anInt130);
								else if ((class4.anInt135 & 0x300) != 0) {
									int i_115_ = class4.anInt147 - anInt1206;
									int i_116_ = class4.anInt131 - anInt1241;
									int i_117_ = class4.anInt134 - anInt1208;
									int i_118_ = class4.anInt127;
									int i_119_;
									if (i_118_ == 1 || i_118_ == 2)
										i_119_ = -i_115_;
									else
										i_119_ = i_115_;
									int i_120_;
									if (i_118_ == 2 || i_118_ == 3)
										i_120_ = -i_117_;
									else
										i_120_ = i_117_;
									if ((class4.anInt135 & 0x100) != 0
											&& i_120_ >= i_119_) {
										int i_121_ = i_115_
												+ anIntArray1226[i_118_];
										int i_122_ = i_117_
												+ anIntArray1232[i_118_];
										class4.aClass12_Sub12_Sub11_133
												.method437(i_118_ * 512 + 256,
														anInt1224, anInt1213,
														anInt1204, anInt1219,
														i_121_, i_116_, i_122_,
														class4.anInt130);
									}
									if ((class4.anInt135 & 0x200) != 0
											&& i_120_ <= i_119_) {
										int i_123_ = i_115_
												+ anIntArray1207[i_118_];
										int i_124_ = i_117_
												+ anIntArray1238[i_118_];
										class4.aClass12_Sub12_Sub11_133
												.method437(
														i_118_ * 512 + 1280 & 0x7ff,
														anInt1224, anInt1213,
														anInt1204, anInt1219,
														i_123_, i_116_, i_124_,
														class4.anInt130);
									}
								}
							}
							Class55 class55 = class12_sub7.aClass55_1710;
							if (class55 != null) {
								if ((class55.anInt1305 & class12_sub7.anInt1721) != 0
										&& !method822(i_64_, i, i_62_,
												class55.anInt1305))
									class55.aClass12_Sub12_Sub11_1307
											.method437(0, anInt1224, anInt1213,
													anInt1204, anInt1219,
													class55.anInt1294
															- anInt1206,
													class55.anInt1309
															- anInt1241,
													class55.anInt1293
															- anInt1208,
													class55.anInt1296);
								if ((class55.anInt1300 & class12_sub7.anInt1721) != 0
										&& !method822(i_64_, i, i_62_,
												class55.anInt1300))
									class55.aClass12_Sub12_Sub11_1302
											.method437(0, anInt1224, anInt1213,
													anInt1204, anInt1219,
													class55.anInt1294
															- anInt1206,
													class55.anInt1309
															- anInt1241,
													class55.anInt1293
															- anInt1208,
													class55.anInt1296);
							}
						}
						if (i_63_ < anInt1220 - 1) {
							Class12_Sub7 class12_sub7_125_ = (aClass12_Sub7ArrayArrayArray1221[i_63_ + 1][i][i_62_]);
							if (class12_sub7_125_ != null
									&& class12_sub7_125_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_125_,
										(byte) 79);
						}
						if (i < anInt1227) {
							Class12_Sub7 class12_sub7_126_ = class12_sub7s[i + 1][i_62_];
							if (class12_sub7_126_ != null
									&& class12_sub7_126_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_126_,
										(byte) 79);
						}
						if (i_62_ < anInt1243) {
							Class12_Sub7 class12_sub7_127_ = class12_sub7s[i][i_62_ + 1];
							if (class12_sub7_127_ != null
									&& class12_sub7_127_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_127_,
										(byte) 79);
						}
						if (i > anInt1227) {
							Class12_Sub7 class12_sub7_128_ = class12_sub7s[i - 1][i_62_];
							if (class12_sub7_128_ != null
									&& class12_sub7_128_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_128_,
										(byte) 79);
						}
						if (i_62_ > anInt1243) {
							Class12_Sub7 class12_sub7_129_ = class12_sub7s[i][i_62_ - 1];
							if (class12_sub7_129_ != null
									&& class12_sub7_129_.aBoolean1714)
								aClass8_1245.method98(class12_sub7_129_,
										(byte) 79);
						}
					}
				}
			}
		}
	}

	public Class4 method839(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null)
			return null;
		return class12_sub7.aClass4_1728;
	}

	public void method840(int arg0, int arg1, int arg2, int arg3,
			Class12_Sub12_Sub11 arg4, int arg5, Class12_Sub12_Sub11 arg6,
			Class12_Sub12_Sub11 arg7) {
		Class21 class21 = new Class21();
		class21.aClass12_Sub12_Sub11_487 = arg4;
		class21.anInt482 = arg1 * 128 + 64;
		class21.anInt489 = arg2 * 128 + 64;
		class21.anInt491 = arg3;
		class21.anInt481 = arg5;
		class21.aClass12_Sub12_Sub11_496 = arg6;
		class21.aClass12_Sub12_Sub11_492 = arg7;
		int i = 0;
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null) {
			for (int i_130_ = 0; i_130_ < class12_sub7.anInt1712; i_130_++) {
				if (((class12_sub7.aClass32Array1706[i_130_].anInt790 & 0x100) == 256)
						&& ((class12_sub7.aClass32Array1706[i_130_].aClass12_Sub12_Sub11_774) instanceof Class12_Sub12_Sub11_Sub4)) {
					Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) (class12_sub7.aClass32Array1706[i_130_].aClass12_Sub12_Sub11_774));
					class12_sub12_sub11_sub4.method499();
					if (class12_sub12_sub11_sub4.anInt2394 > i)
						i = class12_sub12_sub11_sub4.anInt2394;
				}
			}
		}
		class21.anInt494 = i;
		if (aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2] == null)
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2] = new Class12_Sub7(
					arg0, arg1, arg2);
		aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].aClass21_1727 = class21;
	}

	public void method841(Class12_Sub12_Sub11_Sub4 arg0,
			Class12_Sub12_Sub11_Sub4 arg1, int arg2, int arg3, int arg4,
			boolean arg5) {
		arg1.method486();
		anInt1248++;
		int i = 0;
		int[] is = arg1.anIntArray2787;
		int i_131_ = arg1.anInt2798;
		for (int i_132_ = 0; i_132_ < arg0.anInt2798; i_132_++) {
			Class35 class35 = arg0.aClass35Array2804[i_132_];
			Class35 class35_133_ = arg0.aClass35Array2790[i_132_];
			if (class35_133_.anInt845 != 0) {
				int i_134_ = arg0.anIntArray2802[i_132_] - arg3;
				if (i_134_ <= arg1.anInt2814) {
					int i_135_ = arg0.anIntArray2787[i_132_] - arg2;
					if (i_135_ >= arg1.anInt2811 && i_135_ <= arg1.anInt2801) {
						int i_136_ = arg0.anIntArray2791[i_132_] - arg4;
						if (i_136_ >= arg1.anInt2808
								&& i_136_ <= arg1.anInt2780) {
							for (int i_137_ = 0; i_137_ < i_131_; i_137_++) {
								Class35 class35_138_ = arg1.aClass35Array2804[i_137_];
								Class35 class35_139_ = arg1.aClass35Array2790[i_137_];
								if (i_135_ == is[i_137_]
										&& i_136_ == arg1.anIntArray2791[i_137_]
										&& i_134_ == arg1.anIntArray2802[i_137_]
										&& class35_139_.anInt845 != 0) {
									class35.anInt833 += class35_139_.anInt833;
									class35.anInt838 += class35_139_.anInt838;
									class35.anInt852 += class35_139_.anInt852;
									class35.anInt845 += class35_139_.anInt845;
									class35_138_.anInt833 += class35_133_.anInt833;
									class35_138_.anInt838 += class35_133_.anInt838;
									class35_138_.anInt852 += class35_133_.anInt852;
									class35_138_.anInt845 += class35_133_.anInt845;
									i++;
									anIntArray1260[i_132_] = anInt1248;
									anIntArray1262[i_137_] = anInt1248;
								}
							}
						}
					}
				}
			}
		}
		if (i >= 3 && arg5) {
			for (int i_140_ = 0; i_140_ < arg0.anInt2794; i_140_++) {
				if (anIntArray1260[arg0.anIntArray2779[i_140_]] == anInt1248
						&& anIntArray1260[arg0.anIntArray2789[i_140_]] == anInt1248
						&& (anIntArray1260[arg0.anIntArray2788[i_140_]] == anInt1248))
					arg0.anIntArray2805[i_140_] = -1;
			}
			for (int i_141_ = 0; i_141_ < arg1.anInt2794; i_141_++) {
				if (anIntArray1262[arg1.anIntArray2779[i_141_]] == anInt1248
						&& anIntArray1262[arg1.anIntArray2789[i_141_]] == anInt1248
						&& (anIntArray1262[arg1.anIntArray2788[i_141_]] == anInt1248))
					arg1.anIntArray2805[i_141_] = -1;
			}
		}
	}

	public int method842(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null || class12_sub7.aClass55_1710 == null)
			return 0;
		return class12_sub7.aClass55_1710.anInt1296;
	}

	public void method843(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null)
			class12_sub7.aClass55_1710 = null;
	}

	public int method844(int arg0, int arg1, int arg2, int arg3) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null)
			return -1;
		if (class12_sub7.aClass55_1710 != null
				&& class12_sub7.aClass55_1710.anInt1296 == arg3)
			return class12_sub7.aClass55_1710.anInt1304 & 0xff;
		if (class12_sub7.aClass4_1728 != null
				&& class12_sub7.aClass4_1728.anInt130 == arg3)
			return class12_sub7.aClass4_1728.anInt145 & 0xff;
		if (class12_sub7.aClass44_1720 != null
				&& class12_sub7.aClass44_1720.anInt1048 == arg3)
			return class12_sub7.aClass44_1720.anInt1044 & 0xff;
		for (int i = 0; i < class12_sub7.anInt1712; i++) {
			if (class12_sub7.aClass32Array1706[i].anInt788 == arg3)
				return class12_sub7.aClass32Array1706[i].anInt790 & 0xff;
		}
		return -1;
	}

	public boolean method845(int arg0, int arg1, int arg2, int arg3, int arg4,
			Class12_Sub12_Sub11 arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11) {
		if (arg5 == null)
			return true;
		return method853(arg0, arg8, arg9, arg10 - arg8 + 1, arg11 - arg9 + 1,
				arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	public void method846(int arg0, int arg1, int arg2, int arg3,
			Class12_Sub12_Sub11 arg4, Class12_Sub12_Sub11 arg5, int arg6,
			int arg7, int arg8, int arg9) {
		if (arg4 != null || arg5 != null) {
			Class55 class55 = new Class55();
			class55.anInt1296 = arg8;
			class55.anInt1304 = arg9;
			class55.anInt1294 = arg1 * 128 + 64;
			class55.anInt1293 = arg2 * 128 + 64;
			class55.anInt1309 = arg3;
			class55.aClass12_Sub12_Sub11_1302 = arg4;
			class55.aClass12_Sub12_Sub11_1307 = arg5;
			class55.anInt1300 = arg6;
			class55.anInt1305 = arg7;
			for (int i = arg0; i >= 0; i--) {
				if (aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] == null)
					aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] = new Class12_Sub7(
							i, arg1, arg2);
			}
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].aClass55_1710 = class55;
		}
	}

	public void method847(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null)
			class12_sub7.aClass44_1720 = null;
	}

	public void method848() {
		for (int i = 0; i < anInt1214; i++) {
			Class32 class32 = aClass32Array1244[i];
			method855(class32);
			aClass32Array1244[i] = null;
		}
		anInt1214 = 0;
	}

	public void method849(int arg0, int arg1) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[0][arg0][arg1];
		for (int i = 0; i < 3; i++) {
			Class12_Sub7 class12_sub7_142_ = (aClass12_Sub7ArrayArrayArray1221[i][arg0][arg1] = aClass12_Sub7ArrayArrayArray1221[i + 1][arg0][arg1]);
			if (class12_sub7_142_ != null) {
				class12_sub7_142_.anInt1707--;
				for (int i_143_ = 0; i_143_ < class12_sub7_142_.anInt1712; i_143_++) {
					Class32 class32 = class12_sub7_142_.aClass32Array1706[i_143_];
					if ((class32.anInt788 >> 29 & 0x3) == 2
							&& class32.anInt786 == arg0
							&& class32.anInt784 == arg1)
						class32.anInt783--;
				}
			}
		}
		if (aClass12_Sub7ArrayArrayArray1221[0][arg0][arg1] == null)
			aClass12_Sub7ArrayArrayArray1221[0][arg0][arg1] = new Class12_Sub7(
					0, arg0, arg1);
		aClass12_Sub7ArrayArrayArray1221[0][arg0][arg1].aClass12_Sub7_1732 = class12_sub7;
		aClass12_Sub7ArrayArrayArray1221[3][arg0][arg1] = null;
	}

	public void method850(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null) {
			for (int i = 0; i < class12_sub7.anInt1712; i++) {
				Class32 class32 = class12_sub7.aClass32Array1706[i];
				if ((class32.anInt788 >> 29 & 0x3) == 2
						&& class32.anInt786 == arg1 && class32.anInt784 == arg2) {
					method855(class32);
					break;
				}
			}
		}
	}

	public void method851() {
		int i = anIntArray1237[anInt1231];
		Class47[] class47s = aClass47ArrayArray1205[anInt1231];
		anInt1215 = 0;
		for (int i_144_ = 0; i_144_ < i; i_144_++) {
			Class47 class47 = class47s[i_144_];
			if (class47.anInt1109 == 1) {
				int i_145_ = class47.anInt1102 - anInt1227 + 25;
				if (i_145_ >= 0 && i_145_ <= 50) {
					int i_146_ = class47.anInt1086 - anInt1243 + 25;
					if (i_146_ < 0)
						i_146_ = 0;
					int i_147_ = class47.anInt1085 - anInt1243 + 25;
					if (i_147_ > 50)
						i_147_ = 50;
					boolean bool = false;
					while (i_146_ <= i_147_) {
						if (aBooleanArrayArray1254[i_145_][i_146_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_148_ = anInt1206 - class47.anInt1110;
						if (i_148_ > 32)
							class47.anInt1095 = 1;
						else {
							if (i_148_ >= -32)
								continue;
							class47.anInt1095 = 2;
							i_148_ = -i_148_;
						}
						class47.anInt1083 = (class47.anInt1081 - anInt1208 << 8)
								/ i_148_;
						class47.anInt1106 = (class47.anInt1084 - anInt1208 << 8)
								/ i_148_;
						class47.anInt1098 = (class47.anInt1105 - anInt1241 << 8)
								/ i_148_;
						class47.anInt1107 = (class47.anInt1090 - anInt1241 << 8)
								/ i_148_;
						aClass47Array1230[anInt1215++] = class47;
					}
				}
			} else if (class47.anInt1109 == 2) {
				int i_149_ = class47.anInt1086 - anInt1243 + 25;
				if (i_149_ >= 0 && i_149_ <= 50) {
					int i_150_ = class47.anInt1102 - anInt1227 + 25;
					if (i_150_ < 0)
						i_150_ = 0;
					int i_151_ = class47.anInt1097 - anInt1227 + 25;
					if (i_151_ > 50)
						i_151_ = 50;
					boolean bool = false;
					while (i_150_ <= i_151_) {
						if (aBooleanArrayArray1254[i_150_++][i_149_]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_152_ = anInt1208 - class47.anInt1081;
						if (i_152_ > 32)
							class47.anInt1095 = 3;
						else {
							if (i_152_ >= -32)
								continue;
							class47.anInt1095 = 4;
							i_152_ = -i_152_;
						}
						class47.anInt1104 = (class47.anInt1110 - anInt1206 << 8)
								/ i_152_;
						class47.anInt1093 = (class47.anInt1082 - anInt1206 << 8)
								/ i_152_;
						class47.anInt1098 = (class47.anInt1105 - anInt1241 << 8)
								/ i_152_;
						class47.anInt1107 = (class47.anInt1090 - anInt1241 << 8)
								/ i_152_;
						aClass47Array1230[anInt1215++] = class47;
					}
				}
			} else if (class47.anInt1109 == 4) {
				int i_153_ = class47.anInt1105 - anInt1241;
				if (i_153_ > 128) {
					int i_154_ = class47.anInt1086 - anInt1243 + 25;
					if (i_154_ < 0)
						i_154_ = 0;
					int i_155_ = class47.anInt1085 - anInt1243 + 25;
					if (i_155_ > 50)
						i_155_ = 50;
					if (i_154_ <= i_155_) {
						int i_156_ = class47.anInt1102 - anInt1227 + 25;
						if (i_156_ < 0)
							i_156_ = 0;
						int i_157_ = class47.anInt1097 - anInt1227 + 25;
						if (i_157_ > 50)
							i_157_ = 50;
						boolean bool = false;
						while_9_: for (int i_158_ = i_156_; i_158_ <= i_157_; i_158_++) {
							for (int i_159_ = i_154_; i_159_ <= i_155_; i_159_++) {
								if (aBooleanArrayArray1254[i_158_][i_159_]) {
									bool = true;
									break while_9_;
								}
							}
						}
						if (bool) {
							class47.anInt1095 = 5;
							class47.anInt1104 = (class47.anInt1110 - anInt1206 << 8)
									/ i_153_;
							class47.anInt1093 = (class47.anInt1082 - anInt1206 << 8)
									/ i_153_;
							class47.anInt1083 = (class47.anInt1081 - anInt1208 << 8)
									/ i_153_;
							class47.anInt1106 = (class47.anInt1084 - anInt1208 << 8)
									/ i_153_;
							aClass47Array1230[anInt1215++] = class47;
						}
					}
				}
			}
		}
	}

	public void method852(int arg0, int arg1, int arg2, int arg3,
			Class12_Sub12_Sub11 arg4, int arg5, int arg6) {
		if (arg4 != null) {
			Class44 class44 = new Class44();
			class44.aClass12_Sub12_Sub11_1033 = arg4;
			class44.anInt1049 = arg1 * 128 + 64;
			class44.anInt1029 = arg2 * 128 + 64;
			class44.anInt1026 = arg3;
			class44.anInt1048 = arg5;
			class44.anInt1044 = arg6;
			if (aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2] == null)
				aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2] = new Class12_Sub7(
						arg0, arg1, arg2);
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].aClass44_1720 = class44;
		}
	}

	public boolean method853(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, Class12_Sub12_Sub11 arg8, int arg9,
			boolean arg10, int arg11, int arg12) {
		for (int i = arg1; i < arg1 + arg3; i++) {
			for (int i_160_ = arg2; i_160_ < arg2 + arg4; i_160_++) {
				if (i < 0 || i_160_ < 0 || i >= anInt1235
						|| i_160_ >= anInt1222)
					return false;
				Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][i][i_160_];
				if (class12_sub7 != null && class12_sub7.anInt1712 >= 5)
					return false;
			}
		}
		Class32 class32 = new Class32();
		class32.anInt788 = arg11;
		class32.anInt790 = arg12;
		class32.anInt783 = arg0;
		class32.anInt772 = arg5;
		class32.anInt795 = arg6;
		class32.anInt773 = arg7;
		class32.aClass12_Sub12_Sub11_774 = arg8;
		class32.anInt781 = arg9;
		class32.anInt786 = arg1;
		class32.anInt784 = arg2;
		class32.anInt800 = arg1 + arg3 - 1;
		class32.anInt796 = arg2 + arg4 - 1;
		for (int i = arg1; i < arg1 + arg3; i++) {
			for (int i_161_ = arg2; i_161_ < arg2 + arg4; i_161_++) {
				int i_162_ = 0;
				if (i > arg1)
					i_162_++;
				if (i < arg1 + arg3 - 1)
					i_162_ += 4;
				if (i_161_ > arg2)
					i_162_ += 8;
				if (i_161_ < arg2 + arg4 - 1)
					i_162_ += 2;
				for (int i_163_ = arg0; i_163_ >= 0; i_163_--) {
					if (aClass12_Sub7ArrayArrayArray1221[i_163_][i][i_161_] == null)
						aClass12_Sub7ArrayArrayArray1221[i_163_][i][i_161_] = new Class12_Sub7(
								i_163_, i, i_161_);
				}
				Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][i][i_161_];
				class12_sub7.aClass32Array1706[class12_sub7.anInt1712] = class32;
				class12_sub7.anIntArray1724[class12_sub7.anInt1712] = i_162_;
				class12_sub7.anInt1737 |= i_162_;
				class12_sub7.anInt1712++;
			}
		}
		if (arg10)
			aClass32Array1244[anInt1214++] = class32;
		return true;
	}

	public void method854(Class29 arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7) {
		int i_164_;
		int i = i_164_ = (arg6 << 7) - anInt1206;
		int i_166_;
		int i_165_ = i_166_ = (arg7 << 7) - anInt1208;
		int i_168_;
		int i_167_ = i_168_ = i + 128;
		int i_170_;
		int i_169_ = i_170_ = i_165_ + 128;
		int i_171_ = anIntArrayArrayArray1234[arg1][arg6][arg7] - anInt1241;
		int i_172_ = anIntArrayArrayArray1234[arg1][arg6 + 1][arg7] - anInt1241;
		int i_173_ = anIntArrayArrayArray1234[arg1][arg6 + 1][arg7 + 1]
				- anInt1241;
		int i_174_ = anIntArrayArrayArray1234[arg1][arg6][arg7 + 1] - anInt1241;
		int i_175_ = i_165_ * arg4 + i * arg5 >> 16;
		i_165_ = i_165_ * arg5 - i * arg4 >> 16;
		i = i_175_;
		i_175_ = i_171_ * arg3 - i_165_ * arg2 >> 16;
		i_165_ = i_171_ * arg2 + i_165_ * arg3 >> 16;
		i_171_ = i_175_;
		if (i_165_ >= 50) {
			i_175_ = i_166_ * arg4 + i_167_ * arg5 >> 16;
			i_166_ = i_166_ * arg5 - i_167_ * arg4 >> 16;
			i_167_ = i_175_;
			i_175_ = i_172_ * arg3 - i_166_ * arg2 >> 16;
			i_166_ = i_172_ * arg2 + i_166_ * arg3 >> 16;
			i_172_ = i_175_;
			if (i_166_ >= 50) {
				i_175_ = i_169_ * arg4 + i_168_ * arg5 >> 16;
				i_169_ = i_169_ * arg5 - i_168_ * arg4 >> 16;
				i_168_ = i_175_;
				i_175_ = i_173_ * arg3 - i_169_ * arg2 >> 16;
				i_169_ = i_173_ * arg2 + i_169_ * arg3 >> 16;
				i_173_ = i_175_;
				if (i_169_ >= 50) {
					i_175_ = i_170_ * arg4 + i_164_ * arg5 >> 16;
					i_170_ = i_170_ * arg5 - i_164_ * arg4 >> 16;
					i_164_ = i_175_;
					i_175_ = i_174_ * arg3 - i_170_ * arg2 >> 16;
					i_170_ = i_174_ * arg2 + i_170_ * arg3 >> 16;
					i_174_ = i_175_;
					if (i_170_ >= 50) {
						int i_176_ = (Class12_Sub12_Sub7_Sub3.anInt2598 + (i << 9)
								/ i_165_);
						int i_177_ = (Class12_Sub12_Sub7_Sub3.anInt2593 + (i_171_ << 9)
								/ i_165_);
						int i_178_ = (Class12_Sub12_Sub7_Sub3.anInt2598 + (i_167_ << 9)
								/ i_166_);
						int i_179_ = (Class12_Sub12_Sub7_Sub3.anInt2593 + (i_172_ << 9)
								/ i_166_);
						int i_180_ = (Class12_Sub12_Sub7_Sub3.anInt2598 + (i_168_ << 9)
								/ i_169_);
						int i_181_ = (Class12_Sub12_Sub7_Sub3.anInt2593 + (i_173_ << 9)
								/ i_169_);
						int i_182_ = (Class12_Sub12_Sub7_Sub3.anInt2598 + (i_164_ << 9)
								/ i_170_);
						int i_183_ = (Class12_Sub12_Sub7_Sub3.anInt2593 + (i_174_ << 9)
								/ i_170_);
						Class12_Sub12_Sub7_Sub3.anInt2590 = 0;
						if (((i_180_ - i_182_) * (i_179_ - i_183_) - (i_181_ - i_183_)
								* (i_178_ - i_182_)) > 0) {
							Class12_Sub12_Sub7_Sub3.aBoolean2595 = false;
							if (i_180_ < 0
									|| i_182_ < 0
									|| i_178_ < 0
									|| i_180_ > Class12_Sub12_Sub7_Sub3.anInt2592
									|| i_182_ > Class12_Sub12_Sub7_Sub3.anInt2592
									|| i_178_ > Class12_Sub12_Sub7_Sub3.anInt2592)
								Class12_Sub12_Sub7_Sub3.aBoolean2595 = true;
							if (aBoolean1216
									&& method860(anInt1229, anInt1210, i_181_,
											i_183_, i_179_, i_180_, i_182_,
											i_178_)) {
								anInt1218 = arg6;
								anInt1225 = arg7;
							}
							if (arg0.anInt685 == -1) {
								if (arg0.anInt689 != 12345678)
									Class12_Sub12_Sub7_Sub3.method378(i_181_,
											i_183_, i_179_, i_180_, i_182_,
											i_178_, arg0.anInt689,
											arg0.anInt690, arg0.anInt698);
							} else if (!aBoolean1212) {
								if (arg0.aBoolean700)
									Class12_Sub12_Sub7_Sub3.method377(i_181_,
											i_183_, i_179_, i_180_, i_182_,
											i_178_, arg0.anInt689,
											arg0.anInt690, arg0.anInt698, i,
											i_167_, i_164_, i_171_, i_172_,
											i_174_, i_165_, i_166_, i_170_,
											arg0.anInt685);
								else
									Class12_Sub12_Sub7_Sub3.method377(i_181_,
											i_183_, i_179_, i_180_, i_182_,
											i_178_, arg0.anInt689,
											arg0.anInt690, arg0.anInt698,
											i_168_, i_164_, i_167_, i_173_,
											i_174_, i_172_, i_169_, i_170_,
											i_166_, arg0.anInt685);
							} else {
								int i_184_ = Class12_Sub12_Sub7_Sub3.anInterface3_2607
										.method6(arg0.anInt685, (byte) -122);
								Class12_Sub12_Sub7_Sub3.method378(i_181_,
										i_183_, i_179_, i_180_, i_182_, i_178_,
										method831(i_184_, arg0.anInt689),
										method831(i_184_, arg0.anInt690),
										method831(i_184_, arg0.anInt698));
							}
						}
						if (((i_176_ - i_178_) * (i_183_ - i_179_) - (i_177_ - i_179_)
								* (i_182_ - i_178_)) > 0) {
							Class12_Sub12_Sub7_Sub3.aBoolean2595 = false;
							if (i_176_ < 0
									|| i_178_ < 0
									|| i_182_ < 0
									|| i_176_ > Class12_Sub12_Sub7_Sub3.anInt2592
									|| i_178_ > Class12_Sub12_Sub7_Sub3.anInt2592
									|| i_182_ > Class12_Sub12_Sub7_Sub3.anInt2592)
								Class12_Sub12_Sub7_Sub3.aBoolean2595 = true;
							if (aBoolean1216
									&& method860(anInt1229, anInt1210, i_177_,
											i_179_, i_183_, i_176_, i_178_,
											i_182_)) {
								anInt1218 = arg6;
								anInt1225 = arg7;
							}
							if (arg0.anInt685 == -1) {
								if (arg0.anInt697 != 12345678)
									Class12_Sub12_Sub7_Sub3.method378(i_177_,
											i_179_, i_183_, i_176_, i_178_,
											i_182_, arg0.anInt697,
											arg0.anInt698, arg0.anInt690);
							} else if (!aBoolean1212)
								Class12_Sub12_Sub7_Sub3.method377(i_177_,
										i_179_, i_183_, i_176_, i_178_, i_182_,
										arg0.anInt697, arg0.anInt698,
										arg0.anInt690, i, i_167_, i_164_,
										i_171_, i_172_, i_174_, i_165_, i_166_,
										i_170_, arg0.anInt685);
							else {
								int i_185_ = Class12_Sub12_Sub7_Sub3.anInterface3_2607
										.method6(arg0.anInt685, (byte) -106);
								Class12_Sub12_Sub7_Sub3.method378(i_177_,
										i_179_, i_183_, i_176_, i_178_, i_182_,
										method831(i_185_, arg0.anInt697),
										method831(i_185_, arg0.anInt698),
										method831(i_185_, arg0.anInt690));
							}
						}
					}
				}
			}
		}
	}

	public void method855(Class32 arg0) {
		for (int i = arg0.anInt786; i <= arg0.anInt800; i++) {
			for (int i_186_ = arg0.anInt784; i_186_ <= arg0.anInt796; i_186_++) {
				Class12_Sub7 class12_sub7 = (aClass12_Sub7ArrayArrayArray1221[arg0.anInt783][i][i_186_]);
				if (class12_sub7 != null) {
					for (int i_187_ = 0; i_187_ < class12_sub7.anInt1712; i_187_++) {
						if (class12_sub7.aClass32Array1706[i_187_] == arg0) {
							class12_sub7.anInt1712--;
							for (int i_188_ = i_187_; i_188_ < class12_sub7.anInt1712; i_188_++) {
								class12_sub7.aClass32Array1706[i_188_] = (class12_sub7.aClass32Array1706[i_188_ + 1]);
								class12_sub7.anIntArray1724[i_188_] = class12_sub7.anIntArray1724[i_188_ + 1];
							}
							class12_sub7.aClass32Array1706[(class12_sub7.anInt1712)] = null;
							break;
						}
					}
					class12_sub7.anInt1737 = 0;
					for (int i_189_ = 0; i_189_ < class12_sub7.anInt1712; i_189_++)
						class12_sub7.anInt1737 |= class12_sub7.anIntArray1724[i_189_];
				}
			}
		}
	}

	public void method856(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anInt1220; i++) {
			for (int i_190_ = 0; i_190_ < anInt1235; i_190_++) {
				for (int i_191_ = 0; i_191_ < anInt1222; i_191_++) {
					Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[i][i_190_][i_191_];
					if (class12_sub7 != null) {
						Class55 class55 = class12_sub7.aClass55_1710;
						if (class55 != null
								&& (class55.aClass12_Sub12_Sub11_1302 instanceof Class12_Sub12_Sub11_Sub4)) {
							Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class55.aClass12_Sub12_Sub11_1302);
							if (class12_sub12_sub11_sub4.aClass35Array2804 != null) {
								method827(class12_sub12_sub11_sub4, i, i_190_,
										i_191_, 1, 1);
								if (class55.aClass12_Sub12_Sub11_1307 instanceof Class12_Sub12_Sub11_Sub4) {
									Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4_192_ = ((Class12_Sub12_Sub11_Sub4) class55.aClass12_Sub12_Sub11_1307);
									if ((class12_sub12_sub11_sub4_192_.aClass35Array2804) != null) {
										method827(
												class12_sub12_sub11_sub4_192_,
												i, i_190_, i_191_, 1, 1);
										method841(class12_sub12_sub11_sub4,
												class12_sub12_sub11_sub4_192_,
												0, 0, 0, false);
										class12_sub12_sub11_sub4_192_
												.method487(arg0, arg1, arg2);
									}
								}
								class12_sub12_sub11_sub4.method487(arg0, arg1,
										arg2);
							}
						}
						for (int i_193_ = 0; i_193_ < class12_sub7.anInt1712; i_193_++) {
							Class32 class32 = class12_sub7.aClass32Array1706[i_193_];
							if (class32 != null
									&& (class32.aClass12_Sub12_Sub11_774 instanceof Class12_Sub12_Sub11_Sub4)) {
								Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class32.aClass12_Sub12_Sub11_774);
								if (class12_sub12_sub11_sub4.aClass35Array2804 != null) {
									method827(class12_sub12_sub11_sub4, i,
											i_190_, i_191_, (class32.anInt800
													- class32.anInt786 + 1),
											(class32.anInt796
													- class32.anInt784 + 1));
									class12_sub12_sub11_sub4.method487(arg0,
											arg1, arg2);
								}
							}
						}
						Class44 class44 = class12_sub7.aClass44_1720;
						if (class44 != null
								&& (class44.aClass12_Sub12_Sub11_1033 instanceof Class12_Sub12_Sub11_Sub4)) {
							Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class44.aClass12_Sub12_Sub11_1033);
							if (class12_sub12_sub11_sub4.aClass35Array2804 != null) {
								method865(class12_sub12_sub11_sub4, i, i_190_,
										i_191_);
								class12_sub12_sub11_sub4.method487(arg0, arg1,
										arg2);
							}
						}
					}
				}
			}
		}
	}

	public void method857(Class46 arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
		int i = arg0.anIntArray1060.length;
		for (int i_194_ = 0; i_194_ < i; i_194_++) {
			int i_195_ = arg0.anIntArray1060[i_194_] - anInt1206;
			int i_196_ = arg0.anIntArray1071[i_194_] - anInt1241;
			int i_197_ = arg0.anIntArray1066[i_194_] - anInt1208;
			int i_198_ = i_197_ * arg3 + i_195_ * arg4 >> 16;
			i_197_ = i_197_ * arg4 - i_195_ * arg3 >> 16;
			i_195_ = i_198_;
			i_198_ = i_196_ * arg2 - i_197_ * arg1 >> 16;
			i_197_ = i_196_ * arg1 + i_197_ * arg2 >> 16;
			i_196_ = i_198_;
			if (i_197_ < 50)
				return;
			if (arg0.anIntArray1080 != null) {
				Class46.anIntArray1079[i_194_] = i_195_;
				Class46.anIntArray1070[i_194_] = i_196_;
				Class46.anIntArray1063[i_194_] = i_197_;
			}
			Class46.anIntArray1065[i_194_] = Class12_Sub12_Sub7_Sub3.anInt2598
					+ (i_195_ << 9) / i_197_;
			Class46.anIntArray1078[i_194_] = Class12_Sub12_Sub7_Sub3.anInt2593
					+ (i_196_ << 9) / i_197_;
		}
		Class12_Sub12_Sub7_Sub3.anInt2590 = 0;
		i = arg0.anIntArray1064.length;
		for (int i_199_ = 0; i_199_ < i; i_199_++) {
			int i_200_ = arg0.anIntArray1064[i_199_];
			int i_201_ = arg0.anIntArray1067[i_199_];
			int i_202_ = arg0.anIntArray1068[i_199_];
			int i_203_ = Class46.anIntArray1065[i_200_];
			int i_204_ = Class46.anIntArray1065[i_201_];
			int i_205_ = Class46.anIntArray1065[i_202_];
			int i_206_ = Class46.anIntArray1078[i_200_];
			int i_207_ = Class46.anIntArray1078[i_201_];
			int i_208_ = Class46.anIntArray1078[i_202_];
			if (((i_203_ - i_204_) * (i_208_ - i_207_) - (i_206_ - i_207_)
					* (i_205_ - i_204_)) > 0) {
				Class12_Sub12_Sub7_Sub3.aBoolean2595 = false;
				if (i_203_ < 0 || i_204_ < 0 || i_205_ < 0
						|| i_203_ > Class12_Sub12_Sub7_Sub3.anInt2592
						|| i_204_ > Class12_Sub12_Sub7_Sub3.anInt2592
						|| i_205_ > Class12_Sub12_Sub7_Sub3.anInt2592)
					Class12_Sub12_Sub7_Sub3.aBoolean2595 = true;
				if (aBoolean1216
						&& method860(anInt1229, anInt1210, i_206_, i_207_,
								i_208_, i_203_, i_204_, i_205_)) {
					anInt1218 = arg5;
					anInt1225 = arg6;
				}
				if (arg0.anIntArray1080 == null
						|| arg0.anIntArray1080[i_199_] == -1) {
					if (arg0.anIntArray1076[i_199_] != 12345678)
						Class12_Sub12_Sub7_Sub3.method378(i_206_, i_207_,
								i_208_, i_203_, i_204_, i_205_,
								arg0.anIntArray1076[i_199_],
								arg0.anIntArray1072[i_199_],
								arg0.anIntArray1059[i_199_]);
				} else if (!aBoolean1212) {
					if (arg0.aBoolean1074)
						Class12_Sub12_Sub7_Sub3.method377(i_206_, i_207_,
								i_208_, i_203_, i_204_, i_205_,
								arg0.anIntArray1076[i_199_],
								arg0.anIntArray1072[i_199_],
								arg0.anIntArray1059[i_199_],
								Class46.anIntArray1079[0],
								Class46.anIntArray1079[1],
								Class46.anIntArray1079[3],
								Class46.anIntArray1070[0],
								Class46.anIntArray1070[1],
								Class46.anIntArray1070[3],
								Class46.anIntArray1063[0],
								Class46.anIntArray1063[1],
								Class46.anIntArray1063[3],
								arg0.anIntArray1080[i_199_]);
					else
						Class12_Sub12_Sub7_Sub3.method377(i_206_, i_207_,
								i_208_, i_203_, i_204_, i_205_,
								arg0.anIntArray1076[i_199_],
								arg0.anIntArray1072[i_199_],
								arg0.anIntArray1059[i_199_],
								Class46.anIntArray1079[i_200_],
								Class46.anIntArray1079[i_201_],
								Class46.anIntArray1079[i_202_],
								Class46.anIntArray1070[i_200_],
								Class46.anIntArray1070[i_201_],
								Class46.anIntArray1070[i_202_],
								Class46.anIntArray1063[i_200_],
								Class46.anIntArray1063[i_201_],
								Class46.anIntArray1063[i_202_],
								arg0.anIntArray1080[i_199_]);
				} else {
					int i_209_ = (Class12_Sub12_Sub7_Sub3.anInterface3_2607
							.method6(arg0.anIntArray1080[i_199_], (byte) -120));
					Class12_Sub12_Sub7_Sub3.method378(i_206_, i_207_, i_208_,
							i_203_, i_204_, i_205_,
							method831(i_209_, arg0.anIntArray1076[i_199_]),
							method831(i_209_, arg0.anIntArray1072[i_199_]),
							method831(i_209_, arg0.anIntArray1059[i_199_]));
				}
			}
		}
	}

	public void method858() {
		for (int i = 0; i < anInt1220; i++) {
			for (int i_210_ = 0; i_210_ < anInt1235; i_210_++) {
				for (int i_211_ = 0; i_211_ < anInt1222; i_211_++)
					aClass12_Sub7ArrayArrayArray1221[i][i_210_][i_211_] = null;
			}
		}
		for (int i = 0; i < anInt1209; i++) {
			for (int i_212_ = 0; i_212_ < anIntArray1237[i]; i_212_++)
				aClass47ArrayArray1205[i][i_212_] = null;
			anIntArray1237[i] = 0;
		}
		for (int i = 0; i < anInt1214; i++)
			aClass32Array1244[i] = null;
		anInt1214 = 0;
		for (int i = 0; i < aClass32Array1240.length; i++)
			aClass32Array1240[i] = null;
	}

	public void method859(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, int arg8, int arg9, int arg10,
			int arg11, int arg12, int arg13, int arg14, int arg15, int arg16,
			int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			Class29 class29 = new Class29(arg10, arg11, arg12, arg13, -1,
					arg18, false);
			for (int i = arg0; i >= 0; i--) {
				if (aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] == null)
					aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] = new Class12_Sub7(
							i, arg1, arg2);
			}
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].aClass29_1715 = class29;
		} else if (arg3 == 1) {
			Class29 class29 = new Class29(arg14, arg15, arg16, arg17, arg5,
					arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int i = arg0; i >= 0; i--) {
				if (aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] == null)
					aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] = new Class12_Sub7(
							i, arg1, arg2);
			}
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].aClass29_1715 = class29;
		} else {
			Class46 class46 = new Class46(arg3, arg4, arg5, arg1, arg2, arg6,
					arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15,
					arg16, arg17, arg18, arg19);
			for (int i = arg0; i >= 0; i--) {
				if (aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] == null)
					aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] = new Class12_Sub7(
							i, arg1, arg2);
			}
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].aClass46_1719 = class46;
		}
	}

	public boolean method860(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
			return false;
		if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
			return false;
		if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
			return false;
		if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
			return false;
		int i = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
		int i_213_ = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7)
				* (arg2 - arg4);
		int i_214_ = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6)
				* (arg4 - arg3);
		if (i * i_214_ > 0 && i_214_ * i_213_ > 0)
			return true;
		return false;
	}

	public void method861(int arg0, int arg1, int arg2, int arg3) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null) {
			Class4 class4 = class12_sub7.aClass4_1728;
			if (class4 != null) {
				int i = arg1 * 128 + 64;
				int i_215_ = arg2 * 128 + 64;
				class4.anInt147 = i + (class4.anInt147 - i) * arg3 / 16;
				class4.anInt134 = i_215_ + (class4.anInt134 - i_215_) * arg3
						/ 16;
			}
		}
	}

	public void method862(int arg0, int arg1, int arg2, int arg3,
			Class12_Sub12_Sub11 arg4, int arg5, int arg6, int arg7, int arg8,
			int arg9, int arg10) {
		if (arg4 != null) {
			Class4 class4 = new Class4();
			class4.anInt130 = arg9;
			class4.anInt145 = arg10;
			class4.anInt147 = arg1 * 128 + 64 + arg7;
			class4.anInt134 = arg2 * 128 + 64 + arg8;
			class4.anInt131 = arg3;
			class4.aClass12_Sub12_Sub11_133 = arg4;
			class4.anInt135 = arg5;
			class4.anInt127 = arg6;
			for (int i = arg0; i >= 0; i--) {
				if (aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] == null)
					aClass12_Sub7ArrayArrayArray1221[i][arg1][arg2] = new Class12_Sub7(
							i, arg1, arg2);
			}
			aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2].aClass4_1728 = class4;
		}
	}

	public void method863(int arg0) {
		anInt1233 = arg0;
		for (int i = 0; i < anInt1235; i++) {
			for (int i_216_ = 0; i_216_ < anInt1222; i_216_++) {
				if (aClass12_Sub7ArrayArrayArray1221[arg0][i][i_216_] == null)
					aClass12_Sub7ArrayArrayArray1221[arg0][i][i_216_] = new Class12_Sub7(
							arg0, i, i_216_);
			}
		}
	}

	public int method864(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null || class12_sub7.aClass44_1720 == null)
			return 0;
		return class12_sub7.aClass44_1720.anInt1048;
	}

	public void method865(Class12_Sub12_Sub11_Sub4 arg0, int arg1, int arg2,
			int arg3) {
		if (arg2 < anInt1235) {
			Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg1][arg2 + 1][arg3];
			if (class12_sub7 != null
					&& class12_sub7.aClass44_1720 != null
					&& (class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033 instanceof Class12_Sub12_Sub11_Sub4)) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033);
				if (class12_sub12_sub11_sub4.aClass35Array2804 != null)
					method841(arg0, class12_sub12_sub11_sub4, 128, 0, 0, true);
			}
		}
		if (arg3 < anInt1235) {
			Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg1][arg2][arg3 + 1];
			if (class12_sub7 != null
					&& class12_sub7.aClass44_1720 != null
					&& (class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033 instanceof Class12_Sub12_Sub11_Sub4)) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033);
				if (class12_sub12_sub11_sub4.aClass35Array2804 != null)
					method841(arg0, class12_sub12_sub11_sub4, 0, 0, 128, true);
			}
		}
		if (arg2 < anInt1235 && arg3 < anInt1222) {
			Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg1][arg2 + 1][arg3 + 1];
			if (class12_sub7 != null
					&& class12_sub7.aClass44_1720 != null
					&& (class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033 instanceof Class12_Sub12_Sub11_Sub4)) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033);
				if (class12_sub12_sub11_sub4.aClass35Array2804 != null)
					method841(arg0, class12_sub12_sub11_sub4, 128, 0, 128, true);
			}
		}
		if (arg2 < anInt1235 && arg3 > 0) {
			Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg1][arg2 + 1][arg3 - 1];
			if (class12_sub7 != null
					&& class12_sub7.aClass44_1720 != null
					&& (class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033 instanceof Class12_Sub12_Sub11_Sub4)) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = ((Class12_Sub12_Sub11_Sub4) class12_sub7.aClass44_1720.aClass12_Sub12_Sub11_1033);
				if (class12_sub12_sub11_sub4.aClass35Array2804 != null)
					method841(arg0, class12_sub12_sub11_sub4, 128, 0, -128,
							true);
			}
		}
	}

	public boolean method866(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anInt1215; i++) {
			Class47 class47 = aClass47Array1230[i];
			if (class47.anInt1095 == 1) {
				int i_217_ = class47.anInt1110 - arg0;
				if (i_217_ > 0) {
					int i_218_ = (class47.anInt1081 + (class47.anInt1083
							* i_217_ >> 8));
					int i_219_ = (class47.anInt1084 + (class47.anInt1106
							* i_217_ >> 8));
					int i_220_ = (class47.anInt1105 + (class47.anInt1098
							* i_217_ >> 8));
					int i_221_ = (class47.anInt1090 + (class47.anInt1107
							* i_217_ >> 8));
					if (arg2 >= i_218_ && arg2 <= i_219_ && arg1 >= i_220_
							&& arg1 <= i_221_)
						return true;
				}
			} else if (class47.anInt1095 == 2) {
				int i_222_ = arg0 - class47.anInt1110;
				if (i_222_ > 0) {
					int i_223_ = (class47.anInt1081 + (class47.anInt1083
							* i_222_ >> 8));
					int i_224_ = (class47.anInt1084 + (class47.anInt1106
							* i_222_ >> 8));
					int i_225_ = (class47.anInt1105 + (class47.anInt1098
							* i_222_ >> 8));
					int i_226_ = (class47.anInt1090 + (class47.anInt1107
							* i_222_ >> 8));
					if (arg2 >= i_223_ && arg2 <= i_224_ && arg1 >= i_225_
							&& arg1 <= i_226_)
						return true;
				}
			} else if (class47.anInt1095 == 3) {
				int i_227_ = class47.anInt1081 - arg2;
				if (i_227_ > 0) {
					int i_228_ = (class47.anInt1110 + (class47.anInt1104
							* i_227_ >> 8));
					int i_229_ = (class47.anInt1082 + (class47.anInt1093
							* i_227_ >> 8));
					int i_230_ = (class47.anInt1105 + (class47.anInt1098
							* i_227_ >> 8));
					int i_231_ = (class47.anInt1090 + (class47.anInt1107
							* i_227_ >> 8));
					if (arg0 >= i_228_ && arg0 <= i_229_ && arg1 >= i_230_
							&& arg1 <= i_231_)
						return true;
				}
			} else if (class47.anInt1095 == 4) {
				int i_232_ = arg2 - class47.anInt1081;
				if (i_232_ > 0) {
					int i_233_ = (class47.anInt1110 + (class47.anInt1104
							* i_232_ >> 8));
					int i_234_ = (class47.anInt1082 + (class47.anInt1093
							* i_232_ >> 8));
					int i_235_ = (class47.anInt1105 + (class47.anInt1098
							* i_232_ >> 8));
					int i_236_ = (class47.anInt1090 + (class47.anInt1107
							* i_232_ >> 8));
					if (arg0 >= i_233_ && arg0 <= i_234_ && arg1 >= i_235_
							&& arg1 <= i_236_)
						return true;
				}
			} else if (class47.anInt1095 == 5) {
				int i_237_ = arg1 - class47.anInt1105;
				if (i_237_ > 0) {
					int i_238_ = (class47.anInt1110 + (class47.anInt1104
							* i_237_ >> 8));
					int i_239_ = (class47.anInt1082 + (class47.anInt1093
							* i_237_ >> 8));
					int i_240_ = (class47.anInt1081 + (class47.anInt1083
							* i_237_ >> 8));
					int i_241_ = (class47.anInt1084 + (class47.anInt1106
							* i_237_ >> 8));
					if (arg0 >= i_238_ && arg0 <= i_239_ && arg2 >= i_240_
							&& arg2 <= i_241_)
						return true;
				}
			}
		}
		return false;
	}

	public void method867(int arg0, int arg1) {
		aBoolean1216 = true;
		anInt1229 = arg0;
		anInt1210 = arg1;
		anInt1218 = -1;
		anInt1225 = -1;
	}

	public void method868(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 != null)
			class12_sub7.aClass21_1727 = null;
	}

	public Class32 method869(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null)
			return null;
		for (int i = 0; i < class12_sub7.anInt1712; i++) {
			Class32 class32 = class12_sub7.aClass32Array1706[i];
			if ((class32.anInt788 >> 29 & 0x3) == 2 && class32.anInt786 == arg1
					&& class32.anInt784 == arg2)
				return class32;
		}
		return null;
	}

	public Class52(int arg0, int arg1, int arg2, int[][][] arg3) {
		anIntArrayArray1247 = (new int[][] {
				{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
				{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
				{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
				{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } });
		anIntArray1260 = new int[10000];
		anIntArray1262 = new int[10000];
		anInt1220 = arg0;
		anInt1235 = arg1;
		anInt1222 = arg2;
		aClass12_Sub7ArrayArrayArray1221 = new Class12_Sub7[arg0][arg1][arg2];
		anIntArrayArrayArray1236 = new int[arg0][arg1 + 1][arg2 + 1];
		anIntArrayArrayArray1234 = arg3;
		method858();
	}

	public boolean method870(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		if (arg1 == arg2 && arg3 == arg4) {
			if (!method824(arg0, arg1, arg3))
				return false;
			int i = arg1 << 7;
			int i_242_ = arg3 << 7;
			if (method866(i + 1, anIntArrayArrayArray1234[arg0][arg1][arg3]
					- arg5, i_242_ + 1)
					&& method866(
							i + 128 - 1,
							(anIntArrayArrayArray1234[arg0][arg1 + 1][arg3] - arg5),
							i_242_ + 1)
					&& method866(
							i + 128 - 1,
							(anIntArrayArrayArray1234[arg0][arg1 + 1][arg3 + 1])
									- arg5, i_242_ + 128 - 1)
					&& method866(
							i + 1,
							(anIntArrayArrayArray1234[arg0][arg1][arg3 + 1] - arg5),
							i_242_ + 128 - 1))
				return true;
			return false;
		}
		for (int i = arg1; i <= arg2; i++) {
			for (int i_243_ = arg3; i_243_ <= arg4; i_243_++) {
				if (anIntArrayArrayArray1236[arg0][i][i_243_] == -anInt1217)
					return false;
			}
		}
		int i = (arg1 << 7) + 1;
		int i_244_ = (arg3 << 7) + 2;
		int i_245_ = anIntArrayArrayArray1234[arg0][arg1][arg3] - arg5;
		if (!method866(i, i_245_, i_244_))
			return false;
		int i_246_ = (arg2 << 7) - 1;
		if (!method866(i_246_, i_245_, i_244_))
			return false;
		int i_247_ = (arg4 << 7) - 1;
		if (!method866(i, i_245_, i_247_))
			return false;
		if (!method866(i_246_, i_245_, i_247_))
			return false;
		return true;
	}

	public int method871(int arg0, int arg1, int arg2) {
		Class12_Sub7 class12_sub7 = aClass12_Sub7ArrayArrayArray1221[arg0][arg1][arg2];
		if (class12_sub7 == null)
			return 0;
		for (int i = 0; i < class12_sub7.anInt1712; i++) {
			Class32 class32 = class12_sub7.aClass32Array1706[i];
			if ((class32.anInt788 >> 29 & 0x3) == 2 && class32.anInt786 == arg1
					&& class32.anInt784 == arg2)
				return class32.anInt788;
		}
		return 0;
	}

	static {
		anInt1210 = 0;
		anIntArray1226 = new int[] { 53, -53, -53, 53 };
		anInt1218 = -1;
		aClass47Array1230 = new Class47[500];
		anInt1229 = 0;
		aClass47ArrayArray1205 = new Class47[anInt1209][500];
		anIntArray1207 = new int[] { -45, 45, 45, -45 };
		anIntArray1237 = new int[anInt1209];
		aClass32Array1240 = new Class32[100];
		anIntArray1238 = new int[] { 45, 45, -45, -45 };
		anInt1239 = 0;
		anInt1225 = -1;
		anInt1231 = 0;
		aBoolean1216 = false;
		anIntArray1232 = new int[] { -53, -53, 53, 53 };
		aClass8_1245 = new Class8();
		anIntArray1253 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray1255 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray1251 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		aBooleanArrayArrayArrayArray1261 = new boolean[8][32][51][51];
		anIntArray1252 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		anIntArray1265 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		anIntArray1257 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray1263 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	}
}
