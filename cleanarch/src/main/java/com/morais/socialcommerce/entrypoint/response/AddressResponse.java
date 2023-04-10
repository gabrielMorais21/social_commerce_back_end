package com.morais.socialcommerce.entrypoint.response;

import lombok.Data;

@Data
public class AddressResponse {


    private  String street;


    private String city;


    private  String uf;


    private  String zipCode;
}
