package com.jagex;

import com.jagex.sign.Signlink;
import com.jagex.util.Statics;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.InetAddress;
import java.net.URL;

public abstract class RSApplet extends Applet implements Runnable,
		FocusListener, WindowListener {
	public static int anInt1;
	public static int anInt2;
	public static RSString aClass59_3;
	public static int anInt4;
	public boolean aBoolean5 = false;
	public static int anInt6;
	public static int anInt7;
	public static RSString[] aClass59Array8;
	public static int anInt9;
	public static int anInt10;
	public static int anInt11;
	public static int[] anIntArray12;
	public static int anInt13;
	public static int anInt14;
	public static int anInt15;
	public static int anInt16;
	public static int anInt17;
	public static RSString aClass59_18;
	public static int anInt19;
	public static int anInt20;
	public static int anInt21;
	public static RSString aClass59_22;
	public static int anInt23;
	public static int anInt24;
	public static int anInt25;
	public static int anInt26;
	public static int[] anIntArray27 = new int[256];
	public static int anInt28;
	public static int anInt29;
	public static int anInt30;
	public static int anInt31;
	public static int anInt32;
	public static int anInt33;
	public static int anInt34;
	public static RSString aClass59_35;
	public static int[] anIntArray36;
	public static int anInt37;
	public static int anInt38;
	public static int anInt39;
	public static int anInt40;
	public static boolean aBoolean41;
	public static boolean aBoolean42;

	public void focusLost(FocusEvent arg0) {
		try {
			anInt32++;
			Class58.aBoolean1357 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.focusLost("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public URL getCodeBase() {
		try {
			anInt14++;
			if (Class12_Sub12_Sub16.aFrame2539 != null)
				return null;
			if (Game.signlink != null
					&& Game.signlink.applet != this)
				return Game.signlink.applet.getCodeBase();
			return super.getCodeBase();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public abstract void method16(int i);

	public synchronized void method17(byte arg0) {
		try {
			System.out.println("addcanvas");
			anInt17++;
			Container container;
			if (Class12_Sub12_Sub16.aFrame2539 == null)
				container = Game.signlink.applet;
			else
				container = Class12_Sub12_Sub16.aFrame2539;
			if (arg0 == -33) {
				if (Class12_Sub12_Sub5.aCanvas2243 != null) {
					Class12_Sub12_Sub5.aCanvas2243.removeFocusListener(this);
					container.remove(Class12_Sub12_Sub5.aCanvas2243);
				}
				Class12_Sub12_Sub5.aCanvas2243 = new RSCanvas(this);
				container.add(Class12_Sub12_Sub5.aCanvas2243);
				Class12_Sub12_Sub5.aCanvas2243.setSize(Class62_Sub2.anInt1913,
						Class31.anInt768);
				Class12_Sub12_Sub5.aCanvas2243.setVisible(true);
				if (Class12_Sub12_Sub16.aFrame2539 == null)
					Class12_Sub12_Sub5.aCanvas2243.setLocation(0, 0);
				else {
					Insets insets = Class12_Sub12_Sub16.aFrame2539.getInsets();
					Class12_Sub12_Sub5.aCanvas2243.setLocation(insets.left,
							insets.top);
				}
				Class12_Sub12_Sub5.aCanvas2243.addFocusListener(this);
				Class12_Sub12_Sub5.aCanvas2243.requestFocus();
				Class27.aBoolean642 = true;
				Class29.aBoolean707 = false;
				Class12_Sub12_Sub1.aLong2041 = System.currentTimeMillis();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.B(" + arg0 + ')');
		}
	}

	public void method18(int arg0, String arg1, int arg2, int arg3,
			InetAddress arg4, int arg5, int arg6, int arg7) {
		try {
			try {
				Class31.anInt768 = arg7;
				Class57.anApplet_Sub1_1331 = this;
				RuntimeException_Sub1.anInt1466 = arg2;
				Class62_Sub2.anInt1913 = arg0;
				int i = 54 / ((arg6 - -41) / 48);
				Class12_Sub12_Sub16.aFrame2539 = new Frame();
				Class12_Sub12_Sub16.aFrame2539.setTitle("Jagex");
				Class12_Sub12_Sub16.aFrame2539.setResizable(false);
				Class12_Sub12_Sub16.aFrame2539.addWindowListener(this);
				Class12_Sub12_Sub16.aFrame2539.setVisible(true);
				Class12_Sub12_Sub16.aFrame2539.toFront();
				Insets insets = Class12_Sub12_Sub16.aFrame2539.getInsets();
				Class12_Sub12_Sub16.aFrame2539.setSize((insets.right
						+ insets.left + arg0),
						(arg7 - -insets.top - -insets.bottom));
				Class47.aSignlink_1092 = Game.signlink = new Signlink(true,
						null, arg4, arg5, arg1, arg3);
				Game.signlink.putNodeType2(this, 1);
			} catch (Exception exception) {
				Class12_Sub12_Sub15.method551(true, null, exception);
			}
			anInt10++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.O(" + arg0 + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + (arg4 != null ? "{...}" : "null") + ','
					+ arg5 + ',' + arg6 + ',' + arg7 + ')'));
		}
	}

	public void focusGained(FocusEvent arg0) {
		try {
			anInt30++;
			Class58.aBoolean1357 = true;
			Class27.aBoolean642 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.focusGained("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public synchronized void paint(Graphics arg0) {
		do {
			try {
				anInt16++;
				if (this == Class57.anApplet_Sub1_1331
						&& !Class12_Sub4.aBoolean1677) {
					Class27.aBoolean642 = true;
					if (Signlink.javaVersion == null
							|| !Signlink.javaVersion.startsWith("1.5")
							|| (System.currentTimeMillis() - Class12_Sub12_Sub1.aLong2041) <= 1000L)
						break;
					Rectangle rectangle = arg0.getClipBounds();
					if (rectangle != null)
						System.out.println("Rect: " + rectangle.x + ","
								+ rectangle.y + "," + rectangle.width + ","
								+ rectangle.height);
					else
						System.out.println("Rect: null");
					if (rectangle == null
							|| (((Class62_Sub2.anInt1913 ^ 0xffffffff) >= (rectangle.width ^ 0xffffffff)) && Class31.anInt768 <= rectangle.height))
						Class29.aBoolean707 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "n.paint("
						+ (arg0 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	public void windowDeactivated(WindowEvent arg0) {
		try {
			anInt19++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.windowDeactivated("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public void windowOpened(WindowEvent arg0) {
		try {
			anInt2++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.windowOpened("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public void start() {
		try {
			anInt1++;
			if (Class57.anApplet_Sub1_1331 == this
					&& !Class12_Sub4.aBoolean1677)
				Class12_Sub12_Sub5.aLong2231 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.start(" + ')');
		}
	}

	public void stop() {
		try {
			anInt21++;
			if (this == Class57.anApplet_Sub1_1331
					&& !Class12_Sub4.aBoolean1677)
				Class12_Sub12_Sub5.aLong2231 = System.currentTimeMillis()
						- -4000L;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.stop(" + ')');
		}
	}

	public void windowDeiconified(WindowEvent arg0) {
		try {
			anInt25++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.windowDeiconified("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public void windowClosed(WindowEvent arg0) {
		try {
			anInt13++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.windowClosed("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public void method19(String arg0, int arg1) {
		try {
			if (arg1 == 1) {
				anInt24++;
				if (!aBoolean5) {
					aBoolean5 = true;
					System.out.println("error_game_" + arg0);
					try {
						getAppletContext().showDocument(
								new URL(getCodeBase(),
										("error_game_" + arg0 + ".ws")));
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.G("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void windowClosing(WindowEvent arg0) {
		try {
			anInt34++;
			destroy();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.windowClosing("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method20(int arg0) {
		try {
			anInt26++;
			long l = System.currentTimeMillis();
			long l_0_ = Class39.aLongArray943[Class30.anInt751];
			if ((long) arg0 != l_0_ && l_0_ < l) {
				/* empty */
			}
			Class39.aLongArray943[Class30.anInt751] = l;
			Class30.anInt751 = 0x1f & 1 + Class30.anInt751;
			synchronized (this) {
				Class36.aBoolean884 = Class58.aBoolean1357;
			}
			method25((byte) -113);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.I(" + arg0 + ')');
		}
	}

	public void update(Graphics arg0) {
		try {
			paint(arg0);
			anInt7++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.update("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public abstract void method21(int i);

	public abstract void init();

	public static void providesignlink(Signlink arg0) {
		try {
			Class47.aSignlink_1092 = Game.signlink = arg0;
			anInt39++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.providesignlink("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public String getParameter(String arg0) {
		try {
			anInt38++;
			if (Class12_Sub12_Sub16.aFrame2539 != null)
				return null;
			if (Game.signlink != null
					&& Game.signlink.applet != this)
				return Game.signlink.applet.getParameter(arg0);
			return super.getParameter(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.getParameter("
					+ (arg0 != null ? "{...}" : "null") + ')');
		}
	}

	public boolean method22(int arg0) {
		try {
			if (arg0 != 32000)
				method26(-56);
			anInt11++;
			String string = getDocumentBase().getHost().toLowerCase();
			if (string.endsWith("jagex.com"))
				return true;
			if (string.endsWith("runescape.com"))
				return true;
			if (string.endsWith("127.0.0.1"))
				return true;
			for (/**/; ((string.length() ^ 0xffffffff) < -1
					&& (string.charAt(-1 + string.length()) ^ 0xffffffff) <= -49 && string
					.charAt(string.length() - 1) <= '9'); string = string
					.substring(0, -1 + string.length())) {
				/* empty */
			}
			if (string.endsWith("192.168.1."))
				return true;
			method19("invalidhost", arg0 ^ 0x7d01);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.E(" + arg0 + ')');
		}
	}

	public abstract void method23(byte i);

	public void run() {
		try {
			anInt28++;
			try {
				if (Signlink.javaVendor != null) {
					String string = Signlink.javaVendor.toLowerCase();
					if (string.indexOf("sun") == -1
							&& string.indexOf("apple") == -1) {
						if (string.indexOf("ibm") != -1
								&& (Signlink.javaVersion == null || Signlink.javaVersion
										.equals("1.4.2"))) {
							method19("wrongjava", 1);
							return;
						}
					} else {
						String string_1_ = Signlink.javaVersion;
						if (string_1_.equals("1.1")
								|| string_1_.startsWith("1.1.")
								|| string_1_.equals("1.2")
								|| string_1_.startsWith("1.2.")) {
							method19("wrongjava", 1);
							return;
						}
						Class12_Sub12_Sub2.anInt2078 = 5;
					}
				}
				method17((byte) -33);
				Class12_Sub12_Sub15.aClass62_2503 = Class12_Sub12_Sub1
						.method276((Class12_Sub12_Sub5.aCanvas2243),
								Class31.anInt768, Class62_Sub2.anInt1913, false);
				method23((byte) 107);
				Class35.aClass9_866 = Class12_Sub12_Sub13.method528((byte) 78);
				Class35.aClass9_866.method106(false);
				while (Class12_Sub12_Sub5.aLong2231 == 0L
						|| (System.currentTimeMillis() < Class12_Sub12_Sub5.aLong2231)) {
					Class12_Sub12_Sub8.anInt2292 = Class35.aClass9_866
							.method105((Class12_Sub12_Sub2.anInt2078), 9104,
									Class7.anInt1539);
					for (int i = 0; i < Class12_Sub12_Sub8.anInt2292; i++)
						method20(0);
					method29((byte) 27);
				}
			} catch (Exception exception) {
				Class12_Sub12_Sub15.method551(true, null, exception);
				method19("crash", 1);
			}
			method28(32000);
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.run(" + ')');
		}
	}

	public void method24(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			anInt9++;
			try {
				if (Class57.anApplet_Sub1_1331 != null)
					method19("alreadyloaded", arg1 ^ 0x1);
				else {
					Class57.anApplet_Sub1_1331 = this;
					RuntimeException_Sub1.anInt1466 = arg3;
					Class62_Sub2.anInt1913 = arg0;
					Class31.anInt768 = arg2;
					if (arg1 != 0)
						anIntArray12 = null;
					if (Game.signlink == null)
						Class47.aSignlink_1092 = Game.signlink = (new Signlink(
								false, this,
								InetAddress.getByName(getCodeBase().getHost()),
								arg4, null, 0));
					Game.signlink.putNodeType2(this, 1);
				}
			} catch (Exception exception) {
				Class12_Sub12_Sub15.method551(true, null, exception);
				method19("crash", 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.N(" + arg0 + ','
					+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')'));
		}
	}

	public abstract void method25(byte i);

	public abstract void method26(int i);

	public URL getDocumentBase() {
		try {
			anInt37++;
			if (Class12_Sub12_Sub16.aFrame2539 != null)
				return null;
			if (Game.signlink != null
					&& Game.signlink.applet != this)
				return Game.signlink.applet.getDocumentBase();
			return super.getDocumentBase();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception,
					"n.getDocumentBase(" + ')');
		}
	}

	public static void method27(byte arg0) {
		try {
			if (arg0 == 116) {
				anIntArray36 = null;
				aClass59_35 = null;
				aClass59Array8 = null;
				anIntArray12 = null;
				anIntArray27 = null;
				aClass59_22 = null;
				aClass59_3 = null;
				aClass59_18 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.L(" + arg0 + ')');
		}
	}

	public synchronized void method28(int arg0) {
		try {
			anInt29++;
			if (!Class12_Sub4.aBoolean1677) {
				Class12_Sub4.aBoolean1677 = true;
				try {
					Class12_Sub12_Sub5.aCanvas2243.removeFocusListener(this);
					if (arg0 != 32000)
						aClass59_35 = null;
				} catch (Exception exception) {
					/* empty */
				}
				try {
					method16(9585);
				} catch (Exception exception) {
					/* empty */
				}
				if (Class12_Sub12_Sub16.aFrame2539 != null) {
					try {
						System.exit(0);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				if (Game.signlink != null) {
					try {
						Game.signlink.stop();
					} catch (Exception exception) {
						/* empty */
					}
				}
				method26(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.D(" + arg0 + ')');
		}
	}

	public void windowActivated(WindowEvent arg0) {
		try {
			anInt20++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.windowActivated("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method29(byte arg0) {
		try {
			anInt6++;
			if (arg0 == 27) {
				long l = System.currentTimeMillis();
				long l_2_ = Class20.aLongArray476[Class28.anInt668];
				Class20.aLongArray476[Class28.anInt668] = l;
				Class28.anInt668 = 1 + Class28.anInt668 & 0x1f;
				if ((l_2_ ^ 0xffffffffffffffffL) != -1L && l_2_ < l) {
					int i = (int) (l + -l_2_);
					Class30.anInt750 = ((i >> 85427105) + 32000) / i;
				}
				if (Class12_Sub12_Sub1.anInt2042++ > 50) {
					Class12_Sub12_Sub1.anInt2042 -= 50;
					Class27.aBoolean642 = true;
					Class12_Sub12_Sub5.aCanvas2243.setSize(
							Class62_Sub2.anInt1913, Class31.anInt768);
					Class12_Sub12_Sub5.aCanvas2243.setVisible(true);
					if (Class12_Sub12_Sub16.aFrame2539 == null)
						Class12_Sub12_Sub5.aCanvas2243.setLocation(0, 0);
					else {
						Insets insets = Class12_Sub12_Sub16.aFrame2539
								.getInsets();
						Class12_Sub12_Sub5.aCanvas2243.setLocation(insets.left,
								insets.top);
					}
				}
				method21(-37);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.H(" + arg0 + ')');
		}
	}

	public static void method30(int arg0) {
		do {
			try {
				anInt23++;
				Class18.aClass27_426.method675(true);
				Class12_Sub12_Sub11_Sub2_Sub1.aClass27_2912.method675(true);
				if (arg0 == -571)
					break;
				method30(-52);
			} catch (RuntimeException runtimeexception) {
				throw Class35.method724(runtimeexception, "n.F(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public AppletContext getAppletContext() {
		try {
			anInt4++;
			if (Class12_Sub12_Sub16.aFrame2539 != null)
				return null;
			if (Game.signlink != null
					&& this != Game.signlink.applet)
				return Game.signlink.applet.getAppletContext();
			return super.getAppletContext();
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception,
					"n.getAppletContext(" + ')');
		}
	}

	public void destroy() {
		try {
			anInt31++;
			if (Class57.anApplet_Sub1_1331 == this
					&& !Class12_Sub4.aBoolean1677) {
				Class12_Sub12_Sub5.aLong2231 = System.currentTimeMillis();
				Statics.method218(5000L, true);
				Class47.aSignlink_1092 = null;
				method28(32000);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, "n.destroy(" + ')');
		}
	}

	public void windowIconified(WindowEvent arg0) {
		try {
			anInt33++;
		} catch (RuntimeException runtimeexception) {
			throw Class35.method724(runtimeexception, ("n.windowIconified("
					+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass59_22 = Class55.method898(" @yel@", -10983);
		anIntArray12 = new int[50];
		aClass59_18 = Class55.method898("World", -10983);
		aClass59_3 = aClass59_18;
		aClass59_35 = Class55.method898("mapscene", -10983);
		aClass59Array8 = new RSString[5];
		for (int i = 0; i < 256; i++) {
			int i_3_ = i;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -9; i_4_++) {
				if ((0x1 & i_3_ ^ 0xffffffff) == -2)
					i_3_ = ~0x12477cdf ^ i_3_ >>> -435446559;
				else
					i_3_ >>>= 1;
			}
			anIntArray27[i] = i_3_;
		}
	}
}
