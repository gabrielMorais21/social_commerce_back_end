package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.InsertAddress;
import com.morais.socialcommerce.core.domain.Address;
import com.morais.socialcommerce.core.usecase.InsertAddressUseCase;

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
