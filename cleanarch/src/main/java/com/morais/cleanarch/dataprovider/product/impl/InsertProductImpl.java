package com.morais.cleanarch.dataprovider.product.impl;

import com.morais.cleanarch.core.dataprovider.product.InsertProduct;
import com.morais.cleanarch.core.domain.Product;

import com.morais.cleanarch.dataprovider.product.repository.ProductRepository;
import com.morais.cleanarch.dataprovider.product.repository.mapper.ProductEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertProductImpl implements InsertProduct {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductEntityMapper productEntityMapper;
    @Override
    public void insert(Product product) {
        var productEntity = productEntityMapper.toProductEntity(product);
        productRepository.save(productEntity);
    }
}
