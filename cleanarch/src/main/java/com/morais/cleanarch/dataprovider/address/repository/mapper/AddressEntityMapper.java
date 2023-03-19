package com.morais.cleanarch.dataprovider.address.repository.mapper;

import com.morais.cleanarch.core.domain.Address;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.dataprovider.address.repository.AddressRepository;
import com.morais.cleanarch.dataprovider.address.repository.entity.AddressEntity;
import com.morais.cleanarch.dataprovider.customer.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressEntityMapper {

    AddressEntity toAddressEntity(Address address);

    Address toAddress(AddressEntity addressEntity);
}
