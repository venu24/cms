package com.cmsshopping.online;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {
	
	@GetMapping("/hello")
	public String home() {
		return "home";
	}

}
