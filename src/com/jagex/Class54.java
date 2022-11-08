package com.jagex;/* com.jagex.Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54 {
	public static Class63 aClass63_1287 = new Class63();

	public static void method885(Class63 arg0) {
		byte i = arg0.aByte1396;
		int i_0_ = arg0.anInt1394;
		int i_1_ = arg0.anInt1405;
		int i_2_ = arg0.anInt1437;
		int[] is = Class47.anIntArray1088;
		int i_3_ = arg0.anInt1423;
		byte[] is_4_ = arg0.aByteArray1402;
		int i_5_ = arg0.anInt1411;
		int i_6_ = arg0.anInt1419;
		int i_7_ = i_6_;
		int i_8_ = arg0.anInt1434 + 1;
		while_10_: for (;;) {
			if (i_0_ > 0) {
				for (;;) {
					if (i_6_ == 0)
						break while_10_;
					if (i_0_ == 1)
						break;
					is_4_[i_5_] = i;
					i_0_--;
					i_5_++;
					i_6_--;
				}
				if (i_6_ == 0) {
					i_0_ = 1;
					break;
				}
				is_4_[i_5_] = i;
				i_5_++;
				i_6_--;
			}
			boolean bool = true;
			while (bool) {
				bool = false;
				if (i_1_ == i_8_) {
					i_0_ = 0;
					break while_10_;
				}
				i = (byte) i_2_;
				i_3_ = is[i_3_];
				int i_9_ = (byte) (i_3_ & 0xff);
				i_3_ >>= 8;
				i_1_++;
				if (i_9_ != i_2_) {
					i_2_ = i_9_;
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_10_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
					bool = true;
				} else if (i_1_ == i_8_) {
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_10_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
					bool = true;
				}
			}
			i_0_ = 2;
			i_3_ = is[i_3_];
			int i_10_ = (byte) (i_3_ & 0xff);
			i_3_ >>= 8;
			if (++i_1_ != i_8_) {
				if (i_10_ != i_2_)
					i_2_ = i_10_;
				else {
					i_0_ = 3;
					i_3_ = is[i_3_];
					i_10_ = (byte) (i_3_ & 0xff);
					i_3_ >>= 8;
					if (++i_1_ != i_8_) {
						if (i_10_ != i_2_)
							i_2_ = i_10_;
						else {
							i_3_ = is[i_3_];
							i_10_ = (byte) (i_3_ & 0xff);
							i_3_ >>= 8;
							i_1_++;
							i_0_ = (i_10_ & 0xff) + 4;
							i_3_ = is[i_3_];
							i_2_ = (byte) (i_3_ & 0xff);
							i_3_ >>= 8;
							i_1_++;
						}
					}
				}
			}
		}
		int i_11_ = arg0.anInt1392;
		arg0.anInt1392 += i_7_ - i_6_;
		arg0.aByte1396 = i;
		arg0.anInt1394 = i_0_;
		arg0.anInt1405 = i_1_;
		arg0.anInt1437 = i_2_;
		Class47.anIntArray1088 = is;
		arg0.anInt1423 = i_3_;
		arg0.aByteArray1402 = is_4_;
		arg0.anInt1411 = i_5_;
		arg0.anInt1419 = i_6_;
	}

	public static void method886(Class63 arg0) {
		boolean bool = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		boolean bool_17_ = false;
		boolean bool_18_ = false;
		boolean bool_19_ = false;
		boolean bool_20_ = false;
		boolean bool_21_ = false;
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		boolean bool_24_ = false;
		boolean bool_25_ = false;
		boolean bool_26_ = false;
		boolean bool_27_ = false;
		boolean bool_28_ = false;
		int i = 0;
		int[] is = null;
		int[] is_29_ = null;
		int[] is_30_ = null;
		arg0.anInt1422 = 1;
		if (Class47.anIntArray1088 == null)
			Class47.anIntArray1088 = new int[arg0.anInt1422 * 100000];
		boolean bool_31_ = true;
		while (bool_31_) {
			byte i_32_ = method888(arg0);
			if (i_32_ == 23)
				break;
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method888(arg0);
			i_32_ = method891(arg0);
			arg0.anInt1432 = 0;
			int i_33_ = method888(arg0);
			arg0.anInt1432 = arg0.anInt1432 << 8 | i_33_ & 0xff;
			i_33_ = method888(arg0);
			arg0.anInt1432 = arg0.anInt1432 << 8 | i_33_ & 0xff;
			i_33_ = method888(arg0);
			arg0.anInt1432 = arg0.anInt1432 << 8 | i_33_ & 0xff;
			for (int i_34_ = 0; i_34_ < 16; i_34_++) {
				i_32_ = method891(arg0);
				if (i_32_ == 1)
					arg0.aBooleanArray1431[i_34_] = true;
				else
					arg0.aBooleanArray1431[i_34_] = false;
			}
			for (int i_35_ = 0; i_35_ < 256; i_35_++)
				arg0.aBooleanArray1389[i_35_] = false;
			for (int i_36_ = 0; i_36_ < 16; i_36_++) {
				if (arg0.aBooleanArray1431[i_36_]) {
					for (int i_37_ = 0; i_37_ < 16; i_37_++) {
						i_32_ = method891(arg0);
						if (i_32_ == 1)
							arg0.aBooleanArray1389[i_36_ * 16 + i_37_] = true;
					}
				}
			}
			method892(arg0);
			int i_38_ = arg0.anInt1416 + 2;
			int i_39_ = method893(3, arg0);
			int i_40_ = method893(15, arg0);
			for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
				int i_42_ = 0;
				for (;;) {
					i_32_ = method891(arg0);
					if (i_32_ == 0)
						break;
					i_42_++;
				}
				arg0.aByteArray1391[i_41_] = (byte) i_42_;
			}
			byte[] is_43_ = new byte[6];
			for (byte i_44_ = 0; i_44_ < i_39_; i_44_++)
				is_43_[i_44_] = i_44_;
			for (int i_45_ = 0; i_45_ < i_40_; i_45_++) {
				byte i_46_ = arg0.aByteArray1391[i_45_];
				byte i_47_ = is_43_[i_46_];
				for (/**/; i_46_ > 0; i_46_--)
					is_43_[i_46_] = is_43_[i_46_ - 1];
				is_43_[0] = i_47_;
				arg0.aByteArray1401[i_45_] = i_47_;
			}
			for (int i_48_ = 0; i_48_ < i_39_; i_48_++) {
				int i_49_ = method893(5, arg0);
				for (int i_50_ = 0; i_50_ < i_38_; i_50_++) {
					for (;;) {
						i_32_ = method891(arg0);
						if (i_32_ == 0)
							break;
						i_32_ = method891(arg0);
						if (i_32_ == 0)
							i_49_++;
						else
							i_49_--;
					}
					arg0.aByteArrayArray1408[i_48_][i_50_] = (byte) i_49_;
				}
			}
			for (int i_51_ = 0; i_51_ < i_39_; i_51_++) {
				int i_52_ = 32;
				byte i_53_ = 0;
				for (int i_54_ = 0; i_54_ < i_38_; i_54_++) {
					if (arg0.aByteArrayArray1408[i_51_][i_54_] > i_53_)
						i_53_ = arg0.aByteArrayArray1408[i_51_][i_54_];
					if (arg0.aByteArrayArray1408[i_51_][i_54_] < i_52_)
						i_52_ = arg0.aByteArrayArray1408[i_51_][i_54_];
				}
				method889(arg0.anIntArrayArray1429[i_51_],
						arg0.anIntArrayArray1425[i_51_],
						arg0.anIntArrayArray1430[i_51_],
						arg0.aByteArrayArray1408[i_51_], i_52_, i_53_, i_38_);
				arg0.anIntArray1420[i_51_] = i_52_;
			}
			int i_55_ = arg0.anInt1416 + 1;
			int i_56_ = -1;
			int i_57_ = 0;
			for (int i_58_ = 0; i_58_ <= 255; i_58_++)
				arg0.anIntArray1407[i_58_] = 0;
			int i_59_ = 4095;
			for (int i_60_ = 15; i_60_ >= 0; i_60_--) {
				for (int i_61_ = 15; i_61_ >= 0; i_61_--) {
					arg0.aByteArray1414[i_59_] = (byte) (i_60_ * 16 + i_61_);
					i_59_--;
				}
				arg0.anIntArray1410[i_60_] = i_59_ + 1;
			}
			int i_62_ = 0;
			if (i_57_ == 0) {
				i_56_++;
				i_57_ = 50;
				byte i_63_ = arg0.aByteArray1401[i_56_];
				i = arg0.anIntArray1420[i_63_];
				is = arg0.anIntArrayArray1429[i_63_];
				is_30_ = arg0.anIntArrayArray1430[i_63_];
				is_29_ = arg0.anIntArrayArray1425[i_63_];
			}
			i_57_--;
			int i_64_ = i;
			int i_65_;
			int i_66_;
			for (i_66_ = method893(i_64_, arg0); i_66_ > is[i_64_]; i_66_ = i_66_ << 1
					| i_65_) {
				i_64_++;
				i_65_ = method891(arg0);
			}
			int i_67_ = is_30_[i_66_ - is_29_[i_64_]];
			while (i_67_ != i_55_) {
				if (i_67_ == 0 || i_67_ == 1) {
					int i_68_ = -1;
					int i_69_ = 1;
					do {
						if (i_67_ == 0)
							i_68_ += i_69_;
						else if (i_67_ == 1)
							i_68_ += 2 * i_69_;
						i_69_ *= 2;
						if (i_57_ == 0) {
							i_56_++;
							i_57_ = 50;
							byte i_70_ = arg0.aByteArray1401[i_56_];
							i = arg0.anIntArray1420[i_70_];
							is = arg0.anIntArrayArray1429[i_70_];
							is_30_ = arg0.anIntArrayArray1430[i_70_];
							is_29_ = arg0.anIntArrayArray1425[i_70_];
						}
						i_57_--;
						i_64_ = i;
						for (i_66_ = method893(i_64_, arg0); i_66_ > is[i_64_]; i_66_ = i_66_ << 1
								| i_65_) {
							i_64_++;
							i_65_ = method891(arg0);
						}
						i_67_ = is_30_[i_66_ - is_29_[i_64_]];
					} while (i_67_ == 0 || i_67_ == 1);
					i_68_++;
					i_33_ = (arg0.aByteArray1417[(arg0.aByteArray1414[arg0.anIntArray1410[0]] & 0xff)]);
					arg0.anIntArray1407[i_33_ & 0xff] += i_68_;
					for (/**/; i_68_ > 0; i_68_--) {
						Class47.anIntArray1088[i_62_] = i_33_ & 0xff;
						i_62_++;
					}
				} else {
					int i_71_ = i_67_ - 1;
					if (i_71_ < 16) {
						int i_72_ = arg0.anIntArray1410[0];
						i_32_ = arg0.aByteArray1414[i_72_ + i_71_];
						for (/**/; i_71_ > 3; i_71_ -= 4) {
							int i_73_ = i_72_ + i_71_;
							arg0.aByteArray1414[i_73_] = arg0.aByteArray1414[i_73_ - 1];
							arg0.aByteArray1414[i_73_ - 1] = arg0.aByteArray1414[i_73_ - 2];
							arg0.aByteArray1414[i_73_ - 2] = arg0.aByteArray1414[i_73_ - 3];
							arg0.aByteArray1414[i_73_ - 3] = arg0.aByteArray1414[i_73_ - 4];
						}
						for (/**/; i_71_ > 0; i_71_--)
							arg0.aByteArray1414[i_72_ + i_71_] = arg0.aByteArray1414[i_72_
									+ i_71_ - 1];
						arg0.aByteArray1414[i_72_] = i_32_;
					} else {
						int i_74_ = i_71_ / 16;
						int i_75_ = i_71_ % 16;
						int i_76_ = arg0.anIntArray1410[i_74_] + i_75_;
						i_32_ = arg0.aByteArray1414[i_76_];
						for (/**/; i_76_ > arg0.anIntArray1410[i_74_]; i_76_--)
							arg0.aByteArray1414[i_76_] = arg0.aByteArray1414[i_76_ - 1];
						arg0.anIntArray1410[i_74_]++;
						for (/**/; i_74_ > 0; i_74_--) {
							arg0.anIntArray1410[i_74_]--;
							arg0.aByteArray1414[arg0.anIntArray1410[i_74_]] = (arg0.aByteArray1414[arg0.anIntArray1410[i_74_ - 1] + 16 - 1]);
						}
						arg0.anIntArray1410[0]--;
						arg0.aByteArray1414[arg0.anIntArray1410[0]] = i_32_;
						if (arg0.anIntArray1410[0] == 0) {
							int i_77_ = 4095;
							for (int i_78_ = 15; i_78_ >= 0; i_78_--) {
								for (int i_79_ = 15; i_79_ >= 0; i_79_--) {
									arg0.aByteArray1414[i_77_] = (arg0.aByteArray1414[(arg0.anIntArray1410[i_78_] + i_79_)]);
									i_77_--;
								}
								arg0.anIntArray1410[i_78_] = i_77_ + 1;
							}
						}
					}
					arg0.anIntArray1407[(arg0.aByteArray1417[i_32_ & 0xff] & 0xff)]++;
					Class47.anIntArray1088[i_62_] = arg0.aByteArray1417[i_32_ & 0xff] & 0xff;
					i_62_++;
					if (i_57_ == 0) {
						i_56_++;
						i_57_ = 50;
						byte i_80_ = arg0.aByteArray1401[i_56_];
						i = arg0.anIntArray1420[i_80_];
						is = arg0.anIntArrayArray1429[i_80_];
						is_30_ = arg0.anIntArrayArray1430[i_80_];
						is_29_ = arg0.anIntArrayArray1425[i_80_];
					}
					i_57_--;
					i_64_ = i;
					for (i_66_ = method893(i_64_, arg0); i_66_ > is[i_64_]; i_66_ = i_66_ << 1
							| i_65_) {
						i_64_++;
						i_65_ = method891(arg0);
					}
					i_67_ = is_30_[i_66_ - is_29_[i_64_]];
				}
			}
			arg0.anInt1394 = 0;
			arg0.aByte1396 = (byte) 0;
			arg0.anIntArray1433[0] = 0;
			for (int i_81_ = 1; i_81_ <= 256; i_81_++)
				arg0.anIntArray1433[i_81_] = arg0.anIntArray1407[i_81_ - 1];
			for (int i_82_ = 1; i_82_ <= 256; i_82_++)
				arg0.anIntArray1433[i_82_] += arg0.anIntArray1433[i_82_ - 1];
			for (int i_83_ = 0; i_83_ < i_62_; i_83_++) {
				i_33_ = (byte) (Class47.anIntArray1088[i_83_] & 0xff);
				Class47.anIntArray1088[arg0.anIntArray1433[i_33_ & 0xff]] |= i_83_ << 8;
				arg0.anIntArray1433[i_33_ & 0xff]++;
			}
			arg0.anInt1423 = Class47.anIntArray1088[arg0.anInt1432] >> 8;
			arg0.anInt1405 = 0;
			arg0.anInt1423 = Class47.anIntArray1088[arg0.anInt1423];
			arg0.anInt1437 = (byte) (arg0.anInt1423 & 0xff);
			arg0.anInt1423 >>= 8;
			arg0.anInt1405++;
			arg0.anInt1434 = i_62_;
			method885(arg0);
			if (arg0.anInt1405 == arg0.anInt1434 + 1 && arg0.anInt1394 == 0)
				bool_31_ = true;
			else
				bool_31_ = false;
		}
	}

	public static void method887() {
		aClass63_1287 = null;
	}

	public static byte method888(Class63 arg0) {
		return (byte) method893(8, arg0);
	}

	public static void method889(int[] arg0, int[] arg1, int[] arg2,
			byte[] arg3, int arg4, int arg5, int arg6) {
		int i = 0;
		for (int i_84_ = arg4; i_84_ <= arg5; i_84_++) {
			for (int i_85_ = 0; i_85_ < arg6; i_85_++) {
				if (arg3[i_85_] == i_84_) {
					arg2[i] = i_85_;
					i++;
				}
			}
		}
		for (int i_86_ = 0; i_86_ < 23; i_86_++)
			arg1[i_86_] = 0;
		for (int i_87_ = 0; i_87_ < arg6; i_87_++)
			arg1[arg3[i_87_] + 1]++;
		for (int i_88_ = 1; i_88_ < 23; i_88_++)
			arg1[i_88_] += arg1[i_88_ - 1];
		for (int i_89_ = 0; i_89_ < 23; i_89_++)
			arg0[i_89_] = 0;
		int i_90_ = 0;
		for (int i_91_ = arg4; i_91_ <= arg5; i_91_++) {
			i_90_ += arg1[i_91_ + 1] - arg1[i_91_];
			arg0[i_91_] = i_90_ - 1;
			i_90_ <<= 1;
		}
		for (int i_92_ = arg4 + 1; i_92_ <= arg5; i_92_++)
			arg1[i_92_] = (arg0[i_92_ - 1] + 1 << 1) - arg1[i_92_];
	}

	public static int method890(byte[] arg0, int arg1, byte[] arg2, int arg3,
			int arg4) {
		synchronized (aClass63_1287) {
			aClass63_1287.aByteArray1415 = arg2;
			aClass63_1287.anInt1393 = arg4;
			aClass63_1287.aByteArray1402 = arg0;
			aClass63_1287.anInt1411 = 0;
			aClass63_1287.anInt1419 = arg1;
			aClass63_1287.anInt1428 = 0;
			aClass63_1287.anInt1426 = 0;
			aClass63_1287.anInt1409 = 0;
			aClass63_1287.anInt1392 = 0;
			method886(aClass63_1287);
			arg1 -= aClass63_1287.anInt1419;
			aClass63_1287.aByteArray1415 = null;
			aClass63_1287.aByteArray1402 = null;
			return arg1;
		}
	}

	public static byte method891(Class63 arg0) {
		return (byte) method893(1, arg0);
	}

	public static void method892(Class63 arg0) {
		arg0.anInt1416 = 0;
		for (int i = 0; i < 256; i++) {
			if (arg0.aBooleanArray1389[i]) {
				arg0.aByteArray1417[arg0.anInt1416] = (byte) i;
				arg0.anInt1416++;
			}
		}
	}

	public static int method893(int arg0, Class63 arg1) {
		int i;
		for (;;) {
			if (arg1.anInt1428 >= arg0) {
				int i_93_ = (arg1.anInt1426 >> arg1.anInt1428 - arg0 & (1 << arg0) - 1);
				arg1.anInt1428 -= arg0;
				i = i_93_;
				break;
			}
			arg1.anInt1426 = (arg1.anInt1426 << 8 | arg1.aByteArray1415[arg1.anInt1393] & 0xff);
			arg1.anInt1428 += 8;
			arg1.anInt1393++;
			arg1.anInt1409++;
		}
		return i;
	}
}
