package com.morais.cleanarch.dataprovider;

import com.morais.cleanarch.core.dataprovider.UpdateCustomer;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.dataprovider.repository.CustomerRepository;
import com.morais.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
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
