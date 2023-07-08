package com.assignment.employeeAddress.repository;

import com.assignment.employeeAddress.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Long> {
}
