package com.telkomsel.nbs01.nbs01.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Nbs01ApplicationController {
	
	String app = "<!DOCTYPE HTML>\n" + 
			"<html xmlns:th=\"http://www.thymeleaf.org\">\n" + 
			"<head>\n" + 
			"    <title>Getting Started: Serving Web Content</title>\n" + 
			"\n" + 
			"</head>\n" + 
			"<body>\n" + 
			"Hello and Welcome to our Web Application\n" + 
			"</body>\n" + 
			"</html>";

    @RequestMapping("/home")
    public String home() {
    	return app;
    }
 
}
