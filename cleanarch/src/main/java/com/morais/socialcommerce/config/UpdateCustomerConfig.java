package com.morais.socialcommerce.config;

import com.morais.socialcommerce.core.usecase.impl.FindCustomerByEmailUseCaseImpl;
import com.morais.socialcommerce.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.morais.socialcommerce.dataprovider.impl.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByEmailUseCaseImpl findCustomerByIdUseCase,

            UpdateCustomerImpl updateCustomer

    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, updateCustomer);
    }

}