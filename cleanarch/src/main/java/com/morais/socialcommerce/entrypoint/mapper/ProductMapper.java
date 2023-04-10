package com.morais.socialcommerce.entrypoint.mapper;


import com.morais.socialcommerce.core.domain.Product;
import com.morais.socialcommerce.entrypoint.request.ProductRequest;
import com.morais.socialcommerce.entrypoint.response.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductRequest productRequest);

    ProductResponse toProductResponse(Product product);
}
