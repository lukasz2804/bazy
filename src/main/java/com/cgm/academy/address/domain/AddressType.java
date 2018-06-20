package com.cgm.academy.address.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddressType {
//    REGISTERED(1, "Registered"),
//    TEMPORARY(2, "Temporary"),
//    WORK(3, "Work");


    private int id;
    private String name;

}
