package com.application.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.EmployeeManagementSystem.model.Employee;
import com.application.EmployeeManagementSystem.service.EmployeeService;

@RestController
@CrossOrigin(allowedHeaders = "*",origins="*")
@RequestMapping("/api/v1")
public class AppController {
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/employee")
	public @ResponseBody List<Employee> getAllEmployeeList(){
		List<Employee> employees = employeeService.getAllEmployees();
		return employees;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/employee/{id}")
	public @ResponseBody Employee getEmployeeById(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
	}
	
	/**
	 * 
	 * @param sortedBy
	 * @return
	 */
	@GetMapping("/employee/sortBy/{sortBy}")
	public @ResponseBody List<Employee> getAllEmployeesSorted(@PathVariable("sortBy") String sortBy){
		List<Employee> employees = employeeService.getEmployeesSorted(sortBy);
		return employees;
	}

}
