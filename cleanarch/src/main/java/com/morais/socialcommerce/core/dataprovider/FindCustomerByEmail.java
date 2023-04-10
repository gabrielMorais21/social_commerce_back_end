package com.morais.socialcommerce.core.dataprovider;

import com.morais.socialcommerce.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByEmail {
    Optional<Customer> find(final String email);
}
