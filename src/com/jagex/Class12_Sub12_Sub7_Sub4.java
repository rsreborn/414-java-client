package com.jagex;/* com.jagex.Class12_Sub12_Sub7_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class12_Sub12_Sub7_Sub4 extends Class12_Sub12_Sub7 {
	public int[] anIntArray2610;
	public static RSString[] aClass59Array2611;
	public static RSString aClass59_2612;
	public int anInt2613 = 0;
	public Random aRandom2614;
	public static RSString aClass59_2615 = Class55.method898("yel", -10983);
	public static RSString aClass59_2616;
	public static RSString aClass59_2617;
	public static RSString aClass59_2618 = Class55.method898("bla", -10983);
	public static RSString aClass59_2619;
	public static RSString aClass59_2620;
	public static RSString aClass59_2621;
	public static RSString aClass59_2622;
	public static RSString aClass59_2623;
	public static RSString aClass59_2624;
	public static RSString aClass59_2625;
	public static RSString aClass59_2626;
	public static RSString aClass59_2627;
	public static RSString aClass59_2628;
	public static RSString aClass59_2629;
	public byte[][] aByteArrayArray2630 = new byte[256][];
	public static RSString aClass59_2631;
	public int[] anIntArray2632;
	public static RSString aClass59_2633;
	public int[] anIntArray2634;
	public int anInt2635;
	public boolean aBoolean2636;
	public int anInt2637;

	public void method388(RSString arg0, int arg1, int arg2, int arg3,
						  boolean arg4, int arg5) {
		arg0 = arg0.method935(false);
		int i = 0;
		for (int i_0_ = 0; i_0_ < arg0.length(); i_0_++) {
			if (arg0.method927(true, i_0_) == 32)
				i++;
		}
		int i_1_ = 0;
		int i_2_ = 0;
		if (i > 0)
			i_1_ = (arg5 - method393(arg0)) * 256 / i;
		aBoolean2636 = false;
		int i_3_ = arg1;
		if (arg0 != null) {
			arg2 -= anInt2613;
			for (int i_4_ = 0; i_4_ < arg0.anInt1480; i_4_++) {
				if (arg0.chars[i_4_] == 64
						&& i_4_ + 4 < arg0.anInt1480
						&& arg0.chars[i_4_ + 4] == 64) {
					int i_5_ = method399(arg0.method937(i_4_ + 4, true,
							i_4_ + 1));
					if (i_5_ != -1)
						arg3 = i_5_;
					i_4_ += 4;
				} else {
					int i_6_ = arg0.chars[i_4_] & 0xff;
					if (i_6_ != 32) {
						if (arg4)
							method397(aByteArrayArray2630[i_6_], arg1 + 1, arg2
									+ anIntArray2610[i_6_] + 1,
									anIntArray2632[i_6_], anIntArray2634[i_6_],
									0);
						method397(aByteArrayArray2630[i_6_], arg1, arg2
								+ anIntArray2610[i_6_], anIntArray2632[i_6_],
								anIntArray2634[i_6_], arg3);
					}
					arg1 += anIntArray2632[i_6_];
					if (i_6_ == 32) {
						i_2_ += i_1_;
						arg1 += i_2_ / 256;
						i_2_ &= 0xff;
					}
				}
			}
			if (aBoolean2636)
				Class12_Sub12_Sub7.method343(i_3_, arg2
						+ (int) ((double) anInt2613 * 0.7), arg1 - i_3_,
						8388608);
		}
	}

	public void method389(RSString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method401(arg0) / 2;
			arg2 -= anInt2613;
			for (int i = 0; i < arg0.length(); i++) {
				int i_7_ = arg0.chars[i] & 0xff;
				if (i_7_ != 32)
					method397(
							aByteArrayArray2630[i_7_],
							arg1
									+ (int) (Math.sin((double) i / 5.0
											+ (double) arg4 / 5.0) * 5.0),
							(arg2 + anIntArray2610[i_7_] + (int) (Math
									.sin((double) i / 3.0 + (double) arg4 / 5.0) * 5.0)),
							anIntArray2632[i_7_], anIntArray2634[i_7_], arg3);
				arg1 += anIntArray2632[i_7_];
			}
		}
	}

	public static void method390() {
		aClass59_2627 = null;
		aClass59_2626 = null;
		aClass59_2621 = null;
		aClass59_2615 = null;
		aClass59_2619 = null;
		aClass59_2633 = null;
		aClass59_2612 = null;
		aClass59_2618 = null;
		aClass59_2620 = null;
		aClass59_2623 = null;
		aClass59_2622 = null;
		aClass59_2624 = null;
		aClass59_2631 = null;
		aClass59_2617 = null;
		aClass59_2628 = null;
		aClass59_2616 = null;
		aClass59_2629 = null;
		aClass59_2625 = null;
		aClass59Array2611 = null;
	}

	public void method391(int[] arg0, byte[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int i_8_ = -arg6; i_8_ < 0; i_8_++) {
			for (int i_9_ = i; i_9_ < 0; i_9_++) {
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			for (int i_10_ = arg5; i_10_ < 0; i_10_++) {
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method392(RSString arg0, int arg1, int arg2, int arg3, int arg4,
						  int arg5) {
		if (arg0 != null) {
			double d = 7.0 - (double) arg5 / 8.0;
			if (d < 0.0)
				d = 0.0;
			arg1 -= method401(arg0) / 2;
			arg2 -= anInt2613;
			for (int i = 0; i < arg0.length(); i++) {
				int i_11_ = arg0.chars[i] & 0xff;
				if (i_11_ != 32)
					method397(
							aByteArrayArray2630[i_11_],
							arg1,
							(arg2 + anIntArray2610[i_11_] + (int) (Math
									.sin((double) i / 1.5 + (double) arg4) * d)),
							anIntArray2632[i_11_], anIntArray2634[i_11_], arg3);
				arg1 += anIntArray2632[i_11_];
			}
		}
	}

	public int method393(RSString arg0) {
		if (arg0 == null)
			return 0;
		int i = 0;
		for (int i_12_ = 0; i_12_ < arg0.anInt1480; i_12_++) {
			if (arg0.chars[i_12_] == 64 && i_12_ + 4 < arg0.anInt1480
					&& arg0.chars[i_12_ + 4] == 64)
				i_12_ += 4;
			else
				i += anIntArray2632[arg0.chars[i_12_] & 0xff];
		}
		return i;
	}

	public void method394(byte[] arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
		int i = arg1 + arg2 * Class12_Sub12_Sub7.anInt2282;
		int i_13_ = Class12_Sub12_Sub7.anInt2282 - arg3;
		int i_14_ = 0;
		int i_15_ = 0;
		if (arg2 < Class12_Sub12_Sub7.anInt2279) {
			int i_16_ = Class12_Sub12_Sub7.anInt2279 - arg2;
			arg4 -= i_16_;
			arg2 = Class12_Sub12_Sub7.anInt2279;
			i_15_ += i_16_ * arg3;
			i += i_16_ * Class12_Sub12_Sub7.anInt2282;
		}
		if (arg2 + arg4 > Class12_Sub12_Sub7.anInt2276)
			arg4 -= arg2 + arg4 - Class12_Sub12_Sub7.anInt2276;
		if (arg1 < Class12_Sub12_Sub7.anInt2280) {
			int i_17_ = Class12_Sub12_Sub7.anInt2280 - arg1;
			arg3 -= i_17_;
			arg1 = Class12_Sub12_Sub7.anInt2280;
			i_15_ += i_17_;
			i += i_17_;
			i_14_ += i_17_;
			i_13_ += i_17_;
		}
		if (arg1 + arg3 > Class12_Sub12_Sub7.anInt2278) {
			int i_18_ = arg1 + arg3 - Class12_Sub12_Sub7.anInt2278;
			arg3 -= i_18_;
			i_14_ += i_18_;
			i_13_ += i_18_;
		}
		if (arg3 > 0 && arg4 > 0)
			method405(Class12_Sub12_Sub7.anIntArray2281, arg0, arg5, i_15_, i,
					arg3, arg4, i_13_, i_14_, arg6);
	}

	public void method395(RSString arg0, int arg1, int arg2, int arg3,
						  boolean arg4) {
		method406(arg0, arg1 - method393(arg0) / 2, arg2, arg3, arg4);
	}

	public void method396(RSString arg0, int arg1, int arg2, int arg3) {
		method400(arg0, arg1 - method401(arg0) / 2, arg2, arg3);
	}

	public void method397(byte[] arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		int i = arg1 + arg2 * Class12_Sub12_Sub7.anInt2282;
		int i_19_ = Class12_Sub12_Sub7.anInt2282 - arg3;
		int i_20_ = 0;
		int i_21_ = 0;
		if (arg2 < Class12_Sub12_Sub7.anInt2279) {
			int i_22_ = Class12_Sub12_Sub7.anInt2279 - arg2;
			arg4 -= i_22_;
			arg2 = Class12_Sub12_Sub7.anInt2279;
			i_21_ += i_22_ * arg3;
			i += i_22_ * Class12_Sub12_Sub7.anInt2282;
		}
		if (arg2 + arg4 > Class12_Sub12_Sub7.anInt2276)
			arg4 -= arg2 + arg4 - Class12_Sub12_Sub7.anInt2276;
		if (arg1 < Class12_Sub12_Sub7.anInt2280) {
			int i_23_ = Class12_Sub12_Sub7.anInt2280 - arg1;
			arg3 -= i_23_;
			arg1 = Class12_Sub12_Sub7.anInt2280;
			i_21_ += i_23_;
			i += i_23_;
			i_20_ += i_23_;
			i_19_ += i_23_;
		}
		if (arg1 + arg3 > Class12_Sub12_Sub7.anInt2278) {
			int i_24_ = arg1 + arg3 - Class12_Sub12_Sub7.anInt2278;
			arg3 -= i_24_;
			i_20_ += i_24_;
			i_19_ += i_24_;
		}
		if (arg3 > 0 && arg4 > 0)
			method391(Class12_Sub12_Sub7.anIntArray2281, arg0, arg5, i_21_, i,
					arg3, arg4, i_19_, i_20_);
	}

	public void method398(RSString arg0, int arg1, int arg2, int arg3, int arg4,
						  int arg5, boolean arg6, int arg7, int arg8, int arg9) {
		if (arg0 != null) {
			int i = 0;
			int i_25_ = 0;
			RSString class59 = Class64_Sub2.method996((byte) 63, 100);
			int i_26_ = -1;
			int i_27_ = 0;
			RSString class59_28_ = null;
			if (arg9 == 0)
				arg9 = anInt2637;
			boolean bool = true;
			if (arg4 < anInt2637 + anInt2635 + arg9 && arg4 < arg9 + arg9)
				bool = false;
			int i_29_ = 0;
			int i_30_ = arg0.length();
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
				int i_32_ = arg0.method927(true, i_31_);
				if (i_32_ == 64 && i_31_ + 4 < i_30_
						&& arg0.method927(true, i_31_ + 4) == 64) {
					class59_28_ = arg0.method937(i_31_ + 5, true, i_31_);
					class59.method919((byte) 106, class59_28_);
					i_31_ += 4;
				} else if (i_32_ == 92 && i_31_ + 1 < i_30_
						&& arg0.method927(true, i_31_ + 1) == 110) {
					class59_28_ = null;
					aClass59Array2611[i_29_++] = class59.method937(
							class59.length(), true, i_25_)
							.method935(false);
					i_25_ = class59.length();
					i = 0;
					i_26_ = -1;
					i_31_++;
				} else {
					class59.method924(-123, i_32_);
					i += method404(i_32_);
					if (i_32_ == 32 || i_32_ == 45) {
						i_26_ = class59.length();
						i_27_ = i;
					}
					if (bool && i > arg3 && i_26_ >= 0) {
						aClass59Array2611[i_29_++] = class59.method937(i_26_,
								true, i_25_).method935(false);
						i_25_ = i_26_;
						i_26_ = -1;
						i -= i_27_;
						if (class59_28_ != null && i_25_ > 4) {
							i_25_ -= 5;
							class59.method915(class59_28_, i_25_, true);
						}
					}
				}
			}
			if (class59.length() > i_25_)
				aClass59Array2611[i_29_++] = class59.method937(
						class59.length(), true, i_25_).method935(false);
			if (arg8 == 3 && i_29_ == 1)
				arg8 = 1;
			int i_33_;
			if (arg8 == 0)
				i_33_ = arg2 + anInt2637;
			else if (arg8 == 1)
				i_33_ = arg2 + anInt2637
						+ (arg4 - anInt2637 - anInt2635 - (i_29_ - 1) * arg9)
						/ 2;
			else if (arg8 == 2)
				i_33_ = arg2 + arg4 - anInt2635 - (i_29_ - 1) * arg9;
			else {
				int i_34_ = ((arg4 - anInt2637 - anInt2635 - (i_29_ - 1) * arg9) / (i_29_ + 1));
				if (i_34_ < 0)
					i_34_ = 0;
				i_33_ = arg2 + anInt2637 + i_34_;
				arg9 += i_34_;
			}
			for (int i_35_ = 0; i_35_ < i_29_; i_35_++) {
				if (arg7 == 0)
					method406(aClass59Array2611[i_35_], arg1, i_33_, arg5, arg6);
				else if (arg7 == 1)
					method395(aClass59Array2611[i_35_], arg1 + arg3 / 2, i_33_,
							arg5, arg6);
				else if (arg7 == 2)
					method407(aClass59Array2611[i_35_], arg1 + arg3, i_33_,
							arg5, arg6);
				else if (i_35_ == i_29_ - 1)
					method406(aClass59Array2611[i_35_], arg1, i_33_, arg5, arg6);
				else
					method388(aClass59Array2611[i_35_], arg1, i_33_, arg5,
							arg6, arg3);
				i_33_ += arg9;
			}
		}
	}

	public int method399(RSString arg0) {
		if (arg0.method934(aClass59_2627, 17706))
			return 16711680;
		if (arg0.method934(aClass59_2626, 17706))
			return 65280;
		if (arg0.method934(aClass59_2621, 17706))
			return 255;
		if (arg0.method934(aClass59_2615, 17706))
			return 16776960;
		if (arg0.method934(aClass59_2619, 17706))
			return 65535;
		if (arg0.method934(aClass59_2633, 17706))
			return 16711935;
		if (arg0.method934(aClass59_2612, 17706))
			return 16777215;
		if (arg0.method934(aClass59_2618, 17706))
			return 0;
		if (arg0.method934(aClass59_2620, 17706))
			return 16748608;
		if (arg0.method934(aClass59_2623, 17706))
			return 8388608;
		if (arg0.method934(aClass59_2622, 17706))
			return 128;
		if (arg0.method934(aClass59_2624, 17706))
			return 16756736;
		if (arg0.method934(aClass59_2631, 17706))
			return 16740352;
		if (arg0.method934(aClass59_2617, 17706))
			return 16723968;
		if (arg0.method934(aClass59_2628, 17706))
			return 12648192;
		if (arg0.method934(aClass59_2616, 17706))
			return 8453888;
		if (arg0.method934(aClass59_2629, 17706))
			return 4259584;
		if (arg0.method934(aClass59_2625, 17706))
			aBoolean2636 = true;
		return -1;
	}

	public void method400(RSString arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg2 -= anInt2613;
			for (int i = 0; i < arg0.anInt1480; i++) {
				int i_36_ = arg0.chars[i] & 0xff;
				if (i_36_ != 32)
					method397(aByteArrayArray2630[i_36_], arg1, arg2
							+ anIntArray2610[i_36_], anIntArray2632[i_36_],
							anIntArray2634[i_36_], arg3);
				arg1 += anIntArray2632[i_36_];
			}
		}
	}

	public int method401(RSString arg0) {
		if (arg0 == null)
			return 0;
		int i = 0;
		for (int i_37_ = 0; i_37_ < arg0.anInt1480; i_37_++)
			i += anIntArray2632[arg0.chars[i_37_] & 0xff];
		return i;
	}

	public void method402(RSString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method401(arg0) / 2;
			arg2 -= anInt2613;
			for (int i = 0; i < arg0.anInt1480; i++) {
				int i_38_ = arg0.chars[i] & 0xff;
				if (i_38_ != 32)
					method397(
							aByteArrayArray2630[i_38_],
							arg1,
							(arg2 + anIntArray2610[i_38_] + (int) (Math
									.sin((double) i / 2.0 + (double) arg4 / 5.0) * 5.0)),
							anIntArray2632[i_38_], anIntArray2634[i_38_], arg3);
				arg1 += anIntArray2632[i_38_];
			}
		}
	}

	public void method403(RSString arg0, int arg1, int arg2, int arg3) {
		method400(arg0, arg1 - method401(arg0), arg2, arg3);
	}

	public int method404(int arg0) {
		return anIntArray2632[arg0 & 0xff];
	}

	public void method405(int[] arg0, byte[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg2 = ((arg2 & 0xff00ff) * arg9 & ~0xff00ff)
				+ ((arg2 & 0xff00) * arg9 & 0xff0000) >> 8;
		arg9 = 256 - arg9;
		for (int i = -arg6; i < 0; i++) {
			for (int i_39_ = -arg5; i_39_ < 0; i_39_++) {
				if (arg1[arg3++] != 0) {
					int i_40_ = arg0[arg4];
					arg0[arg4++] = ((((i_40_ & 0xff00ff) * arg9 & ~0xff00ff) + ((i_40_ & 0xff00)
							* arg9 & 0xff0000)) >> 8)
							+ arg2;
				} else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method406(RSString arg0, int arg1, int arg2, int arg3,
						  boolean arg4) {
		aBoolean2636 = false;
		int i = arg1;
		if (arg0 != null) {
			arg2 -= anInt2613;
			for (int i_41_ = 0; i_41_ < arg0.anInt1480; i_41_++) {
				if (arg0.chars[i_41_] == 64
						&& i_41_ + 4 < arg0.anInt1480
						&& arg0.chars[i_41_ + 4] == 64) {
					int i_42_ = method399(arg0.method937(i_41_ + 4, true,
							i_41_ + 1));
					if (i_42_ != -1)
						arg3 = i_42_;
					i_41_ += 4;
				} else {
					int i_43_ = arg0.chars[i_41_] & 0xff;
					if (i_43_ != 32) {
						if (arg4)
							method397(aByteArrayArray2630[i_43_], arg1 + 1,
									arg2 + anIntArray2610[i_43_] + 1,
									anIntArray2632[i_43_],
									anIntArray2634[i_43_], 0);
						method397(aByteArrayArray2630[i_43_], arg1, arg2
								+ anIntArray2610[i_43_], anIntArray2632[i_43_],
								anIntArray2634[i_43_], arg3);
					}
					arg1 += anIntArray2632[i_43_];
				}
			}
			if (aBoolean2636)
				Class12_Sub12_Sub7.method343(i, arg2
						+ (int) ((double) anInt2613 * 0.7), arg1 - i, 8388608);
		}
	}

	public void method407(RSString arg0, int arg1, int arg2, int arg3,
						  boolean arg4) {
		method406(arg0, arg1 - method393(arg0), arg2, arg3, arg4);
	}

	public void method408(RSString arg0, int arg1, int arg2, int arg3,
						  boolean arg4, int arg5) {
		if (arg0 != null) {
			aRandom2614.setSeed((long) arg5);
			int i = 192 + (aRandom2614.nextInt() & 0x1f);
			arg2 -= anInt2613;
			for (int i_44_ = 0; i_44_ < arg0.anInt1480; i_44_++) {
				if (arg0.chars[i_44_] == 64
						&& i_44_ + 4 < arg0.anInt1480
						&& arg0.chars[i_44_ + 4] == 64) {
					int i_45_ = method399(arg0.method937(i_44_ + 4, true,
							i_44_ + 1));
					if (i_45_ != -1)
						arg3 = i_45_;
					i_44_ += 4;
				} else {
					int i_46_ = arg0.chars[i_44_] & 0xff;
					if (i_46_ != 32) {
						if (arg4)
							method394(aByteArrayArray2630[i_46_], arg1 + 1,
									arg2 + anIntArray2610[i_46_] + 1,
									anIntArray2632[i_46_],
									anIntArray2634[i_46_], 0, 192);
						method394(aByteArrayArray2630[i_46_], arg1, arg2
								+ anIntArray2610[i_46_], anIntArray2632[i_46_],
								anIntArray2634[i_46_], arg3, i);
					}
					arg1 += anIntArray2632[i_46_];
					if ((aRandom2614.nextInt() & 0x3) == 0)
						arg1++;
				}
			}
		}
	}

	public Class12_Sub12_Sub7_Sub4(int[] arg0, int[] arg1, int[] arg2,
			int[] arg3, byte[][] arg4) {
		aRandom2614 = new Random();
		aBoolean2636 = false;
		anIntArray2610 = arg0;
		anIntArray2632 = arg1;
		anIntArray2634 = arg2;
		byte i = 0;
		for (int i_47_ = 1; i_47_ < arg3.length; i_47_++) {
			if (arg3[i_47_] == 1)
				i = (byte) i_47_;
		}
		aByteArrayArray2630 = arg4;
		int i_48_ = 2147483647;
		int i_49_ = -2147483648;
		for (int i_50_ = 0; i_50_ < 256; i_50_++) {
			if (anIntArray2610[i_50_] < i_48_)
				i_48_ = anIntArray2610[i_50_];
			if (anIntArray2610[i_50_] + anIntArray2634[i_50_] > i_49_)
				i_49_ = anIntArray2610[i_50_] + anIntArray2634[i_50_];
			byte[] is = aByteArrayArray2630[i_50_];
			int i_51_ = is.length;
			for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
				is[i_52_] = is[i_52_] == i ? (byte) 0 : (byte) 1;
		}
		anInt2613 = anIntArray2610[32] + anIntArray2634[32];
		anInt2637 = anInt2613 - i_48_;
		anInt2635 = i_49_ - anInt2613;
	}

	static {
		aClass59_2612 = Class55.method898("whi", -10983);
		aClass59Array2611 = new RSString[100];
		aClass59_2622 = Class55.method898("dbl", -10983);
		aClass59_2628 = Class55.method898("gr1", -10983);
		aClass59_2619 = Class55.method898("cya", -10983);
		aClass59_2617 = Class55.method898("or3", -10983);
		aClass59_2626 = Class55.method898("gre", -10983);
		aClass59_2620 = Class55.method898("lre", -10983);
		aClass59_2624 = Class55.method898("or1", -10983);
		aClass59_2631 = Class55.method898("or2", -10983);
		aClass59_2621 = Class55.method898("blu", -10983);
		aClass59_2625 = Class55.method898("str", -10983);
		aClass59_2629 = Class55.method898("gr3", -10983);
		aClass59_2633 = Class55.method898("mag", -10983);
		aClass59_2623 = Class55.method898("dre", -10983);
		aClass59_2616 = Class55.method898("gr2", -10983);
		aClass59_2627 = Class55.method898("red", -10983);
	}
}
