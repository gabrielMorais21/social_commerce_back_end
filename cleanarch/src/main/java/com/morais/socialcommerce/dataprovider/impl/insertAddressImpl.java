package com.morais.socialcommerce.dataprovider.impl;

import com.morais.socialcommerce.core.dataprovider.InsertAddress;
import com.morais.socialcommerce.core.domain.Address;
import com.morais.socialcommerce.dataprovider.repository.AddressRepository;
import com.morais.socialcommerce.dataprovider.repository.mapper.AddressEntityMapper;
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
