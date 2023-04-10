package com.morais.socialcommerce.entrypoint.response;

import lombok.Data;

@Data
public class ProductResponse {

    private String name;


    private String description;


    private float  price;


    private String imageUrl;
}
