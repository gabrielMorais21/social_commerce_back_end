package com.morais.cleanarch.entrypoint.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class OrderRequest {

    @NotNull(message = "Price cannot be null")
    private int groupId;
    @NotNull(message = "Price cannot be null")
    private int customerId;
    @NotNull(message = "Price cannot be null")
    private int productDiscountId;
    @NotNull(message = "Price cannot be null")
    private int productId;
    @NotNull(message = "Price cannot be null")
    private int quantity;
    @NotNull(message = "Price cannot be null")
    private double price;




}
