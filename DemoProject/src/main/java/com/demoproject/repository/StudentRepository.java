package com.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoproject.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}
