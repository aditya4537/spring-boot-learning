package com.example.countrystate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.countrystate.entity.State;

@Repository
public interface StateRepo extends JpaRepository<State, Integer> {

	@Query(value="SELECT c.country_name FROM country as c, state as s WHERE s.state_name=?1", nativeQuery = true)
	public List<Object> countryByState(String statename);
}
