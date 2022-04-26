package com.example.jsppractice.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.jsppractice.model.User;

public interface UsersRepository extends JpaRepository<User,Integer> {



}
