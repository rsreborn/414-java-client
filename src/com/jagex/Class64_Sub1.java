package com.jagex;/* com.jagex.Class64_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.util.Statics;

public abstract class Class64_Sub1 extends Class64 {
	public static int anInt1938;
	public static int anInt1939;
	public static int anInt1940;
	public static int anInt1941;
	public static int anInt1942 = 0;
	public static int anInt1943;
	public static int anInt1945;
	public static int anInt1946;
	public static int anInt1947;
	public static int anInt1948;
	public static RSString aClass59_1949;
	public static RSString aClass59_1950 = Class55.method898(
			"Error connecting to server)3", -10983);
	public static int anInt1951;
	public static int anInt1952;

	public void method983(int arg0, byte arg1, int arg2, long arg3) {
		anInt1940++;
		arg2 = (int) (0.5 + (double) arg2
				* Math.pow(0.1, 5.0E-4 * (double) arg0));
		if (arg1 < 68)
			Game.encryptedLoginBuffer = null;
		if (arg2 != Class9_Sub2.anInt1583) {
			Class9_Sub2.anInt1583 = arg2;
			for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
				int i_0_ = method992(i);
				method984(i + 176, 7, i_0_ >> 2132837767, arg3);
				method984(176 - -i, 39, 0x7f & i_0_, arg3);
			}
		}
	}

	public abstract void method984(int i, int i_1_, int i_2_, long l);

	public boolean method985(int arg0, int arg1, int arg2, long arg3) {
		if ((arg0 & 0xf0) == 176) {
			if (arg1 == 121) {
				method984(arg0, arg1, arg2, arg3);
				int i = arg0 & 0xf;
				Class29.anIntArray703[i] = 12800;
				int i_3_ = method992(i);
				method984(arg0, 7, i_3_ >> 7, arg3);
				method984(arg0, 39, i_3_ & 0x7f, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				int i = arg0 & 0xf;
				if (arg1 == 7)
					Class29.anIntArray703[i] = (Class29.anIntArray703[i] & 0x7f)
							+ (arg2 << 7);
				else
					Class29.anIntArray703[i] = (Class29.anIntArray703[i] & 0x3f80)
							+ arg2;
				int i_4_ = method992(i);
				method984(arg0, 7, i_4_ >> 7, arg3);
				method984(arg0, 39, i_4_ & 0x7f, arg3);
				return true;
			}
		}
		return false;
	}

	public void method986(long arg0, int arg1) {
		try {
			anInt1939++;
			for (int i = 0; (i ^ 0xffffffff) > -17; i++)
				method984(i + 176, 123, 0, arg0);
			for (int i = 0; (i ^ 0xffffffff) > -17; i++)
				method984(176 - -i, 120, 0, arg0);
			if (arg1 != 127)
				aClass59_1949 = null;
			for (int i = 0; (i ^ 0xffffffff) > -17; i++)
				method984(176 + i, 121, 0, arg0);
			for (int i = 0; i < 16; i++)
				method984(i + 176, 0, 0, arg0);
			for (int i = 0; (i ^ 0xffffffff) > -17; i++)
				method984(176 + i, 32, 0, arg0);
			for (int i = 0; i < 16; i++)
				method984(i + 192, 0, 0, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "id.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static RSString method987(byte arg0, int arg1) {
		try {
			anInt1946++;
			RSString class59 = Class19.method599(arg1, 10);
			if (arg0 >= -22)
				anInt1952 = -95;
			for (int i = -3 + class59.length(); i > 0; i -= 3)
				class59 = Statics.method251((byte) -124, (new RSString[] {
						class59.method937(i, true, 0), Class26.aClass59_614,
						class59.method945(63, i) }));
			if (class59.length() > 8)
				class59 = (Statics.method251(
						(byte) -120,
						(new RSString[] {
								Class12.aClass59_331,
								class59.method937(class59.length() - 8,
										true, 0), RSCanvas.aClass59_51,
								Class49.aClass59_1165, class59,
								Class32.aClass59_794 })));
			else if (class59.length() > 4)
				class59 = (Statics.method251(
						(byte) -54,
						(new RSString[] {
								Class23.aClass59_508,
								class59.method937(-4 + class59.length(),
										true, 0), Class12_Sub7.aClass59_1725,
								Class49.aClass59_1165, class59,
								Class32.aClass59_794 })));
			return Statics.method251((byte) -36, (new RSString[] {
					Class14.aClass59_371, class59 }));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "id.I(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method988(int arg0, long arg1, byte arg2) {
		try {
			if (arg2 == 20) {
				anInt1941++;
				Class9_Sub2.anInt1583 = arg0;
				for (int i = 0; (i ^ 0xffffffff) > -17; i++)
					Class29.anIntArray703[i] = 12800;
				for (int i = 0; i < 16; i++) {
					int i_5_ = method992(i);
					method984(i + 176, 7, i_5_ >> 917162023, arg1);
					method984(176 - -i, 39, 0x7f & i_5_, arg1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("id.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static int method989(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			int i = 30 % ((arg0 - -47) / 49);
			anInt1945++;
			arg1 &= 0x3;
			if ((arg3 & 0x1) == 1) {
				int i_6_ = arg6;
				arg6 = arg5;
				arg5 = i_6_;
			}
			if ((arg1 ^ 0xffffffff) == -1)
				return arg2;
			if (arg1 == 1)
				return -arg4 + 7 - (-1 + arg6);
			if ((arg1 ^ 0xffffffff) == -3)
				return 1 + (-arg5 + -arg2 + 7);
			return arg4;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("id.E(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	public static void method990(int arg0) {
		do {
			try {
				aClass59_1950 = null;
				aClass59_1949 = null;
				Game.encryptedLoginBuffer = null;
				if (arg0 == 29250)
					break;
				method991(true);
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "id.H(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public static void method991(boolean arg0) {
		do {
			try {
				Class9_Sub2.anInt1599++;
				Game.outBuffer.writePacket(101);
				anInt1943++;
				if (Class35.anInt860 != -1) {
					Class62.method958(-62, Class35.anInt860);
					Class12_Sub12_Sub16.aBoolean2559 = false;
					Class49.aBoolean1146 = true;
					Class35.anInt860 = -1;
					Class12_Sub2.aBoolean1641 = true;
				}
				if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) != 0) {
					Class62.method958(-102, Class12_Sub12_Sub12.anInt2407);
					Class12_Sub12_Sub16.aBoolean2559 = false;
					Class8.aBoolean182 = true;
					Class12_Sub12_Sub12.anInt2407 = -1;
				}
				if (arg0 != true)
					method992(-111);
				if (Class31.anInt756 != -1) {
					Class62.method958(-92, Class31.anInt756);
					Class31.anInt756 = -1;
					Class29.method686((byte) 67, 30);
				}
				if (Class4.anInt128 != -1) {
					Class62.method958(-71, Class4.anInt128);
					Class4.anInt128 = -1;
				}
				if ((Class13.anInt343 ^ 0xffffffff) == 0)
					break;
				Class62.method958(-119, Class13.anInt343);
				Class13.anInt343 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "id.D(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public static int method992(int arg0) {
		int i = Class29.anIntArray703[arg0];
		i = (i * Class9_Sub2.anInt1583 >> 8) * i;
		return (int) (Math.sqrt((double) i) + 0.5);
	}

	static {
		aClass59_1949 = aClass59_1950;
		anInt1951 = 10;
		anInt1948 = -1;
	}
}
