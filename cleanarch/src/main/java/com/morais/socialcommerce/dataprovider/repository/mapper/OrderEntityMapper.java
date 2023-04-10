package com.morais.socialcommerce.dataprovider.repository.mapper;
import com.morais.socialcommerce.core.domain.Order;
import com.morais.socialcommerce.dataprovider.repository.entity.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderEntityMapper {

    OrderEntity toOrderEntity(Order order);

    Order toOrder(OrderEntity orderEntity);

}