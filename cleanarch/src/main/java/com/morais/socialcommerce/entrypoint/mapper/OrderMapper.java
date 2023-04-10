package com.morais.socialcommerce.entrypoint.mapper;

import com.morais.socialcommerce.core.domain.Order;
import com.morais.socialcommerce.entrypoint.request.OrderRequest;
import com.morais.socialcommerce.entrypoint.response.OrderResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toOrder(OrderRequest orderRequest);

    OrderResponse toOrderResponse(Order order);
}
