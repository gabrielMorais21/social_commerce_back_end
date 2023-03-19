package com.morais.cleanarch.core.usecase.customer;

import com.morais.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);

}
