package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.InsertProduct;
import com.morais.socialcommerce.core.domain.Product;
import com.morais.socialcommerce.core.usecase.InsertProductUseCase;

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