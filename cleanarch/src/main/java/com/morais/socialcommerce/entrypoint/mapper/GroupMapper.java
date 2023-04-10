package com.morais.socialcommerce.entrypoint.mapper;

import com.morais.socialcommerce.core.domain.Group;
import com.morais.socialcommerce.entrypoint.request.GroupRequest;
import com.morais.socialcommerce.entrypoint.response.GroupResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupMapper {
    Group toGroup(GroupRequest groupRequest);

    GroupResponse toGroupResponse(Group group);
}
