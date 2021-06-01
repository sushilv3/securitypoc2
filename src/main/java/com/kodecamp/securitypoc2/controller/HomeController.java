package com.kodecamp.securitypoc2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String homePage() {
		
		return "welcome to hame page";
	}
}
