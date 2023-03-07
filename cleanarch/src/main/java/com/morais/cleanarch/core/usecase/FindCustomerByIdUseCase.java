package com.morais.cleanarch.core.usecase;

import com.morais.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);

}
