package com.cgm.academy.address.repository;


import com.cgm.academy.address.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
