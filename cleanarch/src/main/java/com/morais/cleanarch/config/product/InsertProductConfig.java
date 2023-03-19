package com.morais.cleanarch.config.product;

import com.morais.cleanarch.core.usecase.product.impl.InsertProductUseCaseImpl;
import com.morais.cleanarch.dataprovider.product.impl.InsertProductImpl;
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
