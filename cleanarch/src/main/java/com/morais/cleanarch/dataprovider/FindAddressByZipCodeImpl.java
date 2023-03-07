package com.morais.cleanarch.dataprovider;

import com.morais.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.morais.cleanarch.core.domain.Address;
import com.morais.cleanarch.dataprovider.client.FindAddressByZipCodeCodeClient;
import com.morais.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import com.morais.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeCodeClient findAddressByZipCodeCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
