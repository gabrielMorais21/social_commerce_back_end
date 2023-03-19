package com.morais.cleanarch.dataprovider.customer.impl;

import com.morais.cleanarch.core.dataprovider.customer.InsertCustomer;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.dataprovider.customer.repository.CustomerRepository;
import com.morais.cleanarch.dataprovider.customer.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}