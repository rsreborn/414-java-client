package com.jagex;/* com.jagex.Class9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.util.Statics;

public class Class9_Sub1 extends Class9 {
	public long aLong1578;

	public int method105(int arg0, int arg1, int arg2) {
		int i;
		try {
			long l = 1000000L * (long) arg0;
			if (arg1 != 9104)
				aLong1578 = 115L;
			long l_0_ = aLong1578 - System.nanoTime();
			int i_1_ = 0;
			if ((l_0_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL))
				l_0_ = l;
			Statics.method218(l_0_ / 1000000L, true);
			long l_2_;
			for (l_2_ = System.nanoTime(); -11 < (i_1_ ^ 0xffffffff)
					&& (i_1_ < 1 || l_2_ > aLong1578); aLong1578 += (long) arg2 * 1000000L)
				i_1_++;
			if ((l_2_ ^ 0xffffffffffffffffL) < (aLong1578 ^ 0xffffffffffffffffL))
				aLong1578 = l_2_;
			i = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	public Class9_Sub1() {
		method106(false);
	}

	public void method106(boolean arg0) {
		aLong1578 = System.nanoTime();
		if (arg0)
			method106(true);
	}

	public void method108(byte arg0) {
		method106(false);
		if (arg0 < 39)
			method105(81, -3, 88);
	}
}
