package com.morais.cleanarch.entrypoint.controller.mapper;

import com.morais.cleanarch.core.domain.Address;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.entrypoint.controller.request.AddressRequest;
import com.morais.cleanarch.entrypoint.controller.response.AddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {
//    @Mapping(target = "id", ignore = true)
    Address toAddress(AddressRequest addressRequest);

    AddressResponse toAddressResponse(Address address);
}
