package com.morais.socialcommerce.entrypoint.mapper;

import com.morais.socialcommerce.core.domain.Address;
import com.morais.socialcommerce.entrypoint.request.AddressRequest;
import com.morais.socialcommerce.entrypoint.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
//    @Mapping(target = "id", ignore = true)
    Address toAddress(AddressRequest addressRequest);

    AddressResponse toAddressResponse(Address address);
}
