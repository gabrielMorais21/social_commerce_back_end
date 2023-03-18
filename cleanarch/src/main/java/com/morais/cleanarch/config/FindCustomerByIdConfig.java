package com.morais.cleanarch.config;

import com.morais.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.morais.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }

}
