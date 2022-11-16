package com.jagex;/* com.jagex.Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.PacketBuffer;
import com.jagex.util.Statics;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class55 {
	public static RSString aClass59_1288;
	public static int anInt1289;
	public static int anInt1290;
	public static byte[] aByteArray1291 = new byte[520];
	public static int anInt1292;
	public int anInt1293;
	public int anInt1294;
	public static int anInt1295;
	public int anInt1296 = 0;
	public static int anInt1297;
	public static Class26 aClass26_1298;
	public static int anInt1299 = 0;
	public int anInt1300;
	public static int anInt1301;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_1302;
	public static RSString aClass59_1303;
	public int anInt1304 = 0;
	public int anInt1305;
	public static RSString aClass59_1306;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_1307;
	public static int anInt1308;
	public int anInt1309;
	public static int anInt1310;
	public static int anInt1311;
	public static RSString aClass59_1312;
	public static int[] anIntArray1313;

	public static void method894(int arg0) {
		Class44.aClass62_1042.method960(-1);
		anInt1297++;
		if (arg0 < 83)
			anInt1299 = 99;
	}

	public static void method895(PacketBuffer arg0, int arg1, int arg2) {
		try {
			if (arg1 != 0)
				method896(null, (byte) -20);
			anInt1311++;
			for (;;) {
				Class12_Sub6 class12_sub6 = ((Class12_Sub6) Statics.aClass8_2017
						.method91((byte) 86));
				if (class12_sub6 == null)
					break;
				boolean bool = false;
				for (int i = 0; (i ^ 0xffffffff) > (class12_sub6.anInt1686 ^ 0xffffffff); i++) {
					if (class12_sub6.aSignlinkNodeArray1703[i] != null) {
						if (class12_sub6.aSignlinkNodeArray1703[i].status == 2)
							class12_sub6.anIntArray1696[i] = -5;
						if (class12_sub6.aSignlinkNodeArray1703[i].status == 0)
							bool = true;
					}
					if (class12_sub6.aSignlinkNodeArray1685[i] != null) {
						if ((class12_sub6.aSignlinkNodeArray1685[i].status ^ 0xffffffff) == -3)
							class12_sub6.anIntArray1696[i] = -6;
						if ((class12_sub6.aSignlinkNodeArray1685[i].status ^ 0xffffffff) == -1)
							bool = true;
					}
				}
				if (bool)
					break;
				arg0.writePacket(arg2);
				arg0.writeByte(0);
				int i = arg0.position;
				arg0.writeIntBE(class12_sub6.anInt1690);
				for (int i_0_ = 0; i_0_ < class12_sub6.anInt1686; i_0_++) {
					if (class12_sub6.anIntArray1696[i_0_] != 0)
						arg0.writeByte(class12_sub6.anIntArray1696[i_0_]);
					else {
						try {
							int i_1_ = class12_sub6.anIntArray1689[i_0_];
							if ((i_1_ ^ 0xffffffff) == -1) {
								Field field = (Field) (class12_sub6.aSignlinkNodeArray1703[i_0_].value);
								int i_2_ = field.getInt(null);
								arg0.writeByte(0);
								arg0.writeIntBE(i_2_);
							} else if ((i_1_ ^ 0xffffffff) == -2) {
								Field field = (Field) (class12_sub6.aSignlinkNodeArray1703[i_0_].value);
								field.setInt(null,
										(class12_sub6.anIntArray1698[i_0_]));
								arg0.writeByte(0);
							} else if ((i_1_ ^ 0xffffffff) == -3) {
								Field field = (Field) (class12_sub6.aSignlinkNodeArray1703[i_0_].value);
								int i_3_ = field.getModifiers();
								arg0.writeByte(0);
								arg0.writeIntBE(i_3_);
							}
							if (i_1_ == 3) {
								Method method = (Method) (class12_sub6.aSignlinkNodeArray1685[i_0_].value);
								byte[][] is = (class12_sub6.aByteArrayArrayArray1693[i_0_]);
								Object[] objects = new Object[is.length];
								for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
									ObjectInputStream objectinputstream = (new ObjectInputStream(
											new ByteArrayInputStream(is[i_4_])));
									objects[i_4_] = objectinputstream
											.readObject();
								}
								Object object = method.invoke(null, objects);
								if (object != null) {
									if (object instanceof Number) {
										arg0.writeByte(1);
										arg0.writeLongBE(
                                                ((Number) object).longValue());
									} else if (object instanceof RSString) {
										arg0.writeByte(2);
										arg0.writeString((RSString) object
										);
									} else
										arg0.writeByte(4);
								} else
									arg0.writeByte(0);
							} else if ((i_1_ ^ 0xffffffff) == -5) {
								Method method = (Method) (class12_sub6.aSignlinkNodeArray1685[i_0_].value);
								int i_5_ = method.getModifiers();
								arg0.writeByte(0);
								arg0.writeIntBE(i_5_);
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							arg0.writeByte(-10);
						} catch (java.io.InvalidClassException invalidclassexception) {
							arg0.writeByte(-11);
						} catch (java.io.StreamCorruptedException streamcorruptedexception) {
							arg0.writeByte(-12);
						} catch (java.io.OptionalDataException optionaldataexception) {
							arg0.writeByte(-13);
						} catch (IllegalAccessException illegalaccessexception) {
							arg0.writeByte(-14);
						} catch (IllegalArgumentException illegalargumentexception) {
							arg0.writeByte(-15);
						} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
							arg0.writeByte(-16);
						} catch (SecurityException securityexception) {
							arg0.writeByte(-17);
						} catch (java.io.IOException ioexception) {
							arg0.writeByte(-18);
						} catch (NullPointerException nullpointerexception) {
							arg0.writeByte(-19);
						} catch (Exception exception) {
							arg0.writeByte(-20);
						} catch (Throwable throwable) {
							arg0.writeByte(-21);
						}
					}
				}
				arg0.method256((byte) 69, i);
				arg0.method242(-1, -i + arg0.position);
				class12_sub6.method143((byte) 39);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("sb.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static void method896(Class26 arg0, byte arg1) {
		anInt1301++;
		Class20.aClass26_474 = arg0;
		if (arg1 != 29)
			method898(null, -123);
	}

	public static void method897(boolean arg0) {
		try {
			aClass59_1306 = null;
			if (arg0 == false) {
				aClass59_1303 = null;
				aClass26_1298 = null;
				aClass59_1312 = null;
				anIntArray1313 = null;
				aClass59_1288 = null;
				aByteArray1291 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "sb.A(" + arg0 + ')');
		}
	}

	public static RSString method898(String arg0, int arg1) {
		try {
			anInt1290++;
			if (arg1 != -10983)
				method897(false);
			byte[] is = arg0.getBytes();
			int i = 0;
			int i_6_ = is.length;
			RSString class59 = new RSString();
			class59.chars = new byte[i_6_];
			while ((i ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
				int i_7_ = is[i++] & 0xff;
				if (i_7_ <= 45 && i_7_ >= 40) {
					if ((i_6_ ^ 0xffffffff) >= (i ^ 0xffffffff))
						break;
					int i_8_ = 0xff & is[i++];
					class59.chars[class59.anInt1480++] = (byte) (i_8_
							+ -48 + (-1720 + 43 * i_7_));
				} else
					class59.chars[class59.anInt1480++] = (byte) i_7_;
			}
			class59.method932(0);
			return class59.method916(4096);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "sb.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public static void method899(int arg0, int arg1) {
		if (arg1 != -3) {
			if (arg1 != -2) {
				if (arg1 == -1)
					Class12_Sub12_Sub11_Sub3.method468(Class11.aClass59_275,
							Class31.aClass59_760,
							Player.aClass59_2971, -4774);
				else if (arg1 == 3)
					Class12_Sub12_Sub11_Sub3.method468(Class11.aClass59_271,
							Class11.aClass59_288, Class30.aClass59_735, -4774);
				else if ((arg1 ^ 0xffffffff) == -5)
					Class12_Sub12_Sub11_Sub3.method468(Class11.aClass59_281,
							Class58.aClass59_1358, Class8.aClass59_198, -4774);
				else if ((arg1 ^ 0xffffffff) != -6) {
					if (arg1 == 6)
						Class12_Sub12_Sub11_Sub3.method468(
								Class11.aClass59_264, Class56.aClass59_1314,
								Class19.aClass59_445, -4774);
					else if (arg1 == 7)
						Class12_Sub12_Sub11_Sub3.method468(
								Class11.aClass59_313, Class5.aClass59_156,
								Class12_Sub1.aClass59_1628, -4774);
					else if ((arg1 ^ 0xffffffff) == -9)
						Class12_Sub12_Sub11_Sub3.method468(
								Class11.aClass59_269,
								Class12_Sub9.aClass59_1755,
								Class20.aClass59_472, -4774);
					else if (arg1 == 9)
						Class12_Sub12_Sub11_Sub3.method468(
								Class11.aClass59_263,
								Class12_Sub12_Sub16.aClass59_2537,
								Class48.aClass59_1126, -4774);
					else if (arg1 != 10) {
						if ((arg1 ^ 0xffffffff) != -12) {
							if (arg1 != 12) {
								if (arg1 != 13) {
									if (arg1 != 14) {
										if ((arg1 ^ 0xffffffff) == -17)
											Class12_Sub12_Sub11_Sub3
													.method468(
															Class11.aClass59_298,
															(RuntimeException_Sub1.aClass59_1469),
															Class39.aClass59_941,
															-4774);
										else if (arg1 != 17) {
											if ((arg1 ^ 0xffffffff) == -19)
												Class12_Sub12_Sub11_Sub3
														.method468(
																Class11.aClass59_300,
																Class33.aClass59_817,
																Class58.aClass59_1349,
																-4774);
											else if ((arg1 ^ 0xffffffff) != -21) {
												if ((arg1 ^ 0xffffffff) == -23)
													Class12_Sub12_Sub11_Sub3
															.method468(
																	Class11.aClass59_272,
																	Class39.aClass59_939,
																	Class49.aClass59_1166,
																	-4774);
												else if (arg1 == 23)
													Class12_Sub12_Sub11_Sub3
															.method468(
																	Class11.aClass59_258,
																	(Class9_Sub2.aClass59_1601),
																	Class39.aClass59_933,
																	-4774);
												else if (arg1 != 24) {
													if ((arg1 ^ 0xffffffff) != -26) {
														if (arg1 == 26)
															Class12_Sub12_Sub11_Sub3
																	.method468(
																			(Class11.aClass59_251),
																			(Class27.aClass59_656),
																			(Class12_Sub12_Sub16.aClass59_2536),
																			-4774);
														else
															Class12_Sub12_Sub11_Sub3
																	.method468(
																			(Class11.aClass59_304),
																			(Class30.aClass59_718),
																			(Player.aClass59_2977),
																			-4774);
													} else
														Class12_Sub12_Sub11_Sub3
																.method468(
																		(Class11.aClass59_261),
																		(Class12_Sub12_Sub4.aClass59_2211),
																		(Player.aClass59_2975),
																		-4774);
												} else
													Class12_Sub12_Sub11_Sub3
															.method468(
																	Class11.aClass59_252,
																	(Class12_Sub1.aClass59_1610),
																	Class44.aClass59_1028,
																	-4774);
											} else
												Class12_Sub12_Sub11_Sub3
														.method468(
																Class11.aClass59_309,
																Class15.aClass59_403,
																(Player.aClass59_2972),
																-4774);
										} else
											Class12_Sub12_Sub11_Sub3
													.method468(
															Class11.aClass59_295,
															(Class12_Sub12_Sub11_Sub5.aClass59_2879),
															Statics.aClass59_556,
															-4774);
									} else
										Class12_Sub12_Sub11_Sub3.method468(
												Class11.aClass59_276,
												Statics.aClass59_1829,
												Class39.aClass59_935, -4774);
								} else
									Class12_Sub12_Sub11_Sub3
											.method468(
													Class11.aClass59_305,
													Class61.aClass59_1368,
													(Player.aClass59_2974),
													-4774);
							} else
								Class12_Sub12_Sub11_Sub3
										.method468(
												Class11.aClass59_302,
												Class12_Sub6.aClass59_1692,
												Class12_Sub12_Sub2.aClass59_2067,
												-4774);
						} else
							Class12_Sub12_Sub11_Sub3.method468(
									Class11.aClass59_270,
									Class12_Sub12_Sub8.aClass59_2299,
									Class12.aClass59_318, -4774);
					} else
						Class12_Sub12_Sub11_Sub3.method468(
								Class11.aClass59_296,
								Class12_Sub9.aClass59_1745,
								Class8.aClass59_177, -4774);
				} else
					Class12_Sub12_Sub11_Sub3.method468(Class11.aClass59_283,
							Class20.aClass59_470, (Class12_Sub9.aClass59_1758),
							-4774);
			} else
				Class12_Sub12_Sub11_Sub3
						.method468(Class11.aClass59_267, Class11.aClass59_311,
								Class64_Sub1.aClass59_1949, -4774);
		} else
			Class12_Sub12_Sub11_Sub3.method468(Class11.aClass59_308,
					Class40.aClass59_955,
					(Player.aClass59_2970), -4774);
		Class29.method686((byte) 67, 10);
		anInt1310++;
		if (arg0 <= 2)
			aClass59_1312 = null;
	}

	public static int method900(int arg0, Class26 arg1, Class26 arg2) {
		try {
			int i = 0;
			anInt1292++;
			if (arg2.method652(Class12_Sub9.aClass59_1754,
					Class11.aClass59_273, -1))
				i++;
			if (arg1.method652(Class26.aClass59_617, Class11.aClass59_273, -1))
				i++;
			if (arg1.method652(Class10.aClass59_225, Class11.aClass59_273, arg0
					^ ~0x1412))
				i++;
			if (arg1.method652(Class12_Sub12_Sub1.aClass59_2039,
					Class11.aClass59_273, arg0 + -5139))
				i++;
			if (arg1.method652(Class43.aClass59_1009, Class11.aClass59_273, -1))
				i++;
			if (arg0 != 5138)
				method898(null, -6);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("sb.C(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass59_1288 = method898("hitmarks", -10983);
		anInt1295 = 0;
		anInt1308 = 127;
		aClass59_1303 = (method898(
				"Your friendlist is full)3 Max of 100 for free users)1 and 200 for members",
				-10983));
		aClass59_1312 = method898("@whi@ )4 ", -10983);
		aClass59_1306 = aClass59_1303;
	}
}
