package com.jagex.io;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SizedAccessFile {
	public File file;
	public RandomAccessFile accessFile;
	public long position;
	public long size;

	public SizedAccessFile(File file, String mode, long size) throws IOException {
		if (size == -1L) {
			size = 9223372036854775807L;
		}

		if (file.length() >= size) {
			file.delete();
		}

		accessFile = new RandomAccessFile(file, mode);
		this.size = size;
		position = 0L;
		this.file = file;
	}

	public long length() throws IOException {
		return accessFile.length();
	}

	public File getFile() {
		return file;
	}

	public void seek(long position) throws IOException {
		accessFile.seek(position);
		this.position = position;
	}

	public void close() throws IOException {
		accessFile.close();
		accessFile = null;
	}

	public void write(byte[] data, int offset, int length) throws IOException {
		if ((long) length + position > size) {
			accessFile.seek(size - -1L);
			accessFile.write(1);
			throw new EOFException();
		}

		accessFile.write(data, offset, length);
		position += length;
	}

	public int read(byte[] data, int offset, int length) throws IOException {
		int size = accessFile.read(data, offset, length);
		if (size > 0) {
			position += size;
		}
		return size;
	}
}
