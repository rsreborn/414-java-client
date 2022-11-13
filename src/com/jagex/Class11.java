package com.jagex;/* com.jagex.Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.util.Statics;

import java.awt.Graphics;

public class Class11 {
	public static RSString aClass59_251;
	public static RSString aClass59_252;
	public static RSString aClass59_253;
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array254;
	public static int anInt255;
	public static RSString aClass59_256 = Class55.method898("::fpsoff", -10983);
	public static RSString aClass59_257;
	public static RSString aClass59_258;
	public static int anInt259;
	public static RSString aClass59_260;
	public static RSString aClass59_261;
	public static RSString aClass59_262;
	public static RSString aClass59_263;
	public static RSString aClass59_264;
	public static RSString aClass59_265;
	public static int anInt266;
	public static RSString aClass59_267;
	public static RSString aClass59_268;
	public static RSString aClass59_269;
	public static RSString aClass59_270;
	public static RSString aClass59_271;
	public static RSString aClass59_272;
	public static RSString aClass59_273 = Class55.method898("", -10983);
	public static RSString aClass59_274;
	public static RSString aClass59_275;
	public static RSString aClass59_276;
	public static RSString aClass59_277;
	public static RSString aClass59_278;
	public static RSString aClass59_279;
	public static Class10[] aClass10Array280;
	public static RSString aClass59_281;
	public static int anInt282;
	public static RSString aClass59_283;
	public static int anInt284;
	public static RSString aClass59_285;
	public static int anInt286;
	public static int anInt287;
	public static RSString aClass59_288;
	public static RSString aClass59_289;
	public static RSString aClass59_290;
	public static int anInt291;
	public static int anInt292;
	public static int anInt293;
	public static int anInt294;
	public static RSString aClass59_295;
	public static RSString aClass59_296;
	public static RSString aClass59_297;
	public static RSString aClass59_298;
	public static RSString aClass59_299;
	public static RSString aClass59_300;
	public static RSString aClass59_301;
	public static RSString aClass59_302;
	public static RSString aClass59_303;
	public static RSString aClass59_304;
	public static RSString aClass59_305;
	public static RSString aClass59_306;
	public static int anInt307;
	public static RSString aClass59_308;
	public static RSString aClass59_309;
	public static RSString aClass59_310;
	public static RSString aClass59_311;
	public static RSString aClass59_312;
	public static RSString aClass59_313;

	public static synchronized void method130(RSString arg0, Class26 arg1,
                                              RSString arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
		try {
			if (arg3 == -1507274585) {
				anInt286++;
				if (Class12_Sub12_Sub11_Sub3.method464(arg3 ^ ~0x59d76a02)) {
					int i = arg1.hashFileName(arg0, -22814);
					int i_0_ = arg1.method655(i, (byte) 57, arg2);
					method140((byte) 113, i_0_, arg5, arg7, arg4, arg6, i, arg1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ce.I("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')'));
		}
	}

	public static synchronized void method131(boolean arg0) {
		anInt255++;
		if (Class12_Sub12_Sub11_Sub3.method464(17754)) {
			if (Class49.aBoolean1158) {
				byte[] is = Class35.method725(
						Class12_Sub12_Sub11_Sub6.anInt2905,
						(Class12_Sub12_Sub11_Sub2_Sub1.aClass26_2937),
						Class12_Sub12_Sub3.anInt2175, Class14.anInt376,
						(byte) 120);
				if (is != null) {
					if ((Class12.anInt330 ^ 0xffffffff) <= -1)
						Class40.method750(Class32.aBoolean793,
								Class12.anInt330, Game.anInt1566, is, 15204);
					else if ((Class14.anInt373 ^ 0xffffffff) <= -1)
						Class8.method104(Class14.anInt373, -1,
								Class32.aBoolean793, is, Game.anInt1566);
					else
						Class7.method83((byte) -81, Game.anInt1566, is,
								Class32.aBoolean793);
					Class12_Sub12_Sub11_Sub2_Sub1.aClass26_2937 = null;
					Class49.aBoolean1158 = false;
				}
			}
			Class12_Sub2.method153(0);
			if (arg0 != false)
				aClass59_305 = null;
		}
	}

	public static void method132(boolean arg0) {
		try {
			anInt266++;
			try {
				if (arg0 != false)
					aClass59_300 = null;
				Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
						.getGraphics();
				Class7.aClass62_1528.method957(-5917, 4, 0, graphics);
				Class12_Sub12_Sub12.aClass62_2418.method957(-5917, 357, 0,
						graphics);
				Class64.aClass62_1443.method957(-5917, 4, 722, graphics);
				Class12_Sub12_Sub15.aClass62_2491.method957(-5917, 205, 743,
						graphics);
				Class35.aClass62_864.method957(-5917, 0, 0, graphics);
				Class21.aClass62_488.method957(-5917, 4, 516, graphics);
				Class62.aClass62_1377.method957(-5917, 205, 516, graphics);
				Class12_Sub6.aClass62_1694.method957(-5917, 357, 496, graphics);
				Class31.aClass62_765.method957(-5917, 338, 0, graphics);
			} catch (Exception exception) {
				Class12_Sub12_Sub5.aCanvas2243.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ce.B(" + arg0 + ')');
		}
	}

	public static void method133(int arg0) {
		try {
			anInt259++;
			if ((Class35.anInt862 ^ 0xffffffff) != -1) {
				int i = 81 / ((55 - arg0) / 56);
				int i_1_ = 0;
				if ((Class12_Sub1.anInt1617 ^ 0xffffffff) != -1)
					i_1_ = 1;
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -101; i_2_++) {
					if (Class26.aClass59Array591[i_2_] != null) {
						RSString class59 = Class12_Sub12_Sub8.aClass59Array2301[i_2_];
						int i_3_ = Class30.anIntArray746[i_2_];
						if (class59 != null
								&& class59.method928(
										(Class12_Sub12_Sub16.aClass59_2542), 0))
							class59 = class59.method945(63, 5);
						if (class59 != null
								&& class59.method928(
										(Class12_Sub12_Sub6.aClass59_2259), 0))
							class59 = class59.method945(63, 5);
						if (((i_3_ ^ 0xffffffff) == -4 || (i_3_ ^ 0xffffffff) == -8)
								&& (i_3_ == 7
										|| Class12_Sub12_Sub3.anInt2154 == 0 || ((Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) == -2 && Class12_Sub12_Sub11_Sub5
										.method506(55, class59)))) {
							int i_4_ = 329 + -(13 * i_1_);
							i_1_++;
							if (Class18.anInt432 > 4
									&& ((-10 + i_4_ ^ 0xffffffff) > (-4
											+ Class12_Sub12_Sub3.anInt2176 ^ 0xffffffff))
									&& (Class12_Sub12_Sub3.anInt2176 + -4 <= i_4_ + 3)) {
								int i_5_ = 25 + (Class12_Sub12_Sub15.aClass12_Sub12_Sub7_Sub4_2529
										.method401(Statics
												.method251(
														(byte) -36,
														(new RSString[] {
																Class30.aClass59_739,
																(Class12_Sub12_Sub9.aClass59_2364),
																class59,
																(Class26.aClass59Array591[i_2_]) }))));
								if (i_5_ > 450)
									i_5_ = 450;
								if ((i_5_ + 4 ^ 0xffffffff) < (Class18.anInt432 ^ 0xffffffff)) {
									Class12_Sub12_Sub12.anInt2410++;
									Class13.anInt339++;
									if ((Class12_Sub12_Sub6.anInt2267 ^ 0xffffffff) <= -2) {
										Class36.anInt882++;
										Class64.method977(
												0,
												0,
												2044,
												0,
												(Statics
														.method251(
																(byte) -113,
																(new RSString[] {
																		(Class28.aClass59_683),
																		(Class40.aClass59_946),
																		class59 }))),
												-66);
									}
									Class64.method977(
											0,
											0,
											2015,
											0,
											(Statics
													.method251(
															(byte) -45,
															(new RSString[] {
																	(Class17.aClass59_414),
																	(Class40.aClass59_946),
																	class59 }))),
											-64);
									Class64.method977(
											0,
											0,
											2017,
											0,
											(Statics
													.method251(
															(byte) -51,
															(new RSString[] {
																	(Class21.aClass59_485),
																	(Class40.aClass59_946),
																	class59 }))),
											-107);
								}
							}
							if ((i_1_ ^ 0xffffffff) <= -6)
								break;
						}
						if ((i_3_ == 5 || (i_3_ ^ 0xffffffff) == -7)
								&& (Class12_Sub12_Sub3.anInt2154 ^ 0xffffffff) > -3
								&& (++i_1_ ^ 0xffffffff) <= -6)
							break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ce.J(" + arg0 + ')');
		}
	}

	public static synchronized void method134(byte arg0) {
		try {
			anInt284++;
			int i = -97 / ((arg0 - -73) / 33);
			Class56.method904((byte) 116);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ce.E(" + arg0 + ')');
		}
	}

	public static void method135(int arg0) {
		try {
			aClass59_281 = null;
			aClass59_290 = null;
			aClass59_263 = null;
			aClass59_311 = null;
			aClass12_Sub12_Sub7_Sub1Array254 = null;
			aClass59_299 = null;
			aClass59_301 = null;
			aClass59_279 = null;
			aClass59_288 = null;
			aClass59_302 = null;
			aClass59_298 = null;
			aClass59_305 = null;
			aClass59_296 = null;
			if (arg0 <= 43)
				aClass59_289 = null;
			aClass59_312 = null;
			aClass59_256 = null;
			aClass59_304 = null;
			aClass59_262 = null;
			aClass59_303 = null;
			aClass59_253 = null;
			aClass59_308 = null;
			aClass59_270 = null;
			aClass59_313 = null;
			aClass59_309 = null;
			aClass59_267 = null;
			aClass59_251 = null;
			aClass59_265 = null;
			aClass59_258 = null;
			aClass59_277 = null;
			aClass59_289 = null;
			aClass59_268 = null;
			aClass59_261 = null;
			aClass59_252 = null;
			aClass59_257 = null;
			aClass10Array280 = null;
			aClass59_276 = null;
			aClass59_275 = null;
			aClass59_300 = null;
			aClass59_272 = null;
			aClass59_264 = null;
			aClass59_310 = null;
			aClass59_283 = null;
			aClass59_274 = null;
			aClass59_260 = null;
			aClass59_306 = null;
			aClass59_295 = null;
			aClass59_271 = null;
			aClass59_278 = null;
			aClass59_269 = null;
			aClass59_297 = null;
			aClass59_273 = null;
			aClass59_285 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ce.H(" + arg0 + ')');
		}
	}

	public static int method136(boolean arg0) {
		try {
			int i = 3;
			if ((Statics.anInt2021 ^ 0xffffffff) > -311) {
				int i_6_ = Class10.anInt250 >> -786146137;
				int i_7_ = Class20.anInt464 >> 1982070151;
				if ((0x4 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[RSString.anInt1504][i_6_][i_7_]) ^ 0xffffffff) != -1)
					i = RSString.anInt1504;
				int i_8_ = ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) >> -573969689);
				int i_9_ = ((Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) >> -1507274585);
				int i_10_;
				if ((i_9_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))
					i_10_ = i_7_ + -i_9_;
				else
					i_10_ = -i_7_ + i_9_;
				int i_11_;
				if (i_8_ > i_6_)
					i_11_ = -i_6_ + i_8_;
				else
					i_11_ = -i_8_ + i_6_;
				if ((i_11_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
					int i_12_ = 65536 * i_10_ / i_11_;
					int i_13_ = 32768;
					while ((i_6_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff)) {
						if ((i_6_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff))
							i_6_++;
						else if ((i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
							i_6_--;
						if ((0x4 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[RSString.anInt1504][i_6_][i_7_]) ^ 0xffffffff) != -1)
							i = RSString.anInt1504;
						i_13_ += i_12_;
						if ((i_13_ ^ 0xffffffff) <= -65537) {
							if ((i_7_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff))
								i_7_++;
							else if (i_7_ > i_9_)
								i_7_--;
							i_13_ -= 65536;
							if (((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[RSString.anInt1504][i_6_][i_7_]) & 0x4) != 0)
								i = RSString.anInt1504;
						}
					}
				} else {
					int i_14_ = i_11_ * 65536 / i_10_;
					int i_15_ = 32768;
					while (i_7_ != i_9_) {
						i_15_ += i_14_;
						if ((i_7_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff))
							i_7_++;
						else if (i_9_ < i_7_)
							i_7_--;
						if ((0x4 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[RSString.anInt1504][i_6_][i_7_])) != 0)
							i = RSString.anInt1504;
						if ((i_15_ ^ 0xffffffff) <= -65537) {
							if (i_8_ <= i_6_) {
								if ((i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
									i_6_--;
							} else
								i_6_++;
							i_15_ -= 65536;
							if (((Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[RSString.anInt1504][i_6_][i_7_]) & 0x4 ^ 0xffffffff) != -1)
								i = RSString.anInt1504;
						}
					}
				}
			}
			if (arg0 != true)
				return 27;
			anInt282++;
			if ((0x4 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[RSString.anInt1504][(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691) >> 1120098567][(Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683) >> 404462855]) ^ 0xffffffff) != -1)
				i = RSString.anInt1504;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ce.A(" + arg0 + ')');
		}
	}

	public static synchronized void method137(boolean arg0) {
		try {
			anInt307++;
			if (Class12_Sub12_Sub11_Sub3.method464(17754)) {
				Class8.method96(arg0);
				Class12_Sub12_Sub11_Sub2_Sub1.aClass26_2937 = null;
				Class49.aBoolean1158 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ce.K(" + arg0 + ')');
		}
	}

	public static synchronized void method138(int arg0, int arg1, Class26 arg2,
			int arg3, int arg4, byte arg5, boolean arg6) {
		try {
			anInt292++;
			if (Class12_Sub12_Sub11_Sub3.method464(17754)) {
				Class12_Sub12_Sub11_Sub6.anInt2905 = arg3;
				Class49.aBoolean1158 = true;
				Game.anInt1566 = arg0;
				Class14.anInt376 = arg4;
				Class12_Sub12_Sub11_Sub2_Sub1.aClass26_2937 = arg2;
				Class12_Sub12_Sub3.anInt2175 = arg1;
				Class14.anInt373 = -1;
				Class32.aBoolean793 = arg6;
				Class12.anInt330 = -1;
				int i = -91 / ((arg5 - -31) / 57);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ce.C(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public static synchronized void method139(int arg0, byte arg1) {
		anInt291++;
		if (Class12_Sub12_Sub11_Sub3.method464(17754)) {
			Class12_Sub12_Sub5.method316(arg0, (byte) -82);
			Class12_Sub12_Sub11_Sub2_Sub1.aClass26_2937 = null;
			Class49.aBoolean1158 = false;
			if (arg1 < 101)
				aClass59_252 = null;
		}
	}

	public static synchronized void method140(byte arg0, int arg1, int arg2,
			int arg3, boolean arg4, int arg5, int arg6, Class26 arg7) {
		try {
			anInt293++;
			if (Class12_Sub12_Sub11_Sub3.method464(17754)) {
				Game.anInt1566 = arg3;
				Class14.anInt373 = -1;
				Class12_Sub12_Sub11_Sub6.anInt2905 = arg1;
				Class32.aBoolean793 = arg4;
				Class14.anInt376 = arg5;
				Class12.anInt330 = arg2;
				Class12_Sub12_Sub11_Sub2_Sub1.aClass26_2937 = arg7;
				int i = -28 / ((arg0 - 38) / 32);
				Class49.aBoolean1158 = true;
				Class12_Sub12_Sub3.anInt2175 = arg6;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception,
					("ce.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
							+ (arg7 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass59_253 = Class55.method898("", -10983);
		aClass59_251 = aClass59_253;
		aClass59_264 = aClass59_253;
		aClass59_267 = aClass59_253;
		aClass59_262 = aClass59_253;
		aClass59_263 = aClass59_253;
		aClass59_279 = aClass59_273;
		aClass59_285 = aClass59_273;
		aClass59_261 = aClass59_253;
		aClass59_258 = aClass59_253;
		aClass59_260 = aClass59_273;
		aClass59_271 = aClass59_253;
		aClass10Array280 = new Class10[4];
		aClass59_269 = aClass59_253;
		aClass59_274 = Class55.method898("Enter name:", -10983);
		aClass59_298 = aClass59_253;
		aClass59_270 = aClass59_253;
		aClass59_252 = aClass59_253;
		aClass59_268 = aClass59_253;
		aClass59_302 = aClass59_253;
		aClass59_283 = aClass59_253;
		aClass59_300 = aClass59_253;
		anInt294 = 0;
		aClass59_288 = aClass59_253;
		aClass59_303 = aClass59_253;
		aClass59_301 = aClass59_273;
		aClass59_277 = aClass59_253;
		aClass59_309 = aClass59_253;
		aClass59_304 = aClass59_253;
		aClass59_305 = aClass59_253;
		aClass59_281 = aClass59_253;
		aClass59_276 = aClass59_253;
		aClass59_295 = aClass59_253;
		aClass59_289 = aClass59_273;
		aClass59_257 = aClass59_274;
		aClass59_308 = aClass59_253;
		aClass59_310 = Class55.method898("", -10983);
		aClass59_278 = aClass59_310;
		aClass59_296 = aClass59_253;
		aClass59_313 = aClass59_253;
		anInt287 = 0;
		aClass59_299 = aClass59_310;
		aClass59_306 = aClass59_310;
		aClass59_265 = aClass59_310;
		aClass59_290 = aClass59_310;
		aClass59_297 = aClass59_310;
		aClass59_275 = aClass59_253;
		aClass59_272 = aClass59_253;
		aClass59_311 = aClass59_253;
		aClass59_312 = aClass59_273;
	}
}
