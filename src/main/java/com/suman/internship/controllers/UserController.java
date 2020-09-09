package com.suman.internship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.suman.internship.models.User;
import com.suman.internship.services.UserService;

@Controller
public class UserController {
	
	
	@GetMapping("/user")
	public String goToCountry() {
		return "user";
	}
	
	
	
}
