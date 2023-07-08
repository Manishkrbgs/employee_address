package com.assignment.employeeAddress.service;

import com.assignment.employeeAddress.model.Address;
import com.assignment.employeeAddress.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddresService {
    @Autowired
    AddressRepo addressRepo;

    public Iterable<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Optional<Address> getByAddressId(Long id) {
        return addressRepo.findById(id);
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Added address !!";
    }

    public String updateAddress(Long id, String state) {
        Optional<Address> address=addressRepo.findById(id);
        Address address1=null;
        if(address.isPresent()){
            address1=address.get();
        }else {
            return "Id not found";
        }
        address1.setState(state);
        addressRepo.save(address1);
        return "Update successful !!";
    }

    public String removeRoom(Long id) {
        addressRepo.deleteById(id);
        return "Address Deleted !!";
    }
}
