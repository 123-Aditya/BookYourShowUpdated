package com.example.jsppractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsppractice.model.Theatre;
import com.example.jsppractice.repository.TheatreRepository;

@RestController
public class TheatreController {

	@Autowired
	TheatreRepository theatreRepository;
	
	@GetMapping(value = "/getAllTheatre")
	public List<Theatre> getallTheatre() {
		return theatreRepository.findAll();
	}
	
	@PostMapping(value = "/saveTheatre")
	public List<Theatre> persist( final Theatre theatre) {
		theatreRepository.save(theatre);
		return theatreRepository.findAll();
	}
}
