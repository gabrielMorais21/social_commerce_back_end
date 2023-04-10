package com.morais.socialcommerce.config;

import com.morais.socialcommerce.core.usecase.impl.InsertProductUseCaseImpl;
import com.morais.socialcommerce.dataprovider.impl.InsertProductImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertProductConfig {

    @Bean
    public InsertProductUseCaseImpl insertProductUseCase(
            InsertProductImpl insertProduct
    ) {
        return new InsertProductUseCaseImpl(insertProduct);
    }


}