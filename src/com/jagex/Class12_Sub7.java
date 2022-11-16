package com.jagex;/* com.jagex.Class12_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class12_Sub7 extends Class12 {
	public static int anInt1704;
	public static Buffer aClass12_Sub11_1705 = new Buffer(
			new byte[5000]);
	public Class32[] aClass32Array1706 = new Class32[5];
	public int anInt1707;
	public boolean aBoolean1708;
	public boolean aBoolean1709;
	public Class55 aClass55_1710;
	public int anInt1711;
	public int anInt1712;
	public static Player aClass12_Sub12_Sub11_Sub2_Sub2_1713;
	public boolean aBoolean1714;
	public Class29 aClass29_1715;
	public static int anInt1716;
	public int anInt1717;
	public int anInt1718;
	public Class46 aClass46_1719;
	public Class44 aClass44_1720;
	public int anInt1721;
	public int anInt1722;
	public static int anInt1723;
	public int[] anIntArray1724;
	public static RSString aClass59_1725;
	public static int[] anIntArray1726 = { 16776960, 16711680, 65280, 65535,
			16711935, 16777215 };
	public Class21 aClass21_1727;
	public Class4 aClass4_1728;
	public static RSString aClass59_1729;
	public int anInt1730;
	public static RSString aClass59_1731 = Class55.method898(" @gre@", -10983);
	public Class12_Sub7 aClass12_Sub7_1732;
	public int anInt1733;
	public static RSString aClass59_1734;
	public static RSString aClass59_1735;
	public static int anInt1736;
	public int anInt1737 = 0;
	public static RSString aClass59_1738;
	public int anInt1739;

	public static void method190(RSString arg0, RSString arg1, int arg2,
								 boolean arg3) {
		try {
			anInt1736++;
			if ((Class12_Sub12_Sub12.anInt2407 ^ 0xffffffff) == 0)
				Class8.aBoolean182 = true;
			if (arg2 == 0 && (Class58.anInt1342 ^ 0xffffffff) != 0) {
				Class12_Sub1.anInt1625 = 0;
				Class32.aClass59_775 = arg1;
			}
			for (int i = 99; i > 0; i--) {
				Class30.anIntArray746[i] = Class30.anIntArray746[-1 + i];
				Class12_Sub12_Sub8.aClass59Array2301[i] = Class12_Sub12_Sub8.aClass59Array2301[i - 1];
				Class26.aClass59Array591[i] = Class26.aClass59Array591[i + -1];
			}
			Class30.anIntArray746[0] = arg2;
			Class12_Sub12_Sub8.aClass59Array2301[0] = arg0;
			if (arg3 != false)
				method191(15L, 71);
			Class26.aClass59Array591[0] = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("kb.D("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public static void method191(long arg0, int arg1) {
		try {
			anInt1716++;
			if ((arg0 ^ 0xffffffffffffffffL) != -1L) {
				if (Class49.anInt1147 >= 100)
					method190(Class11.aClass59_310, Class44.aClass59_1043, 0,
							false);
				else {
					if (arg1 != 7159)
						method193(true);
					RSString class59 = Class12_Sub12_Sub13.method524(-3, arg0)
							.toString(arg1 ^ ~0x2259);
					for (int i = 0; i < Class49.anInt1147; i++) {
						if ((arg0 ^ 0xffffffffffffffffL) == (Class35.aLongArray859[i] ^ 0xffffffffffffffffL)) {
							method190(
									Class11.aClass59_310,
									(Statics
											.method251(
													(byte) -82,
													(new RSString[] {
															class59,
															Class12_Sub12.aClass59_1849 }))),
									0, false);
							return;
						}
					}
					for (int i = 0; i < Class7.anInt1540; i++) {
						if ((arg0 ^ 0xffffffffffffffffL) == (Class47.aLongArray1099[i] ^ 0xffffffffffffffffL)) {
							method190(
									Class11.aClass59_310,
									(Statics
											.method251(
													(byte) -126,
													(new RSString[] {
															Class12_Sub12_Sub3.aClass59_2173,
															class59,
															Class12_Sub1.aClass59_1611 }))),
									0, false);
							return;
						}
					}
					if (!class59
							.method934(
									(aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass59_2951),
									17706)) {
						Class35.aLongArray859[Class49.anInt1147++] = arg0;
						Class49.aBoolean1146 = true;
						Game.outBuffer.writePacket(117);
						Class27.anInt631++;
						Game.outBuffer.writeLongBE(arg0);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "kb.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Class12_Sub7(int arg0, int arg1, int arg2) {
		anIntArray1724 = new int[5];
		try {
			anInt1733 = arg1;
			anInt1722 = arg2;
			anInt1718 = anInt1707 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("kb.<init>(" + arg0
					+ ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method192(int arg0, Class12_Sub12_Sub11_Sub2 arg1) {
		try {
			int i = arg1.anInt2667 - Class64_Sub2.anInt1968;
			if (arg1.anInt2689 == 0)
				arg1.anInt2666 = 1024;
			if ((arg1.anInt2689 ^ 0xffffffff) == -2)
				arg1.anInt2666 = 1536;
			anInt1704++;
			arg1.anInt2670 = 0;
			if (arg1.anInt2689 == 2)
				arg1.anInt2666 = 0;
			if (arg1.anInt2689 == 3)
				arg1.anInt2666 = 512;
			int i_0_ = arg0 * arg1.anInt2727 + arg1.anInt2705 * 128;
			arg1.anInt2691 += (i_0_ - arg1.anInt2691) / i;
			int i_1_ = 64 * arg1.anInt2727 + arg1.anInt2686 * 128;
			arg1.anInt2683 += (-arg1.anInt2683 + i_1_) / i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("kb.B(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method193(boolean arg0) {
		aClass59_1735 = null;
		aClass12_Sub12_Sub11_Sub2_Sub2_1713 = null;
		aClass59_1738 = null;
		aClass59_1729 = null;
		aClass59_1734 = null;
		aClass12_Sub11_1705 = null;
		aClass59_1725 = null;
		anIntArray1726 = null;
		aClass59_1731 = null;
		if (arg0 != true)
			method190(null, null, -127, false);
	}

	static {
		aClass59_1729 = Class55.method898("K", -10983);
		aClass59_1725 = aClass59_1729;
		aClass59_1735 = aClass59_1729;
		aClass59_1738 = Class55.method898("Loaded input handler", -10983);
		aClass59_1734 = aClass59_1738;
	}
}
