package com.jagex;/* com.jagex.Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.PacketBuffer;
import com.jagex.util.Statics;

import java.awt.Font;
import java.util.zip.CRC32;

public class Class29 {
	public int anInt685;
	public static RSString aClass59_686;
	public static int anInt687;
	public static int anInt688;
	public int anInt689;
	public int anInt690;
	public static int anInt691 = 2;
	public static CRC32 aCRC32_692;
	public static Class12_Sub12_Sub7_Sub4 aClass12_Sub12_Sub7_Sub4_693;
	public static int anInt694;
	public static int anInt695;
	public static int anInt696;
	public int anInt697;
	public int anInt698;
	public int anInt699;
	public boolean aBoolean700 = true;
	public static int anInt701;
	public static int[] anIntArray703;
	public static int anInt705;
	public static int[][] anIntArrayArray706;
	public static volatile boolean aBoolean707;
	public static Font aFont708;
	public static RSString aClass59_709;
	public static RSString aClass59_710;
	public static int anInt711;
	public static RSString aClass59_712;
	public static int anInt713;
	public static int[] anIntArray714;
	public static int anInt715;
	public static RSString aClass59_716;
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array717;

	public static void method686(byte arg0, int arg1) {
		try {
			anInt694++;
			if (Class9_Sub2.anInt1588 != arg1) {
				if (Class9_Sub2.anInt1588 == 0)
					Class12_Sub12.method273((byte) -8);
				if ((arg1 ^ 0xffffffff) == -21 || arg1 == 40) {
					Statics.anInt567 = 0;
					Game.loginState = 0;
					Class42.anInt1006 = 0;
				}
				if (arg1 != 20 && (arg1 ^ 0xffffffff) != -41
						&& Class27.aClass24_639 != null)
					Class27.aClass24_639.method619(-2);
				if (Class9_Sub2.anInt1588 == 25 || Class9_Sub2.anInt1588 == 40) {
					Class12_Sub6.method189(-126);
					Class12_Sub12_Sub7.method341();
				}
				if (Class9_Sub2.anInt1588 == 25) {
					Class12_Sub12_Sub10.anInt2375 = 0;
					Class35.anInt854 = 0;
					Class36.anInt883 = 0;
					Class30.anInt721 = 1;
					Archive.anInt1901 = 1;
				}
				if (arg1 == 0 || arg1 == 35) {
					RuntimeException_Sub1.method1006((byte) -14);
					Class12_Sub12_Sub6.method338(arg0 ^ ~0x34);
					if (Class12_Sub12_Sub15.aClass62_2503 == null)
						Class12_Sub12_Sub15.aClass62_2503 = Class12_Sub12_Sub1
								.method276((Class12_Sub12_Sub5.aCanvas2243),
										503, 765, false);
				}
				if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
					Class12_Sub12_Sub15.aClass62_2503 = null;
					RuntimeException_Sub1.method1006((byte) -24);
					Class12_Sub12_Sub16.method557(
							(Cache.binaryArchive),
							(byte) 122, (Class12_Sub12_Sub5.aCanvas2243),
							Cache.spritesArchive);
				}
				if (arg0 == 67) {
					if ((arg1 ^ 0xffffffff) == -26 || arg1 == 30 || arg1 == 40) {
						Class12_Sub12_Sub15.aClass62_2503 = null;
						Class12_Sub12_Sub6.method338(arg0 + -193);
						Statics.method244(Cache.spritesArchive,
								Class12_Sub12_Sub5.aCanvas2243, (byte) -23);
					}
					Class27.aBoolean642 = true;
					Class9_Sub2.anInt1588 = arg1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "k.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static boolean method687(int arg0, byte arg1, int arg2) {
		try {
			anInt701++;
			if (arg1 != -45)
				method687(33, (byte) -29, -108);
			if (arg2 == 0
					&& (Class7.anInt1535 ^ 0xffffffff) == (arg0 ^ 0xffffffff))
				return true;
			if ((arg2 ^ 0xffffffff) == -2 && arg0 == Class62_Sub2.anInt1936)
				return true;
			if (((arg2 ^ 0xffffffff) == -3 || arg2 == 3)
					&& Class12_Sub12_Sub12.anInt2416 == arg0)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("k.E(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method688(byte arg0) {
		try {
			aClass59_716 = null;
			aCRC32_692 = null;
			Cache.animsArchive = null;
			Game.outBuffer = null;
			aFont708 = null;
			aClass12_Sub12_Sub7_Sub1Array717 = null;
			aClass59_709 = null;
			anIntArray714 = null;
			aClass59_710 = null;
			aClass59_712 = null;
			aClass59_686 = null;
			anIntArray703 = null;
			int i = -45 % ((arg0 - 76) / 47);
			anIntArrayArray706 = null;
			aClass12_Sub12_Sub7_Sub4_693 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "k.A(" + arg0 + ')');
		}
	}

	public static int method689(boolean arg0) {
		try {
			anInt696++;
			if (arg0 != false)
				return -41;
			return Class64_Sub2.anInt1966++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "k.D(" + arg0 + ')');
		}
	}

	public static void method690(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt688++;
			if ((arg3 ^ 0xffffffff) > -129 || (arg2 ^ 0xffffffff) > -129
					|| (arg3 ^ 0xffffffff) < -13057
					|| (arg2 ^ 0xffffffff) < -13057) {
				Class26.anInt626 = -1;
				Class12_Sub4.anInt1679 = -1;
			} else {
				int i = -arg0
						+ Class26.method658(arg3, -6, RSString.anInt1504, arg2);
				if (arg1 < 79)
					aClass12_Sub12_Sub7_Sub4_693 = null;
				arg2 -= Class20.anInt464;
				arg3 -= Class10.anInt250;
				int i_0_ = (Class12_Sub12_Sub11_Sub4.anIntArray2831[Statics.anInt2021]);
				i -= Class57.anInt1339;
				int i_1_ = (Class12_Sub12_Sub11_Sub4.anIntArray2833[Statics.anInt2021]);
				int i_2_ = (Class12_Sub12_Sub11_Sub4.anIntArray2831[Class27.anInt645]);
				int i_3_ = (Class12_Sub12_Sub11_Sub4.anIntArray2833[Class27.anInt645]);
				int i_4_ = i_2_ * arg2 - -(arg3 * i_3_) >> -495033392;
				arg2 = -(arg3 * i_2_) + i_3_ * arg2 >> -1317772112;
				arg3 = i_4_;
				i_4_ = -(i_0_ * arg2) + i_1_ * i >> 1040833648;
				arg2 = i * i_0_ + i_1_ * arg2 >> 488051856;
				i = i_4_;
				if ((arg2 ^ 0xffffffff) <= -51) {
					Class12_Sub4.anInt1679 = (i << -444767799) / arg2 + 167;
					Class26.anInt626 = (arg3 << -2088687543) / arg2 + 256;
				} else {
					Class26.anInt626 = -1;
					Class12_Sub4.anInt1679 = -1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("k.B(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public Class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
			boolean arg6) {
		try {
			anInt698 = arg1;
			anInt697 = arg0;
			anInt685 = arg4;
			aBoolean700 = arg6;
			anInt690 = arg3;
			anInt689 = arg2;
			anInt699 = arg5;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("k.<init>(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ')'));
		}
	}

	static {
		aClass59_686 = Class55.method898("null", -10983);
		aCRC32_692 = new CRC32();
		anIntArray703 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800,
				12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800,
				12800 };
		anInt705 = 0;
		anIntArrayArray706 = new int[104][104];
		aBoolean707 = false;
		Game.outBuffer = new PacketBuffer(5000);
		aClass59_712 = Class55.method898("Take", -10983);
		anInt713 = 0;
		aClass59_709 = aClass59_712;
		anInt711 = 0;
		aClass59_716 = Class55.method898("Connecting to update server", -10983);
		aClass59_710 = aClass59_716;
	}
}
