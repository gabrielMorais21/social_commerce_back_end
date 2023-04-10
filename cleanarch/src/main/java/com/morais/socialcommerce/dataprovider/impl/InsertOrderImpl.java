package com.morais.socialcommerce.dataprovider.impl;

import com.morais.socialcommerce.core.dataprovider.InsertOrder;
import com.morais.socialcommerce.core.domain.Order;
import com.morais.socialcommerce.dataprovider.repository.OrderRepository;
import com.morais.socialcommerce.dataprovider.repository.mapper.OrderEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertOrderImpl implements InsertOrder {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderEntityMapper orderEntityMapper;
    @Override
    public void insert(Order order) {
    var orderEntity = orderEntityMapper.toOrderEntity(order);
        orderRepository.save(orderEntity);
    }
}
