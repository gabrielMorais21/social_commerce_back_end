package com.morais.socialcommerce.core.dataprovider;
import com.morais.socialcommerce.core.domain.Product;

import java.util.List;
import java.util.Optional;

public interface FindAllProducts {
    Optional<List<Product>> findAll();
}
