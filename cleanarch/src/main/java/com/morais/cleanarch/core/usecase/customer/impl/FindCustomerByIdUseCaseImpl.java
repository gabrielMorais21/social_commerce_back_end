package com.morais.cleanarch.core.usecase.customer.impl;

import com.morais.cleanarch.core.dataprovider.customer.FindCustomerById;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.usecase.customer.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id).orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}
