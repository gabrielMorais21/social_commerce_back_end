package com.morais.cleanarch.dataprovider.product.repository;

import com.morais.cleanarch.dataprovider.product.repository.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
