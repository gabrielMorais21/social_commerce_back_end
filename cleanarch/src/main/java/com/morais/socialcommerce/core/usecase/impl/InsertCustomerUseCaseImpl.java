package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.InsertCustomer;
import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.core.usecase.InsertCustomerUseCase;

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
