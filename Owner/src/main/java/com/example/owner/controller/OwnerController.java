package com.example.owner.controller;

import com.example.owner.model.Owner;
import com.example.owner.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/getAll")
    public List<Owner> getOwners(){
        return ownerService.getAllOwners();
    }

    @PostMapping("/add")
    public Owner saveOwner(@RequestBody Owner owner){
        return ownerService.addOwner(owner);
    }

    @PutMapping("/assign")
    public Owner assignVehicle(@RequestParam("oid") long oid, @RequestParam("vid") long vid){
        return ownerService.addVehicleToOwner(oid, vid);
    }
    
    @GetMapping("/city")
    public List<Owner> getByCity(@RequestParam("city") String city){
    	return ownerService.getOwnerByCity(city);
    }
    
    @GetMapping("/age")
    public List<Owner> getByAge(@RequestParam("age") int age){
    	return ownerService.getOwnerByAge(age);
    }
    
    @PutMapping("/edit")
    public Owner editOwner(@RequestBody Owner owner) {
    	return ownerService.updateOwner(owner);
    }
}
