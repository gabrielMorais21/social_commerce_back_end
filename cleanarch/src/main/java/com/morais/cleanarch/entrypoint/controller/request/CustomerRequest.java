package com.morais.cleanarch.entrypoint.controller.request;
import lombok.Data;


import javax.validation.constraints.NotBlank;

@Data
public class CustomerRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String  email;
    @NotBlank
    private String rg;
    @NotBlank
    private String cellPhone;
    @NotBlank
    private String landlinePhone;
    @NotBlank
    private String cpf;

    private AddressRequest address;
}
