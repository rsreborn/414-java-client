package com.jagex;/* com.jagex.Class9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class9_Sub2 extends Class9 {
	public static int anInt1579;
	public static int[][] anIntArrayArray1580;
	public static RSString aClass59_1581 = Class55.method898(
			"No reply from loginserver)3", -10983);
	public int anInt1582;
	public static int anInt1583;
	public static Class8[][][] aClass8ArrayArrayArray1584;
	public int anInt1585;
	public static int anInt1586;
	public int anInt1587;
	public static int anInt1588;
	public static Buffer[] aClass12_Sub11Array1589 = new Buffer[2048];
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_1590;
	public static int anInt1591;
	public static int anInt1592;
	public long[] aLongArray1593 = new long[10];
	public static int anInt1594;
	public long aLong1595;
	public static int anInt1596;
	public static Class26 aClass26_1597;
	public static RSString aClass59_1598;
	public static int anInt1599;
	public int anInt1600;
	public static RSString aClass59_1601;
	public static int anInt1602;
	public static RSString aClass59_1603;
	/* synthetic */public static Class aClass1604;

	public void method106(boolean arg0) {
		try {
			anInt1600 = 256;
			anInt1591++;
			anInt1587 = 1;
			anInt1582 = 0;
			aLong1595 = System.currentTimeMillis();
			if (arg0 != false)
				method108((byte) -8);
			for (int i = 0; i < 10; i++)
				aLongArray1593[i] = aLong1595;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ca.B(" + arg0 + ')');
		}
	}

	public static void method112(byte arg0) {
		anInt1594++;
		if (Class64.aClass14_1448 != null) {
			long l = System.currentTimeMillis();
			if ((l ^ 0xffffffffffffffffL) < (Class12_Sub12_Sub1.aLong2048 ^ 0xffffffffffffffffL)) {
				Class64.aClass14_1448.method571(l);
				int i = (int) (-Class12_Sub12_Sub1.aLong2048 + l);
				Class12_Sub12_Sub1.aLong2048 = l;
				synchronized (aClass1604 != null ? aClass1604
						: (aClass1604 = method114("com.jagex.Class14"))) {
					Class12_Sub12_Sub16.anInt2557 += Class19.anInt446 * i;
					int i_0_ = ((Class12_Sub12_Sub16.anInt2557 + -(Class19.anInt446 * 2000)) / 1000);
					if (i_0_ > 0) {
						if (Archive.aClass12_Sub5_1902 != null)
							Archive.aClass12_Sub5_1902.method165(i_0_);
						Class12_Sub12_Sub16.anInt2557 -= i_0_ * 1000;
					}
				}
				if (arg0 != -124)
					aClass59_1601 = null;
			}
		}
	}

	public static void method113(byte arg0) {
		try {
			aClass59_1603 = null;
			aClass59_1581 = null;
			aClass12_Sub12_Sub7_Sub2_1590 = null;
			if (arg0 != 93)
				method112((byte) -95);
			anIntArrayArray1580 = null;
			aClass26_1597 = null;
			aClass59_1601 = null;
			aClass59_1598 = null;
			aClass12_Sub11Array1589 = null;
			aClass8ArrayArrayArray1584 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ca.H(" + arg0 + ')');
		}
	}

	public void method108(byte arg0) {
		try {
			for (int i = 0; i < 10; i++)
				aLongArray1593[i] = 0L;
			if (arg0 < 39)
				anInt1583 = -107;
			anInt1586++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ca.C(" + arg0 + ')');
		}
	}

	public int method105(int arg0, int arg1, int arg2) {
		try {
			int i = anInt1600;
			anInt1600 = 300;
			anInt1579++;
			int i_1_ = anInt1587;
			anInt1587 = 1;
			aLong1595 = System.currentTimeMillis();
			if ((aLongArray1593[anInt1585] ^ 0xffffffffffffffffL) != -1L) {
				if (aLongArray1593[anInt1585] < aLong1595)
					anInt1600 = (int) ((long) (2560 * arg2) / (aLong1595 + -aLongArray1593[anInt1585]));
			} else {
				anInt1600 = i;
				anInt1587 = i_1_;
			}
			if (anInt1600 < 25)
				anInt1600 = 25;
			if ((anInt1600 ^ 0xffffffff) < -257) {
				anInt1600 = 256;
				anInt1587 = (int) ((long) arg2 - (aLong1595 + -aLongArray1593[anInt1585]) / 10L);
			}
			if ((anInt1587 ^ 0xffffffff) < (arg2 ^ 0xffffffff))
				anInt1587 = arg2;
			aLongArray1593[anInt1585] = aLong1595;
			anInt1585 = (1 + anInt1585) % 10;
			if (anInt1587 > 1) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -11; i_2_++) {
					if (aLongArray1593[i_2_] != 0L)
						aLongArray1593[i_2_] = aLongArray1593[i_2_]
								+ (long) anInt1587;
				}
			}
			if (arg1 != 9104)
				method112((byte) 30);
			int i_3_ = 0;
			if (arg0 > anInt1587)
				anInt1587 = arg0;
			Statics.method218((long) anInt1587, true);
			while (anInt1582 < 256) {
				anInt1582 += anInt1600;
				i_3_++;
			}
			anInt1582 &= 0xff;
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ca.A(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public Class9_Sub2() {
		try {
			method106(false);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ca.<init>(" + ')');
		}
	}

	/* synthetic */public static Class method114(String arg0) {
		try {
			return Class.forName(arg0);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		aClass8ArrayArrayArray1584 = new Class8[4][104][104];
		anInt1583 = 256;
		aClass59_1598 = Class55.method898("mapmarker", -10983);
		anInt1588 = 0;
		aClass59_1601 = aClass59_1581;
		aClass59_1603 = Class55.method898("::noclip", -10983);
	}
}
