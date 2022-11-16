package com.jagex.util;

import com.jagex.*;
import com.jagex.cache.Archive;
import com.jagex.io.RSSocket;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Statics {
    public static Class12_Sub12_Sub7_Sub4 aClass12_Sub12_Sub7_Sub4_546;
    public static RSString aClass59_547;
    public static int anInt548;
    public static RSString aClass59_549;
    public static RSString aClass59_550;
    public static RSString aClass59_551 = Class55.method898(
            "To play on this world move to a free area first", -10983);
    public static int anInt552;
    public static RSString aClass59_553;
    public static RSString aClass59_554;
    public static RSString aClass59_555 = Class55.method898(")3", -10983);
    public static RSString aClass59_556;
    public static RSString aClass59_557;
    public static int anInt558;
    public static RSString aClass59_559;
    public static int anInt561;
    public static RSString aClass59_562;
    public static RSString aClass59_564;
    public static RSString aClass59_565;
    public static int anInt566;
    public static int anInt567;
    public static int[][][] anIntArrayArrayArray569;
    public static int anInt570;
    public static int anInt571;
    public static RSString aClass59_572;
    public static int[] anIntArray573;
    public static RSString aClass59_574;
    public static int anInt575;
    public static int anInt576;
    public static int anInt2009;
    public static int anInt2013;
    public static int anInt2015;
    public static Class8 aClass8_2017 = new Class8();
    public static RSString aClass59_2018 = Class55.method898("@or2@", -10983);
    public static int anInt2019;
    public static RSString aClass59_2020 = Class55.method898(
            "Enter name of player to delete from list", -10983);
    public static RSString aClass59_2027 = aClass59_2020;
    public static int anInt2021;
    public static boolean[] aBooleanArray2022;
    public static int anInt2023;
    public static boolean aBoolean2025;
    public static int[] anIntArray2026;
    public static int anInt2028;
    public static int anInt1773;
    public static int anInt1774;
    public static int anInt1775;
    public static int anInt1776;
    public static int anInt1777;
    public static int anInt1779;
    public static int anInt1780;
    public static int anInt1781;
    public static int anInt1784;
    public static Class27 aClass27_1785;
    public static int anInt1786;
    public static int anInt1788;
    public static int anInt1789;
    public static int anInt1791;
    public static int anInt1792;
    public static int anInt1793;
    public static int anInt1794;
    public static int anInt1796;
    public static int anInt1797;
    public static int anInt1798;
    public static int anInt1799;
    public static int anInt1800;
    public static int anInt1801;
    public static int anInt1802;
    public static int anInt1804;
    public static int anInt1805;
    public static RSString aClass59_1806 = Class55.method898("(U3", -10983);
    public static int anInt1808;
    public static int anInt1810;
    public static int anInt1811;
    public static int anInt1812;
    public static int anInt1813;
    public static int anInt1814;
    public static int anInt1815;
    public static int anInt1816;
    public static int anInt1817;
    public static int anInt1818;
    public static int anInt1821;
    public static int anInt1823;
    public static int anInt1824;
    public static int anInt1826;
    public static int anInt1827;
    public static RSString aClass59_1828;
    public static RSString aClass59_1829;
    public static Class26 aClass26_1830;
    public static int anInt1831;
    public static int anInt1832;
    public static int[] anIntArray1833;
    public static int anInt1834;
    public static RSString aClass59_1835;
    public static int anInt1836;
    public static RSString aClass59_1837;

    static {
        aClass59_549 = Class55.method898("backvmid1", -10983);
        aClass59_557 = Class55.method898("Attack", -10983);
        anInt567 = 0;
        aClass59_554 = Class55.method898("Loading ignore list", -10983);
        aClass59_556 = aClass59_551;
        aClass59_559 = Class55.method898("Trade)4compete", -10983);
        aClass59_565 = null;
        anInt552 = 0;
        aClass59_564 = aClass59_559;
        anIntArrayArrayArray569 = new int[4][105][105];
        aClass59_572 = Class55.method898("M", -10983);
        aClass59_562 = aClass59_572;
        aClass59_574 = aClass59_554;
        aClass59_547 = (Class55.method898(
                "No matching objects found)1 please shorten search", -10983));
        aClass59_553 = aClass59_547;
        aClass59_550 = aClass59_557;
        anInt576 = 0;
        aBooleanArray2022 = new boolean[5];
        aBoolean2025 = false;
        anInt2028 = -1;
        aClass27_1785 = new Class27(50);
        aClass59_1828 = Class55.method898("To", -10983);
        anInt1834 = 0;
        anIntArray1833 = new int[1000];
        aClass59_1835 = Class55.method898("The server is being updated)3",
                -10983);
        aClass59_1837 = aClass59_1828;
        aClass59_1829 = aClass59_1835;
    }

    public static void method624(byte arg0) {
        try {
            anIntArrayArrayArray569 = null;
            aClass59_547 = null;
            aClass59_555 = null;
            aClass59_572 = null;
            aClass59_559 = null;
            aClass12_Sub12_Sub7_Sub4_546 = null;
            aClass59_562 = null;
            aClass59_551 = null;
            aClass59_556 = null;
            aClass59_564 = null;
            aClass59_554 = null;
            aClass59_574 = null;
            aClass59_549 = null;
            aClass59_553 = null;
            aClass59_565 = null;
            if (arg0 > -15)
                method626(-64);
            anIntArray573 = null;
            aClass59_550 = null;
            aClass59_557 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "hc.A(" + arg0 + ')');
        }
    }

    public static void method626(int arg0) {
        try {
            if (arg0 != -12937)
                anIntArrayArrayArray569 = null;
            for (int i = 0; i < Class47.anInt1094; i++) {
                int i_10_ = Class10.anIntArray220[i];
                Class12_Sub12_Sub11_Sub2_Sub1 class12_sub12_sub11_sub2_sub1 = Class7.aClass12_Sub12_Sub11_Sub2_Sub1Array1531[i_10_];
                int i_11_ = Game.inBuffer.readUByte();
                if ((0x8 & i_11_) != 0) {
                    int i_12_ = Game.inBuffer.readUByte();
                    int i_13_ = Game.inBuffer.readUByte();
                    class12_sub12_sub11_sub2_sub1.method448(
                            (Class64_Sub2.anInt1968), arg0 ^ ~0x3288, i_12_,
                            i_13_);
                    class12_sub12_sub11_sub2_sub1.anInt2676 = 300 + Class64_Sub2.anInt1968;
                    class12_sub12_sub11_sub2_sub1.anInt2711 = Game.inBuffer
                            .readUByte();
                    class12_sub12_sub11_sub2_sub1.anInt2698 = Game.inBuffer
                            .getByteS(-762);
                }
                if ((i_11_ & 0x40) != 0) {
                    int i_14_ = Game.inBuffer
                            .method236(-12543);
                    int i_15_ = Game.inBuffer.readUByte();
                    if (i_14_ == 65535)
                        i_14_ = -1;
                    if ((i_14_ != class12_sub12_sub11_sub2_sub1.anInt2734)
                            || i_14_ == -1) {
                        if (i_14_ == -1
                                || class12_sub12_sub11_sub2_sub1.anInt2734 == -1
                                || ((Class5
                                .method74(
                                        9,
                                        class12_sub12_sub11_sub2_sub1.anInt2734).anInt2194) <= Class5.method74(9, i_14_).anInt2194)) {
                            class12_sub12_sub11_sub2_sub1.anInt2687 = 0;
                            class12_sub12_sub11_sub2_sub1.anInt2719 = i_15_;
                            class12_sub12_sub11_sub2_sub1.anInt2675 = 0;
                            class12_sub12_sub11_sub2_sub1.anInt2726 = 0;
                            class12_sub12_sub11_sub2_sub1.anInt2734 = i_14_;
                            class12_sub12_sub11_sub2_sub1.anInt2714 = class12_sub12_sub11_sub2_sub1.anInt2665;
                        }
                    } else {
                        int i_16_ = Class5.method74(arg0 ^ ~0x3281, i_14_).anInt2213;
                        if (i_16_ == 1) {
                            class12_sub12_sub11_sub2_sub1.anInt2719 = i_15_;
                            class12_sub12_sub11_sub2_sub1.anInt2726 = 0;
                            class12_sub12_sub11_sub2_sub1.anInt2675 = 0;
                            class12_sub12_sub11_sub2_sub1.anInt2687 = 0;
                        }
                        if (i_16_ == 2)
                            class12_sub12_sub11_sub2_sub1.anInt2675 = 0;
                    }
                }
                if ((0x4 & i_11_) != 0) {
                    class12_sub12_sub11_sub2_sub1.anInt2694 = Game.inBuffer
                            .readUShortLE();
                    if (class12_sub12_sub11_sub2_sub1.anInt2694 == 65535)
                        class12_sub12_sub11_sub2_sub1.anInt2694 = -1;
                }
                if ((0x10 & i_11_) != 0) {
                    class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923 = Class31
                            .method701((byte) -75,
                                    Game.inBuffer
                                            .readUShortLEA());
                    class12_sub12_sub11_sub2_sub1.anInt2727 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2097);
                    class12_sub12_sub11_sub2_sub1.anInt2710 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2100);
                    class12_sub12_sub11_sub2_sub1.anInt2662 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2058);
                    class12_sub12_sub11_sub2_sub1.anInt2706 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2092);
                    class12_sub12_sub11_sub2_sub1.anInt2700 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2080);
                    class12_sub12_sub11_sub2_sub1.anInt2681 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2077);
                    class12_sub12_sub11_sub2_sub1.anInt2669 = (class12_sub12_sub11_sub2_sub1.aClass12_Sub12_Sub2_2923.anInt2068);
                }
                if ((0x80 & i_11_) != 0) {
                    class12_sub12_sub11_sub2_sub1.aClass59_2678 = Game.inBuffer
                            .method246(arg0 + 33293);
                    class12_sub12_sub11_sub2_sub1.anInt2701 = 100;
                }
                if ((0x1 & i_11_) != 0) {
                    int i_17_ = Game.inBuffer.readUByte();
                    int i_18_ = Game.inBuffer.readUByte();
                    class12_sub12_sub11_sub2_sub1.method448(
                            Class64_Sub2.anInt1968, 0, i_17_, i_18_);
                    class12_sub12_sub11_sub2_sub1.anInt2676 = 300 + Class64_Sub2.anInt1968;
                    class12_sub12_sub11_sub2_sub1.anInt2711 = Game.inBuffer
                            .method238(true);
                    class12_sub12_sub11_sub2_sub1.anInt2698 = Game.inBuffer
                            .getByteS(-762);
                }
                if ((i_11_ & 0x2) != 0) {
                    class12_sub12_sub11_sub2_sub1.anInt2692 = Game.inBuffer
                            .readUShortLE();
                    int i_19_ = Game.inBuffer
                            .method210((byte) -6);
                    class12_sub12_sub11_sub2_sub1.anInt2713 = i_19_ >> 16;
                    class12_sub12_sub11_sub2_sub1.anInt2668 = Class64_Sub2.anInt1968
                            - -(i_19_ & 0xffff);
                    class12_sub12_sub11_sub2_sub1.anInt2673 = 0;
                    if (class12_sub12_sub11_sub2_sub1.anInt2692 == 65535)
                        class12_sub12_sub11_sub2_sub1.anInt2692 = -1;
                    class12_sub12_sub11_sub2_sub1.anInt2724 = 0;
                    if (Class64_Sub2.anInt1968 < class12_sub12_sub11_sub2_sub1.anInt2668)
                        class12_sub12_sub11_sub2_sub1.anInt2673 = -1;
                }
                if ((0x20 & i_11_) != 0) {
                    class12_sub12_sub11_sub2_sub1.anInt2690 = Game.inBuffer
                            .method236(arg0 + 394);
                    class12_sub12_sub11_sub2_sub1.anInt2672 = Game.inBuffer
                            .readShort(arg0 ^ 0x3288);
                }
            }
            anInt575++;
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "hc.C(" + arg0 + ')');
        }
    }

    public static void method627(int arg0) {
        try {
            Class12_Sub12_Sub8.aClass27_2302.method675(true);
            if (arg0 != 26551)
                aClass59_549 = null;
            Class64.aClass27_1449.method675(true);
            anInt571++;
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "hc.B(" + arg0 + ')');
        }
    }

    public static void method628(int arg0) {
        try {
            if (arg0 <= -23) {
                try {
                    Graphics graphics = Class12_Sub12_Sub5.aCanvas2243
                            .getGraphics();
                    Archive.aClass62_1879.method957(-5917, 357, 17,
                            graphics);
                } catch (Exception exception) {
                    Class12_Sub12_Sub5.aCanvas2243.repaint();
                }
                anInt561++;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "hc.G(" + arg0 + ')');
        }
    }

    public static void method258(int arg0) {
        try {
            aClass8_2017 = null;
            if (arg0 != 0)
                aBooleanArray2022 = null;
            aBooleanArray2022 = null;
            anIntArray2026 = null;
            aClass59_2018 = null;
            aClass59_2020 = null;
            aClass59_2027 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "pa.OB(" + arg0 + ')');
        }
    }

    public static Class12_Sub12_Sub7_Sub2[] method263(Class26 arg0,
                                                      RSString arg1, RSString arg2, int arg3) {
        try {
            anInt2015++;
            int i = arg0.hashFileName(arg1, -22814);
            int i_0_ = arg0.method655(i, (byte) 57, arg2);
            if (arg3 != -29072)
                anInt2019 = 101;
            return Class58.method911(i, 8, i_0_, arg0);
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, ("pa.QB("
                    + (arg0 != null ? "{...}" : "null") + ','
                    + (arg1 != null ? "{...}" : "null") + ','
                    + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
        }
    }

    public static void method264(byte arg0, Class12_Sub12_Sub11_Sub2 arg1) {
        arg1.aBoolean2723 = false;
        if (arg0 != -106)
            anIntArray2026 = null;
        anInt2009++;
        if ((arg1.anInt2718 ^ 0xffffffff) != 0) {
            Class12_Sub12_Sub4 class12_sub12_sub4 = Class5.method74(9,
                    arg1.anInt2718);
            arg1.anInt2717++;
            if (class12_sub12_sub4.anIntArray2207.length > arg1.anInt2674
                    && ((arg1.anInt2717 ^ 0xffffffff) < (class12_sub12_sub4.anIntArray2215[arg1.anInt2674] ^ 0xffffffff))) {
                arg1.anInt2717 = 1;
                arg1.anInt2674++;
            }
            if ((class12_sub12_sub4.anIntArray2207.length ^ 0xffffffff) >= (arg1.anInt2674 ^ 0xffffffff)) {
                arg1.anInt2674 = 0;
                arg1.anInt2717 = 0;
            }
        }
        if (arg1.anInt2692 != -1 && Class64_Sub2.anInt1968 >= arg1.anInt2668) {
            if ((arg1.anInt2673 ^ 0xffffffff) > -1)
                arg1.anInt2673 = 0;
            int i = Class30.method695(arg1.anInt2692, -116).anInt2449;
            if ((i ^ 0xffffffff) == 0)
                arg1.anInt2692 = -1;
            else {
                Class12_Sub12_Sub4 class12_sub12_sub4 = Class5.method74(9, i);
                arg1.anInt2724++;
                if (((class12_sub12_sub4.anIntArray2207.length ^ 0xffffffff) < (arg1.anInt2673 ^ 0xffffffff))
                        && (class12_sub12_sub4.anIntArray2215[arg1.anInt2673] ^ 0xffffffff) > (arg1.anInt2724 ^ 0xffffffff)) {
                    arg1.anInt2724 = 1;
                    arg1.anInt2673++;
                }
                if (((class12_sub12_sub4.anIntArray2207.length ^ 0xffffffff) >= (arg1.anInt2673 ^ 0xffffffff))
                        && (arg1.anInt2673 < 0 || ((arg1.anInt2673 ^ 0xffffffff) <= (class12_sub12_sub4.anIntArray2207.length ^ 0xffffffff))))
                    arg1.anInt2692 = -1;
            }
        }
        if ((arg1.anInt2734 ^ 0xffffffff) != 0 && arg1.anInt2719 <= 1) {
            Class12_Sub12_Sub4 class12_sub12_sub4 = Class5.method74(arg0 + 115,
                    arg1.anInt2734);
            if ((class12_sub12_sub4.anInt2188 ^ 0xffffffff) == -2
                    && arg1.anInt2714 > 0
                    && (arg1.anInt2667 ^ 0xffffffff) >= (Class64_Sub2.anInt1968 ^ 0xffffffff)
                    && Class64_Sub2.anInt1968 > arg1.anInt2721) {
                arg1.anInt2719 = 1;
                return;
            }
        }
        if (arg1.anInt2734 != -1 && (arg1.anInt2719 ^ 0xffffffff) == -1) {
            Class12_Sub12_Sub4 class12_sub12_sub4 = Class5.method74(9,
                    arg1.anInt2734);
            arg1.anInt2687++;
            if (class12_sub12_sub4.anIntArray2207.length > arg1.anInt2726
                    && (class12_sub12_sub4.anIntArray2215[arg1.anInt2726] < arg1.anInt2687)) {
                arg1.anInt2687 = 1;
                arg1.anInt2726++;
            }
            if (arg1.anInt2726 >= class12_sub12_sub4.anIntArray2207.length) {
                arg1.anInt2675++;
                arg1.anInt2726 -= class12_sub12_sub4.anInt2200;
                if ((class12_sub12_sub4.anInt2201 ^ 0xffffffff) >= (arg1.anInt2675 ^ 0xffffffff))
                    arg1.anInt2734 = -1;
                if (arg1.anInt2726 < 0
                        || ((class12_sub12_sub4.anIntArray2207.length ^ 0xffffffff) >= (arg1.anInt2726 ^ 0xffffffff)))
                    arg1.anInt2734 = -1;
            }
            arg1.aBoolean2723 = class12_sub12_sub4.aBoolean2229;
        }
        if (arg1.anInt2719 > 0)
            arg1.anInt2719--;
    }

    public static void method265(boolean arg0) {
        try {
            RSString.anInt1479++;
            Class12_Sub12_Sub14.method537(6, arg0);
            Class27.method671(true, -37);
            Class12_Sub12_Sub14.method537(6, false);
            anInt2023++;
            Class27.method671(false, -127);
            Class51.method811(-4653);
            Class8.method93(-3934);
            if (!Class57.aBoolean1326) {
                int i = Class11.anInt294 + Class48.anInt1127 & 0x7ff;
                int i_1_ = Class12_Sub12_Sub13.anInt2441;
                if (Class10.anInt248 / 256 > i_1_)
                    i_1_ = Class10.anInt248 / 256;
                if (aBooleanArray2022[4]
                        && (i_1_ ^ 0xffffffff) > (Class1.anIntArray74[4] + 128 ^ 0xffffffff))
                    i_1_ = 128 + Class1.anIntArray74[4];
                Class26.method641(
                        i,
                        Class15.anInt401,
                        Class21.anInt486,
                        i_1_,
                        -89,
                        i_1_ * 3 + 600,
                        Class26.method658(
                                (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2691),
                                -6,
                                RSString.anInt1504,
                                (Class12_Sub7.aClass12_Sub12_Sub11_Sub2_Sub2_1713.anInt2683))
                                + -50);
            }
            int i;
            if (!Class57.aBoolean1326)
                i = Class11.method136(true);
            else
                i = Class12_Sub4.method160(0);
            int i_2_ = Class57.anInt1339;
            int i_3_ = Class10.anInt250;
            int i_4_ = Class20.anInt464;
            int i_5_ = anInt2021;
            int i_6_ = Class27.anInt645;
            for (int i_7_ = 0; i_7_ < 5; i_7_++) {
                if (aBooleanArray2022[i_7_]) {
                    int i_8_ = (int) (((double) (1 + Class35.anIntArray836[i_7_] * 2) * Math
                            .random()) - (double) Class35.anIntArray836[i_7_] + (Math
                            .sin((double) (Class42.anIntArray994[i_7_])
                                    * ((double) (Class12_Sub12_Sub8.anIntArray2297[i_7_]) / 100.0)) * (double) Class1.anIntArray74[i_7_]));
                    if (i_7_ == 1)
                        Class57.anInt1339 += i_8_;
                    if (i_7_ == 2)
                        Class20.anInt464 += i_8_;
                    if (i_7_ == 0)
                        Class10.anInt250 += i_8_;
                    if (i_7_ == 4) {
                        anInt2021 += i_8_;
                        if (anInt2021 < 128)
                            anInt2021 = 128;
                        if ((anInt2021 ^ 0xffffffff) < -384)
                            anInt2021 = 383;
                    }
                    if (i_7_ == 3)
                        Class27.anInt645 = i_8_ + Class27.anInt645 & 0x7ff;
                }
            }
            Class12_Sub6.method189(53);
            Class12_Sub12_Sub11_Sub4.aBoolean2832 = true;
            Class12_Sub12_Sub11_Sub4.anInt2818 = 0;
            Class12_Sub12_Sub11_Sub4.anInt2835 = Class12_Sub12_Sub3.anInt2176
                    + -4;
            Class12_Sub12_Sub11_Sub4.anInt2839 = -4 + Class18.anInt432;
            Class12_Sub12_Sub7.method341();
            Class12_Sub12_Sub8.aClass52_2295.method834(Class10.anInt250,
                    Class57.anInt1339, Class20.anInt464, anInt2021,
                    Class27.anInt645, i);
            Class12_Sub12_Sub8.aClass52_2295.method848();
            Class12_Sub12_Sub11_Sub1.method440((byte) -97);
            Class44.method780((byte) -39);
            ((Class7) Class12_Sub12_Sub7_Sub3.anInterface3_2607).method82(17,
                    Class12_Sub12_Sub11_Sub6.anInt2903);
            Class12_Sub12_Sub9.method419(-30911);
            if (Class12_Sub12_Sub9.aBoolean2356
                    && (Class64.method974(false, true, true) ^ 0xffffffff) == -1)
                Class12_Sub12_Sub9.aBoolean2356 = false;
            if (Class12_Sub12_Sub9.aBoolean2356) {
                Class12_Sub6.method189(83);
                Class12_Sub12_Sub7.method341();
                Class36.method729(false, null, 1932, Class64_Sub2.aClass59_1970);
            }
            Class12_Sub12_Sub12.method518(4);
            Class10.anInt250 = i_3_;
            Class57.anInt1339 = i_2_;
            Class20.anInt464 = i_4_;
            anInt2021 = i_5_;
            Class27.anInt645 = i_6_;
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "pa.NB(" + arg0 + ')');
        }
    }

    public static int method202(int arg0, byte arg1, int arg2) {
        try {
            anInt1816++;
            if (arg1 != 106)
                return 18;
            int i = arg2 * 57 + arg0;
            i = i << 2069680269 ^ i;
            int i_0_ = 0x7fffffff & i * (15731 * (i * i) + 789221) + 1376312589;
            return 0xff & i_0_ >> -57205101;
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, ("tc.Q(" + arg0 + ','
                    + arg1 + ',' + arg2 + ')'));
        }
    }

    public static int method203(byte arg0, KeyEvent arg1) {
        try {
            anInt1781++;
            int i = arg1.getKeyChar();
            if (arg0 < 10)
                method248(-3);
            if (i <= 0 || (i ^ 0xffffffff) <= -257)
                i = -1;
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, ("tc.BB(" + arg0 + ','
                    + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method218(long arg0, boolean arg1) {
        try {
            anInt1789++;
            if (arg1 == true && arg0 > 0L) {
                if (arg0 % 10L != 0L)
                    Class12_Sub12_Sub6.method337(arg0, -22614);
                else {
                    Class12_Sub12_Sub6.method337(arg0 - 1L, -22614);
                    Class12_Sub12_Sub6.method337(1L, -22614);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "tc.M(" + arg0 + ','
                    + arg1 + ')');
        }
    }

    public static void method229(byte arg0) {
        try {
            aClass59_1828 = null;
            aClass27_1785 = null;
            aClass26_1830 = null;
            aClass59_1835 = null;
            aClass59_1837 = null;
            aClass59_1829 = null;
            anIntArray1833 = null;
            aClass59_1806 = null;
            int i = -36 / ((16 - arg0) / 36);
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "tc.UA(" + arg0 + ')');
        }
    }

    public static void method244(Class26 arg0, Component arg1, byte arg2) {
        try {
            anInt1797++;
            if (!Class62.aBoolean1387) {
                Class12_Sub12_Sub11.aClass12_Sub12_Sub7_Sub2_2387 = Class12_Sub1
                        .method145(arg0, RSString.aClass59_1524, (byte) 121,
                                Class12_Sub1.aClass59_1620);
                RuntimeException_Sub1.aClass12_Sub12_Sub7_Sub2_1461 = Class12_Sub1
                        .method145(arg0, Class12_Sub12_Sub9.aClass59_2358,
                                (byte) 117, Class12_Sub1.aClass59_1620);
                Class61.aClass12_Sub12_Sub7_Sub2_1365 = Class12_Sub1.method145(
                        arg0, Class47.aClass59_1113, (byte) 117,
                        Class12_Sub1.aClass59_1620);
                Class28.aClass12_Sub12_Sub7_Sub2_680 = Class12_Sub1.method145(
                        arg0, Class39.aClass59_942, (byte) -24,
                        Class12_Sub1.aClass59_1620);
                Class33.aClass12_Sub12_Sub7_Sub2_820 = Class12_Sub1.method145(
                        arg0, Class47.aClass59_1108, (byte) 121,
                        Class12_Sub1.aClass59_1620);
                Class38.aClass12_Sub12_Sub7_Sub2_925 = Class12_Sub1.method145(
                        arg0, Class27.aClass59_658, (byte) -28,
                        Class12_Sub1.aClass59_1620);
                Archive.aClass62_1879 = Class12_Sub12_Sub1.method276(arg1,
                        96, 479, false);
                RuntimeException_Sub1.aClass12_Sub12_Sub7_Sub2_1461.method370(
                        0, 0);
                Class44.aClass62_1042 = Class12_Sub12_Sub1.method276(arg1, 156,
                        172, false);
                Class12_Sub12_Sub7.method341();
                Class61.aClass12_Sub12_Sub7_Sub2_1365.method370(0, 0);
                Class12_Sub12_Sub11_Sub5.aClass62_2878 = Class12_Sub12_Sub1
                        .method276(arg1, 261, 190, false);
                Class12_Sub12_Sub11.aClass12_Sub12_Sub7_Sub2_2387.method370(0,
                        0);
                Class12_Sub12_Sub11_Sub6.aClass62_2894 = Class12_Sub12_Sub1
                        .method276(arg1, 334, 512, false);
                Class12_Sub12_Sub7.method341();
                if (arg2 != -23)
                    anInt1834 = -122;
                Class15.aClass62_386 = Class12_Sub12_Sub1.method276(arg1, 50,
                        496, false);
                Class14.aClass62_365 = Class12_Sub12_Sub1.method276(arg1, 37,
                        269, false);
                Class31.aClass62_761 = Class12_Sub12_Sub1.method276(arg1, 45,
                        249, false);
                Class12_Sub12_Sub7_Sub1 class12_sub12_sub7_sub1 = Class17
                        .method594(Class12_Sub1.aClass59_1620, arg2 + 23, arg0,
                                Class27.aClass59_660);
                Class7.aClass62_1528 = Class12_Sub12_Sub1.method276(arg1,
                        (class12_sub12_sub7_sub1.anInt2579),
                        (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, arg2 ^ ~0x16, arg0,
                        Class36.aClass59_875);
                Class12_Sub12_Sub12.aClass62_2418 = Class12_Sub12_Sub1
                        .method276(arg1, (class12_sub12_sub7_sub1.anInt2579),
                                (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, 0, arg0,
                        Class17.aClass59_411);
                Class64.aClass62_1443 = Class12_Sub12_Sub1.method276(arg1,
                        (class12_sub12_sub7_sub1.anInt2579),
                        (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, arg2 + 23, arg0,
                        Class51.aClass59_1191);
                Class12_Sub12_Sub15.aClass62_2491 = Class12_Sub12_Sub1
                        .method276(arg1, (class12_sub12_sub7_sub1.anInt2579),
                                (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, 0, arg0,
                        RSCanvas.aClass59_53);
                Class35.aClass62_864 = Class12_Sub12_Sub1.method276(arg1,
                        (class12_sub12_sub7_sub1.anInt2579),
                        (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, 0, arg0,
                        aClass59_549);
                Class21.aClass62_488 = Class12_Sub12_Sub1.method276(arg1,
                        (class12_sub12_sub7_sub1.anInt2579),
                        (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, 0, arg0,
                        Class14.aClass59_375);
                Class62.aClass62_1377 = Class12_Sub12_Sub1.method276(arg1,
                        (class12_sub12_sub7_sub1.anInt2579),
                        (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, 0, arg0,
                        Class4.aClass59_132);
                Class12_Sub6.aClass62_1694 = Class12_Sub12_Sub1.method276(arg1,
                        (class12_sub12_sub7_sub1.anInt2579),
                        (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                class12_sub12_sub7_sub1 = Class17.method594(
                        Class12_Sub1.aClass59_1620, 0, arg0,
                        (Class12_Sub12_Sub11_Sub3.aClass59_2735));
                Class31.aClass62_765 = Class12_Sub12_Sub1.method276(arg1,
                        (class12_sub12_sub7_sub1.anInt2579),
                        (class12_sub12_sub7_sub1.anInt2581), false);
                class12_sub12_sub7_sub1.method355(0, 0);
                Class44.aClass12_Sub12_Sub7_Sub2_1041 = Class12_Sub1.method145(
                        arg0, Class12_Sub12_Sub1.aClass59_2037, (byte) 21,
                        Class12_Sub1.aClass59_1620);
                Class12_Sub12_Sub9.aClass12_Sub12_Sub7_Sub2_2361 = Class12_Sub1
                        .method145(arg0, Class12_Sub12_Sub16.aClass59_2541,
                                (byte) 120, Class12_Sub1.aClass59_1620);
                Class1.aClass12_Sub12_Sub7_Sub2_80 = Class12_Sub1.method145(
                        arg0, Class12_Sub12_Sub15.aClass59_2527, (byte) 126,
                        Class12_Sub1.aClass59_1620);
                Class12_Sub12_Sub4.aClass12_Sub12_Sub7_Sub2_2216 = Class44.aClass12_Sub12_Sub7_Sub2_1041
                        .method366();
                Class12_Sub12_Sub4.aClass12_Sub12_Sub7_Sub2_2216.method368();
                Class12_Sub4.aClass12_Sub12_Sub7_Sub2_1666 = Class12_Sub12_Sub9.aClass12_Sub12_Sub7_Sub2_2361
                        .method366();
                Class12_Sub4.aClass12_Sub12_Sub7_Sub2_1666.method368();
                Class57.aClass12_Sub12_Sub7_Sub2_1330 = Class44.aClass12_Sub12_Sub7_Sub2_1041
                        .method366();
                Class57.aClass12_Sub12_Sub7_Sub2_1330.method367();
                Class61.aClass12_Sub12_Sub7_Sub2_1364 = Class12_Sub12_Sub9.aClass12_Sub12_Sub7_Sub2_2361
                        .method366();
                Class61.aClass12_Sub12_Sub7_Sub2_1364.method367();
                Class12_Sub12_Sub11_Sub3.aClass12_Sub12_Sub7_Sub2_2771 = Class1.aClass12_Sub12_Sub7_Sub2_80
                        .method366();
                Class12_Sub12_Sub11_Sub3.aClass12_Sub12_Sub7_Sub2_2771
                        .method367();
                Class4.aClass12_Sub12_Sub7_Sub2_124 = Class44.aClass12_Sub12_Sub7_Sub2_1041
                        .method366();
                Class4.aClass12_Sub12_Sub7_Sub2_124.method368();
                Class4.aClass12_Sub12_Sub7_Sub2_124.method367();
                Class9_Sub2.aClass12_Sub12_Sub7_Sub2_1590 = Class12_Sub12_Sub9.aClass12_Sub12_Sub7_Sub2_2361
                        .method366();
                Class9_Sub2.aClass12_Sub12_Sub7_Sub2_1590.method368();
                Class9_Sub2.aClass12_Sub12_Sub7_Sub2_1590.method367();
                Class12_Sub12_Sub16.aClass12_Sub12_Sub7_Sub2Array2545 = (method263(arg0,
                                Class12_Sub12_Sub11_Sub2_Sub1.aClass59_2926,
                                Class12_Sub1.aClass59_1620, -29072));
                Class49.anIntArray1144 = new int[151];
                Class42.anIntArray985 = new int[33];
                RSSocket.anIntArray524 = new int[151];
                Game.anIntArray1555 = new int[33];
                for (int i = 0; (i ^ 0xffffffff) > -34; i++) {
                    int i_12_ = 999;
                    int i_13_ = 0;
                    for (int i_14_ = 0; i_14_ < 34; i_14_++) {
                        if ((Class61.aClass12_Sub12_Sub7_Sub2_1365.aByteArray2588[(Class61.aClass12_Sub12_Sub7_Sub2_1365.anInt2589 * i)
                                + i_14_]) != 0) {
                            if ((i_12_ ^ 0xffffffff) != -1000) {
                                i_13_ = i_14_;
                                break;
                            }
                        } else if (i_12_ == 999)
                            i_12_ = i_14_;
                    }
                    Class42.anIntArray985[i] = i_12_;
                    Game.anIntArray1555[i] = i_13_ - i_12_;
                }
                for (int i = 5; (i ^ 0xffffffff) > -157; i++) {
                    int i_15_ = 999;
                    int i_16_ = 0;
                    for (int i_17_ = 25; (i_17_ ^ 0xffffffff) > -173; i_17_++) {
                        if (((Class61.aClass12_Sub12_Sub7_Sub2_1365.aByteArray2588[i_17_
                                + (Class61.aClass12_Sub12_Sub7_Sub2_1365.anInt2589)
                                * i]) ^ 0xffffffff) != -1
                                || i_17_ <= 34 && (i ^ 0xffffffff) >= -35) {
                            if (i_15_ != 999) {
                                i_16_ = i_17_;
                                break;
                            }
                        } else if (i_15_ == 999)
                            i_15_ = i_17_;
                    }
                    RSSocket.anIntArray524[i - 5] = i_15_ + -25;
                    Class49.anIntArray1144[-5 + i] = -i_15_ + i_16_;
                }
                Class62.aBoolean1387 = true;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, ("tc.C("
                    + (arg0 != null ? "{...}" : "null") + ','
                    + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
        }
    }

    public static void method248(int arg0) {
        try {
            if (arg0 >= -106)
                method229((byte) -128);
            anInt1792++;
            Archive.aClass62_1879.method960(-1);
            RuntimeException_Sub1.aClass12_Sub12_Sub7_Sub2_1461.method370(0, 0);
            anIntArray2026 = Class12_Sub12_Sub7_Sub3
                    .method376(anIntArray2026);
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, "tc.FA(" + arg0 + ')');
        }
    }

    public static RSString method251(byte arg0, RSString[] arg1) {
        try {
            if (arg0 >= -33)
                return null;
            anInt1836++;
            if ((arg1.length ^ 0xffffffff) > -3)
                throw new IllegalArgumentException();
            return Class12_Sub12_Sub6.method329(arg1, 0, 126, arg1.length);
        } catch (RuntimeException runtimeexception) {
            throw Class35.method724(runtimeexception, ("tc.B(" + arg0 + ','
                    + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }
}
