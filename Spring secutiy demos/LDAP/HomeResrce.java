package com.springsecurity.SpringsecurityDemos.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResrce {
	
	@GetMapping("/")
	public String home() {
		return "Home page";
	}
	
}
