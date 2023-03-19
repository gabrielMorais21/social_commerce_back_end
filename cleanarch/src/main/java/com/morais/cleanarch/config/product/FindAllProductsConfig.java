package com.morais.cleanarch.config.product;

import com.morais.cleanarch.core.usecase.product.impl.FindAllProductsUseCaseImpl;

import com.morais.cleanarch.dataprovider.product.impl.FindAllProductsImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllProductsConfig {

    @Bean
    public FindAllProductsUseCaseImpl findAllProductUseCase(
            FindAllProductsImpl findAllProducts
    ) {
        return new FindAllProductsUseCaseImpl(findAllProducts);
    }
}
