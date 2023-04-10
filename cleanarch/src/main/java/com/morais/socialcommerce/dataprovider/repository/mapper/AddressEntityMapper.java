package com.morais.socialcommerce.dataprovider.repository.mapper;

import com.morais.socialcommerce.core.domain.Address;
import com.morais.socialcommerce.dataprovider.repository.entity.AddressEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressEntityMapper {

    AddressEntity toAddressEntity(Address address);

    Address toAddress(AddressEntity addressEntity);
}
