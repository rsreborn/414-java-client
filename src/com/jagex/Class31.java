package com.jagex;/* com.jagex.Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class31 {
	public static boolean[] aBooleanArray752 = { true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, false, true, false, false };
	public static Class12_Sub12_Sub7_Sub1 aClass12_Sub12_Sub7_Sub1_753;
	public static RSString aClass59_754;
	public static int anInt755;
	public static int anInt756 = -1;
	public static int anInt757 = 0;
	public static Class12_Sub12_Sub7_Sub1 aClass12_Sub12_Sub7_Sub1_758;
	public static int anInt759;
	public static RSString aClass59_760;
	public static Class62 aClass62_761;
	public static RSString aClass59_762;
	public static int anInt763;
	public static RSString aClass59_764 = Class55.method898(
			"No response from server)3", -10983);
	public static Class62 aClass62_765;
	public static int anInt766;
	public static int anInt767;
	public static int anInt768;
	public static int anInt769;
	public static RSString aClass59_770;
	public static Class62 aClass62_771;

	public static void method697(int arg0) {
		try {
			if (Class27.aBoolean642) {
				Class27.aBoolean642 = false;
				Class11.method132(false);
				Class8.aBoolean182 = true;
				Class49.aBoolean1146 = true;
				Statics.aBoolean2025 = true;
				Class12_Sub2.aBoolean1641 = true;
			}
			anInt755++;
			Statics.method265(true);
			if (Class51.aBoolean1202 && (Class9.anInt212 ^ 0xffffffff) == -2)
				Class49.aBoolean1146 = true;
			if (arg0 != 17)
				aClass62_771 = null;
			if (Class35.anInt860 != -1) {
				boolean bool = Class63.method971(Class35.anInt860, -1);
				if (bool)
					Class49.aBoolean1146 = true;
			}
			if (Class12_Sub12_Sub16.anInt2560 == 2)
				Class49.aBoolean1146 = true;
			if ((Class12_Sub12_Sub12.anInt2417 ^ 0xffffffff) == -3)
				Class49.aBoolean1146 = true;
			if (Class49.aBoolean1146) {
				Class49.aBoolean1146 = false;
				Class12_Sub4.method159(true);
			}
			if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == 0) {
				Class12_Sub12_Sub11_Sub2.aClass12_Sub12_Sub3_2703.anInt2143 = (Class12_Sub12_Sub11_Sub2_Sub1.anInt2927 - (Class17.anInt421 + 77));
				if ((Class18.anInt432 ^ 0xffffffff) < -449
						&& Class18.anInt432 < 560
						&& (Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) < -333)
					Class56.method902(
							-357 + Class12_Sub12_Sub3.anInt2176,
							77,
							arg0 + -141,
							-1,
							463,
							(Class12_Sub12_Sub11_Sub2.aClass12_Sub12_Sub3_2703),
							Class18.anInt432 - 17, 0,
							Class12_Sub12_Sub11_Sub2_Sub1.anInt2927);
				int i = (Class12_Sub12_Sub11_Sub2_Sub1.anInt2927 + -77 - (Class12_Sub12_Sub11_Sub2.aClass12_Sub12_Sub3_2703.anInt2143));
				if (i < 0)
					i = 0;
				if (i > -77 + Class12_Sub12_Sub11_Sub2_Sub1.anInt2927)
					i = Class12_Sub12_Sub11_Sub2_Sub1.anInt2927 + -77;
				if ((Class17.anInt421 ^ 0xffffffff) != (i ^ 0xffffffff)) {
					Class17.anInt421 = i;
					Class8.aBoolean182 = true;
				}
			}
			if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == 0
					&& Class1.anInt85 == 3) {
				int i = 7 + RuntimeException_Sub1.anInt1473 * 14;
				Class12_Sub12_Sub11_Sub2.aClass12_Sub12_Sub3_2703.anInt2143 = Class29.anInt713;
				if ((Class18.anInt432 ^ 0xffffffff) < -449
						&& (Class18.anInt432 ^ 0xffffffff) > -561
						&& (Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff) < -333)
					Class56.method902(
							-357 + Class12_Sub12_Sub3.anInt2176,
							77,
							arg0 ^ 0x64,
							-1,
							463,
							(Class12_Sub12_Sub11_Sub2.aClass12_Sub12_Sub3_2703),
							-17 + Class18.anInt432, 0, i);
				int i_0_ = (Class12_Sub12_Sub11_Sub2.aClass12_Sub12_Sub3_2703.anInt2143);
				if (i_0_ < 0)
					i_0_ = 0;
				if (i_0_ > -77 + i)
					i_0_ = i - 77;
				if (i_0_ != Class29.anInt713) {
					Class8.aBoolean182 = true;
					Class29.anInt713 = i_0_;
				}
			}
			if (Class12_Sub12_Sub12.anInt2407 != -1) {
				boolean bool = Class63.method971(Class12_Sub12_Sub12.anInt2407,
						-1);
				if (bool)
					Class8.aBoolean182 = true;
			}
			if ((Class12_Sub12_Sub16.anInt2560 ^ 0xffffffff) == -4)
				Class8.aBoolean182 = true;
			if (Class12_Sub12_Sub12.anInt2417 == 3)
				Class8.aBoolean182 = true;
			if (Class32.aClass59_775 != null)
				Class8.aBoolean182 = true;
			if (Class51.aBoolean1202 && (Class9.anInt212 ^ 0xffffffff) == -3)
				Class8.aBoolean182 = true;
			if (Class8.aBoolean182) {
				Class8.aBoolean182 = false;
				Class43.method776(-17910);
			}
			Class12_Sub12.method269(arg0 ^ 0x31);
			if (Class58.anInt1343 != -1)
				Class12_Sub2.aBoolean1641 = true;
			if (Class12_Sub2.aBoolean1641) {
				if (Class58.anInt1343 != -1
						&& (Class58.anInt1343 ^ 0xffffffff) == (Class15.anInt400 ^ 0xffffffff)) {
					Class58.anInt1343 = -1;
					Class9.anInt207++;
					Game.outBuffer.writePacket(225);
					Game.outBuffer.writeByte(
                            Class15.anInt400);
				}
				Class12_Sub2.aBoolean1641 = false;
				Class8.aBoolean188 = true;
				Class23.method612(
						(Class64_Sub2.anInt1968 % 20 >= 10 ? Class58.anInt1343
								: -1), arg0 + -14676,
						Class62_Sub2.anIntArray1907, Class15.anInt400,
						Class35.anInt860 == -1);
			}
			if (Statics.aBoolean2025) {
				Class8.aBoolean188 = true;
				Statics.aBoolean2025 = false;
				Class12_Sub12_Sub2.method288(Class4.anInt138,
						Class12_Sub12_Sub3.anInt2154, anInt757, (byte) 90,
						(Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529));
			}
			Class12_Sub12_Sub11_Sub6.anInt2903 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "kc.C(" + arg0 + ')');
		}
	}

	public static boolean method698(Class12_Sub12_Sub3 arg0, int arg1) {
		try {
			anInt759++;
			int i = arg0.anInt2180;
			if (arg1 <= 81)
				return false;
			if (i >= 1 && (i ^ 0xffffffff) >= -201 || (i ^ 0xffffffff) <= -702
					&& (i ^ 0xffffffff) >= -901) {
				if (i < 801) {
					if ((i ^ 0xffffffff) > -702) {
						if (i >= 101)
							i -= 101;
						else
							i--;
					} else
						i -= 601;
				} else
					i -= 701;
				Class17.anInt413++;
				Class64.method977(
						0,
						0,
						48,
						0,
						(Statics
								.method251(
										(byte) -47,
										(new RSString[] {
												Class12_Sub12_Sub10.aClass59_2371,
												Class40.aClass59_946,
												(Class12_Sub12_Sub11_Sub6.aClass59Array2910[i]) }))),
						-46);
				Class64_Sub1.anInt1938++;
				Class64.method977(
						0,
						0,
						55,
						0,
						(Statics
								.method251(
										(byte) -91,
										(new RSString[] {
												Class12_Sub12_Sub4.aClass59_2190,
												Class40.aClass59_946,
												(Class12_Sub12_Sub11_Sub6.aClass59Array2910[i]) }))),
						-96);
				return true;
			}
			if (i >= 401 && (i ^ 0xffffffff) >= -501) {
				Statics.anInt2013++;
				Class64.method977(
						0,
						0,
						30,
						0,
						(Statics.method251((byte) -110, (new RSString[] {
								Class12_Sub12_Sub10.aClass59_2371,
								Class40.aClass59_946, arg0.aClass59_2130 }))),
						-127);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "kc.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static void method699(int arg0) {
		try {
			if (arg0 == -1) {
				aClass59_770 = null;
				aClass12_Sub12_Sub7_Sub1_753 = null;
				aClass62_761 = null;
				aClass59_762 = null;
				aClass59_764 = null;
				aClass62_771 = null;
				aClass62_765 = null;
				aClass59_754 = null;
				aClass59_760 = null;
				aClass12_Sub12_Sub7_Sub1_758 = null;
				aBooleanArray752 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "kc.D(" + arg0 + ')');
		}
	}

	public static void method700(int arg0) {
		Class62.method959(17696);
		anInt763++;
		if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -11) {
			int i = Class12_Sub1.anInt1625;
			int i_1_ = -202 + Class10.anInt226;
			if (arg0 <= 93)
				aClass62_761 = null;
			int i_2_ = Class42.anInt1000 + -171;
			if ((Class12_Sub12_Sub6.anInt2250 ^ 0xffffffff) == -1) {
				int i_3_ = 120;
				int i_4_ = 100;
				if (i == 1 && (i_1_ ^ 0xffffffff) <= (-75 + i_4_ ^ 0xffffffff)
						&& i_4_ + 75 >= i_1_
						&& (i_2_ ^ 0xffffffff) <= (i_3_ + -20 ^ 0xffffffff)
						&& 20 + i_3_ >= i_2_) {
					Class12_Sub12_Sub6.anInt2250 = 3;
					Class62_Sub2.anInt1917 = 0;
				}
				i_4_ = 260;
				if (i == 1 && (i_4_ + -75 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)
						&& (75 + i_4_ ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)
						&& i_2_ >= -20 + i_3_ && i_3_ - -20 >= i_2_) {
					Class12_Sub12_Sub6.anInt2250 = 2;
					Class62_Sub2.anInt1917 = 0;
					Class11.aClass59_289 = Class11.aClass59_277;
					Class11.aClass59_279 = Class33.aClass59_824;
					Class11.aClass59_312 = Class11.aClass59_262;
				}
			} else if (Class12_Sub12_Sub6.anInt2250 == 2) {
				int i_5_ = 100;
				int i_6_ = 60;
				int i_7_ = 150;
				i_6_ += 30;
				if ((i ^ 0xffffffff) == -2
						&& (i_2_ ^ 0xffffffff) <= (-15 + i_6_ ^ 0xffffffff)
						&& i_2_ < i_6_)
					Class62_Sub2.anInt1917 = 0;
				i_6_ += 15;
				if (i == 1 && (-15 + i_6_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)
						&& (i_2_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
					Class62_Sub2.anInt1917 = 1;
				i_6_ += 15;
				if (i == 1 && (i_1_ ^ 0xffffffff) <= (-75 + i_5_ ^ 0xffffffff)
						&& (75 + i_5_ ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)
						&& (i_2_ ^ 0xffffffff) <= (i_7_ + -20 ^ 0xffffffff)
						&& i_2_ <= i_7_ + 20) {
					Class11.aClass59_260 = Class11.aClass59_260.method917(-61)
							.toString(-14767);
					Class12_Sub12_Sub11_Sub3.method468(Class11.aClass59_268,
							Class11.aClass59_303, (Class64_Sub2.aClass59_1962),
							-4774);
					Class29.method686((byte) 67, 20);
				} else {
					i_5_ = 260;
					if ((i ^ 0xffffffff) == -2
							&& (i_1_ ^ 0xffffffff) <= (-75 + i_5_ ^ 0xffffffff)
							&& (i_1_ ^ 0xffffffff) >= (75 + i_5_ ^ 0xffffffff)
							&& (-20 + i_7_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)
							&& (i_7_ - -20 ^ 0xffffffff) <= (i_2_ ^ 0xffffffff)) {
						Class12_Sub12_Sub6.anInt2250 = 0;
						Class11.aClass59_260 = Class11.aClass59_273;
						Class11.aClass59_301 = Class11.aClass59_273;
					}
					while (Class48.method791(true)) {
						boolean bool = false;
						for (int i_8_ = 0; Class32.aClass59_779.length() > i_8_; i_8_++) {
							if (Class12_Sub12.anInt1847 == Class32.aClass59_779
									.method927(true, i_8_)) {
								bool = true;
								break;
							}
						}
						if ((Class62_Sub2.anInt1917 ^ 0xffffffff) != -1) {
							if (Class62_Sub2.anInt1917 == 1) {
								if (Class23.anInt502 == 85
										&& (Class11.aClass59_301.length() ^ 0xffffffff) < -1)
									Class11.aClass59_301 = (Class11.aClass59_301
											.method937(
													-1
															+ Class11.aClass59_301
																	.length(),
													true, 0));
								if ((Class23.anInt502 ^ 0xffffffff) == -85
										|| (Class23.anInt502 ^ 0xffffffff) == -81)
									Class62_Sub2.anInt1917 = 0;
								if (bool
										&& (Class11.aClass59_301.length() ^ 0xffffffff) > -21)
									Class11.aClass59_301 = (Class11.aClass59_301
											.method938(38,
													Class12_Sub12.anInt1847));
							}
						} else {
							if (Class23.anInt502 == 85
									&& (Class11.aClass59_260.length() ^ 0xffffffff) < -1)
								Class11.aClass59_260 = (Class11.aClass59_260
										.method937((-1 + Class11.aClass59_260
												.length()), true, 0));
							if (Class23.anInt502 == 84
									|| (Class23.anInt502 ^ 0xffffffff) == -81)
								Class62_Sub2.anInt1917 = 1;
							if (bool && Class11.aClass59_260.length() < 12)
								Class11.aClass59_260 = (Class11.aClass59_260
										.method938(38, Class12_Sub12.anInt1847));
						}
					}
				}
			} else if (Class12_Sub12_Sub6.anInt2250 == 3) {
				int i_9_ = 150;
				int i_10_ = 180;
				if (i == 1 && (i_1_ ^ 0xffffffff) <= (i_10_ + -75 ^ 0xffffffff)
						&& (i_10_ - -75 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)
						&& (-20 + i_9_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)
						&& (i_2_ ^ 0xffffffff) >= (i_9_ + 20 ^ 0xffffffff))
					Class12_Sub12_Sub6.anInt2250 = 0;
			}
		}
	}

	public static Class12_Sub12_Sub2 method701(byte arg0, int arg1) {
		try {
			anInt767++;
			Class12_Sub12_Sub2 class12_sub12_sub2 = ((Class12_Sub12_Sub2) Class13.aClass27_335
					.method673(111, (long) arg1));
			if (class12_sub12_sub2 != null)
				return class12_sub12_sub2;
			int i = -63 % ((-42 - arg0) / 32);
			byte[] is = Archive.aClass26_1877.method631(9, true, arg1);
			class12_sub12_sub2 = new Class12_Sub12_Sub2();
			class12_sub12_sub2.anInt2086 = arg1;
			if (is != null)
				class12_sub12_sub2
						.method284((byte) -110, new Buffer(is));
			class12_sub12_sub2.method290(0);
			Class13.aClass27_335.method678((byte) 123, class12_sub12_sub2,
					(long) arg1);
			return class12_sub12_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "kc.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		aClass59_762 = Class55.method898("scrollbar", -10983);
		aClass59_770 = Class55.method898("Loading title screen )2 ", -10983);
		aClass59_760 = aClass59_764;
		aClass59_754 = aClass59_770;
	}
}
