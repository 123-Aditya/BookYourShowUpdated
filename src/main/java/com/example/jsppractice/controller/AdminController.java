package com.example.jsppractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@RequestMapping(value="/admin/theatre",method=RequestMethod.GET)
	public String theatreDetails()
	{
		return "theatreAdmin";
	}
	
	@RequestMapping(value="/admin/movie",method=RequestMethod.GET)
	public String movieDetails()
	{
		return "movieAdmin";
	}
	
	@RequestMapping(value="/admin/show",method=RequestMethod.GET)
	public String showDetails()
	{
		return "showinput";
	}

}
