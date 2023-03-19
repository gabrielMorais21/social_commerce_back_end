package com.morais.cleanarch.core.usecase.product.impl;

import com.morais.cleanarch.core.dataprovider.product.InsertProduct;
import com.morais.cleanarch.core.domain.Product;
import com.morais.cleanarch.core.usecase.product.InsertProductUseCase;

public class InsertProductUseCaseImpl implements InsertProductUseCase {
    final InsertProduct insertProduct;

    public InsertProductUseCaseImpl(InsertProduct insertProduct) {
        this.insertProduct = insertProduct;
    }

    @Override
    public void insert(Product product) {
        insertProduct.insert(product);
    }
}
