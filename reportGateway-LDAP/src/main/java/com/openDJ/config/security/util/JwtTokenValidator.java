package com.openDJ.config.security.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.openDJ.config.security.exception.JwtTokenExpired;
import com.openDJ.pojo.UserData;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtTokenValidator {

	// @Value("${jwt.secret}")
	// private String secreteKey;

	// @Value("${jwt.expiration}")
	// private Long expiration;

	/**
	 * Tries to parse specified String as a JWT token. If successful, returns
	 * User object with username, id and role prefilled (extracted from token).
	 * If unsuccessful (token is invalid or not containing all required user
	 * properties), simply returns null.
	 *
	 * @param token
	 *            the JWT token to parse
	 * @return the User object extracted from specified token or null if a token
	 *         is invalid.
	 */
	public UserData parseToken(String token) {
		
		if (isTokenExpired(token)) {
			throw new JwtTokenExpired("Token is expired");
		}
		Claims body = getClaimsFromToken(token);

		UserData u = new UserData();
		u.setUsername(body.getSubject());
		u.setId(Integer.parseInt((String) body.get(JwtAuthenticationConstants.CLAIM_KEY_USERID)));
		u.setRole((String) body.get(JwtAuthenticationConstants.CLAIM_KEY_ROLE));
		return u;
	}

	private Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}

	public Date getExpirationDateFromToken(String token) {
		return getClaimsFromToken(token).getExpiration();
	}

	private Claims getClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(JwtAuthenticationConstants.SECRET).parseClaimsJws(token).getBody();
	}

}
