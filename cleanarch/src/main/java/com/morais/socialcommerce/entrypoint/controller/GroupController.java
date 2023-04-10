package com.morais.socialcommerce.entrypoint.controller;
import com.morais.socialcommerce.core.usecase.FindAllGroupUseCase;
import com.morais.socialcommerce.entrypoint.mapper.GroupMapper;
import com.morais.socialcommerce.entrypoint.response.GroupResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupController {

    @Autowired
    private FindAllGroupUseCase findAllGroupUseCase;

    @Autowired
    private GroupMapper groupMapper;

    @GetMapping
    public ResponseEntity<List<GroupResponse>> findAll() {
        var listGroup = findAllGroupUseCase.findAll();

        var list = listGroup.stream().map(entity -> groupMapper.toGroupResponse(entity)).collect(Collectors.toList());
        return ResponseEntity.ok().body(list);
    }
}
