package com.example.jsppractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jsppractice.model.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {



}