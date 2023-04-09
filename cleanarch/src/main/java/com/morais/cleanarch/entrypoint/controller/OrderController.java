package com.morais.cleanarch.entrypoint.controller;


import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.domain.Order;
import com.morais.cleanarch.core.usecase.order.InsertOrderUseCase;
import com.morais.cleanarch.entrypoint.controller.mapper.OrderMapper;
import com.morais.cleanarch.entrypoint.controller.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    InsertOrderUseCase insertOrderUseCase;

    @Autowired
    OrderMapper orderMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody OrderRequest orderRequest) {
        Order order = orderMapper.toOrder(orderRequest);
        insertOrderUseCase.insert(order);
        return ResponseEntity.ok().build();
    }


}
