package com.morais.cleanarch.core.usecase.customer.impl;

import com.morais.cleanarch.core.dataprovider.customer.UpdateCustomer;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.usecase.customer.FindCustomerByEmailUseCase;
import com.morais.cleanarch.core.usecase.customer.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {
    private final FindCustomerByEmailUseCase findCustomerByIdUseCase;

    private  final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByEmailUseCase findCustomerByIdUseCase, UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer) {
        findCustomerByIdUseCase.find(customer.getId());
        updateCustomer.update(customer);
    }
}
