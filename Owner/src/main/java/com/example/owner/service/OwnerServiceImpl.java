package com.example.owner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.owner.model.Owner;
import com.example.owner.model.Vehicle;
import com.example.owner.repository.OwnerRepo;
import com.example.owner.repository.VehicleRepo;

@Service
public class OwnerServiceImpl implements OwnerService{

    @Autowired
    private OwnerRepo ownerRepo;

    @Autowired
    private VehicleRepo vehicleRepo;
    
	@Override
	public List<Owner> getOwnerByCity(String city) {
		
		return ownerRepo.getOwnerByCity(city);
	}
	
	

	@Override
	public List<Owner> getOwnerByAge(int age) {
		return ownerRepo.getOwnerByAge(age);
	}
    @Override
    public List<Owner> getAllOwners() {
    	return ownerRepo.findAll();
    }

    @Override
    public Owner addOwner(Owner owner) {
        return ownerRepo.save(owner);
    }

    @Override
    public void deleteOwnerById(long id) {
        ownerRepo.deleteById(id);
    }

	@Override
	public Owner updateOwner(Owner owner){
		if(owner != null) {
			return ownerRepo.save(owner);
		}
			return null;
		
	}

    @Override
    public Owner addVehicleToOwner(long oid, long vid) {
        Owner owner = ownerRepo.findById(oid).get();
        Vehicle vehicle = vehicleRepo.findById(vid).get();
        owner.setVehicle(vehicle);
        return ownerRepo.save(owner);

//        Owner owner = ownerRepo.findById(oid).get();
//        Vehicle vehicle = new Vehicle();
//
//        vehicle.setVehicleId(vid);
//        owner.setVehicle(vehicle);
//        vehicle.setOwner(owner);
//        return ownerRepo.save(owner);

    }


}
