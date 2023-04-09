package com.morais.cleanarch.entrypoint.controller.mapper;

import com.morais.cleanarch.core.domain.Order;
import com.morais.cleanarch.entrypoint.controller.request.OrderRequest;
import com.morais.cleanarch.entrypoint.controller.response.OrderResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toOrder(OrderRequest orderRequest);

    OrderResponse toOrderResponse(Order order);
}
