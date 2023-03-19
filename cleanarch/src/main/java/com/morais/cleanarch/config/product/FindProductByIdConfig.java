package com.morais.cleanarch.config.product;

import com.morais.cleanarch.core.usecase.product.impl.FindProductByIdUseCaseImpl;
import com.morais.cleanarch.dataprovider.product.impl.FindProductByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindProductByIdConfig {
    @Bean
    public FindProductByIdUseCaseImpl findProductByIdUseCase(
            FindProductByIdImpl findProductById
    ) {
        return new FindProductByIdUseCaseImpl(findProductById);
    }
}
