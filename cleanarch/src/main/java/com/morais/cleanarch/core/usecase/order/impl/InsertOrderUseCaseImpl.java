package com.morais.cleanarch.core.usecase.order.impl;

import com.morais.cleanarch.core.dataprovider.order.InsertOrder;
import com.morais.cleanarch.core.domain.Order;
import com.morais.cleanarch.core.usecase.order.InsertOrderUseCase;

public class InsertOrderUseCaseImpl implements InsertOrderUseCase {

    final InsertOrder insertOrder;

    public InsertOrderUseCaseImpl(InsertOrder insertOrder) {
        this.insertOrder = insertOrder;
    }

    @Override
    public void insert(Order order) {
        insertOrder.insert(order);
    }
}
