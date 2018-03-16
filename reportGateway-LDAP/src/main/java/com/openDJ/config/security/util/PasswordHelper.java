/**
 * Created by Bhavesh Patel
 */
package com.openDJ.config.security.util;

import java.util.Random;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.stereotype.Component;

/**
 * @author Bhavesh Patel
 *
 */
@Component
public class PasswordHelper {

	private static final char[] CHARS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	public String getRandomPassword() {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			char c = CHARS[random.nextInt(CHARS.length)];
			sb.append(c);
		}
		return sb.toString();
	}

	public String encrypt(String plaintext) {
		StrongPasswordEncryptor pwdEncryptor = new StrongPasswordEncryptor();
		return pwdEncryptor.encryptPassword(plaintext);
	}

	public boolean compareEncryptPassword(String plainPassword, String encryptedPassword) {
		StrongPasswordEncryptor pwdEncryptor = new StrongPasswordEncryptor();
		return pwdEncryptor.checkPassword(plainPassword, encryptedPassword);
	}
	public static void main(String[] args) {
		System.out.println(""+new PasswordHelper().encrypt("bhavesh"));
	}
}
