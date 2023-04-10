package com.morais.socialcommerce.config;

import com.morais.socialcommerce.core.usecase.impl.FindCustomerByEmailUseCaseImpl;
import com.morais.socialcommerce.dataprovider.impl.FindCustomerByEmailImpl;
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
