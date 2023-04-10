package com.morais.socialcommerce.dataprovider.repository.mapper;

import com.morais.socialcommerce.core.domain.Group;
import com.morais.socialcommerce.dataprovider.repository.entity.GroupEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupEntityMapper {

    GroupEntity toGroupEntity(Group group);

    Group toGroup(GroupEntity groupEntity);
}


