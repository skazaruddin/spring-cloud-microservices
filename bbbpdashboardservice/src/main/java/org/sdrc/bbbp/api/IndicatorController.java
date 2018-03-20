package org.sdrc.bbbp.api;

import java.util.List;

import org.sdrc.bbbp.domain.UtIndicatorEn;
import org.sdrc.bbbp.repository.UtIndicatorEnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class IndicatorController {

	@Autowired
	UtIndicatorEnRepository  utIndicatorEnRepository;

	@ResponseBody
	@GetMapping("/indicators")
	public List<UtIndicatorEn> findAll(){
		return utIndicatorEnRepository.findAll();
	}
	
	@PostMapping("/sayHello")
	@ResponseBody
	public String hello(@RequestParam String name) {
		return "Hello, "+name;
	}
	
}
