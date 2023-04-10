package com.morais.socialcommerce.core.usecase;

import com.morais.socialcommerce.core.domain.Product;

public interface FindProductByIdUseCase  {
    Product find(String id);
}
