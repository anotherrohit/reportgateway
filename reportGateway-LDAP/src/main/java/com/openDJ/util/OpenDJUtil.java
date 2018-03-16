package com.openDJ.util;

import static org.apache.commons.lang.StringUtils.isNotBlank;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class OpenDJUtil {

	public static String getString(Object object) {
		if (object != null) {
			String str = object.toString();
			if (isNotBlank(str)) {
				return str;
			}
		}
		return "";
	}

	public static String getNameShort(String firstName, String lastName) {
		StringBuffer stringBuffer = new StringBuffer();
		if (isNotBlank(firstName) && isNotBlank(lastName)) {
			lastName = lastName.trim();
			stringBuffer.append(firstName);
			stringBuffer.append(" ");
			stringBuffer.append(lastName.substring(0, 1));
			stringBuffer.append(".");
		}
		return OpenDJUtil.getString(stringBuffer);
	}

	public static String getLocationShort(String city, String state) {
		StringBuffer stringBuffer = new StringBuffer();
		if (isNotBlank(city)) {
			stringBuffer.append(city);
		}
		if (isNotBlank(state)) {
			stringBuffer.append(", ");
			stringBuffer.append(state);
		}
		return OpenDJUtil.getString(stringBuffer);
	}

	public static String getStringSeparator() {
		return " ; ";
	}

	public void trustSelfSignedSSL() {
		try {
			SSLContext ctx = SSLContext.getInstance("TLS");
			X509TrustManager tm = new X509TrustManager() {

				@Override
				public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
				}

				@Override
				public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
				}

				@Override
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
			};
			ctx.init(null, new TrustManager[] { tm }, null);
			SSLContext.setDefault(ctx);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
