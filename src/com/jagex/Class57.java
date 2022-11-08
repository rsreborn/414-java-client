package com.jagex;/* com.jagex.Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public class Class57 {
	public static RSString aClass59_1325;
	public static boolean aBoolean1326;
	public static Image anImage1327;
	public static RSString aClass59_1328;
	public static RSString aClass59_1329 = Class55.method898(
			"Loading fonts )2 ", -10983);
	public static Class12_Sub12_Sub7_Sub2 aClass12_Sub12_Sub7_Sub2_1330;
	public static RSApplet anApplet_Sub1_1331;
	public static int anInt1332;
	public static int[] anIntArray1333;
	public static int anInt1334;
	public static int anInt1335;
	public static RSString aClass59_1336;
	public static int[] anIntArray1337;
	public static boolean aBoolean1338;
	public static int anInt1339;
	public static int anInt1340;

	public static void method905(int arg0) {
		try {
			aClass12_Sub12_Sub7_Sub2_1330 = null;
			aClass59_1325 = null;
			aClass59_1328 = null;
			anIntArray1337 = null;
			aClass59_1336 = null;
			anIntArray1333 = null;
			aClass59_1329 = null;
			if (arg0 <= -125)
				anImage1327 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ua.A(" + arg0 + ')');
		}
	}

	public static synchronized byte[] method906(boolean arg0, int arg1) {
		try {
			anInt1332++;
			if (arg0 != true)
				aBoolean1338 = true;
			if ((arg1 ^ 0xffffffff) == -101
					&& (Class40.anInt953 ^ 0xffffffff) < -1) {
				byte[] is = RSCanvas.aByteArrayArray57[--Class40.anInt953];
				RSCanvas.aByteArrayArray57[Class40.anInt953] = null;
				return is;
			}
			if (arg1 == 5000 && Class12_Sub12_Sub11_Sub2.anInt2722 > 0) {
				byte[] is = (Class12_Sub12_Sub4.aByteArrayArray2214[--Class12_Sub12_Sub11_Sub2.anInt2722]);
				Class12_Sub12_Sub4.aByteArrayArray2214[Class12_Sub12_Sub11_Sub2.anInt2722] = null;
				return is;
			}
			if (arg1 == 30000 && Class12_Sub9.anInt1760 > 0) {
				byte[] is = Game.aByteArrayArray1572[--Class12_Sub9.anInt1760];
				Game.aByteArrayArray1572[Class12_Sub9.anInt1760] = null;
				return is;
			}
			return new byte[arg1];
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ua.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	static {
		aBoolean1326 = false;
		anInt1334 = 0;
		anApplet_Sub1_1331 = null;
		anIntArray1333 = new int[4000];
		anInt1335 = -1;
		aClass59_1336 = Class55.method898("Loading interfaces )2 ", -10983);
		aClass59_1325 = aClass59_1336;
		anInt1340 = 0;
		aClass59_1328 = aClass59_1329;
	}
}
