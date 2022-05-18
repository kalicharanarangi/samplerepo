package com.skilllogic.sspringbootjpainitegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilllogic.sspringbootjpainitegration.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
     
}
