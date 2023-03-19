package com.morais.cleanarch.entrypoint.controller.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class AddressRequest {

//    @NotBlank
    private  String street;

//    @NotBlank
    private String city;

//    @NotBlank
    private  String uf;

//    @NotBlank
    private  String zipCode;
}
