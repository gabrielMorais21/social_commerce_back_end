package com.morais.cleanarch.dataprovider.product.impl;

import com.morais.cleanarch.core.dataprovider.product.FindAllProducts;
import com.morais.cleanarch.core.domain.Product;
import com.morais.cleanarch.dataprovider.product.repository.ProductRepository;
import com.morais.cleanarch.dataprovider.product.repository.mapper.ProductEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class FindAllProductsImpl implements FindAllProducts {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductEntityMapper productEntityMapper;
    @Override
    public Optional<List<Product>> findAll() {

        var listEntity = productRepository.findAll();
        var listProduct = listEntity.stream().map(entity -> productEntityMapper.toProduct(entity)).collect(Collectors.toList());
        return Optional.of(listProduct);


    }
}
