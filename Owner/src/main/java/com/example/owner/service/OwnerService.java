package com.example.owner.service;

import com.example.owner.model.Owner;

import java.util.List;

public interface OwnerService {
    public List<Owner> getAllOwners();

    public Owner addOwner(Owner owner);

    public void deleteOwnerById(long id);
    
    public Owner updateOwner(Owner owner);

    public Owner addVehicleToOwner(long oid, long vid);
    
    public List<Owner> getOwnerByCity(String city);

    public List<Owner> getOwnerByAge(int age);
}
