package com.openDJ.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 
public class InfoSpaceRequestSigner
{
	private final Log logger = LogFactory.getLog(getClass());
	
	private final String token;
     
    public InfoSpaceRequestSigner(String token)
    {
        this.token = token;
    }
     
    public String getSignature(String url)
    {
        String value = new StringBuffer().append(getFormattedDateString())
        		.append(this.token)
        		.append(url)
        		.toString();
        logger.info("getSignature - value:="+value);
        logger.info("getSignature - hashValue:="+hashValue(value));
        return hashValue(value);
    }
    
    public String getSignaturePrevMinute(String url)
    {
        String value = new StringBuffer().append(getFormattedDateStringPrevMinute())
        		.append(this.token)
        		.append(url)
        		.toString();
        logger.info("prevMin value:="+value);
        logger.info("prevMin hashValue:="+hashValue(value));
        return hashValue(value);
    }
     
    private String getFormattedDateString()
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
         
        return format.format(getTimeToNearestMinute());
    }
    
    private String getFormattedDateStringPrevMinute()
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
         
        return format.format(getTimeToNearestMinutePrevMinute());
    }
     
    private Date getTimeToNearestMinute()
    {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
         
        cal.add(Calendar.SECOND, 60);
         
        return cal.getTime();
    }
    
    private Date getTimeToNearestMinutePrevMinute()
    {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        return cal.getTime();
    }
     
//    private String getQueryString(String url)
//    {
//        return URI.create(url).getRawQuery();
//    }
     
    private String hashValue(String input)
    {
        byte[] bytes = decodeUTF8(input);
         
        bytes = hashSHA1(bytes);
         
        return encodeUrlSafeBase64(bytes);
    }
     
    private byte[] decodeUTF8(String input)
    {
        try
        {
            return input.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            return input.getBytes();
        }
    }
     
    private byte[] hashSHA1(byte[] input)
    {
        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
             
            return digest.digest(input);
        }
        catch (NoSuchAlgorithmException e)
        {
            return null;
        }
    }
     
    private String encodeUrlSafeBase64(byte[] input)
    {
        return Base64.encodeBase64URLSafeString(input);
    }
}