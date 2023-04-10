package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.UpdateCustomer;
import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.core.usecase.FindCustomerByEmailUseCase;
import com.morais.socialcommerce.core.usecase.UpdateCustomerUseCase;

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
