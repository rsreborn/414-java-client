package com.jagex;/* com.jagex.Class12_Sub12_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class12_Sub12_Sub7_Sub1 extends Class12_Sub12_Sub7 {
	public int anInt2575;
	public int anInt2576;
	public int anInt2577;
	public int[] anIntArray2578;
	public int anInt2579;
	public int anInt2580;
	public int anInt2581;

	public void method352(int arg0, int arg1) {
		arg0 += anInt2580;
		arg1 += anInt2576;
		int i = arg0 + arg1 * Class12_Sub12_Sub7.anInt2282;
		int i_0_ = 0;
		int i_1_ = anInt2579;
		int i_2_ = anInt2581;
		int i_3_ = Class12_Sub12_Sub7.anInt2282 - i_2_;
		int i_4_ = 0;
		if (arg1 < Class12_Sub12_Sub7.anInt2279) {
			int i_5_ = Class12_Sub12_Sub7.anInt2279 - arg1;
			i_1_ -= i_5_;
			arg1 = Class12_Sub12_Sub7.anInt2279;
			i_0_ += i_5_ * i_2_;
			i += i_5_ * Class12_Sub12_Sub7.anInt2282;
		}
		if (arg1 + i_1_ > Class12_Sub12_Sub7.anInt2276)
			i_1_ -= arg1 + i_1_ - Class12_Sub12_Sub7.anInt2276;
		if (arg0 < Class12_Sub12_Sub7.anInt2280) {
			int i_6_ = Class12_Sub12_Sub7.anInt2280 - arg0;
			i_2_ -= i_6_;
			arg0 = Class12_Sub12_Sub7.anInt2280;
			i_0_ += i_6_;
			i += i_6_;
			i_4_ += i_6_;
			i_3_ += i_6_;
		}
		if (arg0 + i_2_ > Class12_Sub12_Sub7.anInt2278) {
			int i_7_ = arg0 + i_2_ - Class12_Sub12_Sub7.anInt2278;
			i_2_ -= i_7_;
			i_4_ += i_7_;
			i_3_ += i_7_;
		}
		if (i_2_ > 0 && i_1_ > 0)
			method357(Class12_Sub12_Sub7.anIntArray2281, anIntArray2578, 0,
					i_0_, i, i_2_, i_1_, i_3_, i_4_);
	}

	public void method353(Class12_Sub12_Sub7_Sub2 arg0, int arg1, int arg2) {
		arg1 += anInt2580;
		arg2 += anInt2576;
		int i = arg1 + arg2 * Class12_Sub12_Sub7.anInt2282;
		int i_8_ = 0;
		int i_9_ = anInt2579;
		int i_10_ = anInt2581;
		int i_11_ = Class12_Sub12_Sub7.anInt2282 - i_10_;
		int i_12_ = 0;
		if (arg2 < Class12_Sub12_Sub7.anInt2279) {
			int i_13_ = Class12_Sub12_Sub7.anInt2279 - arg2;
			i_9_ -= i_13_;
			arg2 = Class12_Sub12_Sub7.anInt2279;
			i_8_ += i_13_ * i_10_;
			i += i_13_ * Class12_Sub12_Sub7.anInt2282;
		}
		if (arg2 + i_9_ > Class12_Sub12_Sub7.anInt2276)
			i_9_ -= arg2 + i_9_ - Class12_Sub12_Sub7.anInt2276;
		if (arg1 < Class12_Sub12_Sub7.anInt2280) {
			int i_14_ = Class12_Sub12_Sub7.anInt2280 - arg1;
			i_10_ -= i_14_;
			arg1 = Class12_Sub12_Sub7.anInt2280;
			i_8_ += i_14_;
			i += i_14_;
			i_12_ += i_14_;
			i_11_ += i_14_;
		}
		if (arg1 + i_10_ > Class12_Sub12_Sub7.anInt2278) {
			int i_15_ = arg1 + i_10_ - Class12_Sub12_Sub7.anInt2278;
			i_10_ -= i_15_;
			i_12_ += i_15_;
			i_11_ += i_15_;
		}
		if (i_10_ > 0 && i_9_ > 0)
			method361(Class12_Sub12_Sub7.anIntArray2281, anIntArray2578, 0,
					i_8_, i, i_10_, i_9_, i_11_, i_12_, arg0.aByteArray2588);
	}

	public static void method354(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {
		for (int i = -arg5; i < 0; i++) {
			int i_16_ = arg3 + arg4 - 3;
			while (arg3 < i_16_) {
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}
			i_16_ += 3;
			while (arg3 < i_16_)
				arg0[arg3++] = arg1[arg2++];
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	public void method355(int arg0, int arg1) {
		arg0 += anInt2580;
		arg1 += anInt2576;
		int i = arg0 + arg1 * Class12_Sub12_Sub7.anInt2282;
		int i_17_ = 0;
		int i_18_ = anInt2579;
		int i_19_ = anInt2581;
		int i_20_ = Class12_Sub12_Sub7.anInt2282 - i_19_;
		int i_21_ = 0;
		if (arg1 < Class12_Sub12_Sub7.anInt2279) {
			int i_22_ = Class12_Sub12_Sub7.anInt2279 - arg1;
			i_18_ -= i_22_;
			arg1 = Class12_Sub12_Sub7.anInt2279;
			i_17_ += i_22_ * i_19_;
			i += i_22_ * Class12_Sub12_Sub7.anInt2282;
		}
		if (arg1 + i_18_ > Class12_Sub12_Sub7.anInt2276)
			i_18_ -= arg1 + i_18_ - Class12_Sub12_Sub7.anInt2276;
		if (arg0 < Class12_Sub12_Sub7.anInt2280) {
			int i_23_ = Class12_Sub12_Sub7.anInt2280 - arg0;
			i_19_ -= i_23_;
			arg0 = Class12_Sub12_Sub7.anInt2280;
			i_17_ += i_23_;
			i += i_23_;
			i_21_ += i_23_;
			i_20_ += i_23_;
		}
		if (arg0 + i_19_ > Class12_Sub12_Sub7.anInt2278) {
			int i_24_ = arg0 + i_19_ - Class12_Sub12_Sub7.anInt2278;
			i_19_ -= i_24_;
			i_21_ += i_24_;
			i_20_ += i_24_;
		}
		if (i_19_ > 0 && i_18_ > 0)
			method354(Class12_Sub12_Sub7.anIntArray2281, anIntArray2578, i_17_,
					i, i_19_, i_18_, i_20_, i_21_);
	}

	public void method356() {
		Class12_Sub12_Sub7.method345(anIntArray2578, anInt2581, anInt2579);
	}

	public static void method357(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int i_25_ = -arg6; i_25_ < 0; i_25_++) {
			for (int i_26_ = i; i_26_ < 0; i_26_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			for (int i_27_ = arg5; i_27_ < 0; i_27_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method358(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, double arg6, int arg7) {
		try {
			int i = -arg2 / 2;
			int i_28_ = -arg3 / 2;
			int i_29_ = (int) (Math.sin(arg6) * 65536.0);
			int i_30_ = (int) (Math.cos(arg6) * 65536.0);
			i_29_ = i_29_ * arg7 >> 8;
			i_30_ = i_30_ * arg7 >> 8;
			int i_31_ = (arg4 << 16) + (i_28_ * i_29_ + i * i_30_);
			int i_32_ = (arg5 << 16) + (i_28_ * i_30_ - i * i_29_);
			int i_33_ = arg0 + arg1 * Class12_Sub12_Sub7.anInt2282;
			for (arg1 = 0; arg1 < arg3; arg1++) {
				int i_34_ = i_33_;
				int i_35_ = i_31_;
				int i_36_ = i_32_;
				for (arg0 = -arg2; arg0 < 0; arg0++) {
					int i_37_ = (anIntArray2578[(i_35_ >> 16) + (i_36_ >> 16)
							* anInt2581]);
					if (i_37_ != 0)
						Class12_Sub12_Sub7.anIntArray2281[i_34_++] = i_37_;
					else
						i_34_++;
					i_35_ += i_30_;
					i_36_ -= i_29_;
				}
				i_31_ += i_29_;
				i_32_ += i_30_;
				i_33_ += Class12_Sub12_Sub7.anInt2282;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static void method359(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int i = 256 - arg9;
		for (int i_38_ = -arg6; i_38_ < 0; i_38_++) {
			for (int i_39_ = -arg5; i_39_ < 0; i_39_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0) {
					int i_40_ = arg0[arg4];
					arg0[arg4++] = (((arg2 & 0xff00ff) * arg9
							+ (i_40_ & 0xff00ff) * i & ~0xff00ff) + ((arg2 & 0xff00)
							* arg9 + (i_40_ & 0xff00) * i & 0xff0000)) >> 8;
				} else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method360(int arg0, int arg1, int arg2) {
		arg0 += anInt2580;
		arg1 += anInt2576;
		int i = arg0 + arg1 * Class12_Sub12_Sub7.anInt2282;
		int i_41_ = 0;
		int i_42_ = anInt2579;
		int i_43_ = anInt2581;
		int i_44_ = Class12_Sub12_Sub7.anInt2282 - i_43_;
		int i_45_ = 0;
		if (arg1 < Class12_Sub12_Sub7.anInt2279) {
			int i_46_ = Class12_Sub12_Sub7.anInt2279 - arg1;
			i_42_ -= i_46_;
			arg1 = Class12_Sub12_Sub7.anInt2279;
			i_41_ += i_46_ * i_43_;
			i += i_46_ * Class12_Sub12_Sub7.anInt2282;
		}
		if (arg1 + i_42_ > Class12_Sub12_Sub7.anInt2276)
			i_42_ -= arg1 + i_42_ - Class12_Sub12_Sub7.anInt2276;
		if (arg0 < Class12_Sub12_Sub7.anInt2280) {
			int i_47_ = Class12_Sub12_Sub7.anInt2280 - arg0;
			i_43_ -= i_47_;
			arg0 = Class12_Sub12_Sub7.anInt2280;
			i_41_ += i_47_;
			i += i_47_;
			i_45_ += i_47_;
			i_44_ += i_47_;
		}
		if (arg0 + i_43_ > Class12_Sub12_Sub7.anInt2278) {
			int i_48_ = arg0 + i_43_ - Class12_Sub12_Sub7.anInt2278;
			i_43_ -= i_48_;
			i_45_ += i_48_;
			i_44_ += i_48_;
		}
		if (i_43_ > 0 && i_42_ > 0)
			method359(Class12_Sub12_Sub7.anIntArray2281, anIntArray2578, 0,
					i_41_, i, i_43_, i_42_, i_44_, i_45_, arg2);
	}

	public static void method361(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int i_49_ = -arg6; i_49_ < 0; i_49_++) {
			for (int i_50_ = i; i_50_ < 0; i_50_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			for (int i_51_ = arg5; i_51_ < 0; i_51_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method362() {
		if (anInt2581 != anInt2575 || anInt2579 != anInt2577) {
			int[] is = new int[anInt2575 * anInt2577];
			for (int i = 0; i < anInt2579; i++) {
				for (int i_52_ = 0; i_52_ < anInt2581; i_52_++)
					is[(i + anInt2576) * anInt2575 + (i_52_ + anInt2580)] = anIntArray2578[i
							* anInt2581 + i_52_];
			}
			anIntArray2578 = is;
			anInt2581 = anInt2575;
			anInt2579 = anInt2577;
			anInt2580 = 0;
			anInt2576 = 0;
		}
	}

	public void method363(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			int i = -arg2 / 2;
			int i_53_ = -arg3 / 2;
			int i_54_ = (int) (Math.sin((double) arg6 / 326.11) * 65536.0);
			int i_55_ = (int) (Math.cos((double) arg6 / 326.11) * 65536.0);
			i_54_ = i_54_ * arg7 >> 8;
			i_55_ = i_55_ * arg7 >> 8;
			int i_56_ = (arg4 << 16) + (i_53_ * i_54_ + i * i_55_);
			int i_57_ = (arg5 << 16) + (i_53_ * i_55_ - i * i_54_);
			int i_58_ = arg0 + arg1 * Class12_Sub12_Sub7.anInt2282;
			for (arg1 = 0; arg1 < arg3; arg1++) {
				int i_59_ = arg8[arg1];
				int i_60_ = i_58_ + i_59_;
				int i_61_ = i_56_ + i_55_ * i_59_;
				int i_62_ = i_57_ - i_54_ * i_59_;
				for (arg0 = -arg9[arg1]; arg0 < 0; arg0++) {
					Class12_Sub12_Sub7.anIntArray2281[i_60_++] = (anIntArray2578[(i_61_ >> 16)
							+ (i_62_ >> 16) * anInt2581]);
					i_61_ += i_55_;
					i_62_ -= i_54_;
				}
				i_56_ += i_54_;
				i_57_ += i_55_;
				i_58_ += Class12_Sub12_Sub7.anInt2282;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method364(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anIntArray2578.length; i++) {
			int i_63_ = anIntArray2578[i];
			if (i_63_ != 0) {
				int i_64_ = i_63_ >> 16 & 0xff;
				i_64_ += arg0;
				if (i_64_ < 1)
					i_64_ = 1;
				else if (i_64_ > 255)
					i_64_ = 255;
				int i_65_ = i_63_ >> 8 & 0xff;
				i_65_ += arg1;
				if (i_65_ < 1)
					i_65_ = 1;
				else if (i_65_ > 255)
					i_65_ = 255;
				int i_66_ = i_63_ & 0xff;
				i_66_ += arg2;
				if (i_66_ < 1)
					i_66_ = 1;
				else if (i_66_ > 255)
					i_66_ = 255;
				anIntArray2578[i] = (i_64_ << 16) + (i_65_ << 8) + i_66_;
			}
		}
	}

	public Class12_Sub12_Sub7_Sub1() {
		/* empty */
	}

	public Class12_Sub12_Sub7_Sub1(int arg0, int arg1) {
		anIntArray2578 = new int[arg0 * arg1];
		anInt2581 = anInt2575 = arg0;
		anInt2579 = anInt2577 = arg1;
		anInt2580 = anInt2576 = 0;
	}

	public Class12_Sub12_Sub7_Sub1(byte[] arg0, Component arg1) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker mediatracker = new MediaTracker(arg1);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			anInt2581 = image.getWidth(arg1);
			anInt2579 = image.getHeight(arg1);
			anInt2575 = anInt2581;
			anInt2577 = anInt2579;
			anInt2580 = 0;
			anInt2576 = 0;
			anIntArray2578 = new int[anInt2581 * anInt2579];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0,
					anInt2581, anInt2579, anIntArray2578, 0, anInt2581);
			pixelgrabber.grabPixels();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}
}
