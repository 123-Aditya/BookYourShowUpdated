package com.example.jsppractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jsppractice.model.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre,Integer> {

	
	Theatre findByTheatrename(String theatrename);
}
