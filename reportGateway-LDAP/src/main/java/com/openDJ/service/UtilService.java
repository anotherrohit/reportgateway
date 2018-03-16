package com.openDJ.service;

import static com.openDJ.util.OpenDJUtil.getString;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.openDJ.config.security.model.AuthenticatedUser;
import com.openDJ.util.Constant;
import com.openDJ.util.FaultEnum;
import com.openDJ.view.json.FaultJson;
import com.openDJ.view.json.FaultsJson;
import com.openDJ.view.json.Status;

@Component
public class UtilService {

	private final Log logger = LogFactory.getLog(getClass());
	
	public FaultJson getFaultsObject(FaultEnum faultEnum) {
		FaultJson fault = new FaultJson();

		fault.setErrorCode(faultEnum.getFaultCode());
		fault.setErrorType(getString(faultEnum.getFaultType()));
		fault.setMessage(faultEnum.getFaultMessage());

		return fault;
	}

	public static FaultsJson generateFaultsJsonfromResponse(JSONObject jsonObject) {
		FaultsJson faultsJson = new FaultsJson();
		List<FaultJson> faultList = new ArrayList<FaultJson>();
		FaultJson faultJson = new FaultJson();

		faultJson.setErrorCode(jsonObject.getInt("errorCode"));
		faultJson.setErrorType(jsonObject.getString("errorType"));
		faultJson.setMessage(jsonObject.getString("message"));
		faultList.add(faultJson);

		faultsJson.setFault(faultList);
		return faultsJson;
	}

	public static AuthenticatedUser getAuthenticatedUser(Authentication authentication) {
		return (AuthenticatedUser) authentication.getPrincipal();
	}

	public Integer getIntegerFromBoolean(boolean value) {
		Integer i;
		if (value) {
			i = 1;
		} else {
			i = 0;
		}
		return i;
	}

	public static Integer getRandomNumber() {
		return 1000000 + (int) (Math.random() * 900000);
	}

	public static Long getRandomNumberForOrder() {
		return 10000000l + (long) (Math.random() * 90000000l);
	}

	/**
	 * @return Returns random alphanumeric string based on value passed in count
	 * @param count
	 *            - Number of Alphanumeric random numbers to be returned
	 */
	public static String getRandomAlphanumericByCount(int count) {
		return RandomStringUtils.randomAlphanumeric(count).toUpperCase();
	}

	/**
	 * This method returns Status json with 200 status code
	 * 
	 * @return Status(200)
	 */
	public Status getOKStatus() {
		Status status = new Status();
		status.setStatusCode(Constant.STATUS_CODE_SUCCESS);
		status.setStatusMessage(Constant.STATUS_SUCCESS);
		return status;
	}
}
