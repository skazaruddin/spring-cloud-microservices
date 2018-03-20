package org.sdrc.bbbp;

import javax.servlet.http.HttpSession;

import org.sdrc.bbbp.domain.UserModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
@EnableZuulProxy
@Controller
// @EnableJdbcHttpSession
// @EnableRedisHttpSession
@EnableTransactionManagement
@EnableCaching
@EnableAsync
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableRedisHttpSession
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

//	@Bean
//	public PreFilter preFilter() {
//		return new PreFilter();
//	}
//
//	@Bean
//	public PostFilter postFilter() {
//		return new PostFilter();
//	}
//
//	@Bean
//	public ErrorFilter errorFilter() {
//		return new ErrorFilter();
//	}
//
//	@Bean
//	public RouteFilter routeFilter() {
//		return new RouteFilter();
//	}

	@GetMapping(value = "/{path:[^\\.]*}")
	public String redirect() {
		return "forward:/";
	}

	@RequestMapping("/user")
	@ResponseBody
	public UserModel user() {
		return (UserModel) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@Bean
	public MessageDigestPasswordEncoder passwordEncoder() {
		return new MessageDigestPasswordEncoder("SHA1");
	}

	
}
