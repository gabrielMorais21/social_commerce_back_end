package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.InsertOrder;
import com.morais.socialcommerce.core.domain.Order;
import com.morais.socialcommerce.core.usecase.InsertOrderUseCase;

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
