package com.openDJ.config.security.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtTokenExpired extends AuthenticationException{

	public JwtTokenExpired(String msg) {
		super(msg);
	}

}
