package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Employee employee = null;
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional!=null) {
			employee = optional.get();
		}else{
			throw new RuntimeException("Id value is not present !!!");
		}
		return employee;		
	}

	@Override
	public void removeEmployeeById(long id) {
			employeeRepository.deleteById(id);
	}

}
