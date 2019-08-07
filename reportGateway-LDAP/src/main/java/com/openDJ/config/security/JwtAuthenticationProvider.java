package com.openDJ.config.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.openDJ.config.security.model.AuthenticatedUser;
import com.openDJ.config.security.model.JwtAuthenticationToken;
import com.openDJ.config.security.util.JwtTokenValidator;
import com.openDJ.pojo.UserData;

@Component
public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

	// @Autowired
	private JwtTokenValidator jwtTokenValidator = new JwtTokenValidator();

	@Override
	public boolean supports(Class<?> authentication) {
		return JwtAuthenticationToken.class.isAssignableFrom(authentication);
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {

		JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) authentication;
		String token = jwtAuthenticationToken.getToken();
		UserData parsedUser = jwtTokenValidator.parseToken(token);

		// here you can retrive roles from database and pass as parameter rather than extract from token
		List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList(parsedUser.getRole());
		AuthenticatedUser user = new AuthenticatedUser(parsedUser.getId(), parsedUser.getUsername(), token, authorityList);
		
		//user.setIsAdmin(parsedUser.getIsAdmin()); 
		return user;
	}

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
	}

}
