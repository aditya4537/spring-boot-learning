package com.example.authusingdatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.authusingdatabase.config.CustomUser;
import com.example.authusingdatabase.entity.Employee;
import com.example.authusingdatabase.repository.EmpRepo;


@Component
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private EmpRepo empRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Employee byEmail = empRepo.findByEmail(email);
		
		if(byEmail == null) {
			throw new UsernameNotFoundException("user name not found");
		}
		else {
			return new CustomUser(byEmail);
		}
	}

}
