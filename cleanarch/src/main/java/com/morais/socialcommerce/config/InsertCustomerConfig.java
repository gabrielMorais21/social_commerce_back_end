package com.morais.socialcommerce.config;

import com.morais.socialcommerce.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.morais.socialcommerce.dataprovider.impl.InsertCustomerImpl;
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