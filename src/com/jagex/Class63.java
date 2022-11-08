package com.jagex;/* com.jagex.Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;
import com.jagex.util.Statics;

public class Class63 {
	public static int anInt1388 = 0;
	public boolean[] aBooleanArray1389;
	public static int anInt1390;
	public byte[] aByteArray1391 = new byte[18002];
	public int anInt1392;
	public int anInt1393 = 0;
	public int anInt1394;
	public static int anInt1395;
	public byte aByte1396;
	public static RSString aClass59_1397;
	public static Class12_Sub12_Sub11_Sub2_Sub2[] aClass12_Sub12_Sub11_Sub2_Sub2Array1398;
	public static int anInt1399;
	public static int anInt1400;
	public byte[] aByteArray1401;
	public byte[] aByteArray1402;
	public static RSString aClass59_1403 = Class55.method898("::", -10983);
	public static int anInt1404;
	public int anInt1405;
	public static int[] anIntArray1406 = { 1, 0, -1, 0 };
	public int[] anIntArray1407;
	public byte[][] aByteArrayArray1408;
	public int anInt1409;
	public int[] anIntArray1410;
	public int anInt1411;
	public static int anInt1412;
	public static int anInt1413;
	public byte[] aByteArray1414;
	public byte[] aByteArray1415;
	public int anInt1416;
	public byte[] aByteArray1417;
	public static int anInt1418 = -1;
	public int anInt1419;
	public int[] anIntArray1420;
	public static RSString aClass59_1421 = Class55.method898("Hidden", -10983);
	public int anInt1422;
	public int anInt1423;
	public static RSString aClass59_1424;
	public int[][] anIntArrayArray1425;
	public int anInt1426;
	public static Class26 aClass26_1427;
	public int anInt1428;
	public int[][] anIntArrayArray1429;
	public int[][] anIntArrayArray1430;
	public boolean[] aBooleanArray1431;
	public int anInt1432;
	public int[] anIntArray1433;
	public int anInt1434;
	public static int[] anIntArray1435;
	public static int anInt1436;
	public int anInt1437;

	public static void method966(int arg0) {
		try {
			anInt1390++;
			Class35.aClass9_866.method108((byte) 85);
			for (int i = arg0; i < 32; i++)
				Class20.aLongArray476[i] = 0L;
			for (int i = 0; (i ^ 0xffffffff) > -33; i++)
				Class39.aLongArray943[i] = 0L;
			Class12_Sub12_Sub8.anInt2292 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wb.G(" + arg0 + ')');
		}
	}

	public static void method967(int arg0) {
		anInt1413++;
		Class41.aClass27_963.method675(true);
		if (arg0 < 109)
			method966(-18);
	}

	public static Class12_Sub12_Sub6 method968(int arg0, int arg1) {
		try {
			if (arg0 != 853)
				method969((byte) -118, null);
			anInt1400++;
			Class12_Sub12_Sub6 class12_sub12_sub6 = ((Class12_Sub12_Sub6) RSString.aClass27_1522
					.method673(115, (long) arg1));
			if (class12_sub12_sub6 != null)
				return class12_sub12_sub6;
			byte[] is = RuntimeException_Sub1.aClass26_1463.method631(3, true,
					arg1);
			class12_sub12_sub6 = new Class12_Sub12_Sub6();
			if (is != null)
				class12_sub12_sub6.method331(-61, new Buffer(is));
			RSString.aClass27_1522.method678((byte) 123, class12_sub12_sub6,
					(long) arg1);
			return class12_sub12_sub6;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wb.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static boolean method969(byte arg0, Class12_Sub12_Sub3 arg1) {
		try {
			int i = arg1.anInt2180;
			anInt1399++;
			if (RSCanvas.anInt59 == 2) {
				if (i == 201) {
					Class11.aClass59_297 = Class11.aClass59_310;
					Class11.aClass59_290 = Class41.aClass59_958;
					Class8.aBoolean182 = true;
					Class1.anInt85 = 0;
					Class9.anInt211 = 1;
					Class12_Sub4.aBoolean1671 = true;
				}
				if (i == 202) {
					Class8.aBoolean182 = true;
					Class12_Sub4.aBoolean1671 = true;
					Class11.aClass59_290 = Class12_Sub12_Sub1.aClass59_2029;
					Class9.anInt211 = 2;
					Class1.anInt85 = 0;
					Class11.aClass59_297 = Class11.aClass59_310;
				}
			}
			if (i == 205) {
				Class62_Sub2.anInt1918 = 250;
				return true;
			}
			if (i == 501) {
				Class12_Sub4.aBoolean1671 = true;
				Class8.aBoolean182 = true;
				Class9.anInt211 = 4;
				Class11.aClass59_297 = Class11.aClass59_310;
				Class1.anInt85 = 0;
				Class11.aClass59_290 = Class36.aClass59_889;
			}
			if (i == 502) {
				Class11.aClass59_297 = Class11.aClass59_310;
				Class1.anInt85 = 0;
				Class12_Sub4.aBoolean1671 = true;
				Class9.anInt211 = 5;
				Class11.aClass59_290 = Statics.aClass59_2027;
				Class8.aBoolean182 = true;
			}
			if ((i ^ 0xffffffff) <= -301 && (i ^ 0xffffffff) >= -314) {
				int i_0_ = i & 0x1;
				int i_1_ = (-300 + i) / 2;
				Class49.aClass42_1140.method766(false, i_1_,
						(i_0_ ^ 0xffffffff) == -2);
			}
			if (i >= 314 && (i ^ 0xffffffff) >= -324) {
				int i_2_ = 0x1 & i;
				int i_3_ = (-314 + i) / 2;
				Class49.aClass42_1140.method759((i_2_ ^ 0xffffffff) == -2,
						i_3_, -1);
			}
			if ((i ^ 0xffffffff) == -325)
				Class49.aClass42_1140.method765(0, false);
			if ((i ^ 0xffffffff) == -326)
				Class49.aClass42_1140.method765(0, true);
			if (i == 326) {
				Class15.anInt404++;
				Game.outBuffer.writePacket(48);
				Class49.aClass42_1140.method768(0,
						Game.outBuffer);
				return true;
			}
			if (arg0 != -53)
				method969((byte) -91, null);
			if (i == 620)
				Game.aBoolean1565 = !Game.aBoolean1565;
			if ((i ^ 0xffffffff) <= -602 && (i ^ 0xffffffff) >= -614) {
				Class64_Sub1.method991(true);
				if (Class11.aClass59_278.length() > 0) {
					Class40.anInt954++;
					Game.outBuffer.writePacket(243);
					Game.outBuffer.writeLongBE(
                            Class11.aClass59_278.method912(119));
					Game.outBuffer.writeByte(-601
							+ i);
					Game.outBuffer.writeByte(
							!Game.aBoolean1565 ? 0 : 1);
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wb.D(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method970(int arg0, int arg1, int arg2) {
		try {
			if (arg1 <= -107) {
				anInt1412++;
				int i = 0;
				for (int i_4_ = 0; i_4_ < 100; i_4_++) {
					if (Class26.aClass59Array591[i_4_] != null) {
						int i_5_ = Class30.anIntArray746[i_4_];
						int i_6_ = -(i * 14) + 70 - (-Class17.anInt421 - 4);
						if ((i_6_ ^ 0xffffffff) > 19)
							break;
						RSString class59 = Class12_Sub12_Sub8.aClass59Array2301[i_4_];
						if (i_5_ == 0)
							i++;
						if (class59 != null
								&& class59.method928(
										(Class12_Sub12_Sub16.aClass59_2542), 0))
							class59 = class59.method945(63, 5);
						if (class59 != null
								&& class59.method928(
										(Class12_Sub12_Sub6.aClass59_2259), 0))
							class59 = class59.method945(63, 5);
						if (((i_5_ ^ 0xffffffff) == -2 || (i_5_ ^ 0xffffffff) == -3)
								&& (i_5_ == 1 || Class31.anInt757 == 0 || (Class31.anInt757 == 1 && Class12_Sub12_Sub11_Sub5
										.method506(38, class59)))) {
							i++;
							if (arg0 > -14 + i_6_
									&& (i_6_ ^ 0xffffffff) <= (arg0 ^ 0xffffffff)
									&& !(class59
											.method934(
													(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.aClass59_2951),
													17706))) {
								Class12_Sub12_Sub12.anInt2410++;
								Class13.anInt339++;
								if (Class12_Sub12_Sub6.anInt2267 >= 1) {
									Class64.method977(
											0,
											0,
											44,
											0,
											(Statics
													.method251(
															(byte) -42,
															(new RSString[] {
																	(Class28.aClass59_683),
																	(Class40.aClass59_946),
																	class59 }))),
											-109);
									Class36.anInt882++;
								}
								Class64.method977(0, 0, 15, 0, (Statics
										.method251((byte) -76,
												(new RSString[] {
														Class17.aClass59_414,
														Class40.aClass59_946,
														class59 }))), -103);
								Class64.method977(0, 0, 17, 0, (Statics
										.method251((byte) -69,
												(new RSString[] {
														Class21.aClass59_485,
														Class40.aClass59_946,
														class59 }))), -124);
							}
						}
						if (((i_5_ ^ 0xffffffff) == -4 || (i_5_ ^ 0xffffffff) == -8)
								&& Class35.anInt862 == 0
								&& ((i_5_ ^ 0xffffffff) == -8
										|| ((Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) == -1) || ((Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) == -2 && Class12_Sub12_Sub11_Sub5
										.method506(90, class59)))) {
							if (arg0 > -14 + i_6_ && arg0 <= i_6_) {
								if ((Class12_Sub12_Sub6.anInt2267 ^ 0xffffffff) <= -2) {
									Class36.anInt882++;
									Class64.method977(
											0,
											0,
											44,
											0,
											(Statics
													.method251(
															(byte) -127,
															(new RSString[] {
																	(Class28.aClass59_683),
																	(Class40.aClass59_946),
																	class59 }))),
											-98);
								}
								Class64.method977(0, 0, 15, 0, (Statics
										.method251((byte) -90,
												(new RSString[] {
														Class17.aClass59_414,
														Class40.aClass59_946,
														class59 }))), -113);
								Class13.anInt339++;
								Class12_Sub12_Sub12.anInt2410++;
								Class64.method977(0, 0, 17, 0, (Statics
										.method251((byte) -80,
												(new RSString[] {
														Class21.aClass59_485,
														Class40.aClass59_946,
														class59 }))), -56);
							}
							i++;
						}
						if ((i_5_ ^ 0xffffffff) == -5
								&& ((Class4.anInt138 ^ 0xffffffff) == -1 || ((Class4.anInt138 ^ 0xffffffff) == -2 && Class12_Sub12_Sub11_Sub5
										.method506(105, class59)))) {
							if (i_6_ + -14 < arg0
									&& (i_6_ ^ 0xffffffff) <= (arg0 ^ 0xffffffff)) {
								Class64.method977(0, 0, 24, 0, (Statics
										.method251((byte) -74,
												(new RSString[] {
														Class41.aClass59_972,
														Class40.aClass59_946,
														class59 }))), -57);
								Class51.anInt1192++;
							}
							i++;
						}
						if ((i_5_ == 5 || (i_5_ ^ 0xffffffff) == -7)
								&& Class35.anInt862 == 0
								&& ((Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) > -3))
							i++;
						if ((i_5_ ^ 0xffffffff) == -9
								&& ((Class4.anInt138 ^ 0xffffffff) == -1 || ((Class4.anInt138 ^ 0xffffffff) == -2 && Class12_Sub12_Sub11_Sub5
										.method506(99, class59)))) {
							i++;
							if ((i_6_ - 14 ^ 0xffffffff) > (arg0 ^ 0xffffffff)
									&& arg0 <= i_6_) {
								Class12_Sub12.anInt1842++;
								Class64.method977(0, 0, 35, 0, (Statics
										.method251((byte) -95,
												(new RSString[] {
														Class12.aClass59_334,
														Class40.aClass59_946,
														class59 }))), -71);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("wb.A(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public static boolean method971(int arg0, int arg1) {
		try {
			if (arg1 != -1)
				return false;
			anInt1395++;
			if (!Class15.method589(arg0, arg1 ^ ~0x38f9))
				return false;
			boolean bool = false;
			Class12_Sub12_Sub3[] class12_sub12_sub3s = Class12_Sub12_Sub16.aClass12_Sub12_Sub3ArrayArray2548[arg0];
			for (int i = 0; class12_sub12_sub3s.length > i; i++) {
				Class12_Sub12_Sub3 class12_sub12_sub3 = class12_sub12_sub3s[i];
				if (class12_sub12_sub3 != null
						&& (class12_sub12_sub3.anInt2141 ^ 0xffffffff) == -7) {
					if ((class12_sub12_sub3.anInt2142 ^ 0xffffffff) != 0
							|| class12_sub12_sub3.anInt2129 != -1) {
						boolean bool_7_ = Class27.method670(class12_sub12_sub3,
								57);
						int i_8_;
						if (!bool_7_)
							i_8_ = class12_sub12_sub3.anInt2142;
						else
							i_8_ = class12_sub12_sub3.anInt2129;
						if ((i_8_ ^ 0xffffffff) != 0) {
							Class12_Sub12_Sub4 class12_sub12_sub4 = Class5
									.method74(9, i_8_);
							class12_sub12_sub3.anInt2110 += Class12_Sub12_Sub11_Sub6.anInt2903;
							while (class12_sub12_sub3.anInt2110 > (class12_sub12_sub4.anIntArray2215[class12_sub12_sub3.anInt2132])) {
								class12_sub12_sub3.anInt2110 -= (class12_sub12_sub4.anIntArray2215[class12_sub12_sub3.anInt2132]);
								class12_sub12_sub3.anInt2132++;
								bool = true;
								if ((class12_sub12_sub3.anInt2132 ^ 0xffffffff) <= ((class12_sub12_sub4.anIntArray2207).length ^ 0xffffffff)) {
									class12_sub12_sub3.anInt2132 -= class12_sub12_sub4.anInt2200;
									if ((class12_sub12_sub3.anInt2132 ^ 0xffffffff) > -1
											|| (((class12_sub12_sub4.anIntArray2207).length ^ 0xffffffff) >= (class12_sub12_sub3.anInt2132 ^ 0xffffffff)))
										class12_sub12_sub3.anInt2132 = 0;
								}
							}
						}
					}
					if ((class12_sub12_sub3.anInt2183 ^ 0xffffffff) != -1) {
						bool = true;
						int i_9_ = class12_sub12_sub3.anInt2183 >> -2039138000;
						int i_10_ = (class12_sub12_sub3.anInt2183 << 718956528 >> -1990699952);
						i_9_ *= Class12_Sub12_Sub11_Sub6.anInt2903;
						class12_sub12_sub3.anInt2147 = 0x7ff
								& class12_sub12_sub3.anInt2147 + i_9_;
						i_10_ *= Class12_Sub12_Sub11_Sub6.anInt2903;
						class12_sub12_sub3.anInt2123 = 0x7ff
								& class12_sub12_sub3.anInt2123 - -i_10_;
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wb.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static void method972(int arg0) {
		try {
			aClass12_Sub12_Sub11_Sub2_Sub2Array1398 = null;
			anIntArray1406 = null;
			if (arg0 != 13087)
				anInt1388 = 59;
			anIntArray1435 = null;
			aClass59_1421 = null;
			aClass59_1397 = null;
			aClass26_1427 = null;
			aClass59_1424 = null;
			aClass59_1403 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "wb.F(" + arg0 + ')');
		}
	}

	public Class63() {
		aBooleanArray1389 = new boolean[256];
		aByteArray1417 = new byte[256];
		aByteArray1414 = new byte[4096];
		aByteArray1401 = new byte[18002];
		anInt1411 = 0;
		anIntArray1407 = new int[256];
		anIntArray1410 = new int[16];
		anIntArrayArray1425 = new int[6][258];
		aByteArrayArray1408 = new byte[6][258];
		anIntArray1420 = new int[6];
		anIntArrayArray1430 = new int[6][258];
		aBooleanArray1431 = new boolean[16];
		anIntArray1433 = new int[257];
		anIntArrayArray1429 = new int[6][258];
	}

	static {
		aClass12_Sub12_Sub11_Sub2_Sub2Array1398 = new Class12_Sub12_Sub11_Sub2_Sub2[2048];
		aClass59_1397 = Class55.method898("::errortest", -10983);
		aClass59_1424 = aClass59_1421;
		anIntArray1435 = new int[32];
		int i = 2;
		for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -33; i_11_++) {
			anIntArray1435[i_11_] = -1 + i;
			i += i;
		}
	}
}
