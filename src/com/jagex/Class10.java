package com.jagex;/* com.jagex.Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Cache;

public class Class10 {
	public static int anInt216;
	public static int anInt217;
	public static int anInt218;
	public static int anInt219;
	public static int[] anIntArray220;
	public static int anInt221;
	public int[][] anIntArrayArray222;
	public int anInt223;
	public static boolean aBoolean224;
	public static RSString aClass59_225;
	public static int anInt226 = 0;
	public int anInt227;
	public static int anInt228;
	public static int anInt229;
	public static int anInt230;
	public int anInt231;
	public static int anInt232;
	public static int anInt233;
	public static int anInt234;
	public static int anInt235;
	public static int anInt236;
	public static RSString aClass59_237;
	public static int anInt238;
	public static int anInt239;
	public static Class8 aClass8_240;
	public static int anInt241;
	public int anInt242;
	public static Class8 aClass8_243;
	public static RSString aClass59_244;
	public static Class51 aClass51_245;
	public static RSString aClass59_246;
	public static RSString aClass59_247;
	public static int anInt248;
	public static RSString aClass59_249;
	public static int anInt250;

	public void method115(byte arg0, int arg1, int arg2) {
		try {
			if (arg0 <= 91)
				method116(-43, -96, false, -108, 77, 11, -46);
			arg1 -= anInt242;
			anInt230++;
			arg2 -= anInt231;
			anIntArrayArray222[arg1][arg2] = Class12_Sub12_Sub12.method519(
					anIntArrayArray222[arg1][arg2], 14680063);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.C(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method116(int arg0, int arg1, boolean arg2, int arg3, int arg4,
			int arg5, int arg6) {
		try {
			arg1 -= anInt231;
			if (arg0 == (arg3 ^ 0xffffffff) || arg3 == 3) {
				int i = arg5;
				arg5 = arg6;
				arg6 = i;
			}
			anInt221++;
			arg4 -= anInt242;
			int i = 256;
			if (arg2)
				i += 131072;
			for (int i_0_ = arg4; i_0_ < arg4 + arg5; i_0_++) {
				if ((i_0_ ^ 0xffffffff) <= -1 && i_0_ < anInt227) {
					for (int i_1_ = arg1; i_1_ < arg6 + arg1; i_1_++) {
						if ((i_1_ ^ 0xffffffff) <= -1
								&& (anInt223 ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
							method118((byte) -108, i_1_, i_0_, i);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.H(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public void method117(int arg0, int arg1, int arg2, int arg3, int arg4,
			boolean arg5, int arg6) {
		try {
			arg3 -= anInt242;
			int i = 256;
			arg4 -= anInt231;
			anInt218++;
			if (arg0 == 1 || (arg0 ^ 0xffffffff) == -4) {
				int i_2_ = arg6;
				arg6 = arg2;
				arg2 = i_2_;
			}
			if (arg5)
				i += 131072;
			if (arg1 == -19742) {
				for (int i_3_ = arg3; (arg3 + arg6 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
					if (i_3_ >= 0
							&& (anInt227 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
						for (int i_4_ = arg4; arg4 + arg2 > i_4_; i_4_++) {
							if (i_4_ >= 0 && anInt223 > i_4_)
								method119((byte) -104, i_3_, i, i_4_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public void method118(byte arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 != -108)
				anInt250 = -32;
			anIntArrayArray222[arg2][arg1] = Class12_Sub12_Sub9.method421(
					anIntArrayArray222[arg2][arg1], arg3);
			anInt217++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.F(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public void method119(byte arg0, int arg1, int arg2, int arg3) {
		anIntArrayArray222[arg1][arg3] = Class12_Sub12_Sub12.method519(
				anIntArrayArray222[arg1][arg3], 16777215 + -arg2);
		anInt234++;
		if (arg0 != -104)
			aBoolean224 = true;
	}

	public boolean method120(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, byte arg6, int arg7) {
		try {
			int i = arg1 + (arg5 + -1);
			anInt219++;
			int i_5_ = -1 + arg2 + arg0;
			if (arg6 != 64)
				return false;
			if ((arg5 ^ 0xffffffff) >= (arg4 ^ 0xffffffff)
					&& (arg4 ^ 0xffffffff) >= (i ^ 0xffffffff) && arg3 >= arg0
					&& arg3 <= i_5_)
				return true;
			if ((arg5 - 1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
					&& (arg3 ^ 0xffffffff) <= (arg0 ^ 0xffffffff)
					&& (i_5_ ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
					&& (anIntArrayArray222[arg4 - anInt242][-anInt231 + arg3] & 0x8 ^ 0xffffffff) == -1
					&& (arg7 & 0x8) == 0)
				return true;
			if ((arg4 ^ 0xffffffff) == (1 + i ^ 0xffffffff)
					&& arg0 <= arg3
					&& (i_5_ ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
					&& ((0x80 & anIntArrayArray222[-anInt242 + arg4][arg3
							- anInt231]) ^ 0xffffffff) == -1
					&& (0x2 & arg7 ^ 0xffffffff) == -1)
				return true;
			if ((arg3 ^ 0xffffffff) == (-1 + arg0 ^ 0xffffffff)
					&& arg4 >= arg5
					&& (i ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
					&& ((anIntArrayArray222[-anInt242 + arg4][-anInt231 + arg3] & 0x2) ^ 0xffffffff) == -1
					&& (arg7 & 0x4 ^ 0xffffffff) == -1)
				return true;
			if ((arg3 ^ 0xffffffff) == (1 + i_5_ ^ 0xffffffff)
					&& arg5 <= arg4
					&& (i ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
					&& ((anIntArrayArray222[arg4 + -anInt242][-anInt231 + arg3] & 0x20) ^ 0xffffffff) == -1
					&& (0x1 & arg7) == 0)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.I(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ',' + arg7 + ')'));
		}
	}

	public boolean method121(byte arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
		try {
			anInt239++;
			if (arg5 == arg3 && (arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
				return true;
			arg3 -= anInt242;
			arg5 -= anInt242;
			arg6 -= anInt231;
			int i = 40 % ((arg0 - -52) / 37);
			arg1 -= anInt231;
			if (arg4 == 0) {
				if ((arg2 ^ 0xffffffff) == -1) {
					if ((-1 + arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& (arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
						return true;
					if ((arg3 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
							&& (arg6 + 1 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
							&& (anIntArrayArray222[arg3][arg1] & 0x1280120 ^ 0xffffffff) == -1)
						return true;
					if (arg3 == arg5
							&& (arg1 ^ 0xffffffff) == (arg6 + -1 ^ 0xffffffff)
							&& (anIntArrayArray222[arg3][arg1] & 0x1280102) == 0)
						return true;
				} else if ((arg2 ^ 0xffffffff) != -2) {
					if ((arg2 ^ 0xffffffff) == -3) {
						if ((arg3 ^ 0xffffffff) == (arg5 - -1 ^ 0xffffffff)
								&& arg1 == arg6)
							return true;
						if (arg5 == arg3
								&& arg1 == 1 + arg6
								&& (0x1280120 & anIntArrayArray222[arg3][arg1] ^ 0xffffffff) == -1)
							return true;
						if (arg3 == arg5
								&& -1 + arg6 == arg1
								&& ((anIntArrayArray222[arg3][arg1] & 0x1280102) == 0))
							return true;
					} else if (arg2 == 3) {
						if ((arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
								&& (-1 + arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
							return true;
						if ((arg3 ^ 0xffffffff) == (arg5 + -1 ^ 0xffffffff)
								&& (arg1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
								&& ((anIntArrayArray222[arg3][arg1] & 0x1280108) == 0))
							return true;
						if (arg5 - -1 == arg3
								&& arg1 == arg6
								&& (anIntArrayArray222[arg3][arg1] & 0x1280180 ^ 0xffffffff) == -1)
							return true;
					}
				} else {
					if (arg3 == arg5
							&& (arg6 + 1 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
						return true;
					if (-1 + arg5 == arg3
							&& arg6 == arg1
							&& (anIntArrayArray222[arg3][arg1] & 0x1280108) == 0)
						return true;
					if (arg3 == arg5 - -1
							&& (arg1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
							&& (0x1280180 & anIntArrayArray222[arg3][arg1] ^ 0xffffffff) == -1)
						return true;
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if ((-1 + arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& (arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
						return true;
					if ((arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& (arg6 + 1 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
						return true;
					if ((1 + arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& arg1 == arg6
							&& (0x1280180 & anIntArrayArray222[arg3][arg1] ^ 0xffffffff) == -1)
						return true;
					if (arg3 == arg5
							&& (-1 + arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
							&& (0x1280102 & anIntArrayArray222[arg3][arg1] ^ 0xffffffff) == -1)
						return true;
				} else if (arg2 != 1) {
					if (arg2 != 2) {
						if (arg2 == 3) {
							if (-1 + arg5 == arg3
									&& (arg1 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
								return true;
							if ((arg3 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
									&& arg1 == arg6 + 1
									&& (0x1280120 & anIntArrayArray222[arg3][arg1] ^ 0xffffffff) == -1)
								return true;
							if ((arg3 ^ 0xffffffff) == (arg5 + 1 ^ 0xffffffff)
									&& arg6 == arg1
									&& (0x1280180 & anIntArrayArray222[arg3][arg1]) == 0)
								return true;
							if ((arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
									&& arg1 == arg6 - 1)
								return true;
						}
					} else {
						if ((arg5 + -1 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
								&& (arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
								&& ((0x1280108 & anIntArrayArray222[arg3][arg1]) == 0))
							return true;
						if (arg5 == arg3
								&& (arg6 - -1 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
								&& ((0x1280120 & anIntArrayArray222[arg3][arg1]) == 0))
							return true;
						if (arg5 + 1 == arg3 && arg6 == arg1)
							return true;
						if ((arg3 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
								&& arg1 == arg6 - 1)
							return true;
					}
				} else {
					if ((-1 + arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& arg1 == arg6
							&& (0x1280108 & anIntArrayArray222[arg3][arg1] ^ 0xffffffff) == -1)
						return true;
					if ((arg3 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
							&& (arg1 ^ 0xffffffff) == (arg6 - -1 ^ 0xffffffff))
						return true;
					if (arg3 == 1 + arg5
							&& (arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
						return true;
					if (arg5 == arg3
							&& (arg1 ^ 0xffffffff) == (-1 + arg6 ^ 0xffffffff)
							&& (0x1280102 & anIntArrayArray222[arg3][arg1] ^ 0xffffffff) == -1)
						return true;
				}
			}
			if (arg4 == 9) {
				if ((arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
						&& 1 + arg6 == arg1
						&& ((anIntArrayArray222[arg3][arg1] & 0x20 ^ 0xffffffff) == -1))
					return true;
				if ((arg5 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
						&& -1 + arg6 == arg1
						&& ((anIntArrayArray222[arg3][arg1] & 0x2 ^ 0xffffffff) == -1))
					return true;
				if (arg3 == -1 + arg5
						&& (arg1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
						&& ((anIntArrayArray222[arg3][arg1] & 0x8 ^ 0xffffffff) == -1))
					return true;
				if (1 + arg5 == arg3
						&& (arg6 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
						&& ((anIntArrayArray222[arg3][arg1] & 0x80 ^ 0xffffffff) == -1))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.N(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public void method122(boolean arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		arg1 -= anInt242;
		arg5 -= anInt231;
		anInt235++;
		if ((arg4 ^ 0xffffffff) == -1) {
			if (arg2 == 0) {
				method119((byte) -104, arg1, 128, arg5);
				method119((byte) -104, arg1 + -1, 8, arg5);
			}
			if (arg2 == 1) {
				method119((byte) -104, arg1, 2, arg5);
				method119((byte) -104, arg1, 32, arg5 + 1);
			}
			if (arg2 == 2) {
				method119((byte) -104, arg1, 8, arg5);
				method119((byte) -104, 1 + arg1, 128, arg5);
			}
			if ((arg2 ^ 0xffffffff) == -4) {
				method119((byte) -104, arg1, 32, arg5);
				method119((byte) -104, arg1, 2, arg5 - 1);
			}
		}
		if (arg3 != -157)
			aClass59_247 = null;
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method119((byte) -104, arg1, 1, arg5);
				method119((byte) -104, -1 + arg1, 16, arg5 + 1);
			}
			if ((arg2 ^ 0xffffffff) == -2) {
				method119((byte) -104, arg1, 4, arg5);
				method119((byte) -104, arg1 - -1, 64, arg5 - -1);
			}
			if ((arg2 ^ 0xffffffff) == -3) {
				method119((byte) -104, arg1, 16, arg5);
				method119((byte) -104, arg1 - -1, 1, arg5 - 1);
			}
			if (arg2 == 3) {
				method119((byte) -104, arg1, 64, arg5);
				method119((byte) -104, -1 + arg1, 4, -1 + arg5);
			}
		}
		if (arg4 == 2) {
			if ((arg2 ^ 0xffffffff) == -1) {
				method119((byte) -104, arg1, 130, arg5);
				method119((byte) -104, -1 + arg1, 8, arg5);
				method119((byte) -104, arg1, 32, arg5 - -1);
			}
			if ((arg2 ^ 0xffffffff) == -2) {
				method119((byte) -104, arg1, 10, arg5);
				method119((byte) -104, arg1, 32, 1 + arg5);
				method119((byte) -104, arg1 - -1, 128, arg5);
			}
			if ((arg2 ^ 0xffffffff) == -3) {
				method119((byte) -104, arg1, 40, arg5);
				method119((byte) -104, 1 + arg1, 128, arg5);
				method119((byte) -104, arg1, 2, -1 + arg5);
			}
			if (arg2 == 3) {
				method119((byte) -104, arg1, 160, arg5);
				method119((byte) -104, arg1, 2, arg5 + -1);
				method119((byte) -104, arg1 + -1, 8, arg5);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if ((arg2 ^ 0xffffffff) == -1) {
					method119((byte) -104, arg1, 65536, arg5);
					method119((byte) -104, arg1 - 1, 4096, arg5);
				}
				if ((arg2 ^ 0xffffffff) == -2) {
					method119((byte) -104, arg1, 1024, arg5);
					method119((byte) -104, arg1, 16384, arg5 - -1);
				}
				if ((arg2 ^ 0xffffffff) == -3) {
					method119((byte) -104, arg1, 4096, arg5);
					method119((byte) -104, arg1 - -1, 65536, arg5);
				}
				if ((arg2 ^ 0xffffffff) == -4) {
					method119((byte) -104, arg1, 16384, arg5);
					method119((byte) -104, arg1, 1024, -1 + arg5);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if ((arg2 ^ 0xffffffff) == -1) {
					method119((byte) -104, arg1, 512, arg5);
					method119((byte) -104, -1 + arg1, 8192, arg5 + 1);
				}
				if ((arg2 ^ 0xffffffff) == -2) {
					method119((byte) -104, arg1, 2048, arg5);
					method119((byte) -104, 1 + arg1, 32768, arg5 - -1);
				}
				if (arg2 == 2) {
					method119((byte) -104, arg1, 8192, arg5);
					method119((byte) -104, arg1 - -1, 512, -1 + arg5);
				}
				if (arg2 == 3) {
					method119((byte) -104, arg1, 32768, arg5);
					method119((byte) -104, arg1 + -1, 2048, arg5 + -1);
				}
			}
			if ((arg4 ^ 0xffffffff) == -3) {
				if (arg2 == 0) {
					method119((byte) -104, arg1, 66560, arg5);
					method119((byte) -104, -1 + arg1, 4096, arg5);
					method119((byte) -104, arg1, 16384, 1 + arg5);
				}
				if ((arg2 ^ 0xffffffff) == -2) {
					method119((byte) -104, arg1, 5120, arg5);
					method119((byte) -104, arg1, 16384, arg5 - -1);
					method119((byte) -104, 1 + arg1, 65536, arg5);
				}
				if ((arg2 ^ 0xffffffff) == -3) {
					method119((byte) -104, arg1, 20480, arg5);
					method119((byte) -104, arg1 + 1, 65536, arg5);
					method119((byte) -104, arg1, 1024, -1 + arg5);
				}
				if (arg2 == 3) {
					method119((byte) -104, arg1, 81920, arg5);
					method119((byte) -104, arg1, 1024, arg5 + -1);
					method119((byte) -104, -1 + arg1, 4096, arg5);
				}
			}
		}
	}

	public boolean method123(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
		try {
			anInt232++;
			if (arg2 == arg3 && (arg5 ^ 0xffffffff) == (arg4 ^ 0xffffffff))
				return true;
			arg5 -= anInt231;
			arg3 -= anInt242;
			arg4 -= anInt231;
			arg2 -= anInt242;
			if (arg6 == 6 || (arg6 ^ 0xffffffff) == -8) {
				if ((arg6 ^ 0xffffffff) == -8)
					arg0 = 0x3 & arg0 - -2;
				if ((arg0 ^ 0xffffffff) != -1) {
					if (arg0 != 1) {
						if (arg0 != 2) {
							if (arg0 == 3) {
								if (arg2 == 1 + arg3
										&& arg4 == arg5
										&& ((0x80 & anIntArrayArray222[arg2][arg5]) == 0))
									return true;
								if ((arg2 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
										&& ((1 + arg4 ^ 0xffffffff) == (arg5 ^ 0xffffffff))
										&& (anIntArrayArray222[arg2][arg5] & 0x20 ^ 0xffffffff) == -1)
									return true;
							}
						} else {
							if (-1 + arg3 == arg2
									&& arg5 == arg4
									&& (0x8 & anIntArrayArray222[arg2][arg5] ^ 0xffffffff) == -1)
								return true;
							if ((arg3 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
									&& (arg4 + 1 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
									&& (0x20 & anIntArrayArray222[arg2][arg5] ^ 0xffffffff) == -1)
								return true;
						}
					} else {
						if ((-1 + arg3 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
								&& arg4 == arg5
								&& (0x8 & anIntArrayArray222[arg2][arg5] ^ 0xffffffff) == -1)
							return true;
						if ((arg3 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
								&& -1 + arg4 == arg5
								&& (0x2 & anIntArrayArray222[arg2][arg5]) == 0)
							return true;
					}
				} else {
					if (1 + arg3 == arg2
							&& (arg4 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
							&& (0x80 & anIntArrayArray222[arg2][arg5] ^ 0xffffffff) == -1)
						return true;
					if (arg2 == arg3
							&& arg5 == -1 + arg4
							&& ((anIntArrayArray222[arg2][arg5] & 0x2 ^ 0xffffffff) == -1))
						return true;
				}
			}
			if (arg1 != 1)
				method119((byte) 121, 11, 21, 56);
			if ((arg6 ^ 0xffffffff) == -9) {
				if ((arg2 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
						&& (arg4 - -1 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
						&& (0x20 & anIntArrayArray222[arg2][arg5]) == 0)
					return true;
				if ((arg2 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
						&& (arg5 ^ 0xffffffff) == (arg4 - 1 ^ 0xffffffff)
						&& (0x2 & anIntArrayArray222[arg2][arg5]) == 0)
					return true;
				if ((-1 + arg3 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
						&& (arg5 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
						&& (anIntArrayArray222[arg2][arg5] & 0x8) == 0)
					return true;
				if ((arg2 ^ 0xffffffff) == (1 + arg3 ^ 0xffffffff)
						&& (arg5 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
						&& (0x80 & anIntArrayArray222[arg2][arg5]) == 0)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.M(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public static void method124(boolean arg0) {
		try {
			aClass59_244 = null;
			aClass59_225 = null;
			aClass59_249 = null;
			aClass59_246 = null;
			anIntArray220 = null;
			aClass8_243 = null;
			aClass51_245 = null;
			aClass59_247 = null;
			if (arg0 == true) {
				aClass59_237 = null;
				aClass8_240 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cb.A(" + arg0 + ')');
		}
	}

	public static void method125(int arg0) {
		try {
			for (int i = 0; ((Class12_Sub12_Sub11_Sub2_Sub1.anInt2931 ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
				Class58.anIntArray1346[i]--;
				if (Class58.anIntArray1346[i] < -10) {
					Class12_Sub12_Sub11_Sub2_Sub1.anInt2931--;
					for (int i_6_ = i; ((Class12_Sub12_Sub11_Sub2_Sub1.anInt2931 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
						RSApplet.anIntArray12[i_6_] = RSApplet.anIntArray12[1 + i_6_];
						Class12_Sub12_Sub12.aClass34Array2408[i_6_] = Class12_Sub12_Sub12.aClass34Array2408[i_6_
								- -1];
						Class12_Sub12_Sub11_Sub5.anIntArray2882[i_6_] = (Class12_Sub12_Sub11_Sub5.anIntArray2882[i_6_
								- -1]);
						Class58.anIntArray1346[i_6_] = Class58.anIntArray1346[i_6_ + 1];
					}
					i--;
				} else {
					Class34 class34 = Class12_Sub12_Sub12.aClass34Array2408[i];
					if (class34 == null) {
						class34 = Class34.method719(Cache.synthSoundsArchive,
								RSApplet.anIntArray12[i], 0);
						if (class34 == null)
							continue;
						Class58.anIntArray1346[i] += class34.method718();
						Class12_Sub12_Sub12.aClass34Array2408[i] = class34;
					}
					if ((Class58.anIntArray1346[i] ^ 0xffffffff) > -1) {
						Class12_Sub8_Sub1 class12_sub8_sub1 = (class34
								.method717()
								.method194(Class12_Sub12_Sub11_Sub3.aClass33_2766));
						Class12_Sub5_Sub2 class12_sub5_sub2 = Class12_Sub5_Sub2
								.method181(class12_sub8_sub1, 100,
										Class55.anInt1308);
						class12_sub5_sub2
								.method179((Class12_Sub12_Sub11_Sub5.anIntArray2882[i])
										+ -1);
						Class12_Sub12_Sub14.aClass12_Sub5_Sub1_2450
								.method169(class12_sub5_sub2);
						Class58.anIntArray1346[i] = -100;
					}
				}
			}
			if (arg0 != 256)
				aClass8_243 = null;
			if ((Class12_Sub12_Sub11.anInt2386 ^ 0xffffffff) < -1) {
				Class12_Sub12_Sub11.anInt2386 -= 20;
				if ((Class12_Sub12_Sub11.anInt2386 ^ 0xffffffff) > -1)
					Class12_Sub12_Sub11.anInt2386 = 0;
				if ((Class12_Sub12_Sub11.anInt2386 ^ 0xffffffff) == -1
						&& (Class30.anInt744 ^ 0xffffffff) != -1
						&& Class28.anInt672 != -1)
					Class11.method138(Class30.anInt744, Class28.anInt672,
							(Cache.midiSongsArchive), 0,
							0, (byte) -106, false);
			}
			anInt238++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cb.K(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub4 method126(boolean arg0) {
		try {
			anInt229++;
			Class12_Sub12_Sub7_Sub4 class12_sub12_sub7_sub4 = new Class12_Sub12_Sub7_Sub4(
					Class32.anIntArray778, Class55.anIntArray1313,
					Class44.anIntArray1027, Class15.anIntArray385,
					Class28.aByteArrayArray669);
			if (arg0 != false)
				anInt248 = 48;
			Class1.method46((byte) 113);
			return class12_sub12_sub7_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cb.E(" + arg0 + ')');
		}
	}

	public void method127(int arg0) {
		try {
			anInt241++;
			if (arg0 <= -102) {
				for (int i = 0; anInt227 > i; i++) {
					for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (anInt223 ^ 0xffffffff); i_7_++) {
						if (i == 0
								|| i_7_ == 0
								|| (i ^ 0xffffffff) == (anInt227 + -1 ^ 0xffffffff)
								|| (i_7_ ^ 0xffffffff) == (anInt223 - 1 ^ 0xffffffff))
							anIntArrayArray222[i][i_7_] = 16777215;
						else
							anIntArrayArray222[i][i_7_] = 16777216;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cb.G(" + arg0 + ')');
		}
	}

	public void method128(int arg0, int arg1, int arg2) {
		try {
			if (arg1 > -121)
				method120(98, 54, -99, -124, 2, -63, (byte) -49, 39);
			arg2 -= anInt231;
			arg0 -= anInt242;
			anIntArrayArray222[arg0][arg2] = Class12_Sub12_Sub9.method421(
					anIntArrayArray222[arg0][arg2], 2097152);
			anInt233++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("cb.L(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method129(int arg0, int arg1, int arg2, boolean arg3, int arg4,
			byte arg5) {
		arg1 -= anInt242;
		int i = 81 % ((71 - arg5) / 40);
		arg2 -= anInt231;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method118((byte) -108, arg2, arg1, 128);
				method118((byte) -108, arg2, -1 + arg1, 8);
			}
			if ((arg4 ^ 0xffffffff) == -2) {
				method118((byte) -108, arg2, arg1, 2);
				method118((byte) -108, arg2 + 1, arg1, 32);
			}
			if ((arg4 ^ 0xffffffff) == -3) {
				method118((byte) -108, arg2, arg1, 8);
				method118((byte) -108, arg2, arg1 + 1, 128);
			}
			if (arg4 == 3) {
				method118((byte) -108, arg2, arg1, 32);
				method118((byte) -108, arg2 - 1, arg1, 2);
			}
		}
		anInt216++;
		if ((arg0 ^ 0xffffffff) == -2 || arg0 == 3) {
			if ((arg4 ^ 0xffffffff) == -1) {
				method118((byte) -108, arg2, arg1, 1);
				method118((byte) -108, arg2 + 1, -1 + arg1, 16);
			}
			if ((arg4 ^ 0xffffffff) == -2) {
				method118((byte) -108, arg2, arg1, 4);
				method118((byte) -108, arg2 - -1, arg1 + 1, 64);
			}
			if (arg4 == 2) {
				method118((byte) -108, arg2, arg1, 16);
				method118((byte) -108, arg2 - 1, arg1 + 1, 1);
			}
			if (arg4 == 3) {
				method118((byte) -108, arg2, arg1, 64);
				method118((byte) -108, arg2 - 1, -1 + arg1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				method118((byte) -108, arg2, arg1, 130);
				method118((byte) -108, arg2, arg1 + -1, 8);
				method118((byte) -108, arg2 + 1, arg1, 32);
			}
			if (arg4 == 1) {
				method118((byte) -108, arg2, arg1, 10);
				method118((byte) -108, 1 + arg2, arg1, 32);
				method118((byte) -108, arg2, arg1 - -1, 128);
			}
			if (arg4 == 2) {
				method118((byte) -108, arg2, arg1, 40);
				method118((byte) -108, arg2, arg1 + 1, 128);
				method118((byte) -108, -1 + arg2, arg1, 2);
			}
			if ((arg4 ^ 0xffffffff) == -4) {
				method118((byte) -108, arg2, arg1, 160);
				method118((byte) -108, -1 + arg2, arg1, 2);
				method118((byte) -108, arg2, arg1 - 1, 8);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if ((arg4 ^ 0xffffffff) == -1) {
					method118((byte) -108, arg2, arg1, 65536);
					method118((byte) -108, arg2, -1 + arg1, 4096);
				}
				if (arg4 == 1) {
					method118((byte) -108, arg2, arg1, 1024);
					method118((byte) -108, 1 + arg2, arg1, 16384);
				}
				if ((arg4 ^ 0xffffffff) == -3) {
					method118((byte) -108, arg2, arg1, 4096);
					method118((byte) -108, arg2, 1 + arg1, 65536);
				}
				if ((arg4 ^ 0xffffffff) == -4) {
					method118((byte) -108, arg2, arg1, 16384);
					method118((byte) -108, -1 + arg2, arg1, 1024);
				}
			}
			if ((arg0 ^ 0xffffffff) == -2 || (arg0 ^ 0xffffffff) == -4) {
				if (arg4 == 0) {
					method118((byte) -108, arg2, arg1, 512);
					method118((byte) -108, 1 + arg2, arg1 - 1, 8192);
				}
				if (arg4 == 1) {
					method118((byte) -108, arg2, arg1, 2048);
					method118((byte) -108, arg2 - -1, arg1 + 1, 32768);
				}
				if (arg4 == 2) {
					method118((byte) -108, arg2, arg1, 8192);
					method118((byte) -108, arg2 + -1, arg1 - -1, 512);
				}
				if (arg4 == 3) {
					method118((byte) -108, arg2, arg1, 32768);
					method118((byte) -108, arg2 - 1, -1 + arg1, 2048);
				}
			}
			if ((arg0 ^ 0xffffffff) == -3) {
				if (arg4 == 0) {
					method118((byte) -108, arg2, arg1, 66560);
					method118((byte) -108, arg2, -1 + arg1, 4096);
					method118((byte) -108, 1 + arg2, arg1, 16384);
				}
				if ((arg4 ^ 0xffffffff) == -2) {
					method118((byte) -108, arg2, arg1, 5120);
					method118((byte) -108, 1 + arg2, arg1, 16384);
					method118((byte) -108, arg2, 1 + arg1, 65536);
				}
				if ((arg4 ^ 0xffffffff) == -3) {
					method118((byte) -108, arg2, arg1, 20480);
					method118((byte) -108, arg2, 1 + arg1, 65536);
					method118((byte) -108, -1 + arg2, arg1, 1024);
				}
				if ((arg4 ^ 0xffffffff) == -4) {
					method118((byte) -108, arg2, arg1, 81920);
					method118((byte) -108, arg2 + -1, arg1, 1024);
					method118((byte) -108, arg2, arg1 + -1, 4096);
				}
			}
		}
	}

	public Class10(int arg0, int arg1) {
		try {
			anInt227 = arg0;
			anInt223 = arg1;
			anIntArrayArray222 = new int[anInt227][anInt223];
			anInt231 = 0;
			anInt242 = 0;
			method127(-120);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "cb.<init>(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		anIntArray220 = new int[2048];
		aBoolean224 = false;
		aClass59_237 = Class55.method898(" @cya@", -10983);
		aClass59_225 = Class55.method898("titlebox", -10983);
		aClass8_240 = new Class8();
		aClass8_243 = new Class8();
		aClass59_246 = Class55.method898("*6n", -10983);
		anInt248 = 0;
		aClass59_249 = Class55.method898("l", -10983);
		aClass59_247 = Class55.method898("Loaded interfaces", -10983);
		aClass59_244 = aClass59_247;
	}
}
