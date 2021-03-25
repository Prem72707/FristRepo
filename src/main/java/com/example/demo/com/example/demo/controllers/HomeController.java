package com.example.demo.com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/prem")
	@ResponseBody
	public String printHello() {
		
		return "Hello World Prem";
		
	}

}
