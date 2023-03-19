package com.morais.cleanarch.config.customer;

import com.morais.cleanarch.core.usecase.customer.impl.FindCustomerByEmailUseCaseImpl;
import com.morais.cleanarch.dataprovider.customer.impl.FindCustomerByEmailImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByEmailConfig {

    @Bean
    public FindCustomerByEmailUseCaseImpl findCustomerByEmail(
            FindCustomerByEmailImpl findCustomerByEmail
    ) {
        return new FindCustomerByEmailUseCaseImpl(findCustomerByEmail);
    }

}
