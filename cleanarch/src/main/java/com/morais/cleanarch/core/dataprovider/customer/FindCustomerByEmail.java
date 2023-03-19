package com.morais.cleanarch.core.dataprovider.customer;

import com.morais.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByEmail {
    Optional<Customer> find(final String email);
}
