package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.FindAllProducts;
import com.morais.socialcommerce.core.domain.Product;
import com.morais.socialcommerce.core.usecase.FindAllProductUseCase;

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
