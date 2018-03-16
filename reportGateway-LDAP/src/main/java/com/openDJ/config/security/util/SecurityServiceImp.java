package com.openDJ.config.security.util;

import java.util.logging.Logger;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImp implements SecurityService{
	
	private static final Logger log = Logger.getLogger(SecurityServiceImp.class.getName());

	@Override
	public Boolean hasProtectedAccess() {
		log.info(this.getClass().getName() + " Method : hasProtectedAccess ----> enter ");
		Boolean result = SecurityContextHolder.getContext().getAuthentication().getAuthorities().contains(new SimpleGrantedAuthority("ROLE_RESTAURANT")); 
		log.info(" Return Result ----> : " + result);
		log.info(this.getClass().getName() + " Method : hasProtectedAccess ----> Exit ");
	    return result; 
	  }

}
