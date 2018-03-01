package com.sundeinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundeinfo.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userservice;
    
	@RequestMapping(value="/")
	public String doHomePage() {
		userservice.doSomething();
		return "index";
	}
	
}
