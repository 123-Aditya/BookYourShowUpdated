package com.example.jsppractice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsppractice.model.Shows;
import com.example.jsppractice.repository.ShowRepository;

@RestController
public class ShowsResource {

    @Autowired
    ShowRepository showsRepository;

    @GetMapping(value = "/allshows")
    public List<Shows> getAll() {
    	//showsRepository.
        return showsRepository.findAll();
    }

    @PostMapping(value = "/insertshow")
    public List<Shows> persist( final Shows shows) {
        showsRepository.save(shows);
        return showsRepository.findAll();
    }

}