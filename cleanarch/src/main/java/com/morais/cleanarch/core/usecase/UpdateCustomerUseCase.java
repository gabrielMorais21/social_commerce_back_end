package com.morais.cleanarch.core.usecase;

import com.morais.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);

}
