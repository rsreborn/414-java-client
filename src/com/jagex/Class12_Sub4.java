package com.jagex;/* com.jagex.Class12_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class12_Sub4 extends Class12 {
	public static int anInt1663;
	public static int anInt1664;
	public int[] anIntArray1665;
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_1666;
	public int anInt1667;
	public static RSString aClass59_1669;
	public int[][] anIntArrayArray1670;
	public static boolean aBoolean1671;
	public static RSString aClass59_1672;
	public static int anInt1673;
	public static int anInt1674;
	public static int anInt1675 = 0;
	public int anInt1676;
	public static boolean aBoolean1677 = false;
	public static int anInt1678;
	public static int anInt1679;

	public static void method158(int arg0, int arg1) {
		try {
			anInt1664++;
			if (Class12_Sub12_Sub11_Sub3.method464(17754)) {
				if (arg1 != 17324)
					method158(-69, -46);
				if (Class49.aBoolean1158)
					Game.anInt1566 = arg0;
				else
					Class32.method702(true, arg0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "gd.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method159(boolean arg0) {
		try {
			anInt1663++;
			Class8.aBoolean193 = arg0;
			Class12_Sub12_Sub11_Sub3.method466((byte) 117);
			if (Class35.anInt860 == -1) {
				if (Class62_Sub2.anIntArray1907[Class15.anInt400] != -1) {
					boolean bool = Class12_Sub12_Sub5.method322(0, 190, -1, 1,
							0, (Class62_Sub2.anIntArray1907[Class15.anInt400]),
							(byte) 99, 261, 0);
					if (!bool)
						Class49.aBoolean1146 = true;
				}
			} else {
				boolean bool = Class12_Sub12_Sub5.method322(0, 190, -1, 1, 0,
						Class35.anInt860, (byte) 99, 261, 0);
				if (!bool)
					Class49.aBoolean1146 = true;
			}
			if (Class51.aBoolean1202 && (Class9.anInt212 ^ 0xffffffff) == -2)
				Class51.method814((byte) 77);
			Class20.method603(-18443);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "gd.C(" + arg0 + ')');
		}
	}

	public static int method160(int arg0) {
		try {
			anInt1678++;
			if (arg0 != 0)
				return -95;
			int i = Class26.method658(Class10.anInt250, -6, RSString.anInt1504,
					Class20.anInt464);
			if ((-Class57.anInt1339 + i ^ 0xffffffff) > -801
					&& ((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[RSString.anInt1504][Class10.anInt250 >> 1004126663][Class20.anInt464 >> -1448853721]) & 0x4) != 0)
				return RSString.anInt1504;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "gd.A(" + arg0 + ')');
		}
	}

	public static void method161(boolean arg0) {
		try {
			aClass59_1672 = null;
			Game.gameServerSignlinkNode = null;
			aClass12_Sub12_Sub7_Sub2_1666 = null;
			if (arg0 != true)
				method158(-127, -128);
			aClass59_1669 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "gd.D(" + arg0 + ')');
		}
	}

	public static void method162(Class12_Sub12_Sub11_Sub2 arg0, int arg1) {
		try {
			if (Class64_Sub2.anInt1968 == arg0.anInt2721
					|| (arg0.anInt2734 ^ 0xffffffff) == 0
					|| arg0.anInt2719 != 0
					|| ((arg0.anInt2687 + 1 ^ 0xffffffff) < ((Class5.method74(
							9, arg0.anInt2734).anIntArray2215[arg0.anInt2726]) ^ 0xffffffff))) {
				int i = -arg0.anInt2667 + Class64_Sub2.anInt1968;
				int i_0_ = -arg0.anInt2667 + arg0.anInt2721;
				int i_1_ = arg0.anInt2727 * 64 + arg0.anInt2705 * 128;
				int i_2_ = 64 * arg0.anInt2727 + 128 * arg0.anInt2686;
				int i_3_ = arg0.anInt2727 * 64 + 128 * arg0.anInt2682;
				arg0.anInt2691 = (i_3_ * i + i_1_ * (-i + i_0_)) / i_0_;
				int i_4_ = arg0.anInt2727 * 64 + 128 * arg0.anInt2728;
				arg0.anInt2683 = (i_4_ * i + (i_0_ - i) * i_2_) / i_0_;
			}
			arg0.anInt2670 = 0;
			anInt1674++;
			if ((arg0.anInt2689 ^ 0xffffffff) == -1)
				arg0.anInt2666 = 1024;
			if ((arg0.anInt2689 ^ 0xffffffff) == -2)
				arg0.anInt2666 = 1536;
			if ((arg0.anInt2689 ^ 0xffffffff) == -3)
				arg0.anInt2666 = 0;
			if ((arg0.anInt2689 ^ 0xffffffff) == -4)
				arg0.anInt2666 = 512;
			int i = -87 % ((40 - arg1) / 60);
			arg0.anInt2680 = arg0.anInt2666;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "gd.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public Class12_Sub4(int arg0, byte[] arg1) {
		try {
			anInt1667 = arg0;
			Buffer class12_sub11 = new Buffer(arg1);
			anInt1676 = class12_sub11.readUByte();
			anIntArrayArray1670 = new int[anInt1676][];
			anIntArray1665 = new int[anInt1676];
			for (int i = 0; anInt1676 > i; i++)
				anIntArray1665[i] = class12_sub11.readUByte();
			for (int i = 0; anInt1676 > i; i++)
				anIntArrayArray1670[i] = new int[class12_sub11.readUByte()];
			for (int i = 0; (i ^ 0xffffffff) > (anInt1676 ^ 0xffffffff); i++) {
				for (int i_5_ = 0; i_5_ < anIntArrayArray1670[i].length; i_5_++)
					anIntArrayArray1670[i][i_5_] = class12_sub11
							.readUByte();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("gd.<init>(" + arg0
					+ ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aBoolean1671 = false;
		aClass59_1672 = Class55.method898("and choose the (Wcreate account(W",
				-10983);
		anInt1679 = -1;
		aClass59_1669 = aClass59_1672;
	}
}
