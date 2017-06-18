package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "Das boot!";
	}
	
}
