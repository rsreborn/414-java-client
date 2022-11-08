package com.jagex;/* com.jagex.Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class Class60 {
	public static Object method950(Applet arg0, byte arg1, String arg2)
			throws Throwable {
		try {
			if (arg1 > -18)
				return null;
			return JSObject.getWindow(arg0).eval(arg2);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
