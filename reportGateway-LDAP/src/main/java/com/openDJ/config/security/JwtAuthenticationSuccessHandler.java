package com.openDJ.config.security;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
@Component
public class JwtAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	
	private static final Logger log = Logger.getLogger(JwtAuthenticationSuccessHandler.class.getName());
	
	@Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
    
		log.info(this.getClass().getName() + " Method : onAuthenticationSuccess --------> Enter ");
    	log.info(this.getClass().getName() + " Method : onAuthenticationSuccess --------> Exit ");
    	
    }

}
