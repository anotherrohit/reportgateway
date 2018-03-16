package com.openDJ.config.security.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.openDJ.pojo.UserData;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenGenerator {

	/**
	 * Generates a JWT token containing username as subject, and userId and role
	 * as additional claims. These properties are taken from the specified User
	 * object. Tokens validity is infinite.
	 *
	 * @param u
	 *            the user for which the token will be generated
	 * @return the JWT token
	 */
	public static String generateToken(UserData u, String secret) {
		Claims claims = Jwts.claims().setSubject(u.getUsername());
		claims.put(JwtAuthenticationConstants.CLAIM_KEY_USERID, u.getId() + "");
		claims.put(JwtAuthenticationConstants.CLAIM_KEY_ROLE, u.getRole());
		return Jwts.builder().setClaims(claims).setExpiration(generateExpirationDate())
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}

	private static Date generateExpirationDate() {
		return new Date(System.currentTimeMillis() + JwtAuthenticationConstants.EXPIRATION * 1000);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		JwtUserDto user = new JwtUserDto();
//		user.setId(12345L);
//		user.setUsername("user3");
//		user.setRole("ROLE_EXECUTE_PRIVILEGE");
		getCurrentMilliseconds();
//		System.out.println(
//				"**************************************\n\n" + generateToken(user, JwtAuthenticationConstants.SECRET)
//						+ "\n\n**************************************");
	}
	
	public static void getCurrentMilliseconds(){
		System.out.println("seconds :: "+new Date(System.currentTimeMillis() + JwtAuthenticationConstants.EXPIRATION * 1000));
		
		
	}
}
