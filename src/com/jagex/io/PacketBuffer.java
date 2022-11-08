package com.jagex.io;

import com.jagex.*;

public class PacketBuffer extends Buffer {
	public int bitPosition;
	public ISAACCipher isaacCipher;

	public PacketBuffer(int size) {
		super(size);
	}

	public void initBitAccess() {
		bitPosition = 8 * position;
	}

	public int getRemainingBits(int packetSize) {
		return packetSize * 8 - bitPosition;
	}

	public void finishBitAccess() {
		position = (bitPosition + 7) / 8;
	}

	public int readPacket() {
		return ((payload[position++] + -isaacCipher.nextInt()) & 0xff);
	}

	public void writePacket(int arg0) {
		payload[position++] = (byte) (isaacCipher.nextInt() + arg0);
	}

	public int readBits(int numBits) {
		int value = 0;
		int bytePosition = bitPosition >> 3;
		int i = -(bitPosition & 0x7) + 8;
		bitPosition += numBits;
		for (/**/; numBits > i; i = 8) {
			value += ((payload[bytePosition++] & Class12_Sub12_Sub8.anIntArray2283[i]) << -i
					+ numBits);
			numBits -= i;
		}
		if (numBits == i)
			value += (Class12_Sub12_Sub8.anIntArray2283[i] & payload[bytePosition]);
		else
			value += (payload[bytePosition] >> -numBits + i & Class12_Sub12_Sub8.anIntArray2283[numBits]);
		return value;
	}

	public void initIsaacCipher(int[] seed) {
		isaacCipher = new ISAACCipher(seed);
	}
}
