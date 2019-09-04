package com.in28minutes.springboot.web.nbs03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.nbs03.service.LoginService;

@Controller
public class LoginController {
	
	//Injected Automatically
	@Autowired
	LoginService service;

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		//model.put("name", name);
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
		boolean isValidUser = service.validateUser(name, password);
		
		if(!isValidUser) {
			model.put("errorMessage", "Incorrect Username and Password");
			return "login";
		}
		else {
			model.put("name", name);
			model.put("password", password);
			return "home";
		}
	}
}