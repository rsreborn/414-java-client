package com.jagex;/* com.jagex.Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class14 {
	public static RSString aClass59_358 = Class55.method898("p12_full", -10983);
	public static int anInt359;
	public static int anInt360;
	public static int anInt361;
	public static int anInt362;
	public static int anInt363;
	public static int anInt364;
	public static Class62 aClass62_365;
	public static int anInt366;
	public static RSString aClass59_367 = Class55.method898("Walk here", -10983);
	public static RSString aClass59_368;
	public static int anInt369;
	public static RSString aClass59_370 = Class55.method898("0(U", -10983);
	public static RSString aClass59_371;
	public static RSString aClass59_372 = aClass59_367;
	public static int anInt373;
	public static RSString aClass59_374;
	public static RSString aClass59_375;
	public static int anInt376;
	public static int anInt377;

	public static synchronized void method566(int arg0, Class12_Sub5 arg1) {
		try {
			Archive.aClass12_Sub5_1902 = arg1;
			if (arg0 >= 95)
				anInt363++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("eb.G(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method567(Class26 arg0, Class26 arg1, Class26 arg2,
			int arg3) {
		try {
			if (arg3 != 0)
				method575(88, -69);
			anInt364++;
			Class55.aClass26_1298 = arg1;
			Class12_Sub12_Sub11_Sub3.aClass26_2769 = arg2;
			Class12_Sub12_Sub11_Sub1.aClass26_2655 = arg0;
			Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548 = (new Class12_Sub12_Sub3[Class55.aClass26_1298
					.method653(-1)][]);
			Class30.aBooleanArray749 = new boolean[Class55.aClass26_1298
					.method653(-1)];
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("eb.H("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public static synchronized void method568(int[] arg0, int arg1) {
		int i = 0;
		arg1 -= 7;
		while (i < arg1) {
			arg0[i++] = 0;
			arg0[i++] = 0;
			arg0[i++] = 0;
			arg0[i++] = 0;
			arg0[i++] = 0;
			arg0[i++] = 0;
			arg0[i++] = 0;
			arg0[i++] = 0;
		}
		arg1 += 7;
		while (i < arg1)
			arg0[i++] = 0;
		if (Archive.aClass12_Sub5_1902 != null)
			Archive.aClass12_Sub5_1902.method163(arg0, 0, arg1);
		Class41.method755(arg1, -100);
	}

	public static void method569(int arg0, boolean arg1) {
		try {
			Class44.aBoolean1038 = arg1;
			if (Class44.aBoolean1038) {
				int i = Game.inBuffer.method214(512);
				int i_0_ = Game.inBuffer
						.method227((byte) 114);
				int i_1_ = Game.inBuffer.method230(false);
				Game.inBuffer.initBitAccess();
				for (int i_2_ = 0; i_2_ < 4; i_2_++) {
					for (int i_3_ = 0; i_3_ < 13; i_3_++) {
						for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -14; i_4_++) {
							int i_5_ = Game.inBuffer
									.readBits(1);
							if ((i_5_ ^ 0xffffffff) == -2)
								Class12_Sub12_Sub5.anIntArrayArrayArray2246[i_2_][i_3_][i_4_] = Game.inBuffer
										.readBits(26);
							else
								Class12_Sub12_Sub5.anIntArrayArrayArray2246[i_2_][i_3_][i_4_] = -1;
						}
					}
				}
				Game.inBuffer.finishBitAccess();
				int i_6_ = ((-Game.inBuffer.position + Class5.anInt159) / 16);
				Class58.anIntArrayArray1350 = new int[i_6_][4];
				for (int i_7_ = 0; (i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
					for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -5; i_8_++)
						Class58.anIntArrayArray1350[i_7_][i_8_] = Game.inBuffer
								.method215((byte) 94);
				}
				int i_9_ = Game.inBuffer.method236(-12543);
				int i_10_ = Game.inBuffer.method236(-12543);
				Class26.aByteArrayArray597 = new byte[i_6_][];
				Class48.anIntArray1125 = new int[i_6_];
				Class12_Sub12_Sub3.anIntArray2157 = new int[i_6_];
				Statics.anIntArray573 = new int[i_6_];
				Class40.aByteArrayArray957 = new byte[i_6_][];
				i_6_ = 0;
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++) {
					for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -14; i_12_++) {
						for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -14; i_13_++) {
							int i_14_ = (Class12_Sub12_Sub5.anIntArrayArrayArray2246[i_11_][i_12_][i_13_]);
							if ((i_14_ ^ 0xffffffff) != 0) {
								int i_15_ = (i_14_ & 0x3ff8) >> 420343715;
								int i_16_ = (i_14_ & 0xffd59b) >> -1824033266;
								int i_17_ = i_15_ / 8
										+ (i_16_ / 8 << -1231760600);
								for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)); i_18_++) {
									if ((Statics.anIntArray573[i_18_] ^ 0xffffffff) == (i_17_ ^ 0xffffffff)) {
										i_17_ = -1;
										break;
									}
								}
								if ((i_17_ ^ 0xffffffff) != 0) {
									Statics.anIntArray573[i_6_] = i_17_;
									int i_19_ = i_17_ & 0xff;
									int i_20_ = i_17_ >> 1913043304 & 0xff;
									Class48.anIntArray1125[i_6_] = (Cache.mapsArchive
											.method649(
													(Statics
															.method251(
																	(byte) -103,
																	(new RSString[] {
																			Class35.aClass59_869,
																			Class19.method599(
																					i_20_,
																					10),
																			Class64_Sub2.aClass59_1983,
																			Class19.method599(
																					i_19_,
																					10) }))),
													-22814));
									Class12_Sub12_Sub3.anIntArray2157[i_6_] = (Cache.mapsArchive
											.method649(
													(Statics
															.method251(
																	(byte) -66,
																	(new RSString[] {
																			Class10.aClass59_249,
																			Class19.method599(
																					i_20_,
																					10),
																			Class64_Sub2.aClass59_1983,
																			Class19.method599(
																					i_19_,
																					10) }))),
													-22814));
									i_6_++;
								}
							}
						}
					}
				}
				Class49.method802(i_1_, 0, i_9_, i_0_, i, i_10_);
			} else {
				int i = Game.inBuffer.method227((byte) 105);
				int i_21_ = Game.inBuffer.method214(512);
				int i_22_ = Game.inBuffer.method214(512);
				int i_23_ = ((Class5.anInt159 + -Game.inBuffer.position) / 16);
				Class58.anIntArrayArray1350 = new int[i_23_][4];
				for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
					for (int i_25_ = 0; i_25_ < 4; i_25_++)
						Class58.anIntArrayArray1350[i_24_][i_25_] = Game.inBuffer
								.method222(true);
				}
				boolean bool = false;
				if ((i / 8 == 48 || i / 8 == 49) && i_22_ / 8 == 48)
					bool = true;
				int i_26_ = Game.inBuffer.method230(false);
				if ((i / 8 ^ 0xffffffff) == -49
						&& (i_22_ / 8 ^ 0xffffffff) == -149)
					bool = true;
				int i_27_ = Game.inBuffer.method214(512);
				Class26.aByteArrayArray597 = new byte[i_23_][];
				Statics.anIntArray573 = new int[i_23_];
				Class12_Sub12_Sub3.anIntArray2157 = new int[i_23_];
				Class48.anIntArray1125 = new int[i_23_];
				Class40.aByteArrayArray957 = new byte[i_23_][];
				i_23_ = 0;
				for (int i_28_ = (-6 + i) / 8; (i - -6) / 8 >= i_28_; i_28_++) {
					for (int i_29_ = (-6 + i_22_) / 8; i_29_ <= (6 + i_22_) / 8; i_29_++) {
						int i_30_ = i_29_ + (i_28_ << 1417377160);
						if (!bool
								|| (i_29_ != 49 && i_29_ != 149 && i_29_ != 147
										&& i_28_ != 50 && (i_28_ != 49 || (i_29_ ^ 0xffffffff) != -48))) {
							Statics.anIntArray573[i_23_] = i_30_;
							Class48.anIntArray1125[i_23_] = (Cache.mapsArchive
									.method649(
											(Statics
													.method251(
															(byte) -125,
															(new RSString[] {
																	Class35.aClass59_869,
																	Class19.method599(
																			i_28_,
																			10),
																	Class64_Sub2.aClass59_1983,
																	Class19.method599(
																			i_29_,
																			10) }))),
											-22814));
							Class12_Sub12_Sub3.anIntArray2157[i_23_] = (Cache.mapsArchive
									.method649(
											(Statics
													.method251(
															(byte) -34,
															(new RSString[] {
																	Class10.aClass59_249,
																	Class19.method599(
																			i_28_,
																			10),
																	Class64_Sub2.aClass59_1983,
																	Class19.method599(
																			i_29_,
																			10) }))),
											-22814));
							i_23_++;
						}
					}
				}
				Class49.method802(i_26_, 0, i, i_21_, i_22_, i_27_);
			}
			if (arg0 >= 34)
				anInt360++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "eb.I(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static RSString method570(int arg0, boolean arg1, Buffer arg2) {
		try {
			anInt377++;
			try {
				RSString class59 = new RSString();
				class59.anInt1480 = arg2.method231(!arg1);
				if ((arg0 ^ 0xffffffff) > (class59.anInt1480 ^ 0xffffffff))
					class59.anInt1480 = arg0;
				class59.chars = new byte[class59.anInt1480];
				arg2.position += Class23.aClass15_510.method590(
						arg2.payload, class59.anInt1480,
						class59.chars, arg2.position, 0, (byte) -91);
				if (arg1 != true)
					aClass59_372 = null;
				return class59;
			} catch (Exception exception) {
				return Class44.aClass59_1039;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("eb.E(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method571(long arg0) {
		try {
			anInt361++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "eb.A(" + arg0 + ')');
		}
	}

	public Class14(int arg0) {
		try {
			Class19.anInt446 = arg0;
			Class12_Sub12_Sub1.aLong2048 = System.currentTimeMillis();
		} catch (RuntimeException runtimeexception) {
			throw Class35
					.method724(runtimeexception, "eb.<init>(" + arg0 + ')');
		}
	}

	public static void method572(int arg0) {
		try {
			anInt366++;
			if (arg0 == 11128) {
				System.out
						.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
				System.exit(1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "eb.J(" + arg0 + ')');
		}
	}

	public void method573() {
		try {
			anInt369++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "eb.B(" + ')');
		}
	}

	public static void method574(int arg0) {
		try {
			aClass59_370 = null;
			aClass59_358 = null;
			aClass59_375 = null;
			if (arg0 != 11366)
				anInt373 = 66;
			aClass62_365 = null;
			aClass59_374 = null;
			aClass59_372 = null;
			aClass59_368 = null;
			aClass59_371 = null;
			aClass59_367 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "eb.D(" + arg0 + ')');
		}
	}

	public static synchronized void method575(int arg0, int arg1) {
		try {
			anInt362++;
			if (Archive.aClass12_Sub5_1902 != null)
				Archive.aClass12_Sub5_1902.method165(arg0);
			if (arg1 != 3328)
				method568(null, -87);
			Class41.method755(arg0, -122);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "eb.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		aClass59_368 = Class55.method898("Hide", -10983);
		aClass59_371 = Class55.method898(" ", -10983);
		aClass59_374 = aClass59_368;
		aClass59_375 = Class55.method898("backvmid2", -10983);
	}
}
