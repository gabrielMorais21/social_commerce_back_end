package com.morais.cleanarch.config;

import com.morais.cleanarch.core.usecase.customer.impl.FindCustomerByIdUseCaseImpl;
import com.morais.cleanarch.core.usecase.customer.impl.UpdateCustomerUseCaseImpl;
import com.morais.cleanarch.dataprovider.customer.impl.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,

            UpdateCustomerImpl updateCustomer

    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, updateCustomer);
    }

}