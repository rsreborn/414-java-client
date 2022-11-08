package com.jagex;

import com.jagex.io.Buffer;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class RSCanvas extends Canvas {
	public static byte[][][] aByteArrayArrayArray43;
	public static RSString aClass59_44 = Class55.method898(" million", -10983);
	public static Class48 aClass48_45;
	public static int anInt46;
	public static int anInt47;
	public static RSString aClass59_48;
	public Component aComponent49;
	public static RSString aClass59_50;
	public static RSString aClass59_51;
	public static int anInt52;
	public static RSString aClass59_53 = Class55.method898("backtop1", -10983);
	public static RSString aClass59_54;
	public static int anInt55;
	public static RSString aClass59_56;
	public static byte[][] aByteArrayArray57;
	public static int anInt58;
	public static int anInt59;
	public static int anInt60;
	public static RSString aClass59_61;
	public static RSString aClass59_62;
	public static int[] anIntArray63;
	public static int anInt64;
	public static int anInt65;

	public static void method37(int arg0) {
		try {
			if (arg0 != 1000)
				method37(4);
			anInt52++;
			Class64.aClass27_1444.method675(true);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "da.C(" + arg0 + ')');
		}
	}

	public static void method38(byte arg0) {
		aClass59_44 = null;
		aClass59_51 = null;
		aClass59_53 = null;
		aClass59_56 = null;
		aClass48_45 = null;
		aByteArrayArray57 = null;
		aClass59_50 = null;
		aClass59_61 = null;
		aClass59_62 = null;
		aByteArrayArrayArray43 = null;
		anIntArray63 = null;
		aClass59_54 = null;
		aClass59_48 = null;
		if (arg0 > -42)
			method37(-6);
	}

	public void paint(Graphics arg0) {
		try {
			anInt58++;
			aComponent49.paint(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "da.paint("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public static Class12_Sub12_Sub9 method39(int arg0, int arg1) {
		try {
			if (arg0 != 6)
				method37(-121);
			Class12_Sub12_Sub9 class12_sub12_sub9 = ((Class12_Sub12_Sub9) RSString.aClass27_1502
					.method673(arg0 + 106, (long) arg1));
			anInt55++;
			if (class12_sub12_sub9 != null)
				return class12_sub12_sub9;
			byte[] is = Class64.aClass26_1450.method631(6, true, arg1);
			class12_sub12_sub9 = new Class12_Sub12_Sub9();
			class12_sub12_sub9.anInt2316 = arg1;
			if (is != null)
				class12_sub12_sub9
						.method415(new Buffer(is), (byte) -110);
			class12_sub12_sub9.method420(15);
			if (class12_sub12_sub9.aBoolean2348) {
				class12_sub12_sub9.aBoolean2317 = false;
				class12_sub12_sub9.aBoolean2321 = false;
			}
			RSString.aClass27_1502.method678((byte) 123, class12_sub12_sub9,
					(long) arg1);
			return class12_sub12_sub9;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "da.B(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public RSCanvas(Component arg0) {
		try {
			aComponent49 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "da.<init>("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public void update(Graphics arg0) {
		try {
			anInt47++;
			aComponent49.update(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "da.update("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass59_48 = Class55.method898("Cancel", -10983);
		aClass59_54 = aClass59_48;
		aClass59_51 = aClass59_44;
		aClass59_50 = Class55.method898("Create a free account", -10983);
		aByteArrayArray57 = new byte[1000][];
		anInt46 = 0;
		aClass59_56 = aClass59_50;
		aClass48_45 = new Class48(4096);
		aClass59_61 = Class55.method898("Chat panel redrawn", -10983);
		anInt64 = 0;
		anIntArray63 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2,
				2, 2, 2, 2, 2, 2, 2, 3 };
		anInt59 = 0;
		aClass59_62 = Class55.method898(" )2> @lre@", -10983);
		anInt65 = 1;
	}
}
