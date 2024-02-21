package com.example.countrystate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.countrystate.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer>{

	public Country getByCountryName(String name);
}
