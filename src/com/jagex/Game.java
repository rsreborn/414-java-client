package com.jagex;

import com.jagex.cache.Archive;
import com.jagex.cache.Cache;
import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.io.RSSocket;
import com.jagex.sign.Signlink;
import com.jagex.sign.SignlinkNode;
import com.jagex.util.Constants;
import com.jagex.util.Statics;

import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;

public class Game extends RSApplet {
	public static Class12_Sub12_Sub7_Sub1 aClass12_Sub12_Sub7_Sub1_1553;
	public static int anInt1554;
	public static int[] anIntArray1555;
	public static int anInt1556;
	public static int anInt1557;
	public static int anInt1558;
	public static int anInt1559;
	public static int anInt1560;
	public static int anInt1561;
	public static int anInt1562;
	public static int anInt1563;
	public static int anInt1564;
	public static boolean aBoolean1565 = false;
	public static int anInt1566;
	public static SignlinkNode aSignlinkNode_1567;
	public static int anInt1568;
	public static RSString aClass59_1569 = Class55.method898("@lre@", -10983);
	public static int anInt1570;
	public static int anInt1571;
	public static byte[][] aByteArrayArray1572 = new byte[50][];
	public static int anInt1573;
	public static int[] anIntArray1574;
	public static Class12_Sub12_Sub7_Sub1[] aClass12_Sub12_Sub7_Sub1Array1575;
	public static int anInt1576;
	public static String SERVER = "127.0.0.1";
	public static PacketBuffer outBuffer;
	public static BigInteger rsaModulus;
	public static BigInteger rsaKey;
	public static PacketBuffer encryptedLoginBuffer = new PacketBuffer(
			5000);
	public static Signlink signlink;
	public static PacketBuffer inBuffer;
	public static int loginState = 0;
	public static RSSocket gameServerSocket;
	public static SignlinkNode gameServerSignlinkNode;

	public static void handleLogin() {
		try {
			if (loginState == 0) {
				gameServerSignlinkNode = null;
				gameServerSocket = null;
				loginState = 1;
				Class38.aBoolean912 = false;
				Class42.anInt1006 = 0;
			}
			if (loginState == 1) {
				if (gameServerSignlinkNode == null)
					gameServerSignlinkNode = (signlink.putNodeType1(
							Class12_Sub12_Sub11_Sub5.anInt2877));
				if (gameServerSignlinkNode.status == 2)
					throw new IOException();
				if (gameServerSignlinkNode.status == 1) {
					gameServerSocket = new RSSocket(
							((Socket) gameServerSignlinkNode.value),
							signlink);
					loginState = 2;
					gameServerSignlinkNode = null;
				}
			}
			if (loginState == 2) {
				long l = (Class12_Sub12_Sub11_Sub3.aLong2774 = Class11.aClass59_260
						.method912(122));
				outBuffer.position = 0;
				outBuffer.writeByte(14);
				int i = (int) (l >> 16 & 0x1fL);
				outBuffer.writeByte(i);
				gameServerSocket.method622(
						outBuffer.payload, 2, 0,
						true);
				loginState = 3;
				inBuffer.position = 0;
			}
			if (loginState == 3) {
				int i = gameServerSocket.method621(5000);
				if (i != 0) {
					Class55.method899(103, i);
					return;
				}
				loginState = 4;
				inBuffer.position = 0;
			}
			if (loginState == 4) {
				if (inBuffer.position < 8) {
					int i = gameServerSocket.method617(false);
					if (i > -inBuffer.position + 8)
						i = -inBuffer.position + 8;
					if (i > 0) {
						gameServerSocket.method618((byte) 32,
								i,
								inBuffer.payload,
								inBuffer.position);
						inBuffer.position += i;
					}
				}
				if (inBuffer.position == 8) {
					inBuffer.position = 0;
					Class12_Sub12_Sub9.aLong2341 = inBuffer.readLong(123);
					loginState = 5;
				}
			}
			if (loginState == 5) {
				int[] isaacSeed = new int[4];
				isaacSeed[0] = (int) (Math.random() * 9.9999999E7);
				isaacSeed[1] = (int) (Math.random() * 9.9999999E7);
				isaacSeed[2] = (int) (Class12_Sub12_Sub9.aLong2341 >> 32);
				isaacSeed[3] = (int) Class12_Sub12_Sub9.aLong2341;

				outBuffer.position = 0;
				outBuffer.writeByte(10);
				outBuffer.writeIntBE(isaacSeed[0]);
				outBuffer.writeIntBE(isaacSeed[1]);
				outBuffer.writeIntBE(isaacSeed[2]);
				outBuffer.writeIntBE(isaacSeed[3]);
				outBuffer.writeIntBE(signlink.uid);
				outBuffer.writeLongBE(Class11.aClass59_260.method912(109));
				outBuffer.writeString(Class11.aClass59_301);
				outBuffer.encrypt((rsaKey), (rsaModulus));
				encryptedLoginBuffer.position = 0;
				if (Class9_Sub2.anInt1588 == 40)
					encryptedLoginBuffer.writeByte(18);
				else
					encryptedLoginBuffer.writeByte(16);
				encryptedLoginBuffer.writeByte(outBuffer.position + 53);
				encryptedLoginBuffer.writeIntBE(Constants.BUILD_NUMBER);
				encryptedLoginBuffer.writeByte(!Class21.aBoolean483 ? 0 : 1);

				encryptedLoginBuffer.writeIntBE(
						Cache.animsArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.basesArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.configArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.interfacesArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.synthSoundsArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.mapsArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.midiSongsArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.modelsArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.spritesArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.texturesArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.binaryArchive.checksum);
				encryptedLoginBuffer.writeIntBE(
						Cache.midiJinglesArchive.checksum);

				encryptedLoginBuffer.method253(-8366,
						outBuffer.payload,
						outBuffer.position, 0);
				gameServerSocket.method622(
						encryptedLoginBuffer.payload,
						encryptedLoginBuffer.position, 0,
						true);

				outBuffer.initIsaacCipher(isaacSeed);

				for (int i = 0; i < 4; i++) {
					isaacSeed[i] += 50;
				}

				inBuffer.initIsaacCipher(isaacSeed);
				loginState = 6;
			}

			if (loginState == 6
					&& gameServerSocket.method617(false) > 0) {
				int i = gameServerSocket.method621(5000);
				if (i != 21 || Class9_Sub2.anInt1588 != 20) {
					if (i == 2)
						loginState = 9;
					else if (i != 15
							|| Class9_Sub2.anInt1588 != 40) {
						if (i == 23 && Statics.anInt567 < 1) {
							Statics.anInt567++;
							loginState = 0;
						} else {
							Class55.method899(65, i);
							return;
						}
					} else {
						Class48.method792(false);
						return;
					}
				} else
					loginState = 7;
			}
			if (loginState == 7
					&& gameServerSocket.method617(false) > 0) {
				RuntimeException_Sub1.anInt1472 = 60 * (3 + gameServerSocket
						.method621(5000));
				loginState = 8;
			}
			if (loginState == 8) {
				Class42.anInt1006 = 0;
				Class12_Sub12_Sub11_Sub3.method468((Statics.method251(
						(byte) -128,
						new RSString[] {
								Class19.method599(
										(RuntimeException_Sub1.anInt1472) / 60,
										10), Class41.aClass59_968 })),
						Class1.aClass59_78, Class49.aClass59_1154, -4774);
				if (--RuntimeException_Sub1.anInt1472 <= 0)
					loginState = 0;
			} else {
				if (loginState == 9
						&& gameServerSocket.method617(false) >= 8) {
					Class12_Sub12_Sub6.anInt2267 = gameServerSocket
							.method621(5000);
					Class12_Sub12_Sub9.aBoolean2360 = (gameServerSocket
							.method621(5000) == 1);
					Class12_Sub9.anInt1751 = gameServerSocket
							.method621(5000);
					Class12_Sub9.anInt1751 <<= 8;
					Class12_Sub9.anInt1751 += gameServerSocket
							.method621(5000);
					Class12_Sub12_Sub11.anInt2396 = gameServerSocket
							.method621(5000);
					gameServerSocket.method618((byte) 32, 1,
							inBuffer.payload, 0);
					inBuffer.position = 0;
					Class57.anInt1334 = inBuffer
							.readPacket();
					gameServerSocket.method618((byte) 32, 2,
							inBuffer.payload, 0);
					inBuffer.position = 0;
					Class5.anInt159 = inBuffer
							.readShort(-1);
					loginState = 10;
				}
				if (loginState == 10) {
					if (Class5.anInt159 <= gameServerSocket.method617(false)) {
						inBuffer.position = 0;
						gameServerSocket.method618((byte) 32,
								Class5.anInt159,
								inBuffer.payload,
								0);
						Class18.method596(0);
						Class29.anInt715 = -1;
						Class14.method569(101, false);
						Class57.anInt1334 = -1;
					}
				} else {
					Class42.anInt1006++;
					if (Class42.anInt1006 > 2000) {
						if (Statics.anInt567 < 1) {
							Statics.anInt567++;
							if (Class12_Sub12_Sub11_Sub5.anInt2877 == Class48.anInt1133)
								Class12_Sub12_Sub11_Sub5.anInt2877 = Class12.anInt332;
							else
								Class12_Sub12_Sub11_Sub5.anInt2877 = Class48.anInt1133;
							loginState = 0;
						} else
							Class55.method899(69, -3);
					}
				}
			}
		} catch (IOException ioexception) {
			if (Statics.anInt567 < 1) {
				if (Class12_Sub12_Sub11_Sub5.anInt2877 != Class48.anInt1133)
					Class12_Sub12_Sub11_Sub5.anInt2877 = Class48.anInt1133;
				else
					Class12_Sub12_Sub11_Sub5.anInt2877 = Class12.anInt332;
				loginState = 0;
				Statics.anInt567++;
			} else
				Class55.method899(113, -2);
		}
	}
	//public static String SERVER = "174.100.85.210";
	
	public void method31(byte arg0) {
		anInt1571++;
		if (Class12_Sub12_Sub10.anInt2365 >= 4) {
			this.method19("js5crc", 1);
			Class9_Sub2.anInt1588 = 1000;
		} else {
			if (Class12_Sub12_Sub8.anInt2294 >= 4) {
				if (Class9_Sub2.anInt1588 <= 5) {
					this.method19("js5io", 1);
					Class9_Sub2.anInt1588 = 1000;
					return;
				}
				Class19.anInt440 = 3000;
				Class12_Sub12_Sub8.anInt2294 = 3;
			}
			if (Class19.anInt440-- <= 0) {
				do {
					try {
						if (Class64_Sub2.anInt1961 == 0) {
							Class7.aSignlinkNode_1533 = (signlink
									.putNodeType1(
											Class12_Sub12_Sub11_Sub5.anInt2877
									));
							Class64_Sub2.anInt1961++;
						}
						if (Class64_Sub2.anInt1961 == 1) {
							if ((Class7.aSignlinkNode_1533.status ^ 0xffffffff) == -3) {
								method35(19427, -1);
								break;
							}
							if ((Class7.aSignlinkNode_1533.status ^ 0xffffffff) == -2)
								Class64_Sub2.anInt1961++;
						}
						if (arg0 < -107) {
							if (Class64_Sub2.anInt1961 == 2) {
								Class12_Sub12_Sub4.aClass24_2217 = new RSSocket(
										(Socket) (Class7.aSignlinkNode_1533.value),
										signlink);
								Buffer class12_sub11 = new Buffer(
										5);
								class12_sub11.writeByte(15);
								class12_sub11.writeIntBE(414);
								Class12_Sub12_Sub4.aClass24_2217.method622(
										class12_sub11.payload, 5, 0,
										true);
								Class64_Sub2.anInt1961++;
								Class9.aLong204 = System.currentTimeMillis();
							}
							if (Class64_Sub2.anInt1961 == 3) {
								if (Class9_Sub2.anInt1588 <= 5
										|| Class12_Sub12_Sub4.aClass24_2217
												.method617(false) > 0) {
									int i = Class12_Sub12_Sub4.aClass24_2217
											.method621(5000);
									if ((i ^ 0xffffffff) != -1) {
										method35(19427, i);
										break;
									}
									Class64_Sub2.anInt1961++;
								} else if ((System.currentTimeMillis() - Class9.aLong204) > 30000L) {
									method35(19427, -2);
									break;
								}
							}
							if (Class64_Sub2.anInt1961 != 4)
								break;
							Class1.method45(Class9_Sub2.anInt1588 > 20,
									(byte) 17, Class12_Sub12_Sub4.aClass24_2217);
							Class12_Sub12_Sub4.aClass24_2217 = null;
							Class7.aSignlinkNode_1533 = null;
							Class64_Sub2.anInt1961 = 0;
							Class12_Sub2.anInt1660 = 0;
						}
					} catch (java.io.IOException ioexception) {
						method35(19427, -3);
						break;
					}
					break;
				} while (false);
			}
		}
	}

	public static void method32(int arg0) {
		try {
			anIntArray1574 = null;
			aClass12_Sub12_Sub7_Sub1_1553 = null;
			aSignlinkNode_1567 = null;
			aByteArrayArray1572 = null;
			aClass12_Sub12_Sub7_Sub1Array1575 = null;
			int i = 16 % ((arg0 - 35) / 40);
			aClass59_1569 = null;
			anIntArray1555 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "client.T(" + arg0 + ')');
		}
	}

	public void method25(byte arg0) {
		try {
			Class64_Sub2.anInt1968++;
			anInt1563++;
			method33(3);
			Class17.method595(-24160);
			Class11.method131(false);
			Class9_Sub2.method112((byte) -124);
			if (arg0 != -113)
				aClass59_1569 = null;
			Class12_Sub12_Sub10.method428((byte) 93);
			Class12_Sub12_Sub11_Sub1.method439(false);
			if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -1) {
				Class12_Sub12_Sub3.method300(true);
				Class30.method696((byte) -91);
			} else if (Class9_Sub2.anInt1588 == 5) {
				Class12_Sub12_Sub3.method300(true);
				Class30.method696((byte) -91);
			} else if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -11)
				Class31.method700(120);
			else if ((Class9_Sub2.anInt1588 ^ 0xffffffff) != -21) {
				if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -26)
					Class28.method685(-1975);
			} else {
				Class31.method700(arg0 ^ ~0x14);
				handleLogin();
			}
			if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -31)
				Class9.method111((byte) -124);
			else if (Class9_Sub2.anInt1588 != 35) {
				if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -41)
					handleLogin();
			} else
				Class9.method111((byte) -111);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "client.K(" + arg0 + ')');
		}
	}

	public void method16(int arg0) {
		if (Class1.aClass19_72 != null)
			Class1.aClass19_72.aBoolean449 = false;
		anInt1559++;
		Class1.aClass19_72 = null;
		if (gameServerSocket != null)
			gameServerSocket.method619(-2);
		Class4.method68(125);
		Class9.method107(78);
		Class11.method134((byte) -15);
		Class12_Sub12_Sub11_Sub2.method451((byte) 119);
		Class12_Sub1.method146(arg0 ^ ~0x59d2);
		if (arg0 != 9585)
			method32(57);
		Class36.method731((byte) 97);
		do {
			try {
				if (Class36.aClass51_879 != null)
					Class36.aClass51_879.method810(arg0 ^ 0x2508);
				if (Class19.aClass51Array452 != null) {
					for (int i = 0; i < Class19.aClass51Array452.length; i++) {
						if (Class19.aClass51Array452[i] != null)
							Class19.aClass51Array452[i].method810(85);
					}
				}
				if (Class10.aClass51_245 == null)
					break;
				Class10.aClass51_245.method810(96);
			} catch (java.io.IOException ioexception) {
				break;
			}
			break;
		} while (false);
	}

	public static void main(String[] arg0) {
		try {
			anInt1564++;
			try {
				if ((arg0.length ^ 0xffffffff) != -6)
					Class14.method572(11128);
				RSCanvas.anInt65 = Integer.parseInt(arg0[0]);
				if (arg0[1].equals("live"))
					Class20.anInt478 = 0;
				else if (!arg0[1].equals("office")) {
					if (!arg0[1].equals("local"))
						Class14.method572(11128);
					else
						Class20.anInt478 = 2;
				} else
					Class20.anInt478 = 1;
				if (!arg0[2].equals("live")) {
					if (arg0[2].equals("rc"))
						RuntimeException_Sub1.anInt1471 = 1;
					else if (!arg0[2].equals("wip"))
						Class14.method572(11128);
					else
						RuntimeException_Sub1.anInt1471 = 2;
				} else
					RuntimeException_Sub1.anInt1471 = 0;
				if (arg0[3].equals("lowmem"))
					Class12_Sub12_Sub8.method411(12855);
				else if (arg0[3].equals("highmem"))
					Class12_Sub12_Sub11_Sub2_Sub1.method455((byte) 4);
				else
					Class14.method572(11128);
				if (arg0[4].equals("free"))
					Class12_Sub12_Sub11_Sub6.aBoolean2898 = false;
				else if (arg0[4].equals("members"))
					Class12_Sub12_Sub11_Sub6.aBoolean2898 = true;
				else
					Class14.method572(11128);
				Game var_game = new Game();
				var_game.method18(765, "runescape", 414, 12, InetAddress.getByName(SERVER), 32 - -RuntimeException_Sub1.anInt1471, -128, 503);
			} catch (Exception exception) {
				Class12_Sub12_Sub15.method551(true, null, exception);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "client.main("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public void method33(int arg0) {
		anInt1557++;
		if (Class9_Sub2.anInt1588 != 1000) {
			boolean bool = Class43.method773(arg0 ^ 0x6f);
			if (!bool)
				method31((byte) -125);
			if (arg0 != 3)
				aClass12_Sub12_Sub7_Sub1Array1575 = null;
		}
	}

	public static void method34(int arg0, RSString arg1) {
		try {
			anInt1576++;
			if (arg1 == null || arg1.length() == 0)
				RuntimeException_Sub1.anInt1473 = 0;
			else {
				RSString class59 = arg1;
				int i = 0;
				RSString[] class59s = new RSString[100];
				for (;;) {
					int i_0_ = class59.method923(32, true);
					if (i_0_ == -1) {
						class59 = class59.method935(false);
						if (class59.length() > 0)
							class59s[i++] = class59.method939((byte) -76);
						break;
					}
					RSString class59_1_ = class59.method937(i_0_, true, 0)
							.method935(false);
					if ((class59_1_.length() ^ 0xffffffff) < -1)
						class59s[i++] = class59_1_.method939((byte) 126);
					class59 = class59.method945(63, i_0_ - -1);
				}
				RuntimeException_Sub1.anInt1473 = arg0;
				int i_2_ = 0;
				while_12_: for (/**/; ((i_2_ ^ 0xffffffff) > (Class12_Sub6.anInt1684 ^ 0xffffffff)); i_2_++) {
					Class12_Sub12_Sub15 class12_sub12_sub15 = Class12_Sub12_Sub11_Sub5
							.method502((byte) 121, i_2_);
					if ((class12_sub12_sub15.anInt2483 ^ 0xffffffff) == 0
							&& class12_sub12_sub15.aClass59_2480 != null) {
						RSString class59_3_ = class12_sub12_sub15.aClass59_2480
								.method939((byte) -122);
						for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i ^ 0xffffffff); i_4_++) {
							if ((class59_3_
									.method930(arg0 + -2, class59s[i_4_]) ^ 0xffffffff) == 0)
								continue while_12_;
						}
						Class48.aClass59Array1118[(RuntimeException_Sub1.anInt1473)] = class59_3_;
						Class18.anIntArray435[RuntimeException_Sub1.anInt1473] = i_2_;
						RuntimeException_Sub1.anInt1473++;
						if (Class48.aClass59Array1118.length <= RuntimeException_Sub1.anInt1473)
							break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("client.Q(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public void init() {
		try {
			anInt1558++;
			if (this.method22(32000)) {
				RSCanvas.anInt65 = Integer.parseInt(this
						.getParameter("worldid"));
				RuntimeException_Sub1.anInt1471 = Integer.parseInt(this
						.getParameter("modewhat"));
				Class20.anInt478 = Integer.parseInt(this
						.getParameter("modewhere"));
				String string = this.getParameter("lowmem");
				if (string != null && string.equals("1"))
					Class12_Sub12_Sub8.method411(12855);
				else
					Class12_Sub12_Sub11_Sub2_Sub1.method455((byte) 12);
				String string_5_ = this.getParameter("members");
				if (string_5_ != null && string_5_.equals("1"))
					Class12_Sub12_Sub11_Sub6.aBoolean2898 = true;
				else
					Class12_Sub12_Sub11_Sub6.aBoolean2898 = false;
				this.method24(765, 0, 503, 414,
						RuntimeException_Sub1.anInt1471 + 32);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "client.init(" + ')');
		}
	}

	public void method21(int arg0) {
		try {
			anInt1554++;
			if (Class29.aBoolean707) {
				Class26.method642(Class12_Sub12_Sub5.aCanvas2243, 32);
				Class33.method709(Class12_Sub12_Sub5.aCanvas2243, true);
				this.method17((byte) -33);
				Class4.method73((byte) 126, Class12_Sub12_Sub5.aCanvas2243);
				Class33.method708(90, Class12_Sub12_Sub5.aCanvas2243);
			}
			if (Class9_Sub2.anInt1588 != 0) {
				if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -6)
					RuntimeException_Sub1.method1002((byte) -80,
							Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055,
							Class29.aClass12_Sub12_Sub7_Sub4_693);
				else if ((Class9_Sub2.anInt1588 ^ 0xffffffff) != -11) {
					if ((Class9_Sub2.anInt1588 ^ 0xffffffff) == -21)
						RuntimeException_Sub1
								.method1002(
										(byte) -59,
										Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055,
										Class29.aClass12_Sub12_Sub7_Sub4_693);
					else if ((Class9_Sub2.anInt1588 ^ 0xffffffff) != -26) {
						if (Class9_Sub2.anInt1588 != 30) {
							if ((Class9_Sub2.anInt1588 ^ 0xffffffff) != -36) {
								if (Class9_Sub2.anInt1588 == 40)
									Class36.method729(
											false,
											(Class12_Sub2.aClass59_1639),
											1932,
											(Class12_Sub12_Sub11_Sub6.aClass59_2909));
							} else
								Class23.method615(-104);
						} else
							Class31.method697(17);
					} else if (Class12_Sub12_Sub10.anInt2375 == 1) {
						if (Archive.anInt1901 < Class35.anInt854)
							Archive.anInt1901 = Class35.anInt854;
						int i = ((Archive.anInt1901 - Class35.anInt854) * 50 / Archive.anInt1901);
						Class36.method729(true, (Statics.method251(
								(byte) -126,
								(new RSString[] { Class43.aClass59_1011,
										Class19.method599(i, 10),
										Class12_Sub6.aClass59_1691 }))), 1932,
								Class64_Sub2.aClass59_1970);
					} else if (Class12_Sub12_Sub10.anInt2375 != 2)
						Class36.method729(false, null, 1932,
								Class64_Sub2.aClass59_1970);
					else {
						if ((Class36.anInt883 ^ 0xffffffff) < (Class30.anInt721 ^ 0xffffffff))
							Class30.anInt721 = Class36.anInt883;
						int i = 50 + ((-Class36.anInt883 + Class30.anInt721) * 50 / Class30.anInt721);
						Class36.method729(true, (Statics.method251(
								(byte) -61,
								(new RSString[] { Class43.aClass59_1011,
										Class19.method599(i, 10),
										Class12_Sub6.aClass59_1691 }))), 1932,
								Class64_Sub2.aClass59_1970);
					}
				} else
					RuntimeException_Sub1.method1002((byte) -11,
							Class12_Sub12_Sub1.aClass12_Sub12_Sub7_Sub4_2055,
							Class29.aClass12_Sub12_Sub7_Sub4_693);
			} else
				Class7.method88(null, Class11.aClass59_285, 21722,
						Class64_Sub1.anInt1951);
			if (arg0 > -28)
				aClass12_Sub12_Sub7_Sub1_1553 = null;
			Class7.anInt1538 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "client.A(" + arg0 + ')');
		}
	}

	public void method35(int arg0, int arg1) {
		Class64_Sub2.anInt1961 = 0;
		if (arg0 != 19427)
			aClass12_Sub12_Sub7_Sub1Array1575 = null;
		Class7.aSignlinkNode_1533 = null;
		anInt1568++;
		Class12_Sub12_Sub4.aClass24_2217 = null;
		if ((Class48.anInt1133 ^ 0xffffffff) != (Class12_Sub12_Sub11_Sub5.anInt2877 ^ 0xffffffff))
			Class12_Sub12_Sub11_Sub5.anInt2877 = Class48.anInt1133;
		else
			Class12_Sub12_Sub11_Sub5.anInt2877 = Class12.anInt332;
		Class12_Sub2.anInt1660++;
		if ((Class12_Sub2.anInt1660 ^ 0xffffffff) > -3 || arg1 != 7
				&& arg1 != 9) {
			if (Class12_Sub2.anInt1660 >= 2 && arg1 == 6) {
				this.method19("js5connect_outofdate", 1);
				Class9_Sub2.anInt1588 = 1000;
			} else if ((Class12_Sub2.anInt1660 ^ 0xffffffff) <= -5) {
				if (Class9_Sub2.anInt1588 > 5)
					Class19.anInt440 = 3000;
				else {
					this.method19("js5connect", arg0 + -19426);
					Class9_Sub2.anInt1588 = 1000;
				}
			}
		} else if ((Class9_Sub2.anInt1588 ^ 0xffffffff) < -6)
			Class19.anInt440 = 3000;
		else {
			this.method19("js5connect_full", 1);
			Class9_Sub2.anInt1588 = 1000;
		}
	}

	public static void method36(byte[] arg0, int arg1, byte arg2, Class36 arg3) {
		try {
			if (arg2 <= 87)
				main(null);
			anInt1561++;
			Class12_Sub9 class12_sub9 = new Class12_Sub9();
			class12_sub9.aLong319 = (long) arg1;
			class12_sub9.aByteArray1757 = arg0;
			class12_sub9.anInt1748 = 0;
			class12_sub9.aClass36_1746 = arg3;
			synchronized (Class10.aClass8_240) {
				Class10.aClass8_240.method98(class12_sub9, (byte) 79);
			}
			Class26.method633((byte) 60);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("client.S("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method26(int arg0) {
		try {
			method32(arg0 ^ 0x6a);
			anInt1560++;
			RSString.method931((byte) 35);
			RSApplet.method27((byte) 116);
			Class30.method691(-22505);
			Class9.method110(16);
			Class62.method955(false);
			Class19.method601(arg0);
			Statics.method229((byte) 86);
			RSSocket.method620(arg0);
			Archive.method662(1);
			Class51.method813(14);
			Class36.method730(0);
			Class12_Sub12_Sub11_Sub2_Sub1.method457((byte) 91);
			Statics.method258(0);
			Class12_Sub12_Sub7_Sub4.method390();
			Class52.method821();
			Class10.method124(true);
			Class12_Sub12_Sub11_Sub2_Sub2.method463(arg0 + 12);
			Class8.method92((byte) -90);
			Class12_Sub12_Sub3.method299((byte) -118);
			Class33.method715((byte) 111);
			Class42.method767((byte) -13);
			Class12_Sub12_Sub11_Sub2.method449(false);
			Class12_Sub2.method149(-14531);
			Class12_Sub12_Sub2.method294(21218);
			Class48.method798((byte) -30);
			Class12.method141((byte) -103);
			Statics.method624((byte) -31);
			Class31.method699(-1);
			Class12_Sub12.method270((byte) -37);
			Class26.method630((byte) -118);
			Class27.method680(256);
			Class12_Sub12_Sub4.method306(0);
			Class12_Sub12_Sub11_Sub4.method494();
			RuntimeException_Sub1.method1001(arg0 + 16);
			Class12_Sub7.method193(true);
			Class32.method705(arg0 + -92);
			Class47.method790((byte) -125);
			Class12_Sub12_Sub11.method435(false);
			Class55.method897(false);
			Class4.method72(true);
			Class44.method781(-88);
			Class29.method688((byte) -107);
			Class46.method789();
			Class49.method800(arg0 + 92);
			Class13.method563(27624);
			Class28.method681(255);
			Class11.method135(arg0 ^ 0x3a);
			Class14.method574(11366);
			Class23.method613(true);
			Class40.method749(100);
			Class61.method951(83);
			Class38.method739(arg0 + 10227);
			Class12_Sub12_Sub8.method412((byte) 27);
			Class41.method757(8);
			Class12_Sub12_Sub7_Sub3.method387();
			Class12_Sub12_Sub7.method349();
			Class1.method44((byte) 104);
			Class20.method605((byte) 108);
			Class5.method76(1);
			Class12_Sub12_Sub1.method277((byte) 125);
			Class12_Sub12_Sub13.method527(-92);
			Class12_Sub12_Sub6.method328(true);
			Class12_Sub12_Sub9.method416(5);
			Class12_Sub12_Sub15.method555(128);
			Class12_Sub12_Sub5.method325((byte) 119);
			Class12_Sub12_Sub14.method540(-1113687097);
			Class12_Sub12_Sub10.method431((byte) -96);
			Class12_Sub12_Sub16.method559(false);
			Class7.method85((byte) -104);
			Class12_Sub10.method201();
			Class15.method588(-25704);
			Class39.method747(-15356);
			Class18.method597(106);
			Class56.method901((byte) 64);
			Class3.method67();
			Class35.method721((byte) -61);
			Class12_Sub12_Sub11_Sub3.method469((byte) -42);
			Class12_Sub12_Sub11_Sub5.method507(-125);
			Class43.method778(true);
			Class12_Sub12_Sub11_Sub6.method509(-120);
			Class12_Sub12_Sub11_Sub1.method444(-17194);
			Class12_Sub1.method144(arg0 + 31);
			Class57.method905(-126);
			RSCanvas.method38((byte) -69);
			Class9_Sub2.method113((byte) 93);
			Class62_Sub2.method961((byte) -96);
			Class21.method607(arg0 + 19);
			Class45.method785();
			Class58.method910((byte) 126);
			Class54.method887();
			Class63.method972(13087);
			Class37.method735();
			Class12_Sub4.method161(true);
			Class12_Sub9.method197(arg0);
			Class64.method973((byte) 124);
			Class12_Sub12_Sub12.method521(true);
			Class14_Sub2.method580();
			Class14_Sub2_Sub1.method585();
			Class17.method593(arg0);
			Class12_Sub6.method186(true);
			Class64_Sub1.method990(29250);
			Class2.method57();
			Class64_Sub2.method998((byte) 62);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "client.J(" + arg0 + ')');
		}
	}

	public void method23(byte arg0) {
		Class48.anInt1133 = ((Class20.anInt478 ^ 0xffffffff) != -1 ? 40000 - -RSCanvas.anInt65
				: 43594);
		Class12_Sub12_Sub11_Sub5.anInt2877 = Class48.anInt1133;
		anInt1556++;
		Class12.anInt332 = Class20.anInt478 == 0 ? 443
				: RSCanvas.anInt65 + 50000;
		Class42.method772(8518);
		Class4.method73((byte) 85, Class12_Sub12_Sub5.aCanvas2243);
		Class33.method708(104, Class12_Sub12_Sub5.aCanvas2243);
		Class12_Sub6.anInt1687 = Signlink.anInt1284;
		if (arg0 >= 86) {
			try {
				if (signlink.cacheDataFile != null) {
					Class36.aClass51_879 = new Class51(
							signlink.cacheDataFile, 5200, 0);
					for (int i = 0; i < 12; i++)
						Class19.aClass51Array452[i] = new Class51(
								(signlink.cacheIndexFiles[i]),
								6000, 0);
					Class10.aClass51_245 = new Class51(
							signlink.cacheMainIndexFile, 6000, 0);
					Class64_Sub2.aClass36_1977 = new Class36(255,
							Class36.aClass51_879, Class10.aClass51_245, 500000);
					signlink.cacheIndexFiles = null;
					signlink.cacheMainIndexFile = null;
					signlink.cacheDataFile = null;
				}
			} catch (java.io.IOException ioexception) {
				Class36.aClass51_879 = null;
				Class10.aClass51_245 = null;
				Class64_Sub2.aClass36_1977 = null;
			}
			if (Class20.anInt478 != 0)
				Class43.aBoolean1023 = true;
		}
	}

	static {
		anInt1562 = 0;
		anIntArray1574 = new int[25];
	}
}
