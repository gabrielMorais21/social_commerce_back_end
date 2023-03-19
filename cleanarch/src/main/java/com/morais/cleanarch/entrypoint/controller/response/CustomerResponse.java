package com.morais.cleanarch.entrypoint.controller.response;

import com.morais.cleanarch.entrypoint.controller.request.AddressRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerResponse {
    private String name;

    private String lastName;

    private String  email;

    private String rg;

    private String cellPhone;

    private String landlinePhone;

    private String cpf;

    private AddressRequest address;
}
