package com.morais.cleanarch.dataprovider.customer.repository.mapper;

import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.dataprovider.customer.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}