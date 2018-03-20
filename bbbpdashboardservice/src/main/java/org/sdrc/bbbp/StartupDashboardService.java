package org.sdrc.bbbp;

import javax.servlet.Filter;

import org.apache.catalina.filters.RequestDumperFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.CommonsRequestLoggingFilter;


@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableEurekaClient
//@EnableRedisHttpSession
public class StartupDashboardService {

	public static void main(String[] args) {
		SpringApplication.run(StartupDashboardService.class, args);
	}

	/**
	 * Create a CacheManager implementation class to be used by Spring where <code>@Cacheable</code> annotations are
	 * applied.
	 * 
	 * @return A CacheManager instance.
	 */
	/*@Bean
	public CacheManager cacheManager() {
		GuavaCacheManager cacheManager = new GuavaCacheManager("activateCaching");
		return cacheManager;
	}*/
	
	
	

	
	@Bean
	public MessageDigestPasswordEncoder passwordEncoder() {
		return new MessageDigestPasswordEncoder("SHA1");
	}
	
	
	@Bean
	public FilterRegistrationBean requestDumperFilter() {
	    FilterRegistrationBean registration = new FilterRegistrationBean();
	    Filter requestDumperFilter = new RequestDumperFilter();
	    registration.setFilter(requestDumperFilter);
	    registration.addUrlPatterns("/*");
	    return registration;
	}

}
