package com.morais.cleanarch.entrypoint.controller.response;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginResponse {
    @NotBlank
    private String token;
}
