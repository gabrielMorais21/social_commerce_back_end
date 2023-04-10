package com.morais.socialcommerce.dataprovider.impl;

import com.morais.socialcommerce.core.dataprovider.FindProductById;
import com.morais.socialcommerce.core.domain.Product;
import com.morais.socialcommerce.dataprovider.repository.ProductRepository;
import com.morais.socialcommerce.dataprovider.repository.mapper.ProductEntityMapper;
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
