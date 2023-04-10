package com.morais.socialcommerce.core.usecase;

import com.morais.socialcommerce.core.domain.Product;

import java.util.List;

public interface FindAllProductUseCase {

    List<Product> findAll();
}
