package com.jagex;/* com.jagex.Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class8 {
	public static int anInt174;
	public static int anInt175;
	public static int anInt176;
	public static RSString aClass59_177;
	public static int anInt178;
	public static int anInt179;
	public static int anInt180;
	public Class12 aClass12_181 = new Class12();
	public static boolean aBoolean182;
	public static int anInt183;
	public static int anInt184;
	public static int anInt185;
	public static int anInt186;
	public static RSString aClass59_187 = Class55.method898(
			"Please check your message)2centre for details)3", -10983);
	public static boolean aBoolean188 = false;
	public static RSString aClass59_189;
	public static int anInt190;
	public static RSString aClass59_191;
	public static int anInt192;
	public static boolean aBoolean193;
	public static int anInt194;
	public static RSString aClass59_195;
	public static int anInt196;
	public static int anInt197;
	public static RSString aClass59_198;
	public static int anInt199;
	public static int anInt200;
	public static int anInt201;
	public Class12 aClass12_202;

	public Class12 method89(int arg0) {
		try {
			Class12 class12 = aClass12_181.aClass12_317;
			if (arg0 != 3)
				aBoolean182 = false;
			anInt199++;
			if (class12 == aClass12_181) {
				aClass12_202 = null;
				return null;
			}
			aClass12_202 = class12.aClass12_317;
			return class12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.E(" + arg0 + ')');
		}
	}

	public static void method90(int arg0, int arg1, int arg2, byte arg3,
			int arg4, int arg5) {
		anInt200++;
		int i = Class12_Sub12_Sub8.aClass52_2295.method842(arg5, arg1, arg0);
		if ((i ^ 0xffffffff) != -1) {
			int i_0_ = Class12_Sub12_Sub8.aClass52_2295.method844(arg5, arg1,
					arg0, i);
			int i_1_ = i_0_ >> -1633741338 & 0x3;
			int i_2_ = 0x1f & i_0_;
			int i_3_ = arg2;
			if (i > 0)
				i_3_ = arg4;
			int[] is = Class31.aClass12_Sub12_Sub7_Sub1_753.anIntArray2578;
			int i_4_ = i >> 1274714478 & 0x7fff;
			Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas.method39(
					arg3 ^ 0x15, i_4_);
			int i_5_ = 24624 - -(4 * arg1) + (52736 + -(512 * arg0)) * 4;
			if (class12_sub12_sub9.anInt2332 != -1) {
				Class12_Sub12_Sub7_Sub2 class12_sub12_sub7_sub2 = (Class21.aClass12_Sub12_Sub7_Sub2Array495[class12_sub12_sub9.anInt2332]);
				if (class12_sub12_sub7_sub2 != null) {
					int i_6_ = ((4 * class12_sub12_sub9.anInt2334 - class12_sub12_sub7_sub2.anInt2583) / 2);
					int i_7_ = ((class12_sub12_sub9.anInt2318 * 4 - class12_sub12_sub7_sub2.anInt2589) / 2);
					class12_sub12_sub7_sub2
							.method370(
									i_7_ + (48 + arg1 * 4),
									48
											- -(4 * (-arg0 + 104 + -class12_sub12_sub9.anInt2334))
											+ i_6_);
				}
			} else {
				if (i_2_ == 0 || i_2_ == 2) {
					if (i_1_ != 0) {
						if ((i_1_ ^ 0xffffffff) != -2) {
							if (i_1_ != 2) {
								if (i_1_ == 3) {
									is[i_5_ + 1536] = i_3_;
									is[1536 + i_5_ + 1] = i_3_;
									is[i_5_ + 1536 + 2] = i_3_;
									is[1536 + (i_5_ - -3)] = i_3_;
								}
							} else {
								is[i_5_ + 3] = i_3_;
								is[3 + (i_5_ + 512)] = i_3_;
								is[1024 + i_5_ + 3] = i_3_;
								is[3 + i_5_ + 1536] = i_3_;
							}
						} else {
							is[i_5_] = i_3_;
							is[i_5_ + 1] = i_3_;
							is[i_5_ + 2] = i_3_;
							is[3 + i_5_] = i_3_;
						}
					} else {
						is[i_5_] = i_3_;
						is[512 + i_5_] = i_3_;
						is[1024 + i_5_] = i_3_;
						is[i_5_ + 1536] = i_3_;
					}
				}
				if ((i_2_ ^ 0xffffffff) == -4) {
					if ((i_1_ ^ 0xffffffff) != -1) {
						if (i_1_ != 1) {
							if (i_1_ == 2)
								is[3 + (i_5_ - -1536)] = i_3_;
							else if (i_1_ == 3)
								is[i_5_ - -1536] = i_3_;
						} else
							is[3 + i_5_] = i_3_;
					} else
						is[i_5_] = i_3_;
				}
				if (i_2_ == 2) {
					if (i_1_ == 3) {
						is[i_5_] = i_3_;
						is[512 + i_5_] = i_3_;
						is[i_5_ - -1024] = i_3_;
						is[1536 + i_5_] = i_3_;
					} else if (i_1_ != 0) {
						if (i_1_ == 1) {
							is[3 + i_5_] = i_3_;
							is[512 + (i_5_ - -3)] = i_3_;
							is[1024 + (3 + i_5_)] = i_3_;
							is[3 + (i_5_ - -1536)] = i_3_;
						} else if (i_1_ == 2) {
							is[i_5_ + 1536] = i_3_;
							is[i_5_ - -1537] = i_3_;
							is[1536 + i_5_ + 2] = i_3_;
							is[i_5_ + 1539] = i_3_;
						}
					} else {
						is[i_5_] = i_3_;
						is[i_5_ + 1] = i_3_;
						is[2 + i_5_] = i_3_;
						is[3 + i_5_] = i_3_;
					}
				}
			}
		}
		i = Class12_Sub12_Sub8.aClass52_2295.method871(arg5, arg1, arg0);
		if (arg3 == 19) {
			if (i != 0) {
				int i_8_ = Class12_Sub12_Sub8.aClass52_2295.method844(arg5,
						arg1, arg0, i);
				int i_9_ = (0xdb & i_8_) >> -858212250;
				int i_10_ = i_8_ & 0x1f;
				int i_11_ = (i & 0x1fffe1ee) >> 201510638;
				Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas.method39(6,
						i_11_);
				if (class12_sub12_sub9.anInt2332 != -1) {
					Class12_Sub12_Sub7_Sub2 class12_sub12_sub7_sub2 = (Class21.aClass12_Sub12_Sub7_Sub2Array495[class12_sub12_sub9.anInt2332]);
					if (class12_sub12_sub7_sub2 != null) {
						int i_12_ = ((class12_sub12_sub9.anInt2318 * 4 + -class12_sub12_sub7_sub2.anInt2589) / 2);
						int i_13_ = ((class12_sub12_sub9.anInt2334 * 4 - class12_sub12_sub7_sub2.anInt2583) / 2);
						class12_sub12_sub7_sub2
								.method370(
										48 - (-(4 * arg1) - i_12_),
										48
												+ 4
												* (-arg0 + 104 + -(class12_sub12_sub9.anInt2334))
												+ i_13_);
					}
				} else if (i_10_ == 9) {
					int i_14_ = 15658734;
					int i_15_ = arg1 * 4 + 24624 - -(2048 * (103 - arg0));
					if ((i ^ 0xffffffff) < -1)
						i_14_ = 15597568;
					int[] is = Class31.aClass12_Sub12_Sub7_Sub1_753.anIntArray2578;
					if (i_9_ != 0 && (i_9_ ^ 0xffffffff) != -3) {
						is[i_15_] = i_14_;
						is[1 + (512 + i_15_)] = i_14_;
						is[1026 + i_15_] = i_14_;
						is[3 + i_15_ - -1536] = i_14_;
					} else {
						is[1536 + i_15_] = i_14_;
						is[i_15_ - -1024 - -1] = i_14_;
						is[i_15_ - -514] = i_14_;
						is[i_15_ + 3] = i_14_;
					}
				}
			}
			i = Class12_Sub12_Sub8.aClass52_2295.method864(arg5, arg1, arg0);
			if ((i ^ 0xffffffff) != -1) {
				int i_16_ = i >> 1664859854 & 0x7fff;
				Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas.method39(6,
						i_16_);
				if (class12_sub12_sub9.anInt2332 != -1) {
					Class12_Sub12_Sub7_Sub2 class12_sub12_sub7_sub2 = (Class21.aClass12_Sub12_Sub7_Sub2Array495[class12_sub12_sub9.anInt2332]);
					if (class12_sub12_sub7_sub2 != null) {
						int i_17_ = ((-class12_sub12_sub7_sub2.anInt2589 + 4 * class12_sub12_sub9.anInt2318) / 2);
						int i_18_ = ((class12_sub12_sub9.anInt2334 * 4 - class12_sub12_sub7_sub2.anInt2583) / 2);
						class12_sub12_sub7_sub2
								.method370(
										48 + arg1 * 4 - -i_17_,
										i_18_
												+ (48 + 4 * (104 - arg0 - class12_sub12_sub9.anInt2334)));
					}
				}
			}
		}
	}

	public Class12 method91(byte arg0) {
		try {
			Class12 class12 = aClass12_181.aClass12_321;
			if (arg0 != 86)
				aClass59_187 = null;
			anInt178++;
			if (class12 == aClass12_181) {
				aClass12_202 = null;
				return null;
			}
			aClass12_202 = class12.aClass12_321;
			return class12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.J(" + arg0 + ')');
		}
	}

	public static void method92(byte arg0) {
		try {
			aClass59_198 = null;
			aClass59_187 = null;
			aClass59_177 = null;
			aClass59_189 = null;
			aClass59_191 = null;
			int i = -121 / ((-38 - arg0) / 52);
			aClass59_195 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.B(" + arg0 + ')');
		}
	}

	public static void method93(int arg0) {
		anInt192++;
		for (Class12_Sub12_Sub11_Sub5 class12_sub12_sub11_sub5 = ((Class12_Sub12_Sub11_Sub5) Class10.aClass8_243
				.method91((byte) 86)); class12_sub12_sub11_sub5 != null; class12_sub12_sub11_sub5 = ((Class12_Sub12_Sub11_Sub5) Class10.aClass8_243
				.method100(-29860))) {
			if (RSString.anInt1504 != class12_sub12_sub11_sub5.anInt2876
					|| class12_sub12_sub11_sub5.aBoolean2870)
				class12_sub12_sub11_sub5.method143((byte) 39);
			else if (Class64_Sub2.anInt1968 >= class12_sub12_sub11_sub5.anInt2849) {
				class12_sub12_sub11_sub5.method505(
						Class12_Sub12_Sub11_Sub6.anInt2903, (byte) -85);
				if (!class12_sub12_sub11_sub5.aBoolean2870)
					Class12_Sub12_Sub8.aClass52_2295.method833(
							class12_sub12_sub11_sub5.anInt2876,
							class12_sub12_sub11_sub5.anInt2847,
							class12_sub12_sub11_sub5.anInt2865,
							class12_sub12_sub11_sub5.anInt2868, 60,
							class12_sub12_sub11_sub5, 0, -1, false);
				else
					class12_sub12_sub11_sub5.method143((byte) 39);
			}
		}
		if (arg0 != -3934)
			aBoolean188 = true;
	}

	public Class12 method94(byte arg0) {
		try {
			anInt194++;
			Class12 class12 = aClass12_181.aClass12_317;
			if (arg0 <= 16)
				return null;
			if (class12 == aClass12_181)
				return null;
			class12.method143((byte) 39);
			return class12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.K(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub1 method95(int arg0, int arg1) {
		try {
			anInt176++;
			Class12_Sub12_Sub1 class12_sub12_sub1 = ((Class12_Sub12_Sub1) Class41.aClass27_963
					.method673(arg1 + 107, (long) arg0));
			if (class12_sub12_sub1 != null)
				return class12_sub12_sub1;
			byte[] is = Class48.aClass26_1134.method631(arg1, true, arg0);
			class12_sub12_sub1 = new Class12_Sub12_Sub1();
			if (is != null)
				class12_sub12_sub1.method280((byte) 117, new Buffer(is),
						arg0);
			class12_sub12_sub1.method278(false);
			Class41.aClass27_963.method678((byte) 123, class12_sub12_sub1,
					(long) arg0);
			return class12_sub12_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method96(boolean arg0) {
		try {
			anInt196++;
			Class7.method83((byte) 77, 0, null, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.G(" + arg0 + ')');
		}
	}

	public void method97(Class12 arg0, int arg1) {
		anInt197++;
		if (arg0.aClass12_317 != null)
			arg0.method143((byte) 39);
		arg0.aClass12_321 = aClass12_181.aClass12_321;
		arg0.aClass12_317 = aClass12_181;
		arg0.aClass12_317.aClass12_321 = arg0;
		arg0.aClass12_321.aClass12_317 = arg0;
		if (arg1 != 1)
			aBoolean193 = true;
	}

	public void method98(Class12 arg0, byte arg1) {
		try {
			if (arg0.aClass12_317 != null)
				arg0.method143((byte) 39);
			if (arg1 == 79) {
				anInt179++;
				arg0.aClass12_321 = aClass12_181;
				arg0.aClass12_317 = aClass12_181.aClass12_317;
				arg0.aClass12_317.aClass12_321 = arg0;
				arg0.aClass12_321.aClass12_317 = arg0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.L("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public void method99(byte arg0, Class12 arg1, Class12 arg2) {
		try {
			if (arg1.aClass12_317 != null)
				arg1.method143((byte) 39);
			anInt190++;
			arg1.aClass12_321 = arg2;
			arg1.aClass12_317 = arg2.aClass12_317;
			if (arg0 >= -27)
				aBoolean182 = false;
			arg1.aClass12_317.aClass12_321 = arg1;
			arg1.aClass12_321.aClass12_317 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("bb.C(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class12 method100(int arg0) {
		try {
			Class12 class12 = aClass12_202;
			anInt185++;
			if (aClass12_181 == class12) {
				aClass12_202 = null;
				return null;
			}
			if (arg0 != -29860)
				return null;
			aClass12_202 = class12.aClass12_321;
			return class12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.P(" + arg0 + ')');
		}
	}

	public void method101(int arg0) {
		try {
			anInt201++;
			if (arg0 != 2)
				method103(65);
			for (;;) {
				Class12 class12 = aClass12_181.aClass12_321;
				if (class12 == aClass12_181)
					break;
				class12.method143((byte) 39);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.N(" + arg0 + ')');
		}
	}

	public Class12 method102(int arg0) {
		try {
			anInt186++;
			Class12 class12 = aClass12_181.aClass12_321;
			if (class12 == aClass12_181)
				return null;
			class12.method143((byte) 39);
			if (arg0 != 5416)
				return null;
			return class12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.F(" + arg0 + ')');
		}
	}

	public Class12 method103(int arg0) {
		try {
			int i = 23 % (arg0 / 59);
			anInt180++;
			Class12 class12 = aClass12_202;
			if (aClass12_181 == class12) {
				aClass12_202 = null;
				return null;
			}
			aClass12_202 = class12.aClass12_317;
			return class12;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.M(" + arg0 + ')');
		}
	}

	public Class8() {
		try {
			aClass12_181.aClass12_321 = aClass12_181;
			aClass12_181.aClass12_317 = aClass12_181;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "bb.<init>(" + ')');
		}
	}

	public static void method104(int arg0, int arg1, boolean arg2, byte[] arg3,
			int arg4) {
		try {
			anInt183++;
			if (Class5.aClass64_158 != null) {
				if (arg1 >= (Class33.anInt825 ^ 0xffffffff)) {
					arg0 -= 20;
					if (arg0 < 1)
						arg0 = 1;
					Class49.anInt1142 = arg0;
					if ((Class33.anInt825 ^ 0xffffffff) == -1)
						Player.anInt2976 = 0;
					else {
						int i = RuntimeException_Sub1.method1003(
								(Class33.anInt825), (arg1 ^ 0xffffffff));
						i -= Class15.anInt395;
						Player.anInt2976 = ((-1
								+ Player.anInt2976 + (i + 3600)) / Player.anInt2976);
					}
					Class33.aBoolean822 = arg2;
					Class27.aByteArray655 = arg3;
					Class12_Sub12_Sub13.anInt2421 = arg4;
				} else if (Class49.anInt1142 != 0) {
					Class33.aBoolean822 = arg2;
					Class27.aByteArray655 = arg3;
					Class12_Sub12_Sub13.anInt2421 = arg4;
				} else
					Class7.method83((byte) -76, arg4, arg3, arg2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("bb.I(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ')'));
		}
	}

	static {
		aBoolean182 = false;
		aClass59_191 = Class55.method898("Ok", -10983);
		aBoolean193 = false;
		aClass59_189 = Class55.method898("Bad session id)3", -10983);
		anInt175 = 0;
		anInt184 = -1;
		aClass59_195 = aClass59_191;
		aClass59_198 = aClass59_187;
		aClass59_177 = aClass59_189;
	}
}
