package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
	public Employee add(Employee employee);
	public Employee update(Employee employee, Integer id);
	public Employee getById(Integer id);
	public Employee delete(Integer id);
	
}
