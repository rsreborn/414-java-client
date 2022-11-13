package com.jagex;/* com.jagex.Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;
import java.awt.Graphics;

public class RSString implements Interface1 {
	public static int anInt1474;
	public static int anInt1475;
	public static int anInt1476;
	public static int anInt1477;
	public static int anInt1478;
	public static int anInt1479 = 0;
	public int anInt1480;
	public static int anInt1481;
	public static int anInt1482;
	public static int anInt1483;
	public static int anInt1484;
	public static int anInt1485;
	public static int anInt1486;
	public static int anInt1487;
	public static int anInt1488;
	public static int anInt1489;
	public static int anInt1490;
	public static int anInt1491;
	public static int anInt1492;
	public static int anInt1493;
	public static int anInt1495;
	public static int anInt1496;
	public static int anInt1497;
	public static int anInt1498;
	public static int anInt1499;
	public static int anInt1500;
	public static int anInt1501;
	public static Class27 aClass27_1502;
	public static int anInt1503;
	public static int anInt1504;
	public static int anInt1505;
	public static int anInt1507;
	public static int anInt1508;
	public static int anInt1509;
	public int anInt1510;
	public static int anInt1511;
	public boolean aBoolean1512 = true;
	public static int anInt1513;
	public byte[] chars;
	public static int anInt1515 = 5063219;
	public static int anInt1516;
	public static int anInt1517;
	public static int anInt1518;
	public static int anInt1519;
	public static int anInt1520;
	public static int anInt1521;
	public static Class27 aClass27_1522;
	public static RSString aClass59_1523;
	public static RSString aClass59_1524;
	public static RSString aClass59_1525;
	/* synthetic */public static Class aClass1526;

	public long method912(int arg0) {
		try {
			long l = 0L;
			for (int i = 0; i < anInt1480 && (i ^ 0xffffffff) > -13; i++) {
				l *= 37L;
				byte i_0_ = chars[i];
				if (i_0_ >= 65 && (i_0_ ^ 0xffffffff) >= -91)
					l += (long) (i_0_ + -64);
				else if ((i_0_ ^ 0xffffffff) > -98
						|| (i_0_ ^ 0xffffffff) < -123) {
					if (i_0_ >= 48 && i_0_ <= 57)
						l += (long) (-48 + i_0_ + 27);
				} else
					l += (long) (-97 + (i_0_ + 1));
			}
			if (arg0 <= 105)
				toString(40);
			for (/**/; l % 37L == 0L && (l ^ 0xffffffffffffffffL) != -1L; l /= 37L) {
				/* empty */
			}
			anInt1499++;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.A(" + arg0 + ')');
		}
	}

	public int hashCode() {
		try {
			anInt1492++;
			return method929((byte) 103);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.hashCode(" + ')');
		}
	}

	public boolean method913(int arg0, byte arg1) {
		try {
			anInt1475++;
			if ((arg0 ^ 0xffffffff) > -2 || arg0 > 36)
				arg0 = 10;
			int i = -51 % ((-3 - arg1) / 43);
			boolean bool = false;
			boolean bool_1_ = false;
			int i_2_ = 0;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (anInt1480 ^ 0xffffffff); i_3_++) {
				int i_4_ = 0xff & chars[i_3_];
				if ((i_3_ ^ 0xffffffff) == -1) {
					if (i_4_ == 45) {
						bool_1_ = true;
						continue;
					}
					if ((i_4_ ^ 0xffffffff) == -44)
						continue;
				}
				if (i_4_ < 48 || (i_4_ ^ 0xffffffff) < -58) {
					if (i_4_ >= 65 && (i_4_ ^ 0xffffffff) >= -91)
						i_4_ -= 55;
					else if (i_4_ >= 97 && (i_4_ ^ 0xffffffff) >= -123)
						i_4_ -= 87;
					else
						return false;
				} else
					i_4_ -= 48;
				if ((i_4_ ^ 0xffffffff) <= (arg0 ^ 0xffffffff))
					return false;
				if (bool_1_)
					i_4_ = -i_4_;
				int i_5_ = i_2_ * arg0 - -i_4_;
				if ((i_5_ / arg0 ^ 0xffffffff) != (i_2_ ^ 0xffffffff))
					return false;
				bool = true;
				i_2_ = i_5_;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.M(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method914(RSString arg0, int arg1) {
		try {
			if (arg1 != -25730)
				aClass27_1502 = null;
			anInt1497++;
			if ((arg0.anInt1480 ^ 0xffffffff) < (anInt1480 ^ 0xffffffff))
				return false;
			int i = -arg0.anInt1480 + anInt1480;
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (arg0.anInt1480 ^ 0xffffffff); i_6_++) {
				if ((arg0.chars[i_6_] ^ 0xffffffff) != (chars[i
						+ i_6_] ^ 0xffffffff))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.T("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public RSString method915(RSString arg0, int arg1, boolean arg2) {
		try {
			anInt1511++;
			if (!aBoolean1512)
				throw new IllegalArgumentException();
			if ((arg1 ^ 0xffffffff) < (anInt1480 ^ 0xffffffff))
				throw new IllegalArgumentException();
			anInt1510 = 0;
			if (chars.length < arg1 + arg0.anInt1480) {
				int i;
				for (i = 1; (i ^ 0xffffffff) > (arg1 - -arg0.anInt1480 ^ 0xffffffff); i += i) {
					/* empty */
				}
				byte[] is = new byte[i];
				Class22.method611(chars, 0, is, 0, anInt1480);
				chars = is;
			}
			Class22.method611(arg0.chars, 0, chars, arg1,
					arg0.anInt1480);
			if (arg2 != true)
				method928(null, 14);
			if ((arg1 - -arg0.anInt1480 ^ 0xffffffff) < (anInt1480 ^ 0xffffffff))
				anInt1480 = arg1 - -arg0.anInt1480;
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.LA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public RSString method916(int arg0) {
		try {
			anInt1477++;
			long l = method918(arg0 ^ 0x1030);
			synchronized (aClass1526 != null ? aClass1526
					: (aClass1526 = method949("com.jagex.RSString"))) {
				if (Class12_Sub12_Sub11_Sub2.aClass48_2696 == null)
					Class12_Sub12_Sub11_Sub2.aClass48_2696 = new Class48(4096);
				else {
					for (Class12_Sub1 class12_sub1 = (Class12_Sub1) Class12_Sub12_Sub11_Sub2.aClass48_2696
							.method795(l, arg0 + -4216); class12_sub1 != null; class12_sub1 = (Class12_Sub1) Class12_Sub12_Sub11_Sub2.aClass48_2696
							.method793(-16430)) {
						if (method934(class12_sub1.aClass59_1622, 17706))
							return class12_sub1.aClass59_1622;
					}
				}
				Class12_Sub1 class12_sub1 = new Class12_Sub1();
				class12_sub1.aClass59_1622 = this;
				aBoolean1512 = false;
				Class12_Sub12_Sub11_Sub2.aClass48_2696.method797((byte) -99,
						class12_sub1, l);
			}
			if (arg0 != 4096)
				aBoolean1512 = false;
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.N(" + arg0 + ')');
		}
	}

	public RSString method917(int arg0) {
		try {
			anInt1481++;
			RSString class59 = new RSString();
			class59.chars = new byte[12];
			int i = 0;
			int i_7_ = -82 % ((arg0 - 22) / 50);
			class59.anInt1480 = 0;
			for (int i_8_ = 0; anInt1480 > i_8_; i_8_++) {
				if ((chars[i_8_] ^ 0xffffffff) > -66
						|| chars[i_8_] > 90) {
					if (((chars[i_8_] ^ 0xffffffff) > -98 || (chars[i_8_] ^ 0xffffffff) < -123)
							&& (chars[i_8_] < 48 || chars[i_8_] > 57)) {
						if (i > 0)
							class59.chars[i++] = (byte) 95;
					} else {
						class59.chars[i++] = chars[i_8_];
						class59.anInt1480 = i;
					}
				} else {
					class59.chars[i++] = (byte) (97 + (-65 + chars[i_8_]));
					class59.anInt1480 = i;
				}
				if ((i ^ 0xffffffff) == -13)
					break;
			}
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.BA(" + arg0 + ')');
		}
	}

	public long method918(int arg0) {
		try {
			anInt1482++;
			long l = 0L;
			if (arg0 != 48)
				method932(99);
			for (int i = 0; (anInt1480 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				l = (long) (0xff & chars[i]) + ((l << 778065477) + -l);
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.P(" + arg0 + ')');
		}
	}

	public RSString method919(byte arg0, RSString arg1) {
		try {
			anInt1483++;
			if (!aBoolean1512)
				throw new IllegalArgumentException();
			anInt1510 = 0;
			if (arg0 < 34)
				aClass59_1525 = null;
			if ((arg1.anInt1480 + anInt1480 ^ 0xffffffff) < (chars.length ^ 0xffffffff)) {
				int i;
				for (i = 1; ((anInt1480 + arg1.anInt1480 ^ 0xffffffff) < (i ^ 0xffffffff)); i += i) {
					/* empty */
				}
				byte[] is = new byte[i];
				Class22.method611(chars, 0, is, 0, anInt1480);
				chars = is;
			}
			Class22.method611(arg1.chars, 0, chars,
					anInt1480, arg1.anInt1480);
			anInt1480 += arg1.anInt1480;
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.NA(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public boolean method920(RSString arg0, byte arg1) {
		try {
			anInt1503++;
			int i = 116 % ((arg1 - -52) / 50);
			if (arg0 == null)
				return false;
			if ((arg0.anInt1480 ^ 0xffffffff) != (anInt1480 ^ 0xffffffff))
				return false;
			for (int i_9_ = 0; anInt1480 > i_9_; i_9_++) {
				byte i_10_ = chars[i_9_];
				if ((i_10_ ^ 0xffffffff) <= -66
						&& i_10_ <= 90
						|| (i_10_ >= -64 && (i_10_ ^ 0xffffffff) >= 33 && (i_10_ ^ 0xffffffff) != 40))
					i_10_ += 32;
				byte i_11_ = arg0.chars[i_9_];
				if (i_11_ >= 65
						&& (i_11_ ^ 0xffffffff) >= -91
						|| ((i_11_ ^ 0xffffffff) <= 63
								&& (i_11_ ^ 0xffffffff) >= 33 && (i_11_ ^ 0xffffffff) != 40))
					i_11_ += 32;
				if (i_11_ != i_10_)
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.HA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public void method921(byte arg0, int arg1, int arg2, Graphics arg3) {
		try {
			anInt1498++;
			String string;
			try {
				string = new String(chars, 0, anInt1480, "ISO-8859-1");
			} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
				string = new String(chars, 0, anInt1480);
			}
			if (arg0 <= 74)
				method927(true, 30);
			arg3.drawString(string, arg1, arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.L(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public int length() {
		return anInt1480;
	}

	public int method923(int arg0, boolean arg1) {
		try {
			anInt1509++;
			if (arg1 != true)
				anInt1479 = 65;
			return method941(arg0, 4951, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.G(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public RSString method924(int arg0, int arg1) {
		try {
			anInt1486++;
			if (!aBoolean1512)
				throw new IllegalArgumentException();
			if (arg0 > -104)
				method914(null, 125);
			anInt1510 = 0;
			if ((chars.length ^ 0xffffffff) == (anInt1480 ^ 0xffffffff)) {
				int i;
				for (i = 1; i <= anInt1480; i += i) {
					/* empty */
				}
				byte[] is = new byte[i];
				Class22.method611(chars, 0, is, 0, anInt1480);
				chars = is;
			}
			chars[anInt1480++] = (byte) arg1;
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.DA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int method925(FontMetrics arg0, int arg1) {
		try {
			anInt1505++;
			if (arg1 < 107)
				return 76;
			String string;
			try {
				string = new String(chars, 0, anInt1480, "ISO-8859-1");
			} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
				string = new String(chars, 0, anInt1480);
			}
			return arg0.stringWidth(string);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.H("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public int method926(int arg0, RSString arg1, int arg2) {
		try {
			anInt1516++;
			int[] is = new int[arg1.anInt1480];
			int[] is_12_ = new int[256];
			int[] is_13_ = new int[arg1.anInt1480];
			for (int i = 0; (is_12_.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				is_12_[i] = arg1.anInt1480;
			for (int i = 1; i <= arg1.anInt1480; i++) {
				is[-1 + i] = (arg1.anInt1480 << -333784383) + -i;
				is_12_[Class12_Sub12_Sub12.method519(
						arg1.chars[-1 + i], 255)] = arg1.anInt1480 - i;
			}
			int i = arg1.anInt1480 - arg0;
			for (int i_14_ = arg1.anInt1480; i_14_ > 0; i_14_--) {
				is_13_[-1 + i_14_] = i;
				for (/**/; (arg1.anInt1480 >= i && ((arg1.chars[-1
						+ i_14_] ^ 0xffffffff) != (arg1.chars[i - 1] ^ 0xffffffff))); i = is_13_[i - 1]) {
					if (-i_14_ + arg1.anInt1480 <= is[-1 + i])
						is[i - 1] = arg1.anInt1480 + -i_14_;
				}
				i--;
			}
			int i_15_ = i;
			i = 1 + (arg1.anInt1480 + -i_15_);
			int i_16_ = 1;
			int i_17_ = 0;
			int i_18_ = 1;
			while ((i ^ 0xffffffff) <= (i_18_ ^ 0xffffffff)) {
				is_13_[-1 + i_18_] = i_17_;
				for (/**/; i_17_ >= 1
						&& (arg1.chars[i_17_ + -1] != arg1.chars[i_18_
								+ -1]); i_17_ = is_13_[i_17_ + -1]) {
					/* empty */
				}
				i_18_++;
				i_17_++;
			}
			while ((arg1.anInt1480 ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
				for (int i_19_ = i_16_; (i_15_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff); i_19_++) {
					if ((is[-1 + i_19_] ^ 0xffffffff) <= (-i_19_ + i_15_
							+ arg1.anInt1480 ^ 0xffffffff))
						is[-1 + i_19_] = arg1.anInt1480 - -i_15_ + -i_19_;
				}
				i_16_ = 1 + i_15_;
				i_15_ = -is_13_[-1 + i] + i + i_15_;
				i = is_13_[i - 1];
			}
			int i_20_;
			for (int i_21_ = arg2 + (arg1.anInt1480 - 1); (i_21_ ^ 0xffffffff) > (anInt1480 ^ 0xffffffff); i_21_ += Math
					.max(is_12_[chars[i_21_] & 0xff], is[i_20_])) {
				for (i_20_ = arg1.anInt1480 + -1; (i_20_ >= 0 && chars[i_21_] == arg1.chars[i_20_]); i_20_--)
					i_21_--;
				if (i_20_ == -1)
					return 1 + i_21_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.FA(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public int method927(boolean arg0, int arg1) {
		try {
			if (arg0 != true)
				aClass27_1522 = null;
			anInt1474++;
			return chars[arg1] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.C(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public boolean method928(RSString arg0, int arg1) {
		try {
			anInt1520++;
			if (anInt1480 < arg0.anInt1480)
				return false;
			for (int i = arg1; i < arg0.anInt1480; i++) {
				if ((arg0.chars[i] ^ 0xffffffff) != (chars[i] ^ 0xffffffff))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.U("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public int method929(byte arg0) {
		try {
			anInt1521++;
			if (arg0 != 103)
				return -95;
			int i = 0;
			for (int i_22_ = 0; (anInt1480 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++)
				i = (i << -2067983227) + -i - -(chars[i_22_] & 0xff);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.JA(" + arg0 + ')');
		}
	}

	public int method930(int arg0, RSString arg1) {
		try {
			if (arg0 != -2)
				return -104;
			anInt1478++;
			return method926(-1, arg1, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.I(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method931(byte arg0) {
		try {
			aClass59_1525 = null;
			aClass27_1522 = null;
			if (arg0 != 35)
				method936(-125, null, null, null);
			aClass27_1502 = null;
			aClass59_1524 = null;
			aClass59_1523 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.K(" + arg0 + ')');
		}
	}

	public RSString method932(int arg0) {
		try {
			anInt1484++;
			if (!aBoolean1512)
				throw new IllegalArgumentException();
			anInt1510 = arg0;
			if (chars.length != anInt1480) {
				byte[] is = new byte[anInt1480];
				Class22.method611(chars, 0, is, 0, anInt1480);
				chars = is;
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.O(" + arg0 + ')');
		}
	}

	public int writeBytes(byte[] dest, int destStart, int offset, int length) {
		Class22.method611(chars, offset, dest, destStart, length - offset);
		return length - offset;
	}

	public boolean method934(RSString arg0, int arg1) {
		try {
			anInt1485++;
			if (arg0 == null)
				return false;
			if (arg1 != 17706)
				method942(115, (byte) -101);
			if (anInt1480 != arg0.anInt1480)
				return false;
			if (!aBoolean1512 || !arg0.aBoolean1512) {
				if (anInt1510 == 0) {
					anInt1510 = method929((byte) 103);
					if (anInt1510 == 0)
						anInt1510 = 1;
				}
				if ((arg0.anInt1510 ^ 0xffffffff) == -1) {
					arg0.anInt1510 = arg0.method929((byte) 103);
					if ((arg0.anInt1510 ^ 0xffffffff) == -1)
						arg0.anInt1510 = 1;
				}
				if ((arg0.anInt1510 ^ 0xffffffff) != (anInt1510 ^ 0xffffffff))
					return false;
			}
			for (int i = 0; i < anInt1480; i++) {
				if (chars[i] != arg0.chars[i])
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
		}
	}

	public RSString method935(boolean arg0) {
		try {
			anInt1488++;
			int i = anInt1480;
			int i_23_;
			for (i_23_ = 0; i_23_ < anInt1480 && chars[i_23_] >= 0; i_23_++) {
				if (chars[i_23_] > 32)
					break;
			}
			for (/**/; (i_23_ < i && chars[-1 + i] >= 0 && (chars[i
					+ -1] ^ 0xffffffff) >= -33); i--) {
				/* empty */
			}
			if (i_23_ == 0 && (anInt1480 ^ 0xffffffff) == (i ^ 0xffffffff))
				return this;
			RSString class59 = new RSString();
			class59.anInt1480 = i + -i_23_;
			if (arg0 != false)
				anInt1510 = -36;
			class59.chars = new byte[class59.anInt1480];
			for (int i_24_ = 0; (class59.anInt1480 ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
				class59.chars[i_24_] = chars[i_24_ + i_23_];
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.Q(" + arg0 + ')');
		}
	}

	public static Class12_Sub12_Sub7_Sub1[] method936(int arg0, Class26 arg1,
													  RSString arg2, RSString arg3) {
		try {
			if (arg0 != -23078)
				method936(80, null, null, null);
			anInt1476++;
			int i = arg1.hashFileName(arg3, -22814);
			int i_25_ = arg1.method655(i, (byte) 57, arg2);
			return Class12_Sub12_Sub15.method553(i, arg1, i_25_, arg0 ^ 0x5a4e);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.MA(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public RSString method937(int arg0, boolean arg1, int arg2) {
		try {
			anInt1493++;
			if (arg1 != true)
				return null;
			RSString class59 = new RSString();
			class59.anInt1480 = arg0 - arg2;
			class59.chars = new byte[arg0 + -arg2];
			Class22.method611(chars, arg2, class59.chars, 0,
					class59.anInt1480);
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.EA(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public RSString method938(int arg0, int arg1) {
		try {
			RSString class59 = new RSString();
			anInt1507++;
			if (arg0 != 38)
				method918(29);
			class59.chars = new byte[anInt1480 - -1];
			class59.anInt1480 = anInt1480 + 1;
			Class22.method611(chars, 0, class59.chars, 0,
					anInt1480);
			class59.chars[anInt1480] = (byte) arg1;
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.V(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public RSString method939(byte arg0) {
		try {
			anInt1495++;
			RSString class59 = new RSString();
			class59.anInt1480 = anInt1480;
			class59.chars = new byte[anInt1480];
			int i = 27 % ((-8 - arg0) / 60);
			for (int i_26_ = 0; anInt1480 > i_26_; i_26_++) {
				byte i_27_ = chars[i_26_];
				if (i_27_ >= 65
						&& i_27_ <= 90
						|| ((i_27_ ^ 0xffffffff) <= 63 && i_27_ <= -34 && (i_27_ ^ 0xffffffff) != 40))
					i_27_ += 32;
				class59.chars[i_26_] = i_27_;
			}
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.B(" + arg0 + ')');
		}
	}

	public byte[] method940(byte arg0) {
		try {
			int i = -13 / ((arg0 - 10) / 55);
			anInt1519++;
			byte[] is = new byte[anInt1480];
			Class22.method611(chars, 0, is, 0, anInt1480);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.GA(" + arg0 + ')');
		}
	}

	public boolean equals(Object arg0) {
		try {
			anInt1491++;
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.equals("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public int method941(int arg0, int arg1, int arg2) {
		try {
			if (arg1 != 4951)
				method939((byte) -37);
			anInt1513++;
			byte i = (byte) arg0;
			for (int i_28_ = arg2; (i_28_ ^ 0xffffffff) > (anInt1480 ^ 0xffffffff); i_28_++) {
				if ((i ^ 0xffffffff) == (chars[i_28_] ^ 0xffffffff))
					return i_28_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("va.D(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public int method942(int arg0, byte arg1) {
		try {
			if (arg0 < 1 || (arg0 ^ 0xffffffff) < -37)
				arg0 = 10;
			anInt1490++;
			boolean bool = false;
			if (arg1 != -103)
				return 9;
			boolean bool_29_ = false;
			int i = 0;
			for (int i_30_ = 0; (anInt1480 ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
				int i_31_ = 0xff & chars[i_30_];
				if (i_30_ == 0) {
					if ((i_31_ ^ 0xffffffff) == -46) {
						bool = true;
						continue;
					}
					if (i_31_ == 43)
						continue;
				}
				if (i_31_ >= 48 && i_31_ <= 57)
					i_31_ -= 48;
				else if (i_31_ >= 65 && i_31_ <= 90)
					i_31_ -= 55;
				else if (i_31_ >= 97 && (i_31_ ^ 0xffffffff) >= -123)
					i_31_ -= 87;
				else
					throw new NumberFormatException();
				if (arg0 <= i_31_)
					throw new NumberFormatException();
				if (bool)
					i_31_ = -i_31_;
				int i_32_ = i * arg0 - -i_31_;
				if ((i_32_ / arg0 ^ 0xffffffff) != (i ^ 0xffffffff))
					throw new NumberFormatException();
				bool_29_ = true;
				i = i_32_;
			}
			if (!bool_29_)
				throw new NumberFormatException();
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.CA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public RSString toString(int arg0) {
		try {
			boolean bool = true;
			anInt1518++;
			if (arg0 != -14767)
				return null;
			RSString class59 = new RSString();
			class59.anInt1480 = anInt1480;
			class59.chars = new byte[anInt1480];
			for (int i = 0; (anInt1480 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				byte i_33_ = chars[i];
				if (i_33_ == 95) {
					bool = true;
					class59.chars[i] = (byte) 32;
				} else if ((i_33_ ^ 0xffffffff) <= -98 && i_33_ <= 122 && bool) {
					class59.chars[i] = (byte) (-32 + i_33_);
					bool = false;
				} else {
					class59.chars[i] = i_33_;
					bool = false;
				}
			}
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.F(" + arg0 + ')');
		}
	}

	public String toString() {
		try {
			anInt1489++;
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.toString(" + ')');
		}
	}

	public RSString method944(int arg0) {
		try {
			RSString class59 = new RSString();
			class59.anInt1480 = anInt1480;
			class59.chars = new byte[anInt1480];
			anInt1508++;
			if (arg0 > -102)
				method918(-99);
			for (int i = 0; (anInt1480 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				class59.chars[i] = (byte) 42;
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.AA(" + arg0 + ')');
		}
	}

	public RSString method945(int arg0, int arg1) {
		try {
			if (arg0 != 63)
				return null;
			anInt1517++;
			return method937(anInt1480, true, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.W(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public RSString method946(byte arg0) {
		try {
			anInt1496++;
			boolean bool = true;
			RSString class59 = new RSString();
			class59.anInt1480 = anInt1480;
			class59.chars = new byte[anInt1480];
			for (int i = 0; i < anInt1480; i++) {
				byte i_34_ = chars[i];
				if (((i_34_ ^ 0xffffffff) > -98 || (i_34_ ^ 0xffffffff) < -123)
						&& (i_34_ < -32 || (i_34_ ^ 0xffffffff) < 1 || i_34_ == -9)) {
					if (((i_34_ ^ 0xffffffff) <= -66 && (i_34_ ^ 0xffffffff) >= -91)
							|| (i_34_ >= -64 && (i_34_ ^ 0xffffffff) >= 33 && i_34_ != -41)) {
						if (!bool)
							i_34_ += 32;
						bool = false;
					}
				} else {
					if (bool)
						i_34_ -= 32;
					bool = false;
				}
				if (i_34_ == 46 || (i_34_ ^ 0xffffffff) == -34 || i_34_ == 63)
					bool = true;
				class59.chars[i] = i_34_;
			}
			if (arg0 < 24)
				method948(-54);
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.IA(" + arg0 + ')');
		}
	}

	public boolean method947(int arg0) {
		try {
			if (arg0 != -61)
				method946((byte) -48);
			anInt1501++;
			return method913(10, (byte) 117);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.R(" + arg0 + ')');
		}
	}

	public int method948(int arg0) {
		try {
			anInt1487++;
			int i = 74 % ((-31 - arg0) / 45);
			return method942(10, (byte) -103);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "va.S(" + arg0 + ')');
		}
	}

	/* synthetic */public static Class method949(String arg0) {
		try {
			return Class.forName(arg0);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		aClass27_1502 = new Class27(64);
		aClass27_1522 = new Class27(64);
		aClass59_1524 = Class55.method898("invback", -10983);
		aClass59_1523 = Class55.method898("Use", -10983);
		aClass59_1525 = aClass59_1523;
	}
}
