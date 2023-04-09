package com.morais.cleanarch.dataprovider.order.repository.mapper;
import com.morais.cleanarch.core.domain.Order;
import com.morais.cleanarch.dataprovider.order.repository.entity.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderEntityMapper {

    OrderEntity toOrderEntity(Order order);

    Order toOrder(OrderEntity orderEntity);

}