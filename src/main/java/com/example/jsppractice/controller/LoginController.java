package com.example.jsppractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/loginUser",method=RequestMethod.GET)
	public String loginUser()
	{
		return "loginUser";
	}
	
	@RequestMapping(value="/loginAdmin",method=RequestMethod.GET)
	public String loginAdmin()
	{
		return "loginAdmin";
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.GET)
	public String registerUser()
	{
		return "registerUser";
	}
//	@RequestMapping(value="/showinput",method=RequestMethod.GET)
//	public String showInput()
//	{
//		return "showinput";
//	}

	
	@RequestMapping(value="/loginAdmin",method=RequestMethod.POST)
	public String loginAdmin(ModelMap model, @RequestParam String inputId, @RequestParam String password)
	{
		if(inputId.equals("admin") && password.equals("root"))
		{
			model.put("inputId", inputId);
			return "welcomeAdmin";
		}
		else {
		model.put("errorMsg", "Please provide correct Username and Password ! ");
		}
		return "loginAdmin";
	}
	
	@RequestMapping(value="/loginUser",method=RequestMethod.POST)
	public String loginUser(ModelMap model, @RequestParam String inputId, @RequestParam String password)
	{
		if(inputId.equals("user") && password.equals("123"))
		{
			model.put("userId", inputId);
			return "welcomeUser";
			
		}
		else {
		model.put("errorMsg", "Please provide correct Username and Password ! ");
		}
		return "loginUser";
	}
	
	
}
