package com.morais.socialcommerce.core.usecase.impl;

import com.morais.socialcommerce.core.dataprovider.FindAllGroups;
import com.morais.socialcommerce.core.domain.Group;
import com.morais.socialcommerce.core.usecase.FindAllGroupUseCase;

import java.util.List;

public class FindAllGroupUseCaseImpl implements FindAllGroupUseCase {

    private final FindAllGroups findAllGroups;

    public FindAllGroupUseCaseImpl(FindAllGroups findAllGroups) {
        this.findAllGroups = findAllGroups;
    }

    @Override
    public List<Group> findAll() {
        return findAllGroups.findAll().orElseThrow(()-> new RuntimeException("groups not found"));
    }
}
