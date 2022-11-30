package com.jagex;/* com.jagex.Class64_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.io.RSSocket;
import com.jagex.io.SizedAccessFile;
import com.jagex.sign.Signlink;
import com.jagex.sign.SignlinkNode;
import com.jagex.util.Statics;

import java.awt.FontMetrics;

public class Class64_Sub2 extends Class64 {
	public SignlinkNode aSignlinkNode_1953;
	public static RSString aClass59_1954;
	public static int anInt1955;
	public static int anInt1956;
	public static int anInt1957;
	public int anInt1958;
	public static RSString aClass59_1959 = Class55.method898(
			"Loading )2 please wait)3", -10983);
	public static int anInt1960;
	public static int anInt1961;
	public static RSString aClass59_1962;
	public static int anInt1963;
	public static int anInt1964;
	public static int anInt1965;
	public static volatile int anInt1966;
	public static RSString aClass59_1967;
	public static int anInt1968;
	public boolean aBoolean1969;
	public static RSString aClass59_1970;
	public boolean aBoolean1971;
	public static int anInt1972;
	public static int anInt1973;
	public static int anInt1974;
	public static byte[][][] aByteArrayArrayArray1975;
	public Signlink aSignlink_1976;
	public static Class36 aClass36_1977;
	public static RSString aClass59_1978;
	public static FontMetrics aFontMetrics1979;
	public byte[] aByteArray1980;
	public static RSString aClass59_1981;
	public static RSString aClass59_1982;
	public static RSString aClass59_1983;
	public static int[] anIntArray1984;

	public void method980(int arg0) {
		anInt1964++;
		if (aSignlinkNode_1953 != null
				&& (aSignlinkNode_1953.status ^ 0xffffffff) != -1) {
			if ((aSignlinkNode_1953.status ^ 0xffffffff) == -2) {
				SizedAccessFile sizedAccessFile = (SizedAccessFile) aSignlinkNode_1953.value;
				try {
					sizedAccessFile.write(aByteArray1980, 0, aByteArray1980.length
					);
					sizedAccessFile.close();
					try {
						Class60.method950(
								aSignlink_1976.applet,
								(byte) -43,
								("midibox.loop="
										+ (!aBoolean1969 ? "0" : "\"infinite\"")
										+ "; midibox.src=\""
										+ sizedAccessFile.getFile().getPath()
												.replace('\\', '/')
										+ "\"; midibox.volume=" + anInt1958 + ";"));
						aBoolean1971 = true;
					} catch (Throwable throwable) {
						/* empty */
					}
				} catch (Exception exception) {
					try {
						sizedAccessFile.close();
					} catch (Exception exception_0_) {
						/* empty */
					}
				}
			}
			aSignlinkNode_1953 = null;
			if (arg0 > -90)
				aSignlinkNode_1953 = null;
		}
	}

	public static RSString method996(byte arg0, int arg1) {
		try {
			if (arg0 < 38)
				return null;
			anInt1974++;
			RSString class59 = new RSString();
			class59.chars = new byte[arg1];
			class59.anInt1480 = 0;
			return class59;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "u.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method979(int arg0, byte arg1) {
		try {
			if (arg1 != 50)
				method976(75);
			anInt1965++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "u.P(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public void method978(int arg0, int arg1, byte arg2) {
		try {
			int i = 81 % ((-20 - arg2) / 50);
			if ((arg0 ^ 0xffffffff) == -1)
				arg0 = 1;
			int i_1_ = RuntimeException_Sub1.method1003(arg0, 0) + -arg1;
			anInt1957++;
			if (aSignlinkNode_1953 == null) {
				if (aBoolean1971) {
					try {
						Class60.method950(aSignlink_1976.applet,
								(byte) -124, "midibox.volume=" + i_1_ + ";");
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} else
				anInt1958 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("u.K(" + arg0 + ','
					+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method976(int arg0) {
		try {
			if (arg0 == 699)
				anInt1972++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "u.R(" + arg0 + ')');
		}
	}

	public static boolean method997(boolean arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11) {
		try {
			anInt1960++;
			for (int i = 0; i < 104; i++) {
				for (int i_2_ = 0; i_2_ < 104; i_2_++) {
					Class29.anIntArrayArray706[i][i_2_] = 0;
					Class12_Sub12_Sub9.anIntArrayArray2359[i][i_2_] = 99999999;
				}
			}
			Class29.anIntArrayArray706[arg9][arg11] = 99;
			Class12_Sub12_Sub9.anIntArrayArray2359[arg9][arg11] = 0;
			int i = arg9;
			if (arg2 != 25)
				aByteArrayArrayArray1975 = null;
			int i_3_ = 0;
			Class12_Sub12_Sub15.anIntArray2507[i_3_] = arg9;
			int i_4_ = arg11;
			int i_5_ = 0;
			Class57.anIntArray1333[i_3_++] = arg11;
			boolean bool = false;
			int i_6_ = Class12_Sub12_Sub15.anIntArray2507.length;
			int[][] is = (Class11.aClass10Array280[RSString.anInt1504].anIntArrayArray222);
			while ((i_5_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff)) {
				i_4_ = Class57.anIntArray1333[i_5_];
				i = Class12_Sub12_Sub15.anIntArray2507[i_5_];
				i_5_ = (1 + i_5_) % i_6_;
				if (i == arg8 && (arg1 ^ 0xffffffff) == (i_4_ ^ 0xffffffff)) {
					bool = true;
					break;
				}
				if (arg10 != 0) {
					if (((arg10 ^ 0xffffffff) > -6 || arg10 == 10)
							&& (Class11.aClass10Array280[RSString.anInt1504]
									.method121((byte) 69, i_4_, arg6, i, -1
											+ arg10, arg8, arg1))) {
						bool = true;
						break;
					}
					if (arg10 < 10
							&& (Class11.aClass10Array280[RSString.anInt1504]
									.method123(arg6, 1, i, arg8, arg1, i_4_, -1
											+ arg10))) {
						bool = true;
						break;
					}
				}
				if ((arg7 ^ 0xffffffff) != -1
						&& (arg3 ^ 0xffffffff) != -1
						&& (Class11.aClass10Array280[RSString.anInt1504]
								.method120(arg1, arg7, arg3, i_4_, i, arg8,
										(byte) 64, arg4))) {
					bool = true;
					break;
				}
				int i_7_ = 1 + Class12_Sub12_Sub9.anIntArrayArray2359[i][i_4_];
				if ((i ^ 0xffffffff) < -1
						&& ((Class29.anIntArrayArray706[i - 1][i_4_] ^ 0xffffffff) == -1)
						&& (is[i - 1][i_4_] & 0x1280108) == 0) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = -1 + i;
					Class57.anIntArray1333[i_3_] = i_4_;
					Class29.anIntArrayArray706[-1 + i][i_4_] = 2;
					i_3_ = (i_3_ + 1) % i_6_;
					Class12_Sub12_Sub9.anIntArrayArray2359[-1 + i][i_4_] = i_7_;
				}
				if (i < 103
						&& ((Class29.anIntArrayArray706[1 + i][i_4_] ^ 0xffffffff) == -1)
						&& (0x1280180 & is[i - -1][i_4_] ^ 0xffffffff) == -1) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = i + 1;
					Class57.anIntArray1333[i_3_] = i_4_;
					Class29.anIntArrayArray706[1 + i][i_4_] = 8;
					i_3_ = (i_3_ - -1) % i_6_;
					Class12_Sub12_Sub9.anIntArrayArray2359[i + 1][i_4_] = i_7_;
				}
				if (i_4_ > 0 && Class29.anIntArrayArray706[i][-1 + i_4_] == 0
						&& (is[i][i_4_ + -1] & 0x1280102 ^ 0xffffffff) == -1) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = i;
					Class57.anIntArray1333[i_3_] = -1 + i_4_;
					Class29.anIntArrayArray706[i][i_4_ + -1] = 1;
					Class12_Sub12_Sub9.anIntArrayArray2359[i][i_4_ + -1] = i_7_;
					i_3_ = (i_3_ + 1) % i_6_;
				}
				if (i_4_ < 103 && Class29.anIntArrayArray706[i][i_4_ - -1] == 0
						&& (is[i][i_4_ - -1] & 0x1280120) == 0) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = i;
					Class57.anIntArray1333[i_3_] = 1 + i_4_;
					i_3_ = (i_3_ - -1) % i_6_;
					Class29.anIntArrayArray706[i][1 + i_4_] = 4;
					Class12_Sub12_Sub9.anIntArrayArray2359[i][1 + i_4_] = i_7_;
				}
				if ((i ^ 0xffffffff) < -1 && i_4_ > 0
						&& Class29.anIntArrayArray706[-1 + i][-1 + i_4_] == 0
						&& (is[-1 + i][-1 + i_4_] & 0x128010e) == 0
						&& (0x1280108 & is[i - 1][i_4_] ^ 0xffffffff) == -1
						&& (is[i][-1 + i_4_] & 0x1280102 ^ 0xffffffff) == -1) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = i + -1;
					Class57.anIntArray1333[i_3_] = -1 + i_4_;
					i_3_ = (1 + i_3_) % i_6_;
					Class29.anIntArrayArray706[i - 1][i_4_ - 1] = 3;
					Class12_Sub12_Sub9.anIntArrayArray2359[-1 + i][-1 + i_4_] = i_7_;
				}
				if (i < 103
						&& (i_4_ ^ 0xffffffff) < -1
						&& (Class29.anIntArrayArray706[1 + i][-1 + i_4_] ^ 0xffffffff) == -1
						&& (0x1280183 & is[1 + i][i_4_ - 1] ^ 0xffffffff) == -1
						&& (0x1280180 & is[i - -1][i_4_]) == 0
						&& (0x1280102 & is[i][-1 + i_4_] ^ 0xffffffff) == -1) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = 1 + i;
					Class57.anIntArray1333[i_3_] = i_4_ - 1;
					i_3_ = (i_3_ - -1) % i_6_;
					Class29.anIntArrayArray706[1 + i][i_4_ + -1] = 9;
					Class12_Sub12_Sub9.anIntArrayArray2359[i + 1][-1 + i_4_] = i_7_;
				}
				if ((i ^ 0xffffffff) < -1
						&& (i_4_ ^ 0xffffffff) > -104
						&& (Class29.anIntArrayArray706[-1 + i][1 + i_4_] ^ 0xffffffff) == -1
						&& (is[i - 1][1 + i_4_] & 0x1280138 ^ 0xffffffff) == -1
						&& (0x1280108 & is[-1 + i][i_4_]) == 0
						&& (is[i][1 + i_4_] & 0x1280120 ^ 0xffffffff) == -1) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = i + -1;
					Class57.anIntArray1333[i_3_] = i_4_ - -1;
					i_3_ = (1 + i_3_) % i_6_;
					Class29.anIntArrayArray706[-1 + i][i_4_ - -1] = 6;
					Class12_Sub12_Sub9.anIntArrayArray2359[-1 + i][1 + i_4_] = i_7_;
				}
				if (i < 103
						&& i_4_ < 103
						&& (Class29.anIntArrayArray706[i + 1][i_4_ + 1] ^ 0xffffffff) == -1
						&& (0x12801e0 & is[i - -1][i_4_ - -1] ^ 0xffffffff) == -1
						&& (0x1280180 & is[1 + i][i_4_] ^ 0xffffffff) == -1
						&& (is[i][i_4_ - -1] & 0x1280120 ^ 0xffffffff) == -1) {
					Class12_Sub12_Sub15.anIntArray2507[i_3_] = i + 1;
					Class57.anIntArray1333[i_3_] = i_4_ - -1;
					Class29.anIntArrayArray706[1 + i][1 + i_4_] = 12;
					Class12_Sub12_Sub9.anIntArrayArray2359[1 + i][i_4_ - -1] = i_7_;
					i_3_ = (1 + i_3_) % i_6_;
				}
			}
			RSCanvas.anInt64 = 0;
			if (!bool) {
				if (!arg0)
					return false;
				int i_8_ = 1000;
				int i_9_ = 10;
				int i_10_ = 100;
				for (int i_11_ = arg8 - i_9_; (i_9_ + arg8 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff); i_11_++) {
					for (int i_12_ = -i_9_ + arg1; i_9_ + arg1 >= i_12_; i_12_++) {
						if (i_11_ >= 0
								&& i_12_ >= 0
								&& i_11_ < 104
								&& i_12_ < 104
								&& (Class12_Sub12_Sub9.anIntArrayArray2359[i_11_][i_12_]) < 100) {
							int i_13_ = 0;
							if (arg1 <= i_12_) {
								if (i_12_ > arg3 + (arg1 - 1))
									i_13_ = i_12_ + 1 + (-arg1 - arg3);
							} else
								i_13_ = -i_12_ + arg1;
							int i_14_ = 0;
							if ((arg8 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) {
								if ((i_11_ ^ 0xffffffff) < (arg8 - -arg7 + -1 ^ 0xffffffff))
									i_14_ = i_11_ + 1 + -arg8 + -arg7;
							} else
								i_14_ = -i_11_ + arg8;
							int i_15_ = i_14_ * i_14_ - -(i_13_ * i_13_);
							if (i_8_ > i_15_
									|| ((i_15_ ^ 0xffffffff) == (i_8_ ^ 0xffffffff) && i_10_ > (Class12_Sub12_Sub9.anIntArrayArray2359[i_11_][i_12_]))) {
								i_10_ = (Class12_Sub12_Sub9.anIntArrayArray2359[i_11_][i_12_]);
								i = i_11_;
								i_4_ = i_12_;
								i_8_ = i_15_;
							}
						}
					}
				}
				if ((i_8_ ^ 0xffffffff) == -1001)
					return false;
				if (i == arg9 && (i_4_ ^ 0xffffffff) == (arg11 ^ 0xffffffff))
					return false;
				RSCanvas.anInt64 = 1;
			}
			i_5_ = 0;
			Class12_Sub12_Sub15.anIntArray2507[i_5_] = i;
			Class57.anIntArray1333[i_5_++] = i_4_;
			int i_17_;
			int i_16_ = i_17_ = Class29.anIntArrayArray706[i][i_4_];
			while (i != arg9 || (arg11 ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
				if (i_17_ != i_16_) {
					i_17_ = i_16_;
					Class12_Sub12_Sub15.anIntArray2507[i_5_] = i;
					Class57.anIntArray1333[i_5_++] = i_4_;
				}
				if ((i_16_ & 0x2) == 0) {
					if ((i_16_ & 0x8 ^ 0xffffffff) != -1)
						i--;
				} else
					i++;
				if ((i_16_ & 0x1 ^ 0xffffffff) == -1) {
					if ((0x4 & i_16_) != 0)
						i_4_--;
				} else
					i_4_++;
				i_16_ = Class29.anIntArrayArray706[i][i_4_];
			}
			if (i_5_ > 0) {
				i_6_ = i_5_;
				i_5_--;
				int i_18_ = Class12_Sub12_Sub15.anIntArray2507[i_5_];
				int i_19_ = Class57.anIntArray1333[i_5_];
				if (i_6_ > 25)
					i_6_ = 25;
				if (arg5 == 0) {
					RSSocket.anInt515++;
					Game.outBuffer.writePacket(104);
					Game.outBuffer.writeByte(3
							+ i_6_ + i_6_);
				}
				if (arg5 == 1) {
					Class49.anInt1145++;
					Game.outBuffer.writePacket(142);
					Game.outBuffer.writeByte(14 + i_6_
							- (-i_6_ - 3));
				}
				if (arg5 == 2) {
					Game.outBuffer.writePacket(20);
					Class44.anInt1032++;
					Game.outBuffer.writeByte(i_6_ - -i_6_
							+ 3);
				}
				Class23.anInt499 = Class12_Sub12_Sub15.anIntArray2507[0];
				Class29.anInt711 = Class57.anIntArray1333[0];
				for (int i_20_ = 1; i_6_ > i_20_; i_20_++) {
					i_5_--;
					Game.outBuffer.writeByte(-i_18_ + Class12_Sub12_Sub15.anIntArray2507[i_5_]);
					Game.outBuffer.writeByte(Class57.anIntArray1333[i_5_] - i_19_);
				}
				Game.outBuffer.writeByte(
						!(Class12_Sub1.aBooleanArray1627[82]) ? 0 : 1);
				Game.outBuffer.writeShortLE(Class8.anInt174 + i_19_);
				Game.outBuffer.writeShortBE(i_18_ + Class64.anInt1451);
				return true;
			}
			if (arg5 == 1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("u.A(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5
					+ ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ','
					+ arg10 + ',' + arg11 + ')'));
		}
	}

	public void method975(int arg0, byte[] arg1, int arg2, boolean arg3) {
		try {
			anInt1963++;
			aSignlinkNode_1953 = aSignlink_1976.method880((byte) 127);
			if (aSignlinkNode_1953 != null) {
				if (arg0 == arg2)
					arg0 = 1;
				anInt1958 = RuntimeException_Sub1.method1003(arg0, 0);
				aBoolean1969 = arg3;
				aByteArray1980 = arg1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("u.N(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public void method981(boolean arg0) {
		try {
			if (arg0 == true) {
				if (aBoolean1971) {
					try {
						Class60.method950(aSignlink_1976.applet,
								(byte) -32, "midibox.src=\"c:/silence.mid\";");
					} catch (Throwable throwable) {
						/* empty */
					}
					aBoolean1971 = false;
				}
				aSignlinkNode_1953 = null;
				anInt1955++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "u.Q(" + arg0 + ')');
		}
	}

	public static void method998(byte arg0) {
		aClass36_1977 = null;
		aClass59_1983 = null;
		aClass59_1959 = null;
		aClass59_1954 = null;
		aClass59_1981 = null;
		aClass59_1978 = null;
		aClass59_1982 = null;
		aClass59_1962 = null;
		aByteArrayArrayArray1975 = null;
		aFontMetrics1979 = null;
		aClass59_1970 = null;
		aClass59_1967 = null;
		anIntArray1984 = null;
		if (arg0 != 62)
			method998((byte) -99);
	}

	public static void parseTrackedPlayerMovement(int arg0) {
		anInt1973++;
		int i = Game.inBuffer.readBits(8);
		if ((Class9.anInt203 ^ 0xffffffff) < (i ^ 0xffffffff)) {
			for (int i_21_ = i; Class9.anInt203 > i_21_; i_21_++)
				Statics.anIntArray1833[Class11.anInt287++] = Class36.anIntArray888[i_21_];
		}
		if (Class9.anInt203 < i)
			throw new RuntimeException("gppov1");
		Class9.anInt203 = 0;
		for (int i_22_ = 0; (i ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
			int i_23_ = Class36.anIntArray888[i_22_];
			Player class12_sub12_sub11_sub2_sub2 = Class63.aClass12_Sub12_Sub11_Sub2_Sub2Array1398[i_23_];
			int i_24_ = Game.inBuffer.readBits(1);
			if (i_24_ == 0) {
				Class36.anIntArray888[Class9.anInt203++] = i_23_;
				class12_sub12_sub11_sub2_sub2.anInt2663 = anInt1968;
			} else {
				int i_25_ = Game.inBuffer.readBits(2);
				if (i_25_ == 0) {
					Class36.anIntArray888[Class9.anInt203++] = i_23_;
					class12_sub12_sub11_sub2_sub2.anInt2663 = anInt1968;
					Class10.anIntArray220[Class47.anInt1094++] = i_23_;
				} else if (i_25_ == 1) {
					Class36.anIntArray888[Class9.anInt203++] = i_23_;
					class12_sub12_sub11_sub2_sub2.anInt2663 = anInt1968;
					int i_26_ = Game.inBuffer.readBits(3
					);
					class12_sub12_sub11_sub2_sub2.method445(i_26_,
							arg0 ^ 0x36ff, false);
					int i_27_ = Game.inBuffer.readBits(1
					);
					if (i_27_ == 1)
						Class10.anIntArray220[Class47.anInt1094++] = i_23_;
				} else if ((i_25_ ^ 0xffffffff) == -3) {
					Class36.anIntArray888[Class9.anInt203++] = i_23_;
					class12_sub12_sub11_sub2_sub2.anInt2663 = anInt1968;
					int i_28_ = Game.inBuffer.readBits(3
					);
					class12_sub12_sub11_sub2_sub2.method445(i_28_, 64, true);
					int i_29_ = Game.inBuffer.readBits(3
					);
					class12_sub12_sub11_sub2_sub2.method445(i_29_, arg0
							+ -13951, true);
					int i_30_ = Game.inBuffer.readBits(1
					);
					if (i_30_ == 1)
						Class10.anIntArray220[Class47.anInt1094++] = i_23_;
				} else if ((i_25_ ^ 0xffffffff) == -4)
					Statics.anIntArray1833[Class11.anInt287++] = i_23_;
			}
		}
		if (arg0 != 14015)
			method996((byte) 56, -111);
	}

	public Class64_Sub2(Signlink arg0) {
		try {
			aSignlink_1976 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "u.<init>("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass59_1954 = Class55.method898(" from your ignore list first",
				-10983);
		anInt1968 = 0;
		anInt1966 = 0;
		anInt1961 = 0;
		aClass59_1981 = aClass59_1954;
		aClass59_1982 = Class55.method898("Connecting to server)3)3)3", -10983);
		aClass59_1970 = aClass59_1959;
		aClass59_1967 = Class55.method898("Offline", -10983);
		aClass59_1962 = aClass59_1982;
		aClass59_1978 = aClass59_1967;
		aClass59_1983 = Class55.method898("_", -10983);
	}
}
