package com.morais.socialcommerce.dataprovider.repository.mapper;
import com.morais.socialcommerce.core.domain.Product;
import com.morais.socialcommerce.dataprovider.repository.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

    ProductEntity toProductEntity(Product product);

    Product toProduct(ProductEntity productEntity);
}
