package com.springsecurity.SpringsecurityDemos.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResrce {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Wooho kanshi</h1>");
	}
	@GetMapping("/user")
	public String User() {
		return ("<h1>Wooho kanshi User</h1>");
	}
	@GetMapping("/admin")
	public String Admin() {
		return ("<h1>Wooho kanshi Admin</h1>");
	}
}
