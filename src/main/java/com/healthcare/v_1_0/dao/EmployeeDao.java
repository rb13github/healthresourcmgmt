package com.healthcare.v_1_0.dao;

import java.util.List;

import com.healthcare.v_1_0.entity.Employee.Employee;

public interface EmployeeDao {

	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	public void deleteEmployee(Employee emp);
}