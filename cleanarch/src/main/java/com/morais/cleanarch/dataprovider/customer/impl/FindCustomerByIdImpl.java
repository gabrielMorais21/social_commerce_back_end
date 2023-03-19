package com.morais.cleanarch.dataprovider.customer.impl;

import com.morais.cleanarch.core.dataprovider.customer.FindCustomerById;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.dataprovider.customer.repository.CustomerRepository;
import com.morais.cleanarch.dataprovider.customer.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;


    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
