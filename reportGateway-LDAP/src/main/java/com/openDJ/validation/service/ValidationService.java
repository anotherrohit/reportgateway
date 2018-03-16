package com.openDJ.validation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.openDJ.service.UtilService;

@Component
public class ValidationService
{
	@Autowired
	private UtilService utilService;
	
	private final Log logger = LogFactory.getLog(getClass());
	
	public boolean validateEmptyString(String value)
	{
		if(value== null || value.trim().equals("")) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean isValid(String str, int maxLength) {
		return str != null && str.trim().length() <= maxLength;
	}

	public boolean isValid(Integer integer, int maxLength) {
		return integer != null && integer.toString().length() <= maxLength;
	}

	public boolean isValidOrNull(String str, int maxLength) {
		return str == null || str.trim().length() <= maxLength;
	}
	
	public boolean validateInteger(Integer value)
	{
		if(value== null || value <= 0) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean validateLong(Long value)
	{
		if(value== null || value <= 0) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean validateDouble(Double value)
	{
		if(value== null || value <= 0) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean validateBoolean(Boolean value)
	{
		if(value== null) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean validateDate(Date value)
	{
		if(value== null) {
			return false;
		} else {
			return true;
		}
		
	}

}

	
