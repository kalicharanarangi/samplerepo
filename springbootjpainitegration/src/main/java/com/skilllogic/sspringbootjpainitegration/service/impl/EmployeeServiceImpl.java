package com.skilllogic.sspringbootjpainitegration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilllogic.sspringbootjpainitegration.entity.Employee;
import com.skilllogic.sspringbootjpainitegration.repository.EmployeeRepository;
import com.skilllogic.sspringbootjpainitegration.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public boolean saveEmployee(Employee employee) {
	   //call Repository to save data in DB
		boolean flag = false;
		Employee e= employeeRepository.save(employee);//it saves object data in DB
		int id = e.getId();//it returns id value from DB
		if(id>0) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	@Override
	public List<Employee> getAllEmployees() {
		 List<Employee> list =employeeRepository.findAll();//predefined method to get all employees from DB
		return list;
	}
}
