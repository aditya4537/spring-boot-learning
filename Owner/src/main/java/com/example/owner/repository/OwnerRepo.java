package com.example.owner.repository;

import com.example.owner.model.Owner;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner, Long> {
	
	
	//Native Query
	@Query(value = "SELECT * FROM owner o where o.owner_city=?1", nativeQuery = true)
	public List<Owner> getOwnerByCity(String city);

	
	//JPQL
	@Query("SELECT o FROM owner o where o.ownerAge=?1")
	public List<Owner> getOwnerByAge(int age);
	
}
