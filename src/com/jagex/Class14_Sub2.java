package com.jagex;/* com.jagex.Class14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

public abstract class Class14_Sub2 extends Class14 implements Runnable {
	public long aLong1856 = 0L;
	public int anInt1857;
	public int anInt1858;
	public int anInt1859;
	public boolean aBoolean1860 = false;
	public long aLong1861;
	public static int[] anIntArray1862 = new int[256];
	public int anInt1863;
	public int[] anIntArray1864;
	public long aLong1865;
	public int anInt1866;
	public int anInt1867;
	public int anInt1868;
	public int anInt1869;

	public abstract void method576(int i) throws Exception;

	public abstract void method577();

	public void method578(long arg0) throws Exception {
		method576(anInt1869);
		for (;;) {
			int i = method583();
			if (i < anInt1868)
				break;
			method579();
		}
		anInt1867 = 0;
		anInt1863 = 0;
		aLong1865 = arg0;
		aLong1861 = arg0;
	}

	public void run() {
		try {
			for (;;) {
				synchronized (this) {
					if (aBoolean1860) {
						if (aLong1856 == 0L)
							method577();
						aBoolean1860 = false;
						break;
					}
					method571(System.currentTimeMillis());
				}
				Statics.method218(5L, true);
			}
		} catch (Exception exception) {
			Class12_Sub12_Sub15.method551(true, null, exception);
		}
	}

	public abstract void method579() throws Exception;

	public static void method580() {
		anIntArray1862 = null;
	}

	public void method581(long arg0) {
		if (aLong1856 != 0L) {
			for (/**/; aLong1865 < arg0; aLong1865 += (long) (256000 / Class19.anInt446))
				Class14.method575(256, 3328);
			if (arg0 < aLong1856)
				return;
			try {
				method578(arg0);
			} catch (Exception exception) {
				method577();
				aLong1856 += 5000L;
				return;
			}
			aLong1856 = 0L;
		}
		while (aLong1865 < arg0) {
			aLong1865 += (long) (250880 / Class19.anInt446);
			int i;
			try {
				i = method583();
			} catch (Exception exception) {
				method577();
				aLong1856 = arg0;
				return;
			}
			method582(i);
			int i_0_ = anInt1859 * 3 / 512 - anInt1857 * 2;
			if (i_0_ < 0)
				i_0_ = 0;
			else if (i_0_ > anInt1858)
				i_0_ = anInt1858;
			anInt1868 = anInt1869 - 256 - i_0_;
			if (anInt1868 < 256)
				anInt1868 = 256;
			if (anInt1869 < 16384) {
				if (i >= anInt1869) {
					anInt1867 += 5;
					if (anInt1867 >= 100) {
						method577();
						anInt1869 += 2048;
						aLong1856 = arg0;
						return;
					}
				} else if (i != anInt1863 && anInt1867 > 0)
					anInt1867--;
			}
			anInt1863 = i;
			if (i < anInt1868)
				break;
			Class14.method568(anIntArray1862, 256);
			try {
				method579();
			} catch (Exception exception) {
				method577();
				aLong1856 = arg0;
				return;
			}
			aLong1861 = arg0;
			anInt1863 -= 256;
		}
		if (arg0 >= aLong1861 + 5000L) {
			method577();
			aLong1856 = arg0;
			for (int i = 0; i < 512; i++)
				anIntArray1864[i] = 0;
			anInt1857 = anInt1858 = anInt1859 = 0;
		}
	}

	public Class14_Sub2(int arg0) throws Exception {
		super(arg0);
		anInt1859 = 0;
		anInt1857 = 0;
		anInt1866 = 0;
		anIntArray1864 = new int[512];
		anInt1858 = 0;
		anInt1868 = 256;
	}

	public void method582(int arg0) {
		int i = arg0 - anInt1868;
		int i_1_ = anIntArray1864[anInt1866];
		anIntArray1864[anInt1866] = i;
		anInt1859 += i - i_1_;
		int i_2_ = anInt1866 + 1 & 0x1ff;
		if (i > anInt1858)
			anInt1858 = i;
		if (i < anInt1857)
			anInt1857 = i;
		if (i_1_ == anInt1858) {
			int i_3_ = i;
			for (int i_4_ = i_2_; i_4_ != anInt1866 && i_3_ < anInt1858; i_4_ = i_4_ + 1 & 0x1ff) {
				int i_5_ = anIntArray1864[i_4_];
				if (i_5_ > i_3_)
					i_3_ = i_5_;
			}
			anInt1858 = i_3_;
		}
		if (i_1_ == anInt1857) {
			int i_6_ = i;
			for (int i_7_ = i_2_; i_7_ != anInt1866 && i_6_ > anInt1857; i_7_ = i_7_ + 1 & 0x1ff) {
				int i_8_ = anIntArray1864[i_7_];
				if (i_8_ < i_6_)
					i_6_ = i_8_;
			}
			anInt1857 = i_6_;
		}
		anInt1866 = i_2_;
	}

	public void method573() {
		synchronized (this) {
			aBoolean1860 = true;
		}
		for (;;) {
			synchronized (this) {
				if (!aBoolean1860)
					break;
			}
			Statics.method218(50L, true);
		}
	}

	public abstract int method583() throws Exception;

	public synchronized void method571(long arg0) {
		method581(arg0);
		if (aLong1865 < arg0)
			aLong1865 = arg0;
	}

	public void method584(Signlink arg0, int arg1) throws Exception {
		anInt1869 = arg1;
		method578(System.currentTimeMillis());
		arg0.putNodeType2(this, 10);
	}
}
