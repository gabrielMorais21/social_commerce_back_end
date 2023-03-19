package com.morais.cleanarch.config;

import com.morais.cleanarch.core.usecase.customer.impl.InsertCustomerUseCaseImpl;
import com.morais.cleanarch.dataprovider.customer.impl.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            InsertCustomerImpl insertCustomer

    ) {
        return new InsertCustomerUseCaseImpl(insertCustomer );
    }

}