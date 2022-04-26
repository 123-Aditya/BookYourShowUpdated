package com.example.jsppractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value="/user/theatre",method=RequestMethod.GET)
	public String theatreDetails()
	{
		return "theatreUser";
	}
	
	@RequestMapping(value="/user/movie",method=RequestMethod.GET)
	public String movieDetails()
	{
		return "movieUser";
	}
	
	@RequestMapping(value="/user/show",method=RequestMethod.GET)
	public String showDetails()
	{
		return "showUser";
	}

}
