package com.morais.cleanarch.dataprovider.order.impl;

import com.morais.cleanarch.core.dataprovider.order.InsertOrder;
import com.morais.cleanarch.core.domain.Order;
import com.morais.cleanarch.dataprovider.order.repository.OrderRepository;
import com.morais.cleanarch.dataprovider.order.repository.mapper.OrderEntityMapper;
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
