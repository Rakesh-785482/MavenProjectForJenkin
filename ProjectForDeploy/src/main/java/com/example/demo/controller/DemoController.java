package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo/v1")
public class DemoController {

	@GetMapping("/get")
	public String getForm() {
		System.out.println("Hii For Test....");
		return "welcome";
	}
}
