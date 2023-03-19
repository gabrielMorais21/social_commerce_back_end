package com.morais.cleanarch.core.usecase.product;

import com.morais.cleanarch.core.domain.Product;

public interface FindProductByIdUseCase  {
    Product find(String id);
}
