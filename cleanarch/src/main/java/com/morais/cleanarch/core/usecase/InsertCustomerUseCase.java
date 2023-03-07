package com.morais.cleanarch.core.usecase;

import com.morais.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zioCode);
}
