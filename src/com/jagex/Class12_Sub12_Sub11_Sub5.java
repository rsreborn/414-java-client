package com.jagex;/* com.jagex.Class12_Sub12_Sub11_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class12_Sub12_Sub11_Sub5 extends Class12_Sub12_Sub11 {
	public int anInt2847;
	public static int anInt2848 = 0;
	public int anInt2849;
	public static int anInt2850;
	public static int anInt2851;
	public static RSString aClass59_2852 = Class55.method898("Icons redrawn",
			-10983);
	public static int anInt2853;
	public static int anInt2854;
	public int anInt2855 = 0;
	public static int anInt2856;
	public static Class38 aClass38_2857;
	public static RSString aClass59_2858;
	public static RSString aClass59_2859;
	public static RSString aClass59_2860;
	public static int anInt2861;
	public static RSString aClass59_2862 = Class55.method898(" )2> @cya@",
			-10983);
	public static int anInt2863;
	public static RSString aClass59_2864;
	public int anInt2865;
	public int anInt2866;
	public static int anInt2867;
	public int anInt2868;
	public static int anInt2869;
	public boolean aBoolean2870 = false;
	public Class12_Sub12_Sub4 aClass12_Sub12_Sub4_2871;
	public static RSString aClass59_2872;
	public int anInt2873 = 0;
	public static int anInt2874;
	public static RSString aClass59_2875;
	public int anInt2876;
	public static int anInt2877;
	public static Class62 aClass62_2878;
	public static RSString aClass59_2879;
	public static byte[] aByteArray2880;
	public static RSString aClass59_2881;
	public static int[] anIntArray2882;

	public static Class12_Sub12_Sub15 method502(byte arg0, int arg1) {
		try {
			anInt2856++;
			Class12_Sub12_Sub15 class12_sub12_sub15 = ((Class12_Sub12_Sub15) Class32.aClass27_782
					.method673(124, (long) arg1));
			if (class12_sub12_sub15 != null)
				return class12_sub12_sub15;
			byte[] is = Class12_Sub12_Sub10.aClass26_2370.method631(10, true,
					arg1);
			class12_sub12_sub15 = new Class12_Sub12_Sub15();
			class12_sub12_sub15.anInt2497 = arg1;
			if (is != null)
				class12_sub12_sub15
						.method544(new Buffer(is), (byte) -51);
			class12_sub12_sub15.method546((byte) -123);
			if (class12_sub12_sub15.anInt2483 != -1)
				class12_sub12_sub15.method542(
						method502((byte) 121, class12_sub12_sub15.anInt2483),
						(byte) -113,
						method502((byte) 121, class12_sub12_sub15.anInt2488));
			if (arg0 != 121)
				return null;
			if (!Class57.aBoolean1338 && class12_sub12_sub15.aBoolean2501) {
				class12_sub12_sub15.aClass59_2480 = Class23.aClass59_511;
				class12_sub12_sub15.anInt2520 = 0;
				class12_sub12_sub15.aClass59Array2499 = null;
				class12_sub12_sub15.aClass59Array2500 = null;
			}
			Class32.aClass27_782.method678((byte) 123, class12_sub12_sub15,
					(long) arg1);
			return class12_sub12_sub15;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "td.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method436(int arg0) {
		try {
			anInt2851++;
			if (arg0 <= 60)
				aClass59_2858 = null;
			Class12_Sub12_Sub14 class12_sub12_sub14 = Class30.method695(
					anInt2866, -123);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4;
			if (!aBoolean2870)
				class12_sub12_sub11_sub4 = class12_sub12_sub14.method536(
						(byte) 127, anInt2873);
			else
				class12_sub12_sub11_sub4 = class12_sub12_sub14.method536(
						(byte) 126, -1);
			if (class12_sub12_sub11_sub4 == null)
				return null;
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "td.P(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub2[] method503(int arg0) {
		try {
			if (arg0 != 10)
				method502((byte) 33, -65);
			anInt2867++;
			Class12_Sub12_Sub7_Sub2[] class12_sub12_sub7_sub2s = new Class12_Sub12_Sub7_Sub2[Class12_Sub12.anInt1838];
			for (int i = 0; i < Class12_Sub12.anInt1838; i++) {
				Class12_Sub12_Sub7_Sub2 class12_sub12_sub7_sub2 = (class12_sub12_sub7_sub2s[i] = new Class12_Sub12_Sub7_Sub2());
				class12_sub12_sub7_sub2.anInt2585 = Class1.anInt81;
				class12_sub12_sub7_sub2.anInt2582 = Class12_Sub2.anInt1654;
				class12_sub12_sub7_sub2.anInt2586 = Class57.anIntArray1337[i];
				class12_sub12_sub7_sub2.anInt2584 = Class32.anIntArray778[i];
				class12_sub12_sub7_sub2.anInt2589 = Class55.anIntArray1313[i];
				class12_sub12_sub7_sub2.anInt2583 = Class44.anIntArray1027[i];
				class12_sub12_sub7_sub2.anIntArray2587 = Class15.anIntArray385;
				class12_sub12_sub7_sub2.aByteArray2588 = Class28.aByteArrayArray669[i];
			}
			Class1.method46((byte) 45);
			return class12_sub12_sub7_sub2s;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "td.C(" + arg0 + ')');
		}
	}

	public static void method504(int arg0, int arg1, Class52 arg2, byte[] arg3,
			int arg4, Class10[] arg5) {
		do {
			try {
				Buffer class12_sub11 = new Buffer(arg3);
				anInt2853++;
				int i = -1;
				for (;;) {
					int i_0_ = class12_sub11.method231(false);
					if ((i_0_ ^ 0xffffffff) == -1)
						break;
					i += i_0_;
					int i_1_ = 0;
					for (;;) {
						int i_2_ = class12_sub11.method231(false);
						if ((i_2_ ^ 0xffffffff) == -1)
							break;
						i_1_ += i_2_ + -1;
						int i_3_ = 0x3f & i_1_;
						int i_4_ = i_1_ >> -1696428314 & 0x3f;
						int i_5_ = i_1_ >> -649090644;
						int i_6_ = class12_sub11.readSignedByte(true);
						int i_7_ = i_6_ >> -1837810462;
						int i_8_ = 0x3 & i_6_;
						int i_9_ = i_3_ + arg1;
						int i_10_ = i_4_ + arg4;
						if (i_10_ > 0 && i_9_ > 0 && i_10_ < 103
								&& (i_9_ ^ 0xffffffff) > -104) {
							int i_11_ = i_5_;
							Class10 class10 = null;
							if ((0x2 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][i_10_][i_9_]) ^ 0xffffffff) == -3)
								i_11_--;
							if (i_11_ >= 0)
								class10 = arg5[i_11_];
							RuntimeException_Sub1.method1005(i_10_, 16057,
									class10, i_8_, i, i_5_, arg2, i_7_, i_9_);
						}
					}
				}
				if (arg0 == -2307)
					break;
				method506(31, null);
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, ("td.A(" + arg0 + ','
						+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
						+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
						+ (arg5 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public void method505(int arg0, byte arg1) {
		try {
			anInt2861++;
			if (!aBoolean2870 && arg1 == -85) {
				anInt2855 += arg0;
				while ((aClass12_Sub12_Sub4_2871.anIntArray2215[anInt2873] ^ 0xffffffff) > (anInt2855 ^ 0xffffffff)) {
					anInt2855 -= aClass12_Sub12_Sub4_2871.anIntArray2215[anInt2873];
					anInt2873++;
					if (anInt2873 >= aClass12_Sub12_Sub4_2871.anIntArray2207.length) {
						aBoolean2870 = true;
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "td.F(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static boolean method506(int arg0, RSString arg1) {
		try {
			anInt2863++;
			if (arg1 == null)
				return false;
			for (int i = 0; i < Class7.anInt1540; i++) {
				if (arg1.method920(
						(Class12_Sub12_Sub11_Sub6.aClass59Array2910[i]),
						(byte) -106))
					return true;
			}
			int i = 119 / ((-16 - arg0) / 43);
			if (arg1.method920(
					(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass59_2951),
					(byte) 16))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("td.B(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method507(int arg0) {
		try {
			aClass59_2852 = null;
			aClass59_2860 = null;
			aClass59_2872 = null;
			aClass59_2859 = null;
			aClass59_2858 = null;
			if (arg0 >= -123)
				aClass38_2857 = null;
			anIntArray2882 = null;
			aClass59_2864 = null;
			aClass59_2875 = null;
			aClass59_2862 = null;
			aClass59_2881 = null;
			aByteArray2880 = null;
			aClass59_2879 = null;
			aClass38_2857 = null;
			aClass62_2878 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "td.D(" + arg0 + ')');
		}
	}

	public static int method508(byte arg0) {
		try {
			if (arg0 != 93)
				method508((byte) 49);
			anInt2874++;
			return Class30.anInt745++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "td.G(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub5(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			anInt2866 = arg0;
			anInt2868 = arg4;
			anInt2876 = arg1;
			anInt2849 = arg5 + arg6;
			anInt2847 = arg2;
			anInt2865 = arg3;
			int i = Class30.method695(anInt2866, -123).anInt2449;
			if ((i ^ 0xffffffff) != 0) {
				aBoolean2870 = false;
				aClass12_Sub12_Sub4_2871 = Class5.method74(9, i);
			} else
				aBoolean2870 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("td.<init>(" + arg0
					+ ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ')'));
		}
	}

	static {
		aClass59_2858 = Class55.method898("flash1:", -10983);
		aClass59_2864 = Class55.method898("Drop", -10983);
		aClass59_2860 = aClass59_2864;
		aClass59_2859 = aClass59_2858;
		aClass59_2875 = Class55.method898("Loading wordpack )2 ", -10983);
		aClass59_2872 = aClass59_2875;
		aClass38_2857 = new Class38();
		aByteArray2880 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104,
				105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
				117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55,
				56, 57 };
		anIntArray2882 = new int[50];
		aClass59_2881 = Class55.method898(
				"You are standing in a members)2only area)3", -10983);
		aClass59_2879 = aClass59_2881;
	}
}
