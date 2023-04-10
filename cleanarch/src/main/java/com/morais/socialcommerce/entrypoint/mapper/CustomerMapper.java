package com.morais.socialcommerce.entrypoint.mapper;

import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.entrypoint.request.CustomerRequest;
import com.morais.socialcommerce.entrypoint.response.CustomerResponse;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
