package com.jagex;/* com.jagex.Class12_Sub12_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.cache.Cache;
import com.jagex.io.Buffer;
import com.jagex.io.RSSocket;
import com.jagex.util.Statics;

import java.awt.Component;
import java.awt.Frame;

public class Class12_Sub12_Sub16 extends Class12_Sub12 {
	public static RSString aClass59_2532;
	public static RSString aClass59_2533;
	public static RSString aClass59_2534;
	public static RSString aClass59_2535;
	public static RSString aClass59_2536;
	public static RSString aClass59_2537;
	public static RSString aClass59_2538;
	public static Frame aFrame2539;
	public static RSString aClass59_2540;
	public static RSString aClass59_2541 = Class55
			.method898("redstone2", -10983);
	public static RSString aClass59_2542;
	public static RSString aClass59_2543;
	public static int anInt2544;
	public static Class12_Sub12_Sub7_Sub2[] aClass12_Sub12_Sub7_Sub2Array2545;
	public static int anInt2546;
	public static int anInt2547;
	public static Class12_Sub12_Sub3[][] aClass12_Sub12_Sub3ArrayArray2548;
	public static RSString aClass59_2549;
	public static int anInt2550;
	public int anInt2551 = 0;
	public static RSString aClass59_2552;
	public static Class27 aClass27_2553;
	public static RSString aClass59_2554;
	public static RSString aClass59_2555;
	public static RSString aClass59_2556;
	public static int anInt2557;
	public static boolean aBoolean2559;
	public static int anInt2560;

	public static void method557(Class26 arg0, byte arg1, Component arg2,
			Class26 arg3) {
		try {
			anInt2544++;
			if (!Class44.aBoolean1047) {
				Class5.aClass62_148 = Class12_Sub12_Sub1.method276(arg2, 265,
						128, false);
				Class12_Sub12_Sub7.method341();
				Class31.aClass62_771 = Class12_Sub12_Sub1.method276(arg2, 265,
						128, false);
				Class12_Sub12_Sub7.method341();
				Class35.aClass62_863 = Class12_Sub12_Sub1.method276(arg2, 171,
						509, false);
				Class12_Sub12_Sub7.method341();
				Class9.aClass62_214 = Class12_Sub12_Sub1.method276(arg2, 132,
						360, false);
				Class12_Sub12_Sub7.method341();
				Class26.aClass62_612 = Class12_Sub12_Sub1.method276(arg2, 200,
						360, false);
				Class12_Sub12_Sub7.method341();
				Class42.aClass62_984 = Class12_Sub12_Sub1.method276(arg2, 238,
						202, false);
				Class12_Sub12_Sub7.method341();
				Class20.aClass62_471 = Class12_Sub12_Sub1.method276(arg2, 238,
						203, false);
				Class12_Sub12_Sub7.method341();
				Class12_Sub12_Sub4.aClass62_2203 = Class12_Sub12_Sub1
						.method276(arg2, 94, 74, false);
				Class12_Sub12_Sub7.method341();
				Class42.aClass62_986 = Class12_Sub12_Sub1.method276(arg2, 94,
						75, false);
				Class12_Sub12_Sub7.method341();
				byte[] is = arg0.method643(Class12_Sub9.aClass59_1754,
						Class11.aClass59_273, 255);
				Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = new Class12_Sub12_Sub7_Sub1(
						is, arg2);
				Class5.aClass62_148.method960(-1);
				class12_sub12_sub7_sub1.method355(0, 0);
				Class31.aClass62_771.method960(-1);
				class12_sub12_sub7_sub1.method355(-637, 0);
				Class35.aClass62_863.method960(-1);
				class12_sub12_sub7_sub1.method355(-128, 0);
				Class9.aClass62_214.method960(-1);
				class12_sub12_sub7_sub1.method355(-202, -371);
				Class26.aClass62_612.method960(-1);
				class12_sub12_sub7_sub1.method355(-202, -171);
				Class42.aClass62_984.method960(-1);
				class12_sub12_sub7_sub1.method355(0, -265);
				Class20.aClass62_471.method960(-1);
				class12_sub12_sub7_sub1.method355(-562, -265);
				Class12_Sub12_Sub4.aClass62_2203.method960(-1);
				int i = -8 / ((-11 - arg1) / 43);
				class12_sub12_sub7_sub1.method355(-128, -171);
				Class42.aClass62_986.method960(-1);
				class12_sub12_sub7_sub1.method355(-562, -171);
				int[] is_0_ = new int[class12_sub12_sub7_sub1.anInt2581];
				for (int i_1_ = 0; i_1_ < class12_sub12_sub7_sub1.anInt2579; i_1_++) {
					for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (class12_sub12_sub7_sub1.anInt2581 ^ 0xffffffff)); i_2_++)
						is_0_[i_2_] = (class12_sub12_sub7_sub1.anIntArray2578[(i_1_
								* class12_sub12_sub7_sub1.anInt2581
								+ -i_2_
								+ class12_sub12_sub7_sub1.anInt2581 - 1)]);
					for (int i_3_ = 0; class12_sub12_sub7_sub1.anInt2581 > i_3_; i_3_++)
						class12_sub12_sub7_sub1.anIntArray2578[i_3_ + i_1_
								* class12_sub12_sub7_sub1.anInt2581] = is_0_[i_3_];
				}
				Class5.aClass62_148.method960(-1);
				class12_sub12_sub7_sub1.method355(382, 0);
				Class31.aClass62_771.method960(-1);
				class12_sub12_sub7_sub1.method355(-255, 0);
				Class35.aClass62_863.method960(-1);
				class12_sub12_sub7_sub1.method355(254, 0);
				Class9.aClass62_214.method960(-1);
				class12_sub12_sub7_sub1.method355(180, -371);
				Class26.aClass62_612.method960(-1);
				class12_sub12_sub7_sub1.method355(180, -171);
				Class42.aClass62_984.method960(-1);
				class12_sub12_sub7_sub1.method355(382, -265);
				Class20.aClass62_471.method960(-1);
				class12_sub12_sub7_sub1.method355(-180, -265);
				Class12_Sub12_Sub4.aClass62_2203.method960(-1);
				class12_sub12_sub7_sub1.method355(254, -171);
				Class42.aClass62_986.method960(-1);
				class12_sub12_sub7_sub1.method355(-180, -171);
				class12_sub12_sub7_sub1 = Class17.method594(
						Class11.aClass59_273, 0, arg3, Class26.aClass59_617);
				Class35.aClass62_863.method960(-1);
				class12_sub12_sub7_sub1.method352(
						254 - class12_sub12_sub7_sub1.anInt2581 / 2, 18);
				Class12_Sub12_Sub10.aClass12_Sub12_Sub7_Sub2_2372 = Class12_Sub1
						.method145(arg3, Class10.aClass59_225, (byte) 123,
								Class11.aClass59_273);
				Class20.aClass12_Sub12_Sub7_Sub2_477 = Class12_Sub1.method145(
						arg3, Class12_Sub12_Sub1.aClass59_2039, (byte) -92,
						Class11.aClass59_273);
				RSSocket.aClass12_Sub12_Sub7_Sub2Array523 = Statics
						.method263(arg3, Class43.aClass59_1009,
								Class11.aClass59_273, -29072);
				Class12_Sub12_Sub4.aClass12_Sub12_Sub7_Sub1_2210 = new Class12_Sub12_Sub7_Sub1(
						128, 265);
				Game.aClass12_Sub12_Sub7_Sub1_1553 = new Class12_Sub12_Sub7_Sub1(
						128, 265);
				for (int i_4_ = 0; i_4_ < 33920; i_4_++)
					Class12_Sub12_Sub4.aClass12_Sub12_Sub7_Sub1_2210.anIntArray2578[i_4_] = Class5.aClass62_148.anIntArray1379[i_4_];
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -33921; i_5_++)
					Game.aClass12_Sub12_Sub7_Sub1_1553.anIntArray2578[i_5_] = Class31.aClass62_771.anIntArray1379[i_5_];
				Class12_Sub12_Sub8.anIntArray2298 = new int[256];
				for (int i_6_ = 0; i_6_ < 64; i_6_++)
					Class12_Sub12_Sub8.anIntArray2298[i_6_] = i_6_ * 262144;
				for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -65; i_7_++)
					Class12_Sub12_Sub8.anIntArray2298[64 + i_7_] = i_7_ * 1024 + 16711680;
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -65; i_8_++)
					Class12_Sub12_Sub8.anIntArray2298[128 + i_8_] = 16776960 + i_8_ * 4;
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -65; i_9_++)
					Class12_Sub12_Sub8.anIntArray2298[192 + i_9_] = 16777215;
				Class12_Sub12_Sub11_Sub6.anIntArray2886 = new int[256];
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -65; i_10_++)
					Class12_Sub12_Sub11_Sub6.anIntArray2886[i_10_] = i_10_ * 1024;
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -65; i_11_++)
					Class12_Sub12_Sub11_Sub6.anIntArray2886[64 + i_11_] = 65280 + 4 * i_11_;
				for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -65; i_12_++)
					Class12_Sub12_Sub11_Sub6.anIntArray2886[i_12_ + 128] = i_12_ * 262144 + 65535;
				for (int i_13_ = 0; i_13_ < 64; i_13_++)
					Class12_Sub12_Sub11_Sub6.anIntArray2886[192 + i_13_] = 16777215;
				Class15.anIntArray397 = new int[256];
				for (int i_14_ = 0; i_14_ < 64; i_14_++)
					Class15.anIntArray397[i_14_] = i_14_ * 4;
				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -65; i_15_++)
					Class15.anIntArray397[i_15_ - -64] = 262144 * i_15_ + 255;
				for (int i_16_ = 0; i_16_ < 64; i_16_++)
					Class15.anIntArray397[128 + i_16_] = 16711935 - -(i_16_ * 1024);
				for (int i_17_ = 0; i_17_ < 64; i_17_++)
					Class15.anIntArray397[i_17_ + 192] = 16777215;
				RSApplet.anIntArray36 = new int[32768];
				Class29.anIntArray714 = new int[32768];
				Class39.anIntArray929 = new int[256];
				Class35.method726(null, -102);
				Class12_Sub12_Sub6.anInt2250 = 0;
				Class11.aClass59_260 = Class11.aClass59_273;
				Class12_Sub12_Sub11_Sub2_Sub1.anIntArray2929 = new int[32768];
				Class11.aClass59_301 = Class11.aClass59_273;
				Class12_Sub6.anIntArray1702 = new int[32768];
				if (Class30.anInt744 == 0 || Class21.aBoolean483)
					Class11.method139(10, (byte) 109);
				else
					Class11.method130(Class38.aClass59_926,
							(Cache.midiSongsArchive),
							Class11.aClass59_273, -1507274585, false, 10, 0,
							Class30.anInt744);
				Class40.method754(false, 4);
				Class44.aBoolean1047 = true;
				Class27.aBoolean642 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wa.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method558(Buffer arg0, byte arg1) {
		try {
			if (arg1 < -78) {
				for (;;) {
					int i = arg0.readUByte();
					if ((i ^ 0xffffffff) == -1)
						break;
					method560(-107, i, arg0);
				}
				anInt2550++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wa.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static void method559(boolean arg0) {
		try {
			aClass59_2535 = null;
			aClass59_2543 = null;
			aClass59_2533 = null;
			aClass59_2554 = null;
			aClass59_2534 = null;
			aClass59_2532 = null;
			aClass59_2542 = null;
			aClass27_2553 = null;
			aClass59_2556 = null;
			aClass59_2555 = null;
			aFrame2539 = null;
			aClass12_Sub12_Sub7_Sub2Array2545 = null;
			aClass59_2541 = null;
			Cache.modelsArchive = null;
			aClass59_2540 = null;
			aClass12_Sub12_Sub3ArrayArray2548 = null;
			aClass59_2549 = null;
			aClass59_2552 = null;
			aClass59_2537 = null;
			aClass59_2536 = null;
			if (arg0 != false)
				method559(true);
			aClass59_2538 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wa.C(" + arg0 + ')');
		}
	}

	public void method560(int arg0, int arg1, Buffer arg2) {
		try {
			if ((arg1 ^ 0xffffffff) == -6)
				anInt2551 = arg2.readShortBE();
			if (arg0 <= -83)
				anInt2546++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wa.A(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass59_2540 = (Class55.method898(
				"Moderator option: Mute player for 48 hours: <ON>", -10983));
		aClass59_2538 = Class55.method898("Continue", -10983);
		aClass59_2534 = Class55.method898(
				"as it was used to break our rules)3", -10983);
		aClass59_2535 = aClass59_2540;
		aClass59_2533 = Class55.method898("Loaded fonts", -10983);
		aClass59_2532 = aClass59_2538;
		aClass59_2536 = aClass59_2534;
		aClass59_2542 = Class55.method898("@cr1@", -10983);
		aClass59_2549 = aClass59_2533;
		aClass59_2554 = Class55.method898("Please wait)3)3)3", -10983);
		aClass59_2556 = Class55.method898("Login limit exceeded)3", -10983);
		aClass59_2555 = Class55.method898("wishes to trade with you)3", -10983);
		aClass59_2552 = aClass59_2554;
		aClass59_2537 = aClass59_2556;
		aBoolean2559 = false;
		aClass59_2543 = aClass59_2555;
		aClass27_2553 = new Class27(64);
		anInt2560 = 0;
	}
}
