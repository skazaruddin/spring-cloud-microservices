package org.sdrc.bbbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;


@SpringBootApplication
public class StartupWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartupWebApplication.class, args);
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
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter
          = new CommonsRequestLoggingFilter();
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(false);
        filter.setAfterMessagePrefix("REQUEST DATA : ");
        return filter;
    }
	
}
