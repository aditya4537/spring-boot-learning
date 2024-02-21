package com.example.productcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productcustomer.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
    
}
