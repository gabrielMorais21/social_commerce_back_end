package com.morais.socialcommerce.dataprovider.repository;

import com.morais.socialcommerce.dataprovider.repository.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
}
