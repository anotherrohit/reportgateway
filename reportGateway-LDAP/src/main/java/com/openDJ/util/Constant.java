package com.openDJ.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Constant {

	public static final String HEADER_CONTENT_TYPE = "Content-Type";
	public static final String HEADER_UUID = "uuid";
	public static final String HEADER_APP_KEY = "app_key";
	public static final String HEADER_ACCESS_TOKEN = "access_token";
	public static final String JSON_CONTENT_TYPE = "application/json";

	public static final int DEFAULT_PAGINATION_START_VALUE = 0;
	public static final int DEFAULT_PAGINATION_LIMIT_VALUE = -1;

	public static final String STATUS_SUCCESS = "SUCCESS";
	public static final int STATUS_CODE_SUCCESS = 200;
	public static final String STATUS_FAILURE = "FAILURE";
	public static final int STATUS_CODE_FAILURE = 500;

	public static final int IS_ACTIVE_TRUE = 1;
	public static final int IS_ACTIVE_FALSE = 0;

	public static final int DEFAULT_PRIORITY = 5;

	public static final int DEFAULT_TIME_DIFFERENCE = 3;

	public static final String SYSTEMADMIN_USER = "systemadmin";
	public static final String SYSTEMADMIN_USER_APP = "systemadmin_app";



}
