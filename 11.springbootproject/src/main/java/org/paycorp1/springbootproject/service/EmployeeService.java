package org.paycorp1.springbootproject.service;

import java.util.Optional;

import org.paycorp1.springbootproject.dao.EmployeeDao;
import org.paycorp1.springbootproject.dto.Employee;
import org.paycorp1.springbootproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Autowired
	EmployeeRepository repository;

	public Employee save(Employee employee) {
		System.out.println("record inserted");
		return dao.save(employee);
	}

	public Optional<Employee> fetch(int id) {
		return dao.fetch(id);
	}

	public Employee delete(int id) {
		dao.delete(id);	
		return null;
	}

	public Employee update(Employee employee, int id) {
		repository.findById(id).ifPresent(emp -> {
			emp.setName(employee.getName());
			emp.setDepartment(employee.getDepartment());
			emp.setSalary(employee.getSalary());
			repository.save(emp);
		});
		return employee;
//		Optional<Employee> stid = repository.findById(id);
//		if (stid.isPresent()) {
//			System.out.println("data not present");
//		}
//		return repository.save(stid);
	}
}










