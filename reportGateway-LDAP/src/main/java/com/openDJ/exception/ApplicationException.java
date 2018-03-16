package com.openDJ.exception;

import com.openDJ.converter.FaultConverter;
import com.openDJ.util.FaultEnum;
import com.openDJ.view.json.FaultJson;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 2003967609314931022L;

	private FaultEnum faultEnum = FaultEnum.SYSTEM_ERROR;
	private FaultJson faultJson = FaultConverter.createSystemFault();

	private String messageKey;
	private Object[] messageArgs;

	public ApplicationException() {
	}

	public ApplicationException(FaultEnum faultEnum) {
		this.faultEnum = faultEnum;
		this.faultJson = FaultConverter.convertToFaultJson(faultEnum);
	}

	public ApplicationException(FaultJson faultJson) {
		this.faultJson = faultJson;
		this.faultEnum = null;
	}

	public ApplicationException(Exception e) {
		super(e);
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(String message, String messageKey, String... messageArgs) {
		super(message);
		this.messageKey = messageKey;
		this.messageArgs = messageArgs;
	}

	public ApplicationException(String message, Exception e) {
		super(message, e);
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public Object[] getMessageArgs() {
		return messageArgs;
	}

	public void setMessageArgs(Object... messageArgs) {
		this.messageArgs = messageArgs;
	}

	public FaultEnum getFaultEnum() {
		return faultEnum;
	}

	public void setFaultEnum(FaultEnum faultEnum) {
		this.faultEnum = faultEnum;
	}

	public FaultJson getFaultJson() {
		return faultJson;
	}

	public void setFaultJson(FaultJson faultJson) {
		this.faultJson = faultJson;
	}

}
