package com.morais.socialcommerce.entrypoint.request;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ProductRequest {

     @NotBlank
     private String name;

     @NotBlank
     private String description;

     @NotNull(message = "Price cannot be null")
     @DecimalMin(value = "0.0", inclusive = false, message = "Price should be greater than {value}")
     private float  price;

      @NotBlank
      private String imageUrl;


}
