package com.jagex;/* com.jagex.Class12_Sub12_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.io.RSSocket;

public class Class12_Sub12_Sub4 extends Class12_Sub12 {
	public int anInt2187;
	public int anInt2188;
	public static int anInt2189;
	public static RSString aClass59_2190;
	public static int anInt2191;
	public int[] anIntArray2192;
	public static int anInt2193;
	public int anInt2194 = 5;
	public static int anInt2195;
	public static RSString aClass59_2196;
	public static RSString aClass59_2197;
	public int anInt2198;
	public static int anInt2199;
	public int anInt2200;
	public int anInt2201 = 99;
	public static RSString aClass59_2202;
	public static Class62 aClass62_2203;
	public static byte[][][] aByteArrayArrayArray2204;
	public static int anInt2205 = 0;
	public static int[][] anIntArrayArray2206;
	public int[] anIntArray2207;
	public int[] anIntArray2208;
	public static int[] anIntArray2209;
	public static Class12_Sub12_Sub7_Sub1 aClass12_Sub12_Sub7_Sub1_2210;
	public static RSString aClass59_2211;
	public static int anInt2212;
	public int anInt2213 = 2;
	public static byte[][] aByteArrayArray2214;
	public int[] anIntArray2215;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_2216;
	public static RSSocket aClass24_2217;
	public int anInt2218;
	public static RSString aClass59_2219;
	public static int[] anIntArray2220;
	public static int anInt2221;
	public static int[] anIntArray2222;
	public static int anInt2223;
	public static int anInt2224;
	public static int anInt2225;
	public static int anInt2226;
	public static int[] anIntArray2227;
	public static int anInt2228;
	public boolean aBoolean2229;
	public static int anInt2230;

	public static void method304(int arg0) {
		Class12_Sub12_Sub16.aClass27_2553.method675(true);
		anInt2189++;
		if (arg0 != -32536)
			method304(68);
	}

	public Class12_Sub12_Sub11_Sub4 method305(int arg0,
			Class12_Sub12_Sub11_Sub4 arg1, int arg2) {
		try {
			if (arg2 != 16578)
				method310(-99, 53, 39, 72, -96, -108, 6);
			anInt2191++;
			arg0 = anIntArray2207[arg0];
			Class12_Sub12_Sub5 class12_sub12_sub5 = Class28.method684(
					(byte) 120, arg0 >> -871734928);
			arg0 &= 0xffff;
			if (class12_sub12_sub5 == null)
				return arg1.method498(true);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg1
					.method498(!class12_sub12_sub5.method317(true, arg0));
			class12_sub12_sub11_sub4.method495(class12_sub12_sub5, arg0);
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ge.I(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public static void method306(int arg0) {
		try {
			anIntArray2227 = null;
			aClass59_2211 = null;
			aClass59_2196 = null;
			aClass59_2219 = null;
			anIntArray2209 = null;
			anIntArrayArray2206 = null;
			aClass12_Sub12_Sub7_Sub1_2210 = null;
			aClass59_2202 = null;
			if (arg0 == 0) {
				aClass12_Sub12_Sub7_Sub2_2216 = null;
				aClass62_2203 = null;
				anIntArray2222 = null;
				aClass59_2197 = null;
				aByteArrayArrayArray2204 = null;
				aClass24_2217 = null;
				anIntArray2220 = null;
				aClass59_2190 = null;
				aByteArrayArray2214 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ge.H(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method307(boolean arg0,
			Class12_Sub12_Sub11_Sub4 arg1, int arg2, int arg3) {
		try {
			if (arg0 != true)
				anIntArray2220 = null;
			arg3 = anIntArray2207[arg3];
			Class12_Sub12_Sub5 class12_sub12_sub5 = Class28.method684(
					(byte) 127, arg3 >> 240785296);
			arg3 &= 0xffff;
			anInt2212++;
			if (class12_sub12_sub5 == null)
				return arg1.method498(true);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg1
					.method498(!class12_sub12_sub5.method317(arg0, arg3));
			arg2 &= 0x3;
			if ((arg2 ^ 0xffffffff) == -2)
				class12_sub12_sub11_sub4.method472();
			else if ((arg2 ^ 0xffffffff) == -3)
				class12_sub12_sub11_sub4.method482();
			else if ((arg2 ^ 0xffffffff) == -4)
				class12_sub12_sub11_sub4.method473();
			class12_sub12_sub11_sub4.method495(class12_sub12_sub5, arg3);
			if (arg2 == 1)
				class12_sub12_sub11_sub4.method473();
			else if ((arg2 ^ 0xffffffff) == -3)
				class12_sub12_sub11_sub4.method482();
			else if (arg2 == 3)
				class12_sub12_sub11_sub4.method472();
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ge.F(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public void method308(int arg0, int arg1, Buffer arg2) {
		if ((arg1 ^ 0xffffffff) == -2) {
			int i = arg2.readUByte();
			anIntArray2215 = new int[i];
			for (int i_0_ = 0; i > i_0_; i_0_++)
				anIntArray2215[i_0_] = arg2.readShortBE();
			anIntArray2207 = new int[i];
			for (int i_1_ = 0; (i ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
				anIntArray2207[i_1_] = arg2.readShortBE();
			for (int i_2_ = 0; i_2_ < i; i_2_++)
				anIntArray2207[i_2_] = ((arg2.readShortBE() << -740610096) + anIntArray2207[i_2_]);
		} else if (arg1 == 2)
			anInt2200 = arg2.readShortBE();
		else if ((arg1 ^ 0xffffffff) == -4) {
			int i = arg2.readUByte();
			anIntArray2192 = new int[i - -1];
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_++)
				anIntArray2192[i_3_] = arg2.readUByte();
			anIntArray2192[i] = 9999999;
		} else if ((arg1 ^ 0xffffffff) == -5)
			aBoolean2229 = true;
		else if ((arg1 ^ 0xffffffff) != -6) {
			if (arg1 != 6) {
				if ((arg1 ^ 0xffffffff) != -8) {
					if ((arg1 ^ 0xffffffff) != -9) {
						if ((arg1 ^ 0xffffffff) == -10)
							anInt2188 = arg2.readUByte();
						else if (arg1 != 10) {
							if ((arg1 ^ 0xffffffff) == -12)
								anInt2213 = arg2.readUByte();
							else if ((arg1 ^ 0xffffffff) == -13) {
								int i = arg2.readUByte();
								anIntArray2208 = new int[i];
								for (int i_4_ = 0; i_4_ < i; i_4_++)
									anIntArray2208[i_4_] = arg2.readShortBE();
								for (int i_5_ = 0; i_5_ < i; i_5_++)
									anIntArray2208[i_5_] = (((arg2
											.readShortBE()) << 1719416720) - -anIntArray2208[i_5_]);
							}
						} else
							anInt2198 = arg2.readUByte();
					} else
						anInt2201 = arg2.readUByte();
				} else
					anInt2218 = arg2.readShortBE();
			} else
				anInt2187 = arg2.readShortBE();
		} else
			anInt2194 = arg2.readUByte();
		anInt2223++;
		if (arg0 != 7744)
			method307(false, null, 35, 36);
	}

	public Class12_Sub12_Sub11_Sub4 method309(int arg0,
			Class12_Sub12_Sub11_Sub4 arg1, int arg2, int arg3,
			Class12_Sub12_Sub4 arg4) {
		try {
			arg0 = anIntArray2207[arg0];
			anInt2199++;
			Class12_Sub12_Sub5 class12_sub12_sub5 = Class28.method684(
					(byte) 97, arg0 >> arg3);
			arg0 &= 0xffff;
			if (class12_sub12_sub5 == null)
				return arg4.method305(arg2, arg1, arg3 ^ 0x59c3b0d2);
			arg2 = arg4.anIntArray2207[arg2];
			Class12_Sub12_Sub5 class12_sub12_sub5_6_ = Class28.method684(
					(byte) 118, arg2 >> 912699536);
			arg2 &= 0xffff;
			if (class12_sub12_sub5_6_ == null) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg1
						.method498(!class12_sub12_sub5.method317(true, arg0));
				class12_sub12_sub11_sub4.method495(class12_sub12_sub5, arg0);
				return class12_sub12_sub11_sub4;
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg1
					.method498(!class12_sub12_sub5.method317(true, arg0)
							& !class12_sub12_sub5_6_.method317(true, arg2));
			class12_sub12_sub11_sub4.method490(class12_sub12_sub5, arg0,
					class12_sub12_sub5_6_, arg2, anIntArray2192);
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ge.G(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public static int method310(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			arg3 &= 0x3;
			if ((arg4 & 0x1) == 1) {
				int i = arg0;
				arg0 = arg5;
				arg5 = i;
			}
			anInt2226++;
			if (arg3 == 0)
				return arg6;
			if ((arg3 ^ 0xffffffff) == -2)
				return arg1;
			if (arg2 == (arg3 ^ 0xffffffff))
				return 7 - arg6 - (arg0 - 1);
			return 7 + -arg1 - (-1 + arg5);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ge.L(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public void method311(Buffer arg0, int arg1) {
		for (;;) {
			int i = arg0.readUByte();
			if (i == 0)
				break;
			method308(7744, i, arg0);
		}
		anInt2221++;
		if (arg1 < 102)
			aClass12_Sub12_Sub7_Sub2_2216 = null;
	}

	public Class12_Sub12_Sub11_Sub4 method312(Class12_Sub12_Sub11_Sub4 arg0,
			int arg1, int arg2) {
		try {
			anInt2225++;
			int i = anIntArray2207[arg1];
			Class12_Sub12_Sub5 class12_sub12_sub5 = Class28.method684(
					(byte) 101, i >> 2122625040);
			i &= 0xffff;
			if (class12_sub12_sub5 == null)
				return arg0.method498(true);
			int i_7_ = 0;
			int i_8_ = -81 % ((-28 - arg2) / 55);
			Class12_Sub12_Sub5 class12_sub12_sub5_9_ = null;
			if (anIntArray2208 != null && arg1 < anIntArray2208.length) {
				i_7_ = anIntArray2208[arg1];
				class12_sub12_sub5_9_ = Class28.method684((byte) 127,
						i_7_ >> 1420360880);
				i_7_ &= 0xffff;
			}
			if (class12_sub12_sub5_9_ == null || i_7_ == 65535) {
				Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg0
						.method498(!class12_sub12_sub5.method317(true, i));
				class12_sub12_sub11_sub4.method495(class12_sub12_sub5, i);
				return class12_sub12_sub11_sub4;
			}
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg0
					.method498(!class12_sub12_sub5.method317(true, i)
							& !class12_sub12_sub5_9_.method317(true, i_7_));
			class12_sub12_sub11_sub4.method495(class12_sub12_sub5, i);
			class12_sub12_sub11_sub4.method495(class12_sub12_sub5_9_, i_7_);
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ge.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public void method313(int arg0) {
		try {
			if ((anInt2198 ^ 0xffffffff) == 0) {
				if (anIntArray2192 == null)
					anInt2198 = 0;
				else
					anInt2198 = 2;
			}
			int i = 105 / ((arg0 - -59) / 48);
			if ((anInt2188 ^ 0xffffffff) == 0) {
				if (anIntArray2192 != null)
					anInt2188 = 2;
				else
					anInt2188 = 0;
			}
			anInt2224++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ge.A(" + arg0 + ')');
		}
	}

	public Class12_Sub12_Sub11_Sub4 method314(Class12_Sub12_Sub11_Sub4 arg0,
			byte arg1, int arg2) {
		try {
			arg2 = anIntArray2207[arg2];
			anInt2195++;
			Class12_Sub12_Sub5 class12_sub12_sub5 = Class28.method684(
					(byte) 118, arg2 >> -1119525808);
			if (arg1 <= 16)
				aByteArrayArrayArray2204 = null;
			arg2 &= 0xffff;
			if (class12_sub12_sub5 == null)
				return arg0.method475(true);
			Class12_Sub12_Sub11_Sub4 class12_sub12_sub11_sub4 = arg0
					.method475(!class12_sub12_sub5.method317(true, arg2));
			class12_sub12_sub11_sub4.method495(class12_sub12_sub5, arg2);
			return class12_sub12_sub11_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ge.K("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static Class12_Sub12_Sub7_Sub2 method315(int arg0, int arg1,
			Class26 arg2) {
		try {
			anInt2193++;
			if (arg1 > -116)
				method315(94, 90, null);
			if (!Class12_Sub6.method185(13530, arg0, arg2))
				return null;
			return Class12_Sub2.method150(0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ge.E(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class12_Sub12_Sub4() {
		anInt2188 = -1;
		anInt2187 = -1;
		anInt2200 = -1;
		anInt2218 = -1;
		anInt2198 = -1;
		aBoolean2229 = false;
	}

	static {
		aClass59_2197 = Class55.method898("Unexpected loginserver response)3",
				-10983);
		aClass59_2202 = Class55.method898("Loading sprites )2 ", -10983);
		aByteArrayArray2214 = new byte[250][];
		anIntArray2209 = new int[500];
		aClass59_2211 = aClass59_2197;
		anIntArray2222 = new int[128];
		aClass59_2219 = Class55.method898("Message", -10983);
		aClass59_2196 = aClass59_2202;
		aClass59_2190 = aClass59_2219;
		anInt2228 = 0;
		anInt2230 = 0;
		anIntArray2220 = (new int[] { 0, 0, 8, 0, 0, 0, -2, 0, 0, 0, 4, 6, 0,
				6, 0, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 4, 0, 2, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0,
				-1, 4, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0,
				0, -2, 5, 0, 15, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 4, 0,
				0, 0, 6, 0, 0, 0, -1, 0, 0, 1, 0, -2, 8, 10, 0, 0, 0, 0, 0, 0,
				14, 0, 2, -2, 0, 0, 2, 0, 0, 6, 0, 1, 0, 0, 6, 0, 0, 0, 5, 0,
				0, 1, 4, 0, 0, 1, 0, 3, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 10, 0,
				0, 0, 0, 0, 0, 0, 5, -2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4,
				4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 3,
				0, 0, 0, -1, 8, 0, 0, -2, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0,
				6, 0, 0, 6, 3, 0, 0, 0, 0, 6, 0, 7, 0, 0, 2, 6, 1, -2 });
		anIntArrayArray2206 = (new int[][] {
				{ 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433,
						2983, 54193 },
				{ 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
						10153, 56621, 4783, 1341, 16578, 35003, 25239 },
				{ 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430,
						24094, 10153, 56621, 4783, 1341, 16578, 35003 },
				{ 4626, 11146, 6439, 12, 4758, 10270 },
				{ 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } });
		anIntArray2227 = new int[200];
	}
}
