package com.morais.socialcommerce.core.domain;

public class Order {

    private String id;
    private int groupId;
    private int customerId;
    private int productDiscountId;
    private  int productId;
    private float  price;
    private int  quantity;


    public Order(String id, int groupId, int customerId, int productDiscountId, int productId, float price, int quantity) {
        this.id = id;
        this.groupId = groupId;
        this.customerId = customerId;
        this.productDiscountId = productDiscountId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductDiscountId() {
        return productDiscountId;
    }

    public void setProductDiscountId(int productDiscountId) {
        this.productDiscountId = productDiscountId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
