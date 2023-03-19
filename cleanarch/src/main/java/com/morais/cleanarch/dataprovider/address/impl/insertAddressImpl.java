package com.morais.cleanarch.dataprovider.address.impl;

import com.morais.cleanarch.core.dataprovider.address.InsertAddress;
import com.morais.cleanarch.core.domain.Address;
import com.morais.cleanarch.dataprovider.address.repository.AddressRepository;
import com.morais.cleanarch.dataprovider.address.repository.mapper.AddressEntityMapper;
import com.morais.cleanarch.dataprovider.customer.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class insertAddressImpl  implements InsertAddress {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressEntityMapper addressEntityMapper;
    @Override
    public void insert(Address address) {

    }
}
