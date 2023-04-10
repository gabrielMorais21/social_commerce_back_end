package com.morais.socialcommerce.config;

import com.morais.socialcommerce.core.usecase.impl.FindProductByIdUseCaseImpl;
import com.morais.socialcommerce.dataprovider.impl.FindProductByIdImpl;
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
