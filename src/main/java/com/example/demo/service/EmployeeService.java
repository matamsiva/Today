package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService 
{
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee e);
	public void saveOrUpdate(Employee e);
	public void deleteById(int id);
	
}
