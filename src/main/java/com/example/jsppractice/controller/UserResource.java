package com.example.jsppractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.jsppractice.model.User;
import com.example.jsppractice.repository.UsersRepository;

@RestController
public class UserResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/allUsers")
    public List<User> getAllUser() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/loadUsers")
    public List<User> persist(final User user) {
        usersRepository.save(user);
        return usersRepository.findAll();
    }
    

}
