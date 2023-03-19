package com.morais.cleanarch.core.usecase.customer.impl;

import com.morais.cleanarch.core.dataprovider.customer.FindCustomerByEmail;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.usecase.customer.FindCustomerByEmailUseCase;

public class FindCustomerByEmailUseCaseImpl implements FindCustomerByEmailUseCase {

    private final FindCustomerByEmail findCustomerById;

    public FindCustomerByEmailUseCaseImpl(FindCustomerByEmail findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String email) {
        return findCustomerById.find(email).orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}
