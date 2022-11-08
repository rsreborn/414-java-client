package com.jagex;/* com.jagex.Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.util.Statics;

public class Class44 {
	public static RSString aClass59_1025;
	public int anInt1026;
	public static int[] anIntArray1027;
	public static RSString aClass59_1028;
	public int anInt1029;
	public static int anInt1030;
	public static RSString aClass59_1031;
	public static int anInt1032;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_1033;
	public static RSString aClass59_1034;
	public static RSString aClass59_1035 = Class55.method898("@red@", -10983);
	public static RSString aClass59_1036 = Class55.method898("Loaded sprites",
			-10983);
	public static int anInt1037;
	public static boolean aBoolean1038 = false;
	public static RSString aClass59_1039 = Class55.method898("Cabbage", -10983);
	public static int[] anIntArray1040;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_1041;
	public static Class62 aClass62_1042;
	public static RSString aClass59_1043;
	public int anInt1044;
	public static int anInt1045;
	public static Class27 aClass27_1046;
	public static boolean aBoolean1047;
	public int anInt1048;
	public int anInt1049;
	public static RSString aClass59_1050;

	public static void method779(byte arg0) {
		try {
			anInt1037++;
			if (Class35.anInt862 != 0) {
				int i = 0;
				if (Class12_Sub1.anInt1617 != 0)
					i = 1;
				Class12_Sub12_Sub7_Sub4 class12_sub12_sub7_sub4 = Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529;
				for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -101; i_0_++) {
					if (Class26.aClass59Array591[i_0_] != null) {
						int i_1_ = Class30.anIntArray746[i_0_];
						RSString class59 = Class12_Sub12_Sub8.aClass59Array2301[i_0_];
						int i_2_ = 0;
						if (class59 != null
								&& class59.method928(
										(Class12_Sub12_Sub16.aClass59_2542), 0)) {
							i_2_ = 1;
							class59 = class59.method945(63, 5);
						}
						if (class59 != null
								&& class59.method928(
										(Class12_Sub12_Sub6.aClass59_2259), 0)) {
							i_2_ = 2;
							class59 = class59.method945(63, 5);
						}
						if (((i_1_ ^ 0xffffffff) == -4 || (i_1_ ^ 0xffffffff) == -8)
								&& (i_1_ == 7
										|| ((Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) == -1) || (Class12_Sub12_Sub3.anInt2154 == 1 && Class12_Sub12_Sub11_Sub5
										.method506(-67, class59)))) {
							int i_3_ = 4;
							int i_4_ = 329 - 13 * i;
							i++;
							class12_sub12_sub7_sub4.method400(
									(Class30.aClass59_739), i_3_, i_4_, 0);
							class12_sub12_sub7_sub4.method400(
									(Class30.aClass59_739), i_3_, -1 + i_4_,
									65535);
							i_3_ += class12_sub12_sub7_sub4
									.method401(Class30.aClass59_739);
							i_3_ += class12_sub12_sub7_sub4.method404(32);
							if ((i_2_ ^ 0xffffffff) == -2) {
								Class15.aClass12_Sub12_Sub7_Sub2Array382[0]
										.method370(i_3_, -12 + i_4_);
								i_3_ += 14;
							}
							if ((i_2_ ^ 0xffffffff) == -3) {
								Class15.aClass12_Sub12_Sub7_Sub2Array382[1]
										.method370(i_3_, i_4_ + -12);
								i_3_ += 14;
							}
							class12_sub12_sub7_sub4
									.method400(
											Statics
													.method251(
															(byte) -71,
															(new RSString[] {
																	class59,
																	(Class48.aClass59_1132),
																	(Class26.aClass59Array591[i_0_]) })),
											i_3_, i_4_, 0);
							class12_sub12_sub7_sub4
									.method400(
											Statics
													.method251(
															(byte) -95,
															(new RSString[] {
																	class59,
																	(Class48.aClass59_1132),
																	(Class26.aClass59Array591[i_0_]) })),
											i_3_, i_4_ + -1, 65535);
							if (i >= 5)
								return;
						}
						if ((i_1_ ^ 0xffffffff) == -6
								&& ((Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) > -3)) {
							int i_5_ = -(i * 13) + 329;
							class12_sub12_sub7_sub4.method400(
									Class26.aClass59Array591[i_0_], 4, i_5_, 0);
							i++;
							class12_sub12_sub7_sub4.method400(
									Class26.aClass59Array591[i_0_], 4, -1
											+ i_5_, 65535);
							if (i >= 5)
								return;
						}
						if ((i_1_ ^ 0xffffffff) == -7
								&& Class12_Sub12_Sub3.anInt2154 < 2) {
							int i_6_ = 329 + -(i * 13);
							i++;
							class12_sub12_sub7_sub4
									.method400(
											(Statics
													.method251(
															(byte) -74,
															(new RSString[] {
																	Statics.aClass59_1837,
																	Class14.aClass59_371,
																	class59,
																	Class48.aClass59_1132,
																	Class26.aClass59Array591[i_0_] }))),
											4, i_6_, 0);
							class12_sub12_sub7_sub4
									.method400(
											(Statics
													.method251(
															(byte) -107,
															(new RSString[] {
																	Statics.aClass59_1837,
																	Class14.aClass59_371,
																	class59,
																	Class48.aClass59_1132,
																	Class26.aClass59Array591[i_0_] }))),
											4, -1 + i_6_, 65535);
							if ((i ^ 0xffffffff) <= -6)
								return;
						}
					}
				}
				int i_7_ = -36 / ((-21 - arg0) / 56);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ob.A(" + arg0 + ')');
		}
	}

	public static void method780(byte arg0) {
		if (arg0 == -39) {
			anInt1030++;
			if (Class12_Sub12_Sub13.anInt2431 == 2) {
				Class29.method690(2 * Class12_Sub12_Sub3.anInt2155, arg0 + 121,
						(-Class8.anInt174 + Class20.anInt475 << -1259064985)
								+ Class30.anInt736, (-Class64.anInt1451
								+ Statics.anInt1834 << -1156737625)
								- -Class26.anInt596);
				if ((Class26.anInt626 ^ 0xffffffff) < 0
						&& Class64_Sub2.anInt1968 % 20 < 10)
					Class12_Sub12_Sub13.aClass12_Sub12_Sub7_Sub1Array2422[0]
							.method352(Class26.anInt626 + -12, -28
									+ Class12_Sub4.anInt1679);
			}
		}
	}

	public static void method781(int arg0) {
		try {
			aClass62_1042 = null;
			aClass59_1043 = null;
			aClass59_1039 = null;
			int i = -58 / ((arg0 - -32) / 54);
			aClass59_1028 = null;
			aClass27_1046 = null;
			aClass59_1034 = null;
			aClass59_1035 = null;
			aClass59_1036 = null;
			aClass59_1031 = null;
			anIntArray1040 = null;
			anIntArray1027 = null;
			aClass59_1050 = null;
			aClass12_Sub12_Sub7_Sub2_1041 = null;
			aClass59_1025 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ob.C(" + arg0 + ')');
		}
	}

	public static void method782(int arg0) {
		try {
			while (Game.inBuffer.getRemainingBits(Class5.anInt159
			) >= 26) {
				int i = Game.inBuffer.readBits(14);
				if ((i ^ 0xffffffff) == -16384)
					break;
				if (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i] == null)
					Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i] = new Class12_Sub12_Sub11_Sub2_Sub1();
				Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i];
				Class1.anIntArray76[Class62_Sub2.anInt1916++] = i;
				class12_sub12_sub11_sub2_sub1.anInt2663 = Class64_Sub2.anInt1968;
				int i_8_ = Game.inBuffer.readBits(5);
				if ((i_8_ ^ 0xffffffff) < -16)
					i_8_ -= 32;
				int i_9_ = Game.inBuffer.readBits(5);
				class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923 = Class31
						.method701((byte) 105, Game.inBuffer.readBits(13));
				int i_10_ = Game.inBuffer.readBits(1);
				if ((i_10_ ^ 0xffffffff) == -2)
					Class10.anIntArray220[Class47.anInt1094++] = i;
				if ((i_9_ ^ 0xffffffff) < -16)
					i_9_ -= 32;
				int i_11_ = Game.inBuffer.readBits(1);
				class12_sub12_sub11_sub2_sub1.anInt2700 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2080);
				class12_sub12_sub11_sub2_sub1.anInt2681 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2077);
				class12_sub12_sub11_sub2_sub1.anInt2727 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2097);
				class12_sub12_sub11_sub2_sub1.anInt2706 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2092);
				class12_sub12_sub11_sub2_sub1.anInt2710 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2100);
				class12_sub12_sub11_sub2_sub1.anInt2669 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2068);
				class12_sub12_sub11_sub2_sub1.anInt2662 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2058);
				class12_sub12_sub11_sub2_sub1
						.method453(
								i_8_
										+ (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2671[0]),
								i_11_ == 1,
								false,
								(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anIntArray2708[0])
										+ i_9_);
			}
			anInt1045++;
			if (arg0 != -13354)
				aClass59_1035 = null;
			Game.inBuffer.finishBitAccess();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ob.D(" + arg0 + ')');
		}
	}

	static {
		aClass59_1034 = aClass59_1036;
		aClass59_1031 = Class55.method898(
				"Your ignore list is full)3 Max of 100 hit", -10983);
		aClass59_1043 = aClass59_1031;
		aClass59_1025 = Class55.method898("Please contact customer support)3",
				-10983);
		aClass59_1028 = aClass59_1025;
		aClass27_1046 = new Class27(10);
		aClass59_1050 = Class55.method898("null", -10983);
	}
}
