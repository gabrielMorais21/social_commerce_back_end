package com.morais.socialcommerce.dataprovider.impl;

import com.morais.socialcommerce.core.dataprovider.FindAllGroups;
import com.morais.socialcommerce.core.domain.Group;
import com.morais.socialcommerce.dataprovider.repository.GroupRepository;
import com.morais.socialcommerce.dataprovider.repository.mapper.GroupEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class FindAllGroupsImpl implements FindAllGroups {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private GroupEntityMapper groupEntityMapper;
    @Override
    public Optional<List<Group>> findAll() {
        var listEntity = groupRepository.findAll();
        var listGroup = listEntity.stream().map(group -> groupEntityMapper.toGroup(group)).collect(Collectors.toList());
        return Optional.of(listGroup);
    }
}
