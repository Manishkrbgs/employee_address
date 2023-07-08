package com.assignment.employeeAddress.controller;

import com.assignment.employeeAddress.model.Address;
import com.assignment.employeeAddress.model.Employee;
import com.assignment.employeeAddress.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeController {

    @Autowired
    EmployeService employeService;

    @GetMapping("employees")
    public Iterable<Employee> getAllEmploye(){
        return employeService.getAllEmploye();
    }
    @GetMapping("employees/id/{id}")
    public Optional<Employee> getById(@PathVariable Long id){
        return employeService.getById(id);
    }

    @PostMapping("employee/add")
    public String addEmploye(@RequestBody Employee employee){
        return  employeService.addEmploye(employee);
    }
    @PutMapping("employee/update/{id}/address/{address}")
    public String updateAddress(@PathVariable Long id,@PathVariable Address address){
        return employeService.updateAddress(id, address);
    }

    @DeleteMapping("employee/delete/{id}")
    public String deleteById(@PathVariable Long id){
        return employeService.deleyeById(id);
    }
}
