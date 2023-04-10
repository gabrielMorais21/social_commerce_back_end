package com.morais.socialcommerce.core.usecase;

import com.morais.socialcommerce.core.domain.Order;

public interface InsertOrderUseCase {

    void insert(Order order);
}
