package com.morais.cleanarch.core.usecase.product;

import com.morais.cleanarch.core.domain.Product;

import java.util.List;

public interface FindAllProductUseCase {

    List<Product> findAll();
}
