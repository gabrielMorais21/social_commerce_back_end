package com.morais.cleanarch.config;

import com.morais.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.morais.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.morais.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.morais.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer

    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }

}