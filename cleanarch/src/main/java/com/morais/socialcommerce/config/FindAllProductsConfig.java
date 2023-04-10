package com.morais.socialcommerce.config;

import com.morais.socialcommerce.core.usecase.impl.FindAllProductsUseCaseImpl;

import com.morais.socialcommerce.dataprovider.impl.FindAllProductsImpl;

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
