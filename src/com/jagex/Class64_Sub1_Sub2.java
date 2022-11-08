package com.jagex;/* com.jagex.Class64_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

public class Class64_Sub1_Sub2 extends Class64_Sub1 implements Runnable {
	public static Runnable_Impl1 aRunnable_Impl1_2568;
	public static boolean aBoolean2569;
	public static boolean aBoolean2570;
	public static int anInt2571;
	public static int anInt2572;
	public Class2 aClass2_2573 = new Class2();
	public static int[] anIntArray2574 = new int[256];

	public static void method993(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		try {
			if (anIntArray2574.length <= anInt2572) {
				aRunnable_Impl1_2568.method10(anIntArray2574, anInt2572);
				anInt2572 = 0;
			}
			anIntArray2574[anInt2572++] = arg2 + -anInt2571;
			if (arg1 != 1000)
				anInt2572 = 53;
			anInt2571 = arg2;
			anIntArray2574[anInt2572++] = (Class12_Sub12_Sub9.method421(
					Class12_Sub12_Sub9.method421(arg3 << -968658296, arg0),
					arg4 << 1659845136));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method994(byte arg0) {
		if (arg0 > 72) {
			if (anInt2572 > 0) {
				aRunnable_Impl1_2568.method10(anIntArray2574, anInt2572);
				anInt2572 = 0;
			}
		}
	}

	public void method984(int arg0, int arg1, int arg2, long arg3) {
		try {
			method993(arg0, 1000, (int) arg3, arg1, arg2);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public synchronized void method975(int arg0, byte[] arg1, int arg2,
			boolean arg3) {
		try {
			aClass2_2573.method52(arg1);
			boolean bool = true;
			aBoolean2570 = arg3;
			anInt2571 = 0;
			aRunnable_Impl1_2568.method12(false);
			this.method983(arg2, (byte) 112, arg0, (long) anInt2571);
			int i = aClass2_2573.method60();
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff); i_0_++) {
				aClass2_2573.method53(i_0_);
				while (!aClass2_2573.method48()) {
					aClass2_2573.method47(i_0_);
					if (aClass2_2573.anIntArray96[i_0_] != 0) {
						bool = false;
						break;
					}
					method995(arg2 ^ 0x70, 0L, i_0_);
				}
				aClass2_2573.method49(i_0_);
			}
			if (bool) {
				if (aBoolean2570)
					throw new RuntimeException();
				this.method986((long) anInt2571, 127);
				aClass2_2573.method50();
			}
			method994((byte) 117);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public synchronized void method979(int arg0, byte arg1) {
		try {
			if (arg1 != 50)
				method995(-79, -26L, -124);
			this.method988(arg0, (long) anInt2571, (byte) 20);
			aRunnable_Impl1_2568.method10(anIntArray2574, anInt2572);
			anInt2572 = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public synchronized void method980(int arg0) {
		try {
			if (aClass2_2573.method54()) {
				long l = ((long) (anInt2571 - (-200 - -aRunnable_Impl1_2568
						.method14(-29810))) * (long) (1000 * aClass2_2573.anInt93));
				for (;;) {
					int i = aClass2_2573.method63();
					int i_1_ = aClass2_2573.anIntArray96[i];
					long l_2_ = aClass2_2573.method59(i_1_);
					if (l < l_2_)
						break;
					while ((i_1_ ^ 0xffffffff) == (aClass2_2573.anIntArray96[i] ^ 0xffffffff)) {
						aClass2_2573.method53(i);
						method995(126, l_2_, i);
						if (aClass2_2573.method48()) {
							aClass2_2573.method49(i);
							if (aClass2_2573.method58()) {
								if (aBoolean2570)
									aClass2_2573.method61(l_2_);
								else {
									this.method986(
											(long) (int) (l_2_ / (long) ((aClass2_2573.anInt93) * 1000)),
											127);
									aClass2_2573.method50();
									method994((byte) 107);
									return;
								}
							}
							break;
						}
						aClass2_2573.method47(i);
						aClass2_2573.method49(i);
					}
				}
				if (arg0 > -90)
					aRunnable_Impl1_2568 = null;
				method994((byte) 126);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public synchronized void method981(boolean arg0) {
		try {
			aRunnable_Impl1_2568.method12(false);
			if (arg0 != true)
				method993(115, 57, -61, -76, 126);
			this.method986((long) anInt2571, 127);
			aRunnable_Impl1_2568.method10(anIntArray2574, anInt2572);
			anInt2572 = 0;
			aClass2_2573.method50();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public void method976(int arg0) {
		try {
			synchronized (this) {
				aBoolean2569 = true;
			}
			for (;;) {
				synchronized (this) {
					if (!aBoolean2569)
						break;
				}
				Statics.method218(20L, true);
			}
			if (arg0 != 699)
				anInt2572 = 48;
			aRunnable_Impl1_2568.method11(true);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public void run() {
		try {
			try {
				for (;;) {
					synchronized (this) {
						if (aBoolean2569) {
							aBoolean2569 = false;
							break;
						}
						method980(-126);
					}
					Statics.method218(100L, true);
				}
			} catch (Exception exception) {
				Class12_Sub12_Sub15.method551(true, null, exception);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public void method995(int arg0, long arg1, int arg2) {
		int i = aClass2_2573.method56(arg2);
		if ((i ^ 0xffffffff) != -2) {
			if ((i & 0x80) != 0) {
				int i_3_ = (int) (arg1 / (long) (aClass2_2573.anInt93 * 1000));
				int i_4_ = i & 0xff;
				int i_5_ = (0xffe7d5 & i) >> -1174595120;
				int i_6_ = (0xfff6 & i) >> 542411112;
				if (!this.method985(i_4_, i_6_, i_5_, (long) i_3_))
					method993(i_4_, 1000, i_3_, i_6_, i_5_);
			}
		} else
			aClass2_2573.method55();
		if (arg0 < 104)
			anInt2572 = 23;
	}

	public Class64_Sub1_Sub2(Signlink arg0, Runnable_Impl1 arg1) {
		try {
			aRunnable_Impl1_2568 = arg1;
			aRunnable_Impl1_2568.method15((byte) 96);
			aRunnable_Impl1_2568.method12(false);
			this.method986((long) anInt2571, 127);
			aRunnable_Impl1_2568.method10(anIntArray2574, anInt2572);
			anInt2572 = 0;
			arg0.putNodeType2(this, 10);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public synchronized void method978(int arg0, int arg1, byte arg2) {
		try {
			this.method983(arg1, (byte) 106, arg0, (long) anInt2571);
			int i = 73 / ((arg2 - -20) / 50);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
