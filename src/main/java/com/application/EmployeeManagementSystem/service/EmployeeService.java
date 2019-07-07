package com.application.EmployeeManagementSystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.application.EmployeeManagementSystem.model.Employee;
import com.application.EmployeeManagementSystem.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	/**
	 * 
	 * @return
	 */
	@Transactional
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Transactional
	public Employee getEmployeeById(Long id) {
		return repository.findById(id).orElse(null);
	}

	/**
	 * 
	 * @param sortedBy
	 * @return
	 */
	@Transactional
	public List<Employee> getEmployeesSorted(String sortedBy) {
		return repository.findAll(sortBy(sortedBy));
	}

	/**
	 * 
	 * @param sortBy
	 * @return
	 */
	private Sort sortBy(String sortBy) {
		return new Sort(Sort.DEFAULT_DIRECTION.ASC,sortBy);	
	}
	

}
