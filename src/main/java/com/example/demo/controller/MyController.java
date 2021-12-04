package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/emp")
	public List<Employee> getAllEmployee() { 
		return service.getAll();
	}
	
	@PostMapping("/emp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.add(employee);
	}
	
	@PutMapping("/emp/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		return service.update(employee, Integer.valueOf(id));
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmployeeById(@PathVariable String id) {
		return service.getById(Integer.valueOf(id));
	}
	
	@DeleteMapping("/emp/{id}")
	public Employee deleteEmployeeById(@PathVariable String id) {
		return service.delete(Integer.valueOf(id));
	}
	
	
}
