package com.morais.cleanarch.dataprovider.product.impl;

import com.morais.cleanarch.core.dataprovider.product.FindProductById;
import com.morais.cleanarch.core.domain.Product;
import com.morais.cleanarch.dataprovider.product.repository.ProductRepository;
import com.morais.cleanarch.dataprovider.product.repository.mapper.ProductEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindProductByIdImpl implements FindProductById {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductEntityMapper productEntityMapper;

    @Override
    public Optional<Product> find(String id) {
        var productEntity = productRepository.findById(id);
        return productEntity.map(entity -> productEntityMapper.toProduct(entity));
    }
}
