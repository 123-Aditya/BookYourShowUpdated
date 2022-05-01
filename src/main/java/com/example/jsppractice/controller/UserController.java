package com.example.jsppractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.jsppractice.model.Movie;
import com.example.jsppractice.model.Shows;
import com.example.jsppractice.model.Theatre;
import com.example.jsppractice.repository.MovieRepository;
import com.example.jsppractice.repository.ShowRepository;
import com.example.jsppractice.repository.TheatreRepository;

@Controller
public class UserController {
	
	 @Autowired
	 MovieRepository MovieRepository;
	 
	 @Autowired
	 TheatreRepository theatreRepository;
	 
	 @Autowired
	 ShowRepository showRepository;
	
	@RequestMapping(value="/user/theatre",method=RequestMethod.POST)
	public String theatreDetails(ModelMap model,@RequestParam String theatreName)
	{
		Theatre theatre = theatreRepository.findByTheatrename(theatreName);
		Integer theatreId = theatre.getTheatreid();
		List<Shows> shows = showRepository.findByTheaterId(theatreId);
		model.put("theatreName", theatreName);
		model.put("shows", shows);
		return "showUser";
	}
	
//	@RequestMapping(value="/user/movie",method=RequestMethod.GET)
//	public String movieDetails()
//	{
//		return "movieUser";
//	}
	
	@RequestMapping(value="/user/show",method=RequestMethod.GET)
	public String showDetails()
	{
		return "showDetailsAcrossTheatre";
	}

	 @GetMapping(value = "/allMovie")
	    public String getAllMovie(ModelMap model) {
	    	List<Movie> movies =  MovieRepository.findAll();
	    	model.put("movies",movies);
	        return "movieUser";
	    }

}
