package com.morais.cleanarch.dataprovider.order.repository.entity;
import com.morais.cleanarch.dataprovider.customer.repository.entity.CustomerEntity;
import com.morais.cleanarch.dataprovider.group.repository.entity.GroupEntity;
import com.morais.cleanarch.dataprovider.product.repository.entity.ProductEntity;
import com.morais.cleanarch.dataprovider.productDiscount.repository.entity.ProductDiscountEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "group_id")
    private int groupId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "product_discount_id")
    private int productDiscountId;

    @Column(name = "product_id")
    private int productId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private float price;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
