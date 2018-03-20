package org.sdrc.bbbp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.savedrequest.NullRequestCache;


@Configuration
@EnableWebSecurity
public class SdrcWebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	 @Autowired
	 public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        //try in memory auth with no users to support the case that this will allow for users that are logged in to go anywhere
	        auth.inMemoryAuthentication();
	 }

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	 http
				.httpBasic().and()
				.authorizeRequests()
					.antMatchers("/api").permitAll()
				      .antMatchers("/api/*").
					authenticated()
					.and()
//					 .requestCache()
//			         .requestCache(new NullRequestCache()).and()
				.csrf()
					.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	    }
}
