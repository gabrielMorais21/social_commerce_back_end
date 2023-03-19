package com.morais.cleanarch.config;

import com.morais.cleanarch.core.usecase.customer.impl.FindCustomerByIdUseCaseImpl;
import com.morais.cleanarch.dataprovider.customer.impl.FindCustomerByIdImpl;
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
