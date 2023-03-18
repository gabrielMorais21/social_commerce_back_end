package com.morais.cleanarch.config;

import com.morais.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.morais.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.morais.cleanarch.dataprovider.InsertCustomerImpl;
import com.morais.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}