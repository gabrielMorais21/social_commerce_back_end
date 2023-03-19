package com.morais.cleanarch.core.usecase.customer.impl;

import com.morais.cleanarch.core.dataprovider.customer.InsertCustomer;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.usecase.customer.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private  final InsertCustomer insertCustomer;

    public  InsertCustomerUseCaseImpl( InsertCustomer insertCustomer){
        this.insertCustomer = insertCustomer;
    }
    @Override
    public void insert(Customer customer) {
        insertCustomer.insert(customer);
    }
}
