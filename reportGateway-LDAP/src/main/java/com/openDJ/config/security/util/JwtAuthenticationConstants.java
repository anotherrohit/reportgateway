package com.openDJ.config.security.util;

public class JwtAuthenticationConstants {
	public static final String SECRET = "my-very-secret-key";
	public static final String TOKEN_HEADER = "access_token";
	public static final Long EXPIRATION = 604800L * 4; //-- its for 7Days -- use 86400 for 1 day 
	public static final String TOKEN_PREFIX = "Bearer";

	static final String CLAIM_KEY_USERID = "userId";
	static final String CLAIM_KEY_USERNAME = "username";
	static final String CLAIM_KEY_CREATED = "created";
	static final String CLAIM_KEY_ROLE = "role";
}
