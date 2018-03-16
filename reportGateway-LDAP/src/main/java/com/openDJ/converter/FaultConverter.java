package com.openDJ.converter;

import static com.openDJ.util.OpenDJUtil.getString;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.openDJ.util.FaultEnum;
import com.openDJ.view.json.FaultJson;
import com.openDJ.view.json.FaultsJson;

public class FaultConverter {

	public static FaultJson convertToFaultJson(FaultEnum faultEnum) {
		FaultJson fault = new FaultJson();

		fault.setErrorCode(faultEnum.getFaultCode());
		fault.setErrorType(getString(faultEnum.getFaultType()));
		fault.setMessage(faultEnum.getFaultMessage());

		return fault;
	}

	public static FaultsJson convertToFaultsJson(List<FaultEnum> faults) {
		FaultsJson faultsJson = new FaultsJson();

		List<FaultJson> list = new ArrayList<FaultJson>();
		for (FaultEnum fault : faults) {
			list.add(convertToFaultJson(fault));
		}

		faultsJson.setFault(list);
		return faultsJson;
	}

	public static FaultsJson convertToFaultsJson(FaultEnum faultEnum) {
		FaultsJson faultsJson = new FaultsJson();

		List<FaultJson> list = new ArrayList<FaultJson>();
		list.add(convertToFaultJson(faultEnum));

		faultsJson.setFault(list);
		return faultsJson;
	}

	public static JSONObject convertToJson(FaultEnum faultEnum) {
		FaultJson fault = FaultConverter.convertToFaultJson(faultEnum);
		JSONObject json = new JSONObject();
		JSONObject faultJson = new JSONObject();
		faultJson.put("fault_type", fault.getErrorType());
		faultJson.put("fault_code", fault.getErrorCode());
		faultJson.put("fault_message", fault.getMessage());
		json.put("fault", faultJson);
		return json;
	}

	public static FaultJson createSystemFault() {
		return FaultConverter.convertToFaultJson(FaultEnum.SYSTEM_ERROR);
	}

	
	public static FaultJson createAddToCartFault(String message) {
		FaultJson faultJson = new FaultJson();
		faultJson.setErrorCode(FaultEnum.ADD_TO_CART.getFaultCode());
		faultJson.setErrorType(FaultEnum.ADD_TO_CART.getFaultType());
		faultJson.setMessage(message);
		return faultJson;
	}

}
