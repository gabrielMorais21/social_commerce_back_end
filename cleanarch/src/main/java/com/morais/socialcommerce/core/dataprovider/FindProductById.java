package com.morais.socialcommerce.core.dataprovider;
import com.morais.socialcommerce.core.domain.Product;

import java.util.Optional;

public interface FindProductById {
    Optional<Product> find(final String id);
}
