package com.jagex;/* com.jagex.Class12_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub5_Sub1 extends Class12_Sub5 {
	public Class8[] aClass8Array1985 = new Class8[8];
	public Class8 aClass8_1986;
	public int anInt1987 = 16;
	public int anInt1988;
	public int anInt1989;
	public int anInt1990;

	public synchronized void method165(int arg0) {
		do {
			if (anInt1988 < 0) {
				method166(arg0);
				break;
			}
			if (anInt1989 + arg0 < anInt1988) {
				anInt1989 += arg0;
				method166(arg0);
				break;
			}
			int i = anInt1988 - anInt1989;
			method166(i);
			arg0 -= i;
			anInt1989 += i;
			method167();
			Class12_Sub3 class12_sub3 = (Class12_Sub3) aClass8_1986
					.method91((byte) 86);
			synchronized (class12_sub3) {
				int i_0_ = class12_sub3.method157(this);
				if (i_0_ < 0) {
					class12_sub3.anInt1662 = 0;
					method170(class12_sub3);
				} else {
					class12_sub3.anInt1662 = i_0_;
					method168(class12_sub3.aClass12_321, class12_sub3);
				}
			}
		} while (arg0 != 0);
	}

	public void method166(int arg0) {
		anInt1990 -= arg0;
		if (anInt1990 < 0)
			anInt1990 = 0;
		for (int i = 0; i < 8; i++) {
			Class8 class8 = aClass8Array1985[i];
			for (Class12_Sub5 class12_sub5 = (Class12_Sub5) class8
					.method91((byte) 86); class12_sub5 != null; class12_sub5 = (Class12_Sub5) class8
					.method100(-29860))
				class12_sub5.method165(arg0);
		}
	}

	public void method167() {
		if (anInt1989 > 0) {
			for (Class12_Sub3 class12_sub3 = (Class12_Sub3) aClass8_1986
					.method91((byte) 86); class12_sub3 != null; class12_sub3 = (Class12_Sub3) aClass8_1986
					.method100(-29860))
				class12_sub3.anInt1662 -= anInt1989;
			anInt1988 -= anInt1989;
			anInt1989 = 0;
		}
	}

	public synchronized int method163(int[] arg0, int arg1, int arg2) {
		for (;;) {
			if (anInt1988 < 0)
				return method172(arg0, arg1, arg2);
			if (anInt1989 + arg2 < anInt1988) {
				anInt1989 += arg2;
				return method172(arg0, arg1, arg2);
			}
			int i = anInt1988 - anInt1989;
			int i_1_ = method172(arg0, arg1, i);
			arg1 += i;
			arg2 -= i;
			anInt1989 += i;
			method167();
			Class12_Sub3 class12_sub3 = (Class12_Sub3) aClass8_1986
					.method91((byte) 86);
			synchronized (class12_sub3) {
				int i_2_ = class12_sub3.method157(this);
				if (i_2_ < 0) {
					class12_sub3.anInt1662 = 0;
					method170(class12_sub3);
				} else {
					class12_sub3.anInt1662 = i_2_;
					method168(class12_sub3.aClass12_321, class12_sub3);
				}
			}
			if (arg2 == 0)
				return i_1_;
		}
	}

	public void method168(Class12 arg0, Class12_Sub3 arg1) {
		for (/**/; (arg0 != aClass8_1986.aClass12_181 && ((Class12_Sub3) arg0).anInt1662 <= arg1.anInt1662); arg0 = arg0.aClass12_321) {
			/* empty */
		}
		aClass8_1986.method99((byte) -122, arg1, arg0);
		anInt1988 = (((Class12_Sub3) aClass8_1986.aClass12_181.aClass12_321).anInt1662);
	}

	public synchronized void method169(Class12_Sub5 arg0) {
		Class8 class8 = aClass8Array1985[method171(arg0)];
		class8.method97(arg0, 1);
	}

	public void method170(Class12_Sub3 arg0) {
		arg0.method143((byte) 39);
		arg0.method156();
		Class12 class12 = aClass8_1986.aClass12_181.aClass12_321;
		if (class12 == aClass8_1986.aClass12_181)
			anInt1988 = -1;
		else
			anInt1988 = ((Class12_Sub3) class12).anInt1662;
	}

	public static int method171(Class12_Sub5 arg0) {
		return arg0.method164() >> 5;
	}

	public int method172(int[] arg0, int arg1, int arg2) {
		anInt1990 -= arg2;
		if (anInt1990 <= 0) {
			anInt1990 += Class19.anInt446 >> 4;
			for (int i = 0; i < 8; i++) {
				Class8 class8 = aClass8Array1985[i];
				for (Class12_Sub5 class12_sub5 = (Class12_Sub5) class8
						.method91((byte) 86); class12_sub5 != null; class12_sub5 = (Class12_Sub5) class8
						.method100(-29860)) {
					int i_3_ = method171(class12_sub5);
					if (i_3_ != i)
						aClass8Array1985[i_3_].method97(class12_sub5, 1);
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			Class8 class8 = aClass8Array1985[i];
			for (Class12_Sub5 class12_sub5 = (Class12_Sub5) class8
					.method91((byte) 86); class12_sub5 != null; class12_sub5 = (Class12_Sub5) class8
					.method100(-29860)) {
				class12_sub5.aBoolean1681 = false;
				if (class12_sub5.aClass12_Sub8_1680 != null)
					class12_sub5.aClass12_Sub8_1680.anInt1740 = 0;
			}
		}
		int i = 0;
		int i_4_ = 255;
		int i_5_ = 7;
		while (i_4_ != 0) {
			int i_6_;
			int i_7_;
			if (i_5_ < 0) {
				i_6_ = i_5_ & 0x3;
				i_7_ = -(i_5_ >> 2);
			} else {
				i_6_ = i_5_;
				i_7_ = 0;
			}
			for (int i_8_ = i_4_ >>> i_6_ & 0x11111111; i_8_ != 0; i_8_ >>>= 4) {
				if ((i_8_ & 0x1) != 0) {
					i_4_ &= 1 << i_6_ ^ 0xffffffff;
					Class8 class8 = aClass8Array1985[i_6_];
					for (Class12_Sub5 class12_sub5 = (Class12_Sub5) class8
							.method91((byte) 86); class12_sub5 != null; class12_sub5 = (Class12_Sub5) class8
							.method100(-29860)) {
						if (!class12_sub5.aBoolean1681) {
							Class12_Sub8 class12_sub8 = class12_sub5.aClass12_Sub8_1680;
							if (class12_sub8 != null
									&& class12_sub8.anInt1740 > i_7_)
								i_4_ |= 1 << i_6_;
							else {
								if (i < anInt1987) {
									int i_9_ = class12_sub5.method163(arg0,
											arg1, arg2);
									i += i_9_;
									if (class12_sub8 != null)
										class12_sub8.anInt1740 += i_9_;
								} else
									class12_sub5.method165(arg2);
								class12_sub5.aBoolean1681 = true;
							}
						}
					}
				}
				i_6_ += 4;
				i_7_++;
			}
			i_5_--;
		}
		return i;
	}

	public Class12_Sub5_Sub1() {
		aClass8_1986 = new Class8();
		anInt1988 = -1;
		anInt1989 = 0;
		anInt1990 = 0;
		for (int i = 0; i < 8; i++)
			aClass8Array1985[i] = new Class8();
	}
}
