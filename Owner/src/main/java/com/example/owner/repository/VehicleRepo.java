package com.example.owner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.owner.model.Owner;
import com.example.owner.model.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

//	@Query("SELECT v FROM Vehicle v, Owner o WHERE v.vehicleId = o.vehicleId and  = ?1")
	public List<Vehicle> getVehicleByOwner(Owner ownerName);
}
