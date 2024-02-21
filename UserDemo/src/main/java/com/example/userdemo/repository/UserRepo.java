package com.example.userdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userdemo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
