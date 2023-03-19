package com.morais.cleanarch.core.usecase.product.impl;

import com.morais.cleanarch.core.dataprovider.product.FindProductById;
import com.morais.cleanarch.core.domain.Product;
import com.morais.cleanarch.core.usecase.product.FindProductByIdUseCase;

import java.util.List;

public class FindProductByIdUseCaseImpl implements FindProductByIdUseCase {
    final FindProductById findProductById;

    public FindProductByIdUseCaseImpl(FindProductById findProductById) {
        this.findProductById = findProductById;
    }


    @Override
    public Product find(String id) {
        return findProductById.find(id).orElseThrow(()-> new RuntimeException("Product not found"));
    }
}
