package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public List<Employee> getAll() {
		
		return dao.findAll();
	}

	@Override
	public Employee add(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee update(Employee employee, Integer id) {
		Employee old = dao.getById(id);
		old.setEmail(employee.getEmail());
		old.setLocation(employee.getLocation());
		old.setName(employee.getName());

		return dao.save(old);
	}

	@Override
	public Employee getById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Employee delete(Integer id) {
		Employee obj = null;
		Employee employee = dao.findById(id).get();
		obj = employee;
		dao.delete(employee);
		return obj;
	}

	

}
