package com.ihub.www.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihub.www.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>
{

	Optional<Employee> findById(Long id);

}
