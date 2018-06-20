package com.cgm.academy.address.controller;

import com.cgm.academy.address.domain.Address;
import com.cgm.academy.address.service.AddressService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AddressController {
    private AddressService addressService;


    public void saveAddress(Address address){
        addressService.save(address);
    }
}
