package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MobileData;

@Repository
public interface MobileRepository extends JpaRepository<MobileData, Integer>{
	
}