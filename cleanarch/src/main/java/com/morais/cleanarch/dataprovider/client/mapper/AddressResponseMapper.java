package com.morais.cleanarch.dataprovider.client.mapper;

import com.morais.cleanarch.core.domain.Address;
import com.morais.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
