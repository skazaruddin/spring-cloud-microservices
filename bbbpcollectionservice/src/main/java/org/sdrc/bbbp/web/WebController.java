package org.sdrc.bbbp.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sdrc.bbbp.domain.UtIndicatorEn;
import org.sdrc.bbbp.service.RestExceptionHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class WebController {

	@Autowired
	RestTemplate restTemplate;

	 @Autowired
	 IndicatorRestTemplateClient indicatorRestTemplateClient;

	@Autowired
	RestExceptionHandlerService restExceptionHandlerService;

	@PreAuthorize("hasAuthority('NATIONAL:data_entry,edit')")
	@RequestMapping("/testTypeOne")
	@ResponseBody
	public String hello() {
		return "Hello, I am using (Role:Feature,Permission)";
	}

	@PreAuthorize("hasAuthority('NATIONAL:data_entry,edit')")
	@GetMapping("/indicators")
	@ResponseBody
	public List<UtIndicatorEn> findAllIndicators() {
		return indicatorRestTemplateClient.findAllIndicators();
	}

}



