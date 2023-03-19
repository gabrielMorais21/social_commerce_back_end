package com.morais.cleanarch.dataprovider.product.repository.mapper;
import com.morais.cleanarch.core.domain.Product;
import com.morais.cleanarch.dataprovider.product.repository.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

    ProductEntity toProductEntity(Product product);

    Product toProduct(ProductEntity productEntity);
}
