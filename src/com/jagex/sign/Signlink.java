package com.jagex.sign;

import com.jagex.io.SizedAccessFile;
import com.jagex.Interface2;
import com.jagex.Runnable_Impl1;
import com.jagex.util.Constants;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Signlink implements Runnable {
	public String cacheParentDir = null;
	public static String javaVendor;
	public SizedAccessFile[] cacheIndexFiles;
	public static String javaVersion;
	public SignlinkNode nextNode;
	public SizedAccessFile cacheMainIndexFile;
	public Thread signlinkThread;
	public SizedAccessFile cacheDataFile;
	public static String userHomeDir;
	public String cacheDir;
	public SignlinkNode currentNode;
	public Interface2 anInterface2_1279;
	public Runnable_Impl1 aRunnable_Impl1_1280;
	public Applet applet;
	public InetAddress inetAddress;
	public static Method setFocusTraversalKeysEnabled;
	public static int anInt1284 = 3;
	public int uid;
	public boolean stopped;

	public Signlink(boolean loadCache, Applet applet, InetAddress inetAddress, int storeId,
					String cacheGame, int indexFileCount) throws IOException {
		cacheDataFile = null;
		currentNode = null;
		cacheMainIndexFile = null;
		nextNode = null;
		uid = 0;
		cacheDir = null;
		stopped = false;
		javaVendor = "Unknown";
		this.applet = applet;
		this.inetAddress = inetAddress;
		javaVersion = "1.1";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
			userHomeDir = System.getProperty("user.home");
			if (userHomeDir != null) {
				userHomeDir += "/";
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		try {
			if (applet == null) {
				setFocusTraversalKeysEnabled = (Class.forName("java.awt.Component")
						.getDeclaredMethod("setFocusTraversalKeysEnabled",
								new Class[]{Boolean.TYPE}));
			} else {
				setFocusTraversalKeysEnabled = (applet.getClass().getMethod(
						"setFocusTraversalKeysEnabled",
						new Class[]{Boolean.TYPE}));
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		if (loadCache) {
			findCacheDir(cacheGame, storeId);
			cacheDataFile = new SizedAccessFile(new File(cacheDir
					+ "main_file_cache.dat2"), "rw", 52428800L);
			cacheIndexFiles = new SizedAccessFile[indexFileCount];
			for (int i = 0; i < indexFileCount; i++)
				cacheIndexFiles[i] = new SizedAccessFile(
						new File(cacheDir + "main_file_cache.idx" + i),
						"rw", 1048576L);
			cacheMainIndexFile = new SizedAccessFile(
					new File(cacheDir + "main_file_cache.idx255"),
					"rw", 1048576L);
			initUid();
		}

		stopped = false;
		signlinkThread = new Thread(this);
		signlinkThread.setPriority(10);
		signlinkThread.setDaemon(true);
		signlinkThread.start();
	}

	public SignlinkNode putNodeType4(URL objectData) {
		return putNode(4, objectData, 0);
	}

	public Runnable_Impl1 method873() {
		return aRunnable_Impl1_1280; // aRunnable_Impl1_1280 is never initialized? dummy class?
	}

	public SignlinkNode putNodeType10(String arg0, Class arg1) {
		return putNode(10, new Object[] { arg1, arg0 }, 0);
	}

	public SignlinkNode putNodeType3(int integerData) {
		return putNode(3, null, integerData);
	}

	public SignlinkNode putNodeType9(Class[] arg0, String arg1, Class arg2) {
		return putNode(9, new Object[] { arg2, arg1, arg0 }, 0);
	}

	public SignlinkNode putNode(int type, Object objectData, int integerData) {
		SignlinkNode signlinkNode = new SignlinkNode();
		signlinkNode.objectData = objectData;
		signlinkNode.integerData = integerData;
		signlinkNode.type = type;
		synchronized (this) {
			if (nextNode != null) {
				nextNode.prev = signlinkNode;
				nextNode = signlinkNode;
			} else
				nextNode = currentNode = signlinkNode;
			this.notify();
		}
		return signlinkNode;
	}

	public void findCacheDir(String cacheGame, int storeId) {
		if (storeId < 32 || storeId > 34) {
			storeId = 32;
		}

		if (userHomeDir == null) {
			userHomeDir = "~/";
		}

		String[] strings = {
			"c:/rscache/", "/rscache/", "c:/windows/",
			"c:/winnt/", "d:/windows/", "d:/winnt/",
			"e:/windows/", "e:/winnt/", "f:/windows/",
			"f:/winnt/", "c:/", userHomeDir, "/tmp/", ""
		};

		String string = ".file_store_" + Constants.BUILD_NUMBER;

		for (String s : strings) {
			try {
				if (s.length() > 0) {
					File file = new File(s);
					if (!file.exists()) {
						continue;
					}
				}

				File file = new File(s + string);

				if (file.exists() || file.mkdir()) {
					if (cacheGame.length() > 0) {
						file = new File(file, cacheGame);
						if (!file.exists() && !file.mkdir()) {
							continue;
						}
					}

					cacheParentDir = file.getParent() + "/";
					cacheDir = file.getPath() + "/";
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	public void stop() {
		synchronized (this) {
			stopped = true;
			this.notifyAll();
		}

		try {
			signlinkThread.join();
		} catch (InterruptedException ignored) {
		}

		if (aRunnable_Impl1_1280 != null) {
			aRunnable_Impl1_1280.method13(-7435);
		}

		if (cacheDataFile != null) {
			try {
				cacheDataFile.close();
			} catch (IOException ignored) {
			}
		}

		if (cacheMainIndexFile != null) {
			try {
				cacheMainIndexFile.close();
			} catch (IOException ignored) {
			}
		}

		if (cacheIndexFiles != null) {
			for (SizedAccessFile cacheIndexFile : cacheIndexFiles) {
				if (cacheIndexFile != null) {
					try {
						cacheIndexFile.close();
					} catch (IOException ignored) {
					}
				}
			}
		}
	}

	public SignlinkNode method880(byte arg0) {
		// This is only used once and returns null - dummy method?
		try {
			if (arg0 < 29)
				putNodeType4(null);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public SignlinkNode putNodeType2(Runnable objectData, int integerData) {
		return putNode(2, objectData, integerData);
	}

	public void initUid() {
		try {
			File file = new File(cacheParentDir + "uid.dat");
			if (!file.exists() || file.length() < 4) {
				DataOutputStream dataOutputStream = (new DataOutputStream(
						new FileOutputStream(cacheParentDir + "uid.dat")));
				dataOutputStream.writeInt((int) (Math.random() * 9.9999999E7));
				dataOutputStream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		try {
			DataInputStream dataInputStream = new DataInputStream(
					new FileInputStream(cacheParentDir + "uid.dat"));
			uid = 1 + dataInputStream.readInt();
			dataInputStream.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void run() {
		for (;;) {
			SignlinkNode signlinkNode;
			synchronized (this) {
				for (;;) {
					if (stopped)
						return;
					if (currentNode != null) {
						signlinkNode = currentNode;
						currentNode = currentNode.prev;
						if (currentNode == null)
							nextNode = null;
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException interruptedException) {
						interruptedException.printStackTrace();
					}
				}
			}

			try {
				int type = signlinkNode.type;
				if (type == 1) {
					signlinkNode.value = new Socket(
							inetAddress, signlinkNode.integerData);
				} else if (type == 2) {
					Thread thread = new Thread((Runnable) signlinkNode.objectData);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(signlinkNode.integerData);
					signlinkNode.value = thread;
				} else if (type == 4) {
					signlinkNode.value = new DataInputStream(
							((URL) signlinkNode.objectData).openStream());
				} else if (type == 9) {
					Object[] objects = (Object[]) signlinkNode.objectData;
					signlinkNode.value = (((Class) objects[0])
							.getDeclaredMethod((String) objects[1], (Class[]) objects[2]));
				} else if (type == 10) {
					Object[] objects = (Object[]) signlinkNode.objectData;
					signlinkNode.value = ((Class) objects[0])
							.getDeclaredField((String) objects[1]);
				} else {
					throw new Exception();
				}
				signlinkNode.status = 1;
			} catch (Exception exception) {
				signlinkNode.status = 2;
			}
		}
	}

	public Interface2 method883() {
		return anInterface2_1279; // anInterface2_1279 is never initialized? dummy class?
	}

	public SignlinkNode putNodeType1(int integerData) {
		return putNode(1, null, integerData);
	}
}
