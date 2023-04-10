package com.morais.socialcommerce.dataprovider.repository;

import com.morais.socialcommerce.dataprovider.repository.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
