package com.morais.socialcommerce.dataprovider.impl;

import com.morais.socialcommerce.core.dataprovider.FindCustomerByEmail;
import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.dataprovider.repository.CustomerRepository;
import com.morais.socialcommerce.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByEmailImpl implements FindCustomerByEmail {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;


    @Override
    public Optional<Customer> find(String email) {
        var customerEntity = customerRepository.findCustomerByEmail(email);
        return Optional.ofNullable(customerEntityMapper.toCustomer(customerEntity));
    }
}
