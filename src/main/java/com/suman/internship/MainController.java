package com.suman.internship;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/index")
	public String goToHome() {
		return "index";
	}
	
	@GetMapping("/login")
	public String goToLogin() {
		return "login";
	}
	
	
	@GetMapping("/logout")
	public String goToLogout() {
		return "login";
	}
	
	@GetMapping("/register")
	public String goToRegister() {
		return "register";
	}
	
}
