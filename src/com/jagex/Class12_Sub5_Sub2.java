package com.jagex;/* com.jagex.Class12_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub5_Sub2 extends Class12_Sub5 {
	public int anInt1991;
	public int anInt1992;
	public int anInt1993;
	public int anInt1994;
	public int anInt1995;
	public boolean aBoolean1996;
	public int anInt1997;
	public int anInt1998;
	public int anInt1999;
	public int anInt2000;
	public int anInt2001;

	public static int method173(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class12_Sub5_Sub2 arg10, int arg11, int arg12) {
		if (arg11 == 0
				|| (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8)
			arg7 = arg8;
		while (arg5 < arg7) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff))
					* arg6;
			arg4 += arg11;
		}
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8)
			arg7 = arg8;
		arg0 = arg12;
		arg1 = arg11;
		while (arg5 < arg7) {
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg4 >> 8] - arg0)
					* (arg4 & 0xff)) * arg6);
			arg4 += arg1;
		}
		arg10.anInt1995 = arg4;
		return arg5;
	}

	public static int method174(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, Class12_Sub5_Sub2 arg8) {
		arg2 >>= 8;
		arg7 >>= 8;
		arg4 <<= 8;
		if ((arg5 = arg3 + arg7 - arg2) > arg6)
			arg5 = arg6;
		arg5 -= 3;
		while (arg3 < arg5) {
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
		}
		arg5 += 3;
		while (arg3 < arg5)
			arg1[arg3++] += arg0[arg2++] * arg4;
		arg8.anInt1995 = arg2 << 8;
		return arg3;
	}

	public static int method175(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, Class12_Sub5_Sub2 arg12, int arg13, int arg14) {
		if (arg13 == 0
				|| (arg9 = arg5 + (arg11 - arg4 + arg13 - 257) / arg13) > arg10)
			arg9 = arg10;
		while (arg5 < arg9) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg1 + 1] - arg0)
					* (arg4 & 0xff)) * arg6) >> arg7;
			arg6 += arg8;
			arg4 += arg13;
		}
		if (arg13 == 0
				|| (arg9 = arg5 + (arg11 - arg4 + arg13 - 1) / arg13) > arg10)
			arg9 = arg10;
		arg1 = arg14;
		while (arg5 < arg9) {
			arg0 = arg2[arg4 >> 8];
			arg3[arg5++] += (((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff))
					* arg6 >> arg7);
			arg6 += arg8;
			arg4 += arg13;
		}
		arg12.anInt1997 = arg6;
		arg12.anInt1995 = arg4;
		return arg5;
	}

	public static int method176(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, Class12_Sub5_Sub2 arg12, int arg13, int arg14) {
		if (arg13 == 0
				|| (arg9 = arg5 + (arg11 + 256 - arg4 + arg13) / arg13) > arg10)
			arg9 = arg10;
		while (arg5 < arg9) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff))
					* arg6 >> arg7);
			arg6 += arg8;
			arg4 += arg13;
		}
		if (arg13 == 0
				|| (arg9 = arg5 + (arg11 - arg4 + arg13) / arg13) > arg10)
			arg9 = arg10;
		arg0 = arg14;
		arg1 = arg13;
		while (arg5 < arg9) {
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg4 >> 8] - arg0)
					* (arg4 & 0xff)) * arg6) >> arg7;
			arg6 += arg8;
			arg4 += arg1;
		}
		arg12.anInt1997 = arg6;
		arg12.anInt1995 = arg4;
		return arg5;
	}

	public static int method177(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class12_Sub5_Sub2 arg10) {
		arg2 >>= 8;
		arg9 >>= 8;
		arg4 <<= 8;
		if ((arg7 = arg3 + arg2 - (arg9 - 1)) > arg8)
			arg7 = arg8;
		arg7 -= 3;
		while (arg3 < arg7) {
			arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
			arg4 += arg6;
			arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
			arg4 += arg6;
			arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
			arg4 += arg6;
			arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg7 += 3;
		while (arg3 < arg7) {
			arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg10.anInt1997 = arg4 >> 8;
		arg10.anInt1995 = arg2 << 8;
		return arg3;
	}

	public static int method178(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class12_Sub5_Sub2 arg10, int arg11, int arg12) {
		if (arg11 == 0
				|| (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8)
			arg7 = arg8;
		while (arg5 < arg7) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg3[arg5++] += ((arg0 << 8) + (arg2[arg1 + 1] - arg0)
					* (arg4 & 0xff))
					* arg6;
			arg4 += arg11;
		}
		if (arg11 == 0
				|| (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8)
			arg7 = arg8;
		arg1 = arg12;
		while (arg5 < arg7) {
			arg0 = arg2[arg4 >> 8];
			arg3[arg5++] += ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff))
					* arg6;
			arg4 += arg11;
		}
		arg10.anInt1995 = arg4;
		return arg5;
	}

	public int method164() {
		int i = anInt1997 * 3;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt1991 == 0)
			i -= i
					* anInt1995
					/ ((((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002).length << 8);
		else if (anInt1991 >= 0)
			i -= i
					* anInt1998
					/ (((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002).length;
		if (i > 255)
			return 255;
		return i;
	}

	public synchronized int method163(int[] arg0, int arg1, int arg2) {
		if (anInt1997 == 0
				&& (anInt1994 == 0 || anInt2000 == 0 || anInt2000 == -2147483648)) {
			method165(arg2);
			return 0;
		}
		Class12_Sub8_Sub1 class12_sub8_sub1 = (Class12_Sub8_Sub1) aClass12_Sub8_1680;
		int i = anInt1998 << 8;
		int i_0_ = anInt1999 << 8;
		int i_1_ = class12_sub8_sub1.aByteArray2002.length << 8;
		int i_2_ = i_0_ - i;
		if (i_2_ <= 0)
			anInt1991 = 0;
		int i_3_ = arg1;
		arg2 += arg1;
		if (anInt1991 < 0) {
			if (aBoolean1996) {
				if (anInt2001 < 0) {
					i_3_ = method180(arg0, i_3_, i, arg2,
							(class12_sub8_sub1.aByteArray2002[anInt1998]));
					if (anInt1995 >= i)
						return 1;
					anInt1995 = i + i - 1 - anInt1995;
					anInt2001 = -anInt2001;
				}
				for (;;) {
					i_3_ = method183(arg0, i_3_, i_0_, arg2,
							(class12_sub8_sub1.aByteArray2002[anInt1999 - 1]));
					if (anInt1995 < i_0_)
						return 1;
					anInt1995 = i_0_ + i_0_ - 1 - anInt1995;
					anInt2001 = -anInt2001;
					i_3_ = method180(arg0, i_3_, i, arg2,
							(class12_sub8_sub1.aByteArray2002[anInt1998]));
					if (anInt1995 >= i)
						return 1;
					anInt1995 = i + i - 1 - anInt1995;
					anInt2001 = -anInt2001;
				}
			}
			if (anInt2001 < 0) {
				for (;;) {
					i_3_ = method180(arg0, i_3_, i, arg2,
							(class12_sub8_sub1.aByteArray2002[anInt1999 - 1]));
					if (anInt1995 >= i)
						return 1;
					anInt1995 = i_0_ - 1 - (i_0_ - 1 - anInt1995) % i_2_;
				}
			}
			for (;;) {
				i_3_ = method183(arg0, i_3_, i_0_, arg2,
						class12_sub8_sub1.aByteArray2002[anInt1998]);
				if (anInt1995 < i_0_)
					return 1;
				anInt1995 = i + (anInt1995 - i) % i_2_;
			}
		}
		do {
			if (anInt1991 > 0) {
				if (aBoolean1996) {
					if (anInt2001 < 0) {
						i_3_ = method180(arg0, i_3_, i, arg2,
								(class12_sub8_sub1.aByteArray2002[anInt1998]));
						if (anInt1995 >= i)
							return 1;
						anInt1995 = i + i - 1 - anInt1995;
						anInt2001 = -anInt2001;
						if (--anInt1991 == 0)
							break;
					}
					do {
						i_3_ = method183(
								arg0,
								i_3_,
								i_0_,
								arg2,
								(class12_sub8_sub1.aByteArray2002[anInt1999 - 1]));
						if (anInt1995 < i_0_)
							return 1;
						anInt1995 = i_0_ + i_0_ - 1 - anInt1995;
						anInt2001 = -anInt2001;
						if (--anInt1991 == 0)
							break;
						i_3_ = method180(arg0, i_3_, i, arg2,
								(class12_sub8_sub1.aByteArray2002[anInt1998]));
						if (anInt1995 >= i)
							return 1;
						anInt1995 = i + i - 1 - anInt1995;
						anInt2001 = -anInt2001;
					} while (--anInt1991 != 0);
				} else if (anInt2001 < 0) {
					for (;;) {
						i_3_ = method180(
								arg0,
								i_3_,
								i,
								arg2,
								(class12_sub8_sub1.aByteArray2002[anInt1999 - 1]));
						if (anInt1995 >= i)
							return 1;
						int i_4_ = (i_0_ - 1 - anInt1995) / i_2_;
						if (i_4_ >= anInt1991) {
							anInt1995 += i_2_ * anInt1991;
							anInt1991 = 0;
							break;
						}
						anInt1995 += i_2_ * i_4_;
						anInt1991 -= i_4_;
					}
				} else {
					for (;;) {
						i_3_ = method183(arg0, i_3_, i_0_, arg2,
								(class12_sub8_sub1.aByteArray2002[anInt1998]));
						if (anInt1995 < i_0_)
							return 1;
						int i_5_ = (anInt1995 - i) / i_2_;
						if (i_5_ >= anInt1991) {
							anInt1995 -= i_2_ * anInt1991;
							anInt1991 = 0;
							break;
						}
						anInt1995 -= i_2_ * i_5_;
						anInt1991 -= i_5_;
					}
				}
			}
		} while (false);
		if (anInt2001 < 0) {
			method180(arg0, i_3_, 0, arg2, 0);
			if (anInt1995 < 0) {
				anInt1995 = 0;
				this.method143((byte) 39);
			}
		} else {
			method183(arg0, i_3_, i_1_, arg2, 0);
			if (anInt1995 >= i_1_) {
				anInt1995 = i_1_ - 1;
				this.method143((byte) 39);
			}
		}
		return 1;
	}

	public synchronized void method179(int arg0) {
		anInt1991 = arg0;
	}

	public int method180(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (anInt1994 > 0) {
			int i = arg1 + anInt1994;
			if (i > arg3)
				i = arg3;
			anInt1994 += arg1;
			if (anInt2001 == -256 && (anInt1995 & 0xff) == 0)
				arg1 = method177(
						(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
						arg0, anInt1995, arg1, anInt1997, anInt1993, anInt1992,
						0, i, arg2, this);
			else
				arg1 = method176(
						0,
						0,
						(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
						arg0, anInt1995, arg1, anInt1997, anInt1993, anInt1992,
						0, i, arg2, this, anInt2001, arg4);
			anInt1994 -= arg1;
			if (anInt1994 != 0)
				return arg1;
			if (anInt2000 == -2147483648) {
				this.method143((byte) 39);
				return arg3;
			}
			anInt1997 = anInt2000;
		}
		if (anInt2001 == -256 && (anInt1995 & 0xff) == 0)
			return method182(
					(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
					arg0, anInt1995, arg1, anInt1997, 0, arg3, arg2, this);
		return method173(0, 0,
				(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
				arg0, anInt1995, arg1, anInt1997, 0, arg3, arg2, this,
				anInt2001, arg4);
	}

	public static Class12_Sub5_Sub2 method181(Class12_Sub8_Sub1 arg0, int arg1,
			int arg2) {
		if (arg0.aByteArray2002 == null || arg0.aByteArray2002.length == 0)
			return null;
		return new Class12_Sub5_Sub2(arg0, (int) ((long) arg0.anInt2003 * 256L
				* (long) arg1 / (long) (100 * Class19.anInt446)), arg2);
	}

	public static int method182(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, Class12_Sub5_Sub2 arg8) {
		arg2 >>= 8;
		arg7 >>= 8;
		arg4 <<= 8;
		if ((arg5 = arg3 + arg2 - (arg7 - 1)) > arg6)
			arg5 = arg6;
		arg5 -= 3;
		while (arg3 < arg5) {
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
		}
		arg5 += 3;
		while (arg3 < arg5)
			arg1[arg3++] += arg0[arg2--] * arg4;
		arg8.anInt1995 = arg2 << 8;
		return arg3;
	}

	public synchronized void method165(int arg0) {
		if (anInt1994 > 0) {
			if (arg0 >= anInt1994) {
				if (anInt2000 == -2147483648) {
					this.method143((byte) 39);
					arg0 = anInt1994;
				} else
					anInt1997 = anInt2000;
				anInt1994 = 0;
			} else {
				anInt1997 += anInt1992 * arg0;
				anInt1994 -= arg0;
			}
		}
		anInt1995 += anInt2001 * arg0;
		Class12_Sub8_Sub1 class12_sub8_sub1 = (Class12_Sub8_Sub1) aClass12_Sub8_1680;
		int i = anInt1998 << 8;
		int i_6_ = anInt1999 << 8;
		int i_7_ = class12_sub8_sub1.aByteArray2002.length << 8;
		int i_8_ = i_6_ - i;
		if (i_8_ <= 0)
			anInt1991 = 0;
		if (anInt1991 < 0) {
			if (aBoolean1996) {
				if (anInt2001 < 0) {
					if (anInt1995 >= i)
						return;
					anInt1995 = i + i - 1 - anInt1995;
					anInt2001 = -anInt2001;
				}
				while (anInt1995 >= i_6_) {
					anInt1995 = i_6_ + i_6_ - 1 - anInt1995;
					anInt2001 = -anInt2001;
					if (anInt1995 >= i)
						break;
					anInt1995 = i + i - 1 - anInt1995;
					anInt2001 = -anInt2001;
				}
			} else if (anInt2001 < 0) {
				if (anInt1995 < i)
					anInt1995 = i_6_ - 1 - (i_6_ - 1 - anInt1995) % i_8_;
			} else if (anInt1995 >= i_6_)
				anInt1995 = i + (anInt1995 - i) % i_8_;
		} else {
			do {
				if (anInt1991 > 0) {
					if (aBoolean1996) {
						if (anInt2001 < 0) {
							if (anInt1995 >= i)
								return;
							anInt1995 = i + i - 1 - anInt1995;
							anInt2001 = -anInt2001;
							if (--anInt1991 == 0)
								break;
						}
						do {
							if (anInt1995 < i_6_)
								return;
							anInt1995 = i_6_ + i_6_ - 1 - anInt1995;
							anInt2001 = -anInt2001;
							if (--anInt1991 == 0)
								break;
							if (anInt1995 >= i)
								return;
							anInt1995 = i + i - 1 - anInt1995;
							anInt2001 = -anInt2001;
						} while (--anInt1991 != 0);
					} else if (anInt2001 < 0) {
						if (anInt1995 >= i)
							return;
						int i_9_ = (i_6_ - 1 - anInt1995) / i_8_;
						if (i_9_ >= anInt1991) {
							anInt1995 += i_8_ * anInt1991;
							anInt1991 = 0;
						} else {
							anInt1995 += i_8_ * i_9_;
							anInt1991 -= i_9_;
							return;
						}
					} else {
						if (anInt1995 < i_6_)
							return;
						int i_10_ = (anInt1995 - i) / i_8_;
						if (i_10_ >= anInt1991) {
							anInt1995 -= i_8_ * anInt1991;
							anInt1991 = 0;
						} else {
							anInt1995 -= i_8_ * i_10_;
							anInt1991 -= i_10_;
							return;
						}
					}
				}
			} while (false);
			if (anInt2001 < 0) {
				if (anInt1995 < 0) {
					anInt1995 = 0;
					this.method143((byte) 39);
				}
			} else if (anInt1995 >= i_7_) {
				anInt1995 = i_7_ - 1;
				this.method143((byte) 39);
			}
		}
	}

	public Class12_Sub5_Sub2(Class12_Sub8_Sub1 arg0, int arg1, int arg2) {
		aClass12_Sub8_1680 = arg0;
		anInt1998 = arg0.anInt2005;
		anInt1999 = arg0.anInt2004;
		anInt2001 = arg1;
		anInt1997 = arg2;
		anInt1995 = 0;
	}

	public int method183(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (anInt1994 > 0) {
			int i = arg1 + anInt1994;
			if (i > arg3)
				i = arg3;
			anInt1994 += arg1;
			if (anInt2001 == 256 && (anInt1995 & 0xff) == 0)
				arg1 = method184(
						(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
						arg0, anInt1995, arg1, anInt1997, anInt1993, anInt1992,
						0, i, arg2, this);
			else
				arg1 = method175(
						0,
						0,
						(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
						arg0, anInt1995, arg1, anInt1997, anInt1993, anInt1992,
						0, i, arg2, this, anInt2001, arg4);
			anInt1994 -= arg1;
			if (anInt1994 != 0)
				return arg1;
			if (anInt2000 == -2147483648) {
				this.method143((byte) 39);
				return arg3;
			}
			anInt1997 = anInt2000;
		}
		if (anInt2001 == 256 && (anInt1995 & 0xff) == 0)
			return method174(
					(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
					arg0, anInt1995, arg1, anInt1997, 0, arg3, arg2, this);
		return method178(0, 0,
				(((Class12_Sub8_Sub1) aClass12_Sub8_1680).aByteArray2002),
				arg0, anInt1995, arg1, anInt1997, 0, arg3, arg2, this,
				anInt2001, arg4);
	}

	public static int method184(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class12_Sub5_Sub2 arg10) {
		arg2 >>= 8;
		arg9 >>= 8;
		arg4 <<= 8;
		if ((arg7 = arg3 + arg9 - arg2) > arg8)
			arg7 = arg8;
		arg7 -= 3;
		while (arg3 < arg7) {
			arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
			arg4 += arg6;
			arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
			arg4 += arg6;
			arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
			arg4 += arg6;
			arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg7 += 3;
		while (arg3 < arg7) {
			arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg10.anInt1997 = arg4 >> 8;
		arg10.anInt1995 = arg2 << 8;
		return arg3;
	}
}
