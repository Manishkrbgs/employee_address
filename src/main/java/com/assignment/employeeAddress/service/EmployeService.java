package com.assignment.employeeAddress.service;

import com.assignment.employeeAddress.model.Address;
import com.assignment.employeeAddress.model.Employee;
import com.assignment.employeeAddress.repository.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeService {
    @Autowired
    EmployeRepo employeRepo;

    public Iterable<Employee> getAllEmploye() {
        return employeRepo.findAll();
    }

    public Optional<Employee> getById(Long id) {
        return employeRepo.findById(id);
    }

    public String addEmploye(Employee employee) {
        employeRepo.save(employee);
        return "Add successfully !!";
    }

    public String updateAddress(Long id, Address address) {
        Optional<Employee> employee=employeRepo.findById(id);
        Employee employee1= null;
        if(employee.isPresent()){
            employee1=employee.get();
        }else{
            return "Id not found "+id;
        }
        employee1.setAddress(address);
        employeRepo.save(employee1);
        return "Update successful !!";

    }

    public String deleyeById(Long id) {
        employeRepo.deleteById(id);
        return "Deleted successful !!";
    }
}
