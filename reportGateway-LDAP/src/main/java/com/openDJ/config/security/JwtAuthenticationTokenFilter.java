package com.openDJ.config.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import com.openDJ.config.security.model.JwtAuthenticationToken;
import com.openDJ.config.security.util.JwtAuthenticationConstants;
import com.openDJ.converter.FaultConverter;
import com.openDJ.util.Constant;
import com.openDJ.util.FaultEnum;

import io.jsonwebtoken.ExpiredJwtException;

//@Component
public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {


	// private AuthenticationManager authenticationManager;
	//
	// private AuthenticationSuccessHandler successHandler;

	public JwtAuthenticationTokenFilter() {
		super("/services/**");
	}

	/**
	 * Attempt to authenticate request - basically just pass over to another
	 * method to authenticate request headers
	 * 
	 * @throws IOException
	 */
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			String header = request.getHeader(JwtAuthenticationConstants.TOKEN_HEADER);
			if (header == null || !header.startsWith(JwtAuthenticationConstants.TOKEN_PREFIX + " ")) {
				JSONObject json = FaultConverter.convertToJson(FaultEnum.TOKEN_MISSING);
				response.setContentType(Constant.JSON_CONTENT_TYPE);
				response.getWriter().print(json);
				return null;
			}
			String authToken = header.substring(7);
			JwtAuthenticationToken authRequest = new JwtAuthenticationToken(authToken);
			Authentication authenticationObject = getAuthenticationManager().authenticate(authRequest);
			// set userData to securiy context for controller usage
			if (authenticationObject != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						authenticationObject, null, authenticationObject.getAuthorities());
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authentication);

			}
			return authenticationObject;
		} catch (ExpiredJwtException e) {
			JSONObject json = FaultConverter.convertToJson(FaultEnum.TOKEN_EXPIRED);
			response.setContentType(Constant.JSON_CONTENT_TYPE);
			response.getWriter().print(json);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			JSONObject json = FaultConverter.convertToJson(FaultEnum.SYSTEM_ERROR);
			response.setContentType(Constant.JSON_CONTENT_TYPE);
			response.getWriter().print(json);
			return null;
		}
	}

	/**
	 * Make sure the rest of the filterchain is satisfied
	 *
	 * @param request
	 * @param response
	 * @param chain
	 * @param authResult
	 * @throws IOException
	 * @throws ServletException
	 */
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {

		// ((AuthenticatedUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).toString());
		super.successfulAuthentication(request, response, chain, authResult);

		// As this authentication is in HTTP header, after success we need to
		// continue the request normally
		// and return the response as if the resource was not secured at all
		chain.doFilter(request, response);
	}
}