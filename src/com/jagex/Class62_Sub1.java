package com.jagex;/* com.jagex.Class62_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class62_Sub1 extends Class62 {
	public Component aComponent1905;

	public void method953(Component arg0, int arg1, int arg2, boolean arg3) {
		anIntArray1379 = new int[arg1 * arg2 + 1];
		anInt1385 = arg2;
		anInt1373 = arg1;
		DataBufferInt databufferint = new DataBufferInt(anIntArray1379,
				anIntArray1379.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680,
				65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster(
				directcolormodel.createCompatibleSampleModel(anInt1373,
						anInt1385), databufferint, null));
		anImage1372 = new BufferedImage(directcolormodel, writableraster, arg3,
				new Hashtable());
		aComponent1905 = arg0;
		method960(-1);
	}

	public void method957(int arg0, int arg1, int arg2, Graphics arg3) {
		if (arg0 == -5917)
			arg3.drawImage(anImage1372, arg2, arg1, aComponent1905);
	}
}
