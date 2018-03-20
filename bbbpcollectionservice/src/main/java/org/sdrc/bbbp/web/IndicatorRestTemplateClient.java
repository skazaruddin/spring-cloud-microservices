package org.sdrc.bbbp.web;

import java.util.List;

import org.sdrc.bbbp.domain.UtIndicatorEn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class IndicatorRestTemplateClient {

	@Autowired
	RestTemplate restTemplate;


	
	public List<UtIndicatorEn> findAllIndicators() {
	
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Cookie", attr.getRequest().getHeader("Cookie"));
		
		ResponseEntity<List<UtIndicatorEn>> restExchange = restTemplate.exchange(
				"http://bbbpdashboardservice/api/indicators", HttpMethod.GET, new HttpEntity<Void>(requestHeaders),
				new ParameterizedTypeReference<List<UtIndicatorEn>>() {
				});
		return restExchange.getBody();
	}
	
}
