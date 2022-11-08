package com.jagex;/* com.jagex.Class12_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.sign.SignlinkNode;
import com.jagex.util.Statics;

public class Class12_Sub6 extends Class12 {
	public static int anInt1682;
	public static int anInt1683;
	public static int anInt1684;
	public SignlinkNode[] aSignlinkNodeArray1685;
	public int anInt1686;
	public static int anInt1687;
	public static Class26 aClass26_1688;
	public int[] anIntArray1689;
	public int anInt1690;
	public static RSString aClass59_1691 = Class55.method898("(U(Y", -10983);
	public static RSString aClass59_1692;
	public byte[][][] aByteArrayArrayArray1693;
	public static Class62 aClass62_1694;
	public static RSString aClass59_1695;
	public int[] anIntArray1696;
	public static int anInt1697;
	public int[] anIntArray1698;
	public static RSString aClass59_1699 = Class55
			.method898("(X100(U(Y", -10983);
	public static int anInt1700;
	public static RSString aClass59_1701 = Class55.method898("(U", -10983);
	public static int[] anIntArray1702;
	public SignlinkNode[] aSignlinkNodeArray1703;

	public static boolean method185(int arg0, int arg1, Class26 arg2) {
		try {
			if (arg0 != 13530)
				return true;
			anInt1700++;
			byte[] is = arg2.method638(15970, arg1);
			if (is == null)
				return false;
			Class35.method723(24507, is);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ie.B(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method186(boolean arg0) {
		try {
			aClass59_1695 = null;
			if (arg0 != true)
				anIntArray1702 = null;
			aClass59_1691 = null;
			aClass62_1694 = null;
			aClass59_1701 = null;
			aClass26_1688 = null;
			aClass59_1699 = null;
			aClass59_1692 = null;
			anIntArray1702 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ie.E(" + arg0 + ')');
		}
	}

	public static void method187(int arg0, int arg1, int arg2, int arg3) {
		try {
			int i = 85 / ((32 - arg3) / 59);
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -9; i_0_++) {
				for (int i_1_ = 0; i_1_ < 8; i_1_++)
					Statics.anIntArrayArrayArray569[arg0][arg2 + i_0_][arg1
							+ i_1_] = 0;
			}
			if ((arg2 ^ 0xffffffff) < -1) {
				for (int i_2_ = 1; i_2_ < 8; i_2_++)
					Statics.anIntArrayArrayArray569[arg0][arg2][i_2_ + arg1] = (Statics.anIntArrayArrayArray569[arg0][arg2 - 1][i_2_
							+ arg1]);
			}
			if ((arg1 ^ 0xffffffff) < -1) {
				for (int i_3_ = 1; i_3_ < 8; i_3_++)
					Statics.anIntArrayArrayArray569[arg0][arg2 - -i_3_][arg1] = (Statics.anIntArrayArrayArray569[arg0][i_3_
							+ arg2][arg1 + -1]);
			}
			if (arg2 > 0
					&& (Statics.anIntArrayArrayArray569[arg0][arg2 - 1][arg1] ^ 0xffffffff) != -1)
				Statics.anIntArrayArrayArray569[arg0][arg2][arg1] = Statics.anIntArrayArrayArray569[arg0][-1
						+ arg2][arg1];
			else if (arg1 > 0
					&& (Statics.anIntArrayArrayArray569[arg0][arg2][-1 + arg1] != 0))
				Statics.anIntArrayArrayArray569[arg0][arg2][arg1] = Statics.anIntArrayArrayArray569[arg0][arg2][arg1
						+ -1];
			else if (arg2 > 0
					&& (arg1 ^ 0xffffffff) < -1
					&& (Statics.anIntArrayArrayArray569[arg0][arg2 - 1][-1
							+ arg1]) != 0)
				Statics.anIntArrayArrayArray569[arg0][arg2][arg1] = (Statics.anIntArrayArrayArray569[arg0][-1
						+ arg2][arg1 - 1]);
			anInt1697++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ie.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method188(byte arg0, int arg1) {
		try {
			anInt1683++;
			if (arg1 != -1 && Class30.aBooleanArray749[arg1]) {
				Class55.aClass26_1298.method648(true, arg1);
				if (Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg1] != null) {
					boolean bool = true;
					int i = 0;
					if (arg0 != -99)
						aClass26_1688 = null;
					for (/**/; ((Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg1]).length > i); i++) {
						if ((Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg1][i]) != null) {
							if ((Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg1][i].anInt2141) != 2)
								Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg1][i] = null;
							else
								bool = false;
						}
					}
					if (bool)
						Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg1] = null;
					Class30.aBooleanArray749[arg1] = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ie.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method189(int arg0) {
		try {
			Class12_Sub12_Sub11_Sub6.aClass62_2894.method960(-1);
			int i = 44 / ((arg0 - -79) / 41);
			anInt1682++;
			Class38.anIntArray921 = Class12_Sub12_Sub7_Sub3
					.method376(Class38.anIntArray921);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ie.C(" + arg0 + ')');
		}
	}

	static {
		aClass59_1695 = (Class55.method898(
				"You need a members account to login to this world)3", -10983));
		aClass59_1692 = aClass59_1695;
	}
}
