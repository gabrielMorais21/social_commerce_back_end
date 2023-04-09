package com.morais.cleanarch.core.usecase.order;

import com.morais.cleanarch.core.domain.Order;

public interface InsertOrderUseCase {

    void insert(Order order);
}
