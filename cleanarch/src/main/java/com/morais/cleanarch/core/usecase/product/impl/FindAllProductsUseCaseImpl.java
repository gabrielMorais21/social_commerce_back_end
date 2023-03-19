package com.morais.cleanarch.core.usecase.product.impl;

import com.morais.cleanarch.core.dataprovider.product.FindAllProducts;
import com.morais.cleanarch.core.domain.Product;
import com.morais.cleanarch.core.usecase.product.FindAllProductUseCase;

import java.util.List;

public class FindAllProductsUseCaseImpl implements FindAllProductUseCase {

    private final FindAllProducts findAllProducts;

    public FindAllProductsUseCaseImpl(FindAllProducts findAllProducts) {
        this.findAllProducts = findAllProducts;
    }

    @Override
    public List<Product> findAll() {
        return findAllProducts.findAll().orElseThrow(()-> new RuntimeException("products not found"));
    }
}
