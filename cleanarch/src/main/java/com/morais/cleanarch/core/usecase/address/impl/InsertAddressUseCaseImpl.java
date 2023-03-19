package com.morais.cleanarch.core.usecase.address.impl;

import com.morais.cleanarch.core.dataprovider.address.InsertAddress;
import com.morais.cleanarch.core.domain.Address;
import com.morais.cleanarch.core.usecase.address.InsertAddressUseCase;

public class InsertAddressUseCaseImpl implements InsertAddressUseCase {

    private  final InsertAddress insertAddress;

    public InsertAddressUseCaseImpl(InsertAddress insertAddress) {
        this.insertAddress = insertAddress;
    }

    @Override
    public void insert(Address address) {
        insertAddress.insert(address);
    }
}
