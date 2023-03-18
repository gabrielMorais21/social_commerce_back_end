package com.morais.cleanarch.entrypoint.controller.mapper;

import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.morais.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;


@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)

    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
