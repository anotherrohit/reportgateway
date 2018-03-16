package com.openDJ.config.security;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

	private static final Logger log = Logger.getLogger(JwtAuthenticationEntryPoint.class.getName());
	
    private static final long serialVersionUID = 3798723588865329956L;

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        // This is invoked when user tries to access a secured REST resource without supplying any credentials
        // We should just send a 401 Unauthorized response because there is no 'login page' to redirect to
    	log.info(this.getClass().getName() + " Method : commence ------> Enter ");
       
    	response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
       
    	log.info(this.getClass().getName() + " Method : commence ------> Exit ");
    }
}
