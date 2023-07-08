package com.assignment.employeeAddress.controller;

import com.assignment.employeeAddress.model.Address;
import com.assignment.employeeAddress.repository.AddressRepo;
import com.assignment.employeeAddress.service.AddresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddresService addresService;

   // GET /addresses - get all addresses
    @GetMapping("Address")
    public Iterable<Address> getAllAddress(){
        return addresService.getAllAddress();
    }

   // GET /addresses/{id} - get an address by id
   @GetMapping("Address/id/{id}")
   public Optional<Address> getByAddressId(@PathVariable Long id){
       return addresService.getByAddressId(id);
   }

   // POST /addresses - create a new address
    @PostMapping("Address/add")
    public String addAddress(@RequestBody Address address){
        return addresService.addAddress(address);
    }

    // PUT /addresses/{id} - update an address by id
    @PutMapping("Address/update/{id}/state/{state}")
    public String  updateAddress(@PathVariable Long id, @PathVariable String state){
        return addresService.updateAddress(id,state);
    }

    // DELETE /addresses/{id} - delete an address by id
    @DeleteMapping("address/delete/{id}")
    public String removeRoom(@PathVariable Long id){
        return addresService.removeRoom(id);
    }

}
