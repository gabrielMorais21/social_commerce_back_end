package com.morais.cleanarch.entrypoint.controller.response;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderResponse {
    @NotBlank
    private int group_id;
}
