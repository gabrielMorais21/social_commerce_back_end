package com.morais.socialcommerce.entrypoint.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GroupRequest {
    @NotBlank
    private String groupName;

}
