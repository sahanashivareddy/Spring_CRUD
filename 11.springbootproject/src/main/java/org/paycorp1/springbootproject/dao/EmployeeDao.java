package org.paycorp1.springbootproject.dao;

import java.util.Optional;

import org.paycorp1.springbootproject.dto.Employee;
import org.paycorp1.springbootproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository repository;

	public Employee save(@RequestBody Employee employee) {
		return repository.save(employee);	
	}

	public Optional<Employee> fetch(int id) {
		return repository.findById(id);
	}

	public void delete(int id) {
		 repository.deleteById(id);
	}
}
