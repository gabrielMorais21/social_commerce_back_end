package com.morais.cleanarch.core.dataprovider.product;
import com.morais.cleanarch.core.domain.Product;

import java.util.List;
import java.util.Optional;

public interface FindAllProducts {
    Optional<List<Product>> findAll();
}
