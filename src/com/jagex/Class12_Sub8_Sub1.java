package com.jagex;/* com.jagex.Class12_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12_Sub8_Sub1 extends Class12_Sub8 {
	public byte[] aByteArray2002;
	public int anInt2003;
	public int anInt2004;
	public int anInt2005;

	public Class12_Sub8_Sub1 method194(Class33 arg0) {
		aByteArray2002 = arg0.method710(aByteArray2002, (byte) -51);
		anInt2003 = arg0.method707(anInt2003, (byte) -13);
		if (anInt2005 == anInt2004)
			anInt2005 = anInt2004 = arg0.method714(anInt2005, 7);
		else {
			anInt2005 = arg0.method714(anInt2005, 7);
			anInt2004 = arg0.method714(anInt2004, 7);
			if (anInt2005 == anInt2004)
				anInt2005--;
		}
		return this;
	}

	public Class12_Sub8_Sub1(int arg0, byte[] arg1, int arg2, int arg3) {
		anInt2003 = arg0;
		aByteArray2002 = arg1;
		anInt2005 = arg2;
		anInt2004 = arg3;
	}
}
