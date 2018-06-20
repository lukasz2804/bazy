package com.cgm.academy.address;

import com.cgm.academy.address.domain.Address;
import com.cgm.academy.address.repository.AddressRepository;
import com.cgm.academy.address.service.AddressService;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

@SpringBootTest
@ImportResource("classpath:test-config.xml")
public class AddressTest {

    @Test
    public void shouldFindAllAddresses(){
        AddressRepository addressRepository = mock(AddressRepository.class);
        Mockito.when(addressRepository.findAll()).thenReturn(Lists.newArrayList(Address.getRandomAddress()));

        List<Address> addresses = (List<Address>) addressRepository.findAll();
        Assert.assertTrue(addresses.size() == 1);
    }
}
