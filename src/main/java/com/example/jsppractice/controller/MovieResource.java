package com.example.jsppractice.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.jsppractice.model.Movie;
import com.example.jsppractice.repository.MovieRepository;

@RestController
@RequestMapping(value="/rest/Movie")
public class MovieResource {

    @Autowired
    MovieRepository MovieRepository;

    @GetMapping(value = "/allMovie")
    public String getAllMovie(ModelMap model) {
    	List<Movie> movies =  MovieRepository.findAll();
    	model.put("movies",movies);
        return "movieUser";
    }

    @PostMapping(value = "/load")
    public List<Movie> persist( final Movie Movie) {
        MovieRepository.save(Movie);
        return MovieRepository.findAll();
    }
    

}
