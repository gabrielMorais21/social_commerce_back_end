package com.morais.socialcommerce.dataprovider.repository;

import com.morais.socialcommerce.dataprovider.repository.entity.CustomerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
    @Query("SELECT c FROM CustomerEntity c WHERE c.email = ?1")
    public CustomerEntity findCustomerByEmail(String email);
}