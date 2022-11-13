package com.jagex;/* com.jagex.Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.io.Buffer;

public class Class6 {
	public int[] anIntArray163;
	public int[] anIntArray164;
	public int anInt165;
	public int anInt166;
	public int anInt167 = 2;
	public int anInt168;
	public int anInt169;
	public int anInt170;
	public int anInt171;
	public int anInt172;
	public int anInt173;

	public int method78(int arg0) {
		if (anInt173 >= anInt169) {
			anInt172 = anIntArray163[anInt170++] << 15;
			if (anInt170 >= anInt167)
				anInt170 = anInt167 - 1;
			anInt169 = (int) ((double) anIntArray164[anInt170] / 65536.0 * (double) arg0);
			if (anInt169 > anInt173)
				anInt171 = (((anIntArray163[anInt170] << 15) - anInt172) / (anInt169 - anInt173));
		}
		anInt172 += anInt171;
		anInt173++;
		return anInt172 - anInt171 >> 15;
	}

	public void method79() {
		anInt169 = 0;
		anInt170 = 0;
		anInt171 = 0;
		anInt172 = 0;
		anInt173 = 0;
	}

	public void method80(Buffer arg0) {
		anInt167 = arg0.readUByte();
		anIntArray164 = new int[anInt167];
		anIntArray163 = new int[anInt167];
		for (int i = 0; i < anInt167; i++) {
			anIntArray164[i] = arg0.readShort(-1);
			anIntArray163[i] = arg0.readShort(-1);
		}
	}

	public void method81(Buffer arg0) {
		anInt165 = arg0.readUByte();
		anInt168 = arg0.method207(-708753192);
		anInt166 = arg0.method207(-708753192);
		method80(arg0);
	}

	public Class6() {
		anIntArray164 = new int[2];
		anIntArray163 = new int[2];
		anIntArray164[0] = 0;
		anIntArray164[1] = 65535;
		anIntArray163[0] = 0;
		anIntArray163[1] = 65535;
	}
}
