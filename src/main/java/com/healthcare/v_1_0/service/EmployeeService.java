package com.healthcare.v_1_0.service;

import java.util.List;

import com.healthcare.v_1_0.entity.Employee.Employee;

public interface EmployeeService {
	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	void deleteEmployee(Employee emp);
	
}