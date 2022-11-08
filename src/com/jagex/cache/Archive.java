package com.jagex.cache;

import com.jagex.*;
import com.jagex.util.Statics;

public class Archive extends Class26 {
	public static long aLong1870 = 0L;
	public static int anInt1871;
	public static RSString aClass59_1872;
    public boolean aBoolean1874 = false;
	public static int anInt1875;
	public static int anInt1876;
	public static Class26 aClass26_1877;
	public static int anInt1878;
	public static Class62 aClass62_1879;
	public static int anInt1880;
	public static int anInt1881 = 0;
	public static int anInt1882;
	public static int anInt1883;
	public Class36 aClass36_1884;
	public static int anInt1885;
	public static int anInt1886;
	public static Class48 aClass48_1887;
	public volatile boolean[] aBooleanArray1888;
	public static RSString aClass59_1889;
	public static int anInt1890;
	public int anInt1891;
	public static int anInt1892;
	public Class36 aClass36_1893;
	public int anInt1894 = -1;
	public static int anInt1895;
	public static RSString aClass59_1896;
	public static int anInt1897;
	public int anInt1898;
	public volatile boolean aBoolean1899 = false;
	public static int anInt1900;
	public static int anInt1901;
	public static Class12_Sub5 aClass12_Sub5_1902;
	public static int anInt1903;
	public static int anInt1904;

	public void method659(int arg0) {
		anInt1871++;
		aBooleanArray1888 = new boolean[aByteArrayArray620.length];
		if (arg0 == 20440) {
			for (int i = 0; i < aBooleanArray1888.length; i++)
				aBooleanArray1888[i] = false;
			if (aClass36_1884 == null)
				aBoolean1899 = true;
			else {
				anInt1894 = -1;
				for (int i = 0; i < aBooleanArray1888.length; i++) {
					if ((anIntArray599[i] ^ 0xffffffff) < -1) {
						Class62_Sub2.method964(i, aClass36_1884, this, 1);
						anInt1894 = i;
					}
				}
				if (anInt1894 == -1)
					aBoolean1899 = true;
			}
		}
	}

	public int method660(int arg0, int arg1) {
		try {
			anInt1876++;
			if (aByteArrayArray620[arg1] != null)
				return 100;
			if (arg0 != 103)
				anInt1898 = -125;
			if (aBooleanArray1888[arg1])
				return 100;
			return Class12_Sub12_Sub11_Sub3.method465(-10601, anInt1898, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "be.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method634(boolean arg0, int arg1) {
		try {
			anInt1890++;
			if (arg0 != false)
				method659(-38);
			Class12_Sub2.method151(arg1, anInt1898, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "be.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method661(byte[] arg0, boolean arg1, int arg2, int arg3,
			Class36 arg4) {
		do {
			try {
				if (arg2 != -3)
					anInt1903 = 84;
				anInt1883++;
				if (aClass36_1893 == arg4) {
					if (aBoolean1899)
						throw new RuntimeException();
					if (arg0 == null)
						Class12_Sub12_Sub11_Sub6.method512(2119418128, true,
								this, anInt1891, (byte) 0, 255, anInt1898);
					else {
						Class29.aCRC32_692.reset();
						Class29.aCRC32_692.update(arg0, 0, arg0.length);
						int i = (int) Class29.aCRC32_692.getValue();
						if ((anInt1891 ^ 0xffffffff) != (i ^ 0xffffffff))
							Class12_Sub12_Sub11_Sub6.method512(2119418128,
									true, this, anInt1891, (byte) 0, 255,
									anInt1898);
						else {
							this.method640(false, arg0);
							method659(20440);
						}
					}
				} else {
					if (!arg1
							&& (arg3 ^ 0xffffffff) == (anInt1894 ^ 0xffffffff))
						aBoolean1899 = true;
					if (arg0 == null || (arg0.length ^ 0xffffffff) >= -3) {
						aBooleanArray1888[arg3] = false;
						if (aBoolean1874 || arg1)
							Class12_Sub12_Sub11_Sub6.method512(2119418128,
									arg1, this, anIntArray582[arg3], (byte) 2,
									anInt1898, arg3);
					} else {
						Class29.aCRC32_692.reset();
						Class29.aCRC32_692.update(arg0, 0, arg0.length - 2);
						int i = (int) Class29.aCRC32_692.getValue();
						int i_0_ = ((0xff & arg0[-1 + arg0.length]) + ((arg0[-2
								+ arg0.length] & 0xff) << -304161528));
						if (i != anIntArray582[arg3]
								|| anIntArray589[arg3] != i_0_) {
							aBooleanArray1888[arg3] = false;
							if (aBoolean1874 || arg1)
								Class12_Sub12_Sub11_Sub6.method512(2119418128,
										arg1, this, anIntArray582[arg3],
										(byte) 2, anInt1898, arg3);
						} else {
							aBooleanArray1888[arg3] = true;
							if (!arg1)
								break;
							aByteArrayArray620[arg3] = arg0;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, ("be.L("
						+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
						+ arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method662(int arg0) {
		try {
			aClass59_1889 = null;
			aClass48_1887 = null;
			aClass59_1896 = null;
			aClass26_1877 = null;
			aClass59_1872 = null;
			if (arg0 == 1) {
				Cache.basesArchive = null;
				aClass12_Sub5_1902 = null;
				aClass62_1879 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "be.C(" + arg0 + ')');
		}
	}

	public Archive(Class36 arg0, Class36 arg1, int arg2, boolean arg3,
				   boolean arg4, boolean arg5) {
		super(arg3, arg4);
		try {
			aClass36_1884 = arg0;
			aBoolean1874 = arg5;
			aClass36_1893 = arg1;
			anInt1898 = arg2;
			Class40.method748(this, (byte) 0, anInt1898);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("be.<init>("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + arg4 + ',' + arg5 + ')'));
		}
	}

	public void method663(int arg0, int arg1) {
		anInt1892++;
		anInt1891 = arg1;
		if (aClass36_1893 != null)
			Class12_Sub12.method272(anInt1898, 106, this, aClass36_1893);
		else
			Class12_Sub12_Sub11_Sub6.method512(2119418128, true, this,
					anInt1891, (byte) 0, 255, anInt1898);
		if (arg0 != 255)
			anInt1881 = -118;
	}

	public void method650(int arg0, int arg1) {
		anInt1880++;
		if (aClass36_1884 == null || aBooleanArray1888 == null
				|| !aBooleanArray1888[arg1])
			Class12_Sub12_Sub11_Sub6.method512(2119418128, true, this,
					anIntArray582[arg1], (byte) 2, anInt1898, arg1);
		else
			Class12_Sub12.method272(arg1, 127, this, aClass36_1884);
		if (arg0 != 255)
			aBooleanArray1888 = null;
	}

	public static void method664(Class10[] arg0, Class52 arg1, int arg2) {
		try {
			for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
				for (int i_1_ = 0; i_1_ < 104; i_1_++) {
					for (int i_2_ = 0; i_2_ < 104; i_2_++) {
						if (((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[i][i_1_][i_2_]) & 0x1) == 1) {
							int i_3_ = i;
							if ((0x2 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][i_1_][i_2_])) == 2)
								i_3_--;
							if ((i_3_ ^ 0xffffffff) <= -1)
								arg0[i_3_].method128(i_1_, arg2 + 15331, i_2_);
						}
					}
				}
			}
			anInt1900++;
			Class58.anInt1348 += (int) (5.0 * Math.random()) - 2;
			Class19.anInt455 += -2 + (int) (5.0 * Math.random());
			if (Class19.anInt455 < -8)
				Class19.anInt455 = -8;
			if (Class19.anInt455 > 8)
				Class19.anInt455 = 8;
			if ((Class58.anInt1348 ^ 0xffffffff) > 15)
				Class58.anInt1348 = -16;
			if (Class58.anInt1348 > 16)
				Class58.anInt1348 = 16;
			for (int i = 0; i < 4; i++) {
				byte[][] is = RSCanvas.aByteArrayArrayArray43[i];
				int i_4_ = (int) Math.sqrt(5100.0);
				int i_5_ = 768 * i_4_ >> -2040667288;
				for (int i_6_ = 1; (i_6_ ^ 0xffffffff) > -104; i_6_++) {
					for (int i_7_ = 1; i_7_ < 103; i_7_++) {
						int i_8_ = ((Statics.anIntArrayArrayArray569[i][1 + i_7_][i_6_]) + -(Statics.anIntArrayArrayArray569[i][-1
								+ i_7_][i_6_]));
						int i_9_ = (-(Statics.anIntArrayArrayArray569[i][i_7_][-1
								+ i_6_]) + (Statics.anIntArrayArrayArray569[i][i_7_][i_6_ + 1]));
						int i_10_ = (int) Math.sqrt((double) (65536 + (i_8_
								* i_8_ - -(i_9_ * i_9_))));
						int i_11_ = 65536 / i_10_;
						int i_12_ = (i_8_ << -868785688) / i_10_;
						int i_13_ = (i_9_ << 498751688) / i_10_;
						int i_14_ = 96 - -((i_12_ * -50 + (-10 * i_11_ + i_13_
								* -50)) / i_5_);
						int i_15_ = ((is[i_7_][i_6_] >> 982764065)
								+ (is[i_7_ - -1][i_6_] >> 2082730115)
								+ ((is[-1 + i_7_][i_6_] >> -745332286) - -(is[i_7_][-1
										+ i_6_] >> -1724981310)) + (is[i_7_][i_6_ + 1] >> 510141859));
						Class9_Sub2.anIntArrayArray1580[i_7_][i_6_] = i_14_
								+ -i_15_;
					}
				}
				for (int i_16_ = 0; i_16_ < 104; i_16_++) {
					Class64_Sub2.anIntArray1984[i_16_] = 0;
					Class51.anIntArray1185[i_16_] = 0;
					Class12_Sub2.anIntArray1643[i_16_] = 0;
					Class18.anIntArray439[i_16_] = 0;
					Class40.anIntArray951[i_16_] = 0;
				}
				for (int i_17_ = -5; i_17_ < 109; i_17_++) {
					for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -105; i_18_++) {
						int i_19_ = i_17_ + 5;
						if (i_19_ >= 0 && i_19_ < 104) {
							int i_20_ = ((Class12_Sub12_Sub4.aByteArrayArrayArray2204[i][i_19_][i_18_]) & 0xff);
							if ((i_20_ ^ 0xffffffff) < -1) {
								Class12_Sub12_Sub13 class12_sub12_sub13 = Class12_Sub12_Sub9
										.method414(i_20_ + -1, false);
								Class64_Sub2.anIntArray1984[i_18_] += class12_sub12_sub13.anInt2425;
								Class51.anIntArray1185[i_18_] += class12_sub12_sub13.anInt2424;
								Class12_Sub2.anIntArray1643[i_18_] += class12_sub12_sub13.anInt2420;
								Class18.anIntArray439[i_18_] += class12_sub12_sub13.anInt2443;
								Class40.anIntArray951[i_18_]++;
							}
						}
						int i_21_ = -5 + i_17_;
						if (i_21_ >= 0 && i_21_ < 104) {
							int i_22_ = ((Class12_Sub12_Sub4.aByteArrayArrayArray2204[i][i_21_][i_18_]) & 0xff);
							if ((i_22_ ^ 0xffffffff) < -1) {
								Class12_Sub12_Sub13 class12_sub12_sub13 = Class12_Sub12_Sub9
										.method414(-1 + i_22_, false);
								Class64_Sub2.anIntArray1984[i_18_] -= class12_sub12_sub13.anInt2425;
								Class51.anIntArray1185[i_18_] -= class12_sub12_sub13.anInt2424;
								Class12_Sub2.anIntArray1643[i_18_] -= class12_sub12_sub13.anInt2420;
								Class18.anIntArray439[i_18_] -= class12_sub12_sub13.anInt2443;
								Class40.anIntArray951[i_18_]--;
							}
						}
					}
					if ((i_17_ ^ 0xffffffff) <= -2 && i_17_ < 103) {
						int i_23_ = 0;
						int i_24_ = 0;
						int i_25_ = 0;
						int i_26_ = 0;
						int i_27_ = 0;
						for (int i_28_ = -5; i_28_ < 109; i_28_++) {
							int i_29_ = i_28_ + 5;
							if (i_29_ >= 0 && (i_29_ ^ 0xffffffff) > -105) {
								i_25_ += Class12_Sub2.anIntArray1643[i_29_];
								i_23_ += Class64_Sub2.anIntArray1984[i_29_];
								i_26_ += Class18.anIntArray439[i_29_];
								i_27_ += Class40.anIntArray951[i_29_];
								i_24_ += Class51.anIntArray1185[i_29_];
							}
							int i_30_ = -5 + i_28_;
							if (i_30_ >= 0 && i_30_ < 104) {
								i_27_ -= Class40.anIntArray951[i_30_];
								i_26_ -= Class18.anIntArray439[i_30_];
								i_25_ -= Class12_Sub2.anIntArray1643[i_30_];
								i_23_ -= Class64_Sub2.anIntArray1984[i_30_];
								i_24_ -= Class51.anIntArray1185[i_30_];
							}
							if (i_28_ >= 1
									&& i_28_ < 103
									&& (!Class21.aBoolean483
											|| ((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[0][i_17_][i_28_]) & 0x2) != 0 || ((0x10 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[i][i_17_][i_28_]) ^ 0xffffffff) == -1 && ((Class20
											.method602(i_17_, (byte) 47, i,
													i_28_) ^ 0xffffffff) == (Class39.anInt932 ^ 0xffffffff))))) {
								if ((i ^ 0xffffffff) > (anInt1882 ^ 0xffffffff))
									anInt1882 = i;
								int i_31_ = 0xff & (Class12_Sub12_Sub4.aByteArrayArrayArray2204[i][i_17_][i_28_]);
								int i_32_ = 0xff & (Class27.aByteArrayArrayArray654[i][i_17_][i_28_]);
								if ((i_31_ ^ 0xffffffff) < -1 || i_32_ > 0) {
									int i_33_ = (Statics.anIntArrayArrayArray569[i][i_17_
											- -1][i_28_]);
									int i_34_ = (Statics.anIntArrayArrayArray569[i][1 + i_17_][i_28_ + 1]);
									int i_35_ = (Statics.anIntArrayArrayArray569[i][i_17_][1 + i_28_]);
									int i_36_ = (Class9_Sub2.anIntArrayArray1580[i_17_][i_28_]);
									int i_37_ = (Statics.anIntArrayArrayArray569[i][i_17_][i_28_]);
									int i_38_ = (Class9_Sub2.anIntArrayArray1580[i_17_][1 + i_28_]);
									int i_39_ = (Class9_Sub2.anIntArrayArray1580[1 + i_17_][1 + i_28_]);
									int i_40_ = -1;
									int i_41_ = -1;
									int i_42_ = (Class9_Sub2.anIntArrayArray1580[i_17_
											- -1][i_28_]);
									if (i_31_ > 0) {
										int i_43_ = 256 * i_23_ / i_26_;
										int i_44_ = i_24_ / i_27_;
										int i_45_ = i_25_ / i_27_;
										i_41_ = (RuntimeException_Sub1
												.method1004(i_44_, i_43_,
														(byte) 108, i_45_));
										i_43_ = 0xff & Class19.anInt455 + i_43_;
										i_45_ += Class58.anInt1348;
										if (i_45_ < 0)
											i_45_ = 0;
										else if (i_45_ > 255)
											i_45_ = 255;
										i_40_ = (RuntimeException_Sub1
												.method1004(i_44_, i_43_,
														(byte) 112, i_45_));
									}
									if ((i ^ 0xffffffff) < -1) {
										boolean bool = true;
										if (i_31_ == 0
												&& (Class64_Sub2.aByteArrayArrayArray1975[i][i_17_][i_28_]) != 0)
											bool = false;
										if ((i_32_ ^ 0xffffffff) < -1
												&& !(Class8.method95(
														-1 + i_32_,
														arg2 + 15460).aBoolean2043))
											bool = false;
										if (bool
												&& i_33_ == i_37_
												&& ((i_34_ ^ 0xffffffff) == (i_37_ ^ 0xffffffff))
												&& i_35_ == i_37_)
											Class30.anIntArrayArrayArray732[i][i_17_][i_28_] = (Class12_Sub12_Sub9
													.method421(
															(Class30.anIntArrayArrayArray732[i][i_17_][i_28_]),
															2340));
									}
									int i_46_ = 0;
									if ((i_40_ ^ 0xffffffff) != 0)
										i_46_ = (Class12_Sub12_Sub7_Sub3.anIntArray2609[(Class12_Sub12_Sub2
												.method286(31920, 96, i_40_))]);
									if ((i_32_ ^ 0xffffffff) != -1) {
										byte i_47_ = (Class17.aByteArrayArrayArray423[i][i_17_][i_28_]);
										int i_48_ = 1 + (Class64_Sub2.aByteArrayArrayArray1975[i][i_17_][i_28_]);
										Class12_Sub12_Sub1 class12_sub12_sub1 = Class8
												.method95(i_32_ - 1,
														arg2 + 15460);
										int i_49_ = class12_sub12_sub1.anInt2050;
										int i_50_;
										int i_51_;
										if (i_49_ >= 0) {
											i_50_ = -1;
											i_51_ = (Class12_Sub12_Sub7_Sub3.anInterface3_2607
													.method6(i_49_, (byte) -126));
										} else if (class12_sub12_sub1.anInt2040 != 16711935) {
											i_50_ = (RuntimeException_Sub1
													.method1004(
															(class12_sub12_sub1.anInt2046),
															(class12_sub12_sub1.anInt2038),
															(byte) 119,
															(class12_sub12_sub1.anInt2054)));
											int i_52_ = 0xff & ((class12_sub12_sub1.anInt2038) - -Class19.anInt455);
											int i_53_ = (class12_sub12_sub1.anInt2054 - -Class58.anInt1348);
											if (i_53_ < 0)
												i_53_ = 0;
											else if (i_53_ > 255)
												i_53_ = 255;
											i_51_ = (RuntimeException_Sub1
													.method1004(
															(class12_sub12_sub1.anInt2046),
															i_52_, (byte) 121,
															i_53_));
										} else {
											i_50_ = -2;
											i_51_ = -2;
											i_49_ = -1;
										}
										int i_54_ = 0;
										if (i_51_ != -2)
											i_54_ = (Class12_Sub12_Sub7_Sub3.anIntArray2609[(Class12_Sub12_Sub1
													.method274(96, 123, i_51_))]);
										if ((class12_sub12_sub1.anInt2030 ^ 0xffffffff) != 0) {
											int i_55_ = 0xff & ((class12_sub12_sub1.anInt2036) + Class19.anInt455);
											int i_56_ = (class12_sub12_sub1.anInt2033 - -Class58.anInt1348);
											if (i_56_ < 0)
												i_56_ = 0;
											else if (i_56_ > 255)
												i_56_ = 255;
											i_51_ = (RuntimeException_Sub1
													.method1004(
															(class12_sub12_sub1.anInt2051),
															i_55_, (byte) 105,
															i_56_));
											i_54_ = (Class12_Sub12_Sub7_Sub3.anIntArray2609[(Class12_Sub12_Sub1
													.method274(96, 124, i_51_))]);
										}
										arg1.method859(i, i_17_, i_28_, i_48_,
												i_47_, i_49_, i_37_, i_33_,
												i_34_, i_35_,
												(Class12_Sub12_Sub2.method286(
														31920, i_36_, i_41_)),
												(Class12_Sub12_Sub2.method286(
														31920, i_42_, i_41_)),
												(Class12_Sub12_Sub2.method286(
														31920, i_39_, i_41_)),
												(Class12_Sub12_Sub2.method286(
														31920, i_38_, i_41_)),
												Class12_Sub12_Sub1.method274(
														i_36_, 124, i_50_),
												Class12_Sub12_Sub1.method274(
														i_42_, 125, i_50_),
												Class12_Sub12_Sub1.method274(
														i_39_, 125, i_50_),
												Class12_Sub12_Sub1.method274(
														i_38_, 126, i_50_),
												i_46_, i_54_);
									} else
										arg1.method859(i, i_17_, i_28_, 0, 0,
												-1, i_37_, i_33_, i_34_, i_35_,
												(Class12_Sub12_Sub2.method286(
														arg2 + 47376, i_36_,
														i_41_)),
												(Class12_Sub12_Sub2.method286(
														arg2 ^ ~0x40ef, i_42_,
														i_41_)),
												(Class12_Sub12_Sub2.method286(
														31920, i_39_, i_41_)),
												(Class12_Sub12_Sub2.method286(
														31920, i_38_, i_41_)),
												0, 0, 0, 0, i_46_, 0);
								}
							}
						}
					}
				}
				for (int i_57_ = 1; i_57_ < 103; i_57_++) {
					for (int i_58_ = 1; (i_58_ ^ 0xffffffff) > -104; i_58_++)
						arg1.method820(i, i_58_, i_57_,
								Class20.method602(i_58_, (byte) 47, i, i_57_));
				}
				Class12_Sub12_Sub4.aByteArrayArrayArray2204[i] = null;
				Class27.aByteArrayArrayArray654[i] = null;
				Class64_Sub2.aByteArrayArrayArray1975[i] = null;
				Class17.aByteArrayArrayArray423[i] = null;
				RSCanvas.aByteArrayArrayArray43[i] = null;
			}
			arg1.method856(-50, -10, -50);
			int i = 0;
			if (arg2 != -15456)
				method664(null, null, 45);
			for (/**/; (i ^ 0xffffffff) > -105; i++) {
				for (int i_59_ = 0; (i_59_ ^ 0xffffffff) > -105; i_59_++) {
					if (((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][i][i_59_]) & 0x2 ^ 0xffffffff) == -3)
						arg1.method849(i, i_59_);
				}
			}
			int i_60_ = 1;
			int i_61_ = 2;
			int i_62_ = 4;
			for (int i_63_ = 0; i_63_ < 4; i_63_++) {
				if (i_63_ > 0) {
					i_61_ <<= 3;
					i_60_ <<= 3;
					i_62_ <<= 3;
				}
				for (int i_64_ = 0; i_63_ >= i_64_; i_64_++) {
					for (int i_65_ = 0; (i_65_ ^ 0xffffffff) >= -105; i_65_++) {
						for (int i_66_ = 0; (i_66_ ^ 0xffffffff) >= -105; i_66_++) {
							if ((i_60_ & (Class30.anIntArrayArrayArray732[i_64_][i_66_][i_65_])) != 0) {
								int i_67_ = i_65_;
								int i_68_ = i_65_;
								for (/**/; (i_67_ > 0 && ((Class30.anIntArrayArrayArray732[i_64_][i_66_][-1
										+ i_67_]) & i_60_) != 0); i_67_--) {
									/* empty */
								}
								int i_69_ = i_64_;
								for (/**/; (i_68_ < 104 && ((Class30.anIntArrayArrayArray732[i_64_][i_66_][1 + i_68_])
										& i_60_ ^ 0xffffffff) != -1); i_68_++) {
									/* empty */
								}
								int i_70_ = i_64_;
								while_0_: for (/**/; i_69_ > 0; i_69_--) {
									for (int i_71_ = i_67_; ((i_71_ ^ 0xffffffff) >= (i_68_ ^ 0xffffffff)); i_71_++) {
										if (((Class30.anIntArrayArrayArray732[i_69_
												+ -1][i_66_][i_71_]) & i_60_) == 0)
											break while_0_;
									}
								}
								while_1_: for (/**/; ((i_63_ ^ 0xffffffff) < (i_70_ ^ 0xffffffff)); i_70_++) {
									for (int i_72_ = i_67_; ((i_68_ ^ 0xffffffff) <= (i_72_ ^ 0xffffffff)); i_72_++) {
										if ((i_60_ & (Class30.anIntArrayArrayArray732[i_70_
												- -1][i_66_][i_72_])) == 0)
											break while_1_;
									}
								}
								int i_73_ = ((-i_69_ + (1 + i_70_)) * (-i_67_
										+ i_68_ + 1));
								if (i_73_ >= 8) {
									int i_74_ = 240;
									int i_75_ = (Statics.anIntArrayArrayArray569[i_69_][i_66_][i_67_]);
									int i_76_ = (-i_74_ + (Statics.anIntArrayArrayArray569[i_70_][i_66_][i_67_]));
									Class52.method835(i_63_, 1, 128 * i_66_,
											i_66_ * 128, 128 * i_67_,
											128 * i_68_ + 128, i_76_, i_75_);
									for (int i_77_ = i_69_; i_70_ >= i_77_; i_77_++) {
										for (int i_78_ = i_67_; i_68_ >= i_78_; i_78_++)
											Class30.anIntArrayArrayArray732[i_77_][i_66_][i_78_] = (Class12_Sub12_Sub12
													.method519(
															(Class30.anIntArrayArrayArray732[i_77_][i_66_][i_78_]),
															i_60_ ^ 0xffffffff));
									}
								}
							}
							if (((Class30.anIntArrayArrayArray732[i_64_][i_66_][i_65_])
									& i_61_ ^ 0xffffffff) != -1) {
								int i_79_;
								for (i_79_ = i_66_; (i_79_ > 0 && (i_61_
										& (Class30.anIntArrayArrayArray732[i_64_][-1
												+ i_79_][i_65_]) ^ 0xffffffff) != -1); i_79_--) {
									/* empty */
								}
								int i_80_ = i_66_;
								int i_81_ = i_64_;
								for (/**/; (i_80_ < 104 && (i_61_
										& (Class30.anIntArrayArrayArray732[i_64_][i_80_
												- -1][i_65_]) ^ 0xffffffff) != -1); i_80_++) {
									/* empty */
								}
								int i_82_ = i_64_;
								while_2_: for (/**/; (i_81_ ^ 0xffffffff) < -1; i_81_--) {
									for (int i_83_ = i_79_; ((i_83_ ^ 0xffffffff) >= (i_80_ ^ 0xffffffff)); i_83_++) {
										if ((i_61_ & (Class30.anIntArrayArrayArray732[i_81_ - 1][i_83_][i_65_])) == 0)
											break while_2_;
									}
								}
								while_3_: for (/**/; ((i_82_ ^ 0xffffffff) > (i_63_ ^ 0xffffffff)); i_82_++) {
									for (int i_84_ = i_79_; i_84_ <= i_80_; i_84_++) {
										if ((i_61_
												& (Class30.anIntArrayArrayArray732[1 + i_82_][i_84_][i_65_]) ^ 0xffffffff) == -1)
											break while_3_;
									}
								}
								int i_85_ = ((1 + (i_80_ + -i_79_)) * (i_82_ + (1 - i_81_)));
								if (i_85_ >= 8) {
									int i_86_ = 240;
									int i_87_ = ((Statics.anIntArrayArrayArray569[i_82_][i_79_][i_65_]) - i_86_);
									int i_88_ = (Statics.anIntArrayArrayArray569[i_81_][i_79_][i_65_]);
									Class52.method835(i_63_, 2, i_79_ * 128,
											128 * i_80_ + 128, 128 * i_65_,
											i_65_ * 128, i_87_, i_88_);
									for (int i_89_ = i_81_; i_82_ >= i_89_; i_89_++) {
										for (int i_90_ = i_79_; ((i_80_ ^ 0xffffffff) <= (i_90_ ^ 0xffffffff)); i_90_++)
											Class30.anIntArrayArrayArray732[i_89_][i_90_][i_65_] = (Class12_Sub12_Sub12
													.method519(
															(Class30.anIntArrayArrayArray732[i_89_][i_90_][i_65_]),
															i_61_ ^ 0xffffffff));
									}
								}
							}
							if (((Class30.anIntArrayArrayArray732[i_64_][i_66_][i_65_]) & i_62_) != 0) {
								int i_91_ = i_66_;
								int i_92_;
								for (i_92_ = i_65_; ((i_92_ ^ 0xffffffff) < -1 && ((Class30.anIntArrayArrayArray732[i_64_][i_66_][i_92_ - 1]) & i_62_) != 0); i_92_--) {
									/* empty */
								}
								int i_93_ = i_66_;
								int i_94_;
								for (i_94_ = i_65_; (i_94_ ^ 0xffffffff) > -105; i_94_++) {
									if ((i_62_ & (Class30.anIntArrayArrayArray732[i_64_][i_66_][i_94_ + 1])) == 0)
										break;
								}
								while_4_: for (/**/; i_93_ > 0; i_93_--) {
									for (int i_95_ = i_92_; i_94_ >= i_95_; i_95_++) {
										if ((((Class30.anIntArrayArrayArray732[i_64_][i_93_ - 1][i_95_]) & i_62_) ^ 0xffffffff) == -1)
											break while_4_;
									}
								}
								while_5_: for (/**/; (i_91_ ^ 0xffffffff) > -105; i_91_++) {
									for (int i_96_ = i_92_; i_94_ >= i_96_; i_96_++) {
										if ((((Class30.anIntArrayArrayArray732[i_64_][i_91_
												- -1][i_96_]) & i_62_) ^ 0xffffffff) == -1)
											break while_5_;
									}
								}
								if ((i_91_ + -i_93_ - -1) * (1 + i_94_ - i_92_) >= 4) {
									int i_97_ = (Statics.anIntArrayArrayArray569[i_64_][i_93_][i_92_]);
									Class52.method835(i_63_, 4, 128 * i_93_,
											128 * i_91_ + 128, i_92_ * 128,
											128 + 128 * i_94_, i_97_, i_97_);
									for (int i_98_ = i_93_; i_98_ <= i_91_; i_98_++) {
										for (int i_99_ = i_92_; i_99_ <= i_94_; i_99_++)
											Class30.anIntArrayArrayArray732[i_64_][i_98_][i_99_] = (Class12_Sub12_Sub12
													.method519(
															(Class30.anIntArrayArrayArray732[i_64_][i_98_][i_99_]),
															i_62_ ^ 0xffffffff));
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("be.G("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public int method665(byte arg0) {
		try {
			anInt1875++;
			if (aBoolean1899)
				return 100;
			if (aByteArrayArray620 != null)
				return 99;
			if (arg0 != -35)
				method661(null, false, -67, -62, null);
			int i = Class12_Sub12_Sub11_Sub3.method465(arg0 + -10566, 255,
					anInt1898);
			if ((i ^ 0xffffffff) <= -101)
				i = 99;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "be.H(" + arg0 + ')');
		}
	}

	public int method666(byte arg0) {
		try {
			anInt1878++;
			int i = 0;
			if (arg0 < 109)
				aClass62_1879 = null;
			int i_100_ = 0;
			for (int i_101_ = 0; i_101_ < aByteArrayArray620.length; i_101_++) {
				if ((anIntArray599[i_101_] ^ 0xffffffff) < -1) {
					i += 100;
					i_100_ += method660(103, i_101_);
				}
			}
			if ((i ^ 0xffffffff) == -1)
				return 100;
			int i_102_ = i_100_ * 100 / i;
			return i_102_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "be.E(" + arg0 + ')');
		}
	}

	public void method667(byte[] arg0, int arg1, boolean arg2, boolean arg3,
			int arg4) {
		int i = 59 / ((arg4 - 62) / 43);
		anInt1885++;
		if (arg2) {
			if (aBoolean1899)
				throw new RuntimeException();
			if (aClass36_1893 != null)
				Game.method36(arg0, anInt1898, (byte) 90, aClass36_1893);
			this.method640(false, arg0);
			method659(20440);
		} else {
			arg0[arg0.length + -2] = (byte) (anIntArray589[arg1] >> 1630230600);
			arg0[arg0.length + -1] = (byte) anIntArray589[arg1];
			if (aClass36_1884 != null) {
				Game.method36(arg0, arg1, (byte) 105, aClass36_1884);
				aBooleanArray1888[arg1] = true;
			}
			if (arg3)
				aByteArrayArray620[arg1] = arg0;
		}
	}

	public static void method668(Class26 arg0, int arg1) {
		try {
			Class18.aClass26_438 = arg0;
			Class41.anInt973 = Class18.aClass26_438.method645(16, false);
			anInt1897++;
			int i = 55 % ((arg1 - -46) / 51);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "be.K("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	static {
		aClass59_1872 = Class55.method898("null", -10983);
		anInt1886 = 1;
		aClass59_1896 = Class55.method898("On", -10983);
		anInt1882 = 99;
		aClass59_1889 = aClass59_1896;
		aClass48_1887 = new Class48(4096);
		anInt1903 = 0;
		anInt1901 = 1;
		anInt1904 = 0;
	}
}
