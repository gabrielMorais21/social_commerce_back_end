package com.morais.socialcommerce.entrypoint.request;


import lombok.Data;


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
