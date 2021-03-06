package com.openDJ.service;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.openDJ.config.security.model.AuthenticatedUser;
import com.openDJ.config.security.util.JwtAuthenticationConstants;
import com.openDJ.config.security.util.JwtTokenGenerator;
import com.openDJ.pojo.UserData;

@Service
public class AuthService {

	
	private JwtTokenGenerator JwtTokenGenerator;

	
	/**
	 * This service is used for generating token based on user data
	 * 
	 * @param userData
	 * @return
	 */
	public String generateToken(UserData userData) {
		// if true --> set UserDetails in context
		List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList(userData.getRole());
		AuthenticatedUser user = new AuthenticatedUser(userData.getId(), userData.getUsername(), null, authorityList);
		// user.setIsAdmin(userBO.getIsAdmin());
		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null,
				user.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authentication);
		// if true --> token jgenerate and send
		return JwtAuthenticationConstants.TOKEN_PREFIX + " "
				+ JwtTokenGenerator.generateToken(userData, JwtAuthenticationConstants.SECRET);
	}
}
