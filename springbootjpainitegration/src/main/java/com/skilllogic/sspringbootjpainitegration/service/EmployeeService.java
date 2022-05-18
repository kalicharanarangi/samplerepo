package com.skilllogic.sspringbootjpainitegration.service;

import java.util.List;

import com.skilllogic.sspringbootjpainitegration.entity.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee);
	public List<Employee> getAllEmployees();
}
