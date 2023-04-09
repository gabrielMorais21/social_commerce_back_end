package com.morais.cleanarch.dataprovider.order.repository;

import com.morais.cleanarch.dataprovider.order.repository.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
}
