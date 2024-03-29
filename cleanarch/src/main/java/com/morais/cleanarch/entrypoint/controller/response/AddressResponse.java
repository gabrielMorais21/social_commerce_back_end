package com.morais.cleanarch.entrypoint.controller.response;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AddressResponse {


    private  String street;


    private String city;


    private  String uf;


    private  String zipCode;
}
