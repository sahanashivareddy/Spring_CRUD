package org.paycorp1.springbootproject.controller;

import java.util.Optional;

import org.paycorp1.springbootproject.dto.Employee;
import org.paycorp1.springbootproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/saveemployees")
	public Employee save(@Valid @RequestBody Employee employee) {
		return service.save(employee);
	}

	@GetMapping("/employees/{id}")
	public Optional<Employee> fetch(@PathVariable int id) {
		return service.fetch(id);
	}
	
    @PutMapping("/updateemployees/{id}")
    public Employee update(@RequestBody Employee employee, @PathVariable int id)
    {
    	return service.update(employee,id);
    }
	
	@DeleteMapping("/deleteemployees/{id}")
	public Employee delete(@PathVariable int id)
	{
		return service.delete(id);	
	}
	
}