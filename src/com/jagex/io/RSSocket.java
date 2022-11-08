package com.jagex.io;

import com.jagex.*;
import com.jagex.sign.Signlink;
import com.jagex.sign.SignlinkNode;
import com.jagex.util.Statics;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class RSSocket implements Runnable {
	public static int anInt513;
	public boolean aBoolean514 = false;
	public static int anInt515;
	public static int anInt516 = 0;
	public static RSString aClass59_517;
	public boolean aBoolean518 = false;
	public static RSString aClass59_519;
	public Socket aSocket520;
	public static int anInt521;
	public static int anInt522;
	public static Class12_Sub12_Sub7_Sub2[] aClass12_Sub12_Sub7_Sub2Array523;
	public static int[] anIntArray524;
	public static int anInt525;
	public static RSString aClass59_526;
	public InputStream anInputStream527;
	public static RSString aClass59_528;
	public static int anInt529;
	public static int anInt530;
	public static int anInt531;
	public byte[] aByteArray532;
	public static RSString aClass59_533 = Class55.method898(
			"Loading friend list", -10983);
	public static RSString aClass59_534;
	public int anInt535 = 0;
	public static RSString aClass59_536;
	public static RSString aClass59_537;
	public OutputStream anOutputStream538;
	public Signlink aSignlink_539;
	public SignlinkNode aSignlinkNode_540;
	public static int anInt541;
	public int anInt542 = 0;
	public static RSString aClass59_543;

	public int method617(boolean arg0) throws IOException {
		try {
			anInt513++;
			if (aBoolean514)
				return 0;
			if (arg0 != false)
				finalize();
			return anInputStream527.available();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hb.D(" + arg0 + ')');
		}
	}

	public void finalize() {
		try {
			anInt522++;
			method619(-2);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hb.finalize(" + ')');
		}
	}

	public void run() {
		try {
			anInt525++;
			try {
				for (;;) {
					int i;
					int i_0_;
					synchronized (this) {
						if (anInt535 == anInt542) {
							if (aBoolean514)
								break;
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						i = anInt535;
						if ((anInt542 ^ 0xffffffff) <= (anInt535 ^ 0xffffffff))
							i_0_ = anInt542 + -anInt535;
						else
							i_0_ = -anInt535 + 5000;
					}
					if (i_0_ > 0) {
						try {
							anOutputStream538.write(aByteArray532, i, i_0_);
						} catch (IOException ioexception) {
							aBoolean518 = true;
						}
						anInt535 = (i_0_ + anInt535) % 5000;
						try {
							if ((anInt535 ^ 0xffffffff) == (anInt542 ^ 0xffffffff))
								anOutputStream538.flush();
						} catch (IOException ioexception) {
							aBoolean518 = true;
						}
					}
				}
				try {
					if (anInputStream527 != null)
						anInputStream527.close();
					if (anOutputStream538 != null)
						anOutputStream538.close();
					if (aSocket520 != null)
						aSocket520.close();
				} catch (IOException ioexception) {
					/* empty */
				}
				aByteArray532 = null;
			} catch (Exception exception) {
				Class12_Sub12_Sub15.method551(true, null, exception);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hb.run(" + ')');
		}
	}

	public void method618(byte arg0, int arg1, byte[] arg2, int arg3)
			throws IOException {
		anInt541++;
		if (!aBoolean514) {
			while (arg1 > 0) {
				int i = anInputStream527.read(arg2, arg3, arg1);
				if (i <= 0)
					throw new EOFException();
				arg1 -= i;
				arg3 += i;
			}
			if (arg0 != 32)
				method619(-89);
		}
	}

	public void method619(int arg0) {
		try {
			anInt530++;
			if (!aBoolean514) {
				if (arg0 != -2)
					method619(90);
				synchronized (this) {
					aBoolean514 = true;
					this.notifyAll();
				}
				if (aSignlinkNode_540 != null) {
					while (aSignlinkNode_540.status == 0)
						Statics.method218(1L, true);
					if ((aSignlinkNode_540.status ^ 0xffffffff) == -2) {
						try {
							((Thread) aSignlinkNode_540.value).join();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				aSignlinkNode_540 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hb.A(" + arg0 + ')');
		}
	}

	public static void method620(int arg0) {
		aClass59_537 = null;
		aClass12_Sub12_Sub7_Sub2Array523 = null;
		aClass59_543 = null;
		aClass59_519 = null;
		aClass59_517 = null;
		aClass59_536 = null;
		aClass59_533 = null;
		aClass59_528 = null;
		aClass59_534 = null;
		aClass59_526 = null;
		anIntArray524 = null;
		if (arg0 != 0)
			aClass59_543 = null;
	}

	public int method621(int arg0) throws IOException {
		try {
			if (arg0 != 5000)
				aClass59_537 = null;
			anInt531++;
			if (aBoolean514)
				return 0;
			return anInputStream527.read();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "hb.E(" + arg0 + ')');
		}
	}

	public void method622(byte[] arg0, int arg1, int arg2, boolean arg3)
			throws IOException {
		try {
			anInt521++;
			if (!aBoolean514) {
				if (aBoolean518) {
					aBoolean518 = false;
					throw new IOException();
				}
				if (aByteArray532 == null)
					aByteArray532 = new byte[5000];
				synchronized (this) {
					if (arg3 != true) {
						/* empty */
					} else {
						for (int i = 0; i < arg1; i++) {
							aByteArray532[anInt542] = arg0[i + arg2];
							anInt542 = (anInt542 - -1) % 5000;
							if (anInt542 == (4900 + anInt535) % 5000)
								throw new IOException();
						}
						if (aSignlinkNode_540 == null)
							aSignlinkNode_540 = aSignlink_539.putNodeType2(this, 3);
						this.notifyAll();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("hb.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public RSSocket(Socket arg0, Signlink arg1) throws IOException {
		try {
			aSocket520 = arg0;
			aSignlink_539 = arg1;
			aSocket520.setSoTimeout(30000);
			aSocket520.setTcpNoDelay(true);
			anInputStream527 = aSocket520.getInputStream();
			anOutputStream538 = aSocket520.getOutputStream();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("hb.<init>("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass59_528 = Class55.method898("New User", -10983);
		aClass59_534 = Class55.method898("huffman", -10983);
		aClass59_537 = aClass59_528;
		aClass59_526 = aClass59_533;
		aClass59_543 = Class55.method898("Loaded title screen", -10983);
		aClass59_519 = Class55.method898("green:", -10983);
		aClass59_517 = aClass59_543;
		aClass59_536 = aClass59_519;
	}
}
