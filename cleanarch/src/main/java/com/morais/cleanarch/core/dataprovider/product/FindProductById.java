package com.morais.cleanarch.core.dataprovider.product;
import com.morais.cleanarch.core.domain.Product;

import java.util.Optional;

public interface FindProductById {
    Optional<Product> find(final String id);
}
