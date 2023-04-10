package com.morais.socialcommerce.core.usecase;

import com.morais.socialcommerce.core.domain.Customer;

public interface FindCustomerByEmailUseCase {
    Customer find(final String Email);

}
