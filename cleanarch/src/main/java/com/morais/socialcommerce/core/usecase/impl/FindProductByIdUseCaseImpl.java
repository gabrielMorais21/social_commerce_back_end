package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.FindProductById;
import com.morais.socialcommerce.core.domain.Product;
import com.morais.socialcommerce.core.usecase.FindProductByIdUseCase;

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
