package com.morais.cleanarch.entrypoint.controller.mapper;


import com.morais.cleanarch.core.domain.Product;
import com.morais.cleanarch.entrypoint.controller.request.ProductRequest;
import com.morais.cleanarch.entrypoint.controller.response.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductRequest productRequest);

    ProductResponse toProductResponse(Product product);
}
