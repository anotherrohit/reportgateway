package com.openDJ.util;

import java.util.Random;

public class KeyGenerator {
	
	private static String CHARS = "abcdefghijklmonpqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static int CHARS_LEN = CHARS.length();

	private static Random r = new Random();

	public static String getKey(int len) {
		char[] buf = new char[len];

		for (int i = 0; i < len; i++) {
			buf[i] = CHARS.charAt(r.nextInt(CHARS_LEN));
		}

		return new String(buf);
	}
	
	public static String getKey() {
		return getKey(16);
	}

	public static String getKey8() {
		return getKey(8);
	}
	
	public static String getKey32() {
		return getKey(32);
	}
	
	public static String getKey64() {
		return getKey(64);
	}
	
	public static String getKey128() {
		return getKey(128);
	}
	
}