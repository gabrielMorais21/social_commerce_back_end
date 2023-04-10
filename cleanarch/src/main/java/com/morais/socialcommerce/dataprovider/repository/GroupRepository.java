package com.morais.socialcommerce.dataprovider.repository;

import com.morais.socialcommerce.dataprovider.repository.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity, String> {
}