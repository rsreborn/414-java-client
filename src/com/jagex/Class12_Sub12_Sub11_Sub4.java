package com.jagex;/* com.jagex.Class12_Sub12_Sub11_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class12_Sub12_Sub11_Sub4 extends Class12_Sub12_Sub11 {
	public int[] anIntArray2778;
	public int[] anIntArray2779;
	public int anInt2780;
	public int anInt2781 = 0;
	public int anInt2782;
	public int[] anIntArray2783;
	public int[] anIntArray2784;
	public int[] anIntArray2785;
	public int[] anIntArray2786;
	public int[] anIntArray2787;
	public int[] anIntArray2788;
	public int[] anIntArray2789;
	public Class35[] aClass35Array2790;
	public int[] anIntArray2791;
	public int[] anIntArray2792;
	public int[] anIntArray2793;
	public int anInt2794 = 0;
	public int[] anIntArray2795;
	public int[] anIntArray2796;
	public int[] anIntArray2797;
	public int anInt2798;
	public boolean aBoolean2799;
	public int[][] anIntArrayArray2800;
	public int anInt2801;
	public int[] anIntArray2802;
	public int anInt2803 = 0;
	public Class35[] aClass35Array2804;
	public int[] anIntArray2805;
	public int[] anIntArray2806;
	public int anInt2807;
	public int anInt2808;
	public int[][] anIntArrayArray2809;
	public static Class12_Sub12_Sub11_Sub4 aClass12_Sub12_Sub11_Sub4_2810 = new Class12_Sub12_Sub11_Sub4();
	public int anInt2811;
	public static Class12_Sub12_Sub11_Sub4 aClass12_Sub12_Sub11_Sub4_2812;
	public static int[] anIntArray2813 = new int[1];
	public int anInt2814;
	public static int[] anIntArray2815;
	public static int[] anIntArray2816;
	public static boolean[] aBooleanArray2817;
	public static int anInt2818;
	public static int anInt2819;
	public static int[] anIntArray2820;
	public static int[] anIntArray2821;
	public static int[] anIntArray2822;
	public static int[] anIntArray2823;
	public static int[] anIntArray2824;
	public static boolean[] aBooleanArray2825;
	public static int[] anIntArray2826;
	public static int[] anIntArray2827;
	public static int[] anIntArray2828;
	public static int[] anIntArray2829;
	public static int[][] anIntArrayArray2830;
	public static int[] anIntArray2831;
	public static boolean aBoolean2832;
	public static int[] anIntArray2833;
	public static int[] anIntArray2834;
	public static int anInt2835;
	public static int anInt2836;
	public static int[] anIntArray2837;
	public static int[] anIntArray2838;
	public static int anInt2839;
	public static int[] anIntArray2840;
	public static int[] anIntArray2841;
	public static int[] anIntArray2842;
	public static int[] anIntArray2843;
	public static int anInt2844;
	public static int[] anIntArray2845;
	public static int[][] anIntArrayArray2846;

	public void method471() {
		if (anIntArray2793 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_0_ = 0; i_0_ < anInt2798; i_0_++) {
				int i_1_ = anIntArray2793[i_0_];
				is[i_1_]++;
				if (i_1_ > i)
					i = i_1_;
			}
			anIntArrayArray2809 = new int[i + 1][];
			for (int i_2_ = 0; i_2_ <= i; i_2_++) {
				anIntArrayArray2809[i_2_] = new int[is[i_2_]];
				is[i_2_] = 0;
			}
			for (int i_3_ = 0; i_3_ < anInt2798; i_3_++) {
				int i_4_ = anIntArray2793[i_3_];
				anIntArrayArray2809[i_4_][is[i_4_]++] = i_3_;
			}
			anIntArray2793 = null;
		}
		if (anIntArray2786 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_5_ = 0; i_5_ < anInt2794; i_5_++) {
				int i_6_ = anIntArray2786[i_5_];
				is[i_6_]++;
				if (i_6_ > i)
					i = i_6_;
			}
			anIntArrayArray2800 = new int[i + 1][];
			for (int i_7_ = 0; i_7_ <= i; i_7_++) {
				anIntArrayArray2800[i_7_] = new int[is[i_7_]];
				is[i_7_] = 0;
			}
			for (int i_8_ = 0; i_8_ < anInt2794; i_8_++) {
				int i_9_ = anIntArray2786[i_8_];
				anIntArrayArray2800[i_9_][is[i_9_]++] = i_8_;
			}
			anIntArray2786 = null;
		}
	}

	public void method472() {
		aClass35Array2804 = null;
		anInt2782 = 0;
		for (int i = 0; i < anInt2798; i++) {
			int i_10_ = anIntArray2791[i];
			anIntArray2791[i] = anIntArray2787[i];
			anIntArray2787[i] = -i_10_;
		}
	}

	public void method473() {
		aClass35Array2804 = null;
		anInt2782 = 0;
		for (int i = 0; i < anInt2798; i++) {
			int i_11_ = anIntArray2787[i];
			anIntArray2787[i] = anIntArray2791[i];
			anIntArray2791[i] = -i_11_;
		}
	}

	public void method474(boolean arg0, boolean arg1, int arg2) {
		if (anInt2801 < 1500) {
			for (int i = 0; i < anInt2801; i++)
				anIntArray2828[i] = 0;
			for (int i = 0; i < anInt2794; i++) {
				if (anIntArray2805 == null || anIntArray2805[i] != -1) {
					int i_12_ = anIntArray2779[i];
					int i_13_ = anIntArray2789[i];
					int i_14_ = anIntArray2788[i];
					int i_15_ = anIntArray2838[i_12_];
					int i_16_ = anIntArray2838[i_13_];
					int i_17_ = anIntArray2838[i_14_];
					if (arg0
							&& (i_15_ == -5000 || i_16_ == -5000 || i_17_ == -5000)) {
						int i_18_ = anIntArray2826[i_12_];
						int i_19_ = anIntArray2826[i_13_];
						int i_20_ = anIntArray2826[i_14_];
						int i_21_ = anIntArray2834[i_12_];
						int i_22_ = anIntArray2834[i_13_];
						int i_23_ = anIntArray2834[i_14_];
						int i_24_ = anIntArray2816[i_12_];
						int i_25_ = anIntArray2816[i_13_];
						int i_26_ = anIntArray2816[i_14_];
						i_18_ -= i_19_;
						i_20_ -= i_19_;
						i_21_ -= i_22_;
						i_23_ -= i_22_;
						i_24_ -= i_25_;
						i_26_ -= i_25_;
						int i_27_ = i_21_ * i_26_ - i_24_ * i_23_;
						int i_28_ = i_24_ * i_20_ - i_18_ * i_26_;
						int i_29_ = i_18_ * i_23_ - i_21_ * i_20_;
						if (i_19_ * i_27_ + i_22_ * i_28_ + i_25_ * i_29_ > 0) {
							aBooleanArray2817[i] = true;
							int i_30_ = ((anIntArray2842[i_12_]
									+ anIntArray2842[i_13_] + anIntArray2842[i_14_]) / 3 + anInt2780);
							anIntArrayArray2830[i_30_][anIntArray2828[i_30_]++] = i;
						}
					} else {
						if (arg1
								&& method488(anInt2839, anInt2835,
										anIntArray2837[i_12_],
										anIntArray2837[i_13_],
										anIntArray2837[i_14_], i_15_, i_16_,
										i_17_)) {
							anIntArray2823[anInt2818++] = arg2;
							arg1 = false;
						}
						if (((i_15_ - i_16_)
								* (anIntArray2837[i_14_] - anIntArray2837[i_13_]) - ((anIntArray2837[i_12_] - anIntArray2837[i_13_]) * (i_17_ - i_16_))) > 0) {
							aBooleanArray2817[i] = false;
							if (i_15_ < 0
									|| i_16_ < 0
									|| i_17_ < 0
									|| i_15_ > Class12_Sub12_Sub7_Sub3.anInt2592
									|| i_16_ > Class12_Sub12_Sub7_Sub3.anInt2592
									|| i_17_ > Class12_Sub12_Sub7_Sub3.anInt2592)
								aBooleanArray2825[i] = true;
							else
								aBooleanArray2825[i] = false;
							int i_31_ = ((anIntArray2842[i_12_]
									+ anIntArray2842[i_13_] + anIntArray2842[i_14_]) / 3 + anInt2780);
							anIntArrayArray2830[i_31_][anIntArray2828[i_31_]++] = i;
						}
					}
				}
			}
			if (anIntArray2778 == null) {
				for (int i = anInt2801 - 1; i >= 0; i--) {
					int i_32_ = anIntArray2828[i];
					if (i_32_ > 0) {
						int[] is = anIntArrayArray2830[i];
						for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
							method491(is[i_33_]);
					}
				}
			} else {
				for (int i = 0; i < 12; i++) {
					anIntArray2840[i] = 0;
					anIntArray2822[i] = 0;
				}
				for (int i = anInt2801 - 1; i >= 0; i--) {
					int i_34_ = anIntArray2828[i];
					if (i_34_ > 0) {
						int[] is = anIntArrayArray2830[i];
						for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
							int i_36_ = is[i_35_];
							int i_37_ = anIntArray2778[i_36_];
							int i_38_ = anIntArray2840[i_37_]++;
							anIntArrayArray2846[i_37_][i_38_] = i_36_;
							if (i_37_ < 10)
								anIntArray2822[i_37_] += i;
							else if (i_37_ == 10)
								anIntArray2841[i_38_] = i;
							else
								anIntArray2845[i_38_] = i;
						}
					}
				}
				int i = 0;
				if (anIntArray2840[1] > 0 || anIntArray2840[2] > 0)
					i = ((anIntArray2822[1] + anIntArray2822[2]) / (anIntArray2840[1] + anIntArray2840[2]));
				int i_39_ = 0;
				if (anIntArray2840[3] > 0 || anIntArray2840[4] > 0)
					i_39_ = ((anIntArray2822[3] + anIntArray2822[4]) / (anIntArray2840[3] + anIntArray2840[4]));
				int i_40_ = 0;
				if (anIntArray2840[6] > 0 || anIntArray2840[8] > 0)
					i_40_ = ((anIntArray2822[6] + anIntArray2822[8]) / (anIntArray2840[6] + anIntArray2840[8]));
				int i_41_ = 0;
				int i_42_ = anIntArray2840[10];
				int[] is = anIntArrayArray2846[10];
				int[] is_43_ = anIntArray2841;
				if (i_41_ == i_42_) {
					i_41_ = 0;
					i_42_ = anIntArray2840[11];
					is = anIntArrayArray2846[11];
					is_43_ = anIntArray2845;
				}
				int i_44_;
				if (i_41_ < i_42_)
					i_44_ = is_43_[i_41_];
				else
					i_44_ = -1000;
				for (int i_45_ = 0; i_45_ < 10; i_45_++) {
					while (i_45_ == 0) {
						if (i_44_ <= i)
							break;
						method491(is[i_41_++]);
						if (i_41_ == i_42_ && is != anIntArrayArray2846[11]) {
							i_41_ = 0;
							i_42_ = anIntArray2840[11];
							is = anIntArrayArray2846[11];
							is_43_ = anIntArray2845;
						}
						if (i_41_ < i_42_)
							i_44_ = is_43_[i_41_];
						else
							i_44_ = -1000;
					}
					while (i_45_ == 3) {
						if (i_44_ <= i_39_)
							break;
						method491(is[i_41_++]);
						if (i_41_ == i_42_ && is != anIntArrayArray2846[11]) {
							i_41_ = 0;
							i_42_ = anIntArray2840[11];
							is = anIntArrayArray2846[11];
							is_43_ = anIntArray2845;
						}
						if (i_41_ < i_42_)
							i_44_ = is_43_[i_41_];
						else
							i_44_ = -1000;
					}
					while (i_45_ == 5 && i_44_ > i_40_) {
						method491(is[i_41_++]);
						if (i_41_ == i_42_ && is != anIntArrayArray2846[11]) {
							i_41_ = 0;
							i_42_ = anIntArray2840[11];
							is = anIntArrayArray2846[11];
							is_43_ = anIntArray2845;
						}
						if (i_41_ < i_42_)
							i_44_ = is_43_[i_41_];
						else
							i_44_ = -1000;
					}
					int i_46_ = anIntArray2840[i_45_];
					int[] is_47_ = anIntArrayArray2846[i_45_];
					for (int i_48_ = 0; i_48_ < i_46_; i_48_++)
						method491(is_47_[i_48_]);
				}
				while (i_44_ != -1000) {
					method491(is[i_41_++]);
					if (i_41_ == i_42_ && is != anIntArrayArray2846[11]) {
						i_41_ = 0;
						is = anIntArrayArray2846[11];
						i_42_ = anIntArray2840[11];
						is_43_ = anIntArray2845;
					}
					if (i_41_ < i_42_)
						i_44_ = is_43_[i_41_];
					else
						i_44_ = -1000;
				}
			}
		}
	}

	public Class12_Sub12_Sub11_Sub4 method475(boolean arg0) {
		if (!arg0 && anIntArray2843.length < anInt2794)
			anIntArray2843 = new int[anInt2794 + 100];
		return method480(arg0, aClass12_Sub12_Sub11_Sub4_2812, anIntArray2843);
	}

	public void method476(int arg0, int arg1, int arg2) {
		anInt2782 = 0;
		for (int i = 0; i < anInt2798; i++) {
			anIntArray2787[i] += arg0;
			anIntArray2802[i] += arg1;
			anIntArray2791[i] += arg2;
		}
	}

	public void method477(int arg0, int arg1, int arg2) {
		aClass35Array2804 = null;
		anInt2782 = 0;
		for (int i = 0; i < anInt2798; i++) {
			anIntArray2787[i] = anIntArray2787[i] * arg0 / 128;
			anIntArray2802[i] = anIntArray2802[i] * arg1 / 128;
			anIntArray2791[i] = anIntArray2791[i] * arg2 / 128;
		}
	}

	public void method478() {
		if (anInt2782 != 2) {
			anInt2782 = 2;
			anInt2811 = 0;
			for (int i = 0; i < anInt2798; i++) {
				int i_49_ = anIntArray2787[i];
				int i_50_ = anIntArray2802[i];
				int i_51_ = anIntArray2791[i];
				int i_52_ = i_49_ * i_49_ + i_51_ * i_51_ + i_50_ * i_50_;
				if (i_52_ > anInt2811)
					anInt2811 = i_52_;
			}
			anInt2811 = (int) (Math.sqrt((double) anInt2811) + 0.99);
			anInt2780 = anInt2811;
			anInt2801 = anInt2811 + anInt2811;
		}
	}

	public static int method479(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0)
				arg1 = 0;
			else if (arg1 > 127)
				arg1 = 127;
			arg1 = anIntArray2827[arg1];
			return arg1;
		}
		arg1 = arg1 * (arg0 & 0x7f) >> 7;
		if (arg1 < 2)
			arg1 = 2;
		else if (arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public Class12_Sub12_Sub11_Sub4 method480(boolean arg0,
			Class12_Sub12_Sub11_Sub4 arg1, int[] arg2) {
		arg1.anInt2798 = anInt2798;
		arg1.anInt2794 = anInt2794;
		arg1.anInt2781 = anInt2781;
		if (arg1.anIntArray2787 == null
				|| arg1.anIntArray2787.length < anInt2798) {
			arg1.anIntArray2787 = new int[anInt2798 + 100];
			arg1.anIntArray2802 = new int[anInt2798 + 100];
			arg1.anIntArray2791 = new int[anInt2798 + 100];
		}
		for (int i = 0; i < anInt2798; i++) {
			arg1.anIntArray2787[i] = anIntArray2787[i];
			arg1.anIntArray2802[i] = anIntArray2802[i];
			arg1.anIntArray2791[i] = anIntArray2791[i];
		}
		if (arg0)
			arg1.anIntArray2795 = anIntArray2795;
		else {
			arg1.anIntArray2795 = arg2;
			if (anIntArray2795 == null) {
				for (int i = 0; i < anInt2794; i++)
					arg1.anIntArray2795[i] = 0;
			} else {
				for (int i = 0; i < anInt2794; i++)
					arg1.anIntArray2795[i] = anIntArray2795[i];
			}
		}
		arg1.anIntArray2805 = anIntArray2805;
		arg1.anIntArray2792 = anIntArray2792;
		arg1.anIntArray2778 = anIntArray2778;
		arg1.anInt2803 = anInt2803;
		arg1.anIntArrayArray2800 = anIntArrayArray2800;
		arg1.anIntArrayArray2809 = anIntArrayArray2809;
		arg1.anIntArray2779 = anIntArray2779;
		arg1.anIntArray2789 = anIntArray2789;
		arg1.anIntArray2788 = anIntArray2788;
		arg1.anIntArray2783 = anIntArray2783;
		arg1.anIntArray2785 = anIntArray2785;
		arg1.anIntArray2796 = anIntArray2796;
		arg1.anIntArray2806 = anIntArray2806;
		arg1.anIntArray2797 = anIntArray2797;
		arg1.anIntArray2784 = anIntArray2784;
		arg1.anInt2782 = 0;
		return arg1;
	}

	public void method481() {
		aClass35Array2804 = null;
		anInt2782 = 0;
		for (int i = 0; i < anInt2798; i++)
			anIntArray2791[i] = -anIntArray2791[i];
		for (int i = 0; i < anInt2794; i++) {
			int i_53_ = anIntArray2779[i];
			anIntArray2779[i] = anIntArray2788[i];
			anIntArray2788[i] = i_53_;
		}
	}

	public void method482() {
		aClass35Array2804 = null;
		anInt2782 = 0;
		for (int i = 0; i < anInt2798; i++) {
			anIntArray2787[i] = -anIntArray2787[i];
			anIntArray2791[i] = -anIntArray2791[i];
		}
	}

	public void method483(int arg0) {
		int i = Class12_Sub12_Sub7_Sub3.anInt2598;
		int i_54_ = Class12_Sub12_Sub7_Sub3.anInt2593;
		int i_55_ = 0;
		int i_56_ = anIntArray2779[arg0];
		int i_57_ = anIntArray2789[arg0];
		int i_58_ = anIntArray2788[arg0];
		int i_59_ = anIntArray2816[i_56_];
		int i_60_ = anIntArray2816[i_57_];
		int i_61_ = anIntArray2816[i_58_];
		if (anIntArray2795 == null)
			Class12_Sub12_Sub7_Sub3.anInt2590 = 0;
		else
			Class12_Sub12_Sub7_Sub3.anInt2590 = anIntArray2795[arg0];
		if (i_59_ >= 50) {
			anIntArray2821[i_55_] = anIntArray2838[i_56_];
			anIntArray2820[i_55_] = anIntArray2837[i_56_];
			anIntArray2815[i_55_++] = anIntArray2783[arg0];
		} else {
			int i_62_ = anIntArray2826[i_56_];
			int i_63_ = anIntArray2834[i_56_];
			int i_64_ = anIntArray2783[arg0];
			if (i_61_ >= 50) {
				int i_65_ = (50 - i_59_) * anIntArray2824[i_61_ - i_59_];
				anIntArray2821[i_55_] = i
						+ (i_62_
								+ ((anIntArray2826[i_58_] - i_62_) * i_65_ >> 16) << 9)
						/ 50;
				anIntArray2820[i_55_] = i_54_
						+ (i_63_
								+ ((anIntArray2834[i_58_] - i_63_) * i_65_ >> 16) << 9)
						/ 50;
				anIntArray2815[i_55_++] = i_64_
						+ ((anIntArray2796[arg0] - i_64_) * i_65_ >> 16);
			}
			if (i_60_ >= 50) {
				int i_66_ = (50 - i_59_) * anIntArray2824[i_60_ - i_59_];
				anIntArray2821[i_55_] = i
						+ (i_62_
								+ ((anIntArray2826[i_57_] - i_62_) * i_66_ >> 16) << 9)
						/ 50;
				anIntArray2820[i_55_] = i_54_
						+ (i_63_
								+ ((anIntArray2834[i_57_] - i_63_) * i_66_ >> 16) << 9)
						/ 50;
				anIntArray2815[i_55_++] = i_64_
						+ ((anIntArray2785[arg0] - i_64_) * i_66_ >> 16);
			}
		}
		if (i_60_ >= 50) {
			anIntArray2821[i_55_] = anIntArray2838[i_57_];
			anIntArray2820[i_55_] = anIntArray2837[i_57_];
			anIntArray2815[i_55_++] = anIntArray2785[arg0];
		} else {
			int i_67_ = anIntArray2826[i_57_];
			int i_68_ = anIntArray2834[i_57_];
			int i_69_ = anIntArray2785[arg0];
			if (i_59_ >= 50) {
				int i_70_ = (50 - i_60_) * anIntArray2824[i_59_ - i_60_];
				anIntArray2821[i_55_] = i
						+ (i_67_
								+ ((anIntArray2826[i_56_] - i_67_) * i_70_ >> 16) << 9)
						/ 50;
				anIntArray2820[i_55_] = i_54_
						+ (i_68_
								+ ((anIntArray2834[i_56_] - i_68_) * i_70_ >> 16) << 9)
						/ 50;
				anIntArray2815[i_55_++] = i_69_
						+ ((anIntArray2783[arg0] - i_69_) * i_70_ >> 16);
			}
			if (i_61_ >= 50) {
				int i_71_ = (50 - i_60_) * anIntArray2824[i_61_ - i_60_];
				anIntArray2821[i_55_] = i
						+ (i_67_
								+ ((anIntArray2826[i_58_] - i_67_) * i_71_ >> 16) << 9)
						/ 50;
				anIntArray2820[i_55_] = i_54_
						+ (i_68_
								+ ((anIntArray2834[i_58_] - i_68_) * i_71_ >> 16) << 9)
						/ 50;
				anIntArray2815[i_55_++] = i_69_
						+ ((anIntArray2796[arg0] - i_69_) * i_71_ >> 16);
			}
		}
		if (i_61_ >= 50) {
			anIntArray2821[i_55_] = anIntArray2838[i_58_];
			anIntArray2820[i_55_] = anIntArray2837[i_58_];
			anIntArray2815[i_55_++] = anIntArray2796[arg0];
		} else {
			int i_72_ = anIntArray2826[i_58_];
			int i_73_ = anIntArray2834[i_58_];
			int i_74_ = anIntArray2796[arg0];
			if (i_60_ >= 50) {
				int i_75_ = (50 - i_61_) * anIntArray2824[i_60_ - i_61_];
				anIntArray2821[i_55_] = i
						+ (i_72_
								+ ((anIntArray2826[i_57_] - i_72_) * i_75_ >> 16) << 9)
						/ 50;
				anIntArray2820[i_55_] = i_54_
						+ (i_73_
								+ ((anIntArray2834[i_57_] - i_73_) * i_75_ >> 16) << 9)
						/ 50;
				anIntArray2815[i_55_++] = i_74_
						+ ((anIntArray2785[arg0] - i_74_) * i_75_ >> 16);
			}
			if (i_59_ >= 50) {
				int i_76_ = (50 - i_61_) * anIntArray2824[i_59_ - i_61_];
				anIntArray2821[i_55_] = i
						+ (i_72_
								+ ((anIntArray2826[i_56_] - i_72_) * i_76_ >> 16) << 9)
						/ 50;
				anIntArray2820[i_55_] = i_54_
						+ (i_73_
								+ ((anIntArray2834[i_56_] - i_73_) * i_76_ >> 16) << 9)
						/ 50;
				anIntArray2815[i_55_++] = i_74_
						+ ((anIntArray2783[arg0] - i_74_) * i_76_ >> 16);
			}
		}
		int i_77_ = anIntArray2821[0];
		int i_78_ = anIntArray2821[1];
		int i_79_ = anIntArray2821[2];
		int i_80_ = anIntArray2820[0];
		int i_81_ = anIntArray2820[1];
		int i_82_ = anIntArray2820[2];
		Class12_Sub12_Sub7_Sub3.aBoolean2595 = false;
		if (i_55_ == 3) {
			if (i_77_ < 0 || i_78_ < 0 || i_79_ < 0
					|| i_77_ > Class12_Sub12_Sub7_Sub3.anInt2592
					|| i_78_ > Class12_Sub12_Sub7_Sub3.anInt2592
					|| i_79_ > Class12_Sub12_Sub7_Sub3.anInt2592)
				Class12_Sub12_Sub7_Sub3.aBoolean2595 = true;
			int i_83_;
			if (anIntArray2805 == null)
				i_83_ = 0;
			else
				i_83_ = anIntArray2805[arg0] & 0x3;
			if (i_83_ == 0)
				Class12_Sub12_Sub7_Sub3.method378(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, anIntArray2815[0], anIntArray2815[1],
						anIntArray2815[2]);
			else if (i_83_ == 1)
				Class12_Sub12_Sub7_Sub3.method380(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, (anIntArray2829[anIntArray2783[arg0]]));
			else if (i_83_ == 2) {
				int i_84_ = anIntArray2805[arg0] >> 2;
				int i_85_ = anIntArray2806[i_84_];
				int i_86_ = anIntArray2797[i_84_];
				int i_87_ = anIntArray2784[i_84_];
				Class12_Sub12_Sub7_Sub3.method377(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, anIntArray2815[0], anIntArray2815[1],
						anIntArray2815[2], anIntArray2826[i_85_],
						anIntArray2826[i_86_], anIntArray2826[i_87_],
						anIntArray2834[i_85_], anIntArray2834[i_86_],
						anIntArray2834[i_87_], anIntArray2816[i_85_],
						anIntArray2816[i_86_], anIntArray2816[i_87_],
						anIntArray2792[arg0]);
			} else if (i_83_ == 3) {
				int i_88_ = anIntArray2805[arg0] >> 2;
				int i_89_ = anIntArray2806[i_88_];
				int i_90_ = anIntArray2797[i_88_];
				int i_91_ = anIntArray2784[i_88_];
				Class12_Sub12_Sub7_Sub3.method377(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, anIntArray2783[arg0],
						anIntArray2783[arg0], anIntArray2783[arg0],
						anIntArray2826[i_89_], anIntArray2826[i_90_],
						anIntArray2826[i_91_], anIntArray2834[i_89_],
						anIntArray2834[i_90_], anIntArray2834[i_91_],
						anIntArray2816[i_89_], anIntArray2816[i_90_],
						anIntArray2816[i_91_], anIntArray2792[arg0]);
			}
		}
		if (i_55_ == 4) {
			if (i_77_ < 0 || i_78_ < 0 || i_79_ < 0
					|| i_77_ > Class12_Sub12_Sub7_Sub3.anInt2592
					|| i_78_ > Class12_Sub12_Sub7_Sub3.anInt2592
					|| i_79_ > Class12_Sub12_Sub7_Sub3.anInt2592
					|| anIntArray2821[3] < 0
					|| anIntArray2821[3] > Class12_Sub12_Sub7_Sub3.anInt2592)
				Class12_Sub12_Sub7_Sub3.aBoolean2595 = true;
			int i_92_;
			if (anIntArray2805 == null)
				i_92_ = 0;
			else
				i_92_ = anIntArray2805[arg0] & 0x3;
			if (i_92_ == 0) {
				Class12_Sub12_Sub7_Sub3.method378(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, anIntArray2815[0], anIntArray2815[1],
						anIntArray2815[2]);
				Class12_Sub12_Sub7_Sub3
						.method378(i_80_, i_82_, anIntArray2820[3], i_77_,
								i_79_, anIntArray2821[3], anIntArray2815[0],
								anIntArray2815[2], anIntArray2815[3]);
			} else if (i_92_ == 1) {
				int i_93_ = anIntArray2829[anIntArray2783[arg0]];
				Class12_Sub12_Sub7_Sub3.method380(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, i_93_);
				Class12_Sub12_Sub7_Sub3.method380(i_80_, i_82_,
						anIntArray2820[3], i_77_, i_79_, anIntArray2821[3],
						i_93_);
			} else if (i_92_ == 2) {
				int i_94_ = anIntArray2805[arg0] >> 2;
				int i_95_ = anIntArray2806[i_94_];
				int i_96_ = anIntArray2797[i_94_];
				int i_97_ = anIntArray2784[i_94_];
				Class12_Sub12_Sub7_Sub3.method377(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, anIntArray2815[0], anIntArray2815[1],
						anIntArray2815[2], anIntArray2826[i_95_],
						anIntArray2826[i_96_], anIntArray2826[i_97_],
						anIntArray2834[i_95_], anIntArray2834[i_96_],
						anIntArray2834[i_97_], anIntArray2816[i_95_],
						anIntArray2816[i_96_], anIntArray2816[i_97_],
						anIntArray2792[arg0]);
				Class12_Sub12_Sub7_Sub3.method377(i_80_, i_82_,
						anIntArray2820[3], i_77_, i_79_, anIntArray2821[3],
						anIntArray2815[0], anIntArray2815[2],
						anIntArray2815[3], anIntArray2826[i_95_],
						anIntArray2826[i_96_], anIntArray2826[i_97_],
						anIntArray2834[i_95_], anIntArray2834[i_96_],
						anIntArray2834[i_97_], anIntArray2816[i_95_],
						anIntArray2816[i_96_], anIntArray2816[i_97_],
						anIntArray2792[arg0]);
			} else if (i_92_ == 3) {
				int i_98_ = anIntArray2805[arg0] >> 2;
				int i_99_ = anIntArray2806[i_98_];
				int i_100_ = anIntArray2797[i_98_];
				int i_101_ = anIntArray2784[i_98_];
				Class12_Sub12_Sub7_Sub3.method377(i_80_, i_81_, i_82_, i_77_,
						i_78_, i_79_, anIntArray2783[arg0],
						anIntArray2783[arg0], anIntArray2783[arg0],
						anIntArray2826[i_99_], anIntArray2826[i_100_],
						anIntArray2826[i_101_], anIntArray2834[i_99_],
						anIntArray2834[i_100_], anIntArray2834[i_101_],
						anIntArray2816[i_99_], anIntArray2816[i_100_],
						anIntArray2816[i_101_], anIntArray2792[arg0]);
				Class12_Sub12_Sub7_Sub3.method377(i_80_, i_82_,
						anIntArray2820[3], i_77_, i_79_, anIntArray2821[3],
						anIntArray2783[arg0], anIntArray2783[arg0],
						anIntArray2783[arg0], anIntArray2826[i_99_],
						anIntArray2826[i_100_], anIntArray2826[i_101_],
						anIntArray2834[i_99_], anIntArray2834[i_100_],
						anIntArray2834[i_101_], anIntArray2816[i_99_],
						anIntArray2816[i_100_], anIntArray2816[i_101_],
						anIntArray2792[arg0]);
			}
		}
	}

	public int method484(Class12_Sub12_Sub11_Sub4 arg0, int arg1) {
		int i = -1;
		int i_102_ = arg0.anIntArray2787[arg1];
		int i_103_ = arg0.anIntArray2802[arg1];
		int i_104_ = arg0.anIntArray2791[arg1];
		for (int i_105_ = 0; i_105_ < anInt2798; i_105_++) {
			if (i_102_ == anIntArray2787[i_105_]
					&& i_103_ == anIntArray2802[i_105_]
					&& i_104_ == anIntArray2791[i_105_]) {
				i = i_105_;
				break;
			}
		}
		if (i == -1) {
			anIntArray2787[anInt2798] = i_102_;
			anIntArray2802[anInt2798] = i_103_;
			anIntArray2791[anInt2798] = i_104_;
			if (arg0.anIntArray2793 != null)
				anIntArray2793[anInt2798] = arg0.anIntArray2793[arg1];
			i = anInt2798++;
		}
		return i;
	}

	public void method485(int arg0, int arg1, int arg2, int arg3, int arg4,
			boolean arg5) {
		int i = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4
				* arg4));
		int i_106_ = arg1 * i >> 8;
		if (anIntArray2783 == null) {
			anIntArray2783 = new int[anInt2794];
			anIntArray2785 = new int[anInt2794];
			anIntArray2796 = new int[anInt2794];
		}
		if (aClass35Array2804 == null) {
			aClass35Array2804 = new Class35[anInt2798];
			for (int i_107_ = 0; i_107_ < anInt2798; i_107_++)
				aClass35Array2804[i_107_] = new Class35();
		}
		for (int i_108_ = 0; i_108_ < anInt2794; i_108_++) {
			int i_109_ = anIntArray2779[i_108_];
			int i_110_ = anIntArray2789[i_108_];
			int i_111_ = anIntArray2788[i_108_];
			int i_112_ = anIntArray2787[i_110_] - anIntArray2787[i_109_];
			int i_113_ = anIntArray2802[i_110_] - anIntArray2802[i_109_];
			int i_114_ = anIntArray2791[i_110_] - anIntArray2791[i_109_];
			int i_115_ = anIntArray2787[i_111_] - anIntArray2787[i_109_];
			int i_116_ = anIntArray2802[i_111_] - anIntArray2802[i_109_];
			int i_117_ = anIntArray2791[i_111_] - anIntArray2791[i_109_];
			int i_118_ = i_113_ * i_117_ - i_116_ * i_114_;
			int i_119_ = i_114_ * i_115_ - i_117_ * i_112_;
			int i_120_;
			for (i_120_ = i_112_ * i_116_ - i_115_ * i_113_; (i_118_ > 8192
					|| i_119_ > 8192 || i_120_ > 8192 || i_118_ < -8192
					|| i_119_ < -8192 || i_120_ < -8192); i_120_ >>= 1) {
				i_118_ >>= 1;
				i_119_ >>= 1;
			}
			int i_121_ = (int) Math.sqrt((double) (i_118_ * i_118_ + i_119_
					* i_119_ + i_120_ * i_120_));
			if (i_121_ <= 0)
				i_121_ = 1;
			i_118_ = i_118_ * 256 / i_121_;
			i_119_ = i_119_ * 256 / i_121_;
			i_120_ = i_120_ * 256 / i_121_;
			if (anIntArray2805 == null || (anIntArray2805[i_108_] & 0x1) == 0) {
				Class35 class35 = aClass35Array2804[i_109_];
				class35.anInt833 += i_118_;
				class35.anInt838 += i_119_;
				class35.anInt852 += i_120_;
				class35.anInt845++;
				class35 = aClass35Array2804[i_110_];
				class35.anInt833 += i_118_;
				class35.anInt838 += i_119_;
				class35.anInt852 += i_120_;
				class35.anInt845++;
				class35 = aClass35Array2804[i_111_];
				class35.anInt833 += i_118_;
				class35.anInt838 += i_119_;
				class35.anInt852 += i_120_;
				class35.anInt845++;
			} else {
				int i_122_ = arg0
						+ (arg2 * i_118_ + arg3 * i_119_ + arg4 * i_120_)
						/ (i_106_ + i_106_ / 2);
				anIntArray2783[i_108_] = method479(anIntArray2792[i_108_],
						i_122_, anIntArray2805[i_108_]);
			}
		}
		if (arg5)
			method493(arg0, i_106_, arg2, arg3, arg4);
		else {
			aClass35Array2790 = new Class35[anInt2798];
			for (int i_123_ = 0; i_123_ < anInt2798; i_123_++) {
				Class35 class35 = aClass35Array2804[i_123_];
				Class35 class35_124_ = aClass35Array2790[i_123_] = new Class35();
				class35_124_.anInt833 = class35.anInt833;
				class35_124_.anInt838 = class35.anInt838;
				class35_124_.anInt852 = class35.anInt852;
				class35_124_.anInt845 = class35.anInt845;
			}
			anInt2807 = (arg0 << 16) + (i_106_ & 0xffff);
		}
	}

	public void method437(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, int arg8) {
		if (anInt2782 != 1)
			method499();
		int i = arg7 * arg4 - arg5 * arg3 >> 16;
		int i_125_ = arg6 * arg1 + i * arg2 >> 16;
		int i_126_ = anInt2811 * arg2 >> 16;
		int i_127_ = i_125_ + i_126_;
		if (i_127_ > 50 && i_125_ < 3500) {
			int i_128_ = arg7 * arg3 + arg5 * arg4 >> 16;
			int i_129_ = i_128_ - anInt2811 << 9;
			if (i_129_ / i_127_ < Class12_Sub12_Sub7_Sub3.anInt2599) {
				int i_130_ = i_128_ + anInt2811 << 9;
				if (i_130_ / i_127_ > Class12_Sub12_Sub7_Sub3.anInt2603) {
					int i_131_ = arg6 * arg2 - i * arg1 >> 16;
					int i_132_ = anInt2811 * arg1 >> 16;
					int i_133_ = i_131_ + i_132_ << 9;
					if (i_133_ / i_127_ > Class12_Sub12_Sub7_Sub3.anInt2594) {
						int i_134_ = i_132_ + (anInt2394 * arg2 >> 16);
						int i_135_ = i_131_ - i_134_ << 9;
						if (i_135_ / i_127_ < Class12_Sub12_Sub7_Sub3.anInt2608) {
							int i_136_ = i_126_ + (anInt2394 * arg1 >> 16);
							boolean bool = false;
							boolean bool_137_ = false;
							if (i_125_ - i_136_ <= 50)
								bool_137_ = true;
							boolean bool_138_ = bool_137_ || anInt2781 > 0;
							boolean bool_139_ = false;
							if (arg8 > 0 && aBoolean2832) {
								int i_140_ = i_125_ - i_126_;
								if (i_140_ <= 50)
									i_140_ = 50;
								if (i_128_ > 0) {
									i_129_ /= i_127_;
									i_130_ /= i_140_;
								} else {
									i_130_ /= i_127_;
									i_129_ /= i_140_;
								}
								if (i_131_ > 0) {
									i_135_ /= i_127_;
									i_133_ /= i_140_;
								} else {
									i_133_ /= i_127_;
									i_135_ /= i_140_;
								}
								int i_141_ = (anInt2839 - Class12_Sub12_Sub7_Sub3.anInt2598);
								int i_142_ = (anInt2835 - Class12_Sub12_Sub7_Sub3.anInt2593);
								if (i_141_ > i_129_ && i_141_ < i_130_
										&& i_142_ > i_135_ && i_142_ < i_133_) {
									if (aBoolean2799)
										anIntArray2823[anInt2818++] = arg8;
									else
										bool_139_ = true;
								}
							}
							int i_143_ = Class12_Sub12_Sub7_Sub3.anInt2598;
							int i_144_ = Class12_Sub12_Sub7_Sub3.anInt2593;
							int i_145_ = 0;
							int i_146_ = 0;
							if (arg0 != 0) {
								i_145_ = anIntArray2831[arg0];
								i_146_ = anIntArray2833[arg0];
							}
							for (int i_147_ = 0; i_147_ < anInt2798; i_147_++) {
								int i_148_ = anIntArray2787[i_147_];
								int i_149_ = anIntArray2802[i_147_];
								int i_150_ = anIntArray2791[i_147_];
								if (arg0 != 0) {
									int i_151_ = (i_150_ * i_145_ + i_148_
											* i_146_ >> 16);
									i_150_ = (i_150_ * i_146_ - i_148_ * i_145_ >> 16);
									i_148_ = i_151_;
								}
								i_148_ += arg5;
								i_149_ += arg6;
								i_150_ += arg7;
								int i_152_ = i_150_ * arg3 + i_148_ * arg4 >> 16;
								i_150_ = i_150_ * arg4 - i_148_ * arg3 >> 16;
								i_148_ = i_152_;
								i_152_ = i_149_ * arg2 - i_150_ * arg1 >> 16;
								i_150_ = i_149_ * arg1 + i_150_ * arg2 >> 16;
								i_149_ = i_152_;
								anIntArray2842[i_147_] = i_150_ - i_125_;
								if (i_150_ >= 50) {
									anIntArray2838[i_147_] = i_143_
											+ (i_148_ << 9) / i_150_;
									anIntArray2837[i_147_] = i_144_
											+ (i_149_ << 9) / i_150_;
								} else {
									anIntArray2838[i_147_] = -5000;
									bool = true;
								}
								if (bool_138_) {
									anIntArray2826[i_147_] = i_148_;
									anIntArray2834[i_147_] = i_149_;
									anIntArray2816[i_147_] = i_150_;
								}
							}
							try {
								method474(bool, bool_139_, arg8);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
			}
		}
	}

	public void method486() {
		if (anInt2782 != 3) {
			anInt2782 = 3;
			anInt2394 = 0;
			anInt2814 = 0;
			anInt2811 = 999999;
			anInt2801 = -999999;
			anInt2780 = -99999;
			anInt2808 = 99999;
			for (int i = 0; i < anInt2798; i++) {
				int i_153_ = anIntArray2787[i];
				int i_154_ = anIntArray2802[i];
				int i_155_ = anIntArray2791[i];
				if (i_153_ < anInt2811)
					anInt2811 = i_153_;
				if (i_153_ > anInt2801)
					anInt2801 = i_153_;
				if (i_155_ < anInt2808)
					anInt2808 = i_155_;
				if (i_155_ > anInt2780)
					anInt2780 = i_155_;
				if (-i_154_ > anInt2394)
					anInt2394 = -i_154_;
				if (i_154_ > anInt2814)
					anInt2814 = i_154_;
			}
		}
	}

	public void method487(int arg0, int arg1, int arg2) {
		int i = anInt2807 >> 16;
		int i_156_ = anInt2807 << 16 >> 16;
		method493(i, i_156_, arg0, arg1, arg2);
	}

	public boolean method488(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
			return false;
		if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
			return false;
		if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
			return false;
		if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
			return false;
		return true;
	}

	public void method489(int arg0, int arg1) {
		for (int i = 0; i < anInt2794; i++) {
			if (anIntArray2792[i] == arg0)
				anIntArray2792[i] = arg1;
		}
	}

	public void method490(Class12_Sub12_Sub5 arg0, int arg1,
			Class12_Sub12_Sub5 arg2, int arg3, int[] arg4) {
		if (arg1 != -1) {
			if (arg4 == null || arg3 == -1)
				method495(arg0, arg1);
			else {
				aClass35Array2804 = null;
				anInt2782 = 0;
				Class37 class37 = arg0.aClass37Array2247[arg1];
				Class37 class37_157_ = arg2.aClass37Array2247[arg3];
				Class12_Sub4 class12_sub4 = class37.aClass12_Sub4_898;
				anInt2844 = 0;
				anInt2819 = 0;
				anInt2836 = 0;
				int i = 0;
				int i_158_ = arg4[i++];
				for (int i_159_ = 0; i_159_ < class37.anInt904; i_159_++) {
					int i_160_;
					for (i_160_ = class37.anIntArray897[i_159_]; i_160_ > i_158_; i_158_ = arg4[i++]) {
						/* empty */
					}
					if (i_160_ != i_158_
							|| class12_sub4.anIntArray1665[i_160_] == 0)
						method500(class12_sub4.anIntArray1665[i_160_],
								class12_sub4.anIntArrayArray1670[i_160_],
								class37.anIntArray901[i_159_],
								class37.anIntArray907[i_159_],
								class37.anIntArray902[i_159_]);
				}
				anInt2844 = 0;
				anInt2819 = 0;
				anInt2836 = 0;
				i = 0;
				i_158_ = arg4[i++];
				for (int i_161_ = 0; i_161_ < class37_157_.anInt904; i_161_++) {
					int i_162_;
					for (i_162_ = class37_157_.anIntArray897[i_161_]; i_162_ > i_158_; i_158_ = arg4[i++]) {
						/* empty */
					}
					if (i_162_ == i_158_
							|| class12_sub4.anIntArray1665[i_162_] == 0)
						method500(class12_sub4.anIntArray1665[i_162_],
								class12_sub4.anIntArrayArray1670[i_162_],
								class37_157_.anIntArray901[i_161_],
								class37_157_.anIntArray907[i_161_],
								class37_157_.anIntArray902[i_161_]);
				}
			}
		}
	}

	public void method491(int arg0) {
		if (aBooleanArray2817[arg0])
			method483(arg0);
		else {
			int i = anIntArray2779[arg0];
			int i_163_ = anIntArray2789[arg0];
			int i_164_ = anIntArray2788[arg0];
			Class12_Sub12_Sub7_Sub3.aBoolean2595 = aBooleanArray2825[arg0];
			if (anIntArray2795 == null)
				Class12_Sub12_Sub7_Sub3.anInt2590 = 0;
			else
				Class12_Sub12_Sub7_Sub3.anInt2590 = anIntArray2795[arg0];
			int i_165_;
			if (anIntArray2805 == null)
				i_165_ = 0;
			else
				i_165_ = anIntArray2805[arg0] & 0x3;
			if (i_165_ == 0)
				Class12_Sub12_Sub7_Sub3.method378(anIntArray2837[i],
						anIntArray2837[i_163_], anIntArray2837[i_164_],
						anIntArray2838[i], anIntArray2838[i_163_],
						anIntArray2838[i_164_], anIntArray2783[arg0],
						anIntArray2785[arg0], anIntArray2796[arg0]);
			else if (i_165_ == 1)
				Class12_Sub12_Sub7_Sub3.method380(anIntArray2837[i],
						anIntArray2837[i_163_], anIntArray2837[i_164_],
						anIntArray2838[i], anIntArray2838[i_163_],
						anIntArray2838[i_164_],
						(anIntArray2829[anIntArray2783[arg0]]));
			else if (i_165_ == 2) {
				int i_166_ = anIntArray2805[arg0] >> 2;
				int i_167_ = anIntArray2806[i_166_];
				int i_168_ = anIntArray2797[i_166_];
				int i_169_ = anIntArray2784[i_166_];
				Class12_Sub12_Sub7_Sub3.method377(anIntArray2837[i],
						anIntArray2837[i_163_], anIntArray2837[i_164_],
						anIntArray2838[i], anIntArray2838[i_163_],
						anIntArray2838[i_164_], anIntArray2783[arg0],
						anIntArray2785[arg0], anIntArray2796[arg0],
						anIntArray2826[i_167_], anIntArray2826[i_168_],
						anIntArray2826[i_169_], anIntArray2834[i_167_],
						anIntArray2834[i_168_], anIntArray2834[i_169_],
						anIntArray2816[i_167_], anIntArray2816[i_168_],
						anIntArray2816[i_169_], anIntArray2792[arg0]);
			} else if (i_165_ == 3) {
				int i_170_ = anIntArray2805[arg0] >> 2;
				int i_171_ = anIntArray2806[i_170_];
				int i_172_ = anIntArray2797[i_170_];
				int i_173_ = anIntArray2784[i_170_];
				Class12_Sub12_Sub7_Sub3.method377(anIntArray2837[i],
						anIntArray2837[i_163_], anIntArray2837[i_164_],
						anIntArray2838[i], anIntArray2838[i_163_],
						anIntArray2838[i_164_], anIntArray2783[arg0],
						anIntArray2783[arg0], anIntArray2783[arg0],
						anIntArray2826[i_171_], anIntArray2826[i_172_],
						anIntArray2826[i_173_], anIntArray2834[i_171_],
						anIntArray2834[i_172_], anIntArray2834[i_173_],
						anIntArray2816[i_171_], anIntArray2816[i_172_],
						anIntArray2816[i_173_], anIntArray2792[arg0]);
			}
		}
	}

	public void method492(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
		if (anInt2782 != 2 && anInt2782 != 1)
			method478();
		int i = Class12_Sub12_Sub7_Sub3.anInt2598;
		int i_174_ = Class12_Sub12_Sub7_Sub3.anInt2593;
		int i_175_ = anIntArray2831[arg0];
		int i_176_ = anIntArray2833[arg0];
		int i_177_ = anIntArray2831[arg1];
		int i_178_ = anIntArray2833[arg1];
		int i_179_ = anIntArray2831[arg2];
		int i_180_ = anIntArray2833[arg2];
		int i_181_ = anIntArray2831[arg3];
		int i_182_ = anIntArray2833[arg3];
		int i_183_ = arg5 * i_181_ + arg6 * i_182_ >> 16;
		for (int i_184_ = 0; i_184_ < anInt2798; i_184_++) {
			int i_185_ = anIntArray2787[i_184_];
			int i_186_ = anIntArray2802[i_184_];
			int i_187_ = anIntArray2791[i_184_];
			if (arg2 != 0) {
				int i_188_ = i_186_ * i_179_ + i_185_ * i_180_ >> 16;
				i_186_ = i_186_ * i_180_ - i_185_ * i_179_ >> 16;
				i_185_ = i_188_;
			}
			if (arg0 != 0) {
				int i_189_ = i_186_ * i_176_ - i_187_ * i_175_ >> 16;
				i_187_ = i_186_ * i_175_ + i_187_ * i_176_ >> 16;
				i_186_ = i_189_;
			}
			if (arg1 != 0) {
				int i_190_ = i_187_ * i_177_ + i_185_ * i_178_ >> 16;
				i_187_ = i_187_ * i_178_ - i_185_ * i_177_ >> 16;
				i_185_ = i_190_;
			}
			i_185_ += arg4;
			i_186_ += arg5;
			i_187_ += arg6;
			int i_191_ = i_186_ * i_182_ - i_187_ * i_181_ >> 16;
			i_187_ = i_186_ * i_181_ + i_187_ * i_182_ >> 16;
			i_186_ = i_191_;
			anIntArray2842[i_184_] = i_187_ - i_183_;
			anIntArray2838[i_184_] = i + (i_185_ << 9) / i_187_;
			anIntArray2837[i_184_] = i_174_ + (i_186_ << 9) / i_187_;
			if (anInt2781 > 0) {
				anIntArray2826[i_184_] = i_185_;
				anIntArray2834[i_184_] = i_186_;
				anIntArray2816[i_184_] = i_187_;
			}
		}
		try {
			method474(false, false, 0);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int i = 0; i < anInt2794; i++) {
			int i_192_ = anIntArray2779[i];
			int i_193_ = anIntArray2789[i];
			int i_194_ = anIntArray2788[i];
			if (anIntArray2805 == null) {
				int i_195_ = anIntArray2792[i];
				Class35 class35 = aClass35Array2804[i_192_];
				int i_196_ = arg0
						+ ((arg2 * class35.anInt833 + arg3 * class35.anInt838 + arg4
								* class35.anInt852) / (arg1 * class35.anInt845));
				anIntArray2783[i] = method479(i_195_, i_196_, 0);
				class35 = aClass35Array2804[i_193_];
				i_196_ = arg0
						+ ((arg2 * class35.anInt833 + arg3 * class35.anInt838 + arg4
								* class35.anInt852) / (arg1 * class35.anInt845));
				anIntArray2785[i] = method479(i_195_, i_196_, 0);
				class35 = aClass35Array2804[i_194_];
				i_196_ = arg0
						+ ((arg2 * class35.anInt833 + arg3 * class35.anInt838 + arg4
								* class35.anInt852) / (arg1 * class35.anInt845));
				anIntArray2796[i] = method479(i_195_, i_196_, 0);
			} else if ((anIntArray2805[i] & 0x1) == 0) {
				int i_197_ = anIntArray2792[i];
				int i_198_ = anIntArray2805[i];
				Class35 class35 = aClass35Array2804[i_192_];
				int i_199_ = arg0
						+ ((arg2 * class35.anInt833 + arg3 * class35.anInt838 + arg4
								* class35.anInt852) / (arg1 * class35.anInt845));
				anIntArray2783[i] = method479(i_197_, i_199_, i_198_);
				class35 = aClass35Array2804[i_193_];
				i_199_ = arg0
						+ ((arg2 * class35.anInt833 + arg3 * class35.anInt838 + arg4
								* class35.anInt852) / (arg1 * class35.anInt845));
				anIntArray2785[i] = method479(i_197_, i_199_, i_198_);
				class35 = aClass35Array2804[i_194_];
				i_199_ = arg0
						+ ((arg2 * class35.anInt833 + arg3 * class35.anInt838 + arg4
								* class35.anInt852) / (arg1 * class35.anInt845));
				anIntArray2796[i] = method479(i_197_, i_199_, i_198_);
			}
		}
		aClass35Array2804 = null;
		aClass35Array2790 = null;
		anIntArray2793 = null;
		anIntArray2786 = null;
		if (anIntArray2805 != null) {
			for (int i = 0; i < anInt2794; i++) {
				if ((anIntArray2805[i] & 0x2) == 2)
					return;
			}
		}
		anIntArray2792 = null;
	}

	public static void method494() {
		aClass12_Sub12_Sub11_Sub4_2810 = null;
		anIntArray2813 = null;
		aClass12_Sub12_Sub11_Sub4_2812 = null;
		anIntArray2843 = null;
		aBooleanArray2825 = null;
		aBooleanArray2817 = null;
		anIntArray2838 = null;
		anIntArray2837 = null;
		anIntArray2842 = null;
		anIntArray2826 = null;
		anIntArray2834 = null;
		anIntArray2816 = null;
		anIntArray2828 = null;
		anIntArrayArray2830 = null;
		anIntArray2840 = null;
		anIntArrayArray2846 = null;
		anIntArray2841 = null;
		anIntArray2845 = null;
		anIntArray2822 = null;
		anIntArray2821 = null;
		anIntArray2820 = null;
		anIntArray2815 = null;
		anIntArray2823 = null;
		anIntArray2831 = null;
		anIntArray2833 = null;
		anIntArray2829 = null;
		anIntArray2824 = null;
		anIntArray2827 = null;
	}

	public void method495(Class12_Sub12_Sub5 arg0, int arg1) {
		if (anIntArrayArray2809 != null && arg1 != -1) {
			aClass35Array2804 = null;
			anInt2782 = 0;
			Class37 class37 = arg0.aClass37Array2247[arg1];
			Class12_Sub4 class12_sub4 = class37.aClass12_Sub4_898;
			anInt2844 = 0;
			anInt2819 = 0;
			anInt2836 = 0;
			for (int i = 0; i < class37.anInt904; i++) {
				int i_200_ = class37.anIntArray897[i];
				method500(class12_sub4.anIntArray1665[i_200_],
						class12_sub4.anIntArrayArray1670[i_200_],
						class37.anIntArray901[i], class37.anIntArray907[i],
						class37.anIntArray902[i]);
			}
		}
	}

	public static Class12_Sub12_Sub11_Sub4 method496(Class26 arg0, int arg1,
			int arg2) {
		byte[] is = arg0.method631(arg1, true, arg2);
		if (is == null)
			return null;
		return new Class12_Sub12_Sub11_Sub4(is);
	}

	public int method497() {
		method499();
		return anInt2811;
	}

	public Class12_Sub12_Sub11_Sub4 method498(boolean arg0) {
		if (!arg0 && anIntArray2813.length < anInt2794)
			anIntArray2813 = new int[anInt2794 + 100];
		return method480(arg0, aClass12_Sub12_Sub11_Sub4_2810, anIntArray2813);
	}

	public void method499() {
		if (anInt2782 != 1) {
			anInt2782 = 1;
			anInt2394 = 0;
			anInt2814 = 0;
			anInt2811 = 0;
			for (int i = 0; i < anInt2798; i++) {
				int i_201_ = anIntArray2787[i];
				int i_202_ = anIntArray2802[i];
				int i_203_ = anIntArray2791[i];
				if (-i_202_ > anInt2394)
					anInt2394 = -i_202_;
				if (i_202_ > anInt2814)
					anInt2814 = i_202_;
				int i_204_ = i_201_ * i_201_ + i_203_ * i_203_;
				if (i_204_ > anInt2811)
					anInt2811 = i_204_;
			}
			anInt2811 = (int) (Math.sqrt((double) anInt2811) + 0.99);
			anInt2780 = (int) (Math
					.sqrt((double) (anInt2811 * anInt2811 + anInt2394
							* anInt2394)) + 0.99);
			anInt2801 = (anInt2780 + (int) (Math.sqrt((double) (anInt2811
					* anInt2811 + anInt2814 * anInt2814)) + 0.99));
		}
	}

	public void method500(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int i = arg1.length;
		if (arg0 == 0) {
			int i_205_ = 0;
			anInt2844 = 0;
			anInt2819 = 0;
			anInt2836 = 0;
			for (int i_206_ = 0; i_206_ < i; i_206_++) {
				int i_207_ = arg1[i_206_];
				if (i_207_ < anIntArrayArray2809.length) {
					int[] is = anIntArrayArray2809[i_207_];
					for (int i_208_ = 0; i_208_ < is.length; i_208_++) {
						int i_209_ = is[i_208_];
						anInt2844 += anIntArray2787[i_209_];
						anInt2819 += anIntArray2802[i_209_];
						anInt2836 += anIntArray2791[i_209_];
						i_205_++;
					}
				}
			}
			if (i_205_ > 0) {
				anInt2844 = anInt2844 / i_205_ + arg2;
				anInt2819 = anInt2819 / i_205_ + arg3;
				anInt2836 = anInt2836 / i_205_ + arg4;
			} else {
				anInt2844 = arg2;
				anInt2819 = arg3;
				anInt2836 = arg4;
			}
		} else if (arg0 == 1) {
			for (int i_210_ = 0; i_210_ < i; i_210_++) {
				int i_211_ = arg1[i_210_];
				if (i_211_ < anIntArrayArray2809.length) {
					int[] is = anIntArrayArray2809[i_211_];
					for (int i_212_ = 0; i_212_ < is.length; i_212_++) {
						int i_213_ = is[i_212_];
						anIntArray2787[i_213_] += arg2;
						anIntArray2802[i_213_] += arg3;
						anIntArray2791[i_213_] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int i_214_ = 0; i_214_ < i; i_214_++) {
				int i_215_ = arg1[i_214_];
				if (i_215_ < anIntArrayArray2809.length) {
					int[] is = anIntArrayArray2809[i_215_];
					for (int i_216_ = 0; i_216_ < is.length; i_216_++) {
						int i_217_ = is[i_216_];
						anIntArray2787[i_217_] -= anInt2844;
						anIntArray2802[i_217_] -= anInt2819;
						anIntArray2791[i_217_] -= anInt2836;
						int i_218_ = (arg2 & 0xff) * 8;
						int i_219_ = (arg3 & 0xff) * 8;
						int i_220_ = (arg4 & 0xff) * 8;
						if (i_220_ != 0) {
							int i_221_ = anIntArray2831[i_220_];
							int i_222_ = anIntArray2833[i_220_];
							int i_223_ = ((anIntArray2802[i_217_] * i_221_ + anIntArray2787[i_217_]
									* i_222_) >> 16);
							anIntArray2802[i_217_] = (anIntArray2802[i_217_]
									* i_222_ - anIntArray2787[i_217_] * i_221_) >> 16;
							anIntArray2787[i_217_] = i_223_;
						}
						if (i_218_ != 0) {
							int i_224_ = anIntArray2831[i_218_];
							int i_225_ = anIntArray2833[i_218_];
							int i_226_ = ((anIntArray2802[i_217_] * i_225_ - anIntArray2791[i_217_]
									* i_224_) >> 16);
							anIntArray2791[i_217_] = (anIntArray2802[i_217_]
									* i_224_ + anIntArray2791[i_217_] * i_225_) >> 16;
							anIntArray2802[i_217_] = i_226_;
						}
						if (i_219_ != 0) {
							int i_227_ = anIntArray2831[i_219_];
							int i_228_ = anIntArray2833[i_219_];
							int i_229_ = ((anIntArray2791[i_217_] * i_227_ + anIntArray2787[i_217_]
									* i_228_) >> 16);
							anIntArray2791[i_217_] = (anIntArray2791[i_217_]
									* i_228_ - anIntArray2787[i_217_] * i_227_) >> 16;
							anIntArray2787[i_217_] = i_229_;
						}
						anIntArray2787[i_217_] += anInt2844;
						anIntArray2802[i_217_] += anInt2819;
						anIntArray2791[i_217_] += anInt2836;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int i_230_ = 0; i_230_ < i; i_230_++) {
				int i_231_ = arg1[i_230_];
				if (i_231_ < anIntArrayArray2809.length) {
					int[] is = anIntArrayArray2809[i_231_];
					for (int i_232_ = 0; i_232_ < is.length; i_232_++) {
						int i_233_ = is[i_232_];
						anIntArray2787[i_233_] -= anInt2844;
						anIntArray2802[i_233_] -= anInt2819;
						anIntArray2791[i_233_] -= anInt2836;
						anIntArray2787[i_233_] = anIntArray2787[i_233_] * arg2
								/ 128;
						anIntArray2802[i_233_] = anIntArray2802[i_233_] * arg3
								/ 128;
						anIntArray2791[i_233_] = anIntArray2791[i_233_] * arg4
								/ 128;
						anIntArray2787[i_233_] += anInt2844;
						anIntArray2802[i_233_] += anInt2819;
						anIntArray2791[i_233_] += anInt2836;
					}
				}
			}
		} else if (arg0 == 5 && anIntArrayArray2800 != null
				&& anIntArray2795 != null) {
			for (int i_234_ = 0; i_234_ < i; i_234_++) {
				int i_235_ = arg1[i_234_];
				if (i_235_ < anIntArrayArray2800.length) {
					int[] is = anIntArrayArray2800[i_235_];
					for (int i_236_ = 0; i_236_ < is.length; i_236_++) {
						int i_237_ = is[i_236_];
						anIntArray2795[i_237_] += arg2 * 8;
						if (anIntArray2795[i_237_] < 0)
							anIntArray2795[i_237_] = 0;
						if (anIntArray2795[i_237_] > 255)
							anIntArray2795[i_237_] = 255;
					}
				}
			}
		}
	}

	public void method501(int arg0) {
		aClass35Array2804 = null;
		anInt2782 = 0;
		int i = anIntArray2831[arg0];
		int i_238_ = anIntArray2833[arg0];
		for (int i_239_ = 0; i_239_ < anInt2798; i_239_++) {
			int i_240_ = (anIntArray2802[i_239_] * i_238_
					- anIntArray2791[i_239_] * i >> 16);
			anIntArray2791[i_239_] = (anIntArray2802[i_239_] * i
					+ anIntArray2791[i_239_] * i_238_ >> 16);
			anIntArray2802[i_239_] = i_240_;
		}
	}

	public Class12_Sub12_Sub11_Sub4(byte[] arg0) {
		aBoolean2799 = false;
		anInt2798 = 0;
		Buffer class12_sub11 = new Buffer(arg0);
		Buffer class12_sub11_241_ = new Buffer(arg0);
		Buffer class12_sub11_242_ = new Buffer(arg0);
		Buffer class12_sub11_243_ = new Buffer(arg0);
		Buffer class12_sub11_244_ = new Buffer(arg0);
		class12_sub11.position = arg0.length - 18;
		int i = class12_sub11.readShort(-1);
		int i_245_ = class12_sub11.readShort(-1);
		int i_246_ = class12_sub11.readSignedByte(true);
		int i_247_ = class12_sub11.readSignedByte(true);
		int i_248_ = class12_sub11.readSignedByte(true);
		int i_249_ = class12_sub11.readSignedByte(true);
		int i_250_ = class12_sub11.readSignedByte(true);
		int i_251_ = class12_sub11.readSignedByte(true);
		int i_252_ = class12_sub11.readShort(-1);
		int i_253_ = class12_sub11.readShort(-1);
		int i_254_ = class12_sub11.readShort(-1);
		int i_255_ = class12_sub11.readShort(-1);
		int i_256_ = 0;
		int i_257_ = i_256_;
		i_256_ += i;
		int i_258_ = i_256_;
		i_256_ += i_245_;
		int i_259_ = i_256_;
		if (i_248_ == 255)
			i_256_ += i_245_;
		else
			i_259_ = -i_248_ - 1;
		int i_260_ = i_256_;
		if (i_250_ == 1)
			i_256_ += i_245_;
		else
			i_260_ = -1;
		int i_261_ = i_256_;
		if (i_247_ == 1)
			i_256_ += i_245_;
		else
			i_261_ = -1;
		int i_262_ = i_256_;
		if (i_251_ == 1)
			i_256_ += i;
		else
			i_262_ = -1;
		int i_263_ = i_256_;
		if (i_249_ == 1)
			i_256_ += i_245_;
		else
			i_263_ = -1;
		int i_264_ = i_256_;
		i_256_ += i_255_;
		int i_265_ = i_256_;
		i_256_ += i_245_ * 2;
		int i_266_ = i_256_;
		i_256_ += i_246_ * 6;
		int i_267_ = i_256_;
		i_256_ += i_252_;
		int i_268_ = i_256_;
		i_256_ += i_253_;
		int i_269_ = i_256_;
		i_256_ += i_254_;
		anInt2798 = i;
		anInt2794 = i_245_;
		anInt2781 = i_246_;
		anIntArray2787 = new int[i];
		anIntArray2802 = new int[i];
		anIntArray2791 = new int[i];
		anIntArray2779 = new int[i_245_];
		anIntArray2789 = new int[i_245_];
		anIntArray2788 = new int[i_245_];
		anIntArray2806 = new int[i_246_];
		anIntArray2797 = new int[i_246_];
		anIntArray2784 = new int[i_246_];
		if (i_262_ >= 0)
			anIntArray2793 = new int[i];
		if (i_261_ >= 0)
			anIntArray2805 = new int[i_245_];
		if (i_259_ >= 0)
			anIntArray2778 = new int[i_245_];
		else
			anInt2803 = -i_259_ - 1;
		if (i_263_ >= 0)
			anIntArray2795 = new int[i_245_];
		if (i_260_ >= 0)
			anIntArray2786 = new int[i_245_];
		anIntArray2792 = new int[i_245_];
		class12_sub11.position = i_257_;
		class12_sub11_241_.position = i_267_;
		class12_sub11_242_.position = i_268_;
		class12_sub11_243_.position = i_269_;
		class12_sub11_244_.position = i_262_;
		int i_270_ = 0;
		int i_271_ = 0;
		int i_272_ = 0;
		for (int i_273_ = 0; i_273_ < i; i_273_++) {
			int i_274_ = class12_sub11.readSignedByte(true);
			int i_275_ = 0;
			if ((i_274_ & 0x1) != 0)
				i_275_ = class12_sub11_241_.method216(23138);
			int i_276_ = 0;
			if ((i_274_ & 0x2) != 0)
				i_276_ = class12_sub11_242_.method216(23138);
			int i_277_ = 0;
			if ((i_274_ & 0x4) != 0)
				i_277_ = class12_sub11_243_.method216(23138);
			anIntArray2787[i_273_] = i_270_ + i_275_;
			anIntArray2802[i_273_] = i_271_ + i_276_;
			anIntArray2791[i_273_] = i_272_ + i_277_;
			i_270_ = anIntArray2787[i_273_];
			i_271_ = anIntArray2802[i_273_];
			i_272_ = anIntArray2791[i_273_];
			if (anIntArray2793 != null)
				anIntArray2793[i_273_] = class12_sub11_244_.readSignedByte(true);
		}
		class12_sub11.position = i_265_;
		class12_sub11_241_.position = i_261_;
		class12_sub11_242_.position = i_259_;
		class12_sub11_243_.position = i_263_;
		class12_sub11_244_.position = i_260_;
		for (int i_278_ = 0; i_278_ < i_245_; i_278_++) {
			anIntArray2792[i_278_] = class12_sub11.readShort(-1);
			if (anIntArray2805 != null)
				anIntArray2805[i_278_] = class12_sub11_241_.readSignedByte(true);
			if (anIntArray2778 != null)
				anIntArray2778[i_278_] = class12_sub11_242_.readSignedByte(true);
			if (anIntArray2795 != null)
				anIntArray2795[i_278_] = class12_sub11_243_.readSignedByte(true);
			if (anIntArray2786 != null)
				anIntArray2786[i_278_] = class12_sub11_244_.readSignedByte(true);
		}
		class12_sub11.position = i_264_;
		class12_sub11_241_.position = i_258_;
		int i_279_ = 0;
		int i_280_ = 0;
		int i_281_ = 0;
		int i_282_ = 0;
		for (int i_283_ = 0; i_283_ < i_245_; i_283_++) {
			int i_284_ = class12_sub11_241_.readSignedByte(true);
			if (i_284_ == 1) {
				i_279_ = class12_sub11.method216(23138) + i_282_;
				i_282_ = i_279_;
				i_280_ = class12_sub11.method216(23138) + i_282_;
				i_282_ = i_280_;
				i_281_ = class12_sub11.method216(23138) + i_282_;
				i_282_ = i_281_;
				anIntArray2779[i_283_] = i_279_;
				anIntArray2789[i_283_] = i_280_;
				anIntArray2788[i_283_] = i_281_;
			}
			if (i_284_ == 2) {
				i_280_ = i_281_;
				i_281_ = class12_sub11.method216(23138) + i_282_;
				i_282_ = i_281_;
				anIntArray2779[i_283_] = i_279_;
				anIntArray2789[i_283_] = i_280_;
				anIntArray2788[i_283_] = i_281_;
			}
			if (i_284_ == 3) {
				i_279_ = i_281_;
				i_281_ = class12_sub11.method216(23138) + i_282_;
				i_282_ = i_281_;
				anIntArray2779[i_283_] = i_279_;
				anIntArray2789[i_283_] = i_280_;
				anIntArray2788[i_283_] = i_281_;
			}
			if (i_284_ == 4) {
				int i_285_ = i_279_;
				i_279_ = i_280_;
				i_280_ = i_285_;
				i_281_ = class12_sub11.method216(23138) + i_282_;
				i_282_ = i_281_;
				anIntArray2779[i_283_] = i_279_;
				anIntArray2789[i_283_] = i_280_;
				anIntArray2788[i_283_] = i_281_;
			}
		}
		class12_sub11.position = i_266_;
		for (int i_286_ = 0; i_286_ < i_246_; i_286_++) {
			anIntArray2806[i_286_] = class12_sub11.readShort(-1);
			anIntArray2797[i_286_] = class12_sub11.readShort(-1);
			anIntArray2784[i_286_] = class12_sub11.readShort(-1);
		}
	}

	public Class12_Sub12_Sub11_Sub4() {
		aBoolean2799 = false;
		anInt2798 = 0;
	}

	public Class12_Sub12_Sub11_Sub4(Class12_Sub12_Sub11_Sub4[] arg0, int arg1) {
		aBoolean2799 = false;
		anInt2798 = 0;
		boolean bool = false;
		boolean bool_287_ = false;
		boolean bool_288_ = false;
		boolean bool_289_ = false;
		anInt2798 = 0;
		anInt2794 = 0;
		anInt2781 = 0;
		anInt2803 = -1;
		for (int i = 0; i < arg1; i++) {
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg0[i];
			if (class12_sub12_sub11_sub4 != null) {
				anInt2798 += class12_sub12_sub11_sub4.anInt2798;
				anInt2794 += class12_sub12_sub11_sub4.anInt2794;
				anInt2781 += class12_sub12_sub11_sub4.anInt2781;
				bool = bool | class12_sub12_sub11_sub4.anIntArray2805 != null;
				if (class12_sub12_sub11_sub4.anIntArray2778 != null)
					bool_287_ = true;
				else {
					if (anInt2803 == -1)
						anInt2803 = class12_sub12_sub11_sub4.anInt2803;
					if (anInt2803 != class12_sub12_sub11_sub4.anInt2803)
						bool_287_ = true;
				}
				bool_288_ = (bool_288_ | class12_sub12_sub11_sub4.anIntArray2795 != null);
				bool_289_ = (bool_289_ | class12_sub12_sub11_sub4.anIntArray2786 != null);
			}
		}
		anIntArray2787 = new int[anInt2798];
		anIntArray2802 = new int[anInt2798];
		anIntArray2791 = new int[anInt2798];
		anIntArray2793 = new int[anInt2798];
		anIntArray2779 = new int[anInt2794];
		anIntArray2789 = new int[anInt2794];
		anIntArray2788 = new int[anInt2794];
		anIntArray2806 = new int[anInt2781];
		anIntArray2797 = new int[anInt2781];
		anIntArray2784 = new int[anInt2781];
		if (bool)
			anIntArray2805 = new int[anInt2794];
		if (bool_287_)
			anIntArray2778 = new int[anInt2794];
		if (bool_288_)
			anIntArray2795 = new int[anInt2794];
		if (bool_289_)
			anIntArray2786 = new int[anInt2794];
		anIntArray2792 = new int[anInt2794];
		anInt2798 = 0;
		anInt2794 = 0;
		anInt2781 = 0;
		int i = 0;
		for (int i_290_ = 0; i_290_ < arg1; i_290_++) {
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg0[i_290_];
			if (class12_sub12_sub11_sub4 != null) {
				for (int i_291_ = 0; i_291_ < class12_sub12_sub11_sub4.anInt2794; i_291_++) {
					if (bool) {
						if (class12_sub12_sub11_sub4.anIntArray2805 == null)
							anIntArray2805[anInt2794] = 0;
						else {
							int i_292_ = (class12_sub12_sub11_sub4.anIntArray2805[i_291_]);
							if ((i_292_ & 0x2) == 2)
								i_292_ += i << 2;
							anIntArray2805[anInt2794] = i_292_;
						}
					}
					if (bool_287_) {
						if (class12_sub12_sub11_sub4.anIntArray2778 == null)
							anIntArray2778[anInt2794] = class12_sub12_sub11_sub4.anInt2803;
						else
							anIntArray2778[anInt2794] = (class12_sub12_sub11_sub4.anIntArray2778[i_291_]);
					}
					if (bool_288_) {
						if (class12_sub12_sub11_sub4.anIntArray2795 == null)
							anIntArray2795[anInt2794] = 0;
						else
							anIntArray2795[anInt2794] = (class12_sub12_sub11_sub4.anIntArray2795[i_291_]);
					}
					if (bool_289_
							&& class12_sub12_sub11_sub4.anIntArray2786 != null)
						anIntArray2786[anInt2794] = class12_sub12_sub11_sub4.anIntArray2786[i_291_];
					anIntArray2792[anInt2794] = class12_sub12_sub11_sub4.anIntArray2792[i_291_];
					anIntArray2779[anInt2794] = method484(
							class12_sub12_sub11_sub4,
							(class12_sub12_sub11_sub4.anIntArray2779[i_291_]));
					anIntArray2789[anInt2794] = method484(
							class12_sub12_sub11_sub4,
							(class12_sub12_sub11_sub4.anIntArray2789[i_291_]));
					anIntArray2788[anInt2794] = method484(
							class12_sub12_sub11_sub4,
							(class12_sub12_sub11_sub4.anIntArray2788[i_291_]));
					anInt2794++;
				}
				for (int i_293_ = 0; i_293_ < class12_sub12_sub11_sub4.anInt2781; i_293_++) {
					anIntArray2806[anInt2781] = method484(
							class12_sub12_sub11_sub4,
							(class12_sub12_sub11_sub4.anIntArray2806[i_293_]));
					anIntArray2797[anInt2781] = method484(
							class12_sub12_sub11_sub4,
							(class12_sub12_sub11_sub4.anIntArray2797[i_293_]));
					anIntArray2784[anInt2781] = method484(
							class12_sub12_sub11_sub4,
							(class12_sub12_sub11_sub4.anIntArray2784[i_293_]));
					anInt2781++;
				}
				i += class12_sub12_sub11_sub4.anInt2781;
			}
		}
	}

	public Class12_Sub12_Sub11_Sub4(Class12_Sub12_Sub11_Sub4[] arg0, int arg1,
			boolean arg2) {
		aBoolean2799 = false;
		anInt2798 = 0;
		boolean bool = false;
		boolean bool_294_ = false;
		boolean bool_295_ = false;
		boolean bool_296_ = false;
		anInt2798 = 0;
		anInt2794 = 0;
		anInt2781 = 0;
		anInt2803 = -1;
		for (int i = 0; i < arg1; i++) {
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg0[i];
			if (class12_sub12_sub11_sub4 != null) {
				anInt2798 += class12_sub12_sub11_sub4.anInt2798;
				anInt2794 += class12_sub12_sub11_sub4.anInt2794;
				anInt2781 += class12_sub12_sub11_sub4.anInt2781;
				bool = bool | class12_sub12_sub11_sub4.anIntArray2805 != null;
				if (class12_sub12_sub11_sub4.anIntArray2778 != null)
					bool_294_ = true;
				else {
					if (anInt2803 == -1)
						anInt2803 = class12_sub12_sub11_sub4.anInt2803;
					if (anInt2803 != class12_sub12_sub11_sub4.anInt2803)
						bool_294_ = true;
				}
				bool_295_ = (bool_295_ | class12_sub12_sub11_sub4.anIntArray2795 != null);
				bool_296_ = (bool_296_ | class12_sub12_sub11_sub4.anIntArray2792 != null);
			}
		}
		anIntArray2787 = new int[anInt2798];
		anIntArray2802 = new int[anInt2798];
		anIntArray2791 = new int[anInt2798];
		anIntArray2779 = new int[anInt2794];
		anIntArray2789 = new int[anInt2794];
		anIntArray2788 = new int[anInt2794];
		anIntArray2783 = new int[anInt2794];
		anIntArray2785 = new int[anInt2794];
		anIntArray2796 = new int[anInt2794];
		anIntArray2806 = new int[anInt2781];
		anIntArray2797 = new int[anInt2781];
		anIntArray2784 = new int[anInt2781];
		if (bool)
			anIntArray2805 = new int[anInt2794];
		if (bool_294_)
			anIntArray2778 = new int[anInt2794];
		if (bool_295_)
			anIntArray2795 = new int[anInt2794];
		if (bool_296_)
			anIntArray2792 = new int[anInt2794];
		anInt2798 = 0;
		anInt2794 = 0;
		anInt2781 = 0;
		int i = 0;
		for (int i_297_ = 0; i_297_ < arg1; i_297_++) {
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg0[i_297_];
			if (class12_sub12_sub11_sub4 != null) {
				int i_298_ = anInt2798;
				for (int i_299_ = 0; i_299_ < class12_sub12_sub11_sub4.anInt2798; i_299_++) {
					anIntArray2787[anInt2798] = class12_sub12_sub11_sub4.anIntArray2787[i_299_];
					anIntArray2802[anInt2798] = class12_sub12_sub11_sub4.anIntArray2802[i_299_];
					anIntArray2791[anInt2798] = class12_sub12_sub11_sub4.anIntArray2791[i_299_];
					anInt2798++;
				}
				for (int i_300_ = 0; i_300_ < class12_sub12_sub11_sub4.anInt2794; i_300_++) {
					anIntArray2779[anInt2794] = (class12_sub12_sub11_sub4.anIntArray2779[i_300_] + i_298_);
					anIntArray2789[anInt2794] = (class12_sub12_sub11_sub4.anIntArray2789[i_300_] + i_298_);
					anIntArray2788[anInt2794] = (class12_sub12_sub11_sub4.anIntArray2788[i_300_] + i_298_);
					anIntArray2783[anInt2794] = class12_sub12_sub11_sub4.anIntArray2783[i_300_];
					anIntArray2785[anInt2794] = class12_sub12_sub11_sub4.anIntArray2785[i_300_];
					anIntArray2796[anInt2794] = class12_sub12_sub11_sub4.anIntArray2796[i_300_];
					if (bool) {
						if (class12_sub12_sub11_sub4.anIntArray2805 == null)
							anIntArray2805[anInt2794] = 0;
						else {
							int i_301_ = (class12_sub12_sub11_sub4.anIntArray2805[i_300_]);
							if ((i_301_ & 0x2) == 2)
								i_301_ += i << 2;
							anIntArray2805[anInt2794] = i_301_;
						}
					}
					if (bool_294_) {
						if (class12_sub12_sub11_sub4.anIntArray2778 == null)
							anIntArray2778[anInt2794] = class12_sub12_sub11_sub4.anInt2803;
						else
							anIntArray2778[anInt2794] = (class12_sub12_sub11_sub4.anIntArray2778[i_300_]);
					}
					if (bool_295_) {
						if (class12_sub12_sub11_sub4.anIntArray2795 == null)
							anIntArray2795[anInt2794] = 0;
						else
							anIntArray2795[anInt2794] = (class12_sub12_sub11_sub4.anIntArray2795[i_300_]);
					}
					if (bool_296_
							&& class12_sub12_sub11_sub4.anIntArray2792 != null)
						anIntArray2792[anInt2794] = class12_sub12_sub11_sub4.anIntArray2792[i_300_];
					anInt2794++;
				}
				for (int i_302_ = 0; i_302_ < class12_sub12_sub11_sub4.anInt2781; i_302_++) {
					anIntArray2806[anInt2781] = (class12_sub12_sub11_sub4.anIntArray2806[i_302_] + i_298_);
					anIntArray2797[anInt2781] = (class12_sub12_sub11_sub4.anIntArray2797[i_302_] + i_298_);
					anIntArray2784[anInt2781] = (class12_sub12_sub11_sub4.anIntArray2784[i_302_] + i_298_);
					anInt2781++;
				}
				i += class12_sub12_sub11_sub4.anInt2781;
			}
		}
	}

	public Class12_Sub12_Sub11_Sub4(Class12_Sub12_Sub11_Sub4 arg0,
			boolean arg1, boolean arg2, boolean arg3) {
		aBoolean2799 = false;
		anInt2798 = 0;
		anInt2798 = arg0.anInt2798;
		anInt2794 = arg0.anInt2794;
		anInt2781 = arg0.anInt2781;
		if (arg1) {
			anIntArray2787 = arg0.anIntArray2787;
			anIntArray2802 = arg0.anIntArray2802;
			anIntArray2791 = arg0.anIntArray2791;
		} else {
			anIntArray2787 = new int[anInt2798];
			anIntArray2802 = new int[anInt2798];
			anIntArray2791 = new int[anInt2798];
			for (int i = 0; i < anInt2798; i++) {
				anIntArray2787[i] = arg0.anIntArray2787[i];
				anIntArray2802[i] = arg0.anIntArray2802[i];
				anIntArray2791[i] = arg0.anIntArray2791[i];
			}
		}
		if (arg2)
			anIntArray2792 = arg0.anIntArray2792;
		else {
			anIntArray2792 = new int[anInt2794];
			for (int i = 0; i < anInt2794; i++)
				anIntArray2792[i] = arg0.anIntArray2792[i];
		}
		if (arg3)
			anIntArray2795 = arg0.anIntArray2795;
		else {
			anIntArray2795 = new int[anInt2794];
			if (arg0.anIntArray2795 == null) {
				for (int i = 0; i < anInt2794; i++)
					anIntArray2795[i] = 0;
			} else {
				for (int i = 0; i < anInt2794; i++)
					anIntArray2795[i] = arg0.anIntArray2795[i];
			}
		}
		anIntArray2793 = arg0.anIntArray2793;
		anIntArray2786 = arg0.anIntArray2786;
		anIntArray2805 = arg0.anIntArray2805;
		anIntArray2779 = arg0.anIntArray2779;
		anIntArray2789 = arg0.anIntArray2789;
		anIntArray2788 = arg0.anIntArray2788;
		anIntArray2778 = arg0.anIntArray2778;
		anInt2803 = arg0.anInt2803;
		anIntArray2806 = arg0.anIntArray2806;
		anIntArray2797 = arg0.anIntArray2797;
		anIntArray2784 = arg0.anIntArray2784;
	}

	public Class12_Sub12_Sub11_Sub4(Class12_Sub12_Sub11_Sub4 arg0,
			boolean arg1, boolean arg2) {
		aBoolean2799 = false;
		anInt2798 = 0;
		anInt2798 = arg0.anInt2798;
		anInt2794 = arg0.anInt2794;
		anInt2781 = arg0.anInt2781;
		if (arg1) {
			anIntArray2802 = new int[anInt2798];
			for (int i = 0; i < anInt2798; i++)
				anIntArray2802[i] = arg0.anIntArray2802[i];
		} else
			anIntArray2802 = arg0.anIntArray2802;
		if (arg2) {
			anIntArray2783 = new int[anInt2794];
			anIntArray2785 = new int[anInt2794];
			anIntArray2796 = new int[anInt2794];
			for (int i = 0; i < anInt2794; i++) {
				anIntArray2783[i] = arg0.anIntArray2783[i];
				anIntArray2785[i] = arg0.anIntArray2785[i];
				anIntArray2796[i] = arg0.anIntArray2796[i];
			}
			anIntArray2805 = new int[anInt2794];
			if (arg0.anIntArray2805 == null) {
				for (int i = 0; i < anInt2794; i++)
					anIntArray2805[i] = 0;
			} else {
				for (int i = 0; i < anInt2794; i++)
					anIntArray2805[i] = arg0.anIntArray2805[i];
			}
			aClass35Array2804 = new Class35[anInt2798];
			for (int i = 0; i < anInt2798; i++) {
				Class35 class35 = aClass35Array2804[i] = new Class35();
				Class35 class35_303_ = arg0.aClass35Array2804[i];
				class35.anInt833 = class35_303_.anInt833;
				class35.anInt838 = class35_303_.anInt838;
				class35.anInt852 = class35_303_.anInt852;
				class35.anInt845 = class35_303_.anInt845;
			}
			aClass35Array2790 = arg0.aClass35Array2790;
		} else {
			anIntArray2783 = arg0.anIntArray2783;
			anIntArray2785 = arg0.anIntArray2785;
			anIntArray2796 = arg0.anIntArray2796;
			anIntArray2805 = arg0.anIntArray2805;
		}
		anIntArray2787 = arg0.anIntArray2787;
		anIntArray2791 = arg0.anIntArray2791;
		anIntArray2792 = arg0.anIntArray2792;
		anIntArray2795 = arg0.anIntArray2795;
		anIntArray2778 = arg0.anIntArray2778;
		anInt2803 = arg0.anInt2803;
		anIntArray2779 = arg0.anIntArray2779;
		anIntArray2789 = arg0.anIntArray2789;
		anIntArray2788 = arg0.anIntArray2788;
		anIntArray2806 = arg0.anIntArray2806;
		anIntArray2797 = arg0.anIntArray2797;
		anIntArray2784 = arg0.anIntArray2784;
		anInt2807 = arg0.anInt2807;
	}

	static {
		aClass12_Sub12_Sub11_Sub4_2812 = new Class12_Sub12_Sub11_Sub4();
		anIntArray2820 = new int[10];
		anIntArray2823 = new int[1000];
		anIntArray2824 = Class12_Sub12_Sub7_Sub3.anIntArray2591;
		aBooleanArray2825 = new boolean[4096];
		anIntArray2821 = new int[10];
		aBooleanArray2817 = new boolean[4096];
		anIntArray2822 = new int[12];
		anIntArray2826 = new int[4096];
		anIntArray2829 = Class12_Sub12_Sub7_Sub3.anIntArray2609;
		anIntArray2815 = new int[10];
		anIntArray2828 = new int[1500];
		anIntArray2834 = new int[4096];
		anIntArray2833 = Class12_Sub12_Sub7_Sub3.anIntArray2602;
		anIntArray2827 = new int[128];
		aBoolean2832 = false;
		anInt2818 = 0;
		anIntArray2838 = new int[4096];
		anIntArray2841 = new int[2000];
		anIntArray2837 = new int[4096];
		anIntArray2840 = new int[12];
		anIntArray2831 = Class12_Sub12_Sub7_Sub3.anIntArray2596;
		anIntArray2816 = new int[4096];
		anIntArrayArray2830 = new int[1500][512];
		anIntArray2843 = new int[1];
		anIntArray2845 = new int[2000];
		anInt2839 = 0;
		anInt2835 = 0;
		anIntArrayArray2846 = new int[12][2000];
		anIntArray2842 = new int[4096];
		int i = 0;
		int i_304_ = 248;
		while (i < 9)
			anIntArray2827[i++] = 255;
		while (i < 16) {
			anIntArray2827[i++] = i_304_;
			i_304_ -= 8;
		}
		while (i < 32) {
			anIntArray2827[i++] = i_304_;
			i_304_ -= 4;
		}
		while (i < 64) {
			anIntArray2827[i++] = i_304_;
			i_304_ -= 2;
		}
		while (i < 128)
			anIntArray2827[i++] = i_304_--;
	}
}
