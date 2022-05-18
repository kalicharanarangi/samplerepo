package com.skilllogic.sspringbootjpainitegration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skilllogic.sspringbootjpainitegration.entity.Employee;
import com.skilllogic.sspringbootjpainitegration.reponse.CustomResponse;
import com.skilllogic.sspringbootjpainitegration.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public CustomResponse saveEmployee(@RequestBody Employee employee) {
		boolean flag = employeeService.saveEmployee(employee);
		CustomResponse response =new CustomResponse();
		if(flag) {
			response.setStatus("Success");
			response.setMessage("Employee Saved Successfully");
		}
		return response;
	}
	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees(){
		List<Employee> list = employeeService.getAllEmployees();
		return list;
	}
}
