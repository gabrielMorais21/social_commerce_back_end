package com.morais.cleanarch.core.dataprovider;


import com.morais.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
