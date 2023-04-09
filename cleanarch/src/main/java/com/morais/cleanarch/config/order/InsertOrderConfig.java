package com.morais.cleanarch.config.order;
import com.morais.cleanarch.core.usecase.order.impl.InsertOrderUseCaseImpl;
import com.morais.cleanarch.dataprovider.order.impl.InsertOrderImpl;
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
