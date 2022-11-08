package com.jagex;/* com.jagex.Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.util.Statics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class13 implements MouseListener, MouseMotionListener {
	public static Class27 aClass27_335;
	public static int anInt336;
	public static int anInt337;
	public static int anInt338 = 0;
	public static int anInt339;
	public static int anInt340;
	public static int anInt341;
	public static int anInt342;
	public static int anInt343 = -1;
	public static int anInt344;
	public static int anInt345;
	public static int anInt346;
	public static int anInt347;
	public static int anInt348;
	public static int anInt349;
	public static int anInt350;
	public static int anInt351;
	public static int anInt352;
	public static int anInt353;
	public static Class12_Sub12_Sub8 aClass12_Sub12_Sub8_354;
	public static RSString aClass59_355;
	public static int[] anIntArray356;
	public static RSString aClass59_357;

	public static void method561(byte arg0) {
		anInt346++;
		if (arg0 != -102)
			method562(69, true);
		if (Class12_Sub1.anInt1625 == 1) {
			if (Class10.anInt226 >= 539 && Class10.anInt226 <= 573
					&& (Class42.anInt1000 ^ 0xffffffff) <= -170
					&& (Class42.anInt1000 ^ 0xffffffff) > -206
					&& (Class62_Sub2.anIntArray1907[0] ^ 0xffffffff) != 0) {
				Class15.anInt400 = 0;
				Class12_Sub2.aBoolean1641 = true;
				Class49.aBoolean1146 = true;
			}
			if (Class10.anInt226 >= 569
					&& (Class10.anInt226 ^ 0xffffffff) >= -600
					&& (Class42.anInt1000 ^ 0xffffffff) <= -169
					&& (Class42.anInt1000 ^ 0xffffffff) > -206
					&& (Class62_Sub2.anIntArray1907[1] ^ 0xffffffff) != 0) {
				Class49.aBoolean1146 = true;
				Class15.anInt400 = 1;
				Class12_Sub2.aBoolean1641 = true;
			}
			if (Class10.anInt226 >= 597 && Class10.anInt226 <= 627
					&& (Class42.anInt1000 ^ 0xffffffff) <= -169
					&& (Class42.anInt1000 ^ 0xffffffff) > -206
					&& Class62_Sub2.anIntArray1907[2] != -1) {
				Class15.anInt400 = 2;
				Class12_Sub2.aBoolean1641 = true;
				Class49.aBoolean1146 = true;
			}
			if ((Class10.anInt226 ^ 0xffffffff) <= -626
					&& Class10.anInt226 <= 669
					&& (Class42.anInt1000 ^ 0xffffffff) <= -169
					&& (Class42.anInt1000 ^ 0xffffffff) > -204
					&& Class62_Sub2.anIntArray1907[3] != -1) {
				Class12_Sub2.aBoolean1641 = true;
				Class49.aBoolean1146 = true;
				Class15.anInt400 = 3;
			}
			if (Class10.anInt226 >= 666 && Class10.anInt226 <= 696
					&& Class42.anInt1000 >= 168
					&& (Class42.anInt1000 ^ 0xffffffff) > -206
					&& Class62_Sub2.anIntArray1907[4] != -1) {
				Class12_Sub2.aBoolean1641 = true;
				Class49.aBoolean1146 = true;
				Class15.anInt400 = 4;
			}
			if ((Class10.anInt226 ^ 0xffffffff) <= -695
					&& (Class10.anInt226 ^ 0xffffffff) >= -725
					&& (Class42.anInt1000 ^ 0xffffffff) <= -169
					&& (Class42.anInt1000 ^ 0xffffffff) > -206
					&& (Class62_Sub2.anIntArray1907[5] ^ 0xffffffff) != 0) {
				Class12_Sub2.aBoolean1641 = true;
				Class15.anInt400 = 5;
				Class49.aBoolean1146 = true;
			}
			if (Class10.anInt226 >= 722 && Class10.anInt226 <= 756
					&& (Class42.anInt1000 ^ 0xffffffff) <= -170
					&& (Class42.anInt1000 ^ 0xffffffff) > -206
					&& Class62_Sub2.anIntArray1907[6] != -1) {
				Class15.anInt400 = 6;
				Class49.aBoolean1146 = true;
				Class12_Sub2.aBoolean1641 = true;
			}
			if ((Class10.anInt226 ^ 0xffffffff) <= -541
					&& (Class10.anInt226 ^ 0xffffffff) >= -575
					&& (Class42.anInt1000 ^ 0xffffffff) <= -467
					&& Class42.anInt1000 < 502
					&& Class62_Sub2.anIntArray1907[7] != -1) {
				Class12_Sub2.aBoolean1641 = true;
				Class15.anInt400 = 7;
				Class49.aBoolean1146 = true;
			}
			if (Class10.anInt226 >= 572
					&& (Class10.anInt226 ^ 0xffffffff) >= -603
					&& (Class42.anInt1000 ^ 0xffffffff) <= -467
					&& (Class42.anInt1000 ^ 0xffffffff) > -504
					&& (Class62_Sub2.anIntArray1907[8] ^ 0xffffffff) != 0) {
				Class49.aBoolean1146 = true;
				Class15.anInt400 = 8;
				Class12_Sub2.aBoolean1641 = true;
			}
			if ((Class10.anInt226 ^ 0xffffffff) <= -600
					&& Class10.anInt226 <= 629 && Class42.anInt1000 >= 466
					&& Class42.anInt1000 < 503
					&& (Class62_Sub2.anIntArray1907[9] ^ 0xffffffff) != 0) {
				Class49.aBoolean1146 = true;
				Class15.anInt400 = 9;
				Class12_Sub2.aBoolean1641 = true;
			}
			if ((Class10.anInt226 ^ 0xffffffff) <= -628
					&& Class10.anInt226 <= 671 && Class42.anInt1000 >= 467
					&& (Class42.anInt1000 ^ 0xffffffff) > -503
					&& (Class62_Sub2.anIntArray1907[10] ^ 0xffffffff) != 0) {
				Class12_Sub2.aBoolean1641 = true;
				Class15.anInt400 = 10;
				Class49.aBoolean1146 = true;
			}
			if ((Class10.anInt226 ^ 0xffffffff) <= -670
					&& Class10.anInt226 <= 699 && Class42.anInt1000 >= 466
					&& Class42.anInt1000 < 503
					&& Class62_Sub2.anIntArray1907[11] != -1) {
				Class49.aBoolean1146 = true;
				Class12_Sub2.aBoolean1641 = true;
				Class15.anInt400 = 11;
			}
			if (Class10.anInt226 >= 696 && Class10.anInt226 <= 726
					&& Class42.anInt1000 >= 466 && Class42.anInt1000 < 503
					&& (Class62_Sub2.anIntArray1907[12] ^ 0xffffffff) != 0) {
				Class12_Sub2.aBoolean1641 = true;
				Class15.anInt400 = 12;
				Class49.aBoolean1146 = true;
			}
			if ((Class10.anInt226 ^ 0xffffffff) <= -725
					&& Class10.anInt226 <= 758
					&& (Class42.anInt1000 ^ 0xffffffff) <= -467
					&& Class42.anInt1000 < 502
					&& Class62_Sub2.anIntArray1907[13] != -1) {
				Class15.anInt400 = 13;
				Class49.aBoolean1146 = true;
				Class12_Sub2.aBoolean1641 = true;
			}
		}
	}

	public static RSString method562(int arg0, boolean arg1) {
		try {
			anInt340++;
			if (arg1 != false)
				method561((byte) -37);
			return (Statics
					.method251(
							(byte) -46,
							(new RSString[] {
									Class19.method599(
											0xff & arg0 >> -2061774408, 10),
									Statics.aClass59_555,
									Class19.method599(
											(0xff43bb & arg0) >> -1421244720,
											10),
									Statics.aClass59_555,
									Class19.method599(
											(0xffb8 & arg0) >> -120922296, 10),
									Statics.aClass59_555,
									Class19.method599(arg0 & 0xff, 10) })));
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ea.A(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public synchronized void mouseDragged(MouseEvent arg0) {
		anInt337++;
		if (Class12_Sub12_Sub11_Sub1.aClass13_2641 != null) {
			Class30.anInt745 = 0;
			Class41.anInt962 = arg0.getX();
			Class12_Sub12_Sub10.anInt2367 = arg0.getY();
		}
	}

	public synchronized void mouseEntered(MouseEvent arg0) {
		try {
			if (Class12_Sub12_Sub11_Sub1.aClass13_2641 != null) {
				Class30.anInt745 = 0;
				Class41.anInt962 = arg0.getX();
				Class12_Sub12_Sub10.anInt2367 = arg0.getY();
			}
			anInt342++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ea.mouseEntered("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public synchronized void mouseExited(MouseEvent arg0) {
		anInt345++;
		if (Class12_Sub12_Sub11_Sub1.aClass13_2641 != null) {
			Class30.anInt745 = 0;
			Class41.anInt962 = -1;
			Class12_Sub12_Sub10.anInt2367 = -1;
		}
	}

	public synchronized void mouseMoved(MouseEvent arg0) {
		try {
			if (Class12_Sub12_Sub11_Sub1.aClass13_2641 != null) {
				Class30.anInt745 = 0;
				Class41.anInt962 = arg0.getX();
				Class12_Sub12_Sub10.anInt2367 = arg0.getY();
			}
			anInt347++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ea.mouseMoved("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method563(int arg0) {
		try {
			aClass12_Sub12_Sub8_354 = null;
			if (arg0 == 27624) {
				aClass59_357 = null;
				aClass27_335 = null;
				aClass59_355 = null;
				anIntArray356 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ea.D(" + arg0 + ')');
		}
	}

	public synchronized void mouseReleased(MouseEvent arg0) {
		anInt348++;
		if (Class12_Sub12_Sub11_Sub1.aClass13_2641 != null) {
			Class30.anInt745 = 0;
			Class32.anInt802 = 0;
		}
		if (arg0.isPopupTrigger())
			arg0.consume();
	}

	public synchronized void mousePressed(MouseEvent arg0) {
		anInt349++;
		if (Class12_Sub12_Sub11_Sub1.aClass13_2641 != null) {
			Class30.anInt745 = 0;
			Class33.anInt821 = arg0.getX();
			Class12_Sub1.anInt1616 = arg0.getY();
			Class12_Sub12_Sub1.aLong2056 = System.currentTimeMillis();
			if (!arg0.isMetaDown()) {
				Class41.anInt971 = 1;
				Class32.anInt802 = 1;
			} else {
				Class41.anInt971 = 2;
				Class32.anInt802 = 2;
			}
		}
		if (arg0.isPopupTrigger())
			arg0.consume();
	}

	public static Class12_Sub12_Sub7_Sub1[] method564(int arg0) {
		try {
			anInt350++;
			Class12_Sub12_Sub7_Sub1[] class12_sub12_sub7_sub1s = new Class12_Sub12_Sub7_Sub1[Class12_Sub12.anInt1838];
			if (arg0 < 7)
				anInt353 = -23;
			for (int i = 0; (i ^ 0xffffffff) > (Class12_Sub12.anInt1838 ^ 0xffffffff); i++) {
				Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = (class12_sub12_sub7_sub1s[i] = new Class12_Sub12_Sub7_Sub1());
				class12_sub12_sub7_sub1.anInt2577 = Class12_Sub2.anInt1654;
				class12_sub12_sub7_sub1.anInt2575 = Class1.anInt81;
				class12_sub12_sub7_sub1.anInt2580 = Class57.anIntArray1337[i];
				class12_sub12_sub7_sub1.anInt2576 = Class32.anIntArray778[i];
				class12_sub12_sub7_sub1.anInt2581 = Class55.anIntArray1313[i];
				class12_sub12_sub7_sub1.anInt2579 = Class44.anIntArray1027[i];
				byte[] is = Class28.aByteArrayArray669[i];
				int i_0_ = (class12_sub12_sub7_sub1.anInt2579 * class12_sub12_sub7_sub1.anInt2581);
				class12_sub12_sub7_sub1.anIntArray2578 = new int[i_0_];
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
					class12_sub12_sub7_sub1.anIntArray2578[i_1_] = (Class15.anIntArray385[Class12_Sub12_Sub12
							.method519(255, is[i_1_])]);
			}
			Class1.method46((byte) 108);
			return class12_sub12_sub7_sub1s;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ea.C(" + arg0 + ')');
		}
	}

	public void mouseClicked(MouseEvent arg0) {
		try {
			if (arg0.isPopupTrigger())
				arg0.consume();
			anInt336++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("ea.mouseClicked("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method565(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {
		if (arg4 == 25359) {
			anInt341++;
			if ((arg1 ^ 0xffffffff) <= -2 && arg7 >= 1 && arg1 <= 102
					&& (arg7 ^ 0xffffffff) >= -103) {
				if (!Class21.aBoolean483
						|| (RSString.anInt1504 ^ 0xffffffff) == (arg3 ^ 0xffffffff)) {
					int i = 0;
					if (arg6 == 0)
						i = Class12_Sub12_Sub8.aClass52_2295.method842(arg3,
								arg1, arg7);
					if ((arg6 ^ 0xffffffff) == -2)
						i = Class12_Sub12_Sub8.aClass52_2295.method825(arg3,
								arg1, arg7);
					int i_2_ = -1;
					if (arg6 == 2)
						i = Class12_Sub12_Sub8.aClass52_2295.method871(arg3,
								arg1, arg7);
					if ((arg6 ^ 0xffffffff) == -4)
						i = Class12_Sub12_Sub8.aClass52_2295.method864(arg3,
								arg1, arg7);
					boolean bool = false;
					boolean bool_3_ = false;
					if (i != 0) {
						i_2_ = 0x7fff & i >> -2003133810;
						int i_4_ = Class12_Sub12_Sub8.aClass52_2295.method844(
								arg3, arg1, arg7, i);
						int i_5_ = i_4_ & 0x1f;
						int i_6_ = 0x3 & i_4_ >> -1065120954;
						if (arg6 == 0) {
							Class12_Sub12_Sub8.aClass52_2295.method843(arg3,
									arg1, arg7);
							Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
									.method39(6, i_2_);
							if (class12_sub12_sub9.aBoolean2317)
								Class11.aClass10Array280[arg3].method122(
										class12_sub12_sub9.aBoolean2321, arg1,
										i_6_, -157, i_5_, arg7);
						}
						if ((arg6 ^ 0xffffffff) == -2)
							Class12_Sub12_Sub8.aClass52_2295.method832(arg3,
									arg1, arg7);
						if (arg6 == 2) {
							Class12_Sub12_Sub8.aClass52_2295.method850(arg3,
									arg1, arg7);
							Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
									.method39(arg4 ^ 0x6309, i_2_);
							if ((arg1 + class12_sub12_sub9.anInt2318 ^ 0xffffffff) < -104
									|| (arg7 + class12_sub12_sub9.anInt2318 ^ 0xffffffff) < -104
									|| (class12_sub12_sub9.anInt2334 + arg1 ^ 0xffffffff) < -104
									|| (arg7 - -class12_sub12_sub9.anInt2334 ^ 0xffffffff) < -104)
								return;
							if (class12_sub12_sub9.aBoolean2317)
								Class11.aClass10Array280[arg3].method117(i_6_,
										-19742, class12_sub12_sub9.anInt2334,
										arg1, arg7,
										class12_sub12_sub9.aBoolean2321,
										class12_sub12_sub9.anInt2318);
						}
						if ((arg6 ^ 0xffffffff) == -4) {
							Class12_Sub12_Sub8.aClass52_2295.method847(arg3,
									arg1, arg7);
							Class12_Sub12_Sub9 class12_sub12_sub9 = RSCanvas
									.method39(6, i_2_);
							if (class12_sub12_sub9.aBoolean2317
									&& ((class12_sub12_sub9.anInt2320 ^ 0xffffffff) == -2))
								Class11.aClass10Array280[arg3].method115(
										(byte) 101, arg1, arg7);
						}
					}
					if ((arg0 ^ 0xffffffff) <= -1) {
						int i_7_ = arg3;
						if ((i_7_ ^ 0xffffffff) > -4
								&& (0x2 & (Class12_Sub12_Sub11_Sub1.aByteArrayArrayArray2658[1][arg1][arg7])) == 2)
							i_7_++;
						Class12_Sub12_Sub13.method535(arg7, arg3, i_7_,
								Class11.aClass10Array280[arg3], arg0, arg1,
								arg5, arg4 ^ 0x630e,
								Class12_Sub12_Sub8.aClass52_2295, arg2);
					}
				}
			}
		}
	}

	static {
		aClass27_335 = new Class27(64);
		anInt351 = 0;
		anIntArray356 = new int[2000];
		aClass59_355 = Class55.method898("Prepared sound engine", -10983);
		aClass59_357 = aClass59_355;
	}
}
