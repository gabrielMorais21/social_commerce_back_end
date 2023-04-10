package com.morais.socialcommerce.dataprovider.impl;

import com.morais.socialcommerce.core.dataprovider.InsertProduct;
import com.morais.socialcommerce.core.domain.Product;

import com.morais.socialcommerce.dataprovider.repository.ProductRepository;
import com.morais.socialcommerce.dataprovider.repository.mapper.ProductEntityMapper;
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
