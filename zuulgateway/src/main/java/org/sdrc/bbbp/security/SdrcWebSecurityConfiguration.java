package org.sdrc.bbbp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.savedrequest.NullRequestCache;


@Configuration
@Order(1)
@EnableWebSecurity
public class SdrcWebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private  UserAuthenticationProvider userAuthenticationProvider;

	@Autowired
	private void configureGlobal(AuthenticationManagerBuilder auth) {
		auth.authenticationProvider(userAuthenticationProvider);
	}
	
	
	/*
	 * To alter any configuration related to WEB-Application please update the configuration.
	 * This Authentication provider internally manages the authentication creation mechanism,
	 * using the UserRoleFeaturePermissionMapping tables. 
	 */
	 @Override
	 public void configure(HttpSecurity http) throws Exception {
	
		 http
			.httpBasic().and()
			.authorizeRequests()
				.antMatchers("/index.html", "/home.html", "/app.html", "/login.html", "/","/login", "/resources/**").permitAll()
				.anyRequest().authenticated()
				.and()
				 .requestCache()
		         .requestCache(new NullRequestCache()).and()
			.csrf()
				.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

	 }
	 
	 
	 	@Override
		public void configure(WebSecurity web) throws Exception {
			web.ignoring().antMatchers("/*.css");
			web.ignoring().antMatchers("/*.js");
			web.ignoring().antMatchers("/*.html");
		}

	 
}
