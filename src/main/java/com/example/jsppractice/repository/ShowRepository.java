package com.example.jsppractice.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jsppractice.model.Shows;

public interface ShowRepository extends JpaRepository<Shows,Integer>{
	
	List<Shows> findByTheaterId(Integer theatreId);
	
}