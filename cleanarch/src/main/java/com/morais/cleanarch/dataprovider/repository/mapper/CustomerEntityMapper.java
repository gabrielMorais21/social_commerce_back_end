package com.morais.cleanarch.dataprovider.repository.mapper;

import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
