package com.openDJ.config;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.openDJ.config.security.JwtAuthenticationEntryPoint;
import com.openDJ.config.security.JwtAuthenticationProvider;
import com.openDJ.config.security.JwtAuthenticationSuccessHandler;
import com.openDJ.config.security.JwtAuthenticationTokenFilter;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(-1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private JwtAuthenticationEntryPoint unauthorizedHandler;
	@Autowired
	private JwtAuthenticationProvider authenticationProvider;
	@Autowired
	private JwtAuthenticationSuccessHandler successHandler;
	
	private static final Logger log = Logger.getLogger(WebSecurityConfig.class.getName());
	
	@Bean
	public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
		JwtAuthenticationTokenFilter authenticationTokenFilter = new JwtAuthenticationTokenFilter();
		authenticationTokenFilter.setAuthenticationManager(this.authenticationManagerBean());
		authenticationTokenFilter.setAuthenticationSuccessHandler(successHandler);
		return authenticationTokenFilter;
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider);
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity
				// we don't need CSRF because our token is invulnerable
				.csrf().disable()
			
				.exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
//				.addFilter(authenticationTokenFilterBean())
				// don't create session
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.addFilterAfter(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class)
				
				.authorizeRequests()
//				 .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()

				// allow anonymous resource requests
//				.antMatchers(HttpMethod.OPTIONS).permitAll()
				.antMatchers(HttpMethod.GET, "/", "/*.jsp", "/favicon.ico", "/**/*.jsp","/**/*.html", "/**/*.css","/**/*.eot","/**/*.svg","/**/*.ttf","/**/*.woff","/**/*.woff2", "/**/*.gif", "/**/*.png", "/**/*.js")
				.permitAll().antMatchers("/user/login", "/admin/user/list", "/admin/user/list/**").permitAll().anyRequest().authenticated();

		// Custom JWT based security filter
		httpSecurity.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
		// disable page caching
		httpSecurity.headers().cacheControl();
	}
	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.WebSecurity)
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
	}
}