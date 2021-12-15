package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class indexContoller {
	
	@GetMapping("/")
	public String main() {
		
		
		return "index";
	}
	

}
