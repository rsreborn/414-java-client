package com.jagex;/* com.jagex.Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Cache;
import com.jagex.util.Statics;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class49 implements KeyListener, FocusListener {
	public static Class42 aClass42_1140;
	public static int anInt1141;
	public static int anInt1142;
	public static int anInt1143;
	public static int[] anIntArray1144;
	public static int anInt1145;
	public static boolean aBoolean1146;
	public static int anInt1147 = 0;
	public static int anInt1148;
	public static int anInt1149 = 0;
	public static int anInt1150;
	public static int anInt1151;
	public static RSString aClass59_1152;
	public static int anInt1153;
	public static RSString aClass59_1154;
	public static int anInt1155;
	public static int anInt1156;
	public static int anInt1157;
	public static boolean aBoolean1158;
	public static RSString aClass59_1159;
	public static RSString aClass59_1160;
	public static RSString aClass59_1161;
	public static RSString aClass59_1162;
	public static RSString aClass59_1163;
	public static RSString aClass59_1164;
	public static RSString aClass59_1165;
	public static RSString aClass59_1166;
	public static boolean aBoolean1167;
	public static int[] anIntArray1168;
	public static RSString aClass59_1169;
	public static RSString aClass59_1170;

	public void keyTyped(KeyEvent arg0) {
		try {
			anInt1156++;
			arg0.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qb.keyTyped("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public synchronized void focusLost(FocusEvent arg0) {
		try {
			if (Class35.aClass49_837 != null)
				Class30.anInt719 = -1;
			anInt1150++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qb.focusLost("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public synchronized void keyPressed(KeyEvent arg0) {
		try {
			anInt1155++;
			if (Class35.aClass49_837 != null) {
				Class64_Sub2.anInt1966 = 0;
				int i = arg0.getKeyCode();
				if (i >= 0
						&& (i ^ 0xffffffff) > (Class1.anIntArray73.length ^ 0xffffffff)) {
					i = Class1.anIntArray73[i];
					if ((0x80 & i ^ 0xffffffff) != -1)
						i = -1;
				} else
					i = -1;
				int i_0_;
				if ((i ^ 0xffffffff) == -86 || (i ^ 0xffffffff) == -81
						|| i == 84 || i == 0 || (i ^ 0xffffffff) == -102)
					i_0_ = -1;
				else
					i_0_ = Statics.method203((byte) 120, arg0);
				if (Class30.anInt719 >= 0 && (i ^ 0xffffffff) <= -1) {
					Class12_Sub12_Sub4.anIntArray2222[Class30.anInt719] = i;
					Class30.anInt719 = 0x7f & 1 + Class30.anInt719;
					if (Class30.anInt719 == Statics.anInt552)
						Class30.anInt719 = -1;
				}
				if ((i ^ 0xffffffff) <= -1 || (i_0_ ^ 0xffffffff) <= -1) {
					int i_1_ = 0x7f & 1 + Class62_Sub2.anInt1928;
					if ((i_1_ ^ 0xffffffff) != (Class57.anInt1340 ^ 0xffffffff)) {
						Class19.anIntArray447[Class62_Sub2.anInt1928] = i;
						anIntArray1168[Class62_Sub2.anInt1928] = i_0_;
						Class62_Sub2.anInt1928 = i_1_;
					}
				}
			}
			arg0.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qb.keyPressed("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method800(int arg0) {
		try {
			aClass59_1170 = null;
			if (arg0 < 82)
				aClass42_1140 = null;
			aClass59_1154 = null;
			aClass59_1160 = null;
			aClass59_1161 = null;
			anIntArray1168 = null;
			anIntArray1144 = null;
			aClass59_1165 = null;
			aClass59_1159 = null;
			aClass59_1166 = null;
			aClass59_1162 = null;
			aClass59_1152 = null;
			aClass59_1164 = null;
			aClass59_1169 = null;
			aClass59_1163 = null;
			aClass42_1140 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qb.C(" + arg0 + ')');
		}
	}

	public synchronized void keyReleased(KeyEvent arg0) {
		try {
			anInt1151++;
			if (Class35.aClass49_837 != null) {
				Class64_Sub2.anInt1966 = 0;
				int i = arg0.getKeyCode();
				if (i < 0
						|| (i ^ 0xffffffff) <= (Class1.anIntArray73.length ^ 0xffffffff))
					i = -1;
				else
					i = ~0x80 & Class1.anIntArray73[i];
				if (Class30.anInt719 >= 0 && i >= 0) {
					Class12_Sub12_Sub4.anIntArray2222[Class30.anInt719] = i ^ 0xffffffff;
					Class30.anInt719 = 0x7f & 1 + Class30.anInt719;
					if (Statics.anInt552 == Class30.anInt719)
						Class30.anInt719 = -1;
				}
			}
			arg0.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qb.keyReleased("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method801(byte arg0) {
		try {
			anInt1153++;
			Class63.method967(127);
			RSCanvas.method37(1000);
			Class39.method746(true);
			Class38.method741((byte) -106);
			Class20.method606(-118);
			Class43.method774(60);
			Statics.method627(26551);
			RSApplet.method30(-571);
			Class12_Sub12_Sub4.method304(-32536);
			Class64.method982(126);
			Class40.method751((byte) 88);
			Class12_Sub12_Sub15.method556((byte) -84);
			((Class7) Class12_Sub12_Sub7_Sub3.anInterface3_2607)
					.method86(-27241);
			Cache.animsArchive.method644(11);
			Cache.basesArchive.method644(-94);
			Cache.interfacesArchive.method644(-55);
			Cache.synthSoundsArchive.method644(121);
			Cache.mapsArchive.method644(-35);
			Cache.midiSongsArchive.method644(108);
			if (arg0 > 78) {
				Cache.modelsArchive.method644(126);
				Cache.spritesArchive.method644(110);
				Cache.texturesArchive.method644(122);
				Cache.binaryArchive.method644(16);
				Cache.midiJinglesArchive.method644(-27);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qb.A(" + arg0 + ')');
		}
	}

	public static void method802(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		try {
			anInt1148++;
			if (!Class21.aBoolean483)
				arg0 = 0;
			if ((Class29.anInt715 ^ 0xffffffff) != (arg2 ^ 0xffffffff)
					|| (Class51.anInt1178 ^ 0xffffffff) != (arg4 ^ 0xffffffff)
					|| (arg0 ^ 0xffffffff) != (Class39.anInt932 ^ 0xffffffff)) {
				Class51.anInt1178 = arg4;
				Class29.anInt715 = arg2;
				Class39.anInt932 = arg0;
				Class29.method686((byte) 67, 25);
				Class36.method729(false, null, 1932, Class64_Sub2.aClass59_1970);
				int i = Class8.anInt174;
				Class8.anInt174 = -48 + 8 * arg4;
				int i_2_ = Class64.anInt1451;
				int i_3_ = Class8.anInt174 + -i;
				i = Class8.anInt174;
				Class64.anInt1451 = (arg2 - 6) * 8;
				int i_4_ = -i_2_ + Class64.anInt1451;
				i_2_ = Class64.anInt1451;
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -16385; i_5_++) {
					Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_5_];
					if (class12_sub12_sub11_sub2_sub1 != null) {
						for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -11; i_6_++) {
							class12_sub12_sub11_sub2_sub1.anIntArray2708[i_6_] -= i_4_;
							class12_sub12_sub11_sub2_sub1.anIntArray2671[i_6_] -= i_3_;
						}
						class12_sub12_sub11_sub2_sub1.anInt2691 -= i_4_ * 128;
						class12_sub12_sub11_sub2_sub1.anInt2683 -= i_3_ * 128;
					}
				}
				for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -2049; i_7_++) {
					Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_7_]);
					if (class12_sub12_sub11_sub2_sub2 != null) {
						for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -11; i_8_++) {
							class12_sub12_sub11_sub2_sub2.anIntArray2708[i_8_] -= i_4_;
							class12_sub12_sub11_sub2_sub2.anIntArray2671[i_8_] -= i_3_;
						}
						class12_sub12_sub11_sub2_sub2.anInt2691 -= 128 * i_4_;
						class12_sub12_sub11_sub2_sub2.anInt2683 -= 128 * i_3_;
					}
				}
				RSString.anInt1504 = arg0;
				int i_9_ = 0;
				int i_10_ = 104;
				Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.method453(
						arg5, false, false, arg3);
				int i_11_ = 1;
				int i_12_ = 0;
				if (arg1 > i_4_) {
					i_10_ = -1;
					i_9_ = 103;
					i_11_ = -1;
				}
				int i_13_ = 104;
				int i_14_ = 1;
				if (i_3_ < 0) {
					i_12_ = 103;
					i_13_ = -1;
					i_14_ = -1;
				}
				for (int i_15_ = i_9_; (i_15_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff); i_15_ += i_11_) {
					for (int i_16_ = i_12_; i_13_ != i_16_; i_16_ += i_14_) {
						int i_17_ = i_15_ + i_4_;
						int i_18_ = i_3_ + i_16_;
						for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -5; i_19_++) {
							if (i_17_ >= 0 && i_18_ >= 0 && i_17_ < 104
									&& i_18_ < 104)
								Class9_Sub2.aClass8ArrayArrayArray1584[i_19_][i_15_][i_16_] = (Class9_Sub2.aClass8ArrayArrayArray1584[i_19_][i_17_][i_18_]);
							else
								Class9_Sub2.aClass8ArrayArrayArray1584[i_19_][i_15_][i_16_] = null;
						}
					}
				}
				for (Class12_Sub2 class12_sub2 = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
						.method91((byte) 86); class12_sub2 != null; class12_sub2 = (Class12_Sub2) RuntimeException_Sub1.aClass8_1460
						.method100(-29860)) {
					class12_sub2.anInt1638 -= i_4_;
					class12_sub2.anInt1644 -= i_3_;
					if ((class12_sub2.anInt1638 ^ 0xffffffff) > -1
							|| class12_sub2.anInt1644 < 0
							|| class12_sub2.anInt1638 >= 104
							|| (class12_sub2.anInt1644 ^ 0xffffffff) <= -105)
						class12_sub2.method143((byte) 39);
				}
				Class12_Sub1.anInt1607 = -1;
				Class57.aBoolean1326 = false;
				if (Class23.anInt499 != 0) {
					Class29.anInt711 -= i_3_;
					Class23.anInt499 -= i_4_;
				}
				Class10.aClass8_243.method101(2);
				Class56.aClass8_1324.method101(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception,
					("qb.B(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ',' + arg5 + ')'));
		}
	}

	public void focusGained(FocusEvent arg0) {
		try {
			anInt1141++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "qb.focusGained("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		anInt1142 = 0;
		aBoolean1146 = false;
		aClass59_1152 = Class55.method898(
				"Your profile will be transferred in:", -10983);
		aClass59_1154 = aClass59_1152;
		aClass42_1140 = new Class42();
		aClass59_1160 = Class55.method898(" has logged out)3", -10983);
		aClass59_1162 = Class55.method898("scroll:", -10983);
		aClass59_1164 = aClass59_1162;
		aClass59_1165 = Class55.method898(" @whi@(X", -10983);
		aClass59_1169 = Class55.method898("::clientdrop", -10983);
		aClass59_1161 = Class55.method898("System update in: ", -10983);
		aBoolean1158 = false;
		anIntArray1168 = new int[128];
		anInt1157 = 0;
		aClass59_1163 = aClass59_1161;
		aBoolean1167 = false;
		aClass59_1159 = Class55.method898("Please try again)3", -10983);
		aClass59_1170 = aClass59_1160;
		aClass59_1166 = aClass59_1159;
	}
}
