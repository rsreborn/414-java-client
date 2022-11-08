package com.jagex;/* com.jagex.Class12_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Archive;
import com.jagex.sign.Signlink;

import java.awt.Component;

public class Class12_Sub9 extends Class12 {
	public static int anInt1741;
	public static int[] anIntArray1742;
	public static RSString aClass59_1743;
	public static int anInt1744;
	public static RSString aClass59_1745;
	public Class36 aClass36_1746;
	public static RSString aClass59_1747;
	public int anInt1748;
	public static int anInt1749;
	public static int anInt1750;
	public static int anInt1751 = -1;
	public static int anInt1752;
	public Archive aClass26_Sub1_1753;
	public static RSString aClass59_1754;
	public static RSString aClass59_1755;
	public static int anInt1756;
	public byte[] aByteArray1757;
	public static RSString aClass59_1758;
	public static RSString aClass59_1759;
	public static int anInt1760;
	public static RSString aClass59_1761;

	public static void method195(Class26 arg0, int arg1) {
		try {
			if (arg1 < -74) {
				Class12_Sub12.aClass26_1852 = arg0;
				anInt1741++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ra.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static Class12_Sub5_Sub1 method196(Component arg0, int arg1,
			Signlink arg2) {
		try {
			if (arg1 != 0)
				method196(null, -66, null);
			Class15.method591(arg2, arg0, (byte) 88);
			anInt1750++;
			Class12_Sub5_Sub1 class12_sub5_sub1 = new Class12_Sub5_Sub1();
			Class14.method566(103, class12_sub5_sub1);
			return class12_sub5_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ra.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method197(int arg0) {
		try {
			if (arg0 != 0)
				method197(-37);
			aClass59_1754 = null;
			aClass59_1747 = null;
			aClass59_1743 = null;
			aClass59_1761 = null;
			anIntArray1742 = null;
			aClass59_1745 = null;
			aClass59_1759 = null;
			aClass59_1755 = null;
			aClass59_1758 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ra.A(" + arg0 + ')');
		}
	}

	static {
		aClass59_1747 = Class55.method898("Unable to connect)3", -10983);
		aClass59_1755 = aClass59_1747;
		aClass59_1743 = Class55.method898("Public chat", -10983);
		aClass59_1745 = aClass59_1747;
		anInt1756 = 0;
		aClass59_1754 = Class55.method898("title)3jpg", -10983);
		aClass59_1759 = aClass59_1743;
		anInt1760 = 0;
		aClass59_1761 = Class55.method898("Try again in 60 secs)3)3)3", -10983);
		aClass59_1758 = aClass59_1761;
	}
}
