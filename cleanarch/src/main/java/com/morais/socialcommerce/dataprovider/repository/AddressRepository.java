package com.morais.socialcommerce.dataprovider.repository;

import com.morais.socialcommerce.dataprovider.repository.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<AddressEntity, String> {
}
