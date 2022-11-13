package com.jagex.io;

import com.jagex.*;
import com.jagex.util.Statics;

import java.math.BigInteger;

public class Buffer extends Class12 {
	public int position;
	public byte[] payload;

	public Buffer(int size) {
		try {
			payload = Class57.method906(true, size);
			position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class35
					.method724(runtimeexception, "tc.<init>(" + size + ')');
		}
	}

	public int getByteS(int arg0) {
		try {
			Statics.anInt1779++;
			if (arg0 != -762)
				Statics.aClass27_1785 = null;
			return 128 - payload[position++] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.VA(" + arg0 + ')');
		}
	}

	public int method205(boolean arg0) {
		try {
			Statics.anInt1827++;
			position += 2;
			if (arg0 != true)
				method231(true);
			int i = (((payload[-1 + position] & 0xff) << 782255336) + (payload[-2
					+ position] & 0xff));
			if ((i ^ 0xffffffff) < -32768)
				i -= 65536;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.D(" + arg0 + ')');
		}
	}

	public int readUByte() {
		return payload[position++] & 0xff;
	}

	public int method207(int arg0) {
		try {
			if (arg0 != -708753192)
				method210((byte) 116);
			position += 4;
			Statics.anInt1812++;
			return ((payload[-1 + position] & 0xff)
					+ ((payload[position - 2] & 0xff) << 8)
					+ ((payload[position + -4] & 0xff) << 24) + (0xff0000 & payload[-3
					+ position] << 16));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.GA(" + arg0 + ')');
		}
	}

	public void method208(int arg0, boolean arg1) {
		payload[position++] = (byte) -arg0;
		Statics.anInt1774++;
		if (arg1 != false)
			position = 73;
	}

	public void method209(int arg0, int arg1) {
		try {
			Statics.anInt1775++;
			payload[position++] = (byte) arg1;
			if (arg0 == -921469304) {
				payload[position++] = (byte) (arg1 >> 8);
				payload[position++] = (byte) (arg1 >> 16);
				payload[position++] = (byte) (arg1 >> 24);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.PA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int method210(byte arg0) {
		try {
			position += 4;
			if (arg0 != -6)
				method240((byte) 33);
			Statics.anInt1780++;
			return ((payload[position + -2] & 0xff)
					+ ((0xff00 & payload[-1 + position] << 8) + ((0xff & payload[-3
							+ position]) << 24)) + (payload[-4
					+ position] << 16 & 0xff0000));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.O(" + arg0 + ')');
		}
	}

	public void writeString(RSString string) {
		position += string.writeBytes(payload, position, 0, string.length());
		payload[position++] = (byte) 0;
	}

	public int method212(byte arg0) {
		try {
			position += 2;
			int i = (((0xff & payload[-2 + position]) << 8) - -(0xff & payload[position - 1]));
			Statics.anInt1773++;
			if (i > 32767)
				i -= 65536;
			if (arg0 > -24)
				return -54;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.CB(" + arg0 + ')');
		}
	}

	public void method213(int arg0, int arg1, int arg2, byte[] arg3) {
		try {
			Statics.anInt1807++;
			int i = arg2;
			if (arg0 != 14362)
				method247((byte) 31, -30);
			for (/**/; (arg1 + arg2 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				arg3[i] = payload[position++];
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("tc.HA(" + arg0 + ','
					+ arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public int readUShortLE() {
		position += 2;
		return ((payload[position - 2] & 0xff) + (payload[position - 1] << 8 & 0xff00));
	}

	public int method215(byte arg0) {
		try {
			if (arg0 != 94)
				method213(34, 80, 114, null);
			Statics.anInt1786++;
			position += 4;
			return (((0xff & payload[position + -2]) << -1404385160)
					+ ((payload[position - 1] & 0xff) << 1304222768) - (-((0xff & payload[position - 4]) << 231049832) + -(0xff & payload[-3
					+ position])));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.CA(" + arg0 + ')');
		}
	}

	public int method216(int arg0) {
		try {
			int i = 0xff & payload[position];
			if (arg0 != 23138)
				return -88;
			Statics.anInt1805++;
			if (i < 128)
				return readUByte() - 64;
			return -49152 + readShort(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.JA(" + arg0 + ')');
		}
	}

	public int method217(byte arg0) {
		try {
			Statics.anInt1808++;
			int i = 0;
			int i_1_;
			for (i_1_ = payload[position++]; i_1_ < 0; i_1_ = payload[position++])
				i = (i_1_ & 0x7f | i) << -1398415289;
			if (arg0 <= 31)
				return -41;
			return i_1_ | i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.BA(" + arg0 + ')');
		}
	}

	public int method219(int arg0) {
		try {
			Statics.anInt1817++;
			if (arg0 != 550259848)
				Statics.anIntArray1833 = null;
			position += 2;
			int i = ((0xff & payload[position + -2] + -128) + ((0xff & payload[-1
					+ position]) << -2097926136));
			if (i > 32767)
				i -= 65536;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.DB(" + arg0 + ')');
		}
	}

	public void writeLongBE(long value) {
		payload[position++] = (byte) (int) (value >> 56);
		payload[position++] = (byte) (int) (value >> 48);
		payload[position++] = (byte) (int) (value >> 40);
		payload[position++] = (byte) (int) (value >> 32);
		payload[position++] = (byte) (int) (value >> 24);
		payload[position++] = (byte) (int) (value >> 16);
		payload[position++] = (byte) (int) (value >> 8);
		payload[position++] = (byte) (int) value;
	}

	public void writeByte(int value) {
		payload[position++] = (byte) value;
	}

	public int readUIntLE() {
		position += 4;
		return (payload[position - 4] & 0xff) +
				((payload[position - 3] & 0xff) << 8) +
				((payload[position - 2] & 0xff) << 16) +
				((payload[position - 1] & 0xff) << 24);
	}

	public void method223(byte arg0, int arg1, int[] arg2, int arg3) {
		try {
			Statics.anInt1793++;
			int i = position;
			position = arg3;
			int i_2_ = (-arg3 + arg1) / 8;
			if (arg0 <= 46)
				Statics.aClass59_1829 = null;
			for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
				int i_4_ = method207(-708753192);
				int i_5_ = -957401312;
				int i_6_ = -1640531527;
				int i_7_ = method207(-708753192);
				int i_8_ = 32;
				while (i_8_-- > 0) {
					i_7_ -= (i_5_ + arg2[(0x1bbf & i_5_) >>> 11] ^ i_4_
							+ (i_4_ << 4 ^ i_4_ >>> 5));
					i_5_ -= i_6_;
					i_4_ -= (i_7_ + (i_7_ << 4 ^ i_7_ >>> 5) ^ i_5_
							- -arg2[i_5_ & 0x3]);
				}
				position -= 8;
				writeIntBE(i_4_);
				writeIntBE(i_7_);
			}
			position = i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("tc.T(" + arg0 + ','
					+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
					+ arg3 + ')'));
		}
	}

	public void method224(int arg0, int arg1) {
		try {
			Statics.anInt1810++;
			payload[position++] = (byte) arg0;
			if (arg1 != -9129)
				method245((byte) 79, -3);
			payload[position++] = (byte) (arg0 >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.OA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method225(int arg0, int arg1) {
		try {
			payload[position++] = (byte) (arg1 >> 16);
			if (arg0 == -11129) {
				payload[position++] = (byte) (arg1 >> 24);
				payload[position++] = (byte) arg1;
				payload[position++] = (byte) (arg1 >> 8);
				Statics.anInt1796++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.R(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public byte readByte(boolean arg0) {
		try {
			Statics.anInt1800++;
			if (arg0 != true)
				return (byte) -18;
			return payload[position++];
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.SA(" + arg0 + ')');
		}
	}

	public int readUShortLEA() {
		// @todo refactor this out of the client - Kat 13/Nov/22
		position += 2;
		return ((0xff & payload[position - 2] - 128) + ((payload[position - 1] & 0xff) << 8));
	}

	public byte method228(boolean arg0) {
		try {
			Statics.anInt1821++;
			if (arg0 != true)
				return (byte) -101;
			return (byte) (payload[position++] - 128);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.H(" + arg0 + ')');
		}
	}

	public int readUByteA() {
		// @todo refactor this out of the client - Kat 13/Nov/22
		return payload[position++] - 128 & 0xff;
	}

	public int method231(boolean arg0) {
		try {
			if (arg0 != false)
				return 22;
			int i = 0xff & payload[position];
			Statics.anInt1794++;
			if ((i ^ 0xffffffff) <= -129)
				return readShort(-1) - 32768;
			return readUByte();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.KA(" + arg0 + ')');
		}
	}

	public void method232(boolean arg0, int arg1) {
		try {
			Statics.anInt1831++;
			if (arg0 == false)
				payload[position++] = (byte) (128 + arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.AA(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public int method233(int arg0) {
		try {
			Statics.anInt1784++;
			if (arg0 != 16711680)
				return -27;
			position += 3;
			return ((0xff0000 & payload[-3 + position] << 16) + (((payload[-2
					+ position] & 0xff) << 8) + (payload[-1
					+ position] & 0xff)));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.FB(" + arg0 + ')');
		}
	}

	public void method234(byte[] arg0, int arg1, boolean arg2, int arg3) {
		for (int i = arg1; i < arg3 + arg1; i++)
			arg0[i] = (byte) (-128 + payload[position++]);
		Statics.anInt1790++;
		if (arg2 != false)
			Statics.aClass27_1785 = null;
	}

	public void method235(int arg0, byte arg1) {
		Statics.anInt1813++;
		payload[position++] = (byte) (arg0 >> 8);
		payload[position++] = (byte) (arg0 + 128);
		if (arg1 <= 57)
			Statics.aClass26_1830 = null;
	}

	public int method236(int arg0) {
		try {
			if (arg0 != -12543)
				method219(17);
			position += 2;
			Statics.anInt1811++;
			return (((payload[position + -2] & 0xff) << 8) - -(0xff & -128
					+ payload[-1 + position]));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.N(" + arg0 + ')');
		}
	}

	public byte method237(int arg0) {
		try {
			if (arg0 != 0)
				Statics.method251((byte) -76, null);
			Statics.anInt1799++;
			return (byte) (-payload[position++] + 128);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.F(" + arg0 + ')');
		}
	}

	public int method238(boolean arg0) {
		try {
			if (arg0 != true)
				Statics.anInt1834 = 40;
			Statics.anInt1824++;
			return -payload[position++] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.U(" + arg0 + ')');
		}
	}

	public long readLong(int arg0) {
		try {
			int i = -17 / ((54 - arg0) / 33);
			Statics.anInt1788++;
			long l = 0xffffffffL & (long) method207(-708753192);
			long l_9_ = 0xffffffffL & (long) method207(-708753192);
			return l_9_ + (l << 1932187104);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.S(" + arg0 + ')');
		}
	}

	public int method240(byte arg0) {
		try {
			Statics.anInt1815++;
			if (arg0 != 1)
				method223((byte) -43, -29, null, -68);
			position += 3;
			return (((0xff & payload[position + -2]) << -1177164624)
					- -((0xff & payload[position + -3]) << -1098742104) + (payload[-1
					+ position] & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.G(" + arg0 + ')');
		}
	}

	public void method241(int arg0, int arg1) {
		try {
			Statics.anInt1818++;
			if (arg0 == 96) {
				payload[position++] = (byte) (arg1 - -128);
				payload[position++] = (byte) (arg1 >> 1983318536);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.E(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method242(int arg0, int arg1) {
		try {
			payload[position + -arg1 + arg0] = (byte) arg1;
			Statics.anInt1791++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.AB(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void encrypt(BigInteger rsaExponent, BigInteger rsaModulus) {
		int i = position;
		position = 0;
		byte[] is = new byte[i];
		method213(14362, i, 0, is);
		Statics.anInt1814++;
		BigInteger biginteger = new BigInteger(is);
		BigInteger biginteger_10_ = biginteger.modPow(rsaExponent, rsaModulus);
		byte[] is_11_ = biginteger_10_.toByteArray();
		position = 0;
		writeByte(is_11_.length);
		method253(-8366, is_11_, is_11_.length, 0);
	}

	public void method245(byte arg0, int arg1) {
		Statics.anInt1804++;
		payload[position++] = (byte) (arg1 >> 8);
		payload[position++] = (byte) arg1;
		payload[position++] = (byte) (arg1 >> 24);
		payload[position++] = (byte) (arg1 >> 16);
		if (arg0 != -70)
			method232(true, -22);
	}

	public RSString method246(int arg0) {
		try {
			int i = position;
			if (arg0 != 20356)
				position = 44;
			while ((payload[position++] ^ 0xffffffff) != -1) {
				/* empty */
			}
			Statics.anInt1832++;
			return Class12_Sub12_Sub14.method539(0, payload, -1
					+ (-i + position), i);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.NA(" + arg0 + ')');
		}
	}

	public void method247(byte arg0, int arg1) {
		Statics.anInt1776++;
		payload[position++] = (byte) (arg1 >> 207669320);
		payload[position++] = (byte) arg1;
		if (arg0 != 91)
			Statics.anInt1834 = -126;
	}

	public void method249(int arg0, int arg1) {
		try {
			if (arg1 == 255) {
				Statics.anInt1801++;
				payload[position++] = (byte) (-arg0 + 128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.HB(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method250(int arg0, boolean arg1) {
		try {
			Statics.anInt1798++;
			if ((arg0 ^ 0xffffffff) <= -1 && (arg0 ^ 0xffffffff) > -129)
				writeByte(arg0);
			else {
				if (arg1 != true)
					Statics.aClass59_1829 = null;
				if ((arg0 ^ 0xffffffff) <= -1 && (arg0 ^ 0xffffffff) > -32769)
					method247((byte) 91, 32768 - -arg0);
				else
					throw new IllegalArgumentException();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.EB(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public Buffer(byte[] data) {
		try {
			payload = data;
			position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.<init>("
					+ (data != null ? "{...}" : "null") + ')');
		}
	}

	public void writeIntBE(int value) {
		payload[position++] = (byte) (value >> 24);
		payload[position++] = (byte) (value >> 16);
		payload[position++] = (byte) (value >> 8);
		payload[position++] = (byte) value;
	}

	public void method253(int arg0, byte[] arg1, int arg2, int arg3) {
		for (int i = arg3; i < arg2 + arg3; i++)
			payload[position++] = arg1[i];
		Statics.anInt1802++;
		if (arg0 != -8366)
			position = 79;
	}

	public void method254(int arg0, byte arg1) {
		payload[position++] = (byte) (arg0 >> 1063441232);
		payload[position++] = (byte) (arg0 >> 1351186888);
		payload[position++] = (byte) arg0;
		Statics.anInt1777++;
		if (arg1 >= -25)
			readUShortLEA();
	}

	public int readShort(int arg0) {
		try {
			Statics.anInt1823++;
			position += 2;
			if (arg0 != -1)
				Statics.aClass59_1829 = null;
			return (((payload[-2 + position] & 0xff) << 1403762632) + (0xff & payload[position
					+ -1]));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.P(" + arg0 + ')');
		}
	}

	public int method256(byte arg0, int arg1) {
		try {
			Statics.anInt1826++;
			if (arg0 < 21)
				return -107;
			int i = Class12_Sub12_Sub13.method523(arg1, position,
					payload, (byte) 39);
			writeIntBE(i);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "tc.GB(" + arg0 + ','
					+ arg1 + ')');
		}
	}
}
