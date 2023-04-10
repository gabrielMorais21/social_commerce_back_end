package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.FindCustomerByEmail;
import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.core.usecase.FindCustomerByEmailUseCase;

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
