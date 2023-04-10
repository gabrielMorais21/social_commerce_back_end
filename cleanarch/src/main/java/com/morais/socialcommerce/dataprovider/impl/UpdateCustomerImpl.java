package com.morais.socialcommerce.dataprovider.impl;

import com.morais.socialcommerce.core.dataprovider.UpdateCustomer;
import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.dataprovider.repository.CustomerRepository;
import com.morais.socialcommerce.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void update(Customer customer) {
        var customerEntity =  customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
