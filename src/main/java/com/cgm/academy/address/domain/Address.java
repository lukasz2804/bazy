package com.cgm.academy.address.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.LocalDate;

@ToString
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street;
    private LocalDate stopDate;
    private LocalDate startDate;
    private long id;
    private String email;
    private String country;
    private String phoneNumber;
    private String city;
    private String flatNo;
    private String homeNo;
    private AddressType addressType;
    private String postalCode;

    public static Address getRandomAddress(){
        return new Address();
    }
}
