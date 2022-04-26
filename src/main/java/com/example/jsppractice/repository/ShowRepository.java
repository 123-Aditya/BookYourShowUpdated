package com.example.jsppractice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jsppractice.model.Shows;

public interface ShowRepository extends JpaRepository<Shows,Integer>{
	
}