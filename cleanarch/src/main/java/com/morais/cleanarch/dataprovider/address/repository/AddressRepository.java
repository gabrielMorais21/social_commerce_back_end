package com.morais.cleanarch.dataprovider.address.repository;

import com.morais.cleanarch.dataprovider.address.repository.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<AddressEntity, String> {
}
