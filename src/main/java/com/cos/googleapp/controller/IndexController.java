package com.cos.googleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.googleapp.config.SentrySupport;

@Controller
public class IndexController {

	@Autowired
	private SentrySupport sentrySupport;
	
	@GetMapping({"", "/"})
	public String index(){
		return "index";
	}
	
	@GetMapping("/product")
	public String product() {
		sentrySupport.logSimpleMessage("프로덕트 쪽 오류");
		return "product";
	}
	
	@GetMapping("/user")
	public String user() {
		sentrySupport.logSimpleMessage("유저 쪽 오류");
		return "user";
	}
}
