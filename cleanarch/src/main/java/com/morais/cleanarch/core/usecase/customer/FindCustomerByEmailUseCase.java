package com.morais.cleanarch.core.usecase.customer;

import com.morais.cleanarch.core.domain.Customer;

public interface FindCustomerByEmailUseCase {
    Customer find(final String Email);

}
