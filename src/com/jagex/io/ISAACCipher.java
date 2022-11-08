package com.jagex.io;

import com.jagex.*;

public class ISAACCipher {

	public static final int GOLDEN_RATIO = 0x9e3779b9;
	public int result;
	public int counter;
	public int count;
	public int[] mem;
	public int accumulator;
	public int[] rsl;

	public ISAACCipher(int[] seed) {
		rsl = new int[256];
		mem = new int[256];
		System.arraycopy(seed, 0, rsl, 0, seed.length);
		init();
	}

	public int nextInt() {
		if (count-- == 0) {
			isaac();
			count = 255;
		}
		return rsl[count];
	}

	public void init() {
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int a = b = c = d = e = f = g = h = GOLDEN_RATIO;
		for (int i = 0; i < 4; i++) {
			a ^= b << 11;
			b += c;
			b ^= c >>> 2;
			d += a;
			c += d;
			c ^= d << 8;
			e += b;
			f += c;
			d += e;
			d ^= e >>> 16;
			g += d;
			e += f;
			e ^= f << 10;
			f += g;
			f ^= g >>> 4;
			a += f;
			h += e;
			g += h;
			g ^= h << 8;
			h += a;
			h ^= a >>> 9;
			c += h;
			b += g;
			a += b;
		}
		for (int i = 0; i < 256; i += 8) {
			e += rsl[4 + i];
			g += rsl[6 + i];
			f += rsl[5 + i];
			a += rsl[i];
			d += rsl[i + 3];
			b += rsl[1 + i];
			a ^= b << 11;
			h += rsl[7 + i];
			c += rsl[2 + i];
			d += a;
			b += c;
			b ^= c >>> 2;
			e += b;
			c += d;
			c ^= d << 8;
			d += e;
			d ^= e >>> 16;
			f += c;
			g += d;
			e += f;
			e ^= f << 10;
			h += e;
			f += g;
			f ^= g >>> 4;
			a += f;
			g += h;
			g ^= h << 8;
			h += a;
			h ^= a >>> 9;
			b += g;
			c += h;
			a += b;
			mem[i] = a;
			mem[i + 1] = b;
			mem[2 + i] = c;
			mem[3 + i] = d;
			mem[4 + i] = e;
			mem[i - -5] = f;
			mem[6 + i] = g;
			mem[i + 7] = h;
		}
		for (int i = 0; i < 256; i += 8) {
			b += mem[1 + i];
			d += mem[i - -3];
			e += mem[4 + i];
			c += mem[2 + i];
			g += mem[6 + i];
			a += mem[i];
			f += mem[i + 5];
			h += mem[i - -7];
			a ^= b << 11;
			b += c;
			b ^= c >>> 2;
			d += a;
			e += b;
			c += d;
			c ^= d << 8;
			f += c;
			d += e;
			d ^= e >>> 16;
			e += f;
			g += d;
			e ^= f << 10;
			h += e;
			f += g;
			f ^= g >>> 4;
			g += h;
			a += f;
			g ^= h << 8;
			b += g;
			h += a;
			h ^= a >>> 9;
			a += b;
			mem[i] = a;
			mem[1 + i] = b;
			c += h;
			mem[i - -2] = c;
			mem[i - -3] = d;
			mem[4 + i] = e;
			mem[5 + i] = f;
			mem[6 + i] = g;
			mem[7 + i] = h;
		}
		isaac();
		count = 256;
	}

	public void isaac() {
		result += ++counter;
		for (int i = 0; i < 256; i++) {
			int x = mem[i];
			if ((i & 0x2) == 0) {
				if ((i & 0x1) == 0)
					accumulator ^= accumulator << 13;
				else
					accumulator ^= accumulator >>> 6;
			} else if ((i & 0x1) != 0)
				accumulator ^= accumulator >>> 16;
			else
				accumulator ^= accumulator << 2;
			accumulator += mem[0xff & 128 + i];
			int y;
			mem[i] = y = (mem[Class12_Sub12_Sub12
					.method519(255, x >> 2)] - (-accumulator + -result));
			rsl[i] = result = mem[(Class12_Sub12_Sub12
					.method519(y, 261160) >> -447738840 >> 1899104162)]
					+ x;
		}
	}
}
