package com.morais.socialcommerce.dataprovider.repository.mapper;

import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}