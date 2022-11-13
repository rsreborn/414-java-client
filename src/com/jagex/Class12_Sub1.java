package com.jagex;/* com.jagex.Class12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub1 extends Class12 {
	public static int anInt1605;
	public static int anInt1606;
	public static int anInt1607;
	public static RSString aClass59_1608;
	public static RSString aClass59_1609 = Class55.method898(
			"Error loading your profile)3", -10983);
	public static RSString aClass59_1610;
	public static RSString aClass59_1611;
	public static Class48 aClass48_1612;
	public static int anInt1613;
	public static int anInt1614;
	public static boolean aBoolean1615;
	public static volatile int anInt1616;
	public static int anInt1617;
	public static int anInt1618;
	public static RSString aClass59_1619;
	public static RSString aClass59_1620;
	public static RSString[] aClass59Array1621;
	public RSString aClass59_1622;
	public static RSString aClass59_1623;
	public static RSString aClass59_1624;
	public static int anInt1625;
	public static int anInt1626;
	public static boolean[] aBooleanArray1627;
	public static RSString aClass59_1628;

	public static void method144(int arg0) {
		try {
			aClass59_1611 = null;
			aClass59_1624 = null;
			aBooleanArray1627 = null;
			aClass59Array1621 = null;
			aClass48_1612 = null;
			aClass59_1610 = null;
			aClass59_1608 = null;
			aClass59_1620 = null;
			aClass59_1619 = null;
			aClass59_1609 = null;
			aClass59_1628 = null;
			if (arg0 != 31)
				method148(57);
			aClass59_1623 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "db.A(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub2 method145(Class26 arg0, RSString arg1,
			byte arg2, RSString arg3) {
		try {
			int i = arg0.hashFileName(arg1, -22814);
			int i_0_ = arg0.method655(i, (byte) 57, arg3);
			int i_1_ = 72 % ((arg2 - 74) / 38);
			anInt1614++;
			return Class42.method771(i, (byte) 125, i_0_, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("db.E("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method146(int arg0) {
		if (arg0 != -31908)
			method148(121);
		anInt1606++;
		if (Class48.aClass24_1124 != null)
			Class48.aClass24_1124.method619(arg0 ^ 0x7ca2);
	}

	public static void method147(int arg0, Class12_Sub2 arg1) {
		try {
			anInt1613++;
			int i = -1;
			int i_2_ = 0;
			int i_3_ = 0;
			int i_4_ = 0;
			if (arg0 == -26017) {
				if ((arg1.anInt1635 ^ 0xffffffff) == -1)
					i_2_ = (Class12_Sub12_Sub8.aClass52_2295.method842(
							arg1.anInt1629, arg1.anInt1638, arg1.anInt1644));
				if ((arg1.anInt1635 ^ 0xffffffff) == -2)
					i_2_ = (Class12_Sub12_Sub8.aClass52_2295.method825(
							arg1.anInt1629, arg1.anInt1638, arg1.anInt1644));
				if (arg1.anInt1635 == 2)
					i_2_ = (Class12_Sub12_Sub8.aClass52_2295.method871(
							arg1.anInt1629, arg1.anInt1638, arg1.anInt1644));
				if ((arg1.anInt1635 ^ 0xffffffff) == -4)
					i_2_ = (Class12_Sub12_Sub8.aClass52_2295.method864(
							arg1.anInt1629, arg1.anInt1638, arg1.anInt1644));
				if ((i_2_ ^ 0xffffffff) != -1) {
					i = 0x7fff & i_2_ >> 1772987918;
					int i_5_ = (Class12_Sub12_Sub8.aClass52_2295.method844(
							arg1.anInt1629, arg1.anInt1638, arg1.anInt1644,
							i_2_));
					i_3_ = 0x1f & i_5_;
					i_4_ = (0xeb & i_5_) >> 1769448742;
				}
				arg1.anInt1653 = i_3_;
				arg1.anInt1652 = i;
				arg1.anInt1651 = i_4_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("db.B(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method148(int arg0) {
		try {
			anInt1605++;
			if ((Class62_Sub2.anInt1918 ^ 0xffffffff) < -1)
				Class12_Sub12_Sub8.method409(arg0 ^ ~0x536a);
			else {
				Class29.method686((byte) 67, 40);
				if (arg0 != 21254)
					aClass48_1612 = null;
				Class27.aClass24_639 = Game.gameServerSocket;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "db.C(" + arg0 + ')');
		}
	}

	static {
		aClass59_1608 = Class55.method898(" from your friend list first",
				-10983);
		anInt1607 = -1;
		aClass59_1610 = aClass59_1609;
		aClass59Array1621 = new RSString[500];
		aClass59_1620 = Class55.method898("", -10983);
		aBoolean1615 = false;
		anInt1617 = 0;
		aClass59_1619 = Class55.method898("Please use a different world)3",
				-10983);
		anInt1625 = 0;
		aBooleanArray1627 = new boolean[112];
		anInt1626 = -1;
		aClass59_1611 = aClass59_1608;
		aClass59_1623 = Class55.method898("glow2:", -10983);
		anInt1616 = 0;
		aClass59_1628 = aClass59_1619;
		aClass59_1624 = aClass59_1623;
		aClass48_1612 = new Class48(4096);
	}
}
