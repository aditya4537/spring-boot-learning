package com.example.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cars.model.CarsData;

@Repository
public interface CarsRepository extends JpaRepository<CarsData, Integer>{

}
