package com.morais.socialcommerce.config;

import com.morais.socialcommerce.core.usecase.impl.FindAllGroupUseCaseImpl;
import com.morais.socialcommerce.dataprovider.impl.FindAllGroupsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllGroupsConfig {

    @Bean
    public FindAllGroupUseCaseImpl findAllGroupUseCase(
            FindAllGroupsImpl findAllGroups
    ) {
        return new FindAllGroupUseCaseImpl(findAllGroups);
    }
}
