package com.assignment.employeeAddress.repository;

import com.assignment.employeeAddress.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepo extends CrudRepository<Employee,Long> {
}
