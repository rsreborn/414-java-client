package com.jagex;/* com.jagex.Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class21 {
	public int anInt481;
	public int anInt482;
	public static boolean aBoolean483;
	public static int anInt484;
	public static RSString aClass59_485;
	public static int anInt486;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_487;
	public static Class62 aClass62_488;
	public int anInt489;
	public static RSString aClass59_490 = Class55
			.method898("Add friend", -10983);
	public int anInt491;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_492;
	public static int anInt493;
	public int anInt494;
	public static Class12_Sub12_Sub7_Sub2[] aClass12_Sub12_Sub7_Sub2Array495;
	public Class12_Sub12_Sub11 aClass12_Sub12_Sub11_496;
	public static RSString aClass59_497;

	public static void method607(int arg0) {
		try {
			aClass59_485 = null;
			if (arg0 != 19)
				aBoolean483 = true;
			aClass62_488 = null;
			aClass59_497 = null;
			aClass59_490 = null;
			aClass12_Sub12_Sub7_Sub2Array495 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ga.B(" + arg0 + ')');
		}
	}

	public static int method608(int arg0) {
		try {
			if (arg0 != 19)
				aClass12_Sub12_Sub7_Sub2Array495 = null;
			anInt493++;
			return 19;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ga.A(" + arg0 + ')');
		}
	}

	public static int method609(int arg0, int arg1) {
		try {
			return arg0 ^ arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "ga.D(" + arg0 + ','
					+ arg1 + ')');
		}
	}

	public static String method610(boolean arg0, Throwable arg1)
			throws IOException {
		try {
			String string;
			if (arg1 instanceof RuntimeException_Sub1) {
				RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) arg1;
				string = runtimeexception_sub1.aString1458 + " | ";
				arg1 = runtimeexception_sub1.aThrowable1453;
			} else
				string = "";
			StringWriter stringwriter = new StringWriter();
			PrintWriter printwriter = new PrintWriter(stringwriter);
			arg1.printStackTrace(printwriter);
			printwriter.close();
			String string_0_ = stringwriter.toString();
			anInt484++;
			BufferedReader bufferedreader = new BufferedReader(
					new StringReader(string_0_));
			String string_1_ = bufferedreader.readLine();
			if (arg0 != false)
				method607(1);
			for (;;) {
				String string_2_ = bufferedreader.readLine();
				if (string_2_ == null)
					break;
				int i = string_2_.indexOf('(');
				int i_3_ = string_2_.indexOf(')', i - -1);
				if ((i ^ 0xffffffff) <= -1 && i_3_ >= 0) {
					String string_4_ = string_2_.substring(1 + i, i_3_);
					int i_5_ = string_4_.indexOf(".java:");
					if (i_5_ >= 0) {
						string_4_ = (string_4_.substring(0, i_5_) + string_4_
								.substring(5 + i_5_));
						string += string_4_ + ' ';
						continue;
					}
					string_2_ = string_2_.substring(0, i);
				}
				string_2_ = string_2_.trim();
				string_2_ = string_2_.substring(1 + string_2_.lastIndexOf(' '));
				string_2_ = string_2_
						.substring(1 + string_2_.lastIndexOf('\t'));
				string += string_2_ + ' ';
			}
			string += "| " + (String) string_1_;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		aClass59_485 = aClass59_490;
		aBoolean483 = false;
		aClass59_497 = Class55.method898("q8_full", -10983);
	}
}
