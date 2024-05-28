package org.paycorp1.springbootproject.repository;

import java.util.Optional;

import org.paycorp1.springbootproject.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee save(Optional<Employee> emp);

}
