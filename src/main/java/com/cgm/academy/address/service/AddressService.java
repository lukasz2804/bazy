package com.cgm.academy.address.service;

import com.cgm.academy.address.domain.Address;
import com.cgm.academy.address.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddressService {
    private AddressRepository addressRepository;

    public void setAddressRepository(AddressRepository addressRepository) { this.addressRepository=addressRepository; }

    public void save(Address address){
        addressRepository.save(address);
    }
}
