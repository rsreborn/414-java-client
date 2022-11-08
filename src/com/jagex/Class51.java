package com.jagex;/* com.jagex.Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.Buffer;
import com.jagex.io.SizedAccessFile;
import com.jagex.util.Statics;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

public class Class51 {
	public byte[] aByteArray1175;
	public long aLong1177 = -1L;
	public static int anInt1178;
	public static int anInt1179;
	public SizedAccessFile aSizedAccessFile_1180;
	public long aLong1181;
	public static int anInt1182;
	public int anInt1183 = 0;
	public byte[] aByteArray1184;
	public static int[] anIntArray1185;
	public static int anInt1186;
	public long aLong1187;
	public static int anInt1188;
	public long aLong1189;
	public static int anInt1190;
	public static RSString aClass59_1191 = Class55.method898("backright2",
			-10983);
	public static int anInt1192;
	public static int anInt1193;
	public static RSString aClass59_1194 = Class55.method898(":0", -10983);
	public long aLong1195;
	public static int anInt1196;
	public static int anInt1197;
	public int anInt1198;
	public static int anInt1199;
	public long aLong1200 = -1L;
	public static int anInt1201;
	public static boolean aBoolean1202 = false;
	public static int anInt1203;

	public void method809(byte arg0) throws IOException {
		try {
			anInt1198 = 0;
			if (arg0 != 52)
				method819(-69);
			anInt1197++;
			if (aLong1187 != aLong1195) {
				aSizedAccessFile_1180.seek(aLong1187);
				aLong1195 = aLong1187;
			}
			aLong1177 = aLong1187;
			int i;
			for (/**/; ((aByteArray1184.length ^ 0xffffffff) < (anInt1198 ^ 0xffffffff)); anInt1198 += i) {
				i = aSizedAccessFile_1180.read(aByteArray1184, anInt1198,
						aByteArray1184.length - anInt1198);
				if (i == -1)
					break;
				aLong1195 += (long) i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "r.J(" + arg0 + ')');
		}
	}

	public void method810(int arg0) throws IOException {
		try {
			anInt1182++;
			method816((byte) 109);
			if (arg0 >= 57)
				aSizedAccessFile_1180.close();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "r.C(" + arg0 + ')');
		}
	}

	public static void method811(int arg0) {
		try {
			if (arg0 != -4653)
				aBoolean1202 = true;
			anInt1190++;
			for (Class12_Sub12_Sub11_Sub3 class12_sub12_sub11_sub3 = ((Class12_Sub12_Sub11_Sub3) Class56.aClass8_1324
					.method91((byte) 86)); class12_sub12_sub11_sub3 != null; class12_sub12_sub11_sub3 = ((Class12_Sub12_Sub11_Sub3) Class56.aClass8_1324
					.method100(-29860))) {
				if (((RSString.anInt1504 ^ 0xffffffff) != (class12_sub12_sub11_sub3.anInt2763 ^ 0xffffffff))
						|| ((class12_sub12_sub11_sub3.anInt2755 ^ 0xffffffff) > (Class64_Sub2.anInt1968 ^ 0xffffffff)))
					class12_sub12_sub11_sub3.method143((byte) 39);
				else if ((Class64_Sub2.anInt1968 ^ 0xffffffff) <= (class12_sub12_sub11_sub3.anInt2765 ^ 0xffffffff)) {
					if ((class12_sub12_sub11_sub3.anInt2773 ^ 0xffffffff) < -1) {
						Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = (Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[class12_sub12_sub11_sub3.anInt2773
								+ -1]);
						if (class12_sub12_sub11_sub2_sub1 != null
								&& (class12_sub12_sub11_sub2_sub1.anInt2691 ^ 0xffffffff) <= -1
								&& class12_sub12_sub11_sub2_sub1.anInt2691 < 13312
								&& class12_sub12_sub11_sub2_sub1.anInt2683 >= 0
								&& (class12_sub12_sub11_sub2_sub1.anInt2683 ^ 0xffffffff) > -13313)
							class12_sub12_sub11_sub3
									.method470(
											0,
											((Class26
													.method658(
															class12_sub12_sub11_sub2_sub1.anInt2691,
															-6,
															class12_sub12_sub11_sub3.anInt2763,
															class12_sub12_sub11_sub2_sub1.anInt2683)) + -class12_sub12_sub11_sub3.anInt2764),
											class12_sub12_sub11_sub2_sub1.anInt2683,
											class12_sub12_sub11_sub2_sub1.anInt2691,
											Class64_Sub2.anInt1968);
					}
					if (class12_sub12_sub11_sub3.anInt2773 < 0) {
						int i = -class12_sub12_sub11_sub3.anInt2773 - 1;
						Class12_Sub12_Sub11_Sub2_Sub2 class12_sub12_sub11_sub2_sub2;
						if ((Class12_Sub9.anInt1751 ^ 0xffffffff) == (i ^ 0xffffffff))
							class12_sub12_sub11_sub2_sub2 = (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713);
						else
							class12_sub12_sub11_sub2_sub2 = (Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i]);
						if (class12_sub12_sub11_sub2_sub2 != null
								&& (class12_sub12_sub11_sub2_sub2.anInt2691 ^ 0xffffffff) <= -1
								&& class12_sub12_sub11_sub2_sub2.anInt2691 < 13312
								&& class12_sub12_sub11_sub2_sub2.anInt2683 >= 0
								&& (class12_sub12_sub11_sub2_sub2.anInt2683 ^ 0xffffffff) > -13313)
							class12_sub12_sub11_sub3
									.method470(
											arg0 ^ ~0x122c,
											((Class26
													.method658(
															class12_sub12_sub11_sub2_sub2.anInt2691,
															-6,
															class12_sub12_sub11_sub3.anInt2763,
															class12_sub12_sub11_sub2_sub2.anInt2683)) - class12_sub12_sub11_sub3.anInt2764),
											class12_sub12_sub11_sub2_sub2.anInt2683,
											class12_sub12_sub11_sub2_sub2.anInt2691,
											Class64_Sub2.anInt1968);
					}
					class12_sub12_sub11_sub3.method467(-80,
							Class12_Sub12_Sub11_Sub6.anInt2903);
					Class12_Sub12_Sub8.aClass52_2295.method833(
							RSString.anInt1504,
							(int) class12_sub12_sub11_sub3.aDouble2768,
							(int) class12_sub12_sub11_sub3.aDouble2770,
							(int) class12_sub12_sub11_sub3.aDouble2737, 60,
							class12_sub12_sub11_sub3,
							class12_sub12_sub11_sub3.anInt2736, -1, false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "r.F(" + arg0 + ')');
		}
	}

	public static void method812(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, Buffer arg7) {
		anInt1196++;
		if ((arg6 ^ 0xffffffff) <= -1 && (arg6 ^ 0xffffffff) > -105
				&& arg1 >= 0 && (arg1 ^ 0xffffffff) > -105) {
			Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg3][arg6][arg1] = (byte) 0;
			for (;;) {
				int i = arg7.readSignedByte(true);
				if (i == 0) {
					if (arg3 == 0)
						Statics.anIntArrayArrayArray569[0][arg6][arg1] = 8 * -Class38
								.method744(arg0 + arg1 + 556238, -15225, 932731
										- -arg6 + arg4);
					else
						Statics.anIntArrayArrayArray569[arg3][arg6][arg1] = (Statics.anIntArrayArrayArray569[-1
								+ arg3][arg6][arg1])
								+ -240;
					break;
				}
				if (i == 1) {
					int i_0_ = arg7.readSignedByte(true);
					if (i_0_ == 1)
						i_0_ = 0;
					if ((arg3 ^ 0xffffffff) != -1)
						Statics.anIntArrayArrayArray569[arg3][arg6][arg1] = -(8 * i_0_)
								+ (Statics.anIntArrayArrayArray569[arg3 + -1][arg6][arg1]);
					else
						Statics.anIntArrayArrayArray569[0][arg6][arg1] = -i_0_ * 8;
					break;
				}
				if ((i ^ 0xffffffff) >= -50) {
					Class27.aByteArrayArrayArray654[arg3][arg6][arg1] = arg7
							.readByte(true);
					Class64_Sub2.aByteArrayArrayArray1975[arg3][arg6][arg1] = (byte) ((-2 + i) / 4);
					Class17.aByteArrayArrayArray423[arg3][arg6][arg1] = (byte) Class12_Sub12_Sub12
							.method519(i + (-2 + arg2), 3);
				} else if (i <= 81)
					Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[arg3][arg6][arg1] = (byte) (-49 + i);
				else
					Class12_Sub12_Sub4.aByteArrayArrayArray2204[arg3][arg6][arg1] = (byte) (-81 + i);
			}
		} else {
			for (;;) {
				int i = arg7.readSignedByte(true);
				if ((i ^ 0xffffffff) == -1)
					break;
				if ((i ^ 0xffffffff) == -2) {
					arg7.readSignedByte(true);
					break;
				}
				if (i <= 49)
					arg7.readSignedByte(true);
			}
		}
		if (arg5 < 110)
			method811(-87);
	}

	public static void method813(int arg0) {
		try {
			if (arg0 != 14)
				anInt1178 = 81;
			aClass59_1194 = null;
			Game.rsaKey = null;
			aClass59_1191 = null;
			anIntArray1185 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "r.G(" + arg0 + ')');
		}
	}

	public static void method814(byte arg0) {
		try {
			anInt1186++;
			int i = Statics.anInt2019;
			int i_1_ = Class12_Sub4.anInt1673;
			int i_2_ = Class49.anInt1143;
			int i_3_ = Class42.anInt992;
			int i_4_ = 6116423;
			Class12_Sub12_Sub7.method347(i, i_1_, i_2_, i_3_, i_4_);
			Class12_Sub12_Sub7.method347(i - -1, i_1_ - -1, i_2_ + -2, 16, 0);
			Class12_Sub12_Sub7.method339(1 + i, i_1_ - -18, -2 + i_2_,
					i_3_ - 19, 0);
			Class29.aClass12_Sub12_Sub7_Sub4_693.method400(
					(Class12_Sub12_Sub5.aClass59_2245), 3 + i, 14 + i_1_, i_4_);
			int i_5_ = Class18.anInt432;
			int i_6_ = Class12_Sub12_Sub3.anInt2176;
			if (Class9.anInt212 == 0) {
				i_6_ -= 4;
				i_5_ -= 4;
			}
			if ((Class9.anInt212 ^ 0xffffffff) == -2) {
				i_5_ -= 553;
				i_6_ -= 205;
			}
			if (arg0 <= 22)
				method811(68);
			if (Class9.anInt212 == 2) {
				i_5_ -= 17;
				i_6_ -= 357;
			}
			for (int i_7_ = 0; (Class13.anInt338 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				int i_8_ = 15 * (Class13.anInt338 - (1 + i_7_)) + i_1_ + 31;
				int i_9_ = 16777215;
				if ((i ^ 0xffffffff) > (i_5_ ^ 0xffffffff) && i_2_ + i > i_5_
						&& (i_6_ ^ 0xffffffff) < (-13 + i_8_ ^ 0xffffffff)
						&& i_8_ + 3 > i_6_)
					i_9_ = 16776960;
				Class29.aClass12_Sub12_Sub7_Sub4_693.method406(
						Class12_Sub1.aClass59Array1621[i_7_], 3 + i, i_8_,
						i_9_, true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "r.A(" + arg0 + ')');
		}
	}

	public void method815(int arg0, long arg1) {
		try {
			anInt1199++;
			if ((arg1 ^ 0xffffffffffffffffL) <= -1L && arg0 == 3)
				aLong1187 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "r.H(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method816(byte arg0) throws IOException {
		if (arg0 < 46)
			aClass59_1194 = null;
		anInt1201++;
		if (aLong1200 != -1L) {
			if ((aLong1200 ^ 0xffffffffffffffffL) != (aLong1195 ^ 0xffffffffffffffffL)) {
				aSizedAccessFile_1180.seek(aLong1200);
				aLong1195 = aLong1200;
			}
			long l = -1L;
			long l_10_ = -1L;
			aSizedAccessFile_1180.write(aByteArray1175, 0, anInt1183);
			if ((((long) anInt1183 + aLong1200 ^ 0xffffffffffffffffL) < (aLong1177 ^ 0xffffffffffffffffL))
					&& (aLong1177 + (long) anInt1198 >= (long) anInt1183
							+ aLong1200))
				l_10_ = (long) anInt1183 + aLong1200;
			else if (((aLong1200 ^ 0xffffffffffffffffL) > (aLong1177
					- -(long) anInt1198 ^ 0xffffffffffffffffL))
					&& ((aLong1200 + (long) anInt1183 ^ 0xffffffffffffffffL) <= (aLong1177
							+ (long) anInt1198 ^ 0xffffffffffffffffL)))
				l_10_ = (long) anInt1198 + aLong1177;
			aLong1195 += (long) anInt1183;
			if (aLong1181 < aLong1195)
				aLong1181 = aLong1195;
			if (aLong1200 >= aLong1177
					&& aLong1200 < aLong1177 + (long) anInt1198)
				l = aLong1200;
			else if (aLong1200 <= aLong1177
					&& aLong1177 < aLong1200 - -(long) anInt1183)
				l = aLong1177;
			if (l > -1L && l < l_10_) {
				int i = (int) (-l + l_10_);
				Class22.method611(aByteArray1175, (int) (l - aLong1200),
						aByteArray1184, (int) (-aLong1177 + l), i);
			}
			anInt1183 = 0;
			aLong1200 = -1L;
		}
	}

	public void method817(byte[] arg0, int arg1, int arg2, boolean arg3)
			throws IOException {
		if (arg3 == true) {
			anInt1179++;
			try {
				if ((aLong1189 ^ 0xffffffffffffffffL) > (aLong1187
						+ (long) arg2 ^ 0xffffffffffffffffL))
					aLong1189 = (long) arg2 + aLong1187;
				if ((aLong1200 ^ 0xffffffffffffffffL) != 0L
						&& (((aLong1200 ^ 0xffffffffffffffffL) < (aLong1187 ^ 0xffffffffffffffffL)) || ((aLong1200
								- -(long) anInt1183 ^ 0xffffffffffffffffL) > (aLong1187 ^ 0xffffffffffffffffL))))
					method816((byte) 67);
				if (aLong1200 != -1L
						&& ((aLong1200 + (long) aByteArray1175.length ^ 0xffffffffffffffffL) > (aLong1187
								- -(long) arg2 ^ 0xffffffffffffffffL))) {
					int i = (int) (aLong1200 + (-aLong1187 + (long) aByteArray1175.length));
					Class22.method611(arg0, arg1, aByteArray1175,
							(int) (-aLong1200 + aLong1187), i);
					arg2 -= i;
					aLong1187 += (long) i;
					arg1 += i;
					anInt1183 = aByteArray1175.length;
					method816((byte) 103);
				}
				if ((aByteArray1175.length ^ 0xffffffff) > (arg2 ^ 0xffffffff)) {
					if (aLong1187 != aLong1195) {
						aSizedAccessFile_1180.seek(aLong1187);
						aLong1195 = aLong1187;
					}
					aSizedAccessFile_1180.write(arg0, arg1, arg2);
					aLong1195 += (long) arg2;
					long l = -1L;
					if (aLong1181 < aLong1195)
						aLong1181 = aLong1195;
					if (((aLong1187 ^ 0xffffffffffffffffL) <= (aLong1177 ^ 0xffffffffffffffffL))
							&& aLong1177 - -(long) anInt1198 > aLong1187)
						l = aLong1187;
					else if (((aLong1177 ^ 0xffffffffffffffffL) <= (aLong1187 ^ 0xffffffffffffffffL))
							&& ((aLong1177 ^ 0xffffffffffffffffL) > (aLong1187
									- -(long) arg2 ^ 0xffffffffffffffffL)))
						l = aLong1177;
					long l_11_ = -1L;
					if ((long) arg2 + aLong1187 <= aLong1177
							|| ((aLong1177 - -(long) anInt1198 ^ 0xffffffffffffffffL) > (aLong1187
									- -(long) arg2 ^ 0xffffffffffffffffL))) {
						if ((((long) anInt1198 + aLong1177 ^ 0xffffffffffffffffL) < (aLong1187 ^ 0xffffffffffffffffL))
								&& (((long) anInt1198 + aLong1177 ^ 0xffffffffffffffffL) >= ((long) arg2
										+ aLong1187 ^ 0xffffffffffffffffL)))
							l_11_ = aLong1177 - -(long) anInt1198;
					} else
						l_11_ = aLong1187 - -(long) arg2;
					if ((l ^ 0xffffffffffffffffL) < 0L && l_11_ > l) {
						int i = (int) (l_11_ - l);
						Class22.method611(arg0,
								(int) (-aLong1187 + ((long) arg1 + l)),
								aByteArray1184, (int) (-aLong1177 + l), i);
					}
					aLong1187 += (long) arg2;
				} else if (arg2 > 0) {
					if ((aLong1200 ^ 0xffffffffffffffffL) == 0L)
						aLong1200 = aLong1187;
					Class22.method611(arg0, arg1, aByteArray1175,
							(int) (-aLong1200 + aLong1187), arg2);
					aLong1187 += (long) arg2;
					if (aLong1187 - aLong1200 > (long) anInt1183)
						anInt1183 = (int) (-aLong1200 + aLong1187);
				}
			} catch (IOException ioexception) {
				aLong1195 = -1L;
				throw ioexception;
			}
		}
	}

	public void method818(int arg0, int arg1, byte[] arg2, int arg3)
			throws IOException {
		anInt1203++;
		int i = 31 % ((arg1 - -36) / 35);
		try {
			if (arg0 + arg3 > arg2.length)
				throw new ArrayIndexOutOfBoundsException(-arg2.length
						+ (arg3 + arg0));
			if (aLong1200 != -1L && aLong1187 >= aLong1200
					&& (long) arg0 + aLong1187 <= (long) anInt1183 + aLong1200) {
				Class22.method611(aByteArray1175,
						(int) (-aLong1200 + aLong1187), arg2, arg3, arg0);
				aLong1187 += (long) arg0;
				return;
			}
			int i_12_ = arg3;
			long l = aLong1187;
			int i_13_ = arg0;
			if ((aLong1187 ^ 0xffffffffffffffffL) <= (aLong1177 ^ 0xffffffffffffffffL)
					&& (((long) anInt1198 + aLong1177 ^ 0xffffffffffffffffL) < (aLong1187 ^ 0xffffffffffffffffL))) {
				int i_14_ = (int) (-aLong1187 - -aLong1177 + (long) anInt1198);
				if ((arg0 ^ 0xffffffff) > (i_14_ ^ 0xffffffff))
					i_14_ = arg0;
				arg0 -= i_14_;
				Class22.method611(aByteArray1184,
						(int) (aLong1187 + -aLong1177), arg2, arg3, i_14_);
				arg3 += i_14_;
				aLong1187 += (long) i_14_;
			}
			if (arg0 > aByteArray1184.length) {
				aSizedAccessFile_1180.seek(aLong1187);
				aLong1195 = aLong1187;
				while (arg0 > 0) {
					int i_15_ = aSizedAccessFile_1180.read(arg2, arg3, arg0);
					if (i_15_ == -1)
						break;
					arg3 += i_15_;
					arg0 -= i_15_;
					aLong1195 += (long) i_15_;
					aLong1187 += (long) i_15_;
				}
			} else if ((arg0 ^ 0xffffffff) < -1) {
				method809((byte) 52);
				int i_16_ = arg0;
				if (anInt1198 < i_16_)
					i_16_ = anInt1198;
				Class22.method611(aByteArray1184, 0, arg2, arg3, i_16_);
				aLong1187 += (long) i_16_;
				arg0 -= i_16_;
				arg3 += i_16_;
			}
			if (aLong1200 != -1L) {
				if ((aLong1200 ^ 0xffffffffffffffffL) < (aLong1187 ^ 0xffffffffffffffffL)
						&& (arg0 ^ 0xffffffff) < -1) {
					int i_17_ = (int) (-aLong1187 + aLong1200) + arg3;
					if (arg0 + arg3 < i_17_)
						i_17_ = arg3 - -arg0;
					while ((arg3 ^ 0xffffffff) > (i_17_ ^ 0xffffffff)) {
						arg0--;
						arg2[arg3++] = (byte) 0;
						aLong1187++;
					}
				}
				long l_18_ = -1L;
				long l_19_ = -1L;
				if (l > aLong1200
						|| ((l - -(long) i_13_ ^ 0xffffffffffffffffL) >= (aLong1200 ^ 0xffffffffffffffffL))) {
					if (l >= aLong1200
							&& ((long) anInt1183 + aLong1200 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL))
						l_18_ = l;
				} else
					l_18_ = aLong1200;
				if (l < aLong1200 + (long) anInt1183
						&& aLong1200 + (long) anInt1183 <= l + (long) i_13_)
					l_19_ = (long) anInt1183 + aLong1200;
				else if (((aLong1200 ^ 0xffffffffffffffffL) > ((long) i_13_ + l ^ 0xffffffffffffffffL))
						&& aLong1200 + (long) anInt1183 >= l + (long) i_13_)
					l_19_ = l - -(long) i_13_;
				if (l_18_ > -1L && l_18_ < l_19_) {
					int i_20_ = (int) (l_19_ - l_18_);
					Class22.method611(aByteArray1175,
							(int) (-aLong1200 + l_18_), arg2,
							(int) (l_18_ + -l) + i_12_, i_20_);
					if ((l_19_ ^ 0xffffffffffffffffL) < (aLong1187 ^ 0xffffffffffffffffL)) {
						arg0 -= -aLong1187 + l_19_;
						aLong1187 = l_19_;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong1195 = -1L;
			throw ioexception;
		}
		if (arg0 > 0)
			throw new EOFException();
	}

	public long method819(int arg0) {
		try {
			anInt1193++;
			if (arg0 != 17)
				anInt1198 = -38;
			return aLong1189;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "r.I(" + arg0 + ')');
		}
	}

	public Class51(SizedAccessFile arg0, int arg1, int arg2) throws IOException {
		try {
			aSizedAccessFile_1180 = arg0;
			aLong1189 = aLong1181 = arg0.length();
			aByteArray1175 = new byte[arg2];
			aByteArray1184 = new byte[arg1];
			aLong1187 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("r.<init>("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	static {
		Game.rsaKey = (new BigInteger(
				"58778699976184461502525193738213253649000149147835990136706041084440742975821"));
	}
}
