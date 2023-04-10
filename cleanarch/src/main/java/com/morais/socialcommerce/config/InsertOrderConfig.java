package com.morais.socialcommerce.config;
import com.morais.socialcommerce.core.usecase.impl.InsertOrderUseCaseImpl;
import com.morais.socialcommerce.dataprovider.impl.InsertOrderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertOrderConfig {

    @Bean
    public InsertOrderUseCaseImpl insertOrderUseCase(
            InsertOrderImpl insertOrder
    ) {
        return new InsertOrderUseCaseImpl(insertOrder);
    }


}
