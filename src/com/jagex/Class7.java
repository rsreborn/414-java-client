package com.jagex;/* com.jagex.Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;
import com.jagex.sign.SignlinkNode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class7 implements Interface3 {
	public static int anInt1527;
	public static Class62 aClass62_1528;
	public static int anInt1529;
	public static int anInt1530 = -1;
	public static Class12_Sub12_Sub11_Sub2_Sub1[] aClass12_Sub12_Sub11_Sub2_Sub1Array1531;
	public static int anInt1532;
	public static SignlinkNode aSignlinkNode_1533;
	public static int anInt1534;
	public static int anInt1535;
	public Class8 aClass8_1536 = new Class8();
	public static int anInt1537;
	public static int anInt1538 = 0;
	public static int anInt1539 = 20;
	public static int anInt1540;
	public static int anInt1541;
	public static int anInt1542;
	public static int anInt1543;
	public static int anInt1544;
	public Class12_Sub10[] aClass12_Sub10Array1545;
	public static int anInt1546;
	public static int anInt1547;
	public double aDouble1548;
	public int anInt1549;
	public int anInt1550 = 0;
	public Class26 aClass26_1551;
	public int anInt1552 = 128;

	public void method82(int arg0, int arg1) {
		for (int i = 0; i < aClass12_Sub10Array1545.length; i++) {
			Class12_Sub10 class12_sub10 = aClass12_Sub10Array1545[i];
			if (class12_sub10 != null && class12_sub10.anInt1764 != 0
					&& class12_sub10.aBoolean1771) {
				class12_sub10.method199(arg1);
				class12_sub10.aBoolean1771 = false;
			}
		}
		anInt1543++;
		if (arg0 != 17)
			method88(null, null, -105, 109);
	}

	public static void method83(byte arg0, int arg1, byte[] arg2, boolean arg3) {
		anInt1537++;
		if (Class5.aClass64_158 != null) {
			int i = 64 % ((-12 - arg0) / 49);
			if ((Class33.anInt825 ^ 0xffffffff) <= -1) {
				Class5.aClass64_158.method981(true);
				Class33.anInt825 = -1;
				Class27.aByteArray655 = null;
				Class49.anInt1142 = 20;
				Class15.anInt395 = 0;
			}
			if (arg2 != null) {
				if (Class49.anInt1142 > 0) {
					Class5.aClass64_158.method979(arg1, (byte) 50);
					Class49.anInt1142 = 0;
				}
				Class33.anInt825 = arg1;
				Class5.aClass64_158.method975(arg1, arg2, 0, arg3);
			}
		}
	}

	public void method84(double arg0, boolean arg1) {
		try {
			if (arg1 != true)
				method9(-19, 19);
			anInt1527++;
			aDouble1548 = arg0;
			method86(-27241);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ba.I(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method85(byte arg0) {
		try {
			aClass62_1528 = null;
			if (arg0 != -104)
				method88(null, null, 72, -29);
			aSignlinkNode_1533 = null;
			aClass12_Sub12_Sub11_Sub2_Sub1Array1531 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ba.H(" + arg0 + ')');
		}
	}

	public void method86(int arg0) {
		try {
			anInt1544++;
			int i = 0;
			if (arg0 == -27241) {
				for (/**/; ((aClass12_Sub10Array1545.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
					if (aClass12_Sub10Array1545[i] != null)
						aClass12_Sub10Array1545[i].method198();
				}
				aClass8_1536 = new Class8();
				anInt1550 = anInt1549;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ba.E(" + arg0 + ')');
		}
	}

	public static Class method87(int arg0, String arg1)
			throws ClassNotFoundException {
		try {
			anInt1546++;
			if (arg1.equals("B"))
				return Byte.TYPE;
			if (arg1.equals("I"))
				return Integer.TYPE;
			if (arg0 != 0)
				method88(null, null, 85, 34);
			if (arg1.equals("S"))
				return Short.TYPE;
			if (arg1.equals("J"))
				return Long.TYPE;
			if (arg1.equals("Z"))
				return Boolean.TYPE;
			if (arg1.equals("F"))
				return Float.TYPE;
			if (arg1.equals("D"))
				return Double.TYPE;
			if (arg1.equals("C"))
				return Character.TYPE;
			return Class.forName(arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ba.J(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method88(Color arg0, RSString arg1, int arg2, int arg3) {
		try {
			anInt1541++;
			try {
				Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
						.getGraphics();
				if (Class29.aFont708 == null) {
					Class29.aFont708 = new Font("Helvetica", 1, 13);
					Class64_Sub2.aFontMetrics1979 = Class12_Sub12_Sub5.aCanvas2243
							.getFontMetrics(Class29.aFont708);
				}
				if (arg2 != 21722)
					anInt1538 = 0;
				if (Class27.aBoolean642) {
					Class27.aBoolean642 = false;
					graphics.setColor(Color.black);
					graphics.fillRect(0, 0, Class62_Sub2.anInt1913,
							Class31.anInt768);
				}
				if (arg0 == null)
					arg0 = new Color(140, 17, 17);
				try {
					if (Class57.anImage1327 == null)
						Class57.anImage1327 = Class12_Sub12_Sub5.aCanvas2243
								.createImage(304, 34);
					Graphics graphics_0_ = Class57.anImage1327.getGraphics();
					graphics_0_.setColor(arg0);
					graphics_0_.drawRect(0, 0, 303, 33);
					graphics_0_.fillRect(2, 2, 3 * arg3, 30);
					graphics_0_.setColor(Color.black);
					graphics_0_.drawRect(1, 1, 301, 31);
					graphics_0_.fillRect(2 - -(arg3 * 3), 2, -(3 * arg3) + 300,
							30);
					graphics_0_.setFont(Class29.aFont708);
					graphics_0_.setColor(Color.white);
					arg1.method921((byte) 124,
							(304 + -arg1.method925(
									(Class64_Sub2.aFontMetrics1979),
									arg2 ^ 0x54b4)) / 2, 22, graphics_0_);
					graphics.drawImage(Class57.anImage1327,
							Class62_Sub2.anInt1913 / 2 + -152, -18
									+ Class31.anInt768 / 2, null);
				} catch (Exception exception) {
					int i = -152 + Class62_Sub2.anInt1913 / 2;
					int i_1_ = Class31.anInt768 / 2 + -18;
					graphics.setColor(arg0);
					graphics.drawRect(i, i_1_, 303, 33);
					graphics.fillRect(2 + i, i_1_ - -2, 3 * arg3, 30);
					graphics.setColor(Color.black);
					graphics.drawRect(i - -1, 1 + i_1_, 301, 31);
					graphics.fillRect(3 * arg3 + (i - -2), 2 + i_1_,
							-(arg3 * 3) + 300, 30);
					graphics.setFont(Class29.aFont708);
					graphics.setColor(Color.white);
					arg1.method921(
							(byte) 91,
							i
									+ (-arg1.method925(
											(Class64_Sub2.aFontMetrics1979),
											119) + 304) / 2, i_1_ - -22,
							graphics);
				}
			} catch (Exception exception) {
				Class12_Sub12_Sub5.aCanvas2243.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ba.K("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public int method6(int arg0, byte arg1) {
		try {
			anInt1532++;
			if (arg1 >= -94)
				return -123;
			if (aClass12_Sub10Array1545[arg0] == null)
				return 0;
			return aClass12_Sub10Array1545[arg0].anInt1762;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ba.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method8(int arg0, int arg1) {
		try {
			anInt1534++;
			int i = -94 % ((arg1 - 15) / 43);
			return aClass12_Sub10Array1545[arg0].aBoolean1763;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ba.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method9(int arg0, int arg1) {
		try {
			anInt1542++;
			if (arg1 != 15390)
				method88(null, null, -4, -80);
			if (anInt1552 != 64)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ba.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int[] method7(int arg0, int arg1) {
		try {
			Class12_Sub10 class12_sub10 = aClass12_Sub10Array1545[arg1];
			anInt1529++;
			if (class12_sub10 != null) {
				if (class12_sub10.anIntArray1772 != null) {
					aClass8_1536.method97(class12_sub10, arg0 + -5369);
					class12_sub10.aBoolean1771 = true;
					return class12_sub10.anIntArray1772;
				}
				boolean bool = class12_sub10.method200(aDouble1548, anInt1552,
						aClass26_1551);
				if (bool) {
					if (anInt1550 != 0)
						anInt1550--;
					else {
						Class12_Sub10 class12_sub10_2_ = ((Class12_Sub10) aClass8_1536
								.method94((byte) 126));
						class12_sub10_2_.method198();
					}
					aClass8_1536.method97(class12_sub10, arg0 + -5369);
					class12_sub10.aBoolean1771 = true;
					return class12_sub10.anIntArray1772;
				}
			}
			if (arg0 != 5370)
				method6(12, (byte) 68);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ba.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Class7(Class26 arg0, Class26 arg1, int arg2, double arg3, int arg4) {
		aDouble1548 = 1.0;
		try {
			aDouble1548 = arg3;
			anInt1549 = arg2;
			anInt1552 = arg4;
			aClass26_1551 = arg1;
			anInt1550 = anInt1549;
			int[] is = arg0.method651(0, 85);
			int i = is.length;
			aClass12_Sub10Array1545 = new Class12_Sub10[arg0
					.method645(0, false)];
			for (int i_3_ = 0; i_3_ < i; i_3_++) {
				Buffer class12_sub11 = new Buffer(arg0.method631(
						0, true, is[i_3_]));
				aClass12_Sub10Array1545[is[i_3_]] = new Class12_Sub10(
						class12_sub11);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ba.<init>("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + arg4 + ')'));
		}
	}

	static {
		aClass12_Sub12_Sub11_Sub2_Sub1Array1531 = new Class12_Sub12_Sub11_Sub2_Sub1[16384];
		anInt1540 = 0;
		anInt1535 = -1;
	}
}
